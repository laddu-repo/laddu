package okhttp3.internal.cache;

import bg.b;
import bg.e0;
import bg.f0;
import bg.j0;
import bg.l;
import bg.l0;
import bg.s;
import com.unity3d.services.UnityAdsConstants;
import df.k;
import df.m;
import df.u;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.f;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import r4.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class DiskLruCache implements Closeable, Flushable {
    private final int appVersion;
    private boolean civilizedFileSystem;
    private final TaskQueue cleanupQueue;
    private final DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;
    private final File directory;
    private final FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private l journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;
    public static final Companion Companion = new Companion(null);
    public static final String JOURNAL_FILE = "journal";
    public static final String JOURNAL_FILE_TEMP = "journal.tmp";
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    public static final String MAGIC = "libcore.io.DiskLruCache";
    public static final String VERSION_1 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
    public static final long ANY_SEQUENCE_NUMBER = -1;
    public static final k LEGAL_KEY_PATTERN = new k("[a-z0-9_-]{1,120}");
    public static final String CLEAN = "CLEAN";
    public static final String DIRTY = "DIRTY";
    public static final String REMOVE = "REMOVE";
    public static final String READ = "READ";

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public final class Editor {
        private boolean done;
        private final Entry entry;
        final /* synthetic */ DiskLruCache this$0;
        private final boolean[] written;

        public Editor(DiskLruCache diskLruCache, Entry entry) {
            boolean[] zArr;
            kotlin.jvm.internal.k.e(entry, "entry");
            this.this$0 = diskLruCache;
            this.entry = entry;
            if (entry.getReadable$okhttp()) {
                zArr = null;
            } else {
                zArr = new boolean[diskLruCache.getValueCount$okhttp()];
            }
            this.written = zArr;
        }

        public final void abort() {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                try {
                    if (!this.done) {
                        if (kotlin.jvm.internal.k.a(this.entry.getCurrentEditor$okhttp(), this)) {
                            diskLruCache.completeEdit$okhttp(this, false);
                        }
                        this.done = true;
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void commit() {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                try {
                    if (!this.done) {
                        if (kotlin.jvm.internal.k.a(this.entry.getCurrentEditor$okhttp(), this)) {
                            diskLruCache.completeEdit$okhttp(this, true);
                        }
                        this.done = true;
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void detach$okhttp() {
            if (kotlin.jvm.internal.k.a(this.entry.getCurrentEditor$okhttp(), this)) {
                if (this.this$0.civilizedFileSystem) {
                    this.this$0.completeEdit$okhttp(this, false);
                } else {
                    this.entry.setZombie$okhttp(true);
                }
            }
        }

        public final Entry getEntry$okhttp() {
            return this.entry;
        }

        public final boolean[] getWritten$okhttp() {
            return this.written;
        }

        /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, bg.j0] */
        /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, bg.j0] */
        public final j0 newSink(int i6) {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                try {
                    if (!this.done) {
                        if (!kotlin.jvm.internal.k.a(this.entry.getCurrentEditor$okhttp(), this)) {
                            return new Object();
                        }
                        if (!this.entry.getReadable$okhttp()) {
                            boolean[] zArr = this.written;
                            kotlin.jvm.internal.k.b(zArr);
                            zArr[i6] = true;
                        }
                        try {
                            return new FaultHidingSink(diskLruCache.getFileSystem$okhttp().sink(this.entry.getDirtyFiles$okhttp().get(i6)), new DiskLruCache$Editor$newSink$1$1(diskLruCache, this));
                        } catch (FileNotFoundException unused) {
                            return new Object();
                        }
                    }
                    throw new IllegalStateException("Check failed.");
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final l0 newSource(int i6) {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (!this.done) {
                    l0 l0Var = null;
                    if (!this.entry.getReadable$okhttp() || !kotlin.jvm.internal.k.a(this.entry.getCurrentEditor$okhttp(), this) || this.entry.getZombie$okhttp()) {
                        return null;
                    }
                    try {
                        l0Var = diskLruCache.getFileSystem$okhttp().source(this.entry.getCleanFiles$okhttp().get(i6));
                    } catch (FileNotFoundException unused) {
                    }
                    return l0Var;
                }
                throw new IllegalStateException("Check failed.");
            }
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public final class Entry {
        private final List<File> cleanFiles;
        private Editor currentEditor;
        private final List<File> dirtyFiles;
        private final String key;
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ DiskLruCache this$0;
        private boolean zombie;

        public Entry(DiskLruCache diskLruCache, String key) {
            kotlin.jvm.internal.k.e(key, "key");
            this.this$0 = diskLruCache;
            this.key = key;
            this.lengths = new long[diskLruCache.getValueCount$okhttp()];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder sb2 = new StringBuilder(key);
            sb2.append('.');
            int length = sb2.length();
            int valueCount$okhttp = diskLruCache.getValueCount$okhttp();
            for (int i6 = 0; i6 < valueCount$okhttp; i6++) {
                sb2.append(i6);
                this.cleanFiles.add(new File(this.this$0.getDirectory(), sb2.toString()));
                sb2.append(".tmp");
                this.dirtyFiles.add(new File(this.this$0.getDirectory(), sb2.toString()));
                sb2.setLength(length);
            }
        }

        private final Void invalidLengths(List<String> list) {
            throw new IOException("unexpected journal line: " + list);
        }

        private final l0 newSource(int i6) {
            l0 source = this.this$0.getFileSystem$okhttp().source(this.cleanFiles.get(i6));
            if (this.this$0.civilizedFileSystem) {
                return source;
            }
            this.lockingSourceCount++;
            final DiskLruCache diskLruCache = this.this$0;
            return new s(source) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                private boolean closed;

                @Override // bg.s, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    super.close();
                    if (!this.closed) {
                        this.closed = true;
                        DiskLruCache diskLruCache2 = diskLruCache;
                        DiskLruCache.Entry entry = this;
                        synchronized (diskLruCache2) {
                            entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount$okhttp() - 1);
                            if (entry.getLockingSourceCount$okhttp() == 0 && entry.getZombie$okhttp()) {
                                diskLruCache2.removeEntry$okhttp(entry);
                            }
                        }
                    }
                }
            };
        }

        public final List<File> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        public final Editor getCurrentEditor$okhttp() {
            return this.currentEditor;
        }

        public final List<File> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        public final String getKey$okhttp() {
            return this.key;
        }

        public final long[] getLengths$okhttp() {
            return this.lengths;
        }

        public final int getLockingSourceCount$okhttp() {
            return this.lockingSourceCount;
        }

        public final boolean getReadable$okhttp() {
            return this.readable;
        }

        public final long getSequenceNumber$okhttp() {
            return this.sequenceNumber;
        }

        public final boolean getZombie$okhttp() {
            return this.zombie;
        }

        public final void setCurrentEditor$okhttp(Editor editor) {
            this.currentEditor = editor;
        }

        public final void setLengths$okhttp(List<String> strings) {
            kotlin.jvm.internal.k.e(strings, "strings");
            if (strings.size() == this.this$0.getValueCount$okhttp()) {
                try {
                    int size = strings.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        this.lengths[i6] = Long.parseLong(strings.get(i6));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    invalidLengths(strings);
                    throw new RuntimeException();
                }
            }
            invalidLengths(strings);
            throw new RuntimeException();
        }

        public final void setLockingSourceCount$okhttp(int i6) {
            this.lockingSourceCount = i6;
        }

        public final void setReadable$okhttp(boolean z10) {
            this.readable = z10;
        }

        public final void setSequenceNumber$okhttp(long j) {
            this.sequenceNumber = j;
        }

        public final void setZombie$okhttp(boolean z10) {
            this.zombie = z10;
        }

        public final Snapshot snapshot$okhttp() {
            DiskLruCache diskLruCache = this.this$0;
            if (Util.assertionsEnabled && !Thread.holdsLock(diskLruCache)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
            }
            if (!this.readable) {
                return null;
            }
            if (!this.this$0.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.lengths.clone();
            int i6 = 0;
            try {
                int valueCount$okhttp = this.this$0.getValueCount$okhttp();
                for (int i10 = 0; i10 < valueCount$okhttp; i10++) {
                    arrayList.add(newSource(i10));
                }
                return new Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                int size = arrayList.size();
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    Util.closeQuietly((l0) obj);
                }
                try {
                    this.this$0.removeEntry$okhttp(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void writeLengths$okhttp(l writer) {
            kotlin.jvm.internal.k.e(writer, "writer");
            for (long j : this.lengths) {
                writer.writeByte(32).Z(j);
            }
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public final class Snapshot implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final List<l0> sources;
        final /* synthetic */ DiskLruCache this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public Snapshot(DiskLruCache diskLruCache, String key, long j, List<? extends l0> sources, long[] lengths) {
            kotlin.jvm.internal.k.e(key, "key");
            kotlin.jvm.internal.k.e(sources, "sources");
            kotlin.jvm.internal.k.e(lengths, "lengths");
            this.this$0 = diskLruCache;
            this.key = key;
            this.sequenceNumber = j;
            this.sources = sources;
            this.lengths = lengths;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<l0> it = this.sources.iterator();
            while (it.hasNext()) {
                Util.closeQuietly(it.next());
            }
        }

        public final Editor edit() {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        public final long getLength(int i6) {
            return this.lengths[i6];
        }

        public final l0 getSource(int i6) {
            return this.sources.get(i6);
        }

        public final String key() {
            return this.key;
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(FileSystem fileSystem, File directory, int i6, int i10, long j, TaskRunner taskRunner) {
        kotlin.jvm.internal.k.e(fileSystem, "fileSystem");
        kotlin.jvm.internal.k.e(directory, "directory");
        kotlin.jvm.internal.k.e(taskRunner, "taskRunner");
        this.fileSystem = fileSystem;
        this.directory = directory;
        this.appVersion = i6;
        this.valueCount = i10;
        this.maxSize = j;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = taskRunner.newQueue();
        this.cleanupTask = new Task(a.o(new StringBuilder(), Util.okHttpName, " Cache")) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, bg.j0] */
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                boolean z10;
                boolean journalRebuildRequired;
                DiskLruCache diskLruCache = DiskLruCache.this;
                synchronized (diskLruCache) {
                    z10 = diskLruCache.initialized;
                    if (!z10 || diskLruCache.getClosed$okhttp()) {
                        return -1L;
                    }
                    try {
                        diskLruCache.trimToSize();
                    } catch (IOException unused) {
                        diskLruCache.mostRecentTrimFailed = true;
                    }
                    try {
                        journalRebuildRequired = diskLruCache.journalRebuildRequired();
                        if (journalRebuildRequired) {
                            diskLruCache.rebuildJournal$okhttp();
                            diskLruCache.redundantOpCount = 0;
                        }
                    } catch (IOException unused2) {
                        diskLruCache.mostRecentRebuildFailed = true;
                        diskLruCache.journalWriter = b.c(new Object());
                    }
                    return -1L;
                }
            }
        };
        if (j > 0) {
            if (i10 > 0) {
                this.journalFile = new File(directory, JOURNAL_FILE);
                this.journalFileTmp = new File(directory, JOURNAL_FILE_TEMP);
                this.journalFileBackup = new File(directory, JOURNAL_FILE_BACKUP);
                return;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private final synchronized void checkNotClosed() {
        if (this.closed) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            j = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j);
    }

    public final boolean journalRebuildRequired() {
        int i6 = this.redundantOpCount;
        if (i6 >= 2000 && i6 >= this.lruEntries.size()) {
            return true;
        }
        return false;
    }

    private final l newJournalWriter() {
        return b.c(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    private final void processJournal() {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            kotlin.jvm.internal.k.d(next, "i.next()");
            Entry entry = next;
            int i6 = 0;
            if (entry.getCurrentEditor$okhttp() == null) {
                int i10 = this.valueCount;
                while (i6 < i10) {
                    this.size += entry.getLengths$okhttp()[i6];
                    i6++;
                }
            } else {
                entry.setCurrentEditor$okhttp(null);
                int i11 = this.valueCount;
                while (i6 < i11) {
                    this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i6));
                    this.fileSystem.delete(entry.getDirtyFiles$okhttp().get(i6));
                    i6++;
                }
                it.remove();
            }
        }
    }

    private final void readJournal() {
        f0 d10 = b.d(this.fileSystem.source(this.journalFile));
        try {
            String x10 = d10.x(Long.MAX_VALUE);
            String x11 = d10.x(Long.MAX_VALUE);
            String x12 = d10.x(Long.MAX_VALUE);
            String x13 = d10.x(Long.MAX_VALUE);
            String x14 = d10.x(Long.MAX_VALUE);
            if (kotlin.jvm.internal.k.a(MAGIC, x10) && kotlin.jvm.internal.k.a(VERSION_1, x11) && kotlin.jvm.internal.k.a(String.valueOf(this.appVersion), x12) && kotlin.jvm.internal.k.a(String.valueOf(this.valueCount), x13) && x14.length() <= 0) {
                int i6 = 0;
                while (true) {
                    try {
                        readJournalLine(d10.x(Long.MAX_VALUE));
                        i6++;
                    } catch (EOFException unused) {
                        this.redundantOpCount = i6 - this.lruEntries.size();
                        if (!d10.r()) {
                            rebuildJournal$okhttp();
                        } else {
                            this.journalWriter = newJournalWriter();
                        }
                        d10.close();
                        return;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + x10 + ", " + x11 + ", " + x13 + ", " + x14 + ']');
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                jb.b.j(d10, th);
                throw th2;
            }
        }
    }

    private final void readJournalLine(String str) {
        String substring;
        int P = m.P(str, ' ', 0, 6);
        if (P != -1) {
            int i6 = P + 1;
            int P2 = m.P(str, ' ', i6, 4);
            if (P2 == -1) {
                substring = str.substring(i6);
                kotlin.jvm.internal.k.d(substring, "this as java.lang.String).substring(startIndex)");
                String str2 = REMOVE;
                if (P == str2.length() && u.H(str, str2, false)) {
                    this.lruEntries.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i6, P2);
                kotlin.jvm.internal.k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Entry entry = this.lruEntries.get(substring);
            if (entry == null) {
                entry = new Entry(this, substring);
                this.lruEntries.put(substring, entry);
            }
            if (P2 != -1) {
                String str3 = CLEAN;
                if (P == str3.length() && u.H(str, str3, false)) {
                    String substring2 = str.substring(P2 + 1);
                    kotlin.jvm.internal.k.d(substring2, "this as java.lang.String).substring(startIndex)");
                    List<String> a02 = m.a0(substring2, new char[]{' '});
                    entry.setReadable$okhttp(true);
                    entry.setCurrentEditor$okhttp(null);
                    entry.setLengths$okhttp(a02);
                    return;
                }
            }
            if (P2 == -1) {
                String str4 = DIRTY;
                if (P == str4.length() && u.H(str, str4, false)) {
                    entry.setCurrentEditor$okhttp(new Editor(this, entry));
                    return;
                }
            }
            if (P2 == -1) {
                String str5 = READ;
                if (P == str5.length() && u.H(str, str5, false)) {
                    return;
                }
            }
            throw new IOException("unexpected journal line: ".concat(str));
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    private final boolean removeOldestEntry() {
        for (Entry entry : this.lruEntries.values()) {
            if (!entry.getZombie$okhttp()) {
                removeEntry$okhttp(entry);
                return true;
            }
        }
        return false;
    }

    private final void validateKey(String str) {
        if (LEGAL_KEY_PATTERN.c(str)) {
        } else {
            throw new IllegalArgumentException(w8.k.b('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        Editor currentEditor$okhttp;
        try {
            if (this.initialized && !this.closed) {
                Collection<Entry> values = this.lruEntries.values();
                kotlin.jvm.internal.k.d(values, "lruEntries.values");
                for (Entry entry : (Entry[]) values.toArray(new Entry[0])) {
                    if (entry.getCurrentEditor$okhttp() != null && (currentEditor$okhttp = entry.getCurrentEditor$okhttp()) != null) {
                        currentEditor$okhttp.detach$okhttp();
                    }
                }
                trimToSize();
                l lVar = this.journalWriter;
                kotlin.jvm.internal.k.b(lVar);
                lVar.close();
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void completeEdit$okhttp(Editor editor, boolean z10) {
        kotlin.jvm.internal.k.e(editor, "editor");
        Entry entry$okhttp = editor.getEntry$okhttp();
        if (kotlin.jvm.internal.k.a(entry$okhttp.getCurrentEditor$okhttp(), editor)) {
            if (z10 && !entry$okhttp.getReadable$okhttp()) {
                int i6 = this.valueCount;
                for (int i10 = 0; i10 < i6; i10++) {
                    boolean[] written$okhttp = editor.getWritten$okhttp();
                    kotlin.jvm.internal.k.b(written$okhttp);
                    if (written$okhttp[i10]) {
                        if (!this.fileSystem.exists(entry$okhttp.getDirtyFiles$okhttp().get(i10))) {
                            editor.abort();
                            return;
                        }
                    } else {
                        editor.abort();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                    }
                }
            }
            int i11 = this.valueCount;
            for (int i12 = 0; i12 < i11; i12++) {
                File file = entry$okhttp.getDirtyFiles$okhttp().get(i12);
                if (z10 && !entry$okhttp.getZombie$okhttp()) {
                    if (this.fileSystem.exists(file)) {
                        File file2 = entry$okhttp.getCleanFiles$okhttp().get(i12);
                        this.fileSystem.rename(file, file2);
                        long j = entry$okhttp.getLengths$okhttp()[i12];
                        long size = this.fileSystem.size(file2);
                        entry$okhttp.getLengths$okhttp()[i12] = size;
                        this.size = (this.size - j) + size;
                    }
                } else {
                    this.fileSystem.delete(file);
                }
            }
            entry$okhttp.setCurrentEditor$okhttp(null);
            if (entry$okhttp.getZombie$okhttp()) {
                removeEntry$okhttp(entry$okhttp);
                return;
            }
            this.redundantOpCount++;
            l lVar = this.journalWriter;
            kotlin.jvm.internal.k.b(lVar);
            if (!entry$okhttp.getReadable$okhttp() && !z10) {
                this.lruEntries.remove(entry$okhttp.getKey$okhttp());
                lVar.F(REMOVE).writeByte(32);
                lVar.F(entry$okhttp.getKey$okhttp());
                lVar.writeByte(10);
                lVar.flush();
                if (this.size <= this.maxSize || journalRebuildRequired()) {
                    TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
                }
                return;
            }
            entry$okhttp.setReadable$okhttp(true);
            lVar.F(CLEAN).writeByte(32);
            lVar.F(entry$okhttp.getKey$okhttp());
            entry$okhttp.writeLengths$okhttp(lVar);
            lVar.writeByte(10);
            if (z10) {
                long j10 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j10;
                entry$okhttp.setSequenceNumber$okhttp(j10);
            }
            lVar.flush();
            if (this.size <= this.maxSize) {
            }
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void delete() {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    public final Editor edit(String key) {
        kotlin.jvm.internal.k.e(key, "key");
        return edit$default(this, key, 0L, 2, null);
    }

    public final synchronized void evictAll() {
        try {
            initialize();
            Collection<Entry> values = this.lruEntries.values();
            kotlin.jvm.internal.k.d(values, "lruEntries.values");
            for (Entry entry : (Entry[]) values.toArray(new Entry[0])) {
                kotlin.jvm.internal.k.d(entry, "entry");
                removeEntry$okhttp(entry);
            }
            this.mostRecentTrimFailed = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (!this.initialized) {
            return;
        }
        checkNotClosed();
        trimToSize();
        l lVar = this.journalWriter;
        kotlin.jvm.internal.k.b(lVar);
        lVar.flush();
    }

    public final synchronized Snapshot get(String key) {
        kotlin.jvm.internal.k.e(key, "key");
        initialize();
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (entry == null) {
            return null;
        }
        Snapshot snapshot$okhttp = entry.snapshot$okhttp();
        if (snapshot$okhttp == null) {
            return null;
        }
        this.redundantOpCount++;
        l lVar = this.journalWriter;
        kotlin.jvm.internal.k.b(lVar);
        lVar.F(READ).writeByte(32).F(key).writeByte(10);
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return snapshot$okhttp;
    }

    public final boolean getClosed$okhttp() {
        return this.closed;
    }

    public final File getDirectory() {
        return this.directory;
    }

    public final FileSystem getFileSystem$okhttp() {
        return this.fileSystem;
    }

    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    public final int getValueCount$okhttp() {
        return this.valueCount;
    }

    public final synchronized void initialize() {
        try {
            if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.initialized) {
                return;
            }
            if (this.fileSystem.exists(this.journalFileBackup)) {
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.delete(this.journalFileBackup);
                } else {
                    this.fileSystem.rename(this.journalFileBackup, this.journalFile);
                }
            }
            this.civilizedFileSystem = Util.isCivilized(this.fileSystem, this.journalFileBackup);
            if (this.fileSystem.exists(this.journalFile)) {
                try {
                    readJournal();
                    processJournal();
                    this.initialized = true;
                    return;
                } catch (IOException e10) {
                    Platform.Companion.get().log("DiskLruCache " + this.directory + " is corrupt: " + e10.getMessage() + ", removing", 5, e10);
                    try {
                        delete();
                        this.closed = false;
                    } catch (Throwable th) {
                        this.closed = false;
                        throw th;
                    }
                }
            }
            rebuildJournal$okhttp();
            this.initialized = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    public final synchronized void rebuildJournal$okhttp() {
        try {
            l lVar = this.journalWriter;
            if (lVar != null) {
                lVar.close();
            }
            e0 c10 = b.c(this.fileSystem.sink(this.journalFileTmp));
            try {
                c10.F(MAGIC);
                c10.writeByte(10);
                c10.F(VERSION_1);
                c10.writeByte(10);
                c10.Z(this.appVersion);
                c10.writeByte(10);
                c10.Z(this.valueCount);
                c10.writeByte(10);
                c10.writeByte(10);
                for (Entry entry : this.lruEntries.values()) {
                    if (entry.getCurrentEditor$okhttp() != null) {
                        c10.F(DIRTY);
                        c10.writeByte(32);
                        c10.F(entry.getKey$okhttp());
                        c10.writeByte(10);
                    } else {
                        c10.F(CLEAN);
                        c10.writeByte(32);
                        c10.F(entry.getKey$okhttp());
                        entry.writeLengths$okhttp(c10);
                        c10.writeByte(10);
                    }
                }
                c10.close();
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.rename(this.journalFile, this.journalFileBackup);
                }
                this.fileSystem.rename(this.journalFileTmp, this.journalFile);
                this.fileSystem.delete(this.journalFileBackup);
                this.journalWriter = newJournalWriter();
                this.hasJournalErrors = false;
                this.mostRecentRebuildFailed = false;
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean remove(String key) {
        kotlin.jvm.internal.k.e(key, "key");
        initialize();
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (entry == null) {
            return false;
        }
        boolean removeEntry$okhttp = removeEntry$okhttp(entry);
        if (removeEntry$okhttp && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return removeEntry$okhttp;
    }

    public final boolean removeEntry$okhttp(Entry entry) {
        l lVar;
        kotlin.jvm.internal.k.e(entry, "entry");
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount$okhttp() > 0 && (lVar = this.journalWriter) != null) {
                lVar.F(DIRTY);
                lVar.writeByte(32);
                lVar.F(entry.getKey$okhttp());
                lVar.writeByte(10);
                lVar.flush();
            }
            if (entry.getLockingSourceCount$okhttp() > 0 || entry.getCurrentEditor$okhttp() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
        if (currentEditor$okhttp != null) {
            currentEditor$okhttp.detach$okhttp();
        }
        int i6 = this.valueCount;
        for (int i10 = 0; i10 < i6; i10++) {
            this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i10));
            this.size -= entry.getLengths$okhttp()[i10];
            entry.getLengths$okhttp()[i10] = 0;
        }
        this.redundantOpCount++;
        l lVar2 = this.journalWriter;
        if (lVar2 != null) {
            lVar2.F(REMOVE);
            lVar2.writeByte(32);
            lVar2.F(entry.getKey$okhttp());
            lVar2.writeByte(10);
        }
        this.lruEntries.remove(entry.getKey$okhttp());
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean z10) {
        this.closed = z10;
    }

    public final synchronized void setMaxSize(long j) {
        this.maxSize = j;
        if (this.initialized) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final synchronized long size() {
        initialize();
        return this.size;
    }

    public final synchronized Iterator<Snapshot> snapshots() {
        initialize();
        return new DiskLruCache$snapshots$1(this);
    }

    public final void trimToSize() {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    public final synchronized Editor edit(String key, long j) {
        kotlin.jvm.internal.k.e(key, "key");
        initialize();
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (j != ANY_SEQUENCE_NUMBER && (entry == null || entry.getSequenceNumber$okhttp() != j)) {
            return null;
        }
        if ((entry != null ? entry.getCurrentEditor$okhttp() : null) != null) {
            return null;
        }
        if (entry != null && entry.getLockingSourceCount$okhttp() != 0) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            l lVar = this.journalWriter;
            kotlin.jvm.internal.k.b(lVar);
            lVar.F(DIRTY).writeByte(32).F(key).writeByte(10);
            lVar.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(this, key);
                this.lruEntries.put(key, entry);
            }
            Editor editor = new Editor(this, entry);
            entry.setCurrentEditor$okhttp(editor);
            return editor;
        }
        TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        return null;
    }
}

package okhttp3.internal.cache2;

import bg.k;
import bg.l0;
import bg.n;
import bg.o0;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.f;
import okhttp3.internal.Util;
import w8.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class Relay {
    public static final Companion Companion = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final n PREFIX_CLEAN;
    public static final n PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final k buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final n metadata;
    private int sourceCount;
    private l0 upstream;
    private final k upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final Relay edit(File file, l0 upstream, n metadata, long j) {
            kotlin.jvm.internal.k.e(file, "file");
            kotlin.jvm.internal.k.e(upstream, "upstream");
            kotlin.jvm.internal.k.e(metadata, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, upstream, 0L, metadata, j, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, bg.k] */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, bg.k] */
        public final Relay read(File file) {
            kotlin.jvm.internal.k.e(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            kotlin.jvm.internal.k.d(channel, "randomAccessFile.channel");
            FileOperator fileOperator = new FileOperator(channel);
            ?? obj = new Object();
            fileOperator.read(0L, obj, Relay.FILE_HEADER_SIZE);
            if (kotlin.jvm.internal.k.a(obj.g(r11.d()), Relay.PREFIX_CLEAN)) {
                long readLong = obj.readLong();
                long readLong2 = obj.readLong();
                ?? obj2 = new Object();
                fileOperator.read(Relay.FILE_HEADER_SIZE + readLong, obj2, readLong2);
                return new Relay(randomAccessFile, null, readLong, obj2.g(obj2.f1726y), 0L, null);
            }
            throw new IOException("unreadable cache file");
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public final class RelaySource implements l0 {
        private FileOperator fileOperator;
        private long sourcePos;
        private final o0 timeout = new Object();

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, bg.o0] */
        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            kotlin.jvm.internal.k.b(file);
            FileChannel channel = file.getChannel();
            kotlin.jvm.internal.k.d(channel, "file!!.channel");
            this.fileOperator = new FileOperator(channel);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.fileOperator != null) {
                RandomAccessFile randomAccessFile = null;
                this.fileOperator = null;
                Relay relay = Relay.this;
                synchronized (relay) {
                    relay.setSourceCount(relay.getSourceCount() - 1);
                    if (relay.getSourceCount() == 0) {
                        RandomAccessFile file = relay.getFile();
                        relay.setFile(null);
                        randomAccessFile = file;
                    }
                }
                if (randomAccessFile != null) {
                    Util.closeQuietly(randomAccessFile);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
        
            if (r4 != 2) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        
            r6 = java.lang.Math.min(r23, r21.this$0.getUpstreamPos() - r21.sourcePos);
            r2 = r21.fileOperator;
            kotlin.jvm.internal.k.b(r2);
            r2.read(r21.sourcePos + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r22, r6);
            r21.sourcePos += r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
        
            r0 = r21.this$0.getUpstream();
            kotlin.jvm.internal.k.b(r0);
            r13 = r0.read(r21.this$0.getUpstreamBuffer(), r21.this$0.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
        
            if (r13 != (-1)) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
        
            r0 = r21.this$0;
            r0.commit(r0.getUpstreamPos());
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
        
            r2 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
        
            r2.setUpstreamReader(null);
            r2.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:
        
            r6 = java.lang.Math.min(r13, r23);
            r21.this$0.getUpstreamBuffer().m(0, r22, r6);
            r21.sourcePos += r6;
            r13 = r21.fileOperator;
            kotlin.jvm.internal.k.b(r13);
            r13.write(r21.this$0.getUpstreamPos() + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r21.this$0.getUpstreamBuffer().clone(), r13);
            r4 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00e2, code lost:
        
            monitor-enter(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00e3, code lost:
        
            r4.getBuffer().write(r4.getUpstreamBuffer(), r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00fa, code lost:
        
            if (r4.getBuffer().f1726y <= r4.getBufferMaxSize()) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00fc, code lost:
        
            r4.getBuffer().skip(r4.getBuffer().f1726y - r4.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0111, code lost:
        
            r4.setUpstreamPos(r4.getUpstreamPos() + r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0119, code lost:
        
            monitor-exit(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x011a, code lost:
        
            r2 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x011c, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x011d, code lost:
        
            r2.setUpstreamReader(null);
            r2.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0123, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0124, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x010f, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0129, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00a9, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x012a, code lost:
        
            r2 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x012c, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x012d, code lost:
        
            r2.setUpstreamReader(null);
            r2.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0134, code lost:
        
            throw r0;
         */
        @Override // bg.l0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long read(bg.k r22, long r23) {
            /*
                Method dump skipped, instructions count: 358
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(bg.k, long):long");
        }

        @Override // bg.l0
        public o0 timeout() {
            return this.timeout;
        }
    }

    static {
        n nVar = n.A;
        PREFIX_CLEAN = l.u("OkHttp cache v1\n");
        PREFIX_DIRTY = l.u("OkHttp DIRTY :(\n");
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, l0 l0Var, long j, n nVar, long j10, f fVar) {
        this(randomAccessFile, l0Var, j, nVar, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, bg.k] */
    public final void writeHeader(n nVar, long j, long j10) {
        ?? obj = new Object();
        obj.k0(nVar);
        obj.p0(j);
        obj.p0(j10);
        if (obj.f1726y == FILE_HEADER_SIZE) {
            RandomAccessFile randomAccessFile = this.file;
            kotlin.jvm.internal.k.b(randomAccessFile);
            FileChannel channel = randomAccessFile.getChannel();
            kotlin.jvm.internal.k.d(channel, "file!!.channel");
            new FileOperator(channel).write(0L, obj, FILE_HEADER_SIZE);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, bg.k] */
    private final void writeMetadata(long j) {
        ?? obj = new Object();
        obj.k0(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        kotlin.jvm.internal.k.b(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        kotlin.jvm.internal.k.d(channel, "file!!.channel");
        new FileOperator(channel).write(FILE_HEADER_SIZE + j, obj, this.metadata.d());
    }

    public final void commit(long j) {
        writeMetadata(j);
        RandomAccessFile randomAccessFile = this.file;
        kotlin.jvm.internal.k.b(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, this.metadata.d());
        RandomAccessFile randomAccessFile2 = this.file;
        kotlin.jvm.internal.k.b(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
        }
        l0 l0Var = this.upstream;
        if (l0Var != null) {
            Util.closeQuietly(l0Var);
        }
        this.upstream = null;
    }

    public final k getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final l0 getUpstream() {
        return this.upstream;
    }

    public final k getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        if (this.file == null) {
            return true;
        }
        return false;
    }

    public final n metadata() {
        return this.metadata;
    }

    public final l0 newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final void setComplete(boolean z10) {
        this.complete = z10;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i6) {
        this.sourceCount = i6;
    }

    public final void setUpstream(l0 l0Var) {
        this.upstream = l0Var;
    }

    public final void setUpstreamPos(long j) {
        this.upstreamPos = j;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, bg.k] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, bg.k] */
    private Relay(RandomAccessFile randomAccessFile, l0 l0Var, long j, n nVar, long j10) {
        this.file = randomAccessFile;
        this.upstream = l0Var;
        this.upstreamPos = j;
        this.metadata = nVar;
        this.bufferMaxSize = j10;
        this.upstreamBuffer = new Object();
        this.complete = l0Var == null;
        this.buffer = new Object();
    }
}

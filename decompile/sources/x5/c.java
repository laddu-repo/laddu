package x5;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k8.i1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Closeable {
    public final long A;
    public BufferedWriter D;
    public int F;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final File f14231v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final File f14232w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final File f14233x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final File f14234y;
    public long C = 0;
    public final LinkedHashMap E = new LinkedHashMap(0, 0.75f, true);
    public long G = 0;
    public final ThreadPoolExecutor H = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a());
    public final i1 I = new i1(2, this);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f14235z = 1;
    public final int B = 1;

    public c(File file, long j8) {
        this.f14231v = file;
        this.f14232w = new File(file, "journal");
        this.f14233x = new File(file, "journal.tmp");
        this.f14234y = new File(file, "journal.bkp");
        this.A = j8;
    }

    public static void A(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static c G(File file, long j8) throws IOException {
        if (j8 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                n0(file2, file3, false);
            }
        }
        c cVar = new c(file, j8);
        if (cVar.f14232w.exists()) {
            try {
                cVar.I();
                cVar.H();
                return cVar;
            } catch (IOException e7) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e7.getMessage() + ", removing");
                cVar.close();
                f.a(cVar.f14231v);
            }
        }
        file.mkdirs();
        c cVar2 = new c(file, j8);
        cVar2.m0();
        return cVar2;
    }

    public static void a(c cVar, c2.b bVar, boolean z2) {
        synchronized (cVar) {
            b bVar2 = (b) bVar.f1686w;
            if (bVar2.f != bVar) {
                throw new IllegalStateException();
            }
            if (z2 && !bVar2.f14229e) {
                for (int i = 0; i < cVar.B; i++) {
                    if (!((boolean[]) bVar.f1687x)[i]) {
                        bVar.c();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!bVar2.f14228d[i].exists()) {
                        bVar.c();
                        return;
                    }
                }
            }
            for (int i10 = 0; i10 < cVar.B; i10++) {
                File file = bVar2.f14228d[i10];
                if (!z2) {
                    l(file);
                } else if (file.exists()) {
                    File file2 = bVar2.f14227c[i10];
                    file.renameTo(file2);
                    long j8 = bVar2.f14226b[i10];
                    long length = file2.length();
                    bVar2.f14226b[i10] = length;
                    cVar.C = (cVar.C - j8) + length;
                }
            }
            cVar.F++;
            bVar2.f = null;
            if (bVar2.f14229e || z2) {
                bVar2.f14229e = true;
                cVar.D.append((CharSequence) "CLEAN");
                cVar.D.append(' ');
                cVar.D.append((CharSequence) bVar2.f14225a);
                cVar.D.append((CharSequence) bVar2.a());
                cVar.D.append('\n');
                if (z2) {
                    cVar.G++;
                }
            } else {
                cVar.E.remove(bVar2.f14225a);
                cVar.D.append((CharSequence) "REMOVE");
                cVar.D.append(' ');
                cVar.D.append((CharSequence) bVar2.f14225a);
                cVar.D.append('\n');
            }
            A(cVar.D);
            if (cVar.C > cVar.A || cVar.D()) {
                cVar.H.submit(cVar.I);
            }
        }
    }

    public static void i(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void l(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void n0(File file, File file2, boolean z2) throws IOException {
        if (z2) {
            l(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final synchronized ka.c B(String str) {
        if (this.D == null) {
            throw new IllegalStateException("cache is closed");
        }
        b bVar = (b) this.E.get(str);
        if (bVar == null) {
            return null;
        }
        if (!bVar.f14229e) {
            return null;
        }
        for (File file : bVar.f14227c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.F++;
        this.D.append((CharSequence) "READ");
        this.D.append(' ');
        this.D.append((CharSequence) str);
        this.D.append('\n');
        if (D()) {
            this.H.submit(this.I);
        }
        return new ka.c(bVar.f14227c);
    }

    public final boolean D() {
        int i = this.F;
        return i >= 2000 && i >= this.E.size();
    }

    public final void H() throws IOException {
        l(this.f14233x);
        Iterator it = this.E.values().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            c2.b bVar2 = bVar.f;
            int i = this.B;
            int i10 = 0;
            if (bVar2 == null) {
                while (i10 < i) {
                    this.C += bVar.f14226b[i10];
                    i10++;
                }
            } else {
                bVar.f = null;
                while (i10 < i) {
                    l(bVar.f14227c[i10]);
                    l(bVar.f14228d[i10]);
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void I() {
        File file = this.f14232w;
        e eVar = new e(new FileInputStream(file), f.f14242a);
        try {
            String strA = eVar.a();
            String strA2 = eVar.a();
            String strA3 = eVar.a();
            String strA4 = eVar.a();
            String strA5 = eVar.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Integer.toString(this.f14235z).equals(strA3) || !Integer.toString(this.B).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    c0(eVar.a());
                    i++;
                } catch (EOFException unused) {
                    this.F = i - this.E.size();
                    if (eVar.f14241z == -1) {
                        m0();
                    } else {
                        this.D = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), f.f14242a));
                    }
                    try {
                        eVar.close();
                        return;
                    } catch (RuntimeException e7) {
                        throw e7;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                eVar.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void c0(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.E;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        b bVar = (b) linkedHashMap.get(strSubstring);
        if (bVar == null) {
            bVar = new b(this, strSubstring);
            linkedHashMap.put(strSubstring, bVar);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                bVar.f = new c2.b(this, bVar);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        bVar.f14229e = true;
        bVar.f = null;
        if (strArrSplit.length != bVar.f14230g.B) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            try {
                bVar.f14226b[i10] = Long.parseLong(strArrSplit[i10]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.D == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.E.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                c2.b bVar = ((b) obj).f;
                if (bVar != null) {
                    bVar.c();
                }
            }
            o0();
            i(this.D);
            this.D = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final c2.b m(String str) {
        synchronized (this) {
            try {
                if (this.D == null) {
                    throw new IllegalStateException("cache is closed");
                }
                b bVar = (b) this.E.get(str);
                if (bVar == null) {
                    bVar = new b(this, str);
                    this.E.put(str, bVar);
                } else if (bVar.f != null) {
                    return null;
                }
                c2.b bVar2 = new c2.b(this, bVar);
                bVar.f = bVar2;
                this.D.append((CharSequence) "DIRTY");
                this.D.append(' ');
                this.D.append((CharSequence) str);
                this.D.append('\n');
                A(this.D);
                return bVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void m0() {
        try {
            BufferedWriter bufferedWriter = this.D;
            if (bufferedWriter != null) {
                i(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f14233x), f.f14242a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f14235z));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.B));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (b bVar : this.E.values()) {
                    if (bVar.f != null) {
                        bufferedWriter2.write("DIRTY " + bVar.f14225a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + bVar.f14225a + bVar.a() + '\n');
                    }
                }
                i(bufferedWriter2);
                if (this.f14232w.exists()) {
                    n0(this.f14232w, this.f14234y, true);
                }
                n0(this.f14233x, this.f14232w, false);
                this.f14234y.delete();
                this.D = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f14232w, true), f.f14242a));
            } catch (Throwable th) {
                i(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void o0() {
        while (this.C > this.A) {
            String str = (String) ((Map.Entry) this.E.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.D == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    b bVar = (b) this.E.get(str);
                    if (bVar != null && bVar.f == null) {
                        for (int i = 0; i < this.B; i++) {
                            File file = bVar.f14227c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j8 = this.C;
                            long[] jArr = bVar.f14226b;
                            this.C = j8 - jArr[i];
                            jArr[i] = 0;
                        }
                        this.F++;
                        this.D.append((CharSequence) "REMOVE");
                        this.D.append(' ');
                        this.D.append((CharSequence) str);
                        this.D.append('\n');
                        this.E.remove(str);
                        if (D()) {
                            this.H.submit(this.I);
                        }
                    }
                } finally {
                }
            }
        }
    }
}

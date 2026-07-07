package p4;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y implements w4.e, w4.d {
    public static final TreeMap D = new TreeMap();
    public final byte[][] A;
    public final int[] B;
    public int C;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f10374v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile String f10375w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long[] f10376x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final double[] f10377y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String[] f10378z;

    public y(int i) {
        this.f10374v = i;
        int i10 = i + 1;
        this.B = new int[i10];
        this.f10376x = new long[i10];
        this.f10377y = new double[i10];
        this.f10378z = new String[i10];
        this.A = new byte[i10][];
    }

    public static final y a(int i, String str) {
        TreeMap treeMap = D;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                y yVar = new y(i);
                yVar.f10375w = str;
                yVar.C = i;
                return yVar;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            y yVar2 = (y) entryCeilingEntry.getValue();
            yVar2.f10375w = str;
            yVar2.C = i;
            return yVar2;
        }
    }

    @Override // w4.e
    public final void A(w4.d dVar) {
        int i = this.C;
        if (1 > i) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.B[i10];
            if (i11 == 1) {
                dVar.e(i10);
            } else if (i11 == 2) {
                dVar.N(i10, this.f10376x[i10]);
            } else if (i11 == 3) {
                dVar.C(i10, this.f10377y[i10]);
            } else if (i11 == 4) {
                String str = this.f10378z[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                dVar.t(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.A[i10];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                dVar.X(i10, bArr);
            }
            if (i10 == i) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // w4.d
    public final void C(int i, double d10) {
        this.B[i] = 3;
        this.f10377y[i] = d10;
    }

    @Override // w4.d
    public final void N(int i, long j8) {
        this.B[i] = 2;
        this.f10376x[i] = j8;
    }

    @Override // w4.d
    public final void X(int i, byte[] bArr) {
        this.B[i] = 5;
        this.A[i] = bArr;
    }

    @Override // w4.d
    public final void e(int i) {
        this.B[i] = 1;
    }

    public final void i() {
        TreeMap treeMap = D;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f10374v), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                de.i.d(it, "iterator(...)");
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // w4.e
    public final String l() {
        String str = this.f10375w;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // w4.d
    public final void t(int i, String str) {
        de.i.e(str, "value");
        this.B[i] = 4;
        this.f10378z[i] = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

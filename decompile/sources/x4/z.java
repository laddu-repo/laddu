package x4;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z implements h5.f, h5.e {
    public static final TreeMap F = new TreeMap();
    public final double[] A;
    public final String[] B;
    public final byte[][] C;
    public final int[] D;
    public int E;

    /* renamed from: x, reason: collision with root package name */
    public final int f14681x;

    /* renamed from: y, reason: collision with root package name */
    public volatile String f14682y;

    /* renamed from: z, reason: collision with root package name */
    public final long[] f14683z;

    public z(int i6) {
        this.f14681x = i6;
        int i10 = i6 + 1;
        this.D = new int[i10];
        this.f14683z = new long[i10];
        this.A = new double[i10];
        this.B = new String[i10];
        this.C = new byte[i10];
    }

    public static final z d(int i6, String str) {
        TreeMap treeMap = F;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i6));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                z zVar = (z) ceilingEntry.getValue();
                zVar.f14682y = str;
                zVar.E = i6;
                return zVar;
            }
            z zVar2 = new z(i6);
            zVar2.f14682y = str;
            zVar2.E = i6;
            return zVar2;
        }
    }

    @Override // h5.e
    public final void D(int i6, byte[] bArr) {
        this.D[i6] = 5;
        this.C[i6] = bArr;
    }

    @Override // h5.f
    public final String K() {
        String str = this.f14682y;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // h5.e
    public final void b(int i6, long j) {
        this.D[i6] = 2;
        this.f14683z[i6] = j;
    }

    @Override // h5.e
    public final void c(int i6) {
        this.D[i6] = 1;
    }

    public final void f() {
        TreeMap treeMap = F;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f14681x), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                kotlin.jvm.internal.k.d(it, "iterator(...)");
                while (true) {
                    int i6 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i6;
                }
            }
        }
    }

    @Override // h5.e
    public final void i(int i6, String value) {
        kotlin.jvm.internal.k.e(value, "value");
        this.D[i6] = 4;
        this.B[i6] = value;
    }

    @Override // h5.e
    public final void o(int i6, double d10) {
        this.D[i6] = 3;
        this.A[i6] = d10;
    }

    @Override // h5.f
    public final void y(h5.e eVar) {
        int i6 = this.E;
        if (1 <= i6) {
            int i10 = 1;
            while (true) {
                int i11 = this.D[i10];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 == 5) {
                                    byte[] bArr = this.C[i10];
                                    if (bArr != null) {
                                        eVar.D(i10, bArr);
                                    } else {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                }
                            } else {
                                String str = this.B[i10];
                                if (str != null) {
                                    eVar.i(i10, str);
                                } else {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            }
                        } else {
                            eVar.o(i10, this.A[i10]);
                        }
                    } else {
                        eVar.b(i10, this.f14683z[i10]);
                    }
                } else {
                    eVar.c(i10);
                }
                if (i10 != i6) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

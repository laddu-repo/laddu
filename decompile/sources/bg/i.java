package bg;

import java.io.Closeable;
import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i implements Closeable {
    public byte[] B;

    /* renamed from: x, reason: collision with root package name */
    public k f1720x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1721y;

    /* renamed from: z, reason: collision with root package name */
    public g0 f1722z;
    public long A = -1;
    public int C = -1;
    public int D = -1;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1720x != null) {
            this.f1720x = null;
            this.f1722z = null;
            this.A = -1L;
            this.B = null;
            this.C = -1;
            this.D = -1;
            return;
        }
        throw new IllegalStateException("not attached to a buffer");
    }

    public final void d(long j) {
        k kVar = this.f1720x;
        if (kVar != null) {
            if (this.f1721y) {
                long j10 = kVar.f1726y;
                if (j <= j10) {
                    if (j >= 0) {
                        long j11 = j10 - j;
                        while (true) {
                            if (j11 <= 0) {
                                break;
                            }
                            g0 g0Var = kVar.f1725x;
                            kotlin.jvm.internal.k.b(g0Var);
                            g0 g0Var2 = g0Var.f1716g;
                            kotlin.jvm.internal.k.b(g0Var2);
                            int i6 = g0Var2.f1712c;
                            long j12 = i6 - g0Var2.f1711b;
                            if (j12 <= j11) {
                                kVar.f1725x = g0Var2.a();
                                h0.a(g0Var2);
                                j11 -= j12;
                            } else {
                                g0Var2.f1712c = i6 - ((int) j11);
                                break;
                            }
                        }
                        this.f1722z = null;
                        this.A = j;
                        this.B = null;
                        this.C = -1;
                        this.D = -1;
                    } else {
                        throw new IllegalArgumentException(r4.a.j("newSize < 0: ", j).toString());
                    }
                } else if (j > j10) {
                    long j13 = j - j10;
                    boolean z10 = true;
                    for (long j14 = 0; j13 > j14; j14 = 0) {
                        g0 j02 = kVar.j0(1);
                        int min = (int) Math.min(j13, 8192 - j02.f1712c);
                        int i10 = j02.f1712c + min;
                        j02.f1712c = i10;
                        j13 -= min;
                        if (z10) {
                            this.f1722z = j02;
                            this.A = j10;
                            this.B = j02.f1710a;
                            this.C = i10 - min;
                            this.D = i10;
                            z10 = false;
                        }
                    }
                }
                kVar.f1726y = j;
                return;
            }
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        throw new IllegalStateException("not attached to a buffer");
    }

    public final int f(long j) {
        k kVar = this.f1720x;
        if (kVar != null) {
            if (j >= -1) {
                long j10 = kVar.f1726y;
                if (j <= j10) {
                    if (j != -1 && j != j10) {
                        g0 g0Var = kVar.f1725x;
                        g0 g0Var2 = this.f1722z;
                        long j11 = 0;
                        if (g0Var2 != null) {
                            long j12 = this.A - (this.C - g0Var2.f1711b);
                            if (j12 > j) {
                                g0Var2 = g0Var;
                                g0Var = g0Var2;
                                j10 = j12;
                            } else {
                                j11 = j12;
                            }
                        } else {
                            g0Var2 = g0Var;
                        }
                        if (j10 - j > j - j11) {
                            while (true) {
                                kotlin.jvm.internal.k.b(g0Var2);
                                long j13 = (g0Var2.f1712c - g0Var2.f1711b) + j11;
                                if (j < j13) {
                                    break;
                                }
                                g0Var2 = g0Var2.f1715f;
                                j11 = j13;
                            }
                        } else {
                            while (j10 > j) {
                                kotlin.jvm.internal.k.b(g0Var);
                                g0Var = g0Var.f1716g;
                                kotlin.jvm.internal.k.b(g0Var);
                                j10 -= g0Var.f1712c - g0Var.f1711b;
                            }
                            j11 = j10;
                            g0Var2 = g0Var;
                        }
                        if (this.f1721y) {
                            kotlin.jvm.internal.k.b(g0Var2);
                            if (g0Var2.f1713d) {
                                byte[] bArr = g0Var2.f1710a;
                                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                                kotlin.jvm.internal.k.d(copyOf, "copyOf(...)");
                                g0 g0Var3 = new g0(copyOf, g0Var2.f1711b, g0Var2.f1712c, false, true);
                                if (kVar.f1725x == g0Var2) {
                                    kVar.f1725x = g0Var3;
                                }
                                g0Var2.b(g0Var3);
                                g0 g0Var4 = g0Var3.f1716g;
                                kotlin.jvm.internal.k.b(g0Var4);
                                g0Var4.a();
                                g0Var2 = g0Var3;
                            }
                        }
                        this.f1722z = g0Var2;
                        this.A = j;
                        kotlin.jvm.internal.k.b(g0Var2);
                        this.B = g0Var2.f1710a;
                        int i6 = g0Var2.f1711b + ((int) (j - j11));
                        this.C = i6;
                        int i10 = g0Var2.f1712c;
                        this.D = i10;
                        return i10 - i6;
                    }
                    this.f1722z = null;
                    this.A = j;
                    this.B = null;
                    this.C = -1;
                    this.D = -1;
                    return -1;
                }
            }
            throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + kVar.f1726y);
        }
        throw new IllegalStateException("not attached to a buffer");
    }
}

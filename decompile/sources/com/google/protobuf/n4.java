package com.google.protobuf;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n4 extends p4 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2998b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n4(Unsafe unsafe, int i6) {
        super(unsafe);
        this.f2998b = i6;
    }

    @Override // com.google.protobuf.p4
    public final void c(long j, byte[] bArr, long j10, long j11) {
        switch (this.f2998b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.p4
    public final void d(byte[] bArr, long j, long j10, long j11) {
        switch (this.f2998b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.p4
    public final boolean e(long j, Object obj) {
        switch (this.f2998b) {
            case 0:
                if (q4.f3029h) {
                    if (q4.j(j, obj) == 0) {
                        return false;
                    }
                } else if (q4.k(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (q4.f3029h) {
                    if (q4.j(j, obj) == 0) {
                        return false;
                    }
                } else if (q4.k(j, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.google.protobuf.p4
    public final byte f(long j) {
        switch (this.f2998b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.p4
    public final byte g(long j, Object obj) {
        switch (this.f2998b) {
            case 0:
                if (q4.f3029h) {
                    return q4.j(j, obj);
                }
                return q4.k(j, obj);
            default:
                if (q4.f3029h) {
                    return q4.j(j, obj);
                }
                return q4.k(j, obj);
        }
    }

    @Override // com.google.protobuf.p4
    public final double h(long j, Object obj) {
        switch (this.f2998b) {
            case 0:
                return Double.longBitsToDouble(l(j, obj));
            default:
                return Double.longBitsToDouble(l(j, obj));
        }
    }

    @Override // com.google.protobuf.p4
    public final float i(long j, Object obj) {
        switch (this.f2998b) {
            case 0:
                return Float.intBitsToFloat(j(j, obj));
            default:
                return Float.intBitsToFloat(j(j, obj));
        }
    }

    @Override // com.google.protobuf.p4
    public final long k(long j) {
        switch (this.f2998b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.p4
    public final void o(Object obj, long j, boolean z10) {
        switch (this.f2998b) {
            case 0:
                if (q4.f3029h) {
                    q4.o(obj, j, z10 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    q4.p(obj, j, z10 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (q4.f3029h) {
                    q4.o(obj, j, z10 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    q4.p(obj, j, z10 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // com.google.protobuf.p4
    public final void p(long j, byte b10) {
        switch (this.f2998b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.p4
    public final void q(Object obj, long j, byte b10) {
        switch (this.f2998b) {
            case 0:
                if (q4.f3029h) {
                    q4.o(obj, j, b10);
                    return;
                } else {
                    q4.p(obj, j, b10);
                    return;
                }
            default:
                if (q4.f3029h) {
                    q4.o(obj, j, b10);
                    return;
                } else {
                    q4.p(obj, j, b10);
                    return;
                }
        }
    }

    @Override // com.google.protobuf.p4
    public final void r(Object obj, long j, double d10) {
        switch (this.f2998b) {
            case 0:
                u(obj, j, Double.doubleToLongBits(d10));
                return;
            default:
                u(obj, j, Double.doubleToLongBits(d10));
                return;
        }
    }

    @Override // com.google.protobuf.p4
    public final void s(Object obj, long j, float f3) {
        switch (this.f2998b) {
            case 0:
                t(j, obj, Float.floatToIntBits(f3));
                return;
            default:
                t(j, obj, Float.floatToIntBits(f3));
                return;
        }
    }

    @Override // com.google.protobuf.p4
    public final boolean x() {
        switch (this.f2998b) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}

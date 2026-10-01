package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y extends s1.h {

    /* renamed from: i, reason: collision with root package name */
    public int[] f1959i;
    public int[] j;

    @Override // s1.h
    public final s1.e a(s1.e eVar) {
        boolean z10;
        boolean z11;
        int i6 = eVar.f11984c;
        int[] iArr = this.f1959i;
        if (iArr == null) {
            return s1.e.f11981e;
        }
        int i10 = eVar.f11983b;
        if (u1.a0.L(i6)) {
            if (i10 != iArr.length) {
                z10 = true;
            } else {
                z10 = false;
            }
            for (int i11 = 0; i11 < iArr.length; i11++) {
                int i12 = iArr[i11];
                if (i12 < i10) {
                    if (i12 != i11) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z10 |= z11;
                } else {
                    throw new s1.f("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", eVar);
                }
            }
            if (z10) {
                return new s1.e(eVar.f11982a, iArr.length, i6);
            }
            return s1.e.f11981e;
        }
        throw new s1.f(eVar);
    }

    @Override // s1.h
    public final void b() {
        this.j = this.f1959i;
    }

    @Override // s1.g
    public final void f(ByteBuffer byteBuffer) {
        int i6;
        boolean z10;
        int i10;
        int i11;
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer j = j(((limit - position) / this.f11987b.f11985d) * this.f11988c.f11985d);
        while (position < limit) {
            for (int i12 : iArr) {
                int s = (u1.a0.s(this.f11987b.f11984c) * i12) + position;
                int i13 = this.f11987b.f11984c;
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 != 4) {
                            if (i13 != 21) {
                                if (i13 != 22) {
                                    if (i13 != 268435456) {
                                        if (i13 != 1342177280) {
                                            if (i13 != 1610612736) {
                                                throw new IllegalStateException("Unexpected encoding: " + this.f11987b.f11984c);
                                            }
                                        }
                                    }
                                }
                                j.putInt(byteBuffer.getInt(s));
                            }
                            ByteOrder order = byteBuffer.order();
                            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                            if (order == byteOrder) {
                                i6 = s;
                            } else {
                                i6 = s + 2;
                            }
                            byte b10 = byteBuffer.get(i6);
                            byte b11 = byteBuffer.get(s + 1);
                            if (byteBuffer.order() == byteOrder) {
                                s += 2;
                            }
                            int i14 = ((((b10 << 24) & (-16777216)) | ((b11 << 16) & 16711680)) | ((byteBuffer.get(s) << 8) & 65280)) >> 8;
                            boolean z11 = true;
                            if ((i14 & (-16777216)) != 0 && (i14 & (-8388608)) != -8388608) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            u1.c.a("Value out of range of 24-bit integer: " + Integer.toHexString(i14), z10);
                            if (j.remaining() < 3) {
                                z11 = false;
                            }
                            u1.c.b(z11);
                            if (j.order() == byteOrder) {
                                i10 = (i14 & 16711680) >> 16;
                            } else {
                                i10 = i14 & 255;
                            }
                            byte b12 = (byte) i10;
                            byte b13 = (byte) ((i14 & 65280) >> 8);
                            if (j.order() == byteOrder) {
                                i11 = i14 & 255;
                            } else {
                                i11 = (i14 & 16711680) >> 16;
                            }
                            j.put(b12).put(b13).put((byte) i11);
                        } else {
                            j.putFloat(byteBuffer.getFloat(s));
                        }
                    } else {
                        j.put(byteBuffer.get(s));
                    }
                }
                j.putShort(byteBuffer.getShort(s));
            }
            position += this.f11987b.f11985d;
        }
        byteBuffer.position(limit);
        j.flip();
    }

    @Override // s1.h
    public final void i() {
        this.j = null;
        this.f1959i = null;
    }
}

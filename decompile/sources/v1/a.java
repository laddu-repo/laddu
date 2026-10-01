package v1;

import java.util.ArrayList;
import java.util.Arrays;
import r1.g0;
import r1.i0;
import u1.a0;
import u1.t;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13184a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f13185b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13186c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13187d;

    public a(String str, byte[] bArr, int i6, int i10) {
        byte b10;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    c10 = 0;
                    break;
                }
                break;
            case -269399509:
                if (str.equals("auxiliary.tracks.interleaved")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1011693540:
                if (str.equals("auxiliary.tracks.length")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1098277265:
                if (str.equals("auxiliary.tracks.offset")) {
                    c10 = 3;
                    break;
                }
                break;
            case 2002123038:
                if (str.equals("auxiliary.tracks.map")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                if (i10 == 23 && bArr.length == 4) {
                    r2 = true;
                }
                u1.c.b(r2);
                break;
            case 1:
                if (i10 == 75 && bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                    r2 = true;
                }
                u1.c.b(r2);
                break;
            case 2:
            case 3:
                if (i10 == 78 && bArr.length == 8) {
                    r2 = true;
                }
                u1.c.b(r2);
                break;
            case 4:
                u1.c.b(i10 == 0);
                break;
        }
        this.f13184a = str;
        this.f13185b = bArr;
        this.f13186c = i6;
        this.f13187d = i10;
    }

    @Override // r1.i0
    public final /* synthetic */ r1.q a() {
        return null;
    }

    @Override // r1.i0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final ArrayList d() {
        u1.c.f("Metadata is not an auxiliary tracks map", this.f13184a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f13185b;
        byte b10 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < b10; i6++) {
            arrayList.add(Integer.valueOf(bArr[i6 + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f13184a.equals(aVar.f13184a) && Arrays.equals(this.f13185b, aVar.f13185b) && this.f13186c == aVar.f13186c && this.f13187d == aVar.f13187d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f13185b) + h8.c.g(this.f13184a, 527, 31)) * 31) + this.f13186c) * 31) + this.f13187d;
    }

    public final String toString() {
        String sb2;
        boolean z10;
        boolean z11;
        String str = this.f13184a;
        byte[] bArr = this.f13185b;
        int i6 = this.f13187d;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 23) {
                    if (i6 != 67) {
                        if (i6 != 75) {
                            if (i6 == 78) {
                                sb2 = String.valueOf(new t(bArr).D());
                            }
                            sb2 = a0.c0(bArr);
                        } else {
                            sb2 = String.valueOf(bArr[0] & 255);
                        }
                    } else {
                        if (bArr.length >= 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        int length = bArr.length;
                        if (z11) {
                            sb2 = String.valueOf(a8.f.O(bArr[0], bArr[1], bArr[2], bArr[3]));
                        } else {
                            throw new IllegalArgumentException(k6.e.f("array too small: %s < %s", Integer.valueOf(length), 4));
                        }
                    }
                } else {
                    if (bArr.length >= 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int length2 = bArr.length;
                    if (z10) {
                        sb2 = String.valueOf(Float.intBitsToFloat(a8.f.O(bArr[0], bArr[1], bArr[2], bArr[3])));
                    } else {
                        throw new IllegalArgumentException(k6.e.f("array too small: %s < %s", Integer.valueOf(length2), 4));
                    }
                }
            } else {
                sb2 = a0.o(bArr);
            }
        } else {
            if (str.equals("auxiliary.tracks.map")) {
                ArrayList d10 = d();
                StringBuilder b10 = y.e.b("track types = ");
                new cb.f(String.valueOf(',')).a(b10, d10.iterator());
                sb2 = b10.toString();
            }
            sb2 = a0.c0(bArr);
        }
        return "mdta: key=" + str + ", value=" + sb2;
    }

    @Override // r1.i0
    public final /* synthetic */ void b(g0 g0Var) {
    }
}

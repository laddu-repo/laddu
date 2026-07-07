package a3;

import com.unity3d.services.core.device.MimeTypes;
import db.c1;
import db.e0;
import db.i0;
import db.k0;
import db.r;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import r1.p;
import r1.q;
import u1.a0;
import u1.t;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements a {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f561a;

    /* renamed from: b, reason: collision with root package name */
    public final int f562b;

    public h(int i6, c1 c1Var) {
        this.f562b = i6;
        this.f561a = c1Var;
    }

    public static h b(int i6, t tVar) {
        String str;
        int i10;
        a iVar;
        String str2;
        int i11 = 4;
        r.e(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i12 = tVar.f12813c;
        int i13 = -2;
        int i14 = 0;
        while (tVar.a() > 8) {
            int m9 = tVar.m();
            int m10 = tVar.f12812b + tVar.m();
            tVar.J(m10);
            if (m9 == 1414744396) {
                iVar = b(tVar.m(), tVar);
            } else {
                f fVar = null;
                switch (m9) {
                    case 1718776947:
                        if (i13 == 2) {
                            tVar.L(i11);
                            int m11 = tVar.m();
                            int m12 = tVar.m();
                            tVar.L(i11);
                            int m13 = tVar.m();
                            switch (m13) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = MimeTypes.VIDEO_H264;
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                h8.c.p(m13, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                break;
                            } else {
                                p pVar = new p();
                                pVar.f11617t = m11;
                                pVar.f11618u = m12;
                                pVar.f11611m = r1.k0.p(str2);
                                iVar = new i(new q(pVar));
                                break;
                            }
                        } else if (i13 == 1) {
                            int r10 = tVar.r();
                            if (r10 == 1) {
                                str = "audio/raw";
                            } else if (r10 != 85) {
                                if (r10 == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (r10 != 8192) {
                                    if (r10 != 8193) {
                                        str = null;
                                    } else {
                                        str = "audio/vnd.dts";
                                    }
                                } else {
                                    str = "audio/ac3";
                                }
                            } else {
                                str = "audio/mpeg";
                            }
                            if (str == null) {
                                h8.c.p(r10, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                break;
                            } else {
                                int r11 = tVar.r();
                                int m14 = tVar.m();
                                tVar.L(6);
                                int r12 = tVar.r();
                                String str3 = a0.f12750a;
                                int B = a0.B(r12, ByteOrder.LITTLE_ENDIAN);
                                if (tVar.a() > 0) {
                                    i10 = tVar.r();
                                } else {
                                    i10 = 0;
                                }
                                p pVar2 = new p();
                                pVar2.f11611m = r1.k0.p(str);
                                pVar2.E = r11;
                                pVar2.F = m14;
                                if (str.equals("audio/raw") && B != 0) {
                                    pVar2.G = B;
                                }
                                if (str.equals("audio/mp4a-latm") && i10 > 0) {
                                    byte[] bArr = new byte[i10];
                                    tVar.i(bArr, 0, i10);
                                    pVar2.f11614p = k0.o(bArr);
                                }
                                iVar = new i(new q(pVar2));
                                break;
                            }
                        } else {
                            u1.a.p("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + a0.G(i13));
                            break;
                        }
                    case 1751742049:
                        int m15 = tVar.m();
                        tVar.L(8);
                        int m16 = tVar.m();
                        int m17 = tVar.m();
                        tVar.L(i11);
                        tVar.m();
                        tVar.L(12);
                        iVar = new e(m15, m16, m17);
                        break;
                    case 1752331379:
                        int m18 = tVar.m();
                        tVar.L(12);
                        tVar.m();
                        int m19 = tVar.m();
                        int m20 = tVar.m();
                        tVar.L(i11);
                        int m21 = tVar.m();
                        int m22 = tVar.m();
                        tVar.L(i11);
                        fVar = new f(m18, m19, m20, m21, m22, tVar.m());
                        break;
                    case 1852994675:
                        iVar = new j(tVar.w(tVar.a(), StandardCharsets.UTF_8));
                        break;
                }
                iVar = fVar;
            }
            if (iVar != null) {
                if (iVar.getType() == 1752331379) {
                    i13 = ((f) iVar).a();
                }
                int i15 = i14 + 1;
                int f3 = e0.f(objArr.length, i15);
                if (f3 > objArr.length) {
                    objArr = Arrays.copyOf(objArr, f3);
                }
                objArr[i14] = iVar;
                i14 = i15;
            }
            tVar.K(m10);
            tVar.J(i12);
            i11 = 4;
        }
        return new h(i6, k0.h(i14, objArr));
    }

    public final a a(Class cls) {
        i0 listIterator = this.f561a.listIterator(0);
        while (listIterator.hasNext()) {
            a aVar = (a) listIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // a3.a
    public final int getType() {
        return this.f562b;
    }
}

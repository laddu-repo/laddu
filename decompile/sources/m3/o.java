package m3;

import db.c1;
import db.k0;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import java.util.ArrayList;
import java.util.Objects;
import r1.g0;
import u1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o extends j {

    /* renamed from: b, reason: collision with root package name */
    public final String f8595b;

    /* renamed from: c, reason: collision with root package name */
    public final k0 f8596c;

    public o(String str, String str2, c1 c1Var) {
        super(str);
        u1.c.b(!c1Var.isEmpty());
        this.f8595b = str2;
        k0 k8 = k0.k(c1Var);
        this.f8596c = k8;
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // m3.j, r1.i0
    public final void b(g0 g0Var) {
        char c10;
        Integer num;
        String str = this.f8583a;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 22;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        k0 k0Var = this.f8596c;
        try {
            switch (c10) {
                case 0:
                case '\n':
                    g0Var.f11406c = (CharSequence) k0Var.get(0);
                    return;
                case 1:
                case 11:
                    g0Var.f11427z = (CharSequence) k0Var.get(0);
                    return;
                case 2:
                case '\r':
                    String str2 = (String) k0Var.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    g0Var.f11421t = Integer.valueOf(parseInt);
                    g0Var.f11422u = Integer.valueOf(parseInt2);
                    return;
                case 3:
                case 18:
                    g0Var.f11405b = (CharSequence) k0Var.get(0);
                    return;
                case 4:
                case 19:
                    g0Var.f11407d = (CharSequence) k0Var.get(0);
                    return;
                case 5:
                case 20:
                    g0Var.A = (CharSequence) k0Var.get(0);
                    return;
                case 6:
                case 21:
                    String str3 = (String) k0Var.get(0);
                    String str4 = a0.f12750a;
                    String[] split = str3.split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    if (split.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(split[1]));
                    } else {
                        num = null;
                    }
                    g0Var.f11416n = Integer.valueOf(parseInt3);
                    g0Var.f11417o = num;
                    return;
                case 7:
                case 17:
                    g0Var.f11404a = (CharSequence) k0Var.get(0);
                    return;
                case '\b':
                case 16:
                    g0Var.f11426y = (CharSequence) k0Var.get(0);
                    return;
                case '\t':
                case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                    g0Var.s = Integer.valueOf(Integer.parseInt((String) k0Var.get(0)));
                    return;
                case '\f':
                    Integer V = a8.f.V((String) k0Var.get(0));
                    if (V == null) {
                        g0Var.D = (CharSequence) k0Var.get(0);
                        return;
                    }
                    String a10 = k.a(V.intValue());
                    if (a10 != null) {
                        g0Var.D = a10;
                        return;
                    }
                    return;
                case 14:
                    ArrayList d10 = d((String) k0Var.get(0));
                    int size = d10.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                g0Var.f11422u = (Integer) d10.get(2);
                            } else {
                                return;
                            }
                        }
                        g0Var.f11421t = (Integer) d10.get(1);
                    }
                    g0Var.s = (Integer) d10.get(0);
                    return;
                case 15:
                    ArrayList d11 = d((String) k0Var.get(0));
                    int size2 = d11.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                g0Var.f11425x = (Integer) d11.get(2);
                            } else {
                                return;
                            }
                        }
                        g0Var.f11424w = (Integer) d11.get(1);
                    }
                    g0Var.f11423v = (Integer) d11.get(0);
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (Objects.equals(this.f8583a, oVar.f8583a) && Objects.equals(this.f8595b, oVar.f8595b) && this.f8596c.equals(oVar.f8596c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int g10 = h8.c.g(this.f8583a, 527, 31);
        String str = this.f8595b;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        return this.f8596c.hashCode() + ((g10 + i6) * 31);
    }

    @Override // m3.j
    public final String toString() {
        return this.f8583a + ": description=" + this.f8595b + ": values=" + this.f8596c;
    }
}

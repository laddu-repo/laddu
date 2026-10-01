package p3;

import a8.f;
import dg.b;
import h8.c;
import r1.g0;
import r1.i0;
import r1.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10507a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10508b;

    public a(String str, String str2) {
        this.f10507a = b.q(str);
        this.f10508b = str2;
    }

    @Override // r1.i0
    public final /* synthetic */ q a() {
        return null;
    }

    @Override // r1.i0
    public final void b(g0 g0Var) {
        String str = this.f10507a;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c10 = 0;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c10 = 1;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c10 = 2;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 3;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c10 = 4;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 5;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10 = 6;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = '\t';
                    break;
                }
                break;
        }
        String str2 = this.f10508b;
        switch (c10) {
            case 0:
                Integer V = f.V(str2);
                if (V != null) {
                    g0Var.f11417o = V;
                    return;
                }
                return;
            case 1:
                Integer V2 = f.V(str2);
                if (V2 != null) {
                    g0Var.C = V2;
                    return;
                }
                return;
            case 2:
                Integer V3 = f.V(str2);
                if (V3 != null) {
                    g0Var.f11416n = V3;
                    return;
                }
                return;
            case 3:
                g0Var.f11406c = str2;
                return;
            case 4:
                g0Var.D = str2;
                return;
            case 5:
                g0Var.f11404a = str2;
                return;
            case 6:
                g0Var.f11410g = str2;
                return;
            case 7:
                Integer V4 = f.V(str2);
                if (V4 != null) {
                    g0Var.B = V4;
                    return;
                }
                return;
            case '\b':
                g0Var.f11407d = str2;
                return;
            case '\t':
                g0Var.f11405b = str2;
                return;
            default:
                return;
        }
    }

    @Override // r1.i0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f10507a.equals(aVar.f10507a) && this.f10508b.equals(aVar.f10508b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f10508b.hashCode() + c.g(this.f10507a, 527, 31);
    }

    public final String toString() {
        return "VC: " + this.f10507a + "=" + this.f10508b;
    }
}

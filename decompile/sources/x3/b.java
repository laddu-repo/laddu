package x3;

import android.text.TextUtils;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f14499a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14500b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14501c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14502d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14503e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14504f;

    public /* synthetic */ b(int i6, int i10, int i11, int i12, int i13, int i14) {
        this.f14499a = i6;
        this.f14500b = i10;
        this.f14501c = i11;
        this.f14502d = i12;
        this.f14503e = i13;
        this.f14504f = i14;
    }

    public static b a(String str) {
        char c10;
        u1.c.b(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i6 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < split.length; i14++) {
            String p10 = dg.b.p(split[i14].trim());
            p10.getClass();
            switch (p10.hashCode()) {
                case 100571:
                    if (p10.equals("end")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3556653:
                    if (p10.equals("text")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 102749521:
                    if (p10.equals("layer")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (p10.equals("start")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 109780401:
                    if (p10.equals("style")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            switch (c10) {
                case 0:
                    i11 = i14;
                    break;
                case 1:
                    i13 = i14;
                    break;
                case 2:
                    i6 = i14;
                    break;
                case 3:
                    i10 = i14;
                    break;
                case 4:
                    i12 = i14;
                    break;
            }
        }
        if (i10 != -1 && i11 != -1 && i13 != -1) {
            return new b(i6, i10, i11, i12, i13, split.length);
        }
        return null;
    }
}

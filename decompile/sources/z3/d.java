package z3;

import a8.f;
import android.graphics.Color;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f15154a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15155b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f15156c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f15157d;

    /* renamed from: e, reason: collision with root package name */
    public final float f15158e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f15159f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15160g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15161h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f15162i;
    public final int j;

    public d(String str, int i6, Integer num, Integer num2, float f3, boolean z10, boolean z11, boolean z12, boolean z13, int i10) {
        this.f15154a = str;
        this.f15155b = i6;
        this.f15156c = num;
        this.f15157d = num2;
        this.f15158e = f3;
        this.f15159f = z10;
        this.f15160g = z11;
        this.f15161h = z12;
        this.f15162i = z13;
        this.j = i10;
    }

    public static int a(String str) {
        boolean z10;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z10 = true;
                    break;
                default:
                    z10 = false;
                    break;
            }
            if (z10) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        h8.c.s("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e10) {
            u1.a.q("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    public static Integer c(String str) {
        long parseLong;
        boolean z10;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                z10 = true;
            } else {
                z10 = false;
            }
            u1.c.b(z10);
            return Integer.valueOf(Color.argb(f.G(((parseLong >> 24) & 255) ^ 255), f.G(parseLong & 255), f.G((parseLong >> 8) & 255), f.G((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            u1.a.q("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }
}

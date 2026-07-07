package g7;

import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5500a;

    /* renamed from: b, reason: collision with root package name */
    public final char f5501b;

    /* renamed from: c, reason: collision with root package name */
    public final double f5502c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5503d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5504e;

    public d(ArrayList arrayList, char c10, double d10, String str, String str2) {
        this.f5500a = arrayList;
        this.f5501b = c10;
        this.f5502c = d10;
        this.f5503d = str;
        this.f5504e = str2;
    }

    public static int a(char c10, String str, String str2) {
        return str2.hashCode() + h8.c.g(str, c10 * 31, 31);
    }

    public final int hashCode() {
        return a(this.f5501b, this.f5504e, this.f5503d);
    }
}

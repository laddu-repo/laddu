package kd;

import wf.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@sf.e
/* loaded from: classes.dex */
public final class i {
    public static final h Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final int f7860a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7861b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7862c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7863d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7864e;

    public /* synthetic */ i(int i6, int i10, String str, String str2, String str3, boolean z10) {
        if (7 != (i6 & 7)) {
            u0.h(i6, 7, g.f7855a.d());
            throw null;
        }
        this.f7860a = i10;
        this.f7861b = str;
        this.f7862c = str2;
        if ((i6 & 8) == 0) {
            this.f7863d = false;
        } else {
            this.f7863d = z10;
        }
        if ((i6 & 16) == 0) {
            this.f7864e = null;
        } else {
            this.f7864e = str3;
        }
    }

    public static i a(i iVar, boolean z10) {
        int i6 = iVar.f7860a;
        String title = iVar.f7861b;
        String image = iVar.f7862c;
        String str = iVar.f7864e;
        kotlin.jvm.internal.k.e(title, "title");
        kotlin.jvm.internal.k.e(image, "image");
        return new i(i6, title, image, z10, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f7860a == iVar.f7860a && kotlin.jvm.internal.k.a(this.f7861b, iVar.f7861b) && kotlin.jvm.internal.k.a(this.f7862c, iVar.f7862c) && this.f7863d == iVar.f7863d && kotlin.jvm.internal.k.a(this.f7864e, iVar.f7864e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int hashCode;
        int g10 = h8.c.g(this.f7862c, h8.c.g(this.f7861b, this.f7860a * 31, 31), 31);
        if (this.f7863d) {
            i6 = 1231;
        } else {
            i6 = 1237;
        }
        int i10 = (g10 + i6) * 31;
        String str = this.f7864e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i10 + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Cat(id=");
        sb2.append(this.f7860a);
        sb2.append(", title=");
        sb2.append(this.f7861b);
        sb2.append(", image=");
        sb2.append(this.f7862c);
        sb2.append(", isChecked=");
        sb2.append(this.f7863d);
        sb2.append(", catLink=");
        return r4.a.o(sb2, this.f7864e, ")");
    }

    public i(int i6, String str, String str2, boolean z10, String str3) {
        this.f7860a = i6;
        this.f7861b = str;
        this.f7862c = str2;
        this.f7863d = z10;
        this.f7864e = str3;
    }
}

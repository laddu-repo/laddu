package v6;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s extends l {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f13424a;

    /* renamed from: b, reason: collision with root package name */
    public final k f13425b;

    /* renamed from: c, reason: collision with root package name */
    public final m6.h f13426c;

    /* renamed from: d, reason: collision with root package name */
    public final t6.a f13427d;

    /* renamed from: e, reason: collision with root package name */
    public final String f13428e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13429f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f13430g;

    public s(Drawable drawable, k kVar, m6.h hVar, t6.a aVar, String str, boolean z10, boolean z11) {
        this.f13424a = drawable;
        this.f13425b = kVar;
        this.f13426c = hVar;
        this.f13427d = aVar;
        this.f13428e = str;
        this.f13429f = z10;
        this.f13430g = z11;
    }

    @Override // v6.l
    public final Drawable a() {
        return this.f13424a;
    }

    @Override // v6.l
    public final k b() {
        return this.f13425b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (kotlin.jvm.internal.k.a(this.f13424a, sVar.f13424a) && kotlin.jvm.internal.k.a(this.f13425b, sVar.f13425b) && this.f13426c == sVar.f13426c && kotlin.jvm.internal.k.a(this.f13427d, sVar.f13427d) && kotlin.jvm.internal.k.a(this.f13428e, sVar.f13428e) && this.f13429f == sVar.f13429f && this.f13430g == sVar.f13430g) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10;
        int hashCode = (this.f13426c.hashCode() + ((this.f13425b.hashCode() + (this.f13424a.hashCode() * 31)) * 31)) * 31;
        int i11 = 0;
        t6.a aVar = this.f13427d;
        if (aVar != null) {
            i6 = aVar.hashCode();
        } else {
            i6 = 0;
        }
        int i12 = (hashCode + i6) * 31;
        String str = this.f13428e;
        if (str != null) {
            i11 = str.hashCode();
        }
        int i13 = (i12 + i11) * 31;
        int i14 = 1237;
        if (this.f13429f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i15 = (i13 + i10) * 31;
        if (this.f13430g) {
            i14 = 1231;
        }
        return i15 + i14;
    }
}

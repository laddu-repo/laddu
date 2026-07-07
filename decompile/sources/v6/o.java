package v6;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import okhttp3.Headers;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13407a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f13408b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorSpace f13409c;

    /* renamed from: d, reason: collision with root package name */
    public final w6.h f13410d;

    /* renamed from: e, reason: collision with root package name */
    public final w6.g f13411e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13412f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f13413g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f13414h;

    /* renamed from: i, reason: collision with root package name */
    public final String f13415i;
    public final Headers j;

    /* renamed from: k, reason: collision with root package name */
    public final t f13416k;

    /* renamed from: l, reason: collision with root package name */
    public final q f13417l;

    /* renamed from: m, reason: collision with root package name */
    public final b f13418m;

    /* renamed from: n, reason: collision with root package name */
    public final b f13419n;

    /* renamed from: o, reason: collision with root package name */
    public final b f13420o;

    public o(Context context, Bitmap.Config config, ColorSpace colorSpace, w6.h hVar, w6.g gVar, boolean z10, boolean z11, boolean z12, String str, Headers headers, t tVar, q qVar, b bVar, b bVar2, b bVar3) {
        this.f13407a = context;
        this.f13408b = config;
        this.f13409c = colorSpace;
        this.f13410d = hVar;
        this.f13411e = gVar;
        this.f13412f = z10;
        this.f13413g = z11;
        this.f13414h = z12;
        this.f13415i = str;
        this.j = headers;
        this.f13416k = tVar;
        this.f13417l = qVar;
        this.f13418m = bVar;
        this.f13419n = bVar2;
        this.f13420o = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (kotlin.jvm.internal.k.a(this.f13407a, oVar.f13407a) && this.f13408b == oVar.f13408b) {
                if ((Build.VERSION.SDK_INT < 26 || kotlin.jvm.internal.k.a(this.f13409c, oVar.f13409c)) && kotlin.jvm.internal.k.a(this.f13410d, oVar.f13410d) && this.f13411e == oVar.f13411e && this.f13412f == oVar.f13412f && this.f13413g == oVar.f13413g && this.f13414h == oVar.f13414h && kotlin.jvm.internal.k.a(this.f13415i, oVar.f13415i) && kotlin.jvm.internal.k.a(this.j, oVar.j) && kotlin.jvm.internal.k.a(this.f13416k, oVar.f13416k) && kotlin.jvm.internal.k.a(this.f13417l, oVar.f13417l) && this.f13418m == oVar.f13418m && this.f13419n == oVar.f13419n && this.f13420o == oVar.f13420o) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10;
        int i11;
        int hashCode = (this.f13408b.hashCode() + (this.f13407a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f13409c;
        int i12 = 0;
        if (colorSpace != null) {
            i6 = colorSpace.hashCode();
        } else {
            i6 = 0;
        }
        int hashCode2 = (this.f13411e.hashCode() + ((this.f13410d.hashCode() + ((hashCode + i6) * 31)) * 31)) * 31;
        int i13 = 1237;
        if (this.f13412f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i14 = (hashCode2 + i10) * 31;
        if (this.f13413g) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i15 = (i14 + i11) * 31;
        if (this.f13414h) {
            i13 = 1231;
        }
        int i16 = (i15 + i13) * 31;
        String str = this.f13415i;
        if (str != null) {
            i12 = str.hashCode();
        }
        return this.f13420o.hashCode() + ((this.f13419n.hashCode() + ((this.f13418m.hashCode() + ((this.f13417l.f13423x.hashCode() + ((this.f13416k.f13432a.hashCode() + ((this.j.hashCode() + ((i16 + i12) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}

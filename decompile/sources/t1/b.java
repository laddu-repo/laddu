package t1;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Objects;
import okhttp3.HttpUrl;
import u1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String s;

    /* renamed from: t, reason: collision with root package name */
    public static final String f12451t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f12452u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f12453v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f12454w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f12455x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f12456y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f12457z;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f12458a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f12459b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f12460c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f12461d;

    /* renamed from: e, reason: collision with root package name */
    public final float f12462e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12463f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12464g;

    /* renamed from: h, reason: collision with root package name */
    public final float f12465h;

    /* renamed from: i, reason: collision with root package name */
    public final int f12466i;
    public final float j;

    /* renamed from: k, reason: collision with root package name */
    public final float f12467k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f12468l;

    /* renamed from: m, reason: collision with root package name */
    public final int f12469m;

    /* renamed from: n, reason: collision with root package name */
    public final int f12470n;

    /* renamed from: o, reason: collision with root package name */
    public final float f12471o;

    /* renamed from: p, reason: collision with root package name */
    public final int f12472p;

    /* renamed from: q, reason: collision with root package name */
    public final float f12473q;

    /* renamed from: r, reason: collision with root package name */
    public final int f12474r;

    static {
        new b(HttpUrl.FRAGMENT_ENCODE_SET, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        String str = a0.f12750a;
        s = Integer.toString(0, 36);
        f12451t = Integer.toString(17, 36);
        f12452u = Integer.toString(1, 36);
        f12453v = Integer.toString(2, 36);
        f12454w = Integer.toString(3, 36);
        f12455x = Integer.toString(18, 36);
        f12456y = Integer.toString(4, 36);
        f12457z = Integer.toString(5, 36);
        A = Integer.toString(6, 36);
        B = Integer.toString(7, 36);
        C = Integer.toString(8, 36);
        D = Integer.toString(9, 36);
        E = Integer.toString(10, 36);
        F = Integer.toString(11, 36);
        G = Integer.toString(12, 36);
        H = Integer.toString(13, 36);
        I = Integer.toString(14, 36);
        J = Integer.toString(15, 36);
        K = Integer.toString(16, 36);
        L = Integer.toString(19, 36);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f3, int i6, int i10, float f10, int i11, int i12, float f11, float f12, float f13, boolean z10, int i13, int i14, float f14, int i15) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            u1.c.b(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f12458a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f12458a = charSequence.toString();
        } else {
            this.f12458a = null;
        }
        this.f12459b = alignment;
        this.f12460c = alignment2;
        this.f12461d = bitmap;
        this.f12462e = f3;
        this.f12463f = i6;
        this.f12464g = i10;
        this.f12465h = f10;
        this.f12466i = i11;
        this.j = f12;
        this.f12467k = f13;
        this.f12468l = z10;
        this.f12469m = i13;
        this.f12470n = i12;
        this.f12471o = f11;
        this.f12472p = i14;
        this.f12473q = f14;
        this.f12474r = i15;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t1.a, java.lang.Object] */
    public final a a() {
        ?? obj = new Object();
        obj.f12434a = this.f12458a;
        obj.f12435b = this.f12461d;
        obj.f12436c = this.f12459b;
        obj.f12437d = this.f12460c;
        obj.f12438e = this.f12462e;
        obj.f12439f = this.f12463f;
        obj.f12440g = this.f12464g;
        obj.f12441h = this.f12465h;
        obj.f12442i = this.f12466i;
        obj.j = this.f12470n;
        obj.f12443k = this.f12471o;
        obj.f12444l = this.j;
        obj.f12445m = this.f12467k;
        obj.f12446n = this.f12468l;
        obj.f12447o = this.f12469m;
        obj.f12448p = this.f12472p;
        obj.f12449q = this.f12473q;
        obj.f12450r = this.f12474r;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f12458a;
        if (charSequence != null) {
            bundle.putCharSequence(s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = d.f12481a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(g.f12486c, gVar.f12488a);
                    bundle2.putInt(g.f12487d, gVar.f12489b);
                    arrayList.add(d.a(spanned, gVar, 1, bundle2));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(h.f12490d, hVar.f12493a);
                    bundle3.putInt(h.f12491e, hVar.f12494b);
                    bundle3.putInt(h.f12492f, hVar.f12495c);
                    arrayList.add(d.a(spanned, hVar, 2, bundle3));
                }
                for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
                    arrayList.add(d.a(spanned, eVar, 3, null));
                }
                for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
                    iVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(i.f12496b, iVar.f12497a);
                    arrayList.add(d.a(spanned, iVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f12451t, arrayList);
                }
            }
        }
        bundle.putSerializable(f12452u, this.f12459b);
        bundle.putSerializable(f12453v, this.f12460c);
        bundle.putFloat(f12456y, this.f12462e);
        bundle.putInt(f12457z, this.f12463f);
        bundle.putInt(A, this.f12464g);
        bundle.putFloat(B, this.f12465h);
        bundle.putInt(C, this.f12466i);
        bundle.putInt(D, this.f12470n);
        bundle.putFloat(E, this.f12471o);
        bundle.putFloat(F, this.j);
        bundle.putFloat(G, this.f12467k);
        bundle.putBoolean(I, this.f12468l);
        bundle.putInt(H, this.f12469m);
        bundle.putInt(J, this.f12472p);
        bundle.putFloat(K, this.f12473q);
        bundle.putInt(L, this.f12474r);
        return bundle;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            Bitmap bitmap2 = bVar.f12461d;
            if (TextUtils.equals(this.f12458a, bVar.f12458a) && this.f12459b == bVar.f12459b && this.f12460c == bVar.f12460c && ((bitmap = this.f12461d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f12462e == bVar.f12462e && this.f12463f == bVar.f12463f && this.f12464g == bVar.f12464g && this.f12465h == bVar.f12465h && this.f12466i == bVar.f12466i && this.j == bVar.j && this.f12467k == bVar.f12467k && this.f12468l == bVar.f12468l && this.f12469m == bVar.f12469m && this.f12470n == bVar.f12470n && this.f12471o == bVar.f12471o && this.f12472p == bVar.f12472p && this.f12473q == bVar.f12473q && this.f12474r == bVar.f12474r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12458a, this.f12459b, this.f12460c, this.f12461d, Float.valueOf(this.f12462e), Integer.valueOf(this.f12463f), Integer.valueOf(this.f12464g), Float.valueOf(this.f12465h), Integer.valueOf(this.f12466i), Float.valueOf(this.j), Float.valueOf(this.f12467k), Boolean.valueOf(this.f12468l), Integer.valueOf(this.f12469m), Integer.valueOf(this.f12470n), Float.valueOf(this.f12471o), Integer.valueOf(this.f12472p), Float.valueOf(this.f12473q), Integer.valueOf(this.f12474r));
    }
}

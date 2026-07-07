package ua;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class g extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public m f12978a;

    /* renamed from: b, reason: collision with root package name */
    public y f12979b;

    /* renamed from: c, reason: collision with root package name */
    public ia.a f12980c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f12981d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f12982e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f12983f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f12984g;

    /* renamed from: h, reason: collision with root package name */
    public Rect f12985h;

    /* renamed from: i, reason: collision with root package name */
    public final float f12986i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f12987k;

    /* renamed from: l, reason: collision with root package name */
    public int f12988l;

    /* renamed from: m, reason: collision with root package name */
    public float f12989m;

    /* renamed from: n, reason: collision with root package name */
    public float f12990n;

    /* renamed from: o, reason: collision with root package name */
    public int f12991o;

    /* renamed from: p, reason: collision with root package name */
    public int f12992p;

    /* renamed from: q, reason: collision with root package name */
    public final Paint.Style f12993q;

    public g(m mVar) {
        this.f12981d = null;
        this.f12982e = null;
        this.f12983f = null;
        this.f12984g = PorterDuff.Mode.SRC_IN;
        this.f12985h = null;
        this.f12986i = 1.0f;
        this.j = 1.0f;
        this.f12988l = 255;
        this.f12989m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f12990n = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f12991o = 0;
        this.f12992p = 0;
        this.f12993q = Paint.Style.FILL_AND_STROKE;
        this.f12978a = mVar;
        this.f12980c = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        i iVar = new i(this);
        iVar.C = true;
        iVar.D = true;
        return iVar;
    }

    public g(g gVar) {
        this.f12981d = null;
        this.f12982e = null;
        this.f12983f = null;
        this.f12984g = PorterDuff.Mode.SRC_IN;
        this.f12985h = null;
        this.f12986i = 1.0f;
        this.j = 1.0f;
        this.f12988l = 255;
        this.f12989m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f12990n = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f12991o = 0;
        this.f12992p = 0;
        this.f12993q = Paint.Style.FILL_AND_STROKE;
        this.f12978a = gVar.f12978a;
        this.f12979b = gVar.f12979b;
        this.f12980c = gVar.f12980c;
        this.f12987k = gVar.f12987k;
        this.f12981d = gVar.f12981d;
        this.f12982e = gVar.f12982e;
        this.f12984g = gVar.f12984g;
        this.f12983f = gVar.f12983f;
        this.f12988l = gVar.f12988l;
        this.f12986i = gVar.f12986i;
        this.f12992p = gVar.f12992p;
        this.j = gVar.j;
        this.f12989m = gVar.f12989m;
        this.f12990n = gVar.f12990n;
        this.f12991o = gVar.f12991o;
        this.f12993q = gVar.f12993q;
        if (gVar.f12985h != null) {
            this.f12985h = new Rect(gVar.f12985h);
        }
    }
}

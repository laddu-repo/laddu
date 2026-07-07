package o9;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class g extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f10000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y f10001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e9.a f10002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f10003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f10004e;
    public ColorStateList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f10005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Rect f10006h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f10007j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f10008k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10009l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f10010m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f10011n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10012o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10013p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Paint.Style f10014q;

    public g(m mVar) {
        this.f10003d = null;
        this.f10004e = null;
        this.f = null;
        this.f10005g = PorterDuff.Mode.SRC_IN;
        this.f10006h = null;
        this.i = 1.0f;
        this.f10007j = 1.0f;
        this.f10009l = 255;
        this.f10010m = 0.0f;
        this.f10011n = 0.0f;
        this.f10012o = 0;
        this.f10013p = 0;
        this.f10014q = Paint.Style.FILL_AND_STROKE;
        this.f10000a = mVar;
        this.f10002c = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        i iVar = new i(this);
        iVar.A = true;
        iVar.B = true;
        return iVar;
    }

    public g(g gVar) {
        this.f10003d = null;
        this.f10004e = null;
        this.f = null;
        this.f10005g = PorterDuff.Mode.SRC_IN;
        this.f10006h = null;
        this.i = 1.0f;
        this.f10007j = 1.0f;
        this.f10009l = 255;
        this.f10010m = 0.0f;
        this.f10011n = 0.0f;
        this.f10012o = 0;
        this.f10013p = 0;
        this.f10014q = Paint.Style.FILL_AND_STROKE;
        this.f10000a = gVar.f10000a;
        this.f10001b = gVar.f10001b;
        this.f10002c = gVar.f10002c;
        this.f10008k = gVar.f10008k;
        this.f10003d = gVar.f10003d;
        this.f10004e = gVar.f10004e;
        this.f10005g = gVar.f10005g;
        this.f = gVar.f;
        this.f10009l = gVar.f10009l;
        this.i = gVar.i;
        this.f10013p = gVar.f10013p;
        this.f10007j = gVar.f10007j;
        this.f10010m = gVar.f10010m;
        this.f10011n = gVar.f10011n;
        this.f10012o = gVar.f10012o;
        this.f10014q = gVar.f10014q;
        if (gVar.f10006h != null) {
            this.f10006h = new Rect(gVar.f10006h);
        }
    }
}

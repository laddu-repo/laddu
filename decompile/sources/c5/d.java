package c5;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f2109a = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f2110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f2111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f2112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f2113e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f2114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f2115h;
    public int[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2116j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f2117k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f2118l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f2119m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2120n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Path f2121o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f2122p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f2123q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2124r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2125s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2126t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2127u;

    public d() {
        Paint paint = new Paint();
        this.f2110b = paint;
        Paint paint2 = new Paint();
        this.f2111c = paint2;
        Paint paint3 = new Paint();
        this.f2112d = paint3;
        this.f2113e = 0.0f;
        this.f = 0.0f;
        this.f2114g = 0.0f;
        this.f2115h = 5.0f;
        this.f2122p = 1.0f;
        this.f2126t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void a(int i) {
        this.f2116j = i;
        this.f2127u = this.i[i];
    }
}

package j5;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.Choreographer;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final boolean f6893n0;
    public static final List o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final ThreadPoolExecutor f6894p0;
    public final ArrayList A;
    public n5.a B;
    public String C;
    public ad.c D;
    public Map E;
    public String F;
    public final ub.c G;
    public boolean H;
    public boolean I;
    public r5.b J;
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public h0 Q;
    public boolean R;
    public final Matrix S;
    public Bitmap T;
    public Canvas U;
    public Rect V;
    public RectF W;
    public k5.a X;
    public Rect Y;
    public Rect Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public RectF f6895a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public RectF f6896b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Matrix f6897c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final float[] f6898d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Matrix f6899e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f6900f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public a f6901g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Semaphore f6902h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Handler f6903i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public t f6904j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f6905k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f6906l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f6907m0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public j f6908v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final v5.e f6909w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f6910x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f6911y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f6912z;

    static {
        f6893n0 = Build.VERSION.SDK_INT <= 25;
        o0 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        f6894p0 = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new v5.d());
    }

    public w() {
        v5.e eVar = new v5.e();
        this.f6909w = eVar;
        this.f6910x = true;
        this.f6911y = false;
        this.f6912z = false;
        this.f6907m0 = 1;
        this.A = new ArrayList();
        this.G = new ub.c(1);
        this.H = false;
        this.I = true;
        this.K = 255;
        this.P = false;
        this.Q = h0.f6838v;
        this.R = false;
        this.S = new Matrix();
        this.f6898d0 = new float[9];
        this.f6900f0 = false;
        g4.d dVar = new g4.d(1, this);
        this.f6902h0 = new Semaphore(1);
        this.f6905k0 = new t(this, 1);
        this.f6906l0 = -3.4028235E38f;
        eVar.addUpdateListener(dVar);
    }

    public static void f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public static boolean j(float f) {
        return (Float.isNaN(f) || Float.isInfinite(f)) ? false : true;
    }

    public final void a(final o5.e eVar, final Object obj, final p2.c cVar) {
        r5.b bVar = this.J;
        if (bVar == null) {
            this.A.add(new v() { // from class: j5.q
                @Override // j5.v
                public final void run() {
                    this.f6879a.a(eVar, obj, cVar);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (eVar == o5.e.f9950c) {
            bVar.g(obj, cVar);
        } else {
            o5.f fVar = eVar.f9952b;
            if (fVar != null) {
                fVar.g(obj, cVar);
            } else {
                ArrayList arrayList = new ArrayList();
                this.J.h(eVar, 0, arrayList, new o5.e(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((o5.e) arrayList.get(i)).f9952b.g(obj, cVar);
                }
                zIsEmpty = true ^ arrayList.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (obj == a0.C) {
                u(this.f6909w.a());
            }
        }
    }

    public final boolean b(Context context) {
        if (this.f6911y) {
            return true;
        }
        if (!this.f6910x) {
            return false;
        }
        if (context == null) {
            return true;
        }
        Matrix matrix = v5.i.f13208a;
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    public final void c() {
        j jVar = this.f6908v;
        if (jVar == null) {
            return;
        }
        ob.d dVar = t5.q.f12290a;
        Rect rect = jVar.f6852k;
        List list = Collections.EMPTY_LIST;
        r5.b bVar = new r5.b(this, new r5.d(list, jVar, "__container", -1L, 1, -1L, null, list, new p5.d(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, 1, null, false, null, null, 1), jVar.f6851j, jVar);
        this.J = bVar;
        if (this.M) {
            bVar.q(true);
        }
        this.J.L = this.I;
    }

    public final void d() {
        v5.e eVar = this.f6909w;
        if (eVar.H) {
            eVar.cancel();
            if (!isVisible()) {
                this.f6907m0 = 1;
            }
        }
        this.f6908v = null;
        this.J = null;
        this.B = null;
        this.f6906l0 = -3.4028235E38f;
        eVar.G = null;
        eVar.E = -2.1474836E9f;
        eVar.F = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        j jVar;
        r5.b bVar = this.J;
        if (bVar == null) {
            return;
        }
        a aVar = this.f6901g0;
        if (aVar == null) {
            aVar = a.f6785v;
        }
        boolean z2 = aVar == a.f6786w;
        t tVar = this.f6905k0;
        ThreadPoolExecutor threadPoolExecutor = f6894p0;
        Semaphore semaphore = this.f6902h0;
        v5.e eVar = this.f6909w;
        if (z2) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!z2) {
                    return;
                }
                semaphore.release();
                if (bVar.K == eVar.a()) {
                    return;
                }
            } catch (Throwable th) {
                if (z2) {
                    semaphore.release();
                    if (bVar.K != eVar.a()) {
                        threadPoolExecutor.execute(tVar);
                    }
                }
                throw th;
            }
        }
        if (z2 && (jVar = this.f6908v) != null) {
            float f = this.f6906l0;
            float fA = eVar.a();
            this.f6906l0 = fA;
            if (Math.abs(fA - f) * jVar.b() >= 50.0f) {
                u(eVar.a());
            }
        }
        if (this.f6912z) {
            try {
                if (this.R) {
                    m(canvas, bVar);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused2) {
                v5.c.f13172a.getClass();
            }
        } else if (this.R) {
            m(canvas, bVar);
        } else {
            g(canvas);
        }
        this.f6900f0 = false;
        if (z2) {
            semaphore.release();
            if (bVar.K == eVar.a()) {
                return;
            }
            threadPoolExecutor.execute(tVar);
        }
    }

    public final void e() {
        j jVar = this.f6908v;
        if (jVar == null) {
            return;
        }
        h0 h0Var = this.Q;
        int i = Build.VERSION.SDK_INT;
        boolean z2 = jVar.f6856o;
        int i10 = jVar.f6857p;
        int iOrdinal = h0Var.ordinal();
        boolean z10 = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || ((z2 && i < 28) || i10 > 4 || i <= 25))) {
            z10 = true;
        }
        this.R = z10;
    }

    public final void g(Canvas canvas) {
        r5.b bVar = this.J;
        j jVar = this.f6908v;
        if (bVar == null || jVar == null) {
            return;
        }
        Matrix matrix = this.S;
        matrix.reset();
        if (!getBounds().isEmpty()) {
            matrix.preTranslate(r3.left, r3.top);
            matrix.preScale(r3.width() / jVar.f6852k.width(), r3.height() / jVar.f6852k.height());
        }
        bVar.e(canvas, matrix, this.K, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.K;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        j jVar = this.f6908v;
        if (jVar == null) {
            return -1;
        }
        return jVar.f6852k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        j jVar = this.f6908v;
        if (jVar == null) {
            return -1;
        }
        return jVar.f6852k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final Context h() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public final ad.c i() {
        if (getCallback() == null) {
            return null;
        }
        if (this.D == null) {
            ad.c cVar = new ad.c(getCallback());
            this.D = cVar;
            String str = this.F;
            if (str != null) {
                cVar.A = str;
            }
        }
        return this.D;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable.Callback callback;
        if (this.f6900f0) {
            return;
        }
        this.f6900f0 = true;
        if ((!f6893n0 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        v5.e eVar = this.f6909w;
        if (eVar == null) {
            return false;
        }
        return eVar.H;
    }

    public final void k() {
        this.A.clear();
        v5.e eVar = this.f6909w;
        eVar.g(true);
        Iterator it = eVar.f13179x.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(eVar);
        }
        if (isVisible()) {
            return;
        }
        this.f6907m0 = 1;
    }

    public final void l() {
        if (this.J == null) {
            this.A.add(new u(this, 1));
            return;
        }
        e();
        boolean zB = b(h());
        v5.e eVar = this.f6909w;
        if (zB || eVar.getRepeatCount() == 0) {
            if (isVisible()) {
                eVar.H = true;
                boolean zD = eVar.d();
                for (Animator.AnimatorListener animatorListener : eVar.f13178w) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        animatorListener.onAnimationStart(eVar, zD);
                    } else {
                        animatorListener.onAnimationStart(eVar);
                    }
                }
                eVar.h((int) (eVar.d() ? eVar.b() : eVar.c()));
                eVar.A = 0L;
                eVar.D = 0;
                if (eVar.H) {
                    eVar.g(false);
                    Choreographer.getInstance().postFrameCallback(eVar);
                }
                this.f6907m0 = 1;
            } else {
                this.f6907m0 = 2;
            }
        }
        if (b(h())) {
            return;
        }
        Iterator it = o0.iterator();
        o5.h hVarD = null;
        while (it.hasNext()) {
            hVarD = this.f6908v.d((String) it.next());
            if (hVarD != null) {
                break;
            }
        }
        if (hVarD != null) {
            o((int) hVarD.f9956b);
        } else {
            o((int) (eVar.f13180y < 0.0f ? eVar.c() : eVar.b()));
        }
        eVar.g(true);
        eVar.e(eVar.d());
        if (isVisible()) {
            return;
        }
        this.f6907m0 = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(android.graphics.Canvas r12, r5.b r13) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.w.m(android.graphics.Canvas, r5.b):void");
    }

    public final void n() {
        if (this.J == null) {
            this.A.add(new u(this, 0));
            return;
        }
        e();
        boolean zB = b(h());
        v5.e eVar = this.f6909w;
        if (zB || eVar.getRepeatCount() == 0) {
            if (isVisible()) {
                eVar.H = true;
                eVar.g(false);
                Choreographer.getInstance().postFrameCallback(eVar);
                eVar.A = 0L;
                if (eVar.d() && eVar.C == eVar.c()) {
                    eVar.h(eVar.b());
                } else if (!eVar.d() && eVar.C == eVar.b()) {
                    eVar.h(eVar.c());
                }
                Iterator it = eVar.f13179x.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(eVar);
                }
                this.f6907m0 = 1;
            } else {
                this.f6907m0 = 3;
            }
        }
        if (b(h())) {
            return;
        }
        o((int) (eVar.f13180y < 0.0f ? eVar.c() : eVar.b()));
        eVar.g(true);
        eVar.e(eVar.d());
        if (isVisible()) {
            return;
        }
        this.f6907m0 = 1;
    }

    public final void o(int i) {
        if (this.f6908v != null) {
            this.f6909w.h(i);
        } else {
            this.A.add(new p(this, i, 2));
        }
    }

    public final void p(int i) {
        if (this.f6908v == null) {
            this.A.add(new p(this, i, 0));
        } else {
            v5.e eVar = this.f6909w;
            eVar.i(eVar.E, i + 0.99f);
        }
    }

    public final void q(String str) {
        j jVar = this.f6908v;
        if (jVar == null) {
            this.A.add(new o(this, str, 1));
        } else {
            o5.h hVarD = jVar.d(str);
            if (hVarD == null) {
                throw new IllegalArgumentException(d0.d.l("Cannot find marker with name ", str, "."));
            }
            p((int) (hVarD.f9956b + hVarD.f9957c));
        }
    }

    public final void r(String str) {
        j jVar = this.f6908v;
        ArrayList arrayList = this.A;
        if (jVar == null) {
            arrayList.add(new o(this, str, 0));
            return;
        }
        o5.h hVarD = jVar.d(str);
        if (hVarD == null) {
            throw new IllegalArgumentException(d0.d.l("Cannot find marker with name ", str, "."));
        }
        int i = (int) hVarD.f9956b;
        int i10 = ((int) hVarD.f9957c) + i;
        if (this.f6908v == null) {
            arrayList.add(new s(this, i, i10));
        } else {
            this.f6909w.i(i, i10 + 0.99f);
        }
    }

    public final void s(int i) {
        if (this.f6908v == null) {
            this.A.add(new p(this, i, 1));
        } else {
            this.f6909w.i(i, (int) r0.F);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j8);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.K = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        v5.c.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z10) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z2, z10);
        if (z2) {
            int i = this.f6907m0;
            if (i == 2) {
                l();
                return visible;
            }
            if (i == 3) {
                n();
                return visible;
            }
        } else {
            if (this.f6909w.H) {
                k();
                this.f6907m0 = 3;
                return visible;
            }
            if (zIsVisible) {
                this.f6907m0 = 1;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        l();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.A.clear();
        v5.e eVar = this.f6909w;
        eVar.g(true);
        eVar.e(eVar.d());
        if (isVisible()) {
            return;
        }
        this.f6907m0 = 1;
    }

    public final void t(String str) {
        j jVar = this.f6908v;
        if (jVar == null) {
            this.A.add(new o(this, str, 2));
        } else {
            o5.h hVarD = jVar.d(str);
            if (hVarD == null) {
                throw new IllegalArgumentException(d0.d.l("Cannot find marker with name ", str, "."));
            }
            s((int) hVarD.f9956b);
        }
    }

    public final void u(float f) {
        j jVar = this.f6908v;
        if (jVar == null) {
            this.A.add(new r(this, f, 2));
        } else {
            this.f6909w.h(v5.g.f(jVar.f6853l, jVar.f6854m, f));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}

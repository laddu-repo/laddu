package b7;

import a2.a2;
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
import com.unity3d.services.UnityAdsConstants;
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

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: p0, reason: collision with root package name */
    public static final boolean f1596p0;

    /* renamed from: q0, reason: collision with root package name */
    public static final List f1597q0;

    /* renamed from: r0, reason: collision with root package name */
    public static final ThreadPoolExecutor f1598r0;
    public boolean A;
    public boolean B;
    public final ArrayList C;
    public f7.a D;
    public String E;
    public b4.h F;
    public Map G;
    public String H;
    public final a2 I;
    public boolean J;
    public boolean K;
    public j7.b L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public i0 S;
    public boolean T;
    public final Matrix U;
    public Bitmap V;
    public Canvas W;
    public Rect X;
    public RectF Y;
    public c7.a Z;

    /* renamed from: a0, reason: collision with root package name */
    public Rect f1599a0;

    /* renamed from: b0, reason: collision with root package name */
    public Rect f1600b0;

    /* renamed from: c0, reason: collision with root package name */
    public RectF f1601c0;

    /* renamed from: d0, reason: collision with root package name */
    public RectF f1602d0;

    /* renamed from: e0, reason: collision with root package name */
    public Matrix f1603e0;

    /* renamed from: f0, reason: collision with root package name */
    public final float[] f1604f0;

    /* renamed from: g0, reason: collision with root package name */
    public Matrix f1605g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f1606h0;

    /* renamed from: i0, reason: collision with root package name */
    public a f1607i0;

    /* renamed from: j0, reason: collision with root package name */
    public final Semaphore f1608j0;

    /* renamed from: k0, reason: collision with root package name */
    public Handler f1609k0;

    /* renamed from: l0, reason: collision with root package name */
    public u f1610l0;

    /* renamed from: m0, reason: collision with root package name */
    public final u f1611m0;

    /* renamed from: n0, reason: collision with root package name */
    public float f1612n0;
    public int o0;

    /* renamed from: x, reason: collision with root package name */
    public j f1613x;

    /* renamed from: y, reason: collision with root package name */
    public final n7.e f1614y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f1615z;

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT <= 25) {
            z10 = true;
        } else {
            z10 = false;
        }
        f1596p0 = z10;
        f1597q0 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        f1598r0 = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new n7.d());
    }

    public y() {
        n7.e eVar = new n7.e();
        this.f1614y = eVar;
        this.f1615z = true;
        this.A = false;
        this.B = false;
        this.o0 = 1;
        this.C = new ArrayList();
        this.I = new a2(1);
        this.J = false;
        this.K = true;
        this.M = 255;
        this.R = false;
        this.S = i0.f1539x;
        this.T = false;
        this.U = new Matrix();
        this.f1604f0 = new float[9];
        this.f1606h0 = false;
        w wVar = new w(this, 0);
        this.f1608j0 = new Semaphore(1);
        this.f1611m0 = new u(this, 1);
        this.f1612n0 = -3.4028235E38f;
        eVar.addUpdateListener(wVar);
    }

    public static void f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public static boolean j(float f3) {
        if (!Float.isNaN(f3) && !Float.isInfinite(f3)) {
            return true;
        }
        return false;
    }

    public final void a(final g7.e eVar, final Object obj, final j1.f0 f0Var) {
        j7.b bVar = this.L;
        if (bVar == null) {
            this.C.add(new x() { // from class: b7.r
                @Override // b7.x
                public final void run() {
                    y.this.a(eVar, obj, f0Var);
                }
            });
            return;
        }
        boolean z10 = true;
        if (eVar == g7.e.f5505c) {
            bVar.d(f0Var, obj);
        } else {
            g7.f fVar = eVar.f5507b;
            if (fVar != null) {
                fVar.d(f0Var, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                this.L.h(eVar, 0, arrayList, new g7.e(new String[0]));
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    ((g7.e) arrayList.get(i6)).f5507b.d(f0Var, obj);
                }
                z10 = true ^ arrayList.isEmpty();
            }
        }
        if (z10) {
            invalidateSelf();
            if (obj == c0.C) {
                u(this.f1614y.a());
            }
        }
    }

    public final boolean b(Context context) {
        if (!this.A) {
            if (this.f1615z) {
                if (context != null) {
                    Matrix matrix = n7.i.f9124a;
                    if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void c() {
        j jVar = this.f1613x;
        if (jVar == null) {
            return;
        }
        j1.f0 f0Var = l7.q.f8294a;
        Rect rect = jVar.f1551k;
        List list = Collections.EMPTY_LIST;
        j7.b bVar = new j7.b(this, new j7.d(list, jVar, "__container", -1L, 1, -1L, null, list, new h7.d(), 0, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.width(), rect.height(), null, null, list, 1, null, false, null, null, 1), jVar.j, jVar);
        this.L = bVar;
        if (this.O) {
            bVar.q(true);
        }
        this.L.L = this.K;
    }

    public final void d() {
        n7.e eVar = this.f1614y;
        if (eVar.J) {
            eVar.cancel();
            if (!isVisible()) {
                this.o0 = 1;
            }
        }
        this.f1613x = null;
        this.L = null;
        this.D = null;
        this.f1612n0 = -3.4028235E38f;
        eVar.I = null;
        eVar.G = -2.1474836E9f;
        eVar.H = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        j jVar;
        j7.b bVar = this.L;
        if (bVar != null) {
            a aVar = this.f1607i0;
            if (aVar == null) {
                aVar = a.f1481x;
            }
            if (aVar == a.f1482y) {
                z10 = true;
            } else {
                z10 = false;
            }
            u uVar = this.f1611m0;
            ThreadPoolExecutor threadPoolExecutor = f1598r0;
            Semaphore semaphore = this.f1608j0;
            n7.e eVar = this.f1614y;
            if (z10) {
                try {
                    semaphore.acquire();
                } catch (InterruptedException unused) {
                    if (z10) {
                        semaphore.release();
                        if (bVar.K == eVar.a()) {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    if (z10) {
                        semaphore.release();
                        if (bVar.K != eVar.a()) {
                            threadPoolExecutor.execute(uVar);
                        }
                    }
                    throw th;
                }
            }
            if (z10 && (jVar = this.f1613x) != null) {
                float f3 = this.f1612n0;
                float a10 = eVar.a();
                this.f1612n0 = a10;
                if (Math.abs(a10 - f3) * jVar.b() >= 50.0f) {
                    u(eVar.a());
                }
            }
            if (this.B) {
                try {
                    if (this.T) {
                        m(canvas, bVar);
                    } else {
                        g(canvas);
                    }
                } catch (Throwable unused2) {
                    n7.c.f9090a.getClass();
                }
            } else if (this.T) {
                m(canvas, bVar);
            } else {
                g(canvas);
            }
            this.f1606h0 = false;
            if (z10) {
                semaphore.release();
                if (bVar.K == eVar.a()) {
                    return;
                }
                threadPoolExecutor.execute(uVar);
            }
        }
    }

    public final void e() {
        j jVar = this.f1613x;
        if (jVar == null) {
            return;
        }
        i0 i0Var = this.S;
        int i6 = Build.VERSION.SDK_INT;
        boolean z10 = jVar.f1555o;
        int i10 = jVar.f1556p;
        int ordinal = i0Var.ordinal();
        boolean z11 = false;
        if (ordinal != 1 && (ordinal == 2 || ((z10 && i6 < 28) || i10 > 4 || i6 <= 25))) {
            z11 = true;
        }
        this.T = z11;
    }

    public final void g(Canvas canvas) {
        j7.b bVar = this.L;
        j jVar = this.f1613x;
        if (bVar != null && jVar != null) {
            Matrix matrix = this.U;
            matrix.reset();
            if (!getBounds().isEmpty()) {
                matrix.preTranslate(r3.left, r3.top);
                matrix.preScale(r3.width() / jVar.f1551k.width(), r3.height() / jVar.f1551k.height());
            }
            bVar.c(canvas, matrix, this.M, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.M;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        j jVar = this.f1613x;
        if (jVar == null) {
            return -1;
        }
        return jVar.f1551k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        j jVar = this.f1613x;
        if (jVar == null) {
            return -1;
        }
        return jVar.f1551k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final Context h() {
        Drawable.Callback callback = getCallback();
        if (callback == null || !(callback instanceof View)) {
            return null;
        }
        return ((View) callback).getContext();
    }

    public final b4.h i() {
        if (getCallback() == null) {
            return null;
        }
        if (this.F == null) {
            b4.h hVar = new b4.h(getCallback());
            this.F = hVar;
            String str = this.H;
            if (str != null) {
                hVar.B = str;
            }
        }
        return this.F;
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
        if (!this.f1606h0) {
            this.f1606h0 = true;
            if ((!f1596p0 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        n7.e eVar = this.f1614y;
        if (eVar == null) {
            return false;
        }
        return eVar.J;
    }

    public final void k() {
        this.C.clear();
        n7.e eVar = this.f1614y;
        eVar.g(true);
        Iterator it = eVar.f9097z.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(eVar);
        }
        if (!isVisible()) {
            this.o0 = 1;
        }
    }

    public final void l() {
        float c10;
        float b10;
        if (this.L == null) {
            this.C.add(new v(this, 1));
            return;
        }
        e();
        boolean b11 = b(h());
        n7.e eVar = this.f1614y;
        if (b11 || eVar.getRepeatCount() == 0) {
            if (isVisible()) {
                eVar.J = true;
                boolean d10 = eVar.d();
                Iterator it = eVar.f9096y.iterator();
                while (it.hasNext()) {
                    Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
                    if (Build.VERSION.SDK_INT >= 26) {
                        animatorListener.onAnimationStart(eVar, d10);
                    } else {
                        animatorListener.onAnimationStart(eVar);
                    }
                }
                if (eVar.d()) {
                    c10 = eVar.b();
                } else {
                    c10 = eVar.c();
                }
                eVar.h((int) c10);
                eVar.C = 0L;
                eVar.F = 0;
                if (eVar.J) {
                    eVar.g(false);
                    Choreographer.getInstance().postFrameCallback(eVar);
                }
                this.o0 = 1;
            } else {
                this.o0 = 2;
            }
        }
        if (!b(h())) {
            Iterator it2 = f1597q0.iterator();
            g7.h hVar = null;
            while (it2.hasNext()) {
                hVar = this.f1613x.d((String) it2.next());
                if (hVar != null) {
                    break;
                }
            }
            if (hVar != null) {
                o((int) hVar.f5511b);
            } else {
                if (eVar.A < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    b10 = eVar.c();
                } else {
                    b10 = eVar.b();
                }
                o((int) b10);
            }
            eVar.g(true);
            eVar.e(eVar.d());
            if (!isVisible()) {
                this.o0 = 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(android.graphics.Canvas r13, j7.b r14) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.y.m(android.graphics.Canvas, j7.b):void");
    }

    public final void n() {
        float b10;
        if (this.L == null) {
            this.C.add(new v(this, 0));
            return;
        }
        e();
        boolean b11 = b(h());
        n7.e eVar = this.f1614y;
        if (b11 || eVar.getRepeatCount() == 0) {
            if (isVisible()) {
                eVar.J = true;
                eVar.g(false);
                Choreographer.getInstance().postFrameCallback(eVar);
                eVar.C = 0L;
                if (eVar.d() && eVar.E == eVar.c()) {
                    eVar.h(eVar.b());
                } else if (!eVar.d() && eVar.E == eVar.b()) {
                    eVar.h(eVar.c());
                }
                Iterator it = eVar.f9097z.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(eVar);
                }
                this.o0 = 1;
            } else {
                this.o0 = 3;
            }
        }
        if (!b(h())) {
            if (eVar.A < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                b10 = eVar.c();
            } else {
                b10 = eVar.b();
            }
            o((int) b10);
            eVar.g(true);
            eVar.e(eVar.d());
            if (!isVisible()) {
                this.o0 = 1;
            }
        }
    }

    public final void o(int i6) {
        if (this.f1613x == null) {
            this.C.add(new q(this, i6, 2));
        } else {
            this.f1614y.h(i6);
        }
    }

    public final void p(int i6) {
        if (this.f1613x == null) {
            this.C.add(new q(this, i6, 0));
        } else {
            n7.e eVar = this.f1614y;
            eVar.i(eVar.G, i6 + 0.99f);
        }
    }

    public final void q(String str) {
        j jVar = this.f1613x;
        if (jVar == null) {
            this.C.add(new p(this, str, 1));
        } else {
            g7.h d10 = jVar.d(str);
            if (d10 != null) {
                p((int) (d10.f5511b + d10.f5512c));
                return;
            }
            throw new IllegalArgumentException(h8.c.m("Cannot find marker with name ", str, "."));
        }
    }

    public final void r(String str) {
        j jVar = this.f1613x;
        ArrayList arrayList = this.C;
        if (jVar == null) {
            arrayList.add(new p(this, str, 0));
            return;
        }
        g7.h d10 = jVar.d(str);
        if (d10 != null) {
            int i6 = (int) d10.f5511b;
            int i10 = ((int) d10.f5512c) + i6;
            if (this.f1613x == null) {
                arrayList.add(new t(this, i6, i10));
                return;
            } else {
                this.f1614y.i(i6, i10 + 0.99f);
                return;
            }
        }
        throw new IllegalArgumentException(h8.c.m("Cannot find marker with name ", str, "."));
    }

    public final void s(int i6) {
        if (this.f1613x == null) {
            this.C.add(new q(this, i6, 1));
        } else {
            this.f1614y.i(i6, (int) r0.H);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        this.M = i6;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        n7.c.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            int i6 = this.o0;
            if (i6 == 2) {
                l();
                return visible;
            }
            if (i6 == 3) {
                n();
                return visible;
            }
        } else {
            if (this.f1614y.J) {
                k();
                this.o0 = 3;
                return visible;
            }
            if (isVisible) {
                this.o0 = 1;
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
        this.C.clear();
        n7.e eVar = this.f1614y;
        eVar.g(true);
        eVar.e(eVar.d());
        if (!isVisible()) {
            this.o0 = 1;
        }
    }

    public final void t(String str) {
        j jVar = this.f1613x;
        if (jVar == null) {
            this.C.add(new p(this, str, 2));
        } else {
            g7.h d10 = jVar.d(str);
            if (d10 != null) {
                s((int) d10.f5511b);
                return;
            }
            throw new IllegalArgumentException(h8.c.m("Cannot find marker with name ", str, "."));
        }
    }

    public final void u(float f3) {
        j jVar = this.f1613x;
        if (jVar == null) {
            this.C.add(new s(this, f3, 2));
        } else {
            this.f1614y.h(n7.g.f(jVar.f1552l, jVar.f1553m, f3));
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

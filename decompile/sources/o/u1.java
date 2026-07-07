package o;

import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class u1 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public t1 A;
    public boolean B;
    public int C;
    public final int[] D = new int[2];

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f9302v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f9303w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f9304x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final View f9305y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public t1 f9306z;

    public u1(View view) {
        this.f9305y = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f9302v = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f9303w = tapTimeout;
        this.f9304x = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        t1 t1Var = this.A;
        View view = this.f9305y;
        if (t1Var != null) {
            view.removeCallbacks(t1Var);
        }
        t1 t1Var2 = this.f9306z;
        if (t1Var2 != null) {
            view.removeCallbacks(t1Var2);
        }
    }

    public abstract n.b0 b();

    public abstract boolean c();

    public boolean d() {
        n.b0 b0VarB = b();
        if (b0VarB == null || !b0VarB.a()) {
            return true;
        }
        b0VarB.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.u1.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.B = false;
        this.C = -1;
        t1 t1Var = this.f9306z;
        if (t1Var != null) {
            this.f9305y.removeCallbacks(t1Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}

package p;

import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class w1 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final View A;
    public v1 B;
    public v1 C;
    public boolean D;
    public int E;
    public final int[] F = new int[2];

    /* renamed from: x, reason: collision with root package name */
    public final float f10402x;

    /* renamed from: y, reason: collision with root package name */
    public final int f10403y;

    /* renamed from: z, reason: collision with root package name */
    public final int f10404z;

    public w1(View view) {
        this.A = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f10402x = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f10403y = tapTimeout;
        this.f10404z = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        v1 v1Var = this.C;
        View view = this.A;
        if (v1Var != null) {
            view.removeCallbacks(v1Var);
        }
        v1 v1Var2 = this.B;
        if (v1Var2 != null) {
            view.removeCallbacks(v1Var2);
        }
    }

    public abstract o.b0 b();

    public abstract boolean c();

    public boolean d() {
        o.b0 b10 = b();
        if (b10 != null && b10.a()) {
            b10.dismiss();
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.w1.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.D = false;
        this.E = -1;
        v1 v1Var = this.B;
        if (v1Var != null) {
            this.A.removeCallbacks(v1Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}

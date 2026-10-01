package p;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e2 implements View.OnTouchListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f2 f10234x;

    public e2(f2 f2Var) {
        this.f10234x = f2Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        f2 f2Var = this.f10234x;
        b2 b2Var = f2Var.O;
        Handler handler = f2Var.S;
        a0 a0Var = f2Var.W;
        int action = motionEvent.getAction();
        int x10 = (int) motionEvent.getX();
        int y9 = (int) motionEvent.getY();
        if (action == 0 && a0Var != null && a0Var.isShowing() && x10 >= 0 && x10 < a0Var.getWidth() && y9 >= 0 && y9 < a0Var.getHeight()) {
            handler.postDelayed(b2Var, 250L);
            return false;
        }
        if (action == 1) {
            handler.removeCallbacks(b2Var);
            return false;
        }
        return false;
    }
}

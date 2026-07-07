package o;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b2 implements View.OnTouchListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c2 f9124v;

    public b2(c2 c2Var) {
        this.f9124v = c2Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        c2 c2Var = this.f9124v;
        z1 z1Var = c2Var.M;
        Handler handler = c2Var.Q;
        x xVar = c2Var.U;
        int action = motionEvent.getAction();
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (action == 0 && xVar != null && xVar.isShowing() && x10 >= 0 && x10 < xVar.getWidth() && y10 >= 0 && y10 < xVar.getHeight()) {
            handler.postDelayed(z1Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(z1Var);
        return false;
    }
}

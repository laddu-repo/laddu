package ga;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements View.OnTouchListener {
    public final int A;

    /* renamed from: x, reason: collision with root package name */
    public final Dialog f5565x;

    /* renamed from: y, reason: collision with root package name */
    public final int f5566y;

    /* renamed from: z, reason: collision with root package name */
    public final int f5567z;

    public a(Dialog dialog, Rect rect) {
        this.f5565x = dialog;
        this.f5566y = rect.left;
        this.f5567z = rect.top;
        this.A = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f5566y;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f5567z, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i6 = this.A;
            obtain.setLocation((-i6) - 1, (-i6) - 1);
        }
        view.performClick();
        return this.f5565x.onTouchEvent(obtain);
    }
}

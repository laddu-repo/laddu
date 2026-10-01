package o;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x2 extends TouchDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f9335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f9336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f9337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f9338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9339e;
    public boolean f;

    public x2(View view, Rect rect, Rect rect2) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f9339e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f9336b = rect3;
        Rect rect4 = new Rect();
        this.f9338d = rect4;
        Rect rect5 = new Rect();
        this.f9337c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i = -scaledTouchSlop;
        rect4.inset(i, i);
        rect5.set(rect2);
        this.f9335a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z10;
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z11 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z10 = this.f;
                if (z10 && !this.f9338d.contains(x10, y10)) {
                    z11 = z10;
                    z2 = false;
                }
            } else {
                if (action == 3) {
                    z10 = this.f;
                    this.f = false;
                }
                z2 = true;
                z11 = false;
            }
            z11 = z10;
            z2 = true;
        } else if (this.f9336b.contains(x10, y10)) {
            this.f = true;
            z2 = true;
        } else {
            z2 = true;
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        Rect rect = this.f9337c;
        View view = this.f9335a;
        if (!z2 || rect.contains(x10, y10)) {
            motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}

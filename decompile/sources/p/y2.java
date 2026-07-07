package p;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y2 extends TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final View f10427a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f10428b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f10429c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f10430d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10431e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10432f;

    public y2(View view, Rect rect, Rect rect2) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f10431e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f10428b = rect3;
        Rect rect4 = new Rect();
        this.f10430d = rect4;
        Rect rect5 = new Rect();
        this.f10429c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i6 = -scaledTouchSlop;
        rect4.inset(i6, i6);
        rect5.set(rect2);
        this.f10427a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int x10 = (int) motionEvent.getX();
        int y9 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z12 = true;
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action == 3) {
                    z11 = this.f10432f;
                    this.f10432f = false;
                }
                z10 = true;
                z12 = false;
            } else {
                z11 = this.f10432f;
                if (z11 && !this.f10430d.contains(x10, y9)) {
                    z12 = z11;
                    z10 = false;
                }
            }
            z12 = z11;
            z10 = true;
        } else {
            if (this.f10428b.contains(x10, y9)) {
                this.f10432f = true;
                z10 = true;
            }
            z10 = true;
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        Rect rect = this.f10429c;
        View view = this.f10427a;
        if (z10 && !rect.contains(x10, y9)) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            motionEvent.setLocation(x10 - rect.left, y9 - rect.top);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}

package w4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class t0 extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public i1 f14020a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f14021b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14022c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14023d;

    public t0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14021b = new Rect();
        this.f14022c = true;
        this.f14023d = false;
    }

    public t0(int i6, int i10) {
        super(i6, i10);
        this.f14021b = new Rect();
        this.f14022c = true;
        this.f14023d = false;
    }

    public t0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f14021b = new Rect();
        this.f14022c = true;
        this.f14023d = false;
    }

    public t0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f14021b = new Rect();
        this.f14022c = true;
        this.f14023d = false;
    }

    public t0(t0 t0Var) {
        super((ViewGroup.LayoutParams) t0Var);
        this.f14021b = new Rect();
        this.f14022c = true;
        this.f14023d = false;
    }
}

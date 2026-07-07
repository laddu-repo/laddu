package o4;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class k0 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z0 f9800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f9801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9803d;

    public k0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9801b = new Rect();
        this.f9802c = true;
        this.f9803d = false;
    }

    public k0(int i, int i10) {
        super(i, i10);
        this.f9801b = new Rect();
        this.f9802c = true;
        this.f9803d = false;
    }

    public k0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f9801b = new Rect();
        this.f9802c = true;
        this.f9803d = false;
    }

    public k0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f9801b = new Rect();
        this.f9802c = true;
        this.f9803d = false;
    }

    public k0(k0 k0Var) {
        super((ViewGroup.LayoutParams) k0Var);
        this.f9801b = new Rect();
        this.f9802c = true;
        this.f9803d = false;
    }
}

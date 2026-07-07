package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import i.b0;
import o.l;
import p.f;
import p.i1;
import p.j;
import p.j1;
import p.m3;
import t0.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue A;
    public TypedValue B;
    public TypedValue C;
    public final Rect D;
    public i1 E;

    /* renamed from: x, reason: collision with root package name */
    public TypedValue f766x;

    /* renamed from: y, reason: collision with root package name */
    public TypedValue f767y;

    /* renamed from: z, reason: collision with root package name */
    public TypedValue f768z;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.D = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.B == null) {
            this.B = new TypedValue();
        }
        return this.B;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.C == null) {
            this.C = new TypedValue();
        }
        return this.C;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f768z == null) {
            this.f768z = new TypedValue();
        }
        return this.f768z;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.A == null) {
            this.A = new TypedValue();
        }
        return this.A;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f766x == null) {
            this.f766x = new TypedValue();
        }
        return this.f766x;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f767y == null) {
            this.f767y = new TypedValue();
        }
        return this.f767y;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i1 i1Var = this.E;
        if (i1Var != null) {
            i1Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        j jVar;
        super.onDetachedFromWindow();
        i1 i1Var = this.E;
        if (i1Var != null) {
            b0 b0Var = (b0) ((k7.c) i1Var).f7745y;
            j1 j1Var = b0Var.O;
            if (j1Var != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((m3) actionBarOverlayLayout.B).f10301a.f832x;
                if (actionMenuView != null && (jVar = actionMenuView.Q) != null) {
                    jVar.b();
                    f fVar = jVar.Q;
                    if (fVar != null && fVar.b()) {
                        fVar.f9845i.dismiss();
                    }
                }
            }
            if (b0Var.T != null) {
                b0Var.I.getDecorView().removeCallbacks(b0Var.U);
                if (b0Var.T.isShowing()) {
                    try {
                        b0Var.T.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                b0Var.T = null;
            }
            u0 u0Var = b0Var.V;
            if (u0Var != null) {
                u0Var.b();
            }
            l lVar = b0Var.y(0).f6120h;
            if (lVar != null) {
                lVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(i1 i1Var) {
        this.E = i1Var;
    }
}

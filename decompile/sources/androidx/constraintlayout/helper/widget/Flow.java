package androidx.constraintlayout.helper.widget;

import a0.d;
import a0.g;
import a0.i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import d0.s;
import d0.u;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class Flow extends u {
    public final g G;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, b0.b] */
    /* JADX WARN: Type inference failed for: r8v1, types: [a0.g, a0.i] */
    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3496x = new int[32];
        this.D = new HashMap();
        this.f3498z = context;
        super.g(attributeSet);
        ?? iVar = new i();
        iVar.f98s0 = 0;
        iVar.f99t0 = 0;
        iVar.f100u0 = 0;
        iVar.f101v0 = 0;
        iVar.f102w0 = 0;
        iVar.f103x0 = 0;
        iVar.f104y0 = false;
        iVar.f105z0 = 0;
        iVar.A0 = 0;
        iVar.B0 = new Object();
        iVar.C0 = null;
        iVar.D0 = -1;
        iVar.E0 = -1;
        iVar.F0 = -1;
        iVar.G0 = -1;
        iVar.H0 = -1;
        iVar.I0 = -1;
        iVar.J0 = 0.5f;
        iVar.K0 = 0.5f;
        iVar.L0 = 0.5f;
        iVar.M0 = 0.5f;
        iVar.N0 = 0.5f;
        iVar.O0 = 0.5f;
        iVar.P0 = 0;
        iVar.Q0 = 0;
        iVar.R0 = 2;
        iVar.S0 = 2;
        iVar.T0 = 0;
        iVar.U0 = -1;
        iVar.V0 = 0;
        iVar.W0 = new ArrayList();
        iVar.X0 = null;
        iVar.Y0 = null;
        iVar.Z0 = null;
        iVar.f97b1 = 0;
        this.G = iVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.f3645b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == 0) {
                    this.G.V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar = this.G;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar.f98s0 = dimensionPixelSize;
                    gVar.f99t0 = dimensionPixelSize;
                    gVar.f100u0 = dimensionPixelSize;
                    gVar.f101v0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar2 = this.G;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f100u0 = dimensionPixelSize2;
                    gVar2.f102w0 = dimensionPixelSize2;
                    gVar2.f103x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.G.f101v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.G.f102w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.G.f98s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.G.f103x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.G.f99t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.G.T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.G.D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.G.E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.G.F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.G.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.G.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.G.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.G.J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.G.L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.G.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.G.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.G.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.G.K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.G.R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.G.S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.G.P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.G.Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.G.U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.A = this.G;
        i();
    }

    @Override // d0.c
    public final void h(d dVar, boolean z10) {
        g gVar = this.G;
        int i6 = gVar.f100u0;
        if (i6 <= 0 && gVar.f101v0 <= 0) {
            return;
        }
        if (z10) {
            gVar.f102w0 = gVar.f101v0;
            gVar.f103x0 = i6;
        } else {
            gVar.f102w0 = i6;
            gVar.f103x0 = gVar.f101v0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0750  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:267:0x0496 -> B:212:0x03db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:268:0x0498 -> B:212:0x03db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:270:0x049e -> B:212:0x03db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:271:0x04a0 -> B:212:0x03db). Please report as a decompilation issue!!! */
    @Override // d0.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(a0.g r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 1892
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.j(a0.g, int, int):void");
    }

    @Override // d0.c, android.view.View
    public final void onMeasure(int i6, int i10) {
        j(this.G, i6, i10);
    }

    public void setFirstHorizontalBias(float f3) {
        this.G.L0 = f3;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i6) {
        this.G.F0 = i6;
        requestLayout();
    }

    public void setFirstVerticalBias(float f3) {
        this.G.M0 = f3;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i6) {
        this.G.G0 = i6;
        requestLayout();
    }

    public void setHorizontalAlign(int i6) {
        this.G.R0 = i6;
        requestLayout();
    }

    public void setHorizontalBias(float f3) {
        this.G.J0 = f3;
        requestLayout();
    }

    public void setHorizontalGap(int i6) {
        this.G.P0 = i6;
        requestLayout();
    }

    public void setHorizontalStyle(int i6) {
        this.G.D0 = i6;
        requestLayout();
    }

    public void setLastHorizontalBias(float f3) {
        this.G.N0 = f3;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i6) {
        this.G.H0 = i6;
        requestLayout();
    }

    public void setLastVerticalBias(float f3) {
        this.G.O0 = f3;
        requestLayout();
    }

    public void setLastVerticalStyle(int i6) {
        this.G.I0 = i6;
        requestLayout();
    }

    public void setMaxElementsWrap(int i6) {
        this.G.U0 = i6;
        requestLayout();
    }

    public void setOrientation(int i6) {
        this.G.V0 = i6;
        requestLayout();
    }

    public void setPadding(int i6) {
        g gVar = this.G;
        gVar.f98s0 = i6;
        gVar.f99t0 = i6;
        gVar.f100u0 = i6;
        gVar.f101v0 = i6;
        requestLayout();
    }

    public void setPaddingBottom(int i6) {
        this.G.f99t0 = i6;
        requestLayout();
    }

    public void setPaddingLeft(int i6) {
        this.G.f102w0 = i6;
        requestLayout();
    }

    public void setPaddingRight(int i6) {
        this.G.f103x0 = i6;
        requestLayout();
    }

    public void setPaddingTop(int i6) {
        this.G.f98s0 = i6;
        requestLayout();
    }

    public void setVerticalAlign(int i6) {
        this.G.S0 = i6;
        requestLayout();
    }

    public void setVerticalBias(float f3) {
        this.G.K0 = f3;
        requestLayout();
    }

    public void setVerticalGap(int i6) {
        this.G.Q0 = i6;
        requestLayout();
    }

    public void setVerticalStyle(int i6) {
        this.G.E0 = i6;
        requestLayout();
    }

    public void setWrapMode(int i6) {
        this.G.T0 = i6;
        requestLayout();
    }
}

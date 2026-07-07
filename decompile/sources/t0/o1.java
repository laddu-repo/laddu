package t0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class o1 extends n1 {
    public o1(w1 w1Var, WindowInsets windowInsets) {
        super(w1Var, windowInsets);
    }

    @Override // t0.t1
    public w1 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f12378c.consumeDisplayCutout();
        return w1.h(null, consumeDisplayCutout);
    }

    @Override // t0.t1
    public i e() {
        DisplayCutout displayCutout;
        displayCutout = this.f12378c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new i(displayCutout);
    }

    @Override // t0.m1, t0.t1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        if (Objects.equals(this.f12378c, o1Var.f12378c) && Objects.equals(this.f12382g, o1Var.f12382g) && m1.y(this.f12383h, o1Var.f12383h)) {
            return true;
        }
        return false;
    }

    @Override // t0.t1
    public int hashCode() {
        return this.f12378c.hashCode();
    }
}

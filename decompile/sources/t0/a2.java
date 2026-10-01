package t0;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.google.protobuf.CodedOutputStream;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class a2 extends a8.d {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsetsController f12319a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.a2 f12320b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f12321c;

    public a2(Window window, a2.a2 a2Var) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f12319a = insetsController;
        this.f12320b = a2Var;
        this.f12321c = window;
    }

    @Override // a8.d
    public final void f() {
        this.f12319a.hide(519);
    }

    @Override // a8.d
    public final void i(boolean z10) {
        Window window = this.f12321c;
        if (z10) {
            if (window != null) {
                p(16);
            }
            this.f12319a.setSystemBarsAppearance(16, 16);
        } else {
            if (window != null) {
                q(16);
            }
            this.f12319a.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // a8.d
    public final void j(boolean z10) {
        Window window = this.f12321c;
        if (z10) {
            if (window != null) {
                p(8192);
            }
            this.f12319a.setSystemBarsAppearance(8, 8);
        } else {
            if (window != null) {
                q(8192);
            }
            this.f12319a.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // a8.d
    public void k() {
        Window window = this.f12321c;
        if (window == null) {
            this.f12319a.setSystemBarsBehavior(2);
            return;
        }
        window.getDecorView().setTag(356039078, 2);
        q(2048);
        p(CodedOutputStream.DEFAULT_BUFFER_SIZE);
    }

    @Override // a8.d
    public final void l(int i6) {
        if ((i6 & 8) != 0) {
            ((u5.r) this.f12320b.f162y).C();
        }
        this.f12319a.show(i6 & (-9));
    }

    public final void p(int i6) {
        View decorView = this.f12321c.getDecorView();
        decorView.setSystemUiVisibility(i6 | decorView.getSystemUiVisibility());
    }

    public final void q(int i6) {
        View decorView = this.f12321c.getDecorView();
        decorView.setSystemUiVisibility((~i6) & decorView.getSystemUiVisibility());
    }
}

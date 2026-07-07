package t0;

import android.view.View;
import android.view.Window;
import com.google.protobuf.CodedOutputStream;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class x1 extends a8.d {

    /* renamed from: a, reason: collision with root package name */
    public final Window f12424a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.a2 f12425b;

    public x1(Window window, a2.a2 a2Var) {
        this.f12424a = window;
        this.f12425b = a2Var;
    }

    @Override // a8.d
    public final void f() {
        for (int i6 = 1; i6 <= 512; i6 <<= 1) {
            if ((519 & i6) != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 == 8) {
                            ((u5.r) this.f12425b.f162y).t();
                        }
                    } else {
                        p(2);
                    }
                } else {
                    p(4);
                }
            }
        }
    }

    @Override // a8.d
    public final void k() {
        this.f12424a.getDecorView().setTag(356039078, 2);
        q(2048);
        p(CodedOutputStream.DEFAULT_BUFFER_SIZE);
    }

    @Override // a8.d
    public final void l(int i6) {
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i6 & i10) != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 8) {
                            ((u5.r) this.f12425b.f162y).C();
                        }
                    } else {
                        q(2);
                    }
                } else {
                    q(4);
                    this.f12424a.clearFlags(1024);
                }
            }
        }
    }

    public final void p(int i6) {
        View decorView = this.f12424a.getDecorView();
        decorView.setSystemUiVisibility(i6 | decorView.getSystemUiVisibility());
    }

    public final void q(int i6) {
        View decorView = this.f12424a.getDecorView();
        decorView.setSystemUiVisibility((~i6) & decorView.getSystemUiVisibility());
    }
}

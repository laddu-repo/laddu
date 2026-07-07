package b2;

import android.view.View;
import w4.i1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f1380a;

    /* renamed from: b, reason: collision with root package name */
    public int f1381b;

    public /* synthetic */ j(int i6, int i10) {
        this.f1380a = i6;
        this.f1381b = i10;
    }

    public int a() {
        int i6 = this.f1381b;
        if (i6 != 2) {
            if (i6 != 5) {
                if (i6 != 29) {
                    if (i6 != 42) {
                        if (i6 != 22) {
                            if (i6 != 23) {
                                return 0;
                            }
                            return 15;
                        }
                        return 1073741824;
                    }
                    return 16;
                }
                return 12;
            }
            return 11;
        }
        return 10;
    }

    public void b(i1 i1Var) {
        View view = i1Var.f13897a;
        this.f1380a = view.getLeft();
        this.f1381b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}

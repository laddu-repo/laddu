package w4;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13803a;

    /* renamed from: b, reason: collision with root package name */
    public int f13804b;

    /* renamed from: c, reason: collision with root package name */
    public int f13805c;

    /* renamed from: d, reason: collision with root package name */
    public int f13806d;

    /* renamed from: e, reason: collision with root package name */
    public int f13807e;

    /* renamed from: f, reason: collision with root package name */
    public int f13808f;

    /* renamed from: g, reason: collision with root package name */
    public int f13809g;

    /* renamed from: h, reason: collision with root package name */
    public int f13810h;

    /* renamed from: i, reason: collision with root package name */
    public int f13811i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public List f13812k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13813l;

    public final void a(View view) {
        int c10;
        int size = this.f13812k.size();
        View view2 = null;
        int i6 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            View view3 = ((i1) this.f13812k.get(i10)).f13897a;
            t0 t0Var = (t0) view3.getLayoutParams();
            if (view3 != view && !t0Var.f14020a.i() && (c10 = (t0Var.f14020a.c() - this.f13806d) * this.f13807e) >= 0 && c10 < i6) {
                view2 = view3;
                if (c10 == 0) {
                    break;
                } else {
                    i6 = c10;
                }
            }
        }
        if (view2 == null) {
            this.f13806d = -1;
        } else {
            this.f13806d = ((t0) view2.getLayoutParams()).f14020a.c();
        }
    }

    public final View b(y0 y0Var) {
        List list = this.f13812k;
        if (list != null) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                View view = ((i1) this.f13812k.get(i6)).f13897a;
                t0 t0Var = (t0) view.getLayoutParams();
                if (!t0Var.f14020a.i() && this.f13806d == t0Var.f14020a.c()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View d10 = y0Var.d(this.f13806d);
        this.f13806d += this.f13807e;
        return d10;
    }
}

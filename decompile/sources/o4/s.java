package o4;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9853e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9855h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9856j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f9857k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9858l;

    public final void a(View view) {
        int iB;
        int size = this.f9857k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            View view3 = ((z0) this.f9857k.get(i10)).f9910a;
            k0 k0Var = (k0) view3.getLayoutParams();
            if (view3 != view && !k0Var.f9800a.h() && (iB = (k0Var.f9800a.b() - this.f9852d) * this.f9853e) >= 0 && iB < i) {
                view2 = view3;
                if (iB == 0) {
                    break;
                } else {
                    i = iB;
                }
            }
        }
        if (view2 == null) {
            this.f9852d = -1;
        } else {
            this.f9852d = ((k0) view2.getLayoutParams()).f9800a.b();
        }
    }

    public final View b(p0 p0Var) {
        List list = this.f9857k;
        if (list == null) {
            View viewD = p0Var.d(this.f9852d);
            this.f9852d += this.f9853e;
            return viewD;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((z0) this.f9857k.get(i)).f9910a;
            k0 k0Var = (k0) view.getLayoutParams();
            if (!k0Var.f9800a.h() && this.f9852d == k0Var.f9800a.b()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}

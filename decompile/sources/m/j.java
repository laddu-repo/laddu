package m;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import t0.q0;
import t0.r0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f8414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r0 f8415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8416e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f8413b = -1;
    public final i f = new i(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8412a = new ArrayList();

    public final void a() {
        if (this.f8416e) {
            ArrayList arrayList = this.f8412a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((q0) obj).b();
            }
            this.f8416e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f8416e) {
            return;
        }
        ArrayList arrayList = this.f8412a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            q0 q0Var = (q0) obj;
            long j8 = this.f8413b;
            if (j8 >= 0) {
                q0Var.c(j8);
            }
            Interpolator interpolator = this.f8414c;
            if (interpolator != null && (view = (View) q0Var.f11872a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f8415d != null) {
                q0Var.d(this.f);
            }
            View view2 = (View) q0Var.f11872a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f8416e = true;
    }
}

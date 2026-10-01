package n;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import t0.u0;
import t0.v0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f8940c;

    /* renamed from: d, reason: collision with root package name */
    public v0 f8941d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8942e;

    /* renamed from: b, reason: collision with root package name */
    public long f8939b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final i f8943f = new i(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f8938a = new ArrayList();

    public final void a() {
        if (!this.f8942e) {
            return;
        }
        ArrayList arrayList = this.f8938a;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            ((u0) obj).b();
        }
        this.f8942e = false;
    }

    public final void b() {
        View view;
        if (this.f8942e) {
            return;
        }
        ArrayList arrayList = this.f8938a;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            u0 u0Var = (u0) obj;
            long j = this.f8939b;
            if (j >= 0) {
                u0Var.c(j);
            }
            Interpolator interpolator = this.f8940c;
            if (interpolator != null && (view = (View) u0Var.f12414a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f8941d != null) {
                u0Var.d(this.f8943f);
            }
            View view2 = (View) u0Var.f12414a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f8942e = true;
    }
}

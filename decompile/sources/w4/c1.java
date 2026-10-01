package w4;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public int f13838a;

    /* renamed from: b, reason: collision with root package name */
    public int f13839b;

    /* renamed from: c, reason: collision with root package name */
    public int f13840c;

    /* renamed from: d, reason: collision with root package name */
    public int f13841d;

    /* renamed from: e, reason: collision with root package name */
    public Interpolator f13842e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13843f;

    /* renamed from: g, reason: collision with root package name */
    public int f13844g;

    public final void a(RecyclerView recyclerView) {
        int i6 = this.f13841d;
        if (i6 >= 0) {
            this.f13841d = -1;
            recyclerView.N(i6);
            this.f13843f = false;
            return;
        }
        if (this.f13843f) {
            Interpolator interpolator = this.f13842e;
            if (interpolator != null && this.f13840c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i10 = this.f13840c;
            if (i10 >= 1) {
                recyclerView.A0.c(this.f13838a, this.f13839b, i10, interpolator);
                int i11 = this.f13844g + 1;
                this.f13844g = i11;
                if (i11 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f13843f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        this.f13844g = 0;
    }
}

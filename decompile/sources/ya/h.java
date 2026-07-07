package ya;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements s5.e {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f15038a;

    /* renamed from: b, reason: collision with root package name */
    public int f15039b;

    /* renamed from: c, reason: collision with root package name */
    public int f15040c;

    public h(TabLayout tabLayout) {
        this.f15038a = new WeakReference(tabLayout);
    }

    public final void a(int i6, float f3) {
        TabLayout tabLayout = (TabLayout) this.f15038a.get();
        if (tabLayout != null) {
            int i10 = this.f15040c;
            boolean z10 = true;
            if (i10 == 2 && this.f15039b != 1) {
                z10 = false;
            }
            boolean z11 = true;
            if (i10 == 2 && this.f15039b == 0) {
                z11 = false;
            }
            tabLayout.h(i6, f3, z10, z11, false);
        }
    }

    public final void b(int i6) {
        boolean z10;
        g gVar;
        TabLayout tabLayout = (TabLayout) this.f15038a.get();
        if (tabLayout != null && tabLayout.getSelectedTabPosition() != i6 && i6 < tabLayout.getTabCount()) {
            int i10 = this.f15040c;
            if (i10 != 0 && (i10 != 2 || this.f15039b != 0)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (i6 >= 0 && i6 < tabLayout.getTabCount()) {
                gVar = (g) tabLayout.f2767y.get(i6);
            } else {
                gVar = null;
            }
            tabLayout.f(gVar, z10);
        }
    }
}

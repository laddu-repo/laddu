package w4;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public int f13952a;

    /* renamed from: b, reason: collision with root package name */
    public int f13953b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13954c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13955d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13956e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f13957f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f13958g;

    public m1(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f13958g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f13952a = -1;
        this.f13953b = Integer.MIN_VALUE;
        this.f13954c = false;
        this.f13955d = false;
        this.f13956e = false;
        int[] iArr = this.f13957f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}

package w4;

import android.database.Observable;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: x, reason: collision with root package name */
    public final l0 f13929x = new Observable();

    /* renamed from: y, reason: collision with root package name */
    public boolean f13930y = false;

    /* renamed from: z, reason: collision with root package name */
    public final int f13931z = 1;

    public abstract int a();

    public long b(int i6) {
        return -1L;
    }

    public int c(int i6) {
        return 0;
    }

    public abstract void d(i1 i1Var, int i6);

    public void e(i1 i1Var, int i6, List list) {
        d(i1Var, i6);
    }

    public abstract i1 f(ViewGroup viewGroup, int i6);

    public void g(i1 i1Var) {
    }
}

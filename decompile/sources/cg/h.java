package cg;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.Map;
import java.util.WeakHashMap;
import t0.h0;
import t0.q0;
import w4.n;
import w4.v;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements Comparator {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ h f2120y = new h(7);

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2121x;

    public /* synthetic */ h(int i6) {
        this.f2121x = i6;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        switch (this.f2121x) {
            case 0:
                return a8.g.d(((g) obj).f2104a, ((g) obj2).f2104a);
            case 1:
                return a8.g.d((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 2:
                return a8.g.d((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 3:
                return a8.g.d(((d5.e) obj).f3801a, ((d5.e) obj2).f3801a);
            case 4:
                return a8.g.d(((d5.g) obj).f3813a, ((d5.g) obj2).f3813a);
            case 5:
                WeakHashMap weakHashMap = q0.f12397a;
                float g10 = h0.g((View) obj);
                float g11 = h0.g((View) obj2);
                if (g10 > g11) {
                    return -1;
                }
                if (g10 < g11) {
                    return 1;
                }
                return 0;
            case 6:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 7:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
            case 8:
                return ((s5.c) obj).f12188b - ((s5.c) obj2).f12188b;
            case 9:
                return ((n) obj).f13959a - ((n) obj2).f13959a;
            case 10:
                v vVar = (v) obj;
                v vVar2 = (v) obj2;
                RecyclerView recyclerView = vVar.f14051d;
                if (recyclerView == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (vVar2.f14051d == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 != z11) {
                    if (recyclerView == null) {
                        return 1;
                    }
                } else {
                    boolean z12 = vVar.f14048a;
                    if (z12 != vVar2.f14048a) {
                        if (!z12) {
                            return 1;
                        }
                    } else {
                        int i6 = vVar2.f14049b - vVar.f14049b;
                        if (i6 == 0) {
                            int i10 = vVar.f14050c - vVar2.f14050c;
                            if (i10 == 0) {
                                return 0;
                            }
                            return i10;
                        }
                        return i6;
                    }
                }
                return -1;
            default:
                return ((y.f) obj).f14796y - ((y.f) obj2).f14796y;
        }
    }
}

package w4;

import android.util.SparseArray;
import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f14062a;

    /* renamed from: b, reason: collision with root package name */
    public int f14063b;

    /* renamed from: c, reason: collision with root package name */
    public Set f14064c;

    public final w0 a(int i6) {
        SparseArray sparseArray = this.f14062a;
        w0 w0Var = (w0) sparseArray.get(i6);
        if (w0Var == null) {
            w0 w0Var2 = new w0();
            sparseArray.put(i6, w0Var2);
            return w0Var2;
        }
        return w0Var;
    }
}

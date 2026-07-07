package o3;

import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements s9.a {

    /* renamed from: x, reason: collision with root package name */
    public final List f9872x;

    public f(List list) {
        this.f9872x = list;
    }

    @Override // s9.a
    public /* bridge */ /* synthetic */ Object e(Task task) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f9872x);
        return dg.b.j(arrayList);
    }

    public f(ArrayList arrayList) {
        this.f9872x = Collections.unmodifiableList(arrayList);
    }
}

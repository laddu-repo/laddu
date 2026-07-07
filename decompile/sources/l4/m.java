package l4;

import androidx.lifecycle.k1;
import androidx.lifecycle.p1;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m extends k1 {

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f8161b = new LinkedHashMap();

    @Override // androidx.lifecycle.k1
    public final void e() {
        LinkedHashMap linkedHashMap = this.f8161b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((p1) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        int identityHashCode = System.identityHashCode(this);
        a.a.g(16);
        sb2.append(he.a.g(16, identityHashCode & 4294967295L));
        sb2.append("} ViewModelStores (");
        Iterator it = this.f8161b.keySet().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.k.d(sb3, "toString(...)");
        return sb3;
    }
}

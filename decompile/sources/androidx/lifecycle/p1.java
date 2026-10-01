package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f983a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f983a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((k1) it.next()).c();
        }
        linkedHashMap.clear();
    }
}

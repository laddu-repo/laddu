package lc;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f8325a;

    /* renamed from: b, reason: collision with root package name */
    public final c f8326b;

    public b(Set set, c cVar) {
        this.f8325a = b(set);
        this.f8326b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f8323a);
            sb2.append('/');
            sb2.append(aVar.f8324b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        String str = this.f8325a;
        c cVar = this.f8326b;
        synchronized (((HashSet) cVar.f8328x)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) cVar.f8328x);
        }
        if (unmodifiableSet.isEmpty()) {
            return str;
        }
        return str + ' ' + b(cVar.H());
    }
}

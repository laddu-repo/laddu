package w5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import v5.o;
import v5.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends a8.d {

    /* renamed from: f, reason: collision with root package name */
    public static final String f14091f = o.h("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    public final l f14092a;

    /* renamed from: b, reason: collision with root package name */
    public final List f14093b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f14094c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f14095d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f14096e;

    public f(l lVar, List list) {
        this.f14092a = lVar;
        this.f14093b = list;
        this.f14094c = new ArrayList(list.size());
        for (int i6 = 0; i6 < list.size(); i6++) {
            String uuid = ((p) list.get(i6)).f13331a.toString();
            this.f14094c.add(uuid);
            this.f14095d.add(uuid);
        }
    }

    public static HashSet p(f fVar) {
        HashSet hashSet = new HashSet();
        fVar.getClass();
        return hashSet;
    }
}

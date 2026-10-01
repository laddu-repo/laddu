package uf;

import ie.r;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f13105a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13106b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f13107c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f13108d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f13109e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f13110f;

    public a(String serialName) {
        kotlin.jvm.internal.k.e(serialName, "serialName");
        this.f13105a = serialName;
        this.f13106b = new ArrayList();
        this.f13107c = new HashSet();
        this.f13108d = new ArrayList();
        this.f13109e = new ArrayList();
        this.f13110f = new ArrayList();
    }

    public static void a(a aVar, String str, g descriptor) {
        aVar.getClass();
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        if (aVar.f13107c.add(str)) {
            aVar.f13106b.add(str);
            aVar.f13108d.add(descriptor);
            aVar.f13109e.add(r.f6846x);
            aVar.f13110f.add(false);
            return;
        }
        StringBuilder q9 = r4.a.q("Element with name '", str, "' is already registered in ");
        q9.append(aVar.f13105a);
        throw new IllegalArgumentException(q9.toString().toString());
    }
}

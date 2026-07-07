package ng;

import a8.g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.k;
import lg.b;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f9736a = g.j();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f9737b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f9738c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f9739d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f9740e = new ArrayList();

    public final void a(b bVar) {
        jg.a aVar = bVar.f8401a;
        e eVar = aVar.f7484b;
        String mapping = ug.a.a(eVar) + ':' + HttpUrl.FRAGMENT_ENCODE_SET + ':' + aVar.f7483a;
        k.e(mapping, "mapping");
        this.f9738c.put(mapping, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return k.a(this.f9736a, ((a) obj).f9736a);
    }

    public final int hashCode() {
        return this.f9736a.hashCode();
    }
}

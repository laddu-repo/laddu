package e2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f4244a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4245b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4246c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4247d;

    public h(String str, long j, ArrayList arrayList, List list) {
        this.f4244a = str;
        this.f4245b = j;
        this.f4246c = Collections.unmodifiableList(arrayList);
        this.f4247d = Collections.unmodifiableList(list);
    }
}

package e2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f4204a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4205b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4206c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4207d;

    /* renamed from: e, reason: collision with root package name */
    public final List f4208e;

    /* renamed from: f, reason: collision with root package name */
    public final List f4209f;

    public a(long j, int i6, ArrayList arrayList, List list, List list2, List list3) {
        this.f4204a = j;
        this.f4205b = i6;
        this.f4206c = Collections.unmodifiableList(arrayList);
        this.f4207d = Collections.unmodifiableList(list);
        this.f4208e = Collections.unmodifiableList(list2);
        this.f4209f = Collections.unmodifiableList(list3);
    }
}

package h2;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class p implements l2.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5947a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5948b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5949c;

    public p(String str, List list, boolean z10) {
        this.f5947a = str;
        this.f5948b = Collections.unmodifiableList(list);
        this.f5949c = z10;
    }
}

package o1;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends c {
    public e(c initialExtras) {
        k.e(initialExtras, "initialExtras");
        LinkedHashMap initialExtras2 = initialExtras.f9848a;
        k.e(initialExtras2, "initialExtras");
        this.f9848a.putAll(initialExtras2);
    }

    @Override // o1.c
    public final Object a(b bVar) {
        return this.f9848a.get(bVar);
    }

    public /* synthetic */ e(int i6) {
        this(a.f9847b);
    }
}

package le;

import java.io.Serializable;
import kotlin.jvm.internal.k;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i implements h, Serializable {

    /* renamed from: x, reason: collision with root package name */
    public static final i f8353x = new Object();

    @Override // le.h
    public final f get(g key) {
        k.e(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // le.h
    public final h minusKey(g key) {
        k.e(key, "key");
        return this;
    }

    @Override // le.h
    public final h plus(h context) {
        k.e(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // le.h
    public final Object fold(Object obj, p pVar) {
        return obj;
    }
}

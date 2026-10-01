package qb;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m implements bc.a {

    /* renamed from: a, reason: collision with root package name */
    public volatile Set f11177a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Set f11178b;

    public final synchronized void a() {
        try {
            Iterator it = this.f11177a.iterator();
            while (it.hasNext()) {
                this.f11178b.add(((bc.a) it.next()).get());
            }
            this.f11177a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // bc.a
    public final Object get() {
        if (this.f11178b == null) {
            synchronized (this) {
                try {
                    if (this.f11178b == null) {
                        this.f11178b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f11178b);
    }
}

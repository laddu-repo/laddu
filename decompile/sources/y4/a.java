package y4;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import o5.e0;
import y1.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f14981c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f14982d = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f14983a;

    /* renamed from: b, reason: collision with root package name */
    public final c f14984b;

    public a(String str, boolean z10) {
        ReentrantLock reentrantLock;
        c cVar;
        synchronized (f14981c) {
            try {
                LinkedHashMap linkedHashMap = f14982d;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    linkedHashMap.put(str, obj);
                }
                reentrantLock = (ReentrantLock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f14983a = reentrantLock;
        if (z10) {
            cVar = new c(str);
        } else {
            cVar = null;
        }
        this.f14984b = cVar;
    }
}

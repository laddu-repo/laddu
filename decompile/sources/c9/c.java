package c9;

import android.content.Context;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f1990b;

    /* renamed from: a, reason: collision with root package name */
    public b f1991a;

    /* JADX WARN: Type inference failed for: r0v0, types: [c9.c, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.f1991a = null;
        f1990b = obj;
    }

    public static b a(Context context) {
        b bVar;
        c cVar = f1990b;
        synchronized (cVar) {
            try {
                if (cVar.f1991a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f1991a = new b(context, 0);
                }
                bVar = cVar.f1991a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}

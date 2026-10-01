package l6;

import android.content.Context;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f8219a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static k f8220b;

    public static final f a(Context context) {
        k kVar = f8220b;
        if (kVar == null) {
            synchronized (f8219a) {
                k kVar2 = f8220b;
                if (kVar2 != null) {
                    return kVar2;
                }
                context.getApplicationContext();
                k a10 = new e(context).a();
                f8220b = a10;
                return a10;
            }
        }
        return kVar;
    }

    public static final synchronized void b(k kVar) {
        synchronized (a.class) {
            f8220b = kVar;
        }
    }
}

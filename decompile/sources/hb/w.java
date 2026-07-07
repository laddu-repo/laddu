package hb;

import java.util.logging.Logger;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6038a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final String f6039b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Logger f6040c;

    public w(Class cls) {
        this.f6039b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f6040c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f6038a) {
            try {
                Logger logger2 = this.f6040c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f6039b);
                this.f6040c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

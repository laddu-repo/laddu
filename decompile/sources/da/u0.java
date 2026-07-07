package da;

import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f4457c;

    public u0(Class cls) {
        this.f4456b = new Object();
        this.f4455a = cls.getName();
    }

    public Logger a() {
        Logger logger = (Logger) this.f4457c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f4456b) {
            try {
                Logger logger2 = (Logger) this.f4457c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f4455a);
                this.f4457c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public u0(String str, s5.d dVar, ce.l lVar, me.v vVar) {
        de.i.e(str, "name");
        this.f4455a = str;
        this.f4456b = new Object();
    }
}

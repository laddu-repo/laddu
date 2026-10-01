package z7;

import android.content.Context;
import androidx.emoji2.text.p;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f14824b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f14825a;

    static {
        c cVar = new c();
        cVar.f14825a = null;
        f14824b = cVar;
    }

    public static p a(Context context) {
        p pVar;
        c cVar = f14824b;
        synchronized (cVar) {
            try {
                if (cVar.f14825a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f14825a = new p(context, 2);
                }
                pVar = cVar.f14825a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVar;
    }
}

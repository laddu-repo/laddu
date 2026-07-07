package androidx.emoji2.text;

import a7.c;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.f0;
import androidx.lifecycle.y;
import e1.g;
import e1.k;
import e1.m;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import k5.a;
import k5.b;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    public final void a(Context context) {
        Object obj;
        a c10 = a.c(context);
        c10.getClass();
        synchronized (a.f7731e) {
            try {
                obj = c10.f7732a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c10.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        y lifecycle = ((f0) obj).getLifecycle();
        lifecycle.a(new c(this, lifecycle));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e1.g, e1.s] */
    @Override // k5.b
    public final Object create(Context context) {
        ?? gVar = new g(new m(context, 0));
        gVar.f4157a = 1;
        if (k.f4160k == null) {
            synchronized (k.j) {
                try {
                    if (k.f4160k == null) {
                        k.f4160k = new k(gVar);
                    }
                } finally {
                }
            }
        }
        a(context);
        return Boolean.TRUE;
    }

    @Override // k5.b
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}

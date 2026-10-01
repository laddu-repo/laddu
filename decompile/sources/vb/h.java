package vb;

import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h implements s7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f13578a = new AtomicReference();

    @Override // s7.b
    public final void a(boolean z2) {
        Random random = i.f13579j;
        synchronized (i.class) {
            Iterator it = i.f13580k.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).b(z2);
            }
        }
    }
}

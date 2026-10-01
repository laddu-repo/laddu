package s7;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11535a;

    public o(int i) {
        this.f11535a = i;
    }

    public static Status h(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract q7.d[] a(j jVar);

    public abstract boolean b(j jVar);

    public abstract int c(j jVar);

    public abstract void d(Status status);

    public abstract void e(Exception exc);

    public abstract void f(p2.c cVar, boolean z2);

    public abstract void g(j jVar);
}

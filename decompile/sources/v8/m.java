package v8;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f13465a;

    public m(int i6) {
        this.f13465a = i6;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(j jVar);

    public abstract t8.d[] b(j jVar);

    public abstract void c(Status status);

    public abstract void d(Exception exc);

    public abstract void e(j jVar);

    public abstract void f(s8.l lVar, boolean z10);
}

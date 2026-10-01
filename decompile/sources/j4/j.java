package j4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends ResultReceiver {

    /* renamed from: x, reason: collision with root package name */
    public final WeakReference f7177x;

    public j(l lVar) {
        super(null);
        this.f7177x = new WeakReference(lVar);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [j4.g, java.lang.Object] */
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i6, Bundle bundle) {
        h hVar;
        l lVar = (l) this.f7177x.get();
        if (lVar != null && bundle != null) {
            synchronized (lVar.f7187b) {
                a0 a0Var = lVar.f7190e;
                IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                int i10 = t.f7206f;
                if (binder == null) {
                    hVar = null;
                } else {
                    IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof h)) {
                        hVar = (h) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.f7168e = binder;
                        hVar = obj;
                    }
                }
                a0Var.b(hVar);
                lVar.f7190e.c(cf.m.v(bundle));
                lVar.a();
            }
        }
    }
}

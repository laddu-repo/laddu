package j4;

import android.os.Binder;
import android.os.IBinder;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t extends Binder implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f7206f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f7207e;

    public t(u uVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.f7207e = new WeakReference(uVar);
    }

    public final void a(f fVar) {
        u uVar = (u) this.f7207e.get();
        if (uVar != null && fVar != null) {
            uVar.f7213f.register(fVar, new d0("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
            synchronized (uVar.f7211d) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x024a  */
    /* JADX WARN: Type inference failed for: r7v2, types: [j4.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [j4.e, java.lang.Object] */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTransact(int r33, android.os.Parcel r34, android.os.Parcel r35, int r36) {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.t.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}

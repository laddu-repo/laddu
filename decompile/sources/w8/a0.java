package w8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a0 extends g9.a {

    /* renamed from: f, reason: collision with root package name */
    public f f14148f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14149g;

    public a0(f fVar, int i6) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f14148f = fVar;
        this.f14149g = i6;
    }

    @Override // g9.a
    public final boolean J(int i6, Parcel parcel, Parcel parcel2) {
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                e0 e0Var = (e0) i9.a.a(parcel, e0.CREATOR);
                i9.a.b(parcel);
                f fVar = this.f14148f;
                x.h(fVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                x.g(e0Var);
                fVar.f14179v = e0Var;
                Bundle bundle = e0Var.f14156x;
                x.h(this.f14148f, "onPostInitComplete can be called only once per call to getRemoteService");
                f fVar2 = this.f14148f;
                int i10 = this.f14149g;
                fVar2.getClass();
                c0 c0Var = new c0(fVar2, readInt, readStrongBinder, bundle);
                z zVar = fVar2.f14165f;
                zVar.sendMessage(zVar.obtainMessage(1, i10, -1, c0Var));
                this.f14148f = null;
            } else {
                parcel.readInt();
                i9.a.b(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            Bundle bundle2 = (Bundle) i9.a.a(parcel, Bundle.CREATOR);
            i9.a.b(parcel);
            x.h(this.f14148f, "onPostInitComplete can be called only once per call to getRemoteService");
            f fVar3 = this.f14148f;
            int i11 = this.f14149g;
            fVar3.getClass();
            c0 c0Var2 = new c0(fVar3, readInt2, readStrongBinder2, bundle2);
            z zVar2 = fVar3.f14165f;
            zVar2.sendMessage(zVar2.obtainMessage(1, i11, -1, c0Var2));
            this.f14148f = null;
        }
        parcel2.writeNoException();
        return true;
    }
}

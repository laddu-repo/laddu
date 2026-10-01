package w8;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z extends com.google.android.gms.internal.measurement.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f14235a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(f fVar, Looper looper) {
        super(looper, 3);
        this.f14235a = fVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.f14235a.f14180w.get() != message.arg1) {
            int i6 = message.what;
            if (i6 != 2 && i6 != 1 && i6 != 7) {
                return;
            }
            r rVar = (r) message.obj;
            rVar.getClass();
            rVar.d();
            return;
        }
        int i10 = message.what;
        if ((i10 != 1 && i10 != 7 && i10 != 4 && i10 != 5) || this.f14235a.f()) {
            int i11 = message.what;
            PendingIntent pendingIntent = null;
            if (i11 == 4) {
                f fVar = this.f14235a;
                fVar.f14177t = new t8.b(message.arg2);
                if (!fVar.f14178u && !TextUtils.isEmpty(fVar.v()) && !TextUtils.isEmpty(null)) {
                    try {
                        Class.forName(fVar.v());
                        f fVar2 = this.f14235a;
                        if (!fVar2.f14178u) {
                            fVar2.A(3, null);
                            return;
                        }
                    } catch (ClassNotFoundException unused) {
                    }
                }
                f fVar3 = this.f14235a;
                t8.b bVar = fVar3.f14177t;
                if (bVar == null) {
                    bVar = new t8.b(8);
                }
                fVar3.j.a(bVar);
                System.currentTimeMillis();
                return;
            }
            if (i11 == 5) {
                f fVar4 = this.f14235a;
                t8.b bVar2 = fVar4.f14177t;
                if (bVar2 == null) {
                    bVar2 = new t8.b(8);
                }
                fVar4.j.a(bVar2);
                System.currentTimeMillis();
                return;
            }
            if (i11 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj;
                }
                this.f14235a.j.a(new t8.b(message.arg2, pendingIntent));
                System.currentTimeMillis();
                return;
            }
            if (i11 == 6) {
                this.f14235a.A(5, null);
                b bVar3 = this.f14235a.f14173o;
                if (bVar3 != null) {
                    bVar3.d(message.arg2);
                }
                System.currentTimeMillis();
                f.z(this.f14235a, 5, 1, null);
                return;
            }
            if (i11 == 2 && !this.f14235a.i()) {
                r rVar2 = (r) message.obj;
                rVar2.getClass();
                rVar2.d();
                return;
            }
            int i12 = message.what;
            if (i12 != 2 && i12 != 1 && i12 != 7) {
                Log.wtf("GmsClient", h8.c.i(i12, "Don't know how to handle message: "), new Exception());
                return;
            }
            r rVar3 = (r) message.obj;
            synchronized (rVar3) {
                try {
                    bool = rVar3.f14223a;
                    if (rVar3.f14224b) {
                        Log.w("GmsClient", "Callback proxy " + rVar3.toString() + " being reused. This is not safe.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (bool != null) {
                f fVar5 = rVar3.f14228f;
                int i13 = rVar3.f14226d;
                if (i13 == 0) {
                    if (!rVar3.b()) {
                        fVar5.A(1, null);
                        rVar3.a(new t8.b(8, null));
                    }
                } else {
                    fVar5.A(1, null);
                    Bundle bundle = rVar3.f14227e;
                    if (bundle != null) {
                        pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                    }
                    rVar3.a(new t8.b(i13, pendingIntent));
                }
            }
            synchronized (rVar3) {
                rVar3.f14224b = true;
            }
            rVar3.d();
            return;
        }
        r rVar4 = (r) message.obj;
        rVar4.getClass();
        rVar4.d();
    }
}

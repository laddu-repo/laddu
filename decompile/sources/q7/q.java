package q7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import t7.v;
import t7.w;
import t7.x;
import t7.y;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f10929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f10930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile x f10931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f10932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Context f10933e;

    static {
        new l(0, m.K("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
        new l(1, m.K("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
        new l(2, m.K("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new l(3, m.K("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f10929a = new l(4, m.K("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f10930b = new l(5, m.K("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        f10932d = new Object();
    }

    public static synchronized void a(Context context) {
        if (f10933e != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f10933e = context.getApplicationContext();
        }
    }

    public static void b() {
        x vVar;
        if (f10931c != null) {
            return;
        }
        y.g(f10933e);
        synchronized (f10932d) {
            try {
                if (f10931c == null) {
                    IBinder iBinderB = b8.f.c(f10933e, b8.f.f1580d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = w.f12413e;
                    if (iBinderB == null) {
                        vVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        vVar = iInterfaceQueryLocalInterface instanceof x ? (x) iInterfaceQueryLocalInterface : new v(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 2);
                    }
                    f10931c = vVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static t c(String str, n nVar, boolean z2, boolean z10) {
        try {
            b();
            y.g(f10933e);
            try {
                x xVar = f10931c;
                a8.b bVar = new a8.b(f10933e.getPackageManager());
                v vVar = (v) xVar;
                Parcel parcelF = vVar.f();
                int i = f8.h.f5318a;
                boolean z11 = true;
                parcelF.writeInt(1);
                int iC0 = com.bumptech.glide.d.c0(parcelF, 20293);
                com.bumptech.glide.d.Y(parcelF, 1, str);
                com.bumptech.glide.d.V(parcelF, 2, nVar);
                com.bumptech.glide.d.b0(parcelF, 3, 4);
                parcelF.writeInt(z2 ? 1 : 0);
                com.bumptech.glide.d.b0(parcelF, 4, 4);
                parcelF.writeInt(z10 ? 1 : 0);
                com.bumptech.glide.d.d0(parcelF, iC0);
                f8.h.b(parcelF, bVar);
                Parcel parcelC = vVar.c(parcelF, 5);
                if (parcelC.readInt() == 0) {
                    z11 = false;
                }
                parcelC.recycle();
                return z11 ? t.f10940d : new s(new o(z2, str, nVar));
            } catch (RemoteException e7) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
                return t.c("module call", e7);
            }
        } catch (b8.b e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            return t.c("module init: ".concat(String.valueOf(e10.getMessage())), e10);
        }
    }
}

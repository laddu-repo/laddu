package t8;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import w8.v;
import w8.w;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final n f12660a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f12661b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile w f12662c;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f12663d;

    /* renamed from: e, reason: collision with root package name */
    public static Context f12664e;

    static {
        new n(0, o.K("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new n(1, o.K("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f12660a = new n(2, o.K("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f12661b = new n(3, o.K("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        f12663d = new Object();
    }

    public static synchronized void a(Context context) {
        synchronized (r.class) {
            if (f12664e == null) {
                if (context != null) {
                    f12664e = context.getApplicationContext();
                    return;
                }
                return;
            }
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
    }

    public static u b(String str, p pVar, boolean z10, boolean z11) {
        try {
            c();
            x.g(f12664e);
            try {
                w wVar = f12662c;
                d9.b bVar = new d9.b(f12664e.getPackageManager());
                w8.u uVar = (w8.u) wVar;
                Parcel J = uVar.J();
                int i6 = i9.a.f6708a;
                boolean z12 = true;
                J.writeInt(1);
                int A = a.a.A(J, 20293);
                a.a.w(J, 1, str);
                a.a.u(J, 2, pVar);
                a.a.D(J, 3, 4);
                J.writeInt(z10 ? 1 : 0);
                a.a.D(J, 4, 4);
                J.writeInt(z11 ? 1 : 0);
                a.a.C(J, A);
                i9.a.c(J, bVar);
                Parcel a10 = uVar.a(J, 5);
                if (a10.readInt() == 0) {
                    z12 = false;
                }
                a10.recycle();
                if (z12) {
                    return u.f12669d;
                }
                return new t(new m(z10, str, pVar));
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return new u("module call", false, e10);
            }
        } catch (e9.b e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return new u("module init: ".concat(String.valueOf(e11.getMessage())), false, e11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [w8.w] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static void c() {
        ?? xVar;
        if (f12662c != null) {
            return;
        }
        x.g(f12664e);
        synchronized (f12663d) {
            try {
                if (f12662c == null) {
                    IBinder b10 = e9.e.c(f12664e, e9.e.f4481e, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i6 = v.f14230f;
                    if (b10 == null) {
                        xVar = 0;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        if (queryLocalInterface instanceof w) {
                            xVar = (w) queryLocalInterface;
                        } else {
                            xVar = new com.google.android.gms.internal.measurement.x(b10, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 1);
                        }
                    }
                    f12662c = xVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

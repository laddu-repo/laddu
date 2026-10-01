package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j4 implements hb.r {
    public static j4 B;
    public Object A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2309x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2310y;

    /* renamed from: z, reason: collision with root package name */
    public Object f2311z;

    public j4(int i6) {
        this.f2309x = i6;
        switch (i6) {
            case 1:
                return;
            case 5:
                this.f2311z = new Object();
                return;
            default:
                this.f2310y = false;
                this.f2311z = null;
                this.A = null;
                return;
        }
    }

    public static j4 c(Context context) {
        j4 j4Var;
        j4 j4Var2;
        synchronized (j4.class) {
            try {
                if (B == null) {
                    if (i0.f.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                        j4Var2 = new j4(context);
                    } else {
                        j4Var2 = new j4(0);
                    }
                    B = j4Var2;
                }
                j4 j4Var3 = B;
                if (j4Var3 != null && ((i4) j4Var3.A) != null && !j4Var3.f2310y) {
                    try {
                        context.getContentResolver().registerContentObserver(z3.f2543a, true, (i4) B.A);
                        j4 j4Var4 = B;
                        j4Var4.getClass();
                        j4Var4.f2310y = true;
                    } catch (SecurityException e10) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e10);
                    }
                }
                j4Var = B;
                j4Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return j4Var;
    }

    public static synchronized void g() {
        Context context;
        synchronized (j4.class) {
            try {
                j4 j4Var = B;
                if (j4Var != null && (context = (Context) j4Var.f2311z) != null && ((i4) j4Var.A) != null && j4Var.f2310y) {
                    context.getContentResolver().unregisterContentObserver((i4) B.A);
                }
                B = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(u8.a aVar, s9.h hVar) {
        w4.c cVar = (w4.c) ((u5.r) this.A).f12916y;
        cVar.getClass();
        y8.a aVar2 = (y8.a) ((y8.d) aVar).u();
        w8.n nVar = (w8.n) cVar.f13822a;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(aVar2.f15012f);
        int i6 = g9.b.f5561a;
        if (nVar == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            nVar.writeToParcel(obtain, 0);
        }
        try {
            aVar2.f15011e.transact(1, obtain, null, 1);
            obtain.recycle();
            hVar.a(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public void d(s9.m mVar) {
        synchronized (this.f2311z) {
            try {
                if (((ArrayDeque) this.A) == null) {
                    this.A = new ArrayDeque();
                }
                ((ArrayDeque) this.A).add(mVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0043, code lost:
    
        if (r5.isUserRunning(android.os.Process.myUserHandle()) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String e(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f2311z
            android.content.Context r0 = (android.content.Context) r0
            r1 = 0
            if (r0 == 0) goto L91
            boolean r2 = com.google.android.gms.internal.measurement.e4.a()
            if (r2 == 0) goto L63
            boolean r2 = com.google.android.gms.internal.measurement.e4.f2197b
            r3 = 1
            if (r2 == 0) goto L13
            goto L5e
        L13:
            java.lang.Class<com.google.android.gms.internal.measurement.e4> r2 = com.google.android.gms.internal.measurement.e4.class
            monitor-enter(r2)
            boolean r4 = com.google.android.gms.internal.measurement.e4.f2197b     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L1e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            goto L5e
        L1c:
            r9 = move-exception
            goto L61
        L1e:
            r4 = 1
        L1f:
            r5 = 2
            r6 = 0
            if (r4 > r5) goto L54
            android.os.UserManager r5 = com.google.android.gms.internal.measurement.e4.f2196a     // Catch: java.lang.Throwable -> L1c
            if (r5 != 0) goto L2f
            java.lang.Object r5 = com.google.android.gms.internal.measurement.d4.j(r0)     // Catch: java.lang.Throwable -> L1c
            android.os.UserManager r5 = (android.os.UserManager) r5     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.internal.measurement.e4.f2196a = r5     // Catch: java.lang.Throwable -> L1c
        L2f:
            android.os.UserManager r5 = com.google.android.gms.internal.measurement.e4.f2196a     // Catch: java.lang.Throwable -> L1c
            if (r5 != 0) goto L35
            r6 = 1
            goto L58
        L35:
            boolean r7 = c2.w.y(r5)     // Catch: java.lang.Throwable -> L1c java.lang.NullPointerException -> L47
            if (r7 != 0) goto L45
            android.os.UserHandle r7 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> L1c java.lang.NullPointerException -> L47
            boolean r0 = r5.isUserRunning(r7)     // Catch: java.lang.Throwable -> L1c java.lang.NullPointerException -> L47
            if (r0 != 0) goto L54
        L45:
            r6 = 1
            goto L54
        L47:
            r5 = move-exception
            java.lang.String r6 = "DirectBootUtils"
            java.lang.String r7 = "Failed to check if user is unlocked."
            android.util.Log.w(r6, r7, r5)     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.internal.measurement.e4.f2196a = r1     // Catch: java.lang.Throwable -> L1c
            int r4 = r4 + 1
            goto L1f
        L54:
            if (r6 == 0) goto L58
            com.google.android.gms.internal.measurement.e4.f2196a = r1     // Catch: java.lang.Throwable -> L1c
        L58:
            if (r6 == 0) goto L5c
            com.google.android.gms.internal.measurement.e4.f2197b = r3     // Catch: java.lang.Throwable -> L1c
        L5c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            r3 = r6
        L5e:
            if (r3 != 0) goto L63
            goto L91
        L61:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r9
        L63:
            com.google.android.gms.internal.measurement.t r0 = new com.google.android.gms.internal.measurement.t     // Catch: java.lang.NullPointerException -> L7b java.lang.SecurityException -> L7d java.lang.IllegalStateException -> L7f
            r0.<init>(r8, r9)     // Catch: java.lang.NullPointerException -> L7b java.lang.SecurityException -> L7d java.lang.IllegalStateException -> L7f
            java.lang.Object r0 = r0.a()     // Catch: java.lang.SecurityException -> L6d java.lang.NullPointerException -> L7b java.lang.IllegalStateException -> L7f
            goto L78
        L6d:
            long r2 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.NullPointerException -> L7b java.lang.SecurityException -> L7d java.lang.IllegalStateException -> L7f
            java.lang.Object r0 = r0.a()     // Catch: java.lang.Throwable -> L81
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.NullPointerException -> L7b java.lang.SecurityException -> L7d java.lang.IllegalStateException -> L7f
        L78:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NullPointerException -> L7b java.lang.SecurityException -> L7d java.lang.IllegalStateException -> L7f
            return r0
        L7b:
            r0 = move-exception
            goto L86
        L7d:
            r0 = move-exception
            goto L86
        L7f:
            r0 = move-exception
            goto L86
        L81:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.NullPointerException -> L7b java.lang.SecurityException -> L7d java.lang.IllegalStateException -> L7f
            throw r0     // Catch: java.lang.NullPointerException -> L7b java.lang.SecurityException -> L7d java.lang.IllegalStateException -> L7f
        L86:
            java.lang.String r2 = "Unable to read GServices for: "
            java.lang.String r9 = r2.concat(r9)
            java.lang.String r2 = "GservicesLoader"
            android.util.Log.e(r2, r9, r0)
        L91:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.j4.e(java.lang.String):java.lang.String");
    }

    public void f(Task task) {
        s9.m mVar;
        synchronized (this.f2311z) {
            if (((ArrayDeque) this.A) != null && !this.f2310y) {
                this.f2310y = true;
                while (true) {
                    synchronized (this.f2311z) {
                        try {
                            mVar = (s9.m) ((ArrayDeque) this.A).poll();
                            if (mVar == null) {
                                this.f2310y = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    mVar.a(task);
                }
            }
        }
    }

    @Override // hb.r
    public void onSuccess(Object obj) {
        switch (this.f2309x) {
            case 2:
                i4.b0 b0Var = (i4.b0) this.A;
                i4.s sVar = (i4.s) this.f2311z;
                boolean z10 = this.f2310y;
                lg.c.r(b0Var.f6318t, (i4.t) obj);
                u1.a0.H(b0Var.f6318t);
                if (z10) {
                    b0Var.p(sVar);
                    return;
                }
                return;
            default:
                i4.b0 b0Var2 = ((i4.o0) this.A).f6473g;
                Handler handler = b0Var2.f6311l;
                i4.s sVar2 = (i4.s) this.f2311z;
                u1.a0.U(handler, new a2.c0(b0Var2, sVar2, new a2.h0(this, (i4.t) obj, this.f2310y, sVar2)));
                return;
        }
    }

    @Override // hb.r
    public void w(Throwable th) {
        switch (this.f2309x) {
            case 2:
                i4.b0 b0Var = (i4.b0) this.A;
                if (th instanceof UnsupportedOperationException) {
                    u1.a.q("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
                } else {
                    u1.a.h("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th.getMessage(), th);
                }
                u1.a0.H(b0Var.f6318t);
                if (this.f2310y) {
                    b0Var.p((i4.s) this.f2311z);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public j4(u5.r rVar, t8.d[] dVarArr, boolean z10) {
        this.f2309x = 6;
        this.A = rVar;
        this.f2311z = dVarArr;
        boolean z11 = false;
        if (dVarArr != null && z10) {
            z11 = true;
        }
        this.f2310y = z11;
    }

    public j4(Context context) {
        this.f2309x = 0;
        this.f2310y = false;
        this.f2311z = context;
        this.A = new ContentObserver(null);
    }

    public j4(w1.g gVar) {
        this.f2309x = 4;
        this.f2311z = gVar;
        this.A = new Object();
    }

    public j4(i4.o0 o0Var, i4.s sVar, boolean z10) {
        this.f2309x = 3;
        this.A = o0Var;
        this.f2311z = sVar;
        this.f2310y = z10;
    }

    public j4(i4.b0 b0Var, i4.s sVar, boolean z10, r1.q0 q0Var) {
        this.f2309x = 2;
        this.A = b0Var;
        this.f2311z = sVar;
        this.f2310y = z10;
    }

    private final void b(Throwable th) {
    }
}

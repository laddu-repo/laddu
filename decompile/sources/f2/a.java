package f2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import o5.e0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f4634b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, Looper looper) {
        super(looper);
        this.f4634b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(android.os.Message r8, f2.z r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r8.obj
            f2.b r0 = (f2.b) r0
            boolean r1 = r0.f4636b
            r2 = 0
            if (r1 != 0) goto Lb
            goto L82
        Lb:
            int r1 = r0.f4638d
            r3 = 1
            int r1 = r1 + r3
            r0.f4638d = r1
            f2.d r4 = r7.f4634b
            o5.e0 r4 = r4.f4649i
            r4.getClass()
            r4 = 3
            if (r1 <= r4) goto L1c
            goto L82
        L1c:
            q2.u r1 = new q2.u
            android.os.SystemClock.elapsedRealtime()
            android.os.SystemClock.elapsedRealtime()
            java.lang.Throwable r1 = r9.getCause()
            boolean r1 = r1 instanceof java.io.IOException
            if (r1 == 0) goto L33
            java.lang.Throwable r9 = r9.getCause()
            java.io.IOException r9 = (java.io.IOException) r9
            goto L3d
        L33:
            com.google.android.gms.internal.measurement.e5 r1 = new com.google.android.gms.internal.measurement.e5
            java.lang.Throwable r9 = r9.getCause()
            r1.<init>(r9)
            r9 = r1
        L3d:
            f2.d r1 = r7.f4634b
            o5.e0 r1 = r1.f4649i
            int r0 = r0.f4638d
            r1.getClass()
            boolean r1 = r9 instanceof r1.l0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L7d
            boolean r1 = r9 instanceof java.io.FileNotFoundException
            if (r1 != 0) goto L7d
            boolean r1 = r9 instanceof w1.s
            if (r1 != 0) goto L7d
            boolean r1 = r9 instanceof u2.n
            if (r1 != 0) goto L7d
            int r1 = w1.j.f13537y
        L5d:
            if (r9 == 0) goto L72
            boolean r1 = r9 instanceof w1.j
            if (r1 == 0) goto L6d
            r1 = r9
            w1.j r1 = (w1.j) r1
            int r1 = r1.f13538x
            r6 = 2008(0x7d8, float:2.814E-42)
            if (r1 != r6) goto L6d
            goto L7d
        L6d:
            java.lang.Throwable r9 = r9.getCause()
            goto L5d
        L72:
            int r0 = r0 - r3
            int r0 = r0 * 1000
            r9 = 5000(0x1388, float:7.006E-42)
            int r9 = java.lang.Math.min(r0, r9)
            long r0 = (long) r9
            goto L7e
        L7d:
            r0 = r4
        L7e:
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 != 0) goto L83
        L82:
            return r2
        L83:
            monitor-enter(r7)
            boolean r9 = r7.f4633a     // Catch: java.lang.Throwable -> L91
            if (r9 != 0) goto L93
            android.os.Message r8 = android.os.Message.obtain(r8)     // Catch: java.lang.Throwable -> L91
            r7.sendMessageDelayed(r8, r0)     // Catch: java.lang.Throwable -> L91
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L91
            return r3
        L91:
            r8 = move-exception
            goto L95
        L93:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L91
            return r2
        L95:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L91
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.a.a(android.os.Message, f2.z):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Throwable th;
        b bVar = (b) message.obj;
        try {
            int i6 = message.what;
            if (i6 != 1) {
                if (i6 == 2) {
                    d dVar = this.f4634b;
                    th = dVar.f4650k.d(dVar.f4651l, (r) bVar.f4637c);
                } else {
                    throw new RuntimeException();
                }
            } else {
                th = this.f4634b.f4650k.h((s) bVar.f4637c);
            }
        } catch (z e10) {
            boolean a10 = a(message, e10);
            th = e10;
            if (a10) {
                return;
            }
        } catch (Exception e11) {
            u1.a.q("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
            th = e11;
        }
        e0 e0Var = this.f4634b.f4649i;
        long j = bVar.f4635a;
        e0Var.getClass();
        synchronized (this) {
            try {
                if (!this.f4633a) {
                    this.f4634b.f4653n.obtainMessage(message.what, Pair.create(bVar.f4637c, th)).sendToTarget();
                }
            } finally {
            }
        }
    }
}

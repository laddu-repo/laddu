package i4;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements n0, hb.p, s9.g, o8.b, s9.a, n8.e, u1.g, t2.n {
    public final /* synthetic */ Object A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6389x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f6390y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f6391z;

    public /* synthetic */ h0(o0 o0Var, o1 o1Var, Bundle bundle, ResultReceiver resultReceiver) {
        this.f6389x = 0;
        this.f6390y = o0Var;
        this.f6391z = bundle;
        this.A = resultReceiver;
    }

    @Override // u1.g
    public void accept(Object obj) {
        b2.k kVar = (b2.k) this.f6390y;
        ((q2.i0) obj).w(kVar.f1383y, (q2.c0) this.f6391z, (n2.g) this.A);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.lifecycle.d, java.lang.Object] */
    @Override // n8.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object apply(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 986
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.h0.apply(java.lang.Object):java.lang.Object");
    }

    @Override // s9.g
    public s9.n b(Object obj) {
        String d10;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f6390y;
        String str = (String) this.f6391z;
        ic.t tVar = (ic.t) this.A;
        String str2 = (String) obj;
        k7.c c10 = FirebaseMessaging.c(firebaseMessaging.f2843b);
        jb.g gVar = firebaseMessaging.f2842a;
        gVar.a();
        if ("[DEFAULT]".equals(gVar.f7332b)) {
            d10 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            d10 = gVar.d();
        }
        String a10 = firebaseMessaging.f2850i.a();
        synchronized (c10) {
            String a11 = ic.t.a(str2, a10, System.currentTimeMillis());
            if (a11 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c10.f7745y).edit();
                edit.putString(d10 + "|T|" + str + "|*", a11);
                edit.commit();
            }
        }
        if (tVar == null || !str2.equals(tVar.f6785a)) {
            jb.g gVar2 = firebaseMessaging.f2842a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.f7332b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.a();
                    sb2.append(gVar2.f7332b);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new ic.h(firebaseMessaging.f2843b).b(intent);
            }
        }
        return dg.b.j(str2);
    }

    @Override // t2.n
    public db.c1 d(int i6, r1.e1 e1Var, int[] iArr) {
        t2.k kVar = (t2.k) this.f6390y;
        String str = (String) this.f6391z;
        String str2 = (String) this.A;
        db.h0 j = db.k0.j();
        for (int i10 = 0; i10 < e1Var.f11386a; i10++) {
            j.a(new t2.m(i6, e1Var, i10, kVar, iArr[i10], str, str2));
        }
        return j.g();
    }

    @Override // s9.a
    public Object e(Task task) {
        nc.g gVar;
        URL url;
        switch (this.f6389x) {
            case 5:
                mc.d dVar = (mc.d) this.f6390y;
                Task task2 = (Task) this.f6391z;
                Task task3 = (Task) this.A;
                if (task2.h() && task2.f() != null) {
                    nc.g gVar2 = (nc.g) task2.f();
                    if (task3.h() && (gVar = (nc.g) task3.f()) != null && gVar2.f9619c.equals(gVar.f9619c)) {
                        return dg.b.j(Boolean.FALSE);
                    }
                    return dVar.f8805e.e(gVar2).j(dVar.f8803c, new mc.c(dVar));
                }
                return dg.b.j(Boolean.FALSE);
            default:
                nc.m mVar = (nc.m) this.f6390y;
                Task task4 = (Task) this.f6391z;
                Task task5 = (Task) this.A;
                if (!task4.h()) {
                    return dg.b.i(new jb.i("Firebase Installations failed to get installation auth token for config update listener connection.", task4.e()));
                }
                if (!task5.h()) {
                    return dg.b.i(new jb.i("Firebase Installations failed to get installation ID for config update listener connection.", task5.e()));
                }
                try {
                    try {
                        url = new URL(mVar.c(mVar.f9657n));
                    } catch (MalformedURLException unused) {
                        Log.e("FirebaseRemoteConfig", "URL is malformed");
                        url = null;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    mVar.l(httpURLConnection, (String) task5.f(), ((cc.a) task4.f()).f2019a);
                    return dg.b.j(httpURLConnection);
                } catch (IOException e10) {
                    return dg.b.i(new jb.i("Failed to open HTTP stream connection", e10));
                }
        }
    }

    @Override // o8.b
    public Object execute() {
        l8.a aVar = (l8.a) this.f6390y;
        g8.i iVar = (g8.i) this.f6391z;
        g8.h hVar = (g8.h) this.A;
        n8.g gVar = (n8.g) aVar.f8314d;
        gVar.getClass();
        d8.d dVar = iVar.f5541c;
        String str = hVar.f5533a;
        String str2 = iVar.f5539a;
        String Q = a8.f.Q("SQLiteEventStore");
        if (Log.isLoggable(Q, 3)) {
            Log.d(Q, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) gVar.l(new h0(gVar, hVar, iVar, 7))).getClass();
        aVar.f8311a.B(iVar, 1, false);
        return null;
    }

    @Override // i4.n0
    public void f(s sVar) {
        o0 o0Var = (o0) this.f6390y;
        Bundle bundle = (Bundle) this.f6391z;
        ResultReceiver resultReceiver = (ResultReceiver) this.A;
        b0 b0Var = o0Var.f6473g;
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        hb.u n10 = b0Var.n(sVar);
        if (resultReceiver != null) {
            n10.a(new a2.c0(22, n10, resultReceiver), hb.q.f6029x);
        }
    }

    public /* synthetic */ h0(Object obj, Object obj2, Object obj3, int i6) {
        this.f6389x = i6;
        this.f6390y = obj;
        this.f6391z = obj2;
        this.A = obj3;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [hb.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [hb.x, java.lang.Object] */
    @Override // hb.p, n8.e
    public hb.x apply(Object obj) {
        int i6 = this.f6389x;
        int i10 = 20;
        Object obj2 = this.A;
        Object obj3 = this.f6391z;
        Object obj4 = this.f6390y;
        switch (i6) {
            case 1:
                b0 b0Var = (b0) obj4;
                Handler handler = b0Var.f6311l;
                a2.c0 c0Var = new a2.c0(b0Var, (s) obj3, new a2.e1(b0Var, (u0) obj2, (t) obj, 9));
                s1 s1Var = new s1(0);
                String str = u1.a0.f12750a;
                ?? obj5 = new Object();
                u1.a0.U(handler, new a2.e1((Object) obj5, c0Var, s1Var, i10));
                return obj5;
            default:
                b0 b0Var2 = (b0) obj4;
                s sVar = (s) obj3;
                List list = (List) obj;
                Handler handler2 = b0Var2.f6311l;
                a2.c0 c0Var2 = new a2.c0(b0Var2, sVar, new c2.a0(b0Var2, (f1) obj2, sVar, list, 5));
                s1 s1Var2 = new s1(0);
                String str2 = u1.a0.f12750a;
                ?? obj6 = new Object();
                u1.a0.U(handler2, new a2.e1((Object) obj6, c0Var2, s1Var2, i10));
                return obj6;
        }
    }
}

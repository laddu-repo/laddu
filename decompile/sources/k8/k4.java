package k8;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class k4 implements s4, o.d2, o.w0, n.j, o4.j1, q0.a, q2.d, qa.a, t7.b, s7.g, ef.e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f7607v;

    public k4(int i, boolean z2) {
        switch (i) {
            case 10:
                this.f7607v = new o8.o();
                break;
            case 14:
                this.f7607v = new z(28);
                break;
            case 17:
                this.f7607v = new CopyOnWriteArrayList();
                break;
            case 22:
                this.f7607v = new c6.f0(7);
                break;
            case 25:
                this.f7607v = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.f7607v = new k4(10, false);
                break;
        }
    }

    public boolean A() {
        d1 d1Var = ((p1) this.f7607v).f7696z;
        p1.j(d1Var);
        return d1Var.T.g() > 0;
    }

    @Override // s7.g
    public void accept(Object obj, Object obj2) {
        o8.h hVar = (o8.h) obj2;
        v7.b bVar = (v7.b) ((v7.a) obj).m();
        t7.o oVar = (t7.o) this.f7607v;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(bVar.f);
        int i = d8.a.f4385a;
        parcelObtain.writeInt(1);
        oVar.writeToParcel(parcelObtain, 0);
        try {
            bVar.f2790e.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            hVar.a(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // k8.s4
    public void b(String str, String str2, Bundle bundle) {
        n4 n4Var = (n4) this.f7607v;
        if (!TextUtils.isEmpty(str)) {
            n4Var.d().M(new w1(this, str, str2, bundle));
            return;
        }
        p1 p1Var = n4Var.G;
        if (p1Var != null) {
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.B.b(str2, "AppId not known when logging event");
        }
    }

    @Override // ef.e
    public void c(IOException iOException) {
        ((da.b1) this.f7607v).n(iOException);
    }

    @Override // q0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f7607v;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // t7.b
    public void e(int i) {
        ((r7.g) this.f7607v).e(i);
    }

    @Override // t7.b
    public void f() {
        ((r7.g) this.f7607v).f();
    }

    @Override // q0.a
    public Cursor g(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f7607v;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e7) {
            Log.w("FontsProvider", "Unable to query the content provider", e7);
            return null;
        }
    }

    @Override // o.d2
    public void h(n.l lVar, MenuItem menuItem) {
        ((n.f) this.f7607v).A.removeCallbacksAndMessages(lVar);
    }

    @Override // o4.j1
    public int i() {
        o4.j0 j0Var = (o4.j0) this.f7607v;
        return j0Var.f9775o - j0Var.C();
    }

    @Override // ef.e
    public void j(ef.b0 b0Var) {
        ((da.b1) this.f7607v).m(b0Var);
    }

    @Override // o4.j1
    public int k(View view) {
        return (view.getTop() - ((o4.k0) view.getLayoutParams()).f9801b.top) - ((ViewGroup.MarginLayoutParams) ((o4.k0) view.getLayoutParams())).topMargin;
    }

    @Override // qa.a
    public void l(Bundle bundle) {
        ((ja.c) ((ja.b) this.f7607v)).a("clx", "_ae", bundle);
    }

    @Override // o.d2
    public void n(n.l lVar, n.n nVar) {
        n.f fVar = (n.f) this.f7607v;
        Handler handler = fVar.A;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.C;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (lVar == ((n.e) arrayList.get(i)).f8875b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i10 = i + 1;
        handler.postAtTime(new w1(this, i10 < arrayList.size() ? (n.e) arrayList.get(i10) : null, nVar, lVar, 9, false), lVar, SystemClock.uptimeMillis() + 200);
    }

    public void o(int i, boolean z2) {
        c6.f0 f0Var = (c6.f0) this.f7607v;
        if (z2) {
            f0Var.b(i);
        } else {
            f0Var.getClass();
        }
    }

    public o9.d p(o9.d dVar) {
        return dVar instanceof o9.j ? dVar : new o9.b(-((o9.i) this.f7607v).j(), dVar);
    }

    @Override // n.j
    public boolean q(n.l lVar, MenuItem menuItem) {
        return false;
    }

    @Override // n.j
    public void r(n.l lVar) {
        Toolbar toolbar = (Toolbar) this.f7607v;
        o.j jVar = toolbar.f681v.O;
        if (jVar == null || !jVar.e()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f668e0.f6280x).iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.j0) it.next()).f1037a.s();
            }
        }
        s5.d dVar = toolbar.f676m0;
        if (dVar != null) {
            dVar.r(lVar);
        }
    }

    public synchronized void s() {
        ((SharedPreferences) this.f7607v).edit().clear().commit();
    }

    @Override // o4.j1
    public View t(int i) {
        return ((o4.j0) this.f7607v).u(i);
    }

    public void u(Set set) {
        Object objO;
        int[] iArr;
        de.i.e(set, "tableIds");
        if (set.isEmpty()) {
            return;
        }
        pe.x xVar = (pe.x) this.f7607v;
        do {
            objO = xVar.O();
            int[] iArr2 = (int[]) objO;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = set.contains(Integer.valueOf(i)) ? iArr2[i] + 1 : iArr2[i];
            }
            re.t tVar = qe.b.f11014b;
            if (objO == null) {
                objO = tVar;
            }
        } while (!xVar.P(objO, iArr));
    }

    @Override // o4.j1
    public int v() {
        return ((o4.j0) this.f7607v).F();
    }

    public void w(ab.f fVar, Thread thread, Throwable th) {
        sa.l lVar = (sa.l) this.f7607v;
        synchronized (lVar) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            p4.v.D();
            try {
                sa.w.a(lVar.f11633e.f12520a.b(new sa.j(lVar, System.currentTimeMillis(), th, thread, fVar)));
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e7) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e7);
            }
        }
    }

    @Override // o4.j1
    public int x(View view) {
        return view.getBottom() + ((o4.k0) view.getLayoutParams()).f9801b.bottom + ((ViewGroup.MarginLayoutParams) ((o4.k0) view.getLayoutParams())).bottomMargin;
    }

    public void y(String str, Bundle bundle) {
        String string;
        p1 p1Var = (p1) this.f7607v;
        n1 n1Var = p1Var.B;
        d1 d1Var = p1Var.f7696z;
        p1.l(n1Var);
        n1Var.D();
        if (p1Var.b()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        p1.j(d1Var);
        d1Var.S.t(string);
        c2.v1 v1Var = d1Var.T;
        p1Var.F.getClass();
        v1Var.h(System.currentTimeMillis());
    }

    public boolean z() {
        if (!A()) {
            return false;
        }
        p1 p1Var = (p1) this.f7607v;
        p1Var.F.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        d1 d1Var = p1Var.f7696z;
        p1.j(d1Var);
        return jCurrentTimeMillis - d1Var.T.g() > p1Var.f7695y.L(null, f0.f7503j0);
    }

    public /* synthetic */ k4(Object obj) {
        this.f7607v = obj;
    }

    public k4(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            t0.v vVar = new t0.v(20, view);
            vVar.f11888x = view;
            this.f7607v = vVar;
            return;
        }
        this.f7607v = new g2(20, view);
    }

    public k4(Context context) {
        boolean zIsEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f7607v = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                s();
            }
        } catch (IOException e7) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e7.getMessage());
            }
        }
    }

    public k4(Context context, GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        this.f7607v = new GestureDetector(context, simpleOnGestureListener, null);
    }

    @Override // o.w0
    public void a(int i) {
    }

    @Override // o.w0
    public void d(int i) {
    }

    @Override // o.w0
    public void m(int i, float f) {
    }
}

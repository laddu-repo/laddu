package oa;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.g;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import k8.g2;
import k8.k2;
import k8.k4;
import o9.f;
import pa.d;
import sa.n;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ra.a, qa.a, mb.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f10081v;

    public /* synthetic */ a(g gVar) {
        this.f10081v = gVar;
    }

    @Override // mb.a
    public void f(mb.b bVar) {
        g gVar = this.f10081v;
        d dVar = d.f10448a;
        dVar.b("AnalyticsConnector now available.");
        ja.b bVar2 = (ja.b) bVar.get();
        k4 k4Var = new k4(bVar2);
        k2 k2Var = new k2(29, false);
        ja.c cVar = (ja.c) bVar2;
        f fVarB = cVar.b("clx", k2Var);
        if (fVarB == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            fVarB = cVar.b("crash", k2Var);
            if (fVarB != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
        }
        if (fVarB == null) {
            dVar.f("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        dVar.b("Registered Firebase Analytics listener.");
        g2 g2Var = new g2(15, false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        hd.a aVar = new hd.a(k4Var);
        synchronized (gVar) {
            try {
                ArrayList arrayList = (ArrayList) gVar.f904c;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    g2Var.w((n) obj);
                }
                k2Var.f7603x = g2Var;
                k2Var.f7602w = aVar;
                gVar.f903b = g2Var;
                gVar.f902a = aVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // qa.a
    public void l(Bundle bundle) {
        ((qa.a) this.f10081v.f902a).l(bundle);
    }

    @Override // ra.a
    public void w(n nVar) {
        g gVar = this.f10081v;
        synchronized (gVar) {
            try {
                if (((ra.a) gVar.f903b) instanceof ra.b) {
                    ((ArrayList) gVar.f904c).add(nVar);
                }
                ((ra.a) gVar.f903b).w(nVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

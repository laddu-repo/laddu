package ed;

import ac.g0;
import android.os.Handler;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f4888e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Serializable f4889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f4890h;

    public g(zc.c cVar, jd.k kVar, Handler handler, a aVar, ab.a aVar2, ab.f fVar, ad.g gVar) {
        de.i.e(handler, "uiHandler");
        de.i.e(aVar, "fetchHandler");
        de.i.e(aVar2, "logger");
        this.f4884a = kVar;
        this.f4885b = handler;
        this.f4886c = aVar;
        this.f4887d = aVar2;
        this.f4888e = fVar;
        this.f = new Object();
        this.f4889g = new LinkedHashSet();
        c cVar2 = new c(this);
        this.f4890h = cVar2;
        kVar.d(new g0(5, this));
        synchronized (kVar.f7094a) {
            if (!kVar.f7095b) {
                kVar.f7097d.postDelayed(cVar2, 300000L);
            }
        }
    }

    public void a() {
        synchronized (this.f) {
        }
    }

    public void b() {
        jd.k kVar = (jd.k) this.f4884a;
        c cVar = (c) this.f4890h;
        de.i.e(cVar, "runnable");
        synchronized (kVar.f7094a) {
            if (!kVar.f7095b) {
                kVar.f7097d.postDelayed(cVar, 300000L);
            }
        }
    }

    public g(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, p2.c cVar) {
        this.f4884a = str;
        this.f4885b = str2;
        this.f4886c = arrayList;
        this.f4887d = str3;
        this.f4888e = str4;
        this.f = str5;
        this.f4889g = str6;
        this.f4890h = cVar;
    }
}

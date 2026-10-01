package androidx.fragment.app;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u implements kc.e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ mc.r f1106v;

    public /* synthetic */ u(mc.r rVar) {
        this.f1106v = rVar;
    }

    @Override // kc.e
    public void b(String str, String str2, String str3, String str4) {
        pc.j jVar = new pc.j(str, str2, str3, str4, !TextUtils.isEmpty(str3));
        mc.r rVar = this.f1106v;
        rVar.f8615y0.add(jVar);
        hc.q qVar = rVar.f8614x0;
        qVar.f.add(jVar);
        qVar.f9680a.d(qVar.f.size());
    }
}

package k8;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d1 f7421e;

    public c1(d1 d1Var, String str, boolean z2) {
        this.f7421e = d1Var;
        t7.y.d(str);
        this.f7417a = str;
        this.f7418b = z2;
    }

    public final boolean a() {
        if (!this.f7419c) {
            this.f7419c = true;
            this.f7420d = this.f7421e.H().getBoolean(this.f7417a, this.f7418b);
        }
        return this.f7420d;
    }

    public final void b(boolean z2) {
        SharedPreferences.Editor editorEdit = this.f7421e.H().edit();
        editorEdit.putBoolean(this.f7417a, z2);
        editorEdit.apply();
        this.f7420d = z2;
    }
}

package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f758b = new s(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f759a;

    public e0(l lVar) {
        x.a(lVar, "output");
        this.f759a = lVar;
        lVar.f801a = this;
    }

    public void a(int i, Object obj, u0 u0Var) {
        l lVar = (l) this.f759a;
        lVar.t0(i, 3);
        u0Var.b((a) obj, lVar.f801a);
        lVar.t0(i, 4);
    }

    public e0() {
        k0 k0Var;
        r0 r0Var = r0.f848c;
        try {
            k0Var = (k0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            k0Var = f758b;
        }
        k0[] k0VarArr = {s.f851b, k0Var};
        d0 d0Var = new d0();
        d0Var.f756a = k0VarArr;
        Charset charset = x.f870a;
        this.f759a = d0Var;
    }
}

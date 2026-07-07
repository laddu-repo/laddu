package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r0 f848c = new r0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f850b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f849a = new e0();

    public final u0 a(Class cls) {
        u0 u0VarW;
        Class cls2;
        x.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f850b;
        u0 u0Var = (u0) concurrentHashMap.get(cls);
        if (u0Var != null) {
            return u0Var;
        }
        e0 e0Var = this.f849a;
        e0Var.getClass();
        Class cls3 = v0.f862a;
        if (!v.class.isAssignableFrom(cls) && (cls2 = v0.f862a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        t0 t0VarA = ((d0) e0Var.f759a).a(cls);
        int i = t0VarA.f861d;
        a aVar = t0VarA.f858a;
        if ((i & 2) == 2) {
            if (v.class.isAssignableFrom(cls)) {
                u0VarW = new n0(v0.f864c, p.f826a, aVar);
            } else {
                c1 c1Var = v0.f863b;
                o oVar = p.f827b;
                if (oVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                u0VarW = new n0(c1Var, oVar, aVar);
            }
        } else if (v.class.isAssignableFrom(cls)) {
            o oVar2 = null;
            o0 o0Var = p0.f829b;
            b0 b0Var = c0.f751b;
            c1 c1Var2 = v0.f864c;
            if (y.e.c(t0VarA.a()) != 1) {
                oVar2 = p.f826a;
            }
            o oVar3 = oVar2;
            i0 i0Var = j0.f794b;
            if (!(t0VarA instanceof t0)) {
                int[] iArr = m0.f808n;
                t0VarA.getClass();
                throw new ClassCastException();
            }
            u0VarW = m0.w(t0VarA, o0Var, b0Var, c1Var2, oVar3, i0Var);
        } else {
            o oVar4 = null;
            o0 o0Var2 = p0.f828a;
            b0 b0Var2 = c0.f750a;
            c1 c1Var3 = v0.f863b;
            if (y.e.c(t0VarA.a()) != 1 && (oVar4 = p.f827b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            o oVar5 = oVar4;
            i0 i0Var2 = j0.f793a;
            if (!(t0VarA instanceof t0)) {
                int[] iArr2 = m0.f808n;
                t0VarA.getClass();
                throw new ClassCastException();
            }
            u0VarW = m0.w(t0VarA, o0Var2, b0Var2, c1Var3, oVar5, i0Var2);
        }
        u0 u0Var2 = (u0) concurrentHashMap.putIfAbsent(cls, u0VarW);
        return u0Var2 != null ? u0Var2 : u0VarW;
    }
}

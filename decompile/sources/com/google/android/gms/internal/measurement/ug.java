package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class ug {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final sg f3144d = new sg();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ug f3145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v.i f3146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3147c = false;

    public /* synthetic */ ug(ug ugVar, v.i iVar) {
        if (ugVar != null) {
            p4.v.j(ugVar.f3147c);
        }
        this.f3145a = ugVar;
        this.f3146b = iVar;
    }

    public static ug a(ug ugVar, ug ugVar2) {
        ugVar.getClass();
        ug ugVar3 = tg.f3119e;
        if (ugVar == ugVar3) {
            return ugVar2;
        }
        ugVar2.getClass();
        if (ugVar2 == ugVar3) {
            return ugVar;
        }
        y9.i0<ug> i0VarJ = y9.i0.j(2, ugVar, ugVar2);
        if (i0VarJ.isEmpty()) {
            return ugVar3;
        }
        if (i0VarJ.size() == 1) {
            return (ug) i0VarJ.iterator().next();
        }
        int i = 0;
        for (ug ugVar4 : i0VarJ) {
            do {
                i += ugVar4.f3146b.f13021x;
                ugVar4 = ugVar4.f3145a;
            } while (ugVar4 != null);
        }
        if (i == 0) {
            return tg.f3119e;
        }
        v.i iVar = new v.i(i);
        for (ug ugVar5 : i0VarJ) {
            do {
                int i10 = 0;
                while (true) {
                    v.i iVar2 = ugVar5.f3146b;
                    if (i10 >= iVar2.f13021x) {
                        break;
                    }
                    p4.v.k(iVar.put((sg) iVar2.f(i10), iVar2.j(i10)) == null, "Duplicate bindings: %s", iVar2.f(i10));
                    i10++;
                }
                ugVar5 = ugVar5.f3145a;
            } while (ugVar5 != null);
        }
        return new tg(null, iVar).b();
    }

    public final ug b() {
        if (this.f3147c) {
            throw new IllegalStateException("Already frozen");
        }
        this.f3147c = true;
        ug ugVar = this.f3145a;
        return (ugVar == null || !this.f3146b.isEmpty()) ? this : ugVar;
    }

    public final boolean c() {
        if (this.f3146b.containsKey(f3144d)) {
            return true;
        }
        ug ugVar = this.f3145a;
        return ugVar != null && ugVar.c();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanExtras<");
        for (ug ugVar = this; ugVar != null; ugVar = ugVar.f3145a) {
            for (int i = 0; i < ugVar.f3146b.f13021x; i++) {
                sb2.append("[");
                sb2.append(this.f3146b.j(i));
                sb2.append("], ");
            }
        }
        sb2.append(">");
        return sb2.toString();
    }
}

package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class tg extends ug {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ug f3119e;
    public static final ug f;

    static {
        ug ugVarB = new tg(null, new v.i(0)).b();
        f3119e = ugVarB;
        tg tgVar = new tg(ugVarB, new v.i(0));
        boolean z2 = !tgVar.f3147c;
        Boolean bool = Boolean.TRUE;
        p4.v.q("Can't mutate after handing to trace", z2);
        p4.v.q("Key already present", !tgVar.c());
        tgVar.f3146b.put(ug.f3144d, bool);
        f = tgVar.b();
    }
}

package l4;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f8156b = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f8157a = new LinkedHashMap();

    public final void a(j0 j0Var) {
        String q9 = jb.b.q(j0Var.getClass());
        if (q9.length() > 0) {
            LinkedHashMap linkedHashMap = this.f8157a;
            j0 j0Var2 = (j0) linkedHashMap.get(q9);
            if (kotlin.jvm.internal.k.a(j0Var2, j0Var)) {
                return;
            }
            if (j0Var2 != null && j0Var2.f8147b) {
                throw new IllegalStateException(("Navigator " + j0Var + " is replacing an already attached " + j0Var2).toString());
            }
            if (!j0Var.f8147b) {
                return;
            }
            throw new IllegalStateException(("Navigator " + j0Var + " is already attached to another NavController").toString());
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    public final j0 b(String name) {
        kotlin.jvm.internal.k.e(name, "name");
        if (name.length() > 0) {
            j0 j0Var = (j0) this.f8157a.get(name);
            if (j0Var != null) {
                return j0Var;
            }
            throw new IllegalStateException(h8.c.m("Could not find Navigator with name \"", name, "\". You must call NavController.addNavigator() for each navigation type."));
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }
}

package xf;

import wf.h1;
import wf.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final wf.a0 f14739a = u0.a("kotlinx.serialization.json.JsonUnquotedLiteral", h1.f14332a);

    public static final a0 a(k kVar) {
        a0 a0Var;
        if (kVar instanceof a0) {
            a0Var = (a0) kVar;
        } else {
            a0Var = null;
        }
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalArgumentException("Element " + kotlin.jvm.internal.x.a(kVar.getClass()) + " is not a JsonPrimitive");
    }
}

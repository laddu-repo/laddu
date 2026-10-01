package yf;

import java.util.Set;
import wf.l1;
import wf.o1;
import wf.r1;
import wf.u1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f15103a = ie.i.s0(new uf.g[]{o1.f14372b, r1.f14385b, l1.f14353b, u1.f14402b});

    public static final boolean a(uf.g gVar) {
        kotlin.jvm.internal.k.e(gVar, "<this>");
        if (gVar.isInline() && f15103a.contains(gVar)) {
            return true;
        }
        return false;
    }
}

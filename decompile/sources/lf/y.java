package lf;

import gf.i1;
import gf.j1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.l implements ve.p {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ v f8399x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(v vVar) {
        super(2);
        this.f8399x = vVar;
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        int i6;
        int intValue = ((Number) obj).intValue();
        le.f fVar = (le.f) obj2;
        le.g key = fVar.getKey();
        le.f fVar2 = this.f8399x.f8395y.get(key);
        if (key != i1.f5682x) {
            if (fVar != fVar2) {
                i6 = Integer.MIN_VALUE;
            } else {
                i6 = intValue + 1;
            }
            return Integer.valueOf(i6);
        }
        j1 j1Var = (j1) fVar2;
        j1 j1Var2 = (j1) fVar;
        while (true) {
            if (j1Var2 == null) {
                j1Var2 = null;
                break;
            }
            if (j1Var2 == j1Var || !(j1Var2 instanceof mf.t)) {
                break;
            }
            j1Var2 = j1Var2.getParent();
        }
        if (j1Var2 == j1Var) {
            if (j1Var != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + j1Var2 + ", expected child of " + j1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}

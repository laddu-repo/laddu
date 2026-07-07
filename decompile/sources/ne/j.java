package ne;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class j extends c implements kotlin.jvm.internal.h {
    private final int arity;

    public j(int i6, le.c cVar) {
        super(cVar);
        this.arity = i6;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    @Override // ne.a
    public String toString() {
        if (getCompletion() == null) {
            x.f8056a.getClass();
            String a10 = y.a(this);
            k.d(a10, "renderLambdaToString(...)");
            return a10;
        }
        return super.toString();
    }
}

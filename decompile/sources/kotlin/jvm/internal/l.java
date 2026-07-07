package kotlin.jvm.internal;

import java.io.Serializable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class l implements h, Serializable {
    private final int arity;

    public l(int i6) {
        this.arity = i6;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        x.f8056a.getClass();
        String a10 = y.a(this);
        k.d(a10, "renderLambdaToString(...)");
        return a10;
    }
}

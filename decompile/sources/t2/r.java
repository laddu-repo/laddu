package t2;

import r1.e1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final e1 f12552a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f12553b;

    public r(int i6, e1 e1Var, int[] iArr) {
        if (iArr.length == 0) {
            u1.a.h("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f12552a = e1Var;
        this.f12553b = iArr;
    }
}

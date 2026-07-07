package j1;

import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6933a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6934b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f6935c;

    public m0(p0 p0Var, String str, int i6) {
        this.f6935c = p0Var;
        this.f6933a = str;
        this.f6934b = i6;
    }

    @Override // j1.l0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        y yVar = this.f6935c.f6966z;
        if (yVar != null && this.f6934b < 0 && this.f6933a == null && yVar.c().U(-1, 0)) {
            return false;
        }
        return this.f6935c.V(arrayList, arrayList2, this.f6933a, this.f6934b, 1);
    }
}

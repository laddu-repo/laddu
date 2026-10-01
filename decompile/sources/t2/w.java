package t2;

import a2.y1;
import java.util.Objects;
import r1.l1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f12562a;

    /* renamed from: b, reason: collision with root package name */
    public final y1[] f12563b;

    /* renamed from: c, reason: collision with root package name */
    public final s[] f12564c;

    /* renamed from: d, reason: collision with root package name */
    public final l1 f12565d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f12566e;

    public w(y1[] y1VarArr, s[] sVarArr, l1 l1Var, Object obj) {
        boolean z10;
        if (y1VarArr.length == sVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        this.f12563b = y1VarArr;
        this.f12564c = (s[]) sVarArr.clone();
        this.f12565d = l1Var;
        this.f12566e = obj;
        this.f12562a = y1VarArr.length;
    }

    public final boolean a(w wVar, int i6) {
        if (wVar == null || !Objects.equals(this.f12563b[i6], wVar.f12563b[i6]) || !Objects.equals(this.f12564c[i6], wVar.f12564c[i6])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i6) {
        if (this.f12563b[i6] != null) {
            return true;
        }
        return false;
    }
}

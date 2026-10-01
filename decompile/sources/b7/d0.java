package b7;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final j f1517a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f1518b;

    public d0(j jVar) {
        this.f1517a = jVar;
        this.f1518b = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d0) {
                d0 d0Var = (d0) obj;
                j jVar = this.f1517a;
                if (jVar != null && jVar.equals(d0Var.f1517a)) {
                    return true;
                }
                Throwable th = this.f1518b;
                if (th != null && d0Var.f1518b != null) {
                    return th.toString().equals(th.toString());
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1517a, this.f1518b});
    }

    public d0(Throwable th) {
        this.f1518b = th;
        this.f1517a = null;
    }
}

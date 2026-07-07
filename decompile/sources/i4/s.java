package i4;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final j4.d0 f6539a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6540b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6541c;

    /* renamed from: d, reason: collision with root package name */
    public final r f6542d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f6543e;

    public s(j4.d0 d0Var, int i6, int i10, boolean z10, r rVar, Bundle bundle) {
        this.f6539a = d0Var;
        this.f6540b = i6;
        this.f6541c = i10;
        this.f6542d = rVar;
        this.f6543e = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        s sVar = (s) obj;
        r rVar = sVar.f6542d;
        r rVar2 = this.f6542d;
        if (rVar2 == null && rVar == null) {
            return this.f6539a.equals(sVar.f6539a);
        }
        return Objects.equals(rVar2, rVar);
    }

    public final int hashCode() {
        return Objects.hash(this.f6542d, this.f6539a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        j4.d0 d0Var = this.f6539a;
        sb2.append(d0Var.f7163a.f7165a);
        sb2.append(", uid=");
        return r4.a.l(sb2, d0Var.f7163a.f7167c, "}");
    }
}

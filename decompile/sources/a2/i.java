package a2;

import android.text.TextUtils;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f265a;

    /* renamed from: b, reason: collision with root package name */
    public final r1.q f266b;

    /* renamed from: c, reason: collision with root package name */
    public final r1.q f267c;

    /* renamed from: d, reason: collision with root package name */
    public final int f268d;

    /* renamed from: e, reason: collision with root package name */
    public final int f269e;

    public i(String str, r1.q qVar, r1.q qVar2, int i6, int i10) {
        boolean z10;
        if (i6 != 0 && i10 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        u1.c.b(z10);
        if (!TextUtils.isEmpty(str)) {
            this.f265a = str;
            qVar.getClass();
            this.f266b = qVar;
            qVar2.getClass();
            this.f267c = qVar2;
            this.f268d = i6;
            this.f269e = i10;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f268d == iVar.f268d && this.f269e == iVar.f269e && this.f265a.equals(iVar.f265a) && this.f266b.equals(iVar.f266b) && this.f267c.equals(iVar.f267c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f267c.hashCode() + ((this.f266b.hashCode() + h8.c.g(this.f265a, (((527 + this.f268d) * 31) + this.f269e) * 31, 31)) * 31);
    }
}

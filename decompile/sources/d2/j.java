package d2;

import android.os.Bundle;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;
import n9.j4;
import n9.n1;
import n9.u;
import n9.u0;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3734a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final long f3735b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3736c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3737d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3738e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3739f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3740g;

    public j(n1 n1Var, String str, String str2, String str3, long j, long j10, Bundle bundle) {
        u uVar;
        x.d(str2);
        x.d(str3);
        this.f3737d = str2;
        this.f3738e = str3;
        this.f3739f = true == TextUtils.isEmpty(str) ? null : str;
        this.f3735b = j;
        this.f3736c = j10;
        if (j10 != 0 && j10 > j) {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.G.b(u0.l1(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    u0 u0Var2 = n1Var.C;
                    n1.g(u0Var2);
                    u0Var2.D.a("Param name can't be null");
                    it.remove();
                } else {
                    j4 j4Var = n1Var.F;
                    n1.e(j4Var);
                    Object k12 = j4Var.k1(bundle2.get(next), next);
                    if (k12 == null) {
                        u0 u0Var3 = n1Var.C;
                        n1.g(u0Var3);
                        u0Var3.G.b(n1Var.G.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        j4 j4Var2 = n1Var.F;
                        n1.e(j4Var2);
                        j4Var2.s1(bundle2, next, k12);
                    }
                }
            }
            uVar = new u(bundle2);
        } else {
            uVar = new u(new Bundle());
        }
        this.f3740g = uVar;
    }

    public j a(long j, e2.m mVar) {
        long s;
        long s7;
        h d10 = ((e2.m) this.f3738e).d();
        h d11 = mVar.d();
        if (d10 == null) {
            return new j(j, mVar, (e2.b) this.f3739f, (r2.d) this.f3737d, this.f3736c, d10);
        }
        if (!d10.x()) {
            return new j(j, mVar, (e2.b) this.f3739f, (r2.d) this.f3737d, this.f3736c, d11);
        }
        long E = d10.E(j);
        if (E == 0) {
            return new j(j, mVar, (e2.b) this.f3739f, (r2.d) this.f3737d, this.f3736c, d11);
        }
        u1.c.h(d11);
        long B = d10.B();
        long b10 = d10.b(B);
        long j10 = E + B;
        long j11 = j10 - 1;
        long c10 = d10.c(j11, j) + d10.b(j11);
        long B2 = d11.B();
        long b11 = d11.b(B2);
        long j12 = this.f3736c;
        if (c10 == b11) {
            s = j10 - B2;
        } else if (c10 >= b11) {
            if (b11 < b10) {
                s7 = j12 - (d11.s(b10, j) - B);
                return new j(j, mVar, (e2.b) this.f3739f, (r2.d) this.f3737d, s7, d11);
            }
            s = d10.s(b11, j) - B2;
        } else {
            throw new IOException();
        }
        s7 = s + j12;
        return new j(j, mVar, (e2.b) this.f3739f, (r2.d) this.f3737d, s7, d11);
    }

    public long b(long j) {
        h hVar = (h) this.f3740g;
        u1.c.h(hVar);
        return hVar.f(this.f3735b, j) + this.f3736c;
    }

    public long c(long j) {
        long b10 = b(j);
        h hVar = (h) this.f3740g;
        u1.c.h(hVar);
        return (hVar.F(this.f3735b, j) + b10) - 1;
    }

    public long d() {
        h hVar = (h) this.f3740g;
        u1.c.h(hVar);
        return hVar.E(this.f3735b);
    }

    public long e(long j) {
        long f3 = f(j);
        h hVar = (h) this.f3740g;
        u1.c.h(hVar);
        return hVar.c(j - this.f3736c, this.f3735b) + f3;
    }

    public long f(long j) {
        h hVar = (h) this.f3740g;
        u1.c.h(hVar);
        return hVar.b(j - this.f3736c);
    }

    public boolean g(long j, long j10) {
        h hVar = (h) this.f3740g;
        u1.c.h(hVar);
        if (!hVar.x() && j10 != -9223372036854775807L && e(j) > j10) {
            return false;
        }
        return true;
    }

    public j h(n1 n1Var, long j) {
        return new j(n1Var, (String) this.f3739f, (String) this.f3737d, (String) this.f3738e, this.f3735b, j, (u) this.f3740g);
    }

    public String toString() {
        switch (this.f3734a) {
            case 1:
                String uVar = ((u) this.f3740g).toString();
                String str = (String) this.f3737d;
                int length = String.valueOf(str).length();
                String str2 = (String) this.f3738e;
                StringBuilder sb2 = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + uVar.length() + 1);
                r4.a.u(sb2, "Event{appId='", str, "', name='", str2);
                sb2.append("', params=");
                sb2.append(uVar);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public j(n1 n1Var, String str, String str2, String str3, long j, long j10, u uVar) {
        x.d(str2);
        x.d(str3);
        x.g(uVar);
        this.f3737d = str2;
        this.f3738e = str3;
        this.f3739f = true == TextUtils.isEmpty(str) ? null : str;
        this.f3735b = j;
        this.f3736c = j10;
        if (j10 != 0 && j10 > j) {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.G.c(u0.l1(str2), u0.l1(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.f3740g = uVar;
    }

    public j(long j, e2.m mVar, e2.b bVar, r2.d dVar, long j10, h hVar) {
        this.f3735b = j;
        this.f3738e = mVar;
        this.f3739f = bVar;
        this.f3736c = j10;
        this.f3737d = dVar;
        this.f3740g = hVar;
    }
}

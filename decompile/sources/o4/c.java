package o4;

import android.os.Bundle;
import androidx.lifecycle.d1;
import androidx.lifecycle.g1;
import androidx.lifecycle.h0;
import androidx.lifecycle.x;
import d.a0;
import java.util.Arrays;
import l4.m;
import l4.u;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final l4.h f9876a;

    /* renamed from: b, reason: collision with root package name */
    public final u f9877b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f9878c;

    /* renamed from: d, reason: collision with root package name */
    public x f9879d;

    /* renamed from: e, reason: collision with root package name */
    public final m f9880e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9881f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f9882g;

    /* renamed from: h, reason: collision with root package name */
    public final e5.f f9883h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9884i;
    public final h0 j;

    /* renamed from: k, reason: collision with root package name */
    public x f9885k;

    /* renamed from: l, reason: collision with root package name */
    public final g1 f9886l;

    /* renamed from: m, reason: collision with root package name */
    public final he.m f9887m;

    public c(l4.h hVar) {
        this.f9876a = hVar;
        this.f9877b = hVar.f8141y;
        this.f9878c = hVar.f8142z;
        this.f9879d = hVar.A;
        this.f9880e = hVar.B;
        this.f9881f = hVar.C;
        this.f9882g = hVar.D;
        this.f9883h = new e5.f(new f5.b(hVar, new androidx.lifecycle.i(hVar, 3)));
        he.m d10 = he.a.d(new a0(16));
        this.j = new h0(hVar);
        this.f9885k = x.f992y;
        this.f9886l = (g1) d10.getValue();
        this.f9887m = he.a.d(new a0(17));
    }

    public final Bundle a() {
        Bundle bundle = this.f9878c;
        if (bundle == null) {
            return null;
        }
        Bundle b10 = k6.e.b((he.i[]) Arrays.copyOf(new he.i[0], 0));
        b10.putAll(bundle);
        return b10;
    }

    public final void b() {
        if (!this.f9884i) {
            e5.f fVar = this.f9883h;
            fVar.a();
            this.f9884i = true;
            if (this.f9880e != null) {
                d1.d(this.f9876a);
            }
            fVar.b(this.f9882g);
        }
        int ordinal = this.f9879d.ordinal();
        int ordinal2 = this.f9885k.ordinal();
        h0 h0Var = this.j;
        if (ordinal < ordinal2) {
            h0Var.h(this.f9879d);
        } else {
            h0Var.h(this.f9885k);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(kotlin.jvm.internal.x.a(l4.h.class).c());
        sb2.append("(" + this.f9881f + ')');
        sb2.append(" destination=");
        sb2.append(this.f9877b);
        String sb3 = sb2.toString();
        kotlin.jvm.internal.k.d(sb3, "toString(...)");
        return sb3;
    }
}

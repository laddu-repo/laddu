package androidx.media3.exoplayer.dash;

import androidx.lifecycle.j1;
import b2.k;
import com.google.android.gms.internal.measurement.p4;
import e2.e;
import f2.p;
import j1.f0;
import java.util.List;
import jd.o;
import o5.e0;
import p.l;
import q2.b0;
import u2.q;
import w1.g;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class DashMediaSource$Factory implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final k f1043a;

    /* renamed from: b, reason: collision with root package name */
    public final g f1044b;

    /* renamed from: c, reason: collision with root package name */
    public p f1045c;

    /* renamed from: d, reason: collision with root package name */
    public final e0 f1046d;

    /* renamed from: e, reason: collision with root package name */
    public final e0 f1047e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1048f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1049g;

    /* renamed from: h, reason: collision with root package name */
    public o f1050h;

    /* JADX WARN: Type inference failed for: r4v2, types: [o5.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [o5.e0, java.lang.Object] */
    public DashMediaSource$Factory(g gVar) {
        k kVar = new k(gVar);
        this.f1043a = kVar;
        this.f1044b = gVar;
        this.f1045c = new j1(14);
        this.f1047e = new Object();
        this.f1048f = 30000L;
        this.f1049g = 5000000L;
        this.f1046d = new Object();
        ((p4) kVar.A).f2388a = true;
    }

    @Override // q2.b0
    public final b0 a(l lVar) {
        p4 p4Var = (p4) this.f1043a.A;
        p4Var.getClass();
        p4Var.f2389b = lVar;
        return this;
    }

    @Override // q2.b0
    public final b0 c(boolean z10) {
        ((p4) this.f1043a.A).f2388a = z10;
        return this;
    }

    @Override // q2.b0
    public final b0 d() {
        ((p4) this.f1043a.A).getClass();
        return this;
    }

    @Override // q2.b0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final d2.g b(r1.e0 e0Var) {
        q qVar;
        e0Var.f11379b.getClass();
        q qVar2 = this.f1050h;
        if (qVar2 == null) {
            qVar2 = new e();
        }
        List list = e0Var.f11379b.f11287e;
        if (!list.isEmpty()) {
            qVar = new f0(8, qVar2, list);
        } else {
            qVar = qVar2;
        }
        return new d2.g(e0Var, this.f1044b, qVar, this.f1043a, this.f1046d, this.f1045c.f(e0Var), this.f1047e, this.f1048f, this.f1049g);
    }
}

package pf;

import gf.q0;
import mf.u;
import ne.j;
import ve.l;
import ve.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10758a;

    /* renamed from: b, reason: collision with root package name */
    public final q f10759b;

    /* renamed from: c, reason: collision with root package name */
    public final q f10760c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10761d;

    /* renamed from: e, reason: collision with root package name */
    public final j f10762e;

    /* renamed from: f, reason: collision with root package name */
    public final q f10763f;

    /* renamed from: g, reason: collision with root package name */
    public Object f10764g;

    /* renamed from: h, reason: collision with root package name */
    public int f10765h = -1;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f10766i;

    public c(e eVar, Object obj, q qVar, q qVar2, h5.a aVar, j jVar, q qVar3) {
        this.f10766i = eVar;
        this.f10758a = obj;
        this.f10759b = qVar;
        this.f10760c = qVar2;
        this.f10761d = aVar;
        this.f10762e = jVar;
        this.f10763f = qVar3;
    }

    public final l a(e eVar, Object obj) {
        q qVar = this.f10763f;
        if (qVar != null) {
            return (l) qVar.invoke(eVar, this.f10761d, obj);
        }
        return null;
    }

    public final void b() {
        q0 q0Var;
        Object obj = this.f10764g;
        if (obj instanceof u) {
            ((u) obj).h(this.f10765h, this.f10766i.f10770x);
            return;
        }
        if (obj instanceof q0) {
            q0Var = (q0) obj;
        } else {
            q0Var = null;
        }
        if (q0Var != null) {
            q0Var.d();
        }
    }
}

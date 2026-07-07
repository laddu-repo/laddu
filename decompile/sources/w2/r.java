package w2;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import db.c1;
import db.i0;
import db.k0;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: p, reason: collision with root package name */
    public static final q.a f13685p = new q.a(2);

    /* renamed from: a, reason: collision with root package name */
    public final Context f13686a;

    /* renamed from: b, reason: collision with root package name */
    public final p f13687b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f13688c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13689d;

    /* renamed from: e, reason: collision with root package name */
    public final d f13690e;

    /* renamed from: f, reason: collision with root package name */
    public final u1.v f13691f;

    /* renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArraySet f13692g;

    /* renamed from: h, reason: collision with root package name */
    public s3.c f13693h = new s3.c();

    /* renamed from: i, reason: collision with root package name */
    public u1.x f13694i;
    public Pair j;

    /* renamed from: k, reason: collision with root package name */
    public int f13695k;

    /* renamed from: l, reason: collision with root package name */
    public int f13696l;

    /* renamed from: m, reason: collision with root package name */
    public long f13697m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13698n;

    /* renamed from: o, reason: collision with root package name */
    public int f13699o;

    public r(a2.m mVar) {
        this.f13686a = (Context) mVar.f316z;
        p pVar = (p) mVar.B;
        u1.c.h(pVar);
        this.f13687b = pVar;
        this.f13688c = new SparseArray();
        i0 i0Var = k0.f4008y;
        c1 c1Var = c1.B;
        this.f13689d = mVar.f314x;
        u1.v vVar = (u1.v) mVar.C;
        this.f13691f = vVar;
        this.f13690e = new d((w) mVar.A, vVar);
        this.f13692g = new CopyOnWriteArraySet();
        new r1.p().a();
        this.f13697m = -9223372036854775807L;
        this.f13699o = -1;
        this.f13696l = 0;
    }
}

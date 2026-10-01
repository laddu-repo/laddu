package x4;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x extends androidx.lifecycle.o0 {

    /* renamed from: l, reason: collision with root package name */
    public final w f14671l;

    /* renamed from: m, reason: collision with root package name */
    public final s8.l f14672m;

    /* renamed from: n, reason: collision with root package name */
    public final b0 f14673n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f14674o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f14675p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f14676q;

    /* renamed from: r, reason: collision with root package name */
    public final le.h f14677r;
    public final cf.p s;

    public x(w wVar, s8.l container, String[] strArr, cf.p pVar) {
        le.h hVar;
        kotlin.jvm.internal.k.e(container, "container");
        this.f14671l = wVar;
        this.f14672m = container;
        this.f14673n = new b0(strArr, this);
        this.f14674o = new AtomicBoolean(true);
        this.f14675p = new AtomicBoolean(false);
        this.f14676q = new AtomicBoolean(false);
        if (wVar.n()) {
            mf.e eVar = wVar.f14661a;
            if (eVar != null) {
                hVar = eVar.f8858x;
            } else {
                kotlin.jvm.internal.k.k("coroutineScope");
                throw null;
            }
        } else {
            hVar = le.i.f8353x;
        }
        this.f14677r = hVar;
        this.s = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bb A[Catch: all -> 0x002c, Exception -> 0x002f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x002f, blocks: (B:11:0x0027, B:15:0x00bb), top: B:10:0x0027, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00da A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #2 {all -> 0x002c, blocks: (B:11:0x0027, B:13:0x00b3, B:15:0x00bb, B:25:0x00da, B:38:0x00d0, B:39:0x00d7), top: B:10:0x0027, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00b1 -> B:12:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00e9 -> B:24:0x00ea). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i(x4.x r11, ne.c r12) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.x.i(x4.x, ne.c):java.lang.Object");
    }

    @Override // androidx.lifecycle.o0
    public final void e() {
        s8.l lVar = this.f14672m;
        lVar.getClass();
        ((Set) lVar.f12252z).add(this);
        gf.f0.w(this.f14671l.i(), this.f14677r, new a0(this, null, 1), 2);
    }

    @Override // androidx.lifecycle.o0
    public final void f() {
        s8.l lVar = this.f14672m;
        lVar.getClass();
        ((Set) lVar.f12252z).remove(this);
    }
}

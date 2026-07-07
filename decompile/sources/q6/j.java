package q6;

import android.content.Context;
import java.util.List;
import v6.k;
import v6.m;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final k f11127a;

    /* renamed from: b, reason: collision with root package name */
    public final List f11128b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11129c;

    /* renamed from: d, reason: collision with root package name */
    public final k f11130d;

    /* renamed from: e, reason: collision with root package name */
    public final w6.h f11131e;

    /* renamed from: f, reason: collision with root package name */
    public final l6.c f11132f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11133g;

    public j(k kVar, List list, int i6, k kVar2, w6.h hVar, l6.c cVar, boolean z10) {
        this.f11127a = kVar;
        this.f11128b = list;
        this.f11129c = i6;
        this.f11130d = kVar2;
        this.f11131e = hVar;
        this.f11132f = cVar;
        this.f11133g = z10;
    }

    public final void a(k kVar, h hVar) {
        Context context = kVar.f13381a;
        k kVar2 = this.f11127a;
        if (context == kVar2.f13381a) {
            if (kVar.f13382b != m.f13405y) {
                if (kVar.f13383c == kVar2.f13383c) {
                    if (kVar.f13400v == kVar2.f13400v) {
                        if (kVar.f13401w == kVar2.f13401w) {
                            return;
                        }
                        throw new IllegalStateException(("Interceptor '" + hVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
                    }
                    throw new IllegalStateException(("Interceptor '" + hVar + "' cannot modify the request's lifecycle.").toString());
                }
                throw new IllegalStateException(("Interceptor '" + hVar + "' cannot modify the request's target.").toString());
            }
            throw new IllegalStateException(("Interceptor '" + hVar + "' cannot set the request's data to null.").toString());
        }
        throw new IllegalStateException(("Interceptor '" + hVar + "' cannot modify the request's context.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(v6.k r12, ne.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof q6.i
            if (r0 == 0) goto L13
            r0 = r13
            q6.i r0 = (q6.i) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            q6.i r0 = new q6.i
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f11126z
            int r1 = r0.B
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            q6.h r12 = r0.f11125y
            q6.j r0 = r0.f11124x
            he.a.f(r13)
            goto L70
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            he.a.f(r13)
            java.util.List r13 = r11.f11128b
            int r1 = r11.f11129c
            if (r1 <= 0) goto L45
            int r3 = r1 + (-1)
            java.lang.Object r3 = r13.get(r3)
            q6.h r3 = (q6.h) r3
            r11.a(r12, r3)
        L45:
            java.lang.Object r13 = r13.get(r1)
            q6.h r13 = (q6.h) r13
            int r6 = r1 + 1
            q6.j r3 = new q6.j
            l6.c r9 = r11.f11132f
            boolean r10 = r11.f11133g
            v6.k r4 = r11.f11127a
            java.util.List r5 = r11.f11128b
            w6.h r8 = r11.f11131e
            r7 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.f11124x = r11
            r0.f11125y = r13
            r0.B = r2
            java.lang.Object r12 = r13.d(r3, r0)
            me.a r0 = me.a.f8833x
            if (r12 != r0) goto L6c
            return r0
        L6c:
            r0 = r13
            r13 = r12
            r12 = r0
            r0 = r11
        L70:
            v6.l r13 = (v6.l) r13
            v6.k r1 = r13.b()
            r0.a(r1, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.j.b(v6.k, ne.c):java.lang.Object");
    }
}

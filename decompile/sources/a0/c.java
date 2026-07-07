package a0;

import b0.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public int f22b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23c;

    /* renamed from: d, reason: collision with root package name */
    public final d f24d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25e;

    /* renamed from: f, reason: collision with root package name */
    public c f26f;

    /* renamed from: i, reason: collision with root package name */
    public y.f f29i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f21a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f27g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f28h = Integer.MIN_VALUE;

    public c(d dVar, int i6) {
        this.f24d = dVar;
        this.f25e = i6;
    }

    public final void a(c cVar, int i6) {
        b(cVar, i6, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i6, int i10, boolean z10) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z10 && !i(cVar)) {
            return false;
        }
        this.f26f = cVar;
        if (cVar.f21a == null) {
            cVar.f21a = new HashSet();
        }
        HashSet hashSet = this.f26f.f21a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f27g = i6;
        this.f28h = i10;
        return true;
    }

    public final void c(int i6, n nVar, ArrayList arrayList) {
        HashSet hashSet = this.f21a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                b0.h.b(((c) it.next()).f24d, i6, arrayList, nVar);
            }
        }
    }

    public final int d() {
        if (!this.f23c) {
            return 0;
        }
        return this.f22b;
    }

    public final int e() {
        c cVar;
        if (this.f24d.f43g0 == 8) {
            return 0;
        }
        int i6 = this.f28h;
        if (i6 != Integer.MIN_VALUE && (cVar = this.f26f) != null && cVar.f24d.f43g0 == 8) {
            return i6;
        }
        return this.f27g;
    }

    public final c f() {
        int i6 = this.f25e;
        int c10 = y.e.c(i6);
        d dVar = this.f24d;
        switch (c10) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.K;
            case 2:
                return dVar.L;
            case 3:
                return dVar.I;
            case 4:
                return dVar.J;
            default:
                throw new AssertionError(r4.a.x(i6));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f21a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        if (this.f26f != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0026. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(a0.c r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L5
            goto L65
        L5:
            a0.d r1 = r11.f24d
            int r11 = r11.f25e
            r2 = 6
            int r3 = r10.f25e
            r4 = 1
            if (r11 != r3) goto L1c
            if (r3 != r2) goto L63
            boolean r11 = r1.E
            if (r11 == 0) goto L65
            a0.d r11 = r10.f24d
            boolean r11 = r11.E
            if (r11 != 0) goto L63
            goto L65
        L1c:
            int r5 = y.e.c(r3)
            r6 = 4
            r7 = 2
            r8 = 9
            r9 = 8
            switch(r5) {
                case 0: goto L65;
                case 1: goto L53;
                case 2: goto L3f;
                case 3: goto L53;
                case 4: goto L3f;
                case 5: goto L3a;
                case 6: goto L33;
                case 7: goto L65;
                case 8: goto L65;
                default: goto L29;
            }
        L29:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            java.lang.String r0 = r4.a.x(r3)
            r11.<init>(r0)
            throw r11
        L33:
            if (r11 == r2) goto L65
            if (r11 == r9) goto L65
            if (r11 == r8) goto L65
            goto L63
        L3a:
            if (r11 == r7) goto L65
            if (r11 != r6) goto L63
            goto L65
        L3f:
            r2 = 3
            if (r11 == r2) goto L48
            r2 = 5
            if (r11 != r2) goto L46
            goto L48
        L46:
            r2 = 0
            goto L49
        L48:
            r2 = 1
        L49:
            boolean r1 = r1 instanceof a0.h
            if (r1 == 0) goto L52
            if (r2 != 0) goto L63
            if (r11 != r8) goto L65
            goto L63
        L52:
            return r2
        L53:
            if (r11 == r7) goto L5a
            if (r11 != r6) goto L58
            goto L5a
        L58:
            r2 = 0
            goto L5b
        L5a:
            r2 = 1
        L5b:
            boolean r1 = r1 instanceof a0.h
            if (r1 == 0) goto L64
            if (r2 != 0) goto L63
            if (r11 != r9) goto L65
        L63:
            return r4
        L64:
            return r2
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.c.i(a0.c):boolean");
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f26f;
        if (cVar != null && (hashSet = cVar.f21a) != null) {
            hashSet.remove(this);
            if (this.f26f.f21a.size() == 0) {
                this.f26f.f21a = null;
            }
        }
        this.f21a = null;
        this.f26f = null;
        this.f27g = 0;
        this.f28h = Integer.MIN_VALUE;
        this.f23c = false;
        this.f22b = 0;
    }

    public final void k() {
        y.f fVar = this.f29i;
        if (fVar == null) {
            this.f29i = new y.f(1);
        } else {
            fVar.c();
        }
    }

    public final void l(int i6) {
        this.f22b = i6;
        this.f23c = true;
    }

    public final String toString() {
        return this.f24d.f45h0 + ":" + r4.a.x(this.f25e);
    }
}

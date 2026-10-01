package g4;

import db.c1;
import db.i0;
import db.k0;
import java.util.List;
import y2.f0;
import y2.o;
import y2.p;
import y2.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements o {

    /* renamed from: a, reason: collision with root package name */
    public q f5442a;

    /* renamed from: b, reason: collision with root package name */
    public f0 f5443b;

    /* renamed from: c, reason: collision with root package name */
    public int f5444c;

    /* renamed from: d, reason: collision with root package name */
    public long f5445d;

    /* renamed from: e, reason: collision with root package name */
    public b f5446e;

    /* renamed from: f, reason: collision with root package name */
    public int f5447f;

    /* renamed from: g, reason: collision with root package name */
    public long f5448g;

    @Override // y2.o
    public final void c(long j, long j10) {
        int i6;
        if (j == 0) {
            i6 = 0;
        } else {
            i6 = 4;
        }
        this.f5444c = i6;
        b bVar = this.f5446e;
        if (bVar != null) {
            bVar.a(j10);
        }
    }

    @Override // y2.o
    public final boolean f(p pVar) {
        return e.a(pVar);
    }

    @Override // y2.o
    public final List h() {
        i0 i0Var = k0.f4008y;
        return c1.B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0213, code lost:
    
        if (r9 != 65534) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023b  */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.material.datepicker.o, java.lang.Object] */
    @Override // y2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(y2.p r21, mc.i r22) {
        /*
            Method dump skipped, instructions count: 693
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.d.i(y2.p, mc.i):int");
    }

    @Override // y2.o
    public final void l(q qVar) {
        this.f5442a = qVar;
        this.f5443b = qVar.A(0, 1);
        qVar.t();
    }

    @Override // y2.o
    public final void a() {
    }

    @Override // y2.o
    public final o d() {
        return this;
    }
}

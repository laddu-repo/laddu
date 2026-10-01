package o2;

import a2.a1;
import a2.c2;
import a8.f;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.p4;
import d2.k;
import db.c1;
import ef.g;
import j2.y;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o5.e0;
import p.l;
import r1.q;
import r2.d;
import r2.e;
import r2.i;
import r2.m;
import s3.j;
import s3.r;
import t2.s;
import u1.a0;
import u2.p;
import w1.h;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements i {

    /* renamed from: a, reason: collision with root package name */
    public final p f9852a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9853b;

    /* renamed from: c, reason: collision with root package name */
    public final d[] f9854c;

    /* renamed from: d, reason: collision with root package name */
    public final h f9855d;

    /* renamed from: e, reason: collision with root package name */
    public s f9856e;

    /* renamed from: f, reason: collision with root package name */
    public p2.c f9857f;

    /* renamed from: g, reason: collision with root package name */
    public int f9858g;

    /* renamed from: h, reason: collision with root package name */
    public q2.b f9859h;

    public a(p pVar, p2.c cVar, int i6, s sVar, h hVar, l lVar, boolean z10) {
        r[] rVarArr;
        int i10;
        int i11;
        this.f9852a = pVar;
        this.f9857f = cVar;
        this.f9853b = i6;
        this.f9856e = sVar;
        this.f9855d = hVar;
        p2.b bVar = cVar.f10479f[i6];
        this.f9854c = new d[sVar.length()];
        for (int i12 = 0; i12 < this.f9854c.length; i12++) {
            int j = sVar.j(i12);
            q qVar = bVar.j[j];
            if (qVar.f11674r != null) {
                p2.a aVar = cVar.f10478e;
                aVar.getClass();
                rVarArr = aVar.f10458c;
            } else {
                rVarArr = null;
            }
            r[] rVarArr2 = rVarArr;
            int i13 = bVar.f10459a;
            if (i13 == 2) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            long j10 = bVar.f10461c;
            long j11 = cVar.f10480g;
            s3.q qVar2 = new s3.q(j, i13, j10, -9223372036854775807L, j11, j11, qVar, 0, rVarArr2, i10, null, null);
            if (!z10) {
                i11 = 35;
            } else {
                i11 = 3;
            }
            this.f9854c[i12] = new d(new j(lVar, i11, null, qVar2, c1.B, null), bVar.f10459a, qVar);
        }
    }

    @Override // r2.i
    public final void a() {
        for (d dVar : this.f9854c) {
            dVar.f11782x.a();
        }
    }

    @Override // r2.i
    public final void b() {
        q2.b bVar = this.f9859h;
        if (bVar == null) {
            this.f9852a.b();
            return;
        }
        throw bVar;
    }

    @Override // r2.i
    public final long c(long j, c2 c2Var) {
        long j10;
        p2.b bVar = this.f9857f.f10479f[this.f9853b];
        int e10 = a0.e(bVar.f10472o, j, true);
        long[] jArr = bVar.f10472o;
        long j11 = jArr[e10];
        if (j11 < j && e10 < bVar.f10468k - 1) {
            j10 = jArr[e10 + 1];
        } else {
            j10 = j11;
        }
        return c2Var.a(j, j11, j10);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [q2.b, java.io.IOException] */
    @Override // r2.i
    public final void e(a1 a1Var, long j, List list, p4 p4Var) {
        List list2;
        int a10;
        long b10;
        long j10;
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f9859h != null) {
            return;
        }
        p2.b[] bVarArr = this.f9857f.f10479f;
        int i6 = this.f9853b;
        p2.b bVar = bVarArr[i6];
        int i10 = bVar.f10468k;
        long[] jArr = bVar.f10472o;
        if (i10 == 0) {
            p4Var.f2388a = !r4.f10477d;
            return;
        }
        if (list.isEmpty()) {
            a10 = a0.e(jArr, j, true);
            list2 = list;
        } else {
            list2 = list;
            a10 = (int) (((r2.l) list2.get(list.size() - 1)).a() - this.f9858g);
            if (a10 < 0) {
                this.f9859h = new IOException();
                return;
            }
        }
        if (a10 >= bVar.f10468k) {
            p4Var.f2388a = !this.f9857f.f10477d;
            return;
        }
        long j11 = a1Var.f158a;
        long j12 = j - j11;
        p2.c cVar = this.f9857f;
        if (!cVar.f10477d) {
            b10 = -9223372036854775807L;
        } else {
            p2.b bVar2 = cVar.f10479f[i6];
            int i11 = bVar2.f10468k - 1;
            b10 = (bVar2.b(i11) + bVar2.f10472o[i11]) - j11;
        }
        int length = this.f9856e.length();
        m[] mVarArr = new m[length];
        for (int i12 = 0; i12 < length; i12++) {
            this.f9856e.j(i12);
            mVarArr[i12] = new k(bVar, a10);
        }
        this.f9856e.b(j11, j12, b10, list2, mVarArr);
        long j13 = jArr[a10];
        long b11 = bVar.b(a10) + j13;
        if (list.isEmpty()) {
            j10 = j;
        } else {
            j10 = -9223372036854775807L;
        }
        int i13 = this.f9858g + a10;
        int d10 = this.f9856e.d();
        d dVar = this.f9854c[d10];
        int j14 = this.f9856e.j(d10);
        List list3 = bVar.f10471n;
        q[] qVarArr = bVar.j;
        if (qVarArr != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        if (list3 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        u1.c.g(z11);
        if (a10 < list3.size()) {
            z12 = true;
        } else {
            z12 = false;
        }
        u1.c.g(z12);
        String num = Integer.toString(qVarArr[j14].j);
        String l10 = ((Long) list3.get(a10)).toString();
        Uri o10 = u1.a.o(bVar.f10469l, bVar.f10470m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l10).replace("{start_time}", l10));
        SystemClock.elapsedRealtime();
        q n10 = this.f9856e.n();
        int o11 = this.f9856e.o();
        Object r10 = this.f9856e.r();
        Map map = Collections.EMPTY_MAP;
        u1.c.i(o10, "The uri must be set.");
        p4Var.f2389b = new r2.j(this.f9855d, new w1.l(o10, 1, null, map, 0L, -1L, null, 0), n10, o11, r10, j13, b11, j10, -9223372036854775807L, i13, 1, j13, dVar);
    }

    @Override // r2.i
    public final int f(long j, List list) {
        if (this.f9859h == null && this.f9856e.length() >= 2) {
            return this.f9856e.k(j, list);
        }
        return list.size();
    }

    @Override // r2.i
    public final boolean g(long j, e eVar, List list) {
        if (this.f9859h != null) {
            return false;
        }
        return this.f9856e.e(j, eVar, list);
    }

    @Override // r2.i
    public final boolean h(e eVar, boolean z10, y yVar, e0 e0Var) {
        u2.h I = f.I(this.f9856e);
        e0Var.getClass();
        g e10 = e0.e(I, yVar);
        if (z10 && e10 != null && e10.f4580a == 2) {
            s sVar = this.f9856e;
            if (sVar.p(sVar.g(eVar.A), e10.f4581b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // r2.i
    public final void d(e eVar) {
    }
}

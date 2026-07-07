package o5;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.a4;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends r {
    public ArrayList Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f9933a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f9934b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f9935c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f9936d0;

    @Override // o5.r
    public final void A() {
        if (this.Z.isEmpty()) {
            I();
            l();
            return;
        }
        w wVar = new w();
        wVar.f9998b = this;
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i6 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((r) obj).a(wVar);
        }
        this.f9934b0 = this.Z.size();
        if (!this.f9933a0) {
            for (int i11 = 1; i11 < this.Z.size(); i11++) {
                ((r) this.Z.get(i11 - 1)).a(new w((r) this.Z.get(i11), 2));
            }
            r rVar = (r) this.Z.get(0);
            if (rVar != null) {
                rVar.A();
                return;
            }
            return;
        }
        ArrayList arrayList2 = this.Z;
        int size2 = arrayList2.size();
        while (i6 < size2) {
            Object obj2 = arrayList2.get(i6);
            i6++;
            ((r) obj2).A();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // o5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.a.B(long, long):void");
    }

    @Override // o5.r
    public final void C(long j) {
        ArrayList arrayList;
        this.f9989z = j;
        if (j >= 0 && (arrayList = this.Z) != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((r) this.Z.get(i6)).C(j);
            }
        }
    }

    @Override // o5.r
    public final void D(a4 a4Var) {
        this.f9936d0 |= 8;
        int size = this.Z.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((r) this.Z.get(i6)).D(a4Var);
        }
    }

    @Override // o5.r
    public final void E(TimeInterpolator timeInterpolator) {
        this.f9936d0 |= 1;
        ArrayList arrayList = this.Z;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((r) this.Z.get(i6)).E(timeInterpolator);
            }
        }
        this.A = timeInterpolator;
    }

    @Override // o5.r
    public final void F(n9.a0 a0Var) {
        super.F(a0Var);
        this.f9936d0 |= 4;
        if (this.Z != null) {
            for (int i6 = 0; i6 < this.Z.size(); i6++) {
                ((r) this.Z.get(i6)).F(a0Var);
            }
        }
    }

    @Override // o5.r
    public final void G() {
        this.f9936d0 |= 2;
        int size = this.Z.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((r) this.Z.get(i6)).G();
        }
    }

    @Override // o5.r
    public final void H(long j) {
        this.f9988y = j;
    }

    @Override // o5.r
    public final String J(String str) {
        String J = super.J(str);
        for (int i6 = 0; i6 < this.Z.size(); i6++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(J);
            sb2.append("\n");
            sb2.append(((r) this.Z.get(i6)).J(str + "  "));
            J = sb2.toString();
        }
        return J;
    }

    public final void K(r rVar) {
        this.Z.add(rVar);
        rVar.F = this;
        long j = this.f9989z;
        if (j >= 0) {
            rVar.C(j);
        }
        if ((this.f9936d0 & 1) != 0) {
            rVar.E(this.A);
        }
        if ((this.f9936d0 & 2) != 0) {
            rVar.G();
        }
        if ((this.f9936d0 & 4) != 0) {
            rVar.F(this.S);
        }
        if ((this.f9936d0 & 8) != 0) {
            rVar.D(null);
        }
    }

    @Override // o5.r
    public final void c(z zVar) {
        View view = zVar.f10001b;
        if (t(view)) {
            ArrayList arrayList = this.Z;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                r rVar = (r) obj;
                if (rVar.t(view)) {
                    rVar.c(zVar);
                    zVar.f10002c.add(rVar);
                }
            }
        }
    }

    @Override // o5.r
    public final void cancel() {
        super.cancel();
        int size = this.Z.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((r) this.Z.get(i6)).cancel();
        }
    }

    @Override // o5.r
    public final void e(z zVar) {
        int size = this.Z.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((r) this.Z.get(i6)).e(zVar);
        }
    }

    @Override // o5.r
    public final void f(z zVar) {
        View view = zVar.f10001b;
        if (t(view)) {
            ArrayList arrayList = this.Z;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                r rVar = (r) obj;
                if (rVar.t(view)) {
                    rVar.f(zVar);
                    zVar.f10002c.add(rVar);
                }
            }
        }
    }

    @Override // o5.r
    /* renamed from: i */
    public final r clone() {
        a aVar = (a) super.clone();
        aVar.Z = new ArrayList();
        int size = this.Z.size();
        for (int i6 = 0; i6 < size; i6++) {
            r clone = ((r) this.Z.get(i6)).clone();
            aVar.Z.add(clone);
            clone.F = aVar;
        }
        return aVar;
    }

    @Override // o5.r
    public final void k(ViewGroup viewGroup, c6.h hVar, c6.h hVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f9988y;
        int size = this.Z.size();
        for (int i6 = 0; i6 < size; i6++) {
            r rVar = (r) this.Z.get(i6);
            if (j > 0 && (this.f9933a0 || i6 == 0)) {
                long j10 = rVar.f9988y;
                if (j10 > 0) {
                    rVar.H(j10 + j);
                } else {
                    rVar.H(j);
                }
            }
            rVar.k(viewGroup, hVar, hVar2, arrayList, arrayList2);
        }
    }

    @Override // o5.r
    public final boolean r() {
        for (int i6 = 0; i6 < this.Z.size(); i6++) {
            if (((r) this.Z.get(i6)).r()) {
                return true;
            }
        }
        return false;
    }

    @Override // o5.r
    public final void w(View view) {
        super.w(view);
        int size = this.Z.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((r) this.Z.get(i6)).w(view);
        }
    }

    @Override // o5.r
    public final void x() {
        this.T = 0L;
        int i6 = 0;
        w wVar = new w(this, i6);
        while (i6 < this.Z.size()) {
            r rVar = (r) this.Z.get(i6);
            rVar.a(wVar);
            rVar.x();
            long j = rVar.T;
            if (this.f9933a0) {
                this.T = Math.max(this.T, j);
            } else {
                long j10 = this.T;
                rVar.U = j10;
                this.T = j10 + j;
            }
            i6++;
        }
    }

    @Override // o5.r
    public final r y(o oVar) {
        super.y(oVar);
        return this;
    }

    @Override // o5.r
    public final void z(View view) {
        super.z(view);
        int size = this.Z.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((r) this.Z.get(i6)).z(view);
        }
    }
}

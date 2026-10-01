package g4;

import com.google.android.material.datepicker.o;
import java.math.RoundingMode;
import u1.a0;
import y2.y;
import y2.z;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements z {

    /* renamed from: a, reason: collision with root package name */
    public final o f5451a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5452b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5453c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5454d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5455e;

    public f(o oVar, int i6, long j, long j10) {
        this.f5451a = oVar;
        this.f5452b = i6;
        this.f5453c = j;
        long j11 = (j10 - j) / oVar.f2675z;
        this.f5454d = j11;
        this.f5455e = a(j11);
    }

    public final long a(long j) {
        long j10 = j * this.f5452b;
        long j11 = this.f5451a.f2674y;
        String str = a0.f12750a;
        return a0.Y(j10, 1000000L, j11, RoundingMode.DOWN);
    }

    @Override // y2.z
    public final boolean g() {
        return true;
    }

    @Override // y2.z
    public final y j(long j) {
        o oVar = this.f5451a;
        long j10 = this.f5454d;
        long j11 = a0.j((oVar.f2674y * j) / (this.f5452b * 1000000), 0L, j10 - 1);
        long j12 = this.f5453c;
        long a10 = a(j11);
        y2.a0 a0Var = new y2.a0(a10, (oVar.f2675z * j11) + j12);
        if (a10 < j && j11 != j10 - 1) {
            long j13 = j11 + 1;
            return new y(a0Var, new y2.a0(a(j13), (oVar.f2675z * j13) + j12));
        }
        return new y(a0Var, a0Var);
    }

    @Override // y2.z
    public final long m() {
        return this.f5455e;
    }
}

package cg;

import bg.f0;
import he.y;
import java.io.IOException;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends l implements p {
    public final /* synthetic */ f0 A;
    public final /* synthetic */ v B;
    public final /* synthetic */ v C;
    public final /* synthetic */ w D;
    public final /* synthetic */ w E;
    public final /* synthetic */ w F;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s f2125x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f2126y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ v f2127z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(s sVar, long j, v vVar, f0 f0Var, v vVar2, v vVar3, w wVar, w wVar2, w wVar3) {
        super(2);
        this.f2125x = sVar;
        this.f2126y = j;
        this.f2127z = vVar;
        this.A = f0Var;
        this.B = vVar2;
        this.C = vVar3;
        this.D = wVar;
        this.E = wVar2;
        this.F = wVar3;
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        long j;
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        f0 f0Var = this.A;
        if (intValue != 1) {
            if (intValue == 10) {
                if (longValue >= 4) {
                    f0Var.skip(4L);
                    b.e(f0Var, (int) (longValue - 4), new i(this.D, f0Var, this.E, this.F));
                } else {
                    throw new IOException("bad zip: NTFS extra too short");
                }
            }
        } else {
            s sVar = this.f2125x;
            if (!sVar.f8051x) {
                sVar.f8051x = true;
                if (longValue >= this.f2126y) {
                    v vVar = this.f2127z;
                    long j10 = vVar.f8054x;
                    if (j10 == 4294967295L) {
                        j10 = f0Var.m();
                    }
                    vVar.f8054x = j10;
                    v vVar2 = this.B;
                    long j11 = 0;
                    if (vVar2.f8054x == 4294967295L) {
                        j = f0Var.m();
                    } else {
                        j = 0;
                    }
                    vVar2.f8054x = j;
                    v vVar3 = this.C;
                    if (vVar3.f8054x == 4294967295L) {
                        j11 = f0Var.m();
                    }
                    vVar3.f8054x = j11;
                } else {
                    throw new IOException("bad zip: zip64 extra too short");
                }
            } else {
                throw new IOException("bad zip: zip64 extra repeated");
            }
        }
        return y.f6101a;
    }
}

package cg;

import bg.f0;
import he.y;
import java.io.IOException;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.w;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i extends l implements p {
    public final /* synthetic */ w A;
    public final /* synthetic */ w B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2122x = 1;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f0 f2123y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ w f2124z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f0 f0Var, w wVar, w wVar2, w wVar3) {
        super(2);
        this.f2123y = f0Var;
        this.f2124z = wVar;
        this.A = wVar2;
        this.B = wVar3;
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        switch (this.f2122x) {
            case 0:
                int intValue = ((Number) obj).intValue();
                long longValue = ((Number) obj2).longValue();
                if (intValue == 1) {
                    w wVar = this.f2124z;
                    if (wVar.f8055x == null) {
                        if (longValue == 24) {
                            f0 f0Var = this.f2123y;
                            wVar.f8055x = Long.valueOf(f0Var.m());
                            this.A.f8055x = Long.valueOf(f0Var.m());
                            this.B.f8055x = Long.valueOf(f0Var.m());
                        } else {
                            throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                        }
                    } else {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                }
                return y.f6101a;
            default:
                int intValue2 = ((Number) obj).intValue();
                long longValue2 = ((Number) obj2).longValue();
                if (intValue2 == 21589) {
                    long j = 1;
                    if (longValue2 >= 1) {
                        f0 f0Var2 = this.f2123y;
                        byte readByte = f0Var2.readByte();
                        boolean z12 = false;
                        if ((readByte & 1) == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if ((readByte & 2) == 2) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((readByte & 4) == 4) {
                            z12 = true;
                        }
                        if (z10) {
                            j = 5;
                        }
                        if (z11) {
                            j += 4;
                        }
                        if (z12) {
                            j += 4;
                        }
                        if (longValue2 >= j) {
                            if (z10) {
                                this.f2124z.f8055x = Integer.valueOf(f0Var2.l());
                            }
                            if (z11) {
                                this.A.f8055x = Integer.valueOf(f0Var2.l());
                            }
                            if (z12) {
                                this.B.f8055x = Integer.valueOf(f0Var2.l());
                            }
                        } else {
                            throw new IOException("bad zip: extended timestamp extra too short");
                        }
                    } else {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                }
                return y.f6101a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(w wVar, f0 f0Var, w wVar2, w wVar3) {
        super(2);
        this.f2124z = wVar;
        this.f2123y = f0Var;
        this.A = wVar2;
        this.B = wVar3;
    }
}

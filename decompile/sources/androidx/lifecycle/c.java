package androidx.lifecycle;

import android.net.Uri;
import android.os.Parcelable;
import com.playfy.tv.helpers.PushService;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends ne.j implements ve.p {
    public final /* synthetic */ Object A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f890x;

    /* renamed from: y, reason: collision with root package name */
    public int f891y;

    /* renamed from: z, reason: collision with root package name */
    public Object f892z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, le.c cVar, int i6) {
        super(2, cVar);
        this.f890x = i6;
        this.A = obj;
        this.f892z = obj2;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        switch (this.f890x) {
            case 0:
                c cVar2 = new c((d) this.A, cVar, 0);
                cVar2.f892z = obj;
                return cVar2;
            case 1:
                return new c((p0) this.A, this.f892z, cVar, 1);
            case 2:
                c cVar3 = new c((List) this.A, cVar, 2);
                cVar3.f892z = obj;
                return cVar3;
            case 3:
                return new c((c6.h) this.A, cVar, 3);
            case 4:
                return new c((ve.p) this.A, this.f892z, cVar, 4);
            case 5:
                c cVar4 = new c((mc.d) this.A, cVar, 5);
                cVar4.f892z = obj;
                return cVar4;
            case 6:
                return new c((PushService) this.f892z, (String) this.A, cVar, 6, false);
            case 7:
                c cVar5 = new c((lf.b0) this.A, cVar, 7);
                cVar5.f892z = obj;
                return cVar5;
            case 8:
                c cVar6 = new c((lf.e) this.A, cVar, 8);
                cVar6.f892z = obj;
                return cVar6;
            case 9:
                c cVar7 = new c((lf.f) this.A, cVar, 9);
                cVar7.f892z = obj;
                return cVar7;
            case 10:
                c cVar8 = new c((kf.i) this.A, cVar, 10);
                cVar8.f892z = obj;
                return cVar8;
            case 11:
                return new c((Parcelable) this.f892z, (od.q) this.A, cVar, 11, false);
            case 12:
                return new c((Parcelable) this.f892z, (od.u) this.A, cVar, 12, false);
            case 13:
                c cVar9 = new c((od.c0) this.A, cVar, 13);
                cVar9.f892z = obj;
                return cVar9;
            case 14:
                return new c((Parcelable) this.f892z, (od.i0) this.A, cVar, 14, false);
            case 15:
                c cVar10 = new c((od.i0) this.A, cVar, 15);
                cVar10.f892z = obj;
                return cVar10;
            case 16:
                c cVar11 = new c((od.n0) this.A, cVar, 16);
                cVar11.f892z = obj;
                return cVar11;
            case 17:
                return new c((s4.a) this.f892z, (Uri) this.A, cVar, 17, false);
            case 18:
                return new c((x4.p0) this.f892z, (ve.a) this.A, cVar, 18, false);
            case 19:
                return new c((ve.p) this.f892z, (z4.r) this.A, cVar, 19, false);
            default:
                return new c((ve.p) this.f892z, (kotlin.jvm.internal.w) this.A, cVar, 20, false);
        }
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f890x) {
            case 0:
                return ((c) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 1:
                return ((c) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 2:
                return ((c) create((b1.z) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 3:
                return ((c) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 4:
                return ((c) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 5:
                return ((c) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 6:
                return ((c) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 7:
                ((c) create((kf.i) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
                return me.a.f8833x;
            case 8:
                return ((c) create((jf.v) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 9:
                return ((c) create((kf.i) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 10:
                return ((c) create(obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 11:
                return ((c) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 12:
                return ((c) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 13:
                return ((c) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 14:
                return ((c) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 15:
                return ((c) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 16:
                return ((c) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 17:
                return ((c) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 18:
                return ((c) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 19:
                return ((c) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            default:
                return ((c) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:333:0x05b5, code lost:
    
        if (r2.invoke(r0, r19) != r8) goto L342;
     */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04a6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:295:0x05b5 -> B:261:0x05b9). Please report as a decompilation issue!!! */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 1700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, le.c cVar, int i6, boolean z10) {
        super(2, cVar);
        this.f890x = i6;
        this.f892z = obj;
        this.A = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, le.c cVar, int i6) {
        super(2, cVar);
        this.f890x = i6;
        this.A = obj;
    }
}

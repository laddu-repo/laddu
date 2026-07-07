package dd;

import android.net.Uri;
import android.view.InputEvent;
import androidx.work.CoroutineWorker;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import gf.c0;
import gf.q;
import java.util.Map;
import jf.y;
import kd.p0;
import kf.h;
import kf.i;
import kotlin.jvm.internal.w;
import ne.j;
import od.i0;
import od.m;
import v6.k;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends j implements p {
    public Object A;
    public final /* synthetic */ Object B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f4091x;

    /* renamed from: y, reason: collision with root package name */
    public int f4092y;

    /* renamed from: z, reason: collision with root package name */
    public Object f4093z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(q qVar, p pVar, le.c cVar) {
        super(2, cVar);
        this.f4091x = 14;
        this.A = qVar;
        this.B = (j) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v24, types: [ne.j, ve.p] */
    /* JADX WARN: Type inference failed for: r2v27, types: [ne.j, ve.p] */
    /* JADX WARN: Type inference failed for: r2v6, types: [ne.j, ve.q] */
    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        switch (this.f4091x) {
            case 0:
                c cVar2 = new c((d) this.A, (String) this.B, cVar, 0);
                cVar2.f4093z = obj;
                return cVar2;
            case 1:
                c cVar3 = new c((mc.d) this.B, cVar, 1);
                cVar3.f4093z = obj;
                return cVar3;
            case 2:
                c cVar4 = new c((y) this.A, (VolumeSettingsChange) this.B, cVar, 2);
                cVar4.f4093z = obj;
                return cVar4;
            case 3:
                c cVar5 = new c((h) this.A, (ve.q) this.B, cVar);
                cVar5.f4093z = obj;
                return cVar5;
            case 4:
                c cVar6 = new c((k) this.A, (l6.k) this.B, cVar, 4);
                cVar6.f4093z = obj;
                return cVar6;
            case 5:
                c cVar7 = new c((i) this.A, (lf.e) this.B, cVar, 5);
                cVar7.f4093z = obj;
                return cVar7;
            case 6:
                c cVar8 = new c((kf.p) this.A, (i) this.B, cVar, 6);
                cVar8.f4093z = obj;
                return cVar8;
            case 7:
                c cVar9 = new c((od.j) this.A, (r7.a) this.B, cVar, 7);
                cVar9.f4093z = obj;
                return cVar9;
            case 8:
                c cVar10 = new c((m) this.A, (r7.a) this.B, cVar, 8);
                cVar10.f4093z = obj;
                return cVar10;
            case 9:
                c cVar11 = new c((p0) this.B, cVar, 9);
                cVar11.f4093z = obj;
                return cVar11;
            case 10:
                return new c((i0) this.A, (Map) this.B, cVar, 10);
            case 11:
                return new c((s4.a) this.f4093z, (Uri) this.A, (InputEvent) this.B, cVar);
            case 12:
                return new c((v5.j) this.A, (CoroutineWorker) this.B, cVar, 12);
            case 13:
                return new c((w) this.A, (z4.k) this.B, cVar, 13);
            case 14:
                c cVar12 = new c((q) this.A, (p) this.B, cVar);
                cVar12.f4093z = obj;
                return cVar12;
            case 15:
                c cVar13 = new c((z7.b) this.B, cVar, 15);
                cVar13.f4093z = obj;
                return cVar13;
            default:
                c cVar14 = new c((z7.b) this.A, (p) this.B, cVar);
                cVar14.f4093z = obj;
                return cVar14;
        }
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4091x) {
            case 0:
                return ((c) create((c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 1:
                return ((c) create((c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 2:
                return ((c) create((c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 3:
                return ((c) create((i) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 4:
                return ((c) create((c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 5:
                return ((c) create((c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 6:
                return ((c) create((c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 7:
                return ((c) create((c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 8:
                return ((c) create((c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 9:
                return ((c) create((c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 10:
                return ((c) create((c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 11:
                return ((c) create((c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 12:
                return ((c) create((c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 13:
                return ((c) create((c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 14:
                return ((c) create((c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            case 15:
                return ((c) create((c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
            default:
                return ((c) create((c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x039e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v66, types: [ne.j, ve.p] */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r2v71 */
    /* JADX WARN: Type inference failed for: r3v7, types: [jf.u, gf.a, jf.x] */
    /* JADX WARN: Type inference failed for: r7v16, types: [ne.j, ve.p] */
    /* JADX WARN: Type inference failed for: r7v18, types: [ne.j, ve.p] */
    /* JADX WARN: Type inference failed for: r7v3, types: [ne.j, ve.q] */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 1428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, le.c cVar, int i6) {
        super(2, cVar);
        this.f4091x = i6;
        this.A = obj;
        this.B = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, le.c cVar, int i6) {
        super(2, cVar);
        this.f4091x = i6;
        this.B = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(h hVar, ve.q qVar, le.c cVar) {
        super(2, cVar);
        this.f4091x = 3;
        this.A = hVar;
        this.B = (j) qVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(s4.a aVar, Uri uri, InputEvent inputEvent, le.c cVar) {
        super(2, cVar);
        this.f4091x = 11;
        this.f4093z = aVar;
        this.A = uri;
        this.B = inputEvent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(z7.b bVar, p pVar, le.c cVar) {
        super(2, cVar);
        this.f4091x = 16;
        this.A = bVar;
        this.B = (j) pVar;
    }
}

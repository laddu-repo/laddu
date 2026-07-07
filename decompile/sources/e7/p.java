package e7;

import android.graphics.PointF;
import b7.j0;
import j1.f0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p extends f0 {
    public final /* synthetic */ o7.b A;
    public final /* synthetic */ f0 B;
    public final /* synthetic */ g7.b C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o7.b bVar, f0 f0Var, g7.b bVar2) {
        super(22);
        this.A = bVar;
        this.B = f0Var;
        this.C = bVar2;
    }

    @Override // j1.f0
    public final Object T(o7.b bVar) {
        Object obj;
        float f3 = bVar.f10027a;
        float f10 = bVar.f10028b;
        String str = ((g7.b) bVar.f10032f).f5484a;
        String str2 = ((g7.b) bVar.f10033g).f5484a;
        float f11 = bVar.f10029c;
        float f12 = bVar.f10030d;
        float f13 = bVar.f10031e;
        o7.b bVar2 = this.A;
        bVar2.f10027a = f3;
        bVar2.f10028b = f10;
        bVar2.f10032f = str;
        bVar2.f10033g = str2;
        bVar2.f10029c = f11;
        bVar2.f10030d = f12;
        bVar2.f10031e = f13;
        String str3 = (String) ((j0) this.B.f6908z);
        if (bVar.f10030d == 1.0f) {
            obj = bVar.f10033g;
        } else {
            obj = bVar.f10032f;
        }
        g7.b bVar3 = (g7.b) obj;
        String str4 = bVar3.f5485b;
        float f14 = bVar3.f5486c;
        int i6 = bVar3.f5487d;
        int i10 = bVar3.f5488e;
        float f15 = bVar3.f5489f;
        float f16 = bVar3.f5490g;
        int i11 = bVar3.f5491h;
        int i12 = bVar3.f5492i;
        float f17 = bVar3.j;
        boolean z10 = bVar3.f5493k;
        PointF pointF = bVar3.f5494l;
        PointF pointF2 = bVar3.f5495m;
        g7.b bVar4 = this.C;
        bVar4.f5484a = str3;
        bVar4.f5485b = str4;
        bVar4.f5486c = f14;
        bVar4.f5487d = i6;
        bVar4.f5488e = i10;
        bVar4.f5489f = f15;
        bVar4.f5490g = f16;
        bVar4.f5491h = i11;
        bVar4.f5492i = i12;
        bVar4.j = f17;
        bVar4.f5493k = z10;
        bVar4.f5494l = pointF;
        bVar4.f5495m = pointF2;
        return bVar4;
    }
}

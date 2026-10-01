package m5;

import android.graphics.PointF;
import j5.i0;
import o9.v;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p extends p2.c {
    public final /* synthetic */ o5.b A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ v f8486y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ p2.c f8487z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(v vVar, p2.c cVar, o5.b bVar) {
        super(17);
        this.f8486y = vVar;
        this.f8487z = cVar;
        this.A = bVar;
    }

    @Override // p2.c
    public final Object l(v vVar) {
        float f = vVar.f10062a;
        float f4 = vVar.f10063b;
        String str = ((o5.b) vVar.f).f9930a;
        String str2 = ((o5.b) vVar.f10067g).f9930a;
        float f10 = vVar.f10064c;
        float f11 = vVar.f10065d;
        float f12 = vVar.f10066e;
        v vVar2 = this.f8486y;
        vVar2.f10062a = f;
        vVar2.f10063b = f4;
        vVar2.f = str;
        vVar2.f10067g = str2;
        vVar2.f10064c = f10;
        vVar2.f10065d = f11;
        vVar2.f10066e = f12;
        String str3 = (String) ((i0) this.f8487z.f10197x);
        o5.b bVar = (o5.b) (vVar.f10065d == 1.0f ? vVar.f10067g : vVar.f);
        String str4 = bVar.f9931b;
        float f13 = bVar.f9932c;
        int i = bVar.f9933d;
        int i10 = bVar.f9934e;
        float f14 = bVar.f;
        float f15 = bVar.f9935g;
        int i11 = bVar.f9936h;
        int i12 = bVar.i;
        float f16 = bVar.f9937j;
        boolean z2 = bVar.f9938k;
        PointF pointF = bVar.f9939l;
        PointF pointF2 = bVar.f9940m;
        o5.b bVar2 = this.A;
        bVar2.f9930a = str3;
        bVar2.f9931b = str4;
        bVar2.f9932c = f13;
        bVar2.f9933d = i;
        bVar2.f9934e = i10;
        bVar2.f = f14;
        bVar2.f9935g = f15;
        bVar2.f9936h = i11;
        bVar2.i = i12;
        bVar2.f9937j = f16;
        bVar2.f9938k = z2;
        bVar2.f9939l = pointF;
        bVar2.f9940m = pointF2;
        return bVar2;
    }
}

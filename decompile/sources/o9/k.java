package o9;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k extends com.bumptech.glide.c {
    @Override // com.bumptech.glide.c
    public final void r(v vVar, float f, float f4) {
        float f10 = f4 * f;
        vVar.d(f10, 180.0f, 90.0f);
        float f11 = f10 * 2.0f;
        r rVar = new r(0.0f, 0.0f, f11, f11);
        rVar.f = 180.0f;
        rVar.f10056g = 90.0f;
        ((ArrayList) vVar.f).add(rVar);
        p pVar = new p(rVar);
        vVar.a(180.0f);
        ((ArrayList) vVar.f10067g).add(pVar);
        vVar.f10065d = 270.0f;
        float f12 = (0.0f + f11) * 0.5f;
        float f13 = (f11 - 0.0f) / 2.0f;
        double d10 = 270.0f;
        vVar.f10063b = (((float) Math.cos(Math.toRadians(d10))) * f13) + f12;
        vVar.f10064c = (f13 * ((float) Math.sin(Math.toRadians(d10)))) + f12;
    }
}

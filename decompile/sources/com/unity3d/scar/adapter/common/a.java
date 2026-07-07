package com.unity3d.scar.adapter.common;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends g {
    /* JADX WARN: Type inference failed for: r1v1, types: [com.unity3d.scar.adapter.common.g, com.unity3d.scar.adapter.common.a] */
    public static a a(sd.c cVar) {
        String k8 = r4.a.k("Cannot show ad that is not loaded for placement ", cVar.f12287a);
        return new g(b.P, k8, cVar.f12287a, cVar.f12288b, k8);
    }

    @Override // com.unity3d.scar.adapter.common.g
    public final String getDomain() {
        return "GMA";
    }
}

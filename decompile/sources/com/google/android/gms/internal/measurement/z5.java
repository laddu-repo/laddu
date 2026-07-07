package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z5 extends h {

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f2549z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z5(String str, int i6) {
        super(str);
        this.f2549z = i6;
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n i(ic.s sVar, List list) {
        switch (this.f2549z) {
            case 0:
                return n.f2352a;
            case 1:
            case 2:
                return this;
            case 3:
                return new g(Double.valueOf(0.0d));
            default:
                return n.f2352a;
        }
    }
}

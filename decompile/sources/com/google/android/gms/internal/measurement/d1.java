package com.google.android.gms.internal.measurement;

import android.os.Parcel;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d1 extends y implements p0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hb.s f2180e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(y0 y0Var, hb.s sVar) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.f2180e = sVar;
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean a(int i6, Parcel parcel, Parcel parcel2) {
        if (i6 == 2) {
            e();
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void e() {
        this.f2180e.run();
    }
}

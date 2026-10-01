package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class fd extends id {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile double f2642z;

    @Override // com.google.android.gms.internal.measurement.id
    public final /* synthetic */ Object a() {
        return Double.valueOf(-3.0d);
    }

    @Override // com.google.android.gms.internal.measurement.id
    public final /* synthetic */ Object c(String str) {
        return Double.valueOf(Double.parseDouble(str));
    }

    @Override // com.google.android.gms.internal.measurement.id
    public final /* synthetic */ Object d(Object obj) {
        return (Double) obj;
    }

    @Override // com.google.android.gms.internal.measurement.id
    public final /* synthetic */ Object e() {
        return Double.valueOf(this.f2642z);
    }

    @Override // com.google.android.gms.internal.measurement.id
    public final /* synthetic */ void f(Object obj) {
        this.f2642z = ((Double) obj).doubleValue();
    }
}

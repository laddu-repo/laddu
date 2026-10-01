package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class ed extends id {
    public final boolean A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile boolean f2610z;

    public ed(String str, q7.h hVar, boolean z2) {
        super(str, hVar);
        this.A = z2;
    }

    @Override // com.google.android.gms.internal.measurement.id
    public final /* synthetic */ Object a() {
        return Boolean.valueOf(this.A);
    }

    @Override // com.google.android.gms.internal.measurement.id
    public final /* synthetic */ Object c(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // com.google.android.gms.internal.measurement.id
    public final /* synthetic */ Object d(Object obj) {
        return (Boolean) obj;
    }

    @Override // com.google.android.gms.internal.measurement.id
    public final /* synthetic */ Object e() {
        return Boolean.valueOf(this.f2610z);
    }

    @Override // com.google.android.gms.internal.measurement.id
    public final /* synthetic */ void f(Object obj) {
        this.f2610z = ((Boolean) obj).booleanValue();
    }
}

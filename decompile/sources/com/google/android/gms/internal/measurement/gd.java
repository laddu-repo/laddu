package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class gd extends id {
    public final long A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile long f2665z;

    public gd(String str, q7.h hVar, long j8) {
        super(str, hVar);
        this.A = j8;
    }

    @Override // com.google.android.gms.internal.measurement.id
    public final /* synthetic */ Object a() {
        return Long.valueOf(this.A);
    }

    @Override // com.google.android.gms.internal.measurement.id
    public final /* synthetic */ Object c(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // com.google.android.gms.internal.measurement.id
    public final /* synthetic */ Object d(Object obj) {
        return (Long) obj;
    }

    @Override // com.google.android.gms.internal.measurement.id
    public final /* synthetic */ Object e() {
        return Long.valueOf(this.f2665z);
    }

    @Override // com.google.android.gms.internal.measurement.id
    public final /* synthetic */ void f(Object obj) {
        this.f2665z = ((Long) obj).longValue();
    }
}

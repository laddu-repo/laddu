package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class hd extends id {
    public final String A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile String f2693z;

    public hd(String str, q7.h hVar, String str2) {
        super(str, hVar);
        this.A = str2;
    }

    @Override // com.google.android.gms.internal.measurement.id
    public final /* synthetic */ Object a() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.measurement.id
    public final /* synthetic */ Object d(Object obj) {
        return (String) obj;
    }

    @Override // com.google.android.gms.internal.measurement.id
    public final /* synthetic */ Object e() {
        return this.f2693z;
    }

    @Override // com.google.android.gms.internal.measurement.id
    public final /* synthetic */ void f(Object obj) {
        this.f2693z = (String) obj;
    }

    @Override // com.google.android.gms.internal.measurement.id
    public final /* bridge */ /* synthetic */ Object c(String str) {
        return str;
    }
}

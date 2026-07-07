package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class uh extends wh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wh f3148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wh f3149d;

    public uh(wh whVar, wh whVar2) {
        this.f3148c = whVar;
        this.f3149d = whVar2;
    }

    @Override // com.google.android.gms.internal.measurement.wh
    public final void a() {
        wh whVar = this.f3149d;
        try {
            this.f3148c.a();
        } finally {
            whVar.a();
        }
    }
}

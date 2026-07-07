package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import j6.x;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h implements f {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final g f2384x = new g(0);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2385v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f2386w;

    public h() {
        this.f2385v = 0;
        this.f2386w = new HashMap();
    }

    @Override // com.bumptech.glide.load.data.f
    public void b() {
        switch (this.f2385v) {
            case 1:
            case 2:
                break;
            default:
                ((x) this.f2386w).i();
                break;
        }
    }

    public ParcelFileDescriptor d() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f2386w).rewind();
    }

    @Override // com.bumptech.glide.load.data.f
    public Object n() {
        switch (this.f2385v) {
            case 1:
                return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f2386w).rewind();
            case 2:
                return this.f2386w;
            default:
                x xVar = (x) this.f2386w;
                xVar.reset();
                return xVar;
        }
    }

    public h(InputStream inputStream, d6.f fVar) {
        this.f2385v = 3;
        x xVar = new x(inputStream, fVar);
        this.f2386w = xVar;
        xVar.mark(5242880);
    }

    public h(ParcelFileDescriptor parcelFileDescriptor) {
        this.f2385v = 1;
        this.f2386w = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public h(Object obj) {
        this.f2385v = 2;
        this.f2386w = obj;
    }

    private final void a() {
    }

    private final void c() {
    }
}

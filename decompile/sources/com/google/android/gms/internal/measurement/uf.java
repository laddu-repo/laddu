package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uf implements da.a0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f3142v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a7.h f3143w;

    public /* synthetic */ uf(a7.h hVar, int i) {
        this.f3142v = i;
        this.f3143w = hVar;
    }

    @Override // da.a0
    public final ListenableFuture call() {
        switch (this.f3142v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                a7.h hVar = this.f3143w;
                da.a1 a1Var = (da.a1) hVar.f187d;
                try {
                    return da.o0.d(hVar.d((Uri) da.o0.b((ListenableFuture) hVar.f185b)));
                } catch (IOException e7) {
                    x9.k kVar = (x9.k) hVar.f;
                    kVar.getClass();
                    if ((e7 instanceof ff) || (e7.getCause() instanceof ff)) {
                        return da.o0.c(e7);
                    }
                    xf xfVar = (xf) kVar.f14293v;
                    xfVar.getClass();
                    return da.o0.f(!(e7.getCause() instanceof u1) ? da.o0.c(e7) : da.o0.a(da.o0.f(da.o0.d(xfVar.f3231a), zg.b(new tf(hVar, 2)), a1Var), IOException.class, new od(5, e7), da.f0.f4407v), zg.b(new tf(hVar, 1)), a1Var);
                }
            default:
                a7.h hVar2 = this.f3143w;
                return da.o0.e(da.o0.f((ListenableFuture) hVar2.f185b, zg.b(new tf(hVar2, 3)), (da.a1) hVar2.f187d));
        }
    }
}

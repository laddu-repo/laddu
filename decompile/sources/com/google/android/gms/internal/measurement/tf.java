package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tf implements da.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a7.h f3118b;

    public /* synthetic */ tf(a7.h hVar, int i) {
        this.f3117a = i;
        this.f3118b = hVar;
    }

    @Override // da.b0
    public final ListenableFuture apply(Object obj) throws IOException {
        ListenableFuture listenableFuture;
        switch (this.f3117a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                a7.h hVar = this.f3118b;
                synchronized (hVar.f190h) {
                    listenableFuture = (ListenableFuture) hVar.f191j;
                    break;
                }
                return listenableFuture;
            case 1:
                a7.h hVar2 = this.f3118b;
                return da.o0.d(hVar2.d((Uri) da.o0.b((ListenableFuture) hVar2.f185b)));
            case 2:
                a7.h hVar3 = this.f3118b;
                hVar3.e((Uri) da.o0.b((ListenableFuture) hVar3.f185b), obj);
                return da.r0.f4441w;
            default:
                a7.h hVar4 = this.f3118b;
                Uri uri = (Uri) obj;
                Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".bak")).build();
                try {
                    ye yeVar = (ye) hVar4.f188e;
                    we weVarB = yeVar.b(uriBuild);
                    if (weVarB.f3201a.b(weVarB.f3204d)) {
                        we weVarB2 = yeVar.b(uriBuild);
                        we weVarB3 = yeVar.b(uri);
                        of ofVar = weVarB2.f3201a;
                        if (ofVar != weVarB3.f3201a) {
                            throw new a6.c("Cannot rename file across backends");
                        }
                        ofVar.f(weVarB2.f3204d, weVarB3.f3204d);
                    }
                    return da.r0.f4441w;
                } catch (IOException e7) {
                    return da.o0.c(e7);
                }
        }
    }
}

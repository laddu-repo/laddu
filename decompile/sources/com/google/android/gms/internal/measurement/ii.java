package com.google.android.gms.internal.measurement;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class ii {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2763a;

    public /* synthetic */ ii(int i) {
        this.f2763a = i;
    }

    public final void a(sh shVar, Iterator it, ei eiVar) {
        switch (this.f2763a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return;
            default:
                if (!shVar.f3094c) {
                    throw new IllegalStateException("non repeating key");
                }
                if (!shVar.f3095d || ((f0) f0.f2625w.get()).f2626v <= 20) {
                    shVar.a(it, eiVar);
                    return;
                }
                while (it.hasNext()) {
                    eiVar.a(it.next(), shVar.f3092a);
                }
                return;
        }
    }

    private final void b(sh shVar, Iterator it, ei eiVar) {
    }
}

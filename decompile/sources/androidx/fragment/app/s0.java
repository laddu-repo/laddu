package androidx.fragment.app;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements androidx.lifecycle.r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1099a;

    @Override // androidx.lifecycle.r0
    public final androidx.lifecycle.o0 a(Class cls) {
        switch (this.f1099a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return new t0(true);
            default:
                return new s1.a();
        }
    }

    @Override // androidx.lifecycle.r0
    public final androidx.lifecycle.o0 b(Class cls, r1.c cVar) {
        switch (this.f1099a) {
        }
        return a(cls);
    }
}

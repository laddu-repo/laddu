package r4;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i implements a0, p4.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11195b;

    public /* synthetic */ i(int i, Object obj) {
        this.f11194a = i;
        this.f11195b = obj;
    }

    @Override // r4.a0
    public final v4.a a() {
        switch (this.f11194a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return ((n) this.f11195b).f11203b;
            default:
                return ((z) this.f11195b).f11236b;
        }
    }

    @Override // p4.m
    public final Object c(String str, ce.l lVar, ud.c cVar) {
        switch (this.f11194a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return ((n) this.f11195b).c(str, lVar, cVar);
            default:
                return ((z) this.f11195b).c(str, lVar, cVar);
        }
    }
}

package m5;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8489b;

    public /* synthetic */ q(int i, Object obj) {
        this.f8488a = i;
        this.f8489b = obj;
    }

    @Override // m5.a
    public final void b() {
        switch (this.f8488a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((r) this.f8489b).f8498k = true;
                break;
            case 1:
                ((r) this.f8489b).f8498k = true;
                break;
            case 2:
                ((r) this.f8489b).f8498k = true;
                break;
            default:
                r5.a aVar = (r5.a) this.f8489b;
                boolean z2 = aVar.f11255r.l() == 1.0f;
                if (z2 != aVar.f11261x) {
                    aVar.f11261x = z2;
                    aVar.f11252o.invalidateSelf();
                }
                break;
        }
    }
}

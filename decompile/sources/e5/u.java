package e5;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4836a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f4837b;

    public /* synthetic */ u() {
    }

    @Override // e5.q, e5.n
    public void f(p pVar) {
        switch (this.f4836a) {
            case 1:
                a aVar = (a) this.f4837b;
                if (!aVar.Y) {
                    aVar.G();
                    aVar.Y = true;
                }
                break;
        }
    }

    @Override // e5.n
    public final void g(p pVar) {
        switch (this.f4836a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                this.f4837b.z();
                pVar.x(this);
                break;
            default:
                a aVar = (a) this.f4837b;
                int i = aVar.X - 1;
                aVar.X = i;
                if (i == 0) {
                    aVar.Y = false;
                    aVar.m();
                }
                pVar.x(this);
                break;
        }
    }

    public u(p pVar) {
        this.f4837b = pVar;
    }
}

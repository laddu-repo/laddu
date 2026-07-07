package j5;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f6884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f6885c;

    public /* synthetic */ r(w wVar, float f, int i) {
        this.f6883a = i;
        this.f6884b = wVar;
        this.f6885c = f;
    }

    @Override // j5.v
    public final void run() {
        switch (this.f6883a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                w wVar = this.f6884b;
                j jVar = wVar.f6908v;
                float f = this.f6885c;
                if (jVar != null) {
                    v5.e eVar = wVar.f6909w;
                    eVar.i(eVar.E, v5.g.f(jVar.f6853l, jVar.f6854m, f));
                } else {
                    wVar.A.add(new r(wVar, f, 0));
                }
                break;
            case 1:
                w wVar2 = this.f6884b;
                j jVar2 = wVar2.f6908v;
                float f4 = this.f6885c;
                if (jVar2 != null) {
                    wVar2.s((int) v5.g.f(jVar2.f6853l, jVar2.f6854m, f4));
                } else {
                    wVar2.A.add(new r(wVar2, f4, 1));
                }
                break;
            default:
                this.f6884b.u(this.f6885c);
                break;
        }
    }
}

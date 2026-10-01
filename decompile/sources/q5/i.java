package q5;

import androidx.media3.decoder.DecoderInputBuffer;
import j5.w;
import l5.q;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10847a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p5.b f10849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p5.e f10851e;
    public final Object f;

    public i(String str, p5.b bVar, p5.b bVar2, p5.d dVar, boolean z2) {
        this.f10848b = str;
        this.f10849c = bVar;
        this.f10851e = bVar2;
        this.f = dVar;
        this.f10850d = z2;
    }

    @Override // q5.b
    public final l5.d a(w wVar, j5.j jVar, r5.a aVar) {
        switch (this.f10847a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return new l5.p(wVar, aVar, this);
            default:
                return new q(wVar, aVar, this);
        }
    }

    public String toString() {
        switch (this.f10847a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return "RectangleShape{position=" + this.f10851e + ", size=" + ((p5.e) this.f) + '}';
            default:
                return super.toString();
        }
    }

    public i(String str, p5.e eVar, p5.a aVar, p5.b bVar, boolean z2) {
        this.f10848b = str;
        this.f10851e = eVar;
        this.f = aVar;
        this.f10849c = bVar;
        this.f10850d = z2;
    }
}

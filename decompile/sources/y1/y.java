package y1;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y implements h {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h f14399v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f14400w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Uri f14401x;

    public y(h hVar) {
        hVar.getClass();
        this.f14399v = hVar;
        this.f14401x = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // y1.h
    public final void a(z zVar) {
        zVar.getClass();
        this.f14399v.a(zVar);
    }

    @Override // y1.h
    public final void close() {
        this.f14399v.close();
    }

    @Override // y1.h
    public final long h(k kVar) {
        h hVar = this.f14399v;
        this.f14401x = kVar.f14377a;
        Map map = Collections.EMPTY_MAP;
        try {
            return hVar.h(kVar);
        } finally {
            Uri uriS = hVar.s();
            if (uriS != null) {
                this.f14401x = uriS;
            }
            hVar.j();
        }
    }

    @Override // y1.h
    public final Map j() {
        return this.f14399v.j();
    }

    @Override // t1.g
    public final int read(byte[] bArr, int i, int i10) {
        int i11 = this.f14399v.read(bArr, i, i10);
        if (i11 != -1) {
            this.f14400w += (long) i11;
        }
        return i11;
    }

    @Override // y1.h
    public final Uri s() {
        return this.f14399v.s();
    }
}

package y1;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l implements h {
    public e A;
    public h B;
    public b0 C;
    public f D;
    public x E;
    public h F;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Context f14384v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f14385w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h f14386x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public q f14387y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public b f14388z;

    public l(Context context, h hVar) {
        this.f14384v = context.getApplicationContext();
        hVar.getClass();
        this.f14386x = hVar;
        this.f14385w = new ArrayList();
    }

    public static void d(h hVar, z zVar) {
        if (hVar != null) {
            hVar.a(zVar);
        }
    }

    @Override // y1.h
    public final void a(z zVar) {
        zVar.getClass();
        this.f14386x.a(zVar);
        this.f14385w.add(zVar);
        d(this.f14387y, zVar);
        d(this.f14388z, zVar);
        d(this.A, zVar);
        d(this.B, zVar);
        d(this.C, zVar);
        d(this.D, zVar);
        d(this.E, zVar);
    }

    public final void b(h hVar) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f14385w;
            if (i >= arrayList.size()) {
                return;
            }
            hVar.a((z) arrayList.get(i));
            i++;
        }
    }

    @Override // y1.h
    public final void close() {
        h hVar = this.F;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.F = null;
            }
        }
    }

    @Override // y1.h
    public final long h(k kVar) {
        w1.a.j(this.F == null);
        Uri uri = kVar.f14377a;
        String scheme = uri.getScheme();
        int i = w1.b0.f13686a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f14384v;
        if (zIsEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f14387y == null) {
                    q qVar = new q(false);
                    this.f14387y = qVar;
                    b(qVar);
                }
                this.F = this.f14387y;
            } else {
                if (this.f14388z == null) {
                    b bVar = new b(context);
                    this.f14388z = bVar;
                    b(bVar);
                }
                this.F = this.f14388z;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f14388z == null) {
                b bVar2 = new b(context);
                this.f14388z = bVar2;
                b(bVar2);
            }
            this.F = this.f14388z;
        } else if ("content".equals(scheme)) {
            if (this.A == null) {
                e eVar = new e(context);
                this.A = eVar;
                b(eVar);
            }
            this.F = this.A;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            h hVar = this.f14386x;
            if (zEquals) {
                if (this.B == null) {
                    try {
                        h hVar2 = (h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.B = hVar2;
                        b(hVar2);
                    } catch (ClassNotFoundException unused) {
                        w1.a.C("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e7) {
                        throw new RuntimeException("Error instantiating RTMP extension", e7);
                    }
                    if (this.B == null) {
                        this.B = hVar;
                    }
                }
                this.F = this.B;
            } else if ("udp".equals(scheme)) {
                if (this.C == null) {
                    b0 b0Var = new b0();
                    this.C = b0Var;
                    b(b0Var);
                }
                this.F = this.C;
            } else if ("data".equals(scheme)) {
                if (this.D == null) {
                    f fVar = new f(false);
                    this.D = fVar;
                    b(fVar);
                }
                this.F = this.D;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.E == null) {
                    x xVar = new x(context);
                    this.E = xVar;
                    b(xVar);
                }
                this.F = this.E;
            } else {
                this.F = hVar;
            }
        }
        return this.F.h(kVar);
    }

    @Override // y1.h
    public final Map j() {
        h hVar = this.F;
        return hVar == null ? Collections.EMPTY_MAP : hVar.j();
    }

    @Override // t1.g
    public final int read(byte[] bArr, int i, int i10) {
        h hVar = this.F;
        hVar.getClass();
        return hVar.read(bArr, i, i10);
    }

    @Override // y1.h
    public final Uri s() {
        h hVar = this.F;
        if (hVar == null) {
            return null;
        }
        return hVar.s();
    }
}

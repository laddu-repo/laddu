package w1;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m implements h {
    public r A;
    public b B;
    public e C;
    public h D;
    public c0 E;
    public f F;
    public y G;
    public h H;

    /* renamed from: x, reason: collision with root package name */
    public final Context f13550x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f13551y;

    /* renamed from: z, reason: collision with root package name */
    public final h f13552z;

    public m(Context context, h hVar) {
        this.f13550x = context.getApplicationContext();
        hVar.getClass();
        this.f13552z = hVar;
        this.f13551y = new ArrayList();
    }

    public static void c(h hVar, a0 a0Var) {
        if (hVar != null) {
            hVar.q(a0Var);
        }
    }

    public final void b(h hVar) {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f13551y;
            if (i6 < arrayList.size()) {
                hVar.q((a0) arrayList.get(i6));
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // w1.h
    public final void close() {
        h hVar = this.H;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.H = null;
            }
        }
    }

    @Override // w1.h
    public final void q(a0 a0Var) {
        a0Var.getClass();
        this.f13552z.q(a0Var);
        this.f13551y.add(a0Var);
        c(this.A, a0Var);
        c(this.B, a0Var);
        c(this.C, a0Var);
        c(this.D, a0Var);
        c(this.E, a0Var);
        c(this.F, a0Var);
        c(this.G, a0Var);
    }

    @Override // r1.i
    public final int read(byte[] bArr, int i6, int i10) {
        h hVar = this.H;
        hVar.getClass();
        return hVar.read(bArr, i6, i10);
    }

    @Override // w1.h
    public final Map u() {
        h hVar = this.H;
        if (hVar == null) {
            return Collections.EMPTY_MAP;
        }
        return hVar.u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [w1.h, w1.f, w1.c] */
    /* JADX WARN: Type inference failed for: r0v7, types: [w1.h, w1.r, w1.c] */
    @Override // w1.h
    public final long y(l lVar) {
        boolean z10;
        if (this.H == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        Uri uri = lVar.f13542a;
        String scheme = uri.getScheme();
        String str = u1.a0.f12750a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f13550x;
        if (!isEmpty && !Objects.equals(scheme2, "file")) {
            if ("asset".equals(scheme)) {
                if (this.B == null) {
                    b bVar = new b(context);
                    this.B = bVar;
                    b(bVar);
                }
                this.H = this.B;
            } else if (HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(scheme)) {
                if (this.C == null) {
                    e eVar = new e(context);
                    this.C = eVar;
                    b(eVar);
                }
                this.H = this.C;
            } else {
                boolean equals = "rtmp".equals(scheme);
                h hVar = this.f13552z;
                if (equals) {
                    if (this.D == null) {
                        try {
                            h hVar2 = (h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.D = hVar2;
                            b(hVar2);
                        } catch (ClassNotFoundException unused) {
                            u1.a.p("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e10) {
                            throw new RuntimeException("Error instantiating RTMP extension", e10);
                        }
                        if (this.D == null) {
                            this.D = hVar;
                        }
                    }
                    this.H = this.D;
                } else if ("udp".equals(scheme)) {
                    if (this.E == null) {
                        c0 c0Var = new c0(8000);
                        this.E = c0Var;
                        b(c0Var);
                    }
                    this.H = this.E;
                } else if (JsonStorageKeyNames.DATA_KEY.equals(scheme)) {
                    if (this.F == null) {
                        ?? cVar = new c(false);
                        this.F = cVar;
                        b(cVar);
                    }
                    this.H = this.F;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.H = hVar;
                } else {
                    if (this.G == null) {
                        y yVar = new y(context);
                        this.G = yVar;
                        b(yVar);
                    }
                    this.H = this.G;
                }
            }
        } else {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.B == null) {
                    b bVar2 = new b(context);
                    this.B = bVar2;
                    b(bVar2);
                }
                this.H = this.B;
            } else {
                if (this.A == null) {
                    ?? cVar2 = new c(false);
                    this.A = cVar2;
                    b(cVar2);
                }
                this.H = this.A;
            }
        }
        return this.H.y(lVar);
    }

    @Override // w1.h
    public final Uri z() {
        h hVar = this.H;
        if (hVar == null) {
            return null;
        }
        return hVar.z();
    }
}

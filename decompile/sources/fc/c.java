package fc;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.metrics.LogSessionId;
import android.os.Build;
import h2.t;
import h2.u;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w1.b0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c implements t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReference f5359e = new AtomicReference();
    public static final d2.e f = new d2.e(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f5360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaDrm f5361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5363d;

    public c(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = t1.e.f11980b;
        w1.a.c("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.f5360a = uuid;
        MediaDrm mediaDrm = new MediaDrm((b0.f13686a >= 27 || !uuid.equals(t1.e.f11981c)) ? uuid : uuid2);
        this.f5361b = mediaDrm;
        this.f5362c = 1;
        if (t1.e.f11982d.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // h2.t
    public final void a(byte[] bArr, byte[] bArr2) {
        this.f5361b.restoreKeys(bArr, bArr2);
    }

    @Override // h2.t
    public final Map b(byte[] bArr) {
        return this.f5361b.queryKeyStatus(bArr);
    }

    @Override // h2.t
    public final void c(byte[] bArr) {
        this.f5361b.closeSession(bArr);
    }

    @Override // h2.t
    public final void d(byte[] bArr, d2.l lVar) {
        if (b0.f13686a >= 31) {
            try {
                MediaDrm mediaDrm = this.f5361b;
                LogSessionId logSessionIdA = lVar.a();
                LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                    return;
                }
                MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
                playbackComponent.getClass();
                e2.t.k(playbackComponent).setLogSessionId(logSessionIdA);
            } catch (UnsupportedOperationException unused2) {
                w1.a.C("CustomFrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // h2.t
    public final byte[] e(byte[] bArr, byte[] bArr2) {
        if (t1.e.f11981c.equals(this.f5360a) && b0.f13686a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(b0.n(bArr2));
                StringBuilder sb2 = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb2.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb2.append("{\"k\":\"");
                    sb2.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kid\":\"");
                    sb2.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kty\":\"");
                    sb2.append(jSONObject2.getString("kty"));
                    sb2.append("\"}");
                }
                sb2.append("]}");
                bArr2 = sb2.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e7) {
                w1.a.p("ClearKeyUtil", "Failed to adjust response data: ".concat(b0.n(bArr2)), e7);
            }
        }
        return this.f5361b.provideKeyResponse(bArr, bArr2);
    }

    @Override // h2.t
    public final h2.s f() {
        MediaDrm.ProvisionRequest provisionRequest = this.f5361b.getProvisionRequest();
        return new h2.s(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // h2.t
    public final void g(byte[] bArr) throws DeniedByServerException {
        this.f5361b.provideProvisionResponse(bArr);
    }

    @Override // h2.t
    public final void h(a9.g gVar) {
        this.f5361b.setOnEventListener(new b(this, gVar, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bb  */
    @Override // h2.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final h2.r i(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instruction units count: 631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fc.c.i(byte[], java.util.List, int, java.util.HashMap):h2.r");
    }

    @Override // h2.t
    public final int j() {
        return 2;
    }

    @Override // h2.t
    public final a2.b k(byte[] bArr) {
        int i = b0.f13686a;
        UUID uuid = this.f5360a;
        if (i < 27 && Objects.equals(uuid, t1.e.f11981c)) {
            uuid = t1.e.f11980b;
        }
        return new u(uuid, bArr);
    }

    @Override // h2.t
    public final boolean l(String str, byte[] bArr) throws Throwable {
        boolean zEquals = false;
        if (!this.f5363d) {
            return false;
        }
        int i = b0.f13686a;
        UUID uuid = this.f5360a;
        if (i >= 31) {
            boolean zEquals2 = uuid.equals(t1.e.f11982d);
            MediaDrm mediaDrm = this.f5361b;
            if (zEquals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                if (!propertyString.startsWith("v5.") && !propertyString.startsWith("14.") && !propertyString.startsWith("15.") && !propertyString.startsWith("16.0")) {
                    zEquals = true;
                }
            } else {
                zEquals = uuid.equals(t1.e.f11981c);
            }
            if (zEquals) {
                return mediaDrm.requiresSecureDecoder(str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto = null;
        try {
            try {
                MediaCrypto mediaCrypto2 = new MediaCrypto((i >= 27 || !Objects.equals(uuid, t1.e.f11981c)) ? uuid : t1.e.f11980b, bArr);
                try {
                    boolean zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                    mediaCrypto2.release();
                    return zRequiresSecureDecoderComponent;
                } catch (MediaCryptoException unused) {
                    mediaCrypto = mediaCrypto2;
                    boolean z2 = !uuid.equals(t1.e.f11981c);
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    return z2;
                } catch (Throwable th) {
                    th = th;
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (MediaCryptoException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // h2.t
    public final byte[] m() {
        return this.f5361b.openSession();
    }

    @Override // h2.t
    public final synchronized void release() {
        int i = this.f5362c - 1;
        this.f5362c = i;
        if (i == 0) {
            this.f5361b.release();
        }
    }
}

package h2;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.metrics.LogSessionId;
import android.os.Build;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w1.b0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v implements t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d2.e f6108d = new d2.e(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f6109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaDrm f6110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6111c;

    public v(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = t1.e.f11980b;
        w1.a.c("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.f6109a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(t1.e.f11981c)) ? uuid : uuid2);
        this.f6110b = mediaDrm;
        this.f6111c = 1;
        if (t1.e.f11982d.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // h2.t
    public final void a(byte[] bArr, byte[] bArr2) {
        this.f6110b.restoreKeys(bArr, bArr2);
    }

    @Override // h2.t
    public final Map b(byte[] bArr) {
        return this.f6110b.queryKeyStatus(bArr);
    }

    @Override // h2.t
    public final void c(byte[] bArr) {
        this.f6110b.closeSession(bArr);
    }

    @Override // h2.t
    public final void d(byte[] bArr, d2.l lVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                MediaDrm mediaDrm = this.f6110b;
                LogSessionId logSessionIdA = lVar.a();
                LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                    return;
                }
                MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
                playbackComponent.getClass();
                e2.t.k(playbackComponent).setLogSessionId(logSessionIdA);
            } catch (UnsupportedOperationException unused2) {
                w1.a.C("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // h2.t
    public final byte[] e(byte[] bArr, byte[] bArr2) {
        if (t1.e.f11981c.equals(this.f6109a) && Build.VERSION.SDK_INT < 27) {
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
        return this.f6110b.provideKeyResponse(bArr, bArr2);
    }

    @Override // h2.t
    public final s f() {
        MediaDrm.ProvisionRequest provisionRequest = this.f6110b.getProvisionRequest();
        return new s(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // h2.t
    public final void g(byte[] bArr) throws DeniedByServerException {
        this.f6110b.provideProvisionResponse(bArr);
    }

    @Override // h2.t
    public final void h(a9.g gVar) {
        this.f6110b.setOnEventListener(new fc.b(this, gVar, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d0  */
    @Override // h2.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final h2.r i(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instruction units count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.v.i(byte[], java.util.List, int, java.util.HashMap):h2.r");
    }

    @Override // h2.t
    public final int j() {
        return 2;
    }

    @Override // h2.t
    public final a2.b k(byte[] bArr) {
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.f6109a;
        if (i < 27 && Objects.equals(uuid, t1.e.f11981c)) {
            uuid = t1.e.f11980b;
        }
        return new u(uuid, bArr);
    }

    @Override // h2.t
    public final boolean l(String str, byte[] bArr) throws Throwable {
        boolean zEquals;
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.f6109a;
        if (i >= 31) {
            boolean zEquals2 = uuid.equals(t1.e.f11982d);
            MediaDrm mediaDrm = this.f6110b;
            if (zEquals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                zEquals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
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
        return this.f6110b.openSession();
    }

    @Override // h2.t
    public final synchronized void release() {
        int i = this.f6111c - 1;
        this.f6111c = i;
        if (i == 0) {
            this.f6110b.release();
        }
    }
}

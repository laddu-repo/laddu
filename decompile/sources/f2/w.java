package f2;

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

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w implements t {
    public static final com.unity3d.ads.adplayer.b A = new com.unity3d.ads.adplayer.b(6);

    /* renamed from: x, reason: collision with root package name */
    public final UUID f4689x;

    /* renamed from: y, reason: collision with root package name */
    public final MediaDrm f4690y;

    /* renamed from: z, reason: collision with root package name */
    public int f4691z;

    public w(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = r1.g.f11400b;
        u1.c.a("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.f4689x = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(r1.g.f11401c)) ? uuid : uuid2);
        this.f4690y = mediaDrm;
        this.f4691z = 1;
        if (r1.g.f11402d.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // f2.t
    public final synchronized void a() {
        int i6 = this.f4691z - 1;
        this.f4691z = i6;
        if (i6 == 0) {
            this.f4690y.release();
        }
    }

    @Override // f2.t
    public final Map c(byte[] bArr) {
        return this.f4690y.queryKeyStatus(bArr);
    }

    @Override // f2.t
    public final void d(final k7.d dVar) {
        this.f4690y.setOnEventListener(new MediaDrm.OnEventListener() { // from class: f2.v
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i6, int i10, byte[] bArr2) {
                w wVar = w.this;
                k7.d dVar2 = dVar;
                wVar.getClass();
                c cVar = ((g) dVar2.f7747y).T;
                cVar.getClass();
                cVar.obtainMessage(i6, bArr).sendToTarget();
            }
        });
    }

    @Override // f2.t
    public final s g() {
        MediaDrm.ProvisionRequest provisionRequest = this.f4690y.getProvisionRequest();
        return new s(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // f2.t
    public final y1.b h(byte[] bArr) {
        int i6 = Build.VERSION.SDK_INT;
        UUID uuid = this.f4689x;
        if (i6 < 27 && Objects.equals(uuid, r1.g.f11401c)) {
            uuid = r1.g.f11400b;
        }
        return new u(uuid, bArr);
    }

    @Override // f2.t
    public final byte[] j() {
        return this.f4690y.openSession();
    }

    @Override // f2.t
    public final void k(byte[] bArr, byte[] bArr2) {
        this.f4690y.restoreKeys(bArr, bArr2);
    }

    @Override // f2.t
    public final void l(byte[] bArr) {
        this.f4690y.closeSession(bArr);
    }

    @Override // f2.t
    public final byte[] m(byte[] bArr, byte[] bArr2) {
        if (r1.g.f11401c.equals(this.f4689x) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(u1.a0.o(bArr2));
                StringBuilder sb2 = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                    if (i6 != 0) {
                        sb2.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i6);
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
            } catch (JSONException e10) {
                u1.a.h("ClearKeyUtil", "Failed to adjust response data: ".concat(u1.a0.o(bArr2)), e10);
            }
        }
        return this.f4690y.provideKeyResponse(bArr, bArr2);
    }

    @Override // f2.t
    public final void n(byte[] bArr) {
        this.f4690y.provideProvisionResponse(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x01bf, code lost:
    
        if (r6 != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0254, code lost:
    
        if (java.util.Objects.equals(r3, "aidl-1") == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b9, code lost:
    
        if ("AFTT".equals(r6) == false) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x026e  */
    @Override // f2.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final f2.r o(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.w.o(byte[], java.util.List, int, java.util.HashMap):f2.r");
    }

    @Override // f2.t
    public final int p() {
        return 2;
    }

    @Override // f2.t
    public final void q(byte[] bArr, b2.m mVar) {
        boolean equals;
        MediaDrm.PlaybackComponent playbackComponent;
        LogSessionId unused;
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                MediaDrm mediaDrm = this.f4690y;
                LogSessionId a10 = mVar.a();
                unused = LogSessionId.LOG_SESSION_ID_NONE;
                equals = a10.equals(LogSessionId.LOG_SESSION_ID_NONE);
                if (!equals) {
                    playbackComponent = mediaDrm.getPlaybackComponent(bArr);
                    playbackComponent.getClass();
                    c2.a.m(playbackComponent).setLogSessionId(a10);
                }
            } catch (UnsupportedOperationException unused2) {
                u1.a.p("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // f2.t
    public final boolean r(String str, byte[] bArr) {
        UUID uuid;
        boolean equals;
        int securityLevel;
        boolean requiresSecureDecoder;
        int i6 = Build.VERSION.SDK_INT;
        UUID uuid2 = this.f4689x;
        if (i6 >= 31) {
            boolean equals2 = uuid2.equals(r1.g.f11402d);
            MediaDrm mediaDrm = this.f4690y;
            if (equals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                if (!propertyString.startsWith("v5.") && !propertyString.startsWith("14.") && !propertyString.startsWith("15.") && !propertyString.startsWith("16.0")) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = uuid2.equals(r1.g.f11401c);
            }
            if (equals) {
                securityLevel = mediaDrm.getSecurityLevel(bArr);
                requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str, securityLevel);
                return requiresSecureDecoder;
            }
        }
        MediaCrypto mediaCrypto = null;
        try {
            try {
                if (i6 < 27 && Objects.equals(uuid2, r1.g.f11401c)) {
                    uuid = r1.g.f11400b;
                } else {
                    uuid = uuid2;
                }
                MediaCrypto mediaCrypto2 = new MediaCrypto(uuid, bArr);
                try {
                    boolean requiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                    mediaCrypto2.release();
                    return requiresSecureDecoderComponent;
                } catch (MediaCryptoException unused) {
                    mediaCrypto = mediaCrypto2;
                    boolean z10 = !uuid2.equals(r1.g.f11401c);
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    return z10;
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
}

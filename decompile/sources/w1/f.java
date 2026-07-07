package w1;

import android.net.Uri;
import android.util.Base64;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import r1.l0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends c {
    public l B;
    public byte[] C;
    public int D;
    public int E;

    @Override // w1.h
    public final void close() {
        if (this.C != null) {
            this.C = null;
            c();
        }
        this.B = null;
    }

    @Override // r1.i
    public final int read(byte[] bArr, int i6, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.E;
        if (i11 == 0) {
            return -1;
        }
        int min = Math.min(i10, i11);
        byte[] bArr2 = this.C;
        String str = u1.a0.f12750a;
        System.arraycopy(bArr2, this.D, bArr, i6, min);
        this.D += min;
        this.E -= min;
        b(min);
        return min;
    }

    @Override // w1.h
    public final long y(l lVar) {
        f();
        this.B = lVar;
        Uri uri = lVar.f13542a;
        long j = lVar.f13547f;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        u1.c.a("Unsupported scheme: " + scheme, JsonStorageKeyNames.DATA_KEY.equals(scheme));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = u1.a0.f12750a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str2 = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.C = Base64.decode(str2, 0);
                } catch (IllegalArgumentException e10) {
                    throw new l0(r4.a.k("Error while parsing Base64 encoded string: ", str2), e10, true, 0);
                }
            } else {
                this.C = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            }
            long j10 = lVar.f13546e;
            byte[] bArr = this.C;
            if (j10 <= bArr.length) {
                int i6 = (int) j10;
                this.D = i6;
                int length = bArr.length - i6;
                this.E = length;
                if (j != -1) {
                    this.E = (int) Math.min(length, j);
                }
                g(lVar);
                if (j != -1) {
                    return j;
                }
                return this.E;
            }
            this.C = null;
            throw new j(2008);
        }
        throw new l0("Unexpected URI format: " + normalizeScheme, null, true, 0);
    }

    @Override // w1.h
    public final Uri z() {
        l lVar = this.B;
        if (lVar != null) {
            return lVar.f13542a;
        }
        return null;
    }
}

package g8;

import android.util.Base64;
import androidx.lifecycle.j1;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f5539a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f5540b;

    /* renamed from: c, reason: collision with root package name */
    public final d8.d f5541c;

    public i(String str, byte[] bArr, d8.d dVar) {
        this.f5539a = str;
        this.f5540b = bArr;
        this.f5541c = dVar;
    }

    public static j1 a() {
        j1 j1Var = new j1(16);
        j1Var.A = d8.d.f3973x;
        return j1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f5539a.equals(iVar.f5539a) && Arrays.equals(this.f5540b, iVar.f5540b) && this.f5541c.equals(iVar.f5541c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f5539a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5540b)) * 1000003) ^ this.f5541c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f5540b;
        if (bArr == null) {
            encodeToString = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f5539a);
        sb2.append(", ");
        sb2.append(this.f5541c);
        sb2.append(", ");
        return r4.a.o(sb2, encodeToString, ")");
    }
}

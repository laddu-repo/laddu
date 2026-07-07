package w1;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import r1.f0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f13542a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13543b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f13544c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f13545d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13546e;

    /* renamed from: f, reason: collision with root package name */
    public final long f13547f;

    /* renamed from: g, reason: collision with root package name */
    public final String f13548g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13549h;

    static {
        f0.a("media3.datasource");
    }

    public l(Uri uri) {
        this(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0);
    }

    public static String b(int i6) {
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    return "HEAD";
                }
                throw new IllegalStateException();
            }
            return "POST";
        }
        return "GET";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, g4.c] */
    public final g4.c a() {
        ?? obj = new Object();
        obj.f5438e = this.f13542a;
        obj.f5434a = this.f13543b;
        obj.f5439f = this.f13544c;
        obj.f5440g = this.f13545d;
        obj.f5435b = this.f13546e;
        obj.f5436c = this.f13547f;
        obj.f5441h = this.f13548g;
        obj.f5437d = this.f13549h;
        return obj;
    }

    public final l c(long j) {
        long j10 = this.f13547f;
        long j11 = -1;
        if (j10 != -1) {
            j11 = j10 - j;
        }
        long j12 = j11;
        if (j == 0 && j10 == j12) {
            return this;
        }
        return new l(this.f13542a, this.f13543b, this.f13544c, this.f13545d, this.f13546e + j, j12, this.f13548g, this.f13549h);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        sb2.append(b(this.f13543b));
        sb2.append(" ");
        sb2.append(this.f13542a);
        sb2.append(", ");
        sb2.append(this.f13546e);
        sb2.append(", ");
        sb2.append(this.f13547f);
        sb2.append(", ");
        sb2.append(this.f13548g);
        sb2.append(", ");
        return r4.a.l(sb2, this.f13549h, "]");
    }

    public l(Uri uri, int i6, byte[] bArr, Map map, long j, long j10, String str, int i10) {
        u1.c.b(j >= 0);
        u1.c.b(j >= 0);
        u1.c.b(j10 > 0 || j10 == -1);
        uri.getClass();
        this.f13542a = uri;
        this.f13543b = i6;
        this.f13544c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f13545d = Collections.unmodifiableMap(new HashMap(map));
        this.f13546e = j;
        this.f13547f = j10;
        this.f13548g = str;
        this.f13549h = i10;
    }
}

package r1;

import java.io.IOException;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class l0 extends IOException {

    /* renamed from: x, reason: collision with root package name */
    public final boolean f11578x;

    /* renamed from: y, reason: collision with root package name */
    public final int f11579y;

    public l0(String str, Throwable th, boolean z10, int i6) {
        super(str, th);
        this.f11578x = z10;
        this.f11579y = i6;
    }

    public static l0 a(RuntimeException runtimeException, String str) {
        return new l0(str, runtimeException, true, 1);
    }

    public static l0 b(String str, Exception exc) {
        return new l0(str, exc, true, 4);
    }

    public static l0 c(String str) {
        return new l0(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String message = super.getMessage();
        StringBuilder sb2 = new StringBuilder();
        if (message != null) {
            str = message.concat(" ");
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb2.append(str);
        sb2.append("{contentIsMalformed=");
        sb2.append(this.f11578x);
        sb2.append(", dataType=");
        return r4.a.l(sb2, this.f11579y, "}");
    }
}

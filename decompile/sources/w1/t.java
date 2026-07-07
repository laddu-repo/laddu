package w1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class t extends j {

    /* renamed from: z, reason: collision with root package name */
    public final int f13555z;

    public t(int i6) {
        super(i6 == 2000 ? 2001 : i6);
        this.f13555z = 1;
    }

    public static t a(IOException iOException, int i6) {
        int i10;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i10 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i10 = 1004;
        } else if (message != null && dg.b.p(message).matches("cleartext.*not permitted.*")) {
            i10 = 2007;
        } else {
            i10 = 2001;
        }
        if (i10 == 2007) {
            return new t("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007);
        }
        return new t(iOException, i10, i6);
    }

    public t(String str, int i6) {
        super(str, i6 == 2000 ? 2001 : i6);
        this.f13555z = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t(java.io.IOException r2, int r3, int r4) {
        /*
            r1 = this;
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r3 != r0) goto L9
            r0 = 1
            if (r4 != r0) goto L9
            r3 = 2001(0x7d1, float:2.804E-42)
        L9:
            r1.<init>(r2, r3)
            r1.f13555z = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.t.<init>(java.io.IOException, int, int):void");
    }

    public t(String str, IOException iOException, int i6) {
        super(str, iOException, i6 == 2000 ? 2001 : i6);
        this.f13555z = 1;
    }
}

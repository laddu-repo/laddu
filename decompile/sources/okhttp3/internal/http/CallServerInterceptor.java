package okhttp3.internal.http;

import okhttp3.Interceptor;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z10) {
        this.forWebSocket = z10;
    }

    private final boolean shouldIgnoreAndWaitForRealResponse(int i6) {
        if (i6 == 100) {
            return true;
        }
        if (102 <= i6 && i6 < 200) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e6 A[Catch: IOException -> 0x00b9, TryCatch #0 {IOException -> 0x00b9, blocks: (B:65:0x00ab, B:67:0x00b4, B:23:0x00bc, B:25:0x00e6, B:27:0x00ef, B:28:0x00f2, B:29:0x0116, B:33:0x0121, B:34:0x0140, B:36:0x014e, B:44:0x0164, B:46:0x016a, B:49:0x0177, B:51:0x018c, B:52:0x0194, B:53:0x019e, B:62:0x0159, B:63:0x0130), top: B:64:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016a A[Catch: IOException -> 0x00b9, TryCatch #0 {IOException -> 0x00b9, blocks: (B:65:0x00ab, B:67:0x00b4, B:23:0x00bc, B:25:0x00e6, B:27:0x00ef, B:28:0x00f2, B:29:0x0116, B:33:0x0121, B:34:0x0140, B:36:0x014e, B:44:0x0164, B:46:0x016a, B:49:0x0177, B:51:0x018c, B:52:0x0194, B:53:0x019e, B:62:0x0159, B:63:0x0130), top: B:64:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0177 A[Catch: IOException -> 0x00b9, TryCatch #0 {IOException -> 0x00b9, blocks: (B:65:0x00ab, B:67:0x00b4, B:23:0x00bc, B:25:0x00e6, B:27:0x00ef, B:28:0x00f2, B:29:0x0116, B:33:0x0121, B:34:0x0140, B:36:0x014e, B:44:0x0164, B:46:0x016a, B:49:0x0177, B:51:0x018c, B:52:0x0194, B:53:0x019e, B:62:0x0159, B:63:0x0130), top: B:64:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a8  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r14) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.CallServerInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}

package t1;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class g0 extends IOException {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f11995v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f11996w;

    public g0(String str, Throwable th, boolean z2, int i) {
        super(str, th);
        this.f11995v = z2;
        this.f11996w = i;
    }

    public static g0 a(RuntimeException runtimeException, String str) {
        return new g0(str, runtimeException, true, 1);
    }

    public static g0 b(String str, Exception exc) {
        return new g0(str, exc, true, 4);
    }

    public static g0 c(String str) {
        return new g0(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(message != null ? message.concat(" ") : "");
        sb2.append("{contentIsMalformed=");
        sb2.append(this.f11995v);
        sb2.append(", dataType=");
        return j4.a.l(this.f11996w, "}", sb2);
    }
}

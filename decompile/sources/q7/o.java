package q7;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import t7.y;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f10923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f10925c;

    public /* synthetic */ o(boolean z2, String str, n nVar) {
        this.f10923a = z2;
        this.f10924b = str;
        this.f10925c = nVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        boolean z2 = this.f10923a;
        String str = this.f10924b;
        n nVar = this.f10925c;
        String str2 = (z2 || !q.c(str, nVar, true, false).f10941a) ? "not allowed" : "debug cert rejected";
        int i = 0;
        while (true) {
            if (i >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                break;
            }
            i++;
        }
        y.g(messageDigest);
        byte[] bArrDigest = messageDigest.digest(nVar.f);
        int length = bArrDigest.length;
        char[] cArr = new char[length + length];
        int i10 = 0;
        for (byte b9 : bArrDigest) {
            char[] cArr2 = x7.b.f14254b;
            cArr[i10] = cArr2[(b9 & 255) >>> 4];
            cArr[i10 + 1] = cArr2[b9 & 15];
            i10 += 2;
        }
        return str2 + ": pkg=" + str + ", sha256=" + new String(cArr) + ", atk=" + z2 + ", ver=12451000.false";
    }
}

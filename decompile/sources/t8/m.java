package t8;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f12651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12652b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f12653c;

    public /* synthetic */ m(boolean z10, String str, p pVar) {
        this.f12651a = z10;
        this.f12652b = str;
        this.f12653c = pVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        MessageDigest messageDigest;
        boolean z10 = this.f12651a;
        String str2 = this.f12652b;
        p pVar = this.f12653c;
        if (!z10 && r.b(str2, pVar, true, false).f12670a) {
            str = "debug cert rejected";
        } else {
            str = "not allowed";
        }
        int i6 = 0;
        while (true) {
            if (i6 < 2) {
                try {
                    messageDigest = MessageDigest.getInstance("SHA-256");
                } catch (NoSuchAlgorithmException unused) {
                }
                if (messageDigest != null) {
                    break;
                }
                i6++;
            } else {
                messageDigest = null;
                break;
            }
        }
        x.g(messageDigest);
        byte[] digest = messageDigest.digest(pVar.f12658g);
        int length = digest.length;
        char[] cArr = new char[length + length];
        int i10 = 0;
        for (byte b10 : digest) {
            char[] cArr2 = a9.b.f631b;
            cArr[i10] = cArr2[(b10 & 255) >>> 4];
            cArr[i10 + 1] = cArr2[b10 & 15];
            i10 += 2;
        }
        return str + ": pkg=" + str2 + ", sha256=" + new String(cArr) + ", atk=" + z10 + ", ver=12451000.false";
    }
}

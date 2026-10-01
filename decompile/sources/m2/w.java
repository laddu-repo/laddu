package m2;

import android.net.Uri;
import android.util.Base64;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final l f8544a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f8545b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0589, code lost:
    
        if (r2.equals("audio/amr-wb") != false) goto L145;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0216. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0138. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0305  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public w(m2.o r39, m2.c r40, android.net.Uri r41) {
        /*
            Method dump skipped, instructions count: 2008
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.w.<init>(m2.o, m2.c, android.net.Uri):void");
    }

    public static byte[] a(String str) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length + 4];
        System.arraycopy(v1.o.f13247a, 0, bArr, 0, 4);
        System.arraycopy(decode, 0, bArr, 4, decode.length);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (this.f8544a.equals(wVar.f8544a) && this.f8545b.equals(wVar.f8545b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8545b.hashCode() + ((this.f8544a.hashCode() + 217) * 31);
    }
}

package h2;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u implements a2.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f6105c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f6106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f6107b;

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    static {
        /*
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1c
            java.lang.String r1 = "AFTB"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
        L1c:
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            h2.u.f6105c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.u.<clinit>():void");
    }

    public u(UUID uuid, byte[] bArr) {
        this.f6106a = uuid;
        this.f6107b = bArr;
    }
}

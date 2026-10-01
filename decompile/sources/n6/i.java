package n6;

import a6.k;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f9009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d6.f f9010c;

    public i(ArrayList arrayList, a aVar, d6.f fVar) {
        this.f9008a = arrayList;
        this.f9009b = aVar;
        this.f9010c = fVar;
    }

    @Override // a6.k
    public final boolean a(Object obj, a6.i iVar) {
        return !((Boolean) iVar.c(h.f9007b)).booleanValue() && a.a.o(this.f9008a, (InputStream) obj, this.f9010c) == ImageHeaderParser$ImageType.GIF;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // a6.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final c6.b0 b(java.lang.Object r6, int r7, int r8, a6.i r9) {
        /*
            r5 = this;
            java.io.InputStream r6 = (java.io.InputStream) r6
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 16384(0x4000, float:2.2959E-41)
            r0.<init>(r1)
            r2 = 0
            byte[] r1 = new byte[r1]     // Catch: java.io.IOException -> L18
        Lc:
            int r3 = r6.read(r1)     // Catch: java.io.IOException -> L18
            r4 = -1
            if (r3 == r4) goto L1a
            r4 = 0
            r0.write(r1, r4, r3)     // Catch: java.io.IOException -> L18
            goto Lc
        L18:
            r6 = move-exception
            goto L22
        L1a:
            r0.flush()     // Catch: java.io.IOException -> L18
            byte[] r6 = r0.toByteArray()
            goto L31
        L22:
            r0 = 5
            java.lang.String r1 = "StreamGifDecoder"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L30
            java.lang.String r0 = "Error reading data from stream"
            android.util.Log.w(r1, r0, r6)
        L30:
            r6 = r2
        L31:
            if (r6 != 0) goto L34
            goto L3e
        L34:
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            n6.a r0 = r5.f9009b
            c6.b0 r2 = r0.b(r6, r7, r8, r9)
        L3e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.i.b(java.lang.Object, int, int, a6.i):c6.b0");
    }
}

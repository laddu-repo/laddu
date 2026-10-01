package j6;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f6972b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(a6.f.f155a);

    @Override // a6.f
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f6972b);
    }

    @Override // j6.e
    public final Bitmap c(d6.a aVar, Bitmap bitmap, int i, int i10) {
        return z.b(aVar, bitmap, i, i10);
    }

    @Override // a6.f
    public final boolean equals(Object obj) {
        return obj instanceof u;
    }

    @Override // a6.f
    public final int hashCode() {
        return 1572326941;
    }
}

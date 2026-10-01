package j6;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f6945b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(a6.f.f155a);

    @Override // a6.f
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f6945b);
    }

    @Override // j6.e
    public final Bitmap c(d6.a aVar, Bitmap bitmap, int i, int i10) {
        float width;
        float height;
        Paint paint = z.f6986a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i10) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i10 > bitmap.getHeight() * i) {
            width = i10 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i10 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapE = aVar.e(i, i10, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapE.setHasAlpha(bitmap.hasAlpha());
        z.a(bitmap, bitmapE, matrix);
        return bitmapE;
    }

    @Override // a6.f
    public final boolean equals(Object obj) {
        return obj instanceof h;
    }

    @Override // a6.f
    public final int hashCode() {
        return -599754482;
    }
}

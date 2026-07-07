package j6;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t implements a6.e {
    @Override // a6.e
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // a6.e
    public final boolean b(ByteBuffer byteBuffer, d6.f fVar) {
        return false;
    }

    @Override // a6.e
    public final int c(InputStream inputStream, d6.f fVar) {
        int iE;
        l1.g gVar = new l1.g(inputStream);
        l1.c cVarC = gVar.c("Orientation");
        if (cVarC == null) {
            iE = 1;
        } else {
            try {
                iE = cVarC.e(gVar.f);
            } catch (NumberFormatException unused) {
                iE = 1;
            }
        }
        if (iE == 0) {
            return -1;
        }
        return iE;
    }

    @Override // a6.e
    public final boolean d(InputStream inputStream, d6.f fVar) {
        return false;
    }

    @Override // a6.e
    public final ImageHeaderParser$ImageType e(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // a6.e
    public final int f(ByteBuffer byteBuffer, d6.f fVar) {
        AtomicReference atomicReference = v6.b.f13215a;
        return c(new v6.a(byteBuffer), fVar);
    }
}

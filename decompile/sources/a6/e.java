package a6;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public interface e {
    ImageHeaderParser$ImageType a(ByteBuffer byteBuffer);

    boolean b(ByteBuffer byteBuffer, d6.f fVar);

    int c(InputStream inputStream, d6.f fVar);

    boolean d(InputStream inputStream, d6.f fVar);

    ImageHeaderParser$ImageType e(InputStream inputStream);

    int f(ByteBuffer byteBuffer, d6.f fVar);
}

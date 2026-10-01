package i2;

import android.graphics.Point;
import com.google.android.gms.internal.measurement.a4;
import com.google.protobuf.CodedOutputStream;
import com.playfy.tv.activities.PlayerActivity;
import java.io.IOException;
import java.nio.ByteBuffer;
import r1.l0;
import r1.q;
import u1.a0;
import y1.h;
import y1.j;
import y1.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends k {

    /* renamed from: o, reason: collision with root package name */
    public final PlayerActivity f6278o;

    /* renamed from: p, reason: collision with root package name */
    public final int f6279p;

    public b(PlayerActivity playerActivity) {
        super(new h[1], new a[1]);
        this.f6278o = playerActivity;
        this.f6279p = -1;
    }

    @Override // y1.k
    public final h g() {
        return new h(1, 0);
    }

    @Override // y1.e
    public final String getName() {
        return "BitmapFactoryImageDecoder";
    }

    @Override // y1.k
    public final j h() {
        return new a(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y1.f, java.lang.Exception] */
    @Override // y1.k
    public final y1.f i(Throwable th) {
        return new Exception("Unexpected decode error", th);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [y1.f, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r8v3, types: [y1.f, java.lang.Exception] */
    @Override // y1.k
    public final y1.f j(h hVar, j jVar, boolean z10) {
        boolean z11;
        a aVar = (a) jVar;
        ByteBuffer byteBuffer = hVar.f14812z;
        byteBuffer.getClass();
        u1.c.g(byteBuffer.hasArray());
        if (byteBuffer.arrayOffset() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        u1.c.b(z11);
        try {
            int i6 = this.f6279p;
            if (i6 == -1) {
                PlayerActivity playerActivity = this.f6278o;
                if (playerActivity != null) {
                    Point w10 = a0.w(playerActivity);
                    int i10 = w10.x;
                    int i11 = w10.y;
                    q qVar = hVar.f14810x;
                    if (qVar != null) {
                        int i12 = qVar.M;
                        if (i12 != -1) {
                            i10 *= i12;
                        }
                        int i13 = qVar.N;
                        if (i13 != -1) {
                            i11 *= i13;
                        }
                    }
                    i6 = (Math.max(i10, i11) * 2) - 1;
                } else {
                    i6 = CodedOutputStream.DEFAULT_BUFFER_SIZE;
                }
            }
            aVar.f6276x = a4.f(byteBuffer.array(), byteBuffer.remaining(), i6);
            aVar.timeUs = hVar.B;
            return null;
        } catch (l0 e10) {
            return new Exception("Could not decode image data with BitmapFactory.", e10);
        } catch (IOException e11) {
            return new Exception(e11);
        }
    }
}

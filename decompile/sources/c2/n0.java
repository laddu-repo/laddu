package c2;

import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n0 extends s1.h {

    /* renamed from: i, reason: collision with root package name */
    public static final int f1905i = Float.floatToIntBits(Float.NaN);

    public static void k(int i6, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i6 * 4.656612875245797E-10d));
        if (floatToIntBits == f1905i) {
            floatToIntBits = Float.floatToIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // s1.h
    public final s1.e a(s1.e eVar) {
        int i6 = eVar.f11984c;
        if (i6 != 21 && i6 != 1342177280 && i6 != 22 && i6 != 1610612736 && i6 != 4) {
            throw new s1.f(eVar);
        }
        if (i6 != 4) {
            return new s1.e(eVar.f11982a, eVar.f11983b, 4);
        }
        return s1.e.f11981e;
    }

    @Override // s1.g
    public final void f(ByteBuffer byteBuffer) {
        ByteBuffer j;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i6 = limit - position;
        int i10 = this.f11987b.f11984c;
        if (i10 != 21) {
            if (i10 != 22) {
                if (i10 != 1342177280) {
                    if (i10 == 1610612736) {
                        j = j(i6);
                        while (position < limit) {
                            k((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), j);
                            position += 4;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    j = j((i6 / 3) * 4);
                    while (position < limit) {
                        k(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), j);
                        position += 3;
                    }
                }
            } else {
                j = j(i6);
                while (position < limit) {
                    k((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), j);
                    position += 4;
                }
            }
        } else {
            j = j((i6 / 3) * 4);
            while (position < limit) {
                k(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), j);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        j.flip();
    }
}

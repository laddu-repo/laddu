package androidx.datastore.preferences.protobuf;

import androidx.media3.decoder.DecoderInputBuffer;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends g1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f760b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(Unsafe unsafe, int i) {
        super(unsafe);
        this.f760b = i;
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final boolean c(long j8, Object obj) {
        switch (this.f760b) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                if (!h1.f783g) {
                }
                break;
            default:
                if (!h1.f783g) {
                }
                break;
        }
        return h1.c(j8, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final double d(long j8, Object obj) {
        switch (this.f760b) {
        }
        return Double.longBitsToDouble(g(j8, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final float e(long j8, Object obj) {
        switch (this.f760b) {
        }
        return Float.intBitsToFloat(f(j8, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final void j(Object obj, long j8, boolean z2) {
        switch (this.f760b) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                if (!h1.f783g) {
                    h1.l(obj, j8, z2 ? (byte) 1 : (byte) 0);
                } else {
                    h1.k(obj, j8, z2 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!h1.f783g) {
                    h1.l(obj, j8, z2 ? (byte) 1 : (byte) 0);
                } else {
                    h1.k(obj, j8, z2 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final void k(Object obj, long j8, byte b9) {
        switch (this.f760b) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                if (!h1.f783g) {
                    h1.l(obj, j8, b9);
                } else {
                    h1.k(obj, j8, b9);
                }
                break;
            default:
                if (!h1.f783g) {
                    h1.l(obj, j8, b9);
                } else {
                    h1.k(obj, j8, b9);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final void l(Object obj, long j8, double d10) {
        switch (this.f760b) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                o(obj, j8, Double.doubleToLongBits(d10));
                break;
            default:
                o(obj, j8, Double.doubleToLongBits(d10));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final void m(Object obj, long j8, float f) {
        switch (this.f760b) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                n(j8, obj, Float.floatToIntBits(f));
                break;
            default:
                n(j8, obj, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g1
    public final boolean r() {
        switch (this.f760b) {
        }
        return false;
    }
}

package androidx.datastore.preferences.protobuf;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s implements k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f851b = new s(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f852a;

    public /* synthetic */ s(int i) {
        this.f852a = i;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final t0 a(Class cls) {
        switch (this.f852a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                if (!v.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (t0) v.d(cls.asSubclass(v.class)).c(3);
                } catch (Exception e7) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final boolean b(Class cls) {
        switch (this.f852a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return v.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}

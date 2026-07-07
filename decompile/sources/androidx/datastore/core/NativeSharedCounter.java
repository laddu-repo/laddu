package androidx.datastore.core;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class NativeSharedCounter {
    public final native long nativeCreateSharedCounter(int i);

    public final native int nativeGetCounterValue(long j8);

    public final native int nativeIncrementAndGetCounterValue(long j8);

    public final native int nativeTruncateFile(int i);
}

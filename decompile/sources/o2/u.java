package o2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicLong f9532b = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9533a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(y1.k kVar) {
        this(0L);
        Uri uri = kVar.f14377a;
        Map map = Collections.EMPTY_MAP;
    }

    public u(long j8) {
        this.f9533a = j8;
    }
}

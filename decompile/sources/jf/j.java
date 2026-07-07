package jf;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final p f7454a = new p(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f7455b = mf.a.k("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f7456c = mf.a.k("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final h5.a f7457d = new h5.a("BUFFERED", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final h5.a f7458e = new h5.a("SHOULD_BUFFER", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final h5.a f7459f = new h5.a("S_RESUMING_BY_RCV", 1);

    /* renamed from: g, reason: collision with root package name */
    public static final h5.a f7460g = new h5.a("RESUMING_BY_EB", 1);

    /* renamed from: h, reason: collision with root package name */
    public static final h5.a f7461h = new h5.a("POISONED", 1);

    /* renamed from: i, reason: collision with root package name */
    public static final h5.a f7462i = new h5.a("DONE_RCV", 1);
    public static final h5.a j = new h5.a("INTERRUPTED_SEND", 1);

    /* renamed from: k, reason: collision with root package name */
    public static final h5.a f7463k = new h5.a("INTERRUPTED_RCV", 1);

    /* renamed from: l, reason: collision with root package name */
    public static final h5.a f7464l = new h5.a("CHANNEL_CLOSED", 1);

    /* renamed from: m, reason: collision with root package name */
    public static final h5.a f7465m = new h5.a("SUSPEND", 1);

    /* renamed from: n, reason: collision with root package name */
    public static final h5.a f7466n = new h5.a("SUSPEND_NO_WAITER", 1);

    /* renamed from: o, reason: collision with root package name */
    public static final h5.a f7467o = new h5.a("FAILED", 1);

    /* renamed from: p, reason: collision with root package name */
    public static final h5.a f7468p = new h5.a("NO_RECEIVE_RESULT", 1);

    /* renamed from: q, reason: collision with root package name */
    public static final h5.a f7469q = new h5.a("CLOSE_HANDLER_CLOSED", 1);

    /* renamed from: r, reason: collision with root package name */
    public static final h5.a f7470r = new h5.a("CLOSE_HANDLER_INVOKED", 1);
    public static final h5.a s = new h5.a("NO_CLOSE_CAUSE", 1);

    public static final boolean a(gf.j jVar, Object obj, mf.p pVar) {
        h5.a a10 = jVar.a(pVar, obj);
        if (a10 != null) {
            jVar.j(a10);
            return true;
        }
        return false;
    }
}

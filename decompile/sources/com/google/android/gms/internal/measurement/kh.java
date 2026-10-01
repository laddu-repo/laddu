package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class kh {
    public static final jh f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final jh f2841h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sh f2835a = new sh("cause", Throwable.class, false, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final sh f2836b = new sh("ratelimit_count", Integer.class, false, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final sh f2837c = new sh("sampling_count", Integer.class, false, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final sh f2838d = new sh("ratelimit_period", eh.class, false, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final sh f2839e = new sh("skipped", Integer.class, false, false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final sh f2840g = new sh("forced", Boolean.class, false, false);
    public static final sh i = new sh("stack_size", zh.class, false, false);

    static {
        boolean z2 = true;
        f = new jh("group_by", Object.class, z2, z2, 0);
        f2841h = new jh("tags", x.class, false, z2, 1);
    }
}

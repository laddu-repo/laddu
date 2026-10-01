package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final h f2361v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final h f2362w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final h f2363x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final h f2364y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ h[] f2365z;

    static {
        h hVar = new h("IMMEDIATE", 0);
        f2361v = hVar;
        h hVar2 = new h("HIGH", 1);
        f2362w = hVar2;
        h hVar3 = new h("NORMAL", 2);
        f2363x = hVar3;
        h hVar4 = new h("LOW", 3);
        f2364y = hVar4;
        f2365z = new h[]{hVar, hVar2, hVar3, hVar4};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f2365z.clone();
    }
}

package j5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final h A;
    public static final /* synthetic */ h[] B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final h f6833v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final h f6834w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final h f6835x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final h f6836y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final h f6837z;

    static {
        h hVar = new h("SET_ANIMATION", 0);
        f6833v = hVar;
        h hVar2 = new h("SET_PROGRESS", 1);
        f6834w = hVar2;
        h hVar3 = new h("SET_REPEAT_MODE", 2);
        f6835x = hVar3;
        h hVar4 = new h("SET_REPEAT_COUNT", 3);
        f6836y = hVar4;
        h hVar5 = new h("SET_IMAGE_ASSETS", 4);
        f6837z = hVar5;
        h hVar6 = new h("PLAY_OPTION", 5);
        A = hVar6;
        B = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) B.clone();
    }
}

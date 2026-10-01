package te;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final /* synthetic */ b[] A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f12551v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f12552w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f12553x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f12554y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final b f12555z;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f12551v = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f12552w = bVar2;
        b bVar3 = new b("PARKING", 2);
        f12553x = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f12554y = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f12555z = bVar5;
        A = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) A.clone();
    }
}

package y4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final /* synthetic */ c[] A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c f14447v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c f14448w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final c f14449x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c f14450y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final c f14451z;

    static {
        c cVar = new c("END", 0);
        f14447v = cVar;
        c cVar2 = new c("ROLLBACK", 1);
        f14448w = cVar2;
        c cVar3 = new c("BEGIN_EXCLUSIVE", 2);
        f14449x = cVar3;
        c cVar4 = new c("BEGIN_IMMEDIATE", 3);
        f14450y = cVar4;
        c cVar5 = new c("BEGIN_DEFERRED", 4);
        f14451z = cVar5;
        A = new c[]{cVar, cVar2, cVar3, cVar4, cVar5};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) A.clone();
    }
}

package x6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d f14248v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f14249w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final d f14250x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ d[] f14251y;

    static {
        d dVar = new d("DEFAULT", 0);
        f14248v = dVar;
        d dVar2 = new d("VERY_LOW", 1);
        f14249w = dVar2;
        d dVar3 = new d("HIGHEST", 2);
        f14250x = dVar3;
        f14251y = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f14251y.clone();
    }
}

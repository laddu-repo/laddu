package zc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final i f14905v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final i f14906w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ i[] f14907x;

    static {
        i iVar = new i("ASC", 0);
        f14905v = iVar;
        i iVar2 = new i("DESC", 1);
        f14906w = iVar2;
        f14907x = new i[]{iVar, iVar2};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f14907x.clone();
    }
}

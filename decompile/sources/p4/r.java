package p4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final r f10350v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final r f10351w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final r f10352x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ r[] f10353y;

    static {
        r rVar = new r("AUTOMATIC", 0);
        f10350v = rVar;
        r rVar2 = new r("TRUNCATE", 1);
        f10351w = rVar2;
        r rVar3 = new r("WRITE_AHEAD_LOGGING", 2);
        f10352x = rVar3;
        f10353y = new r[]{rVar, rVar2, rVar3};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f10353y.clone();
    }
}

package p4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final j f10313v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final j f10314w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final j f10315x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ j[] f10316y;

    static {
        j jVar = new j("NO_OP", 0);
        f10313v = jVar;
        j jVar2 = new j("ADD", 1);
        f10314w = jVar2;
        j jVar3 = new j("REMOVE", 2);
        f10315x = jVar3;
        f10316y = new j[]{jVar, jVar2, jVar3};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f10316y.clone();
    }
}

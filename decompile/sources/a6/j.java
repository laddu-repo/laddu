package a6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final j f162v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ j[] f163w;

    /* JADX INFO: Fake field, exist only in values array */
    j EF0;

    static {
        j jVar = new j("SRGB", 0);
        j jVar2 = new j("DISPLAY_P3", 1);
        f162v = jVar2;
        f163w = new j[]{jVar, jVar2};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f163w.clone();
    }
}

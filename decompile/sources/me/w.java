package me;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final w f8737v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final w f8738w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final w f8739x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ w[] f8740y;

    static {
        w wVar = new w("DEFAULT", 0);
        f8737v = wVar;
        w wVar2 = new w("LAZY", 1);
        w wVar3 = new w("ATOMIC", 2);
        f8738w = wVar3;
        w wVar4 = new w("UNDISPATCHED", 3);
        f8739x = wVar4;
        f8740y = new w[]{wVar, wVar2, wVar3, wVar4};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f8740y.clone();
    }
}

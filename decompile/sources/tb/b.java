package tb;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public enum b implements ib.c {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("UNKNOWN"),
    f12526w("DATA_MESSAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("TOPIC"),
    f12527x("DISPLAY_NOTIFICATION");


    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f12529v;

    b(String str) {
        this.f12529v = i;
    }

    @Override // ib.c
    public final int a() {
        return this.f12529v;
    }
}

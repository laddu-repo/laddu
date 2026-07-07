package kc;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public enum c implements xb.c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_OS(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    /* JADX INFO: Fake field, exist only in values array */
    WEB(3);


    /* renamed from: x, reason: collision with root package name */
    public final int f7822x;

    c(int i6) {
        this.f7822x = i6;
    }

    @Override // xb.c
    public final int getNumber() {
        return this.f7822x;
    }
}

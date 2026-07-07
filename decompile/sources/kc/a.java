package kc;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public enum a implements xb.c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE_OPEN(2);


    /* renamed from: x, reason: collision with root package name */
    public final int f7816x;

    a(int i6) {
        this.f7816x = i6;
    }

    @Override // xb.c
    public final int getNumber() {
        return this.f7816x;
    }
}

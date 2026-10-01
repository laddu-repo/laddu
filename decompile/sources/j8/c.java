package j8;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public enum c implements xb.c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* renamed from: x, reason: collision with root package name */
    public final int f7306x;

    c(int i6) {
        this.f7306x = i6;
    }

    @Override // xb.c
    public final int getNumber() {
        return this.f7306x;
    }
}

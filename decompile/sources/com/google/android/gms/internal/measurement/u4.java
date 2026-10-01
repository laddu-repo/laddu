package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public enum u4 implements o5 {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);


    /* renamed from: x, reason: collision with root package name */
    public final int f2459x;

    u4(int i6) {
        this.f2459x = i6;
    }

    @Override // com.google.android.gms.internal.measurement.o5
    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.f2459x;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f2459x);
    }
}

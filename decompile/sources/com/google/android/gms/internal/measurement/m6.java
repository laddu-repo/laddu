package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m6 {

    /* renamed from: a, reason: collision with root package name */
    public final v4 f2345a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2346b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f2347c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2348d;

    public m6(v4 v4Var, String str, Object[] objArr) {
        this.f2345a = v4Var;
        this.f2346b = str;
        this.f2347c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f2348d = charAt;
            return;
        }
        int i6 = charAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 >= 55296) {
                i6 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            } else {
                this.f2348d = i6 | (charAt2 << i11);
                return;
            }
        }
    }

    public final int a() {
        int i6 = this.f2348d;
        if ((i6 & 1) != 0) {
            return 1;
        }
        if ((i6 & 4) == 4) {
            return 3;
        }
        return 2;
    }
}

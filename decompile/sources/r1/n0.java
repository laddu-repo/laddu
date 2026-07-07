package r1;

import android.os.Bundle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class n0 extends Exception {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;

    /* renamed from: x, reason: collision with root package name */
    public final int f11589x;

    /* renamed from: y, reason: collision with root package name */
    public final long f11590y;

    /* renamed from: z, reason: collision with root package name */
    public final Bundle f11591z;

    static {
        String str = u1.a0.f12750a;
        A = Integer.toString(0, 36);
        B = Integer.toString(1, 36);
        C = Integer.toString(2, 36);
        D = Integer.toString(3, 36);
        E = Integer.toString(4, 36);
        F = Integer.toString(5, 36);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(String str, Throwable th, int i6, long j) {
        super(str, th);
        Bundle bundle = Bundle.EMPTY;
        this.f11589x = i6;
        this.f11591z = bundle;
        this.f11590y = j;
    }
}

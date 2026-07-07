package l7;

import android.graphics.Color;
import android.graphics.PointF;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements d0 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f8269x;

    /* renamed from: y, reason: collision with root package name */
    public static final f f8267y = new f(0);

    /* renamed from: z, reason: collision with root package name */
    public static final f f8268z = new f(1);
    public static final f A = new f(2);
    public static final f B = new f(3);
    public static final f C = new f(4);
    public static final f D = new f(5);

    public /* synthetic */ f(int i6) {
        this.f8269x = i6;
    }

    @Override // l7.d0
    public final Object a(m7.a aVar, float f3) {
        double d10;
        switch (this.f8269x) {
            case 0:
                boolean z10 = true;
                if (aVar.f0() != 1) {
                    z10 = false;
                }
                if (z10) {
                    aVar.d();
                }
                double S = aVar.S();
                double S2 = aVar.S();
                double S3 = aVar.S();
                if (aVar.f0() == 7) {
                    d10 = aVar.S();
                } else {
                    d10 = 1.0d;
                }
                if (z10) {
                    aVar.l();
                }
                if (S <= 1.0d && S2 <= 1.0d && S3 <= 1.0d) {
                    S *= 255.0d;
                    S2 *= 255.0d;
                    S3 *= 255.0d;
                    if (d10 <= 1.0d) {
                        d10 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) d10, (int) S, (int) S2, (int) S3));
            case 1:
                return Float.valueOf(n.d(aVar) * f3);
            case 2:
                return Integer.valueOf(Math.round(n.d(aVar) * f3));
            case 3:
                return n.b(aVar, f3);
            case 4:
                int f02 = aVar.f0();
                if (f02 == 1) {
                    return n.b(aVar, f3);
                }
                if (f02 == 3) {
                    return n.b(aVar, f3);
                }
                if (f02 == 7) {
                    PointF pointF = new PointF(((float) aVar.S()) * f3, ((float) aVar.S()) * f3);
                    while (aVar.K()) {
                        aVar.j0();
                    }
                    return pointF;
                }
                throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(h8.c.w(f02)));
            default:
                boolean z11 = true;
                if (aVar.f0() != 1) {
                    z11 = false;
                }
                if (z11) {
                    aVar.d();
                }
                float S4 = (float) aVar.S();
                float S5 = (float) aVar.S();
                while (aVar.K()) {
                    aVar.j0();
                }
                if (z11) {
                    aVar.l();
                }
                return new o7.c((S4 / 100.0f) * f3, (S5 / 100.0f) * f3);
        }
    }
}

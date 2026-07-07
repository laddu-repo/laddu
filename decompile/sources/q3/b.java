package q3;

import java.util.ArrayDeque;
import u5.r;
import y2.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f11013a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f11014b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final e f11015c = new e();

    /* renamed from: d, reason: collision with root package name */
    public r f11016d;

    /* renamed from: e, reason: collision with root package name */
    public int f11017e;

    /* renamed from: f, reason: collision with root package name */
    public int f11018f;

    /* renamed from: g, reason: collision with root package name */
    public long f11019g;

    public final long a(p pVar, int i6) {
        pVar.readFully(this.f11013a, 0, i6);
        long j = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            j = (j << 8) | (r0[i10] & 255);
        }
        return j;
    }
}

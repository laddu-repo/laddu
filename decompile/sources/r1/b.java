package r1;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f11302c = new b(new a[0]);

    /* renamed from: d, reason: collision with root package name */
    public static final a f11303d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f11304e;

    /* renamed from: a, reason: collision with root package name */
    public final int f11305a;

    /* renamed from: b, reason: collision with root package name */
    public final a[] f11306b;

    static {
        a aVar = new a(-1, -1, new int[0], new e0[0], new long[0], new String[0]);
        int[] iArr = aVar.f11273e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = aVar.f11274f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        f11303d = new a(0, aVar.f11270b, copyOf, (e0[]) Arrays.copyOf(aVar.f11272d, 0), copyOf2, (String[]) Arrays.copyOf(aVar.f11275g, 0));
        String str = u1.a0.f12750a;
        f11304e = Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public b(a[] aVarArr) {
        this.f11305a = aVarArr.length;
        this.f11306b = aVarArr;
    }

    public final a a(int i6) {
        if (i6 < 0) {
            return f11303d;
        }
        return this.f11306b[i6];
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f11305a == bVar.f11305a && Arrays.equals(this.f11306b, bVar.f11306b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11306b) + (((((this.f11305a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i6 = 0;
        while (true) {
            a[] aVarArr = this.f11306b;
            if (i6 < aVarArr.length) {
                sb2.append("adGroup(timeUs=0, ads=[");
                aVarArr[i6].getClass();
                for (int i10 = 0; i10 < aVarArr[i6].f11273e.length; i10++) {
                    sb2.append("ad(state=");
                    int i11 = aVarArr[i6].f11273e[i10];
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 != 3) {
                                    if (i11 != 4) {
                                        sb2.append('?');
                                    } else {
                                        sb2.append('!');
                                    }
                                } else {
                                    sb2.append('P');
                                }
                            } else {
                                sb2.append('S');
                            }
                        } else {
                            sb2.append('R');
                        }
                    } else {
                        sb2.append('_');
                    }
                    sb2.append(", durationUs=");
                    sb2.append(aVarArr[i6].f11274f[i10]);
                    sb2.append(')');
                    if (i10 < aVarArr[i6].f11273e.length - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append("])");
                if (i6 < aVarArr.length - 1) {
                    sb2.append(", ");
                }
                i6++;
            } else {
                sb2.append("])");
                return sb2.toString();
            }
        }
    }
}

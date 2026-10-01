package l3;

import java.util.Objects;
import r1.g0;
import r1.i0;
import r1.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f8095a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8096b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8097c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8098d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8099e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8100f;

    public b(int i6, int i10, String str, String str2, String str3, boolean z10) {
        boolean z11;
        if (i10 != -1 && i10 <= 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        u1.c.b(z11);
        this.f8095a = i6;
        this.f8096b = str;
        this.f8097c = str2;
        this.f8098d = str3;
        this.f8099e = z10;
        this.f8100f = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static l3.b d(java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.b.d(java.util.Map):l3.b");
    }

    @Override // r1.i0
    public final /* synthetic */ q a() {
        return null;
    }

    @Override // r1.i0
    public final void b(g0 g0Var) {
        String str = this.f8097c;
        if (str != null) {
            g0Var.F = str;
        }
        String str2 = this.f8096b;
        if (str2 != null) {
            g0Var.D = str2;
        }
    }

    @Override // r1.i0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f8095a == bVar.f8095a && Objects.equals(this.f8096b, bVar.f8096b) && Objects.equals(this.f8097c, bVar.f8097c) && Objects.equals(this.f8098d, bVar.f8098d) && this.f8099e == bVar.f8099e && this.f8100f == bVar.f8100f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10;
        int i11 = (527 + this.f8095a) * 31;
        int i12 = 0;
        String str = this.f8096b;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = (i11 + i6) * 31;
        String str2 = this.f8097c;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i13 + i10) * 31;
        String str3 = this.f8098d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return ((((i14 + i12) * 31) + (this.f8099e ? 1 : 0)) * 31) + this.f8100f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f8097c + "\", genre=\"" + this.f8096b + "\", bitrate=" + this.f8095a + ", metadataInterval=" + this.f8100f;
    }
}

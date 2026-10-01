package m3;

import java.util.Arrays;
import java.util.Objects;
import r1.g0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends j {

    /* renamed from: b, reason: collision with root package name */
    public final String f8555b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8556c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8557d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f8558e;

    public a(String str, String str2, int i6, byte[] bArr) {
        super("APIC");
        this.f8555b = str;
        this.f8556c = str2;
        this.f8557d = i6;
        this.f8558e = bArr;
    }

    @Override // m3.j, r1.i0
    public final void b(g0 g0Var) {
        g0Var.a(this.f8557d, this.f8558e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f8557d == aVar.f8557d && Objects.equals(this.f8555b, aVar.f8555b) && Objects.equals(this.f8556c, aVar.f8556c) && Arrays.equals(this.f8558e, aVar.f8558e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int i10 = (527 + this.f8557d) * 31;
        int i11 = 0;
        String str = this.f8555b;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i12 = (i10 + i6) * 31;
        String str2 = this.f8556c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return Arrays.hashCode(this.f8558e) + ((i12 + i11) * 31);
    }

    @Override // m3.j
    public final String toString() {
        return this.f8583a + ": mimeType=" + this.f8555b + ", description=" + this.f8556c;
    }
}

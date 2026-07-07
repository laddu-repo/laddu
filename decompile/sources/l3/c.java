package l3;

import java.util.Arrays;
import r1.g0;
import r1.i0;
import r1.q;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f8101a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8102b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8103c;

    public c(byte[] bArr, String str, String str2) {
        this.f8101a = bArr;
        this.f8102b = str;
        this.f8103c = str2;
    }

    @Override // r1.i0
    public final /* synthetic */ q a() {
        return null;
    }

    @Override // r1.i0
    public final void b(g0 g0Var) {
        String str = this.f8102b;
        if (str != null) {
            g0Var.f11404a = str;
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
        if (obj != null && c.class == obj.getClass()) {
            return Arrays.equals(this.f8101a, ((c) obj).f8101a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8101a);
    }

    public final String toString() {
        int length = this.f8101a.length;
        StringBuilder sb2 = new StringBuilder("ICY: title=\"");
        sb2.append(this.f8102b);
        sb2.append("\", url=\"");
        sb2.append(this.f8103c);
        sb2.append("\", rawMetadata.length=\"");
        return r4.a.l(sb2, length, "\"");
    }
}

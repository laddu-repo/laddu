package a6;

import com.google.protobuf.CodedOutputStream;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f579a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f580b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f581c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f582d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f579a == aVar.f579a && this.f580b == aVar.f580b && this.f581c == aVar.f581c && this.f582d == aVar.f582d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final int hashCode() {
        ?? r02 = this.f579a;
        int i6 = r02;
        if (this.f580b) {
            i6 = r02 + 16;
        }
        int i10 = i6;
        if (this.f581c) {
            i10 = i6 + 256;
        }
        if (this.f582d) {
            return i10 + CodedOutputStream.DEFAULT_BUFFER_SIZE;
        }
        return i10;
    }

    public final String toString() {
        return "[ Connected=" + this.f579a + " Validated=" + this.f580b + " Metered=" + this.f581c + " NotRoaming=" + this.f582d + " ]";
    }
}

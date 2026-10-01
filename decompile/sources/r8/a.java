package r8;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11869a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11870b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11871c;

    public /* synthetic */ a(String str, boolean z10, int i6) {
        this.f11869a = i6;
        this.f11870b = str;
        this.f11871c = z10;
    }

    public String toString() {
        switch (this.f11869a) {
            case 0:
                String str = this.f11870b;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
                sb2.append("{");
                sb2.append(str);
                sb2.append("}");
                sb2.append(this.f11871c);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(boolean z10, String str, int i6) {
        this.f11869a = i6;
        this.f11871c = z10;
        this.f11870b = str;
    }
}

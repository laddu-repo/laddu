package n9;

import android.os.Bundle;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9503a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f9504b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9505c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9506d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9507e;

    public v0(long j, Bundle bundle, String str, String str2) {
        this.f9505c = str;
        this.f9506d = str2;
        this.f9507e = bundle;
        this.f9504b = j;
    }

    public static v0 b(v vVar) {
        String str = vVar.f9500x;
        String str2 = vVar.f9502z;
        return new v0(vVar.A, vVar.f9501y.d(), str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x012a, code lost:
    
        if (r8 != null) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.measurement.c3 a(com.google.android.gms.internal.measurement.c3 r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.v0.a(com.google.android.gms.internal.measurement.c3, java.lang.String):com.google.android.gms.internal.measurement.c3");
    }

    public v c() {
        return new v((String) this.f9505c, new u(new Bundle((Bundle) this.f9507e)), (String) this.f9506d, this.f9504b);
    }

    public String toString() {
        switch (this.f9503a) {
            case 0:
                String str = (String) this.f9506d;
                String obj = ((Bundle) this.f9507e).toString();
                int length = String.valueOf(str).length();
                String str2 = (String) this.f9505c;
                StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + obj.length());
                r4.a.u(sb2, "origin=", str, ",name=", str2);
                return r4.a.o(sb2, ",params=", obj);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ v0(c cVar) {
        this.f9507e = cVar;
    }
}

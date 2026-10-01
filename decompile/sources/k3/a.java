package k3;

import h8.c;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import r1.g0;
import r1.i0;
import r1.k0;
import r1.q;
import u1.t;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7585a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7586b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7587c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7588d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7589e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7590f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7591g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f7592h;

    public a(int i6, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.f7585a = i6;
        this.f7586b = str;
        this.f7587c = str2;
        this.f7588d = i10;
        this.f7589e = i11;
        this.f7590f = i12;
        this.f7591g = i13;
        this.f7592h = bArr;
    }

    public static a d(t tVar) {
        int k8 = tVar.k();
        String p10 = k0.p(tVar.w(tVar.k(), StandardCharsets.US_ASCII));
        String w10 = tVar.w(tVar.k(), StandardCharsets.UTF_8);
        int k9 = tVar.k();
        int k10 = tVar.k();
        int k11 = tVar.k();
        int k12 = tVar.k();
        int k13 = tVar.k();
        byte[] bArr = new byte[k13];
        tVar.i(bArr, 0, k13);
        return new a(k8, p10, w10, k9, k10, k11, k12, bArr);
    }

    @Override // r1.i0
    public final /* synthetic */ q a() {
        return null;
    }

    @Override // r1.i0
    public final void b(g0 g0Var) {
        g0Var.a(this.f7585a, this.f7592h);
    }

    @Override // r1.i0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f7585a == aVar.f7585a && this.f7586b.equals(aVar.f7586b) && this.f7587c.equals(aVar.f7587c) && this.f7588d == aVar.f7588d && this.f7589e == aVar.f7589e && this.f7590f == aVar.f7590f && this.f7591g == aVar.f7591g && Arrays.equals(this.f7592h, aVar.f7592h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7592h) + ((((((((c.g(this.f7587c, c.g(this.f7586b, (527 + this.f7585a) * 31, 31), 31) + this.f7588d) * 31) + this.f7589e) * 31) + this.f7590f) * 31) + this.f7591g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f7586b + ", description=" + this.f7587c;
    }
}

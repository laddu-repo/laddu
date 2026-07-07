package r1;

import android.net.Uri;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: i, reason: collision with root package name */
    public static final String f11744i;
    public static final String j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f11745k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f11746l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f11747m;

    /* renamed from: n, reason: collision with root package name */
    public static final String f11748n;

    /* renamed from: o, reason: collision with root package name */
    public static final String f11749o;

    /* renamed from: p, reason: collision with root package name */
    public static final String f11750p;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f11751a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f11752b;

    /* renamed from: c, reason: collision with root package name */
    public final db.n0 f11753c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11754d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11755e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11756f;

    /* renamed from: g, reason: collision with root package name */
    public final db.k0 f11757g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f11758h;

    static {
        String str = u1.a0.f12750a;
        f11744i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        f11745k = Integer.toString(2, 36);
        f11746l = Integer.toString(3, 36);
        f11747m = Integer.toString(4, 36);
        f11748n = Integer.toString(5, 36);
        f11749o = Integer.toString(6, 36);
        f11750p = Integer.toString(7, 36);
    }

    public y(f5.b bVar) {
        boolean z10;
        byte[] bArr;
        if (bVar.f5020c && ((Uri) bVar.f5022e) == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        u1.c.g(z10);
        UUID uuid = (UUID) bVar.f5021d;
        uuid.getClass();
        this.f11751a = uuid;
        this.f11752b = (Uri) bVar.f5022e;
        this.f11753c = (db.n0) bVar.f5023f;
        this.f11754d = bVar.f5018a;
        this.f11756f = bVar.f5020c;
        this.f11755e = bVar.f5019b;
        this.f11757g = (db.k0) bVar.f5024g;
        byte[] bArr2 = (byte[]) bVar.f5025h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        } else {
            bArr = null;
        }
        this.f11758h = bArr;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, f5.b] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Cloneable, byte[]] */
    public final f5.b a() {
        ?? obj = new Object();
        obj.f5021d = this.f11751a;
        obj.f5022e = this.f11752b;
        obj.f5023f = this.f11753c;
        obj.f5018a = this.f11754d;
        obj.f5019b = this.f11755e;
        obj.f5020c = this.f11756f;
        obj.f5024g = this.f11757g;
        obj.f5025h = this.f11758h;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f11751a.equals(yVar.f11751a) && Objects.equals(this.f11752b, yVar.f11752b) && Objects.equals(this.f11753c, yVar.f11753c) && this.f11754d == yVar.f11754d && this.f11756f == yVar.f11756f && this.f11755e == yVar.f11755e && this.f11757g.equals(yVar.f11757g) && Arrays.equals(this.f11758h, yVar.f11758h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i6;
        int hashCode = this.f11751a.hashCode() * 31;
        Uri uri = this.f11752b;
        if (uri != null) {
            i6 = uri.hashCode();
        } else {
            i6 = 0;
        }
        return Arrays.hashCode(this.f11758h) + ((this.f11757g.hashCode() + ((((((((this.f11753c.hashCode() + ((hashCode + i6) * 31)) * 31) + (this.f11754d ? 1 : 0)) * 31) + (this.f11756f ? 1 : 0)) * 31) + (this.f11755e ? 1 : 0)) * 31)) * 31);
    }
}

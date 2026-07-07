package t1;

import android.net.Uri;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import y9.e1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f12116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f12117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f12118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y9.f0 f12120e;
    public final byte[] f;

    static {
        d0.d.p(0, 1, 2, 3, 4);
        w1.b0.H(5);
        w1.b0.H(6);
        w1.b0.H(7);
    }

    public u(o2.p pVar) {
        UUID uuid = (UUID) pVar.f9503w;
        uuid.getClass();
        this.f12116a = uuid;
        this.f12117b = (Uri) pVar.f9504x;
        this.f12118c = (e1) pVar.f9505y;
        this.f12119d = pVar.f9502v;
        this.f12120e = (y9.f0) pVar.f9506z;
        byte[] bArr = (byte[]) pVar.A;
        this.f = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final o2.p a() {
        o2.p pVar = new o2.p();
        pVar.f9503w = this.f12116a;
        pVar.f9504x = this.f12117b;
        pVar.f9505y = this.f12118c;
        pVar.f9502v = this.f12119d;
        pVar.f9506z = this.f12120e;
        pVar.A = this.f;
        return pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f12116a.equals(uVar.f12116a) && Objects.equals(this.f12117b, uVar.f12117b) && Objects.equals(this.f12118c, uVar.f12118c) && this.f12119d == uVar.f12119d && this.f12120e.equals(uVar.f12120e) && Arrays.equals(this.f, uVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f12116a.hashCode() * 31;
        Uri uri = this.f12117b;
        return Arrays.hashCode(this.f) + ((this.f12120e.hashCode() + ((((this.f12118c.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 29791) + (this.f12119d ? 1 : 0)) * 31)) * 31);
    }
}

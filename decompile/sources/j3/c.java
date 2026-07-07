package j3;

import java.util.Arrays;
import t1.b0;
import t1.d0;
import t1.o;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f6782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6784c;

    public c(String str, String str2, byte[] bArr) {
        this.f6782a = bArr;
        this.f6783b = str;
        this.f6784c = str2;
    }

    @Override // t1.d0
    public final /* synthetic */ o a() {
        return null;
    }

    @Override // t1.d0
    public final void b(b0 b0Var) {
        String str = this.f6783b;
        if (str != null) {
            b0Var.f11924a = str;
        }
    }

    @Override // t1.d0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f6782a, ((c) obj).f6782a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6782a);
    }

    public final String toString() {
        int length = this.f6782a.length;
        StringBuilder sb2 = new StringBuilder("ICY: title=\"");
        sb2.append(this.f6783b);
        sb2.append("\", url=\"");
        sb2.append(this.f6784c);
        sb2.append("\", rawMetadata.length=\"");
        return j4.a.l(length, "\"", sb2);
    }
}

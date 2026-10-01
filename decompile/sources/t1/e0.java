package t1;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0[] f11984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11985b;

    public e0(d0... d0VarArr) {
        this(-9223372036854775807L, d0VarArr);
    }

    public final e0 a(d0... d0VarArr) {
        if (d0VarArr.length == 0) {
            return this;
        }
        int i = w1.b0.f13686a;
        d0[] d0VarArr2 = this.f11984a;
        Object[] objArrCopyOf = Arrays.copyOf(d0VarArr2, d0VarArr2.length + d0VarArr.length);
        System.arraycopy(d0VarArr, 0, objArrCopyOf, d0VarArr2.length, d0VarArr.length);
        return new e0(this.f11985b, (d0[]) objArrCopyOf);
    }

    public final e0 b(e0 e0Var) {
        return e0Var == null ? this : a(e0Var.f11984a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e0.class == obj.getClass()) {
            e0 e0Var = (e0) obj;
            if (Arrays.equals(this.f11984a, e0Var.f11984a) && this.f11985b == e0Var.f11985b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return a.a.q(this.f11985b) + (Arrays.hashCode(this.f11984a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f11984a));
        long j8 = this.f11985b;
        if (j8 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j8;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public e0(long j8, d0... d0VarArr) {
        this.f11985b = j8;
        this.f11984a = d0VarArr;
    }

    public e0(List list) {
        this((d0[]) list.toArray(new d0[0]));
    }
}

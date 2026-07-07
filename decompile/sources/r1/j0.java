package r1;

import java.util.Arrays;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0[] f11523a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11524b;

    public j0(i0... i0VarArr) {
        this(-9223372036854775807L, i0VarArr);
    }

    public final j0 a(i0... i0VarArr) {
        if (i0VarArr.length == 0) {
            return this;
        }
        String str = u1.a0.f12750a;
        i0[] i0VarArr2 = this.f11523a;
        Object[] copyOf = Arrays.copyOf(i0VarArr2, i0VarArr2.length + i0VarArr.length);
        System.arraycopy(i0VarArr, 0, copyOf, i0VarArr2.length, i0VarArr.length);
        return new j0(this.f11524b, (i0[]) copyOf);
    }

    public final j0 b(j0 j0Var) {
        if (j0Var == null) {
            return this;
        }
        return a(j0Var.f11523a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j0.class == obj.getClass()) {
            j0 j0Var = (j0) obj;
            if (Arrays.equals(this.f11523a, j0Var.f11523a) && this.f11524b == j0Var.f11524b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return a8.g.k(this.f11524b) + (Arrays.hashCode(this.f11523a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f11523a));
        long j = this.f11524b;
        if (j == -9223372036854775807L) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public j0(long j, i0... i0VarArr) {
        this.f11524b = j;
        this.f11523a = i0VarArr;
    }

    public j0(List list) {
        this((i0[]) list.toArray(new i0[0]));
    }
}

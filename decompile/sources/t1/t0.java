package t1;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o[] f12114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12115e;

    static {
        w1.b0.H(0);
        w1.b0.H(1);
    }

    public t0(String str, o... oVarArr) {
        w1.a.d(oVarArr.length > 0);
        this.f12112b = str;
        this.f12114d = oVarArr;
        this.f12111a = oVarArr.length;
        int i = f0.i(oVarArr[0].f12061n);
        this.f12113c = i == -1 ? f0.i(oVarArr[0].f12060m) : i;
        String str2 = oVarArr[0].f12053d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i10 = oVarArr[0].f | 16384;
        for (int i11 = 1; i11 < oVarArr.length; i11++) {
            String str3 = oVarArr[i11].f12053d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                b("languages", oVarArr[0].f12053d, oVarArr[i11].f12053d, i11);
                return;
            } else {
                if (i10 != (oVarArr[i11].f | 16384)) {
                    b("role flags", Integer.toBinaryString(oVarArr[0].f), Integer.toBinaryString(oVarArr[i11].f), i11);
                    return;
                }
            }
        }
    }

    public static void b(String str, String str2, String str3, int i) {
        w1.a.p("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    public final int a(o oVar) {
        int i = 0;
        while (true) {
            o[] oVarArr = this.f12114d;
            if (i >= oVarArr.length) {
                return -1;
            }
            if (oVar == oVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t0.class == obj.getClass()) {
            t0 t0Var = (t0) obj;
            if (this.f12112b.equals(t0Var.f12112b) && Arrays.equals(this.f12114d, t0Var.f12114d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f12115e == 0) {
            this.f12115e = Arrays.hashCode(this.f12114d) + d0.d.e(527, 31, this.f12112b);
        }
        return this.f12115e;
    }

    public final String toString() {
        return this.f12112b + ": " + Arrays.toString(this.f12114d);
    }
}

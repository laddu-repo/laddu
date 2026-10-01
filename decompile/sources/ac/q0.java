package ac;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {
    public static final p0 Companion = new p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f440d;

    public /* synthetic */ q0(int i, String str, String str2, int i10, long j8) {
        if (15 != (i & 15)) {
            af.k.a(i, 15, o0.f434a.d());
            throw null;
        }
        this.f437a = str;
        this.f438b = str2;
        this.f439c = i10;
        this.f440d = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return de.i.a(this.f437a, q0Var.f437a) && de.i.a(this.f438b, q0Var.f438b) && this.f439c == q0Var.f439c && this.f440d == q0Var.f440d;
    }

    public final int hashCode() {
        int iE = (d0.d.e(this.f437a.hashCode() * 31, 31, this.f438b) + this.f439c) * 31;
        long j8 = this.f440d;
        return iE + ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f437a + ", firstSessionId=" + this.f438b + ", sessionIndex=" + this.f439c + ", sessionStartTimestampUs=" + this.f440d + ')';
    }

    public q0(String str, String str2, int i, long j8) {
        this.f437a = str;
        this.f438b = str2;
        this.f439c = i;
        this.f440d = j8;
    }
}

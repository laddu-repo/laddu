package c2;

import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v1 implements w0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f1981v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1982w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f1983x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f1984y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Object f1985z;

    public v1(k8.d1 d1Var, String str, long j8) {
        Objects.requireNonNull(d1Var);
        this.f1985z = d1Var;
        t7.y.d(str);
        this.f1984y = str;
        this.f1981v = j8;
    }

    @Override // c2.w0
    public /* synthetic */ boolean a() {
        return false;
    }

    @Override // c2.w0
    public void b(t1.i0 i0Var) {
        if (this.f1982w) {
            c(e());
        }
        this.f1985z = i0Var;
    }

    public void c(long j8) {
        this.f1981v = j8;
        if (this.f1982w) {
            ((w1.v) this.f1984y).getClass();
            this.f1983x = SystemClock.elapsedRealtime();
        }
    }

    @Override // c2.w0
    public t1.i0 d() {
        return (t1.i0) this.f1985z;
    }

    @Override // c2.w0
    public long e() {
        long j8 = this.f1981v;
        if (!this.f1982w) {
            return j8;
        }
        ((w1.v) this.f1984y).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f1983x;
        t1.i0 i0Var = (t1.i0) this.f1985z;
        return (i0Var.f12004a == 1.0f ? w1.b0.M(jElapsedRealtime) : jElapsedRealtime * ((long) i0Var.f12006c)) + j8;
    }

    public void f() {
        if (this.f1982w) {
            return;
        }
        ((w1.v) this.f1984y).getClass();
        this.f1983x = SystemClock.elapsedRealtime();
        this.f1982w = true;
    }

    public long g() {
        if (!this.f1982w) {
            this.f1982w = true;
            k8.d1 d1Var = (k8.d1) this.f1985z;
            this.f1983x = d1Var.H().getLong((String) this.f1984y, this.f1981v);
        }
        return this.f1983x;
    }

    public void h(long j8) {
        SharedPreferences.Editor editorEdit = ((k8.d1) this.f1985z).H().edit();
        editorEdit.putLong((String) this.f1984y, j8);
        editorEdit.apply();
        this.f1983x = j8;
    }

    public v1(w1.v vVar) {
        this.f1984y = vVar;
        this.f1985z = t1.i0.f12003d;
    }
}

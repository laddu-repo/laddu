package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.di;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f792b;

    public j(di diVar, int i) {
        if (diVar == null) {
            throw new IllegalArgumentException("format options cannot be null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(u5.a.b(i, "invalid index: ", new StringBuilder(String.valueOf(i).length() + 15)));
        }
        this.f791a = i;
        this.f792b = diVar;
    }

    public abstract void a(int i);

    public abstract int b();

    public abstract boolean c();

    public abstract void d(int i);

    public abstract int e(int i);

    public abstract boolean f();

    public abstract g g();

    public abstract double h();

    public abstract int i();

    public abstract int j();

    public abstract long k();

    public abstract float l();

    public abstract int m();

    public abstract long n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract String s();

    public abstract String t();

    public abstract int u();

    public abstract int v();

    public abstract long w();

    public abstract boolean x(int i);

    public void y() {
        int iU;
        do {
            iU = u();
            if (iU == 0) {
                return;
            }
            int i = this.f791a;
            if (i >= 100) {
                throw new z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f791a = i + 1;
            this.f791a--;
        } while (x(iU));
    }

    public abstract void z(androidx.emoji2.text.u uVar, Object obj);
}

package o8;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j implements e, d, b {
    public int A;
    public Exception B;
    public boolean C;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f9966v = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f9967w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o f9968x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f9969y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f9970z;

    public j(int i, o oVar) {
        this.f9967w = i;
        this.f9968x = oVar;
    }

    public final void a() {
        int i = this.f9969y + this.f9970z + this.A;
        int i10 = this.f9967w;
        if (i == i10) {
            Exception exc = this.B;
            o oVar = this.f9968x;
            if (exc == null) {
                if (this.C) {
                    oVar.o();
                    return;
                } else {
                    oVar.l(null);
                    return;
                }
            }
            int i11 = this.f9970z;
            int length = String.valueOf(i11).length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + length + 8 + 24);
            sb2.append(i11);
            sb2.append(" out of ");
            sb2.append(i10);
            sb2.append(" underlying tasks failed");
            oVar.n(new ExecutionException(sb2.toString(), this.B));
        }
    }

    @Override // o8.b
    public final void m() {
        synchronized (this.f9966v) {
            this.A++;
            this.C = true;
            a();
        }
    }

    @Override // o8.e
    public final void n(Object obj) {
        synchronized (this.f9966v) {
            this.f9969y++;
            a();
        }
    }

    @Override // o8.d
    public final void z(Exception exc) {
        synchronized (this.f9966v) {
            this.f9970z++;
            this.B = exc;
            a();
        }
    }
}

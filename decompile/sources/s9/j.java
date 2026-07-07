package s9;

import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j implements e, d, b {
    public int A;
    public int B;
    public int C;
    public Exception D;
    public boolean E;

    /* renamed from: x, reason: collision with root package name */
    public final Object f12266x = new Object();

    /* renamed from: y, reason: collision with root package name */
    public final int f12267y;

    /* renamed from: z, reason: collision with root package name */
    public final n f12268z;

    public j(int i6, n nVar) {
        this.f12267y = i6;
        this.f12268z = nVar;
    }

    public final void a() {
        int i6 = this.A + this.B + this.C;
        int i10 = this.f12267y;
        if (i6 == i10) {
            Exception exc = this.D;
            n nVar = this.f12268z;
            if (exc != null) {
                nVar.l(new ExecutionException(this.B + " out of " + i10 + " underlying tasks failed", this.D));
                return;
            }
            if (this.E) {
                nVar.n();
            } else {
                nVar.m(null);
            }
        }
    }

    @Override // s9.b
    public final void b() {
        synchronized (this.f12266x) {
            this.C++;
            this.E = true;
            a();
        }
    }

    @Override // s9.d
    public final void onFailure(Exception exc) {
        synchronized (this.f12266x) {
            this.B++;
            this.D = exc;
            a();
        }
    }

    @Override // s9.e
    public final void onSuccess(Object obj) {
        synchronized (this.f12266x) {
            this.A++;
            a();
        }
    }
}

package o5;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w extends s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9997a;

    /* renamed from: b, reason: collision with root package name */
    public r f9998b;

    public /* synthetic */ w() {
        this.f9997a = 1;
    }

    @Override // o5.s, o5.o
    public void a(r rVar) {
        switch (this.f9997a) {
            case 0:
                a aVar = (a) this.f9998b;
                aVar.Z.remove(rVar);
                if (!aVar.r()) {
                    aVar.v(aVar, q.f9984n, false);
                    aVar.O = true;
                    aVar.v(aVar, q.f9983m, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // o5.s, o5.o
    public void d(r rVar) {
        switch (this.f9997a) {
            case 1:
                a aVar = (a) this.f9998b;
                if (!aVar.f9935c0) {
                    aVar.I();
                    aVar.f9935c0 = true;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // o5.s, o5.o
    public void g(r rVar) {
        switch (this.f9997a) {
            case 1:
                a aVar = (a) this.f9998b;
                int i6 = aVar.f9934b0 - 1;
                aVar.f9934b0 = i6;
                if (i6 == 0) {
                    aVar.f9935c0 = false;
                    aVar.l();
                }
                rVar.y(this);
                return;
            case 2:
                this.f9998b.A();
                rVar.y(this);
                return;
            default:
                return;
        }
    }

    public /* synthetic */ w(r rVar, int i6) {
        this.f9997a = i6;
        this.f9998b = rVar;
    }
}

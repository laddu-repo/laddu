package i4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6298x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b0 f6299y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ s f6300z;

    public /* synthetic */ b(b0 b0Var, s sVar, int i6) {
        this.f6298x = i6;
        this.f6299y = b0Var;
        this.f6300z = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6298x) {
            case 0:
                b0 b0Var = this.f6299y;
                if (!b0Var.j()) {
                    if (b0Var.f6322x) {
                        s sVar = this.f6300z;
                        if (!b0.k(sVar)) {
                            if (b0Var.i(sVar)) {
                                b0Var.f6322x = false;
                            }
                        } else {
                            return;
                        }
                    }
                    b0Var.f6305e.getClass();
                    return;
                }
                return;
            case 1:
                this.f6299y.f6307g.P(this.f6300z, Integer.MIN_VALUE, 9, h1.R(new com.unity3d.ads.adplayer.b(25)));
                return;
            case 2:
                this.f6299y.f6307g.P(this.f6300z, Integer.MIN_VALUE, 7, h1.R(new com.unity3d.ads.adplayer.b(21)));
                return;
            case 3:
                this.f6299y.f6307g.P(this.f6300z, Integer.MIN_VALUE, 12, h1.R(new com.unity3d.ads.adplayer.b(24)));
                return;
            case 4:
                this.f6299y.f6307g.P(this.f6300z, Integer.MIN_VALUE, 11, h1.R(new com.unity3d.ads.adplayer.b(19)));
                return;
            case 5:
                this.f6299y.f6307g.P(this.f6300z, Integer.MIN_VALUE, 3, h1.R(new u0(1)));
                return;
            case 6:
                this.f6299y.f6307g.P(this.f6300z, Integer.MIN_VALUE, 1, h1.R(new com.unity3d.ads.adplayer.b(16)));
                return;
            case 7:
                h1 h1Var = this.f6299y.f6307g;
                h1Var.getClass();
                s sVar2 = this.f6300z;
                h1Var.P(sVar2, Integer.MIN_VALUE, 1, h1.R(new b2.b(5, h1Var, sVar2)));
                return;
            case 8:
                h1 h1Var2 = this.f6299y.f6307g;
                h1Var2.getClass();
                s sVar3 = this.f6300z;
                h1Var2.P(sVar3, Integer.MIN_VALUE, 1, h1.R(new b2.b(5, h1Var2, sVar3)));
                return;
            default:
                this.f6299y.f6307g.P(this.f6300z, Integer.MIN_VALUE, 1, h1.R(new com.unity3d.ads.adplayer.b(16)));
                return;
        }
    }
}

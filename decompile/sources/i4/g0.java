package i4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements n0 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6363x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o0 f6364y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f6365z;

    public /* synthetic */ g0(o0 o0Var, int i6, int i10) {
        this.f6363x = i10;
        this.f6364y = o0Var;
        this.f6365z = i6;
    }

    @Override // i4.n0
    public final void f(s sVar) {
        int i6 = this.f6363x;
        int i10 = 0;
        r0 = false;
        boolean z10 = false;
        i10 = 0;
        i10 = 0;
        int i11 = this.f6365z;
        o0 o0Var = this.f6364y;
        switch (i6) {
            case 0:
                l1 l1Var = o0Var.f6473g.f6318t;
                int i12 = l.f6450a;
                if (i11 != -1 && i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2 && i11 != 3) {
                            u1.a.p("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i11 + " was converted to `Player.REPEAT_MODE_OFF`");
                        } else {
                            i10 = 2;
                        }
                    } else {
                        i10 = 1;
                    }
                }
                l1Var.p0(i10);
                return;
            default:
                l1 l1Var2 = o0Var.f6473g.f6318t;
                int i13 = l.f6450a;
                if (i11 != -1 && i11 != 0) {
                    if (i11 != 1 && i11 != 2) {
                        throw new IllegalArgumentException(h8.c.i(i11, "Unrecognized ShuffleMode: "));
                    }
                    z10 = true;
                }
                l1Var2.q(z10);
                return;
        }
    }
}

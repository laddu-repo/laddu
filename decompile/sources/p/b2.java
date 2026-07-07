package p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b2 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f10213x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f2 f10214y;

    public /* synthetic */ b2(f2 f2Var, int i6) {
        this.f10213x = i6;
        this.f10214y = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10213x) {
            case 0:
                t1 t1Var = this.f10214y.f10240z;
                if (t1Var != null) {
                    t1Var.setListSelectionHidden(true);
                    t1Var.requestLayout();
                    return;
                }
                return;
            default:
                f2 f2Var = this.f10214y;
                t1 t1Var2 = f2Var.f10240z;
                if (t1Var2 != null && t1Var2.isAttachedToWindow() && f2Var.f10240z.getCount() > f2Var.f10240z.getChildCount() && f2Var.f10240z.getChildCount() <= f2Var.J) {
                    f2Var.W.setInputMethodMode(2);
                    f2Var.b();
                    return;
                }
                return;
        }
    }
}

package n9;

import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w2 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9515x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ x2 f9516y;

    public w2(x2 x2Var, int i6) {
        this.f9515x = i6;
        switch (i6) {
            case 1:
                Objects.requireNonNull(x2Var);
                this.f9516y = x2Var;
                return;
            default:
                Objects.requireNonNull(x2Var);
                this.f9516y = x2Var;
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9515x) {
            case 0:
                x2 x2Var = this.f9516y;
                x2Var.C = x2Var.H;
                return;
            default:
                this.f9516y.H = null;
                return;
        }
    }
}

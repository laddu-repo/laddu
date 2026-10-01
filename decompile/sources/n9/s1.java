package n9;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l4 f9474b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f9475c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t1 f9476d;

    public /* synthetic */ s1(t1 t1Var, l4 l4Var, Bundle bundle, int i6) {
        this.f9473a = i6;
        this.f9474b = l4Var;
        this.f9475c = bundle;
        this.f9476d = t1Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.f9473a) {
            case 0:
                t1 t1Var = this.f9476d;
                t1Var.f9483e.w();
                return t1Var.f9483e.Z(this.f9475c, this.f9474b);
            default:
                t1 t1Var2 = this.f9476d;
                t1Var2.f9483e.w();
                return t1Var2.f9483e.Z(this.f9475c, this.f9474b);
        }
    }
}

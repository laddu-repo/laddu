package d;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.g1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements ve.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f3430x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q f3431y;

    public /* synthetic */ f(q qVar, int i6) {
        this.f3430x = i6;
        this.f3431y = qVar;
    }

    @Override // ve.a
    public final Object invoke() {
        Bundle bundle;
        switch (this.f3430x) {
            case 0:
                this.f3431y.reportFullyDrawn();
                return he.y.f6101a;
            case 1:
                return q.u(this.f3431y);
            case 2:
                q qVar = this.f3431y;
                Application application = qVar.getApplication();
                if (qVar.getIntent() != null) {
                    bundle = qVar.getIntent().getExtras();
                } else {
                    bundle = null;
                }
                return new g1(application, qVar, bundle);
            default:
                q qVar2 = this.f3431y;
                n0 n0Var = new n0(new e(qVar2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (!kotlin.jvm.internal.k.a(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new a2.c0(13, qVar2, n0Var));
                    } else {
                        qVar2.getLifecycle().a(new g(0, n0Var, qVar2));
                    }
                }
                return n0Var;
        }
    }
}

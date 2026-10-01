package j1;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6896x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m f6897y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ a1 f6898z;

    public /* synthetic */ d(m mVar, a1 a1Var, int i6) {
        this.f6896x = i6;
        this.f6897y = mVar;
        this.f6898z = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6896x) {
            case 0:
                m this$0 = this.f6897y;
                kotlin.jvm.internal.k.e(this$0, "this$0");
                a1 operation = this.f6898z;
                kotlin.jvm.internal.k.e(operation, "$operation");
                this$0.a(operation);
                return;
            case 1:
                m mVar = this.f6897y;
                ArrayList arrayList = mVar.f6928b;
                a1 a1Var = this.f6898z;
                if (arrayList.contains(a1Var)) {
                    int i6 = a1Var.f6874a;
                    View view = a1Var.f6876c.f7024g0;
                    kotlin.jvm.internal.k.d(view, "operation.fragment.mView");
                    h8.c.d(i6, view, mVar.f6927a);
                    return;
                }
                return;
            default:
                m mVar2 = this.f6897y;
                ArrayList arrayList2 = mVar2.f6928b;
                a1 a1Var2 = this.f6898z;
                arrayList2.remove(a1Var2);
                mVar2.f6929c.remove(a1Var2);
                return;
        }
    }
}

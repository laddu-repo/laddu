package p;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c2 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10225a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10226b;

    public /* synthetic */ c2(Object obj, int i6) {
        this.f10225a = i6;
        this.f10226b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f10225a) {
            case 0:
                f2 f2Var = (f2) this.f10226b;
                if (f2Var.W.isShowing()) {
                    f2Var.b();
                    return;
                }
                return;
            case 1:
                ((s5.g) this.f10226b).e();
                return;
            case 2:
                a3 a3Var = (a3) this.f10226b;
                a3Var.f14454x = true;
                a3Var.notifyDataSetChanged();
                return;
            default:
                ((TabLayout) this.f10226b).e();
                return;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f10225a) {
            case 0:
                ((f2) this.f10226b).dismiss();
                return;
            case 1:
                ((s5.g) this.f10226b).e();
                return;
            case 2:
                a3 a3Var = (a3) this.f10226b;
                a3Var.f14454x = false;
                a3Var.notifyDataSetInvalidated();
                return;
            default:
                ((TabLayout) this.f10226b).e();
                return;
        }
    }
}

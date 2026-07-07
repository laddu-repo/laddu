package nd;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import java.util.Locale;
import p.f2;
import p.t1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9691x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f9692y;

    public /* synthetic */ f0(Object obj, int i6) {
        this.f9691x = i6;
        this.f9692y = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView parentView, View selectedItemView, int i6, long j) {
        t1 t1Var;
        switch (this.f9691x) {
            case 0:
                kotlin.jvm.internal.k.e(parentView, "parentView");
                kotlin.jvm.internal.k.e(selectedItemView, "selectedItemView");
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) this.f9692y;
                String lowerCase = parentView.getItemAtPosition(i6).toString().toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.k.d(lowerCase, "toLowerCase(...)");
                wVar.f8055x = lowerCase;
                return;
            case 1:
                if (i6 != -1 && (t1Var = ((f2) this.f9692y).f10240z) != null) {
                    t1Var.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) this.f9692y).o(i6);
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i6 = this.f9691x;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    private final void c(AdapterView adapterView) {
    }
}

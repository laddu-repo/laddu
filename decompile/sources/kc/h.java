package kc;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.q;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import gc.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class h extends q {
    public hd.a J0;
    public final List K0;
    public final mc.d L0;
    public final int M0;
    public int N0;
    public int O0;

    public h() {
        this.K0 = null;
        this.L0 = null;
        this.M0 = 0;
    }

    @Override // androidx.fragment.app.q, androidx.fragment.app.y
    public final void C() {
        Dialog dialog;
        super.C();
        if (m().getConfiguration().orientation != 1 || (dialog = this.E0) == null || dialog.getWindow() == null) {
            return;
        }
        int i = (int) (m().getDisplayMetrics().density * 32.0f);
        this.E0.getWindow().setLayout(m().getDisplayMetrics().widthPixels - i, m().getDisplayMetrics().heightPixels - ((int) (m().getDisplayMetrics().density * 200.0f)));
    }

    @Override // androidx.fragment.app.y
    public final void E() {
        List list = this.K0;
        if (list == null || this.L0 == null) {
            P(false, false);
            return;
        }
        ((MaterialCardView) this.J0.f6279w).setOnClickListener(new com.google.android.material.datepicker.n(8, this));
        this.N0 = I().getColor(fc.j.light_white);
        this.O0 = I().getColor(fc.j.app_color);
        final ArrayList arrayList = new ArrayList();
        arrayList.add("All");
        arrayList.addAll(list);
        g gVar = new g(this, I(), fc.m.item_choose_tab, fc.l.choose_txt, arrayList);
        ((ListView) this.J0.f6280x).setAdapter((ListAdapter) gVar);
        ((ListView) this.J0.f6280x).setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: kc.f
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j8) {
                TextView textView = (TextView) view.findViewById(fc.l.choose_txt);
                h hVar = this.f7911v;
                mc.d dVar = hVar.L0;
                int iIndexOf = arrayList.indexOf(textView.getText().toString());
                mc.g gVar2 = dVar.f8581v;
                gVar2.F0 = iIndexOf;
                s9.g gVarF = ((TabLayout) gVar2.f8587x0.f2892g).f(iIndexOf);
                if (gVarF != null) {
                    TabLayout tabLayout = gVarF.f11584d;
                    if (tabLayout == null) {
                        throw new IllegalArgumentException("Tab not attached to a TabLayout");
                    }
                    tabLayout.i(gVarF, true);
                }
                hVar.P(false, false);
            }
        });
        ((TextInputEditText) this.J0.f6281y).addTextChangedListener(new s(1, gVar));
    }

    @Override // androidx.fragment.app.q
    public final Dialog Q(Bundle bundle) {
        Dialog dialogQ = super.Q(bundle);
        Window window = dialogQ.getWindow();
        Objects.requireNonNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        dialogQ.setCancelable(true);
        dialogQ.setCanceledOnTouchOutside(true);
        return dialogQ;
    }

    @Override // androidx.fragment.app.y
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(fc.m.dialog_choose, (ViewGroup) null, false);
        int i = fc.l.listView;
        ListView listView = (ListView) a.a.k(viewInflate, i);
        if (listView != null) {
            i = fc.l.searchEditText;
            TextInputEditText textInputEditText = (TextInputEditText) a.a.k(viewInflate, i);
            if (textInputEditText != null) {
                i = fc.l.search_input_layout;
                if (((TextInputLayout) a.a.k(viewInflate, i)) != null) {
                    MaterialCardView materialCardView = (MaterialCardView) viewInflate;
                    this.J0 = new hd.a(materialCardView, listView, textInputEditText, 6);
                    return materialCardView;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public h(ArrayList arrayList, int i, mc.d dVar) {
        this.K0 = arrayList;
        this.M0 = i;
        this.L0 = dVar;
    }
}

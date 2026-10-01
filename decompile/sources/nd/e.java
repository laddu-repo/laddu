package nd;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.playfy.tv.R;
import com.playfy.tv.databinding.ErrorLyBinding;
import com.playfy.tv.databinding.FragmentRecyclerBinding;
import java.util.List;
import w4.k0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class e<T> extends j1.y {
    public static final /* synthetic */ bf.o[] A0;

    /* renamed from: z0, reason: collision with root package name */
    public final j6.c f9687z0;

    static {
        kotlin.jvm.internal.q qVar = new kotlin.jvm.internal.q(e.class, "binding", "getBinding()Lcom/playfy/tv/databinding/FragmentRecyclerBinding;");
        kotlin.jvm.internal.x.f8056a.getClass();
        A0 = new bf.o[]{qVar};
    }

    public e() {
        super(R.layout.fragment_recycler);
        this.f9687z0 = k6.e.o(this, FragmentRecyclerBinding.class);
    }

    @Override // j1.y
    public void B(View view, Bundle bundle) {
        kotlin.jvm.internal.k.e(view, "view");
        FragmentRecyclerBinding N = N();
        SwipeRefreshLayout swipeRefreshLayout = N.f3299a;
        ErrorLyBinding errorLyBinding = N.f3301c;
        swipeRefreshLayout.setOnRefreshListener(new j2.u(this, 10));
        RecyclerView recyclerView = N.f3302d;
        Context F = F();
        Object systemService = F.getSystemService("uimode");
        kotlin.jvm.internal.k.c(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
        int i6 = 8;
        int i10 = 4;
        if (((UiModeManager) systemService).getCurrentModeType() == 4 || F.getResources().getConfiguration().orientation == 2) {
            i10 = 8;
        }
        recyclerView.g(new gd.g(i10, recyclerView.getResources().getDimensionPixelSize(R.dimen._5sdp)));
        F();
        recyclerView.setLayoutManager(new GridLayoutManager(i10, 0));
        recyclerView.setAdapter(Q());
        errorLyBinding.f3256b.setText(h().getString(R.string.empty_error, P()));
        errorLyBinding.f3262h.setOnClickListener(new com.google.android.material.datepicker.n(this, i6));
    }

    public final FragmentRecyclerBinding N() {
        return (FragmentRecyclerBinding) this.f9687z0.a(this, A0[0]);
    }

    public abstract String P();

    public abstract k0 Q();

    public abstract void R(String str);

    public final void S(List items) {
        k0 Q = Q();
        if (r4.a.w(Q)) {
            ((w4.e0) Q).i(items);
        } else if (Q instanceof gd.s) {
            gd.s sVar = (gd.s) Q;
            sVar.getClass();
            kotlin.jvm.internal.k.e(items, "items");
            sVar.i(ie.j.Z(items));
        }
    }

    public void O() {
    }
}

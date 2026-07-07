package nd;

import android.app.UiModeManager;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.d1;
import androidx.lifecycle.j1;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.playfy.tv.R;
import com.playfy.tv.activities.MainActivity;
import com.playfy.tv.databinding.ErrorLyBinding;
import com.playfy.tv.databinding.FragmentEventsBinding;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class d extends j1.y {
    public static final /* synthetic */ bf.o[] D0;
    public final he.m A0;
    public final he.m B0;
    public final he.m C0;

    /* renamed from: z0, reason: collision with root package name */
    public final j6.c f9683z0;

    static {
        kotlin.jvm.internal.q qVar = new kotlin.jvm.internal.q(d.class, "binding", "getBinding()Lcom/playfy/tv/databinding/FragmentEventsBinding;");
        kotlin.jvm.internal.x.f8056a.getClass();
        D0 = new bf.o[]{qVar};
    }

    public d() {
        super(R.layout.fragment_events);
        this.f9683z0 = k6.e.o(this, FragmentEventsBinding.class);
        final int i6 = 0;
        this.A0 = he.a.d(new ve.a(this) { // from class: nd.a

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ d f9674y;

            {
                this.f9674y = this;
            }

            @Override // ve.a
            public final Object invoke() {
                CharSequence charSequence;
                String obj;
                int i10 = i6;
                d dVar = this.f9674y;
                switch (i10) {
                    case 0:
                        bf.o[] oVarArr = d.D0;
                        l4.u f3 = a8.e.k(dVar).f8199b.f();
                        if (f3 == null || (charSequence = f3.A) == null || (obj = charSequence.toString()) == null) {
                            return "Live Events";
                        }
                        return obj;
                    case 1:
                        return new gd.p(new c(5, (MainActivity) dVar.E(), MainActivity.class, "openPlayer", "openPlayer(Ljava/lang/String;ILjava/util/List;ZILjava/lang/String;)V", 0, 0), null, null, !kotlin.jvm.internal.k.a((String) dVar.A0.getValue(), dVar.i(R.string.high)), 6);
                    default:
                        bf.o[] oVarArr2 = d.D0;
                        return new gd.f(new b(dVar, 2));
                }
            }
        });
        final int i10 = 1;
        this.B0 = he.a.d(new ve.a(this) { // from class: nd.a

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ d f9674y;

            {
                this.f9674y = this;
            }

            @Override // ve.a
            public final Object invoke() {
                CharSequence charSequence;
                String obj;
                int i102 = i10;
                d dVar = this.f9674y;
                switch (i102) {
                    case 0:
                        bf.o[] oVarArr = d.D0;
                        l4.u f3 = a8.e.k(dVar).f8199b.f();
                        if (f3 == null || (charSequence = f3.A) == null || (obj = charSequence.toString()) == null) {
                            return "Live Events";
                        }
                        return obj;
                    case 1:
                        return new gd.p(new c(5, (MainActivity) dVar.E(), MainActivity.class, "openPlayer", "openPlayer(Ljava/lang/String;ILjava/util/List;ZILjava/lang/String;)V", 0, 0), null, null, !kotlin.jvm.internal.k.a((String) dVar.A0.getValue(), dVar.i(R.string.high)), 6);
                    default:
                        bf.o[] oVarArr2 = d.D0;
                        return new gd.f(new b(dVar, 2));
                }
            }
        });
        final int i11 = 2;
        this.C0 = he.a.d(new ve.a(this) { // from class: nd.a

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ d f9674y;

            {
                this.f9674y = this;
            }

            @Override // ve.a
            public final Object invoke() {
                CharSequence charSequence;
                String obj;
                int i102 = i11;
                d dVar = this.f9674y;
                switch (i102) {
                    case 0:
                        bf.o[] oVarArr = d.D0;
                        l4.u f3 = a8.e.k(dVar).f8199b.f();
                        if (f3 == null || (charSequence = f3.A) == null || (obj = charSequence.toString()) == null) {
                            return "Live Events";
                        }
                        return obj;
                    case 1:
                        return new gd.p(new c(5, (MainActivity) dVar.E(), MainActivity.class, "openPlayer", "openPlayer(Ljava/lang/String;ILjava/util/List;ZILjava/lang/String;)V", 0, 0), null, null, !kotlin.jvm.internal.k.a((String) dVar.A0.getValue(), dVar.i(R.string.high)), 6);
                    default:
                        bf.o[] oVarArr2 = d.D0;
                        return new gd.f(new b(dVar, 2));
                }
            }
        });
    }

    @Override // j1.y
    public void B(View view, Bundle bundle) {
        kotlin.jvm.internal.k.e(view, "view");
        FragmentEventsBinding N = N();
        le.c cVar = null;
        cf.m.D(N.f3293d, (SharedPreferences) a8.b.f(this).a(kotlin.jvm.internal.x.a(SharedPreferences.class), null));
        ErrorLyBinding errorLyBinding = N.f3292c;
        int i6 = 1;
        int i10 = 0;
        errorLyBinding.f3256b.setText(h().getString(R.string.empty_error, O()));
        N.f3290a.setOnRefreshListener(new j2.u(this, 9));
        errorLyBinding.f3262h.setOnClickListener(new com.google.android.material.datepicker.n(this, 7));
        RecyclerView recyclerView = N.f3294e;
        recyclerView.setAdapter((gd.p) this.B0.getValue());
        Object systemService = F().getSystemService("uimode");
        kotlin.jvm.internal.k.c(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
        if (((UiModeManager) systemService).getCurrentModeType() == 4) {
            recyclerView.setPadding(0, 0, 0, 0);
            F();
            recyclerView.setLayoutManager(new GridLayoutManager(2));
            recyclerView.g(new gd.g(2, recyclerView.getResources().getDimensionPixelSize(R.dimen._5sdp)));
        }
        N.f3295f.setAdapter((gd.f) this.C0.getValue());
        int i11 = 3;
        if (P() instanceof od.s) {
            od.j P = P();
            kotlin.jvm.internal.k.c(P, "null cannot be cast to non-null type com.playfy.tv.viewmodels.ViewModelEvents");
            od.s sVar = (od.s) P;
            sVar.j.d(j(), new fd.w(new fd.f(N, this, sVar, i11), 2));
            d1.a(sVar.f10144h).d(j(), new fd.w(new cf.n(N, 11), 2));
        } else {
            N.f3291b.setVisibility(8);
        }
        od.j P2 = P();
        d1.a(new j1(P2.f(new j1(P2.h(P2.f10105b), P2.f10106c, new kf.f0(P2, null, 2))), P2.f10107d, new od.c(i11, cVar))).d(j(), new fd.w(new b(this, i10), 2));
        od.j P3 = P();
        d1.a(new j1(P3.f10108e, P3.f10106c, new od.b(i11, cVar, i10))).d(j(), new fd.w(new b(this, i6), 2));
    }

    public final FragmentEventsBinding N() {
        return (FragmentEventsBinding) this.f9683z0.a(this, D0[0]);
    }

    public abstract String O();

    public abstract od.j P();
}

package ld;

import android.app.Dialog;
import android.content.DialogInterface;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.media3.ui.TrackSelectionView;
import com.google.android.material.tabs.TabLayout;
import com.playfy.tv.R;
import db.c1;
import db.i0;
import db.k0;
import i.d0;
import j1.r;
import j1.y;
import j2.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import r1.f1;
import r1.i1;
import r1.j1;
import r1.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o extends r {
    public static final c1 U0;
    public final SparseArray P0 = new SparseArray();
    public final ArrayList Q0 = new ArrayList();
    public int R0;
    public m S0;
    public fd.m T0;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class a extends y {
        public boolean A0;
        public boolean B0;
        public Map C0;

        /* renamed from: z0, reason: collision with root package name */
        public ArrayList f8349z0;

        public a() {
            K();
        }

        @Override // j1.y
        public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View inflate = layoutInflater.inflate(R.layout.exo_track_selection_dialog, viewGroup, false);
            TrackSelectionView trackSelectionView = (TrackSelectionView) inflate.findViewById(R.id.exo_track_selection_view);
            trackSelectionView.setShowDisableOption(true);
            trackSelectionView.setAllowMultipleOverrides(false);
            trackSelectionView.setAllowAdaptiveSelections(this.A0);
            ArrayList arrayList = this.f8349z0;
            boolean z10 = this.B0;
            Map map = this.C0;
            HashMap hashMap = trackSelectionView.D;
            ArrayList arrayList2 = trackSelectionView.C;
            trackSelectionView.I = z10;
            trackSelectionView.J = this;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            hashMap.clear();
            hashMap.putAll(TrackSelectionView.a(map, arrayList, trackSelectionView.F));
            trackSelectionView.c();
            return inflate;
        }
    }

    static {
        i0 i0Var = k0.f4008y;
        Object[] objArr = {2, 1, 3, 4};
        db.r.c(4, objArr);
        U0 = k0.h(4, objArr);
    }

    public o() {
        K();
    }

    public static void R(j1 j1Var, o oVar, u uVar) {
        boolean z10;
        Map map;
        SparseArray sparseArray = oVar.P0;
        i1 a10 = j1Var.a();
        int i6 = 0;
        while (true) {
            c1 c1Var = U0;
            if (i6 < c1Var.A) {
                int intValue = ((Integer) c1Var.get(i6)).intValue();
                a aVar = (a) sparseArray.get(intValue);
                if (aVar != null && aVar.B0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a10.l(intValue, z10);
                a10.d(intValue);
                a aVar2 = (a) sparseArray.get(intValue);
                if (aVar2 == null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    map = aVar2.C0;
                }
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    a10.a((f1) it.next());
                }
                i6++;
            } else {
                ((u0) uVar.f7139y).A0(a10.b());
                return;
            }
        }
    }

    @Override // j1.r
    public final Dialog O() {
        d0 d0Var = new d0(E(), R.style.CustomAlertDialog);
        d0Var.setTitle(this.R0);
        return d0Var;
    }

    @Override // j1.r, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.T0.onDismiss(dialogInterface);
    }

    @Override // j1.y
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i6 = 0;
        View inflate = layoutInflater.inflate(R.layout.track_selection_dialog, viewGroup, false);
        TabLayout tabLayout = (TabLayout) inflate.findViewById(R.id.track_selection_dialog_tab_layout);
        s5.g gVar = (s5.g) inflate.findViewById(R.id.track_selection_dialog_view_pager);
        Button button = (Button) inflate.findViewById(R.id.track_selection_dialog_cancel_button);
        Button button2 = (Button) inflate.findViewById(R.id.track_selection_dialog_ok_button);
        gVar.setAdapter(new n(this, c()));
        tabLayout.setupWithViewPager(gVar);
        if (this.P0.size() <= 1) {
            i6 = 8;
        }
        tabLayout.setVisibility(i6);
        final int i10 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: ld.l

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ o f8339y;

            {
                this.f8339y = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                o oVar = this.f8339y;
                switch (i11) {
                    case 0:
                        c1 c1Var = o.U0;
                        oVar.N(false, false);
                        return;
                    default:
                        oVar.S0.onClick(oVar.K0, -1);
                        oVar.N(false, false);
                        return;
                }
            }
        });
        final int i11 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: ld.l

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ o f8339y;

            {
                this.f8339y = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                o oVar = this.f8339y;
                switch (i112) {
                    case 0:
                        c1 c1Var = o.U0;
                        oVar.N(false, false);
                        return;
                    default:
                        oVar.S0.onClick(oVar.K0, -1);
                        oVar.N(false, false);
                        return;
                }
            }
        });
        return inflate;
    }
}

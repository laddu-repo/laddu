package kc;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.d1;
import androidx.fragment.app.q;
import androidx.fragment.app.y;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.ui.TrackSelectionView;
import c2.j0;
import com.google.android.material.tabs.TabLayout;
import fc.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import t1.n0;
import t1.u0;
import t1.w0;
import t1.x0;
import t1.y0;
import y9.c0;
import y9.e1;
import y9.f0;
import y9.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o extends q {
    public static final z0 O0 = f0.r(2, 1);
    public final SparseArray J0 = new SparseArray();
    public final ArrayList K0 = new ArrayList();
    public int L0;
    public m M0;
    public DialogInterface.OnDismissListener N0;

    /* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
    public static final class a extends y {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public ArrayList f7934t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f7935u0;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public boolean f7936v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f7937w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Map f7938x0;

        public a() {
            M();
        }

        @Override // androidx.fragment.app.y
        public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(fc.m.exo_track_selection_dialog, viewGroup, false);
            TrackSelectionView trackSelectionView = (TrackSelectionView) viewInflate.findViewById(fc.l.exo_track_selection_view);
            trackSelectionView.setShowDisableOption(true);
            trackSelectionView.setAllowMultipleOverrides(this.f7936v0);
            trackSelectionView.setAllowAdaptiveSelections(this.f7935u0);
            ArrayList arrayList = this.f7934t0;
            boolean z2 = this.f7937w0;
            Map map = this.f7938x0;
            HashMap map2 = trackSelectionView.B;
            ArrayList arrayList2 = trackSelectionView.A;
            trackSelectionView.G = z2;
            trackSelectionView.H = this;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            map2.clear();
            map2.putAll(TrackSelectionView.a(map, arrayList, trackSelectionView.D));
            trackSelectionView.c();
            return viewInflate;
        }
    }

    public o() {
        M();
    }

    public static void S(x0 x0Var, o oVar, d1 d1Var) {
        SparseArray sparseArray = oVar.J0;
        w0 w0VarA = x0Var.a();
        int i = 0;
        while (true) {
            z0 z0Var = O0;
            if (i >= z0Var.f14639y) {
                ((j0) ((n0) d1Var.f1006w)).j0(w0VarA.a());
                return;
            }
            int iIntValue = ((Integer) z0Var.get(i)).intValue();
            a aVar = (a) sparseArray.get(iIntValue);
            w0VarA.d(iIntValue, aVar != null && aVar.f7937w0);
            w0VarA.b(iIntValue);
            a aVar2 = (a) sparseArray.get(iIntValue);
            for (u0 u0Var : (aVar2 == null ? Collections.EMPTY_MAP : aVar2.f7938x0).values()) {
                w0VarA.f12151t.put(u0Var.f12121a, u0Var);
            }
            i++;
        }
    }

    public static o T(j0 j0Var, DialogInterface.OnDismissListener onDismissListener) {
        int i = fc.q.track_selection_title;
        t1.z0 z0VarO = j0Var.O();
        r2.j jVarU = j0Var.U();
        d1 d1Var = new d1(26, j0Var);
        o oVar = new o();
        m mVar = new m(jVarU, oVar, d1Var);
        oVar.L0 = i;
        oVar.M0 = mVar;
        oVar.N0 = onDismissListener;
        int i10 = 0;
        while (true) {
            z0 z0Var = O0;
            if (i10 >= z0Var.f14639y) {
                return oVar;
            }
            Integer num = (Integer) z0Var.get(i10);
            int iIntValue = num.intValue();
            ArrayList arrayList = new ArrayList();
            c0 c0VarListIterator = z0VarO.f12184a.listIterator(0);
            while (c0VarListIterator.hasNext()) {
                y0 y0Var = (y0) c0VarListIterator.next();
                if (y0Var.f12174b.f12113c == iIntValue) {
                    arrayList.add(y0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                a aVar = new a();
                boolean zContains = jVarU.f12172u.contains(num);
                e1 e1Var = jVarU.f12171t;
                aVar.f7934t0 = arrayList;
                aVar.f7937w0 = zContains;
                aVar.f7935u0 = true;
                aVar.f7936v0 = true;
                aVar.f7938x0 = new HashMap(TrackSelectionView.a(e1Var, arrayList, true));
                oVar.J0.put(iIntValue, aVar);
                oVar.K0.add(num);
            }
            i10++;
        }
    }

    @Override // androidx.fragment.app.q
    public final Dialog Q(Bundle bundle) {
        h.f0 f0Var = new h.f0(h(), r.TrackSelectionDialogThemeOverlay);
        f0Var.setTitle(this.L0);
        return f0Var;
    }

    @Override // androidx.fragment.app.q, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.N0;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.y
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(fc.m.track_selection_dialog, viewGroup, false);
        TabLayout tabLayout = (TabLayout) viewInflate.findViewById(fc.l.track_selection_dialog_tab_layout);
        i5.h hVar = (i5.h) viewInflate.findViewById(fc.l.track_selection_dialog_view_pager);
        Button button = (Button) viewInflate.findViewById(fc.l.track_selection_dialog_cancel_button);
        Button button2 = (Button) viewInflate.findViewById(fc.l.track_selection_dialog_ok_button);
        hVar.setAdapter(new n(this, i()));
        tabLayout.setupWithViewPager(hVar);
        tabLayout.setVisibility(this.J0.size() <= 1 ? 8 : 0);
        final int i = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: kc.l

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ o f7925w;

            {
                this.f7925w = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = i;
                o oVar = this.f7925w;
                switch (i10) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        z0 z0Var = o.O0;
                        oVar.P(false, false);
                        break;
                    default:
                        oVar.M0.onClick(oVar.E0, -1);
                        oVar.P(false, false);
                        break;
                }
            }
        });
        final int i10 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: kc.l

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ o f7925w;

            {
                this.f7925w = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i102 = i10;
                o oVar = this.f7925w;
                switch (i102) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        z0 z0Var = o.O0;
                        oVar.P(false, false);
                        break;
                    default:
                        oVar.M0.onClick(oVar.E0, -1);
                        oVar.P(false, false);
                        break;
                }
            }
        });
        return viewInflate;
    }
}

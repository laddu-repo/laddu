package mc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.livxow.tv.app.App;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class n extends androidx.fragment.app.y {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public hd.a f8605t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public App f8606u0;

    public static HashSet P(int i, int i10) {
        Random random = new Random();
        HashSet hashSet = new HashSet();
        while (hashSet.size() < Math.min(i, i10)) {
            hashSet.add(Integer.valueOf(random.nextInt(i)));
        }
        return hashSet;
    }

    @Override // androidx.fragment.app.y
    public final void E() {
        this.f8606u0 = App.P;
        Q();
    }

    public final void Q() {
        ((TextView) this.f8605t0.f6279w).setVisibility(8);
        ((RecyclerView) this.f8605t0.f6281y).setVisibility(8);
        ((ProgressBar) this.f8605t0.f6280x).setVisibility(0);
        if (h() == null) {
            return;
        }
        App app = this.f8606u0;
        if (app.D != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f8606u0.D;
            HashSet hashSetP = P(arrayList2.size(), 20);
            String str = this.f8606u0.G;
            Iterator it = hashSetP.iterator();
            while (it.hasNext()) {
                pc.c cVar = (pc.c) arrayList2.get(((Integer) it.next()).intValue());
                if (!cVar.f10489c.equals(str)) {
                    arrayList.add(cVar);
                }
            }
            if (arrayList.isEmpty()) {
                ((RecyclerView) this.f8605t0.f6281y).setVisibility(8);
                ((TextView) this.f8605t0.f6279w).setVisibility(0);
            } else {
                ((RecyclerView) this.f8605t0.f6281y).setAdapter(new hc.e(H(), arrayList));
                ((RecyclerView) this.f8605t0.f6281y).setLayoutManager(new GridLayoutManager(4));
                ((RecyclerView) this.f8605t0.f6281y).setVisibility(0);
                ((TextView) this.f8605t0.f6279w).setVisibility(8);
            }
            App app2 = this.f8606u0;
            app2.A = null;
            app2.D = null;
        } else if (app.A != null) {
            h.j jVarH = h();
            if (jVarH != null) {
                ArrayList arrayList3 = new ArrayList();
                List list = this.f8606u0.A;
                HashSet hashSetP2 = P(list.size(), 6);
                String str2 = this.f8606u0.G;
                Iterator it2 = hashSetP2.iterator();
                while (it2.hasNext()) {
                    pc.e eVar = (pc.e) list.get(((Integer) it2.next()).intValue());
                    if (!eVar.f10503h.equals(str2)) {
                        arrayList3.add(eVar);
                    }
                }
                if (arrayList3.isEmpty()) {
                    ((RecyclerView) this.f8605t0.f6281y).setVisibility(8);
                    ((TextView) this.f8605t0.f6279w).setVisibility(0);
                } else {
                    ((RecyclerView) this.f8605t0.f6281y).setAdapter(new hc.h(jVarH, arrayList3, null, null));
                    ((RecyclerView) this.f8605t0.f6281y).setLayoutManager(new LinearLayoutManager(1));
                    ((RecyclerView) this.f8605t0.f6281y).setVisibility(0);
                    ((TextView) this.f8605t0.f6279w).setVisibility(8);
                }
                App app3 = this.f8606u0;
                app3.A = null;
                app3.D = null;
            }
        } else {
            if (app.C == null) {
                ((TextView) this.f8605t0.f6279w).setVisibility(0);
                ((ProgressBar) this.f8605t0.f6280x).setVisibility(8);
                return;
            }
            h.j jVarH2 = h();
            if (jVarH2 != null) {
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = this.f8606u0.C;
                HashSet hashSetP3 = P(arrayList5.size(), 6);
                String str3 = this.f8606u0.G;
                Iterator it3 = hashSetP3.iterator();
                while (it3.hasNext()) {
                    pc.f fVar = (pc.f) arrayList5.get(((Integer) it3.next()).intValue());
                    if (!fVar.f10516h.equals(str3)) {
                        arrayList4.add(fVar);
                    }
                }
                if (arrayList4.isEmpty()) {
                    ((RecyclerView) this.f8605t0.f6281y).setVisibility(8);
                    ((TextView) this.f8605t0.f6279w).setVisibility(0);
                } else {
                    ((RecyclerView) this.f8605t0.f6281y).setAdapter(new hc.k(jVarH2, arrayList4));
                    ((RecyclerView) this.f8605t0.f6281y).setLayoutManager(new LinearLayoutManager(1));
                    ((RecyclerView) this.f8605t0.f6281y).setVisibility(0);
                    ((TextView) this.f8605t0.f6279w).setVisibility(8);
                }
                App app4 = this.f8606u0;
                app4.A = null;
                app4.D = null;
            }
        }
        ((RecyclerView) this.f8605t0.f6281y).setVisibility(0);
        ((ProgressBar) this.f8605t0.f6280x).setVisibility(8);
    }

    @Override // androidx.fragment.app.y
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(fc.m.fragment_more, (ViewGroup) null, false);
        int i = fc.l.not_available;
        TextView textView = (TextView) a.a.k(viewInflate, i);
        if (textView != null) {
            i = fc.l.progress;
            ProgressBar progressBar = (ProgressBar) a.a.k(viewInflate, i);
            if (progressBar != null) {
                i = fc.l.recycler_view;
                RecyclerView recyclerView = (RecyclerView) a.a.k(viewInflate, i);
                if (recyclerView != null) {
                    LinearLayout linearLayout = (LinearLayout) viewInflate;
                    this.f8605t0 = new hd.a(linearLayout, textView, progressBar, recyclerView);
                    return linearLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

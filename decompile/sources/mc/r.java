package mc;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.m0;
import androidx.fragment.app.q0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.livxow.tv.app.App;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import k8.k4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class r extends a {
    public App A0;
    public String B0;
    public final androidx.fragment.app.r C0;
    public final androidx.fragment.app.u D0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ad.c f8613w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public hc.q f8614x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ArrayList f8615y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public g f8616z0;

    public r() {
        m0 m0Var = new m0(3);
        q qVar = new q(this);
        androidx.fragment.app.u uVar = new androidx.fragment.app.u(this);
        if (this.f1151v > 1) {
            throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
        }
        AtomicReference atomicReference = new AtomicReference();
        androidx.fragment.app.v vVar = new androidx.fragment.app.v(this, uVar, atomicReference, m0Var, qVar);
        if (this.f1151v >= 0) {
            vVar.a();
        } else {
            this.f1149q0.add(vVar);
        }
        this.C0 = new androidx.fragment.app.r(atomicReference);
        this.D0 = new androidx.fragment.app.u(this);
    }

    @Override // androidx.fragment.app.y
    public final void E() {
        this.f8571v0 = "Playlists";
        ((SwipeRefreshLayout) this.f8613w0.f482z).setRefreshing(true);
        this.A0 = (App) H().getApplication();
        W();
        ((CoordinatorLayout) this.f8613w0.f479w).setOnClickListener(new gc.d(1));
        ((FloatingActionButton) this.f8613w0.f480x).setOnClickListener(new com.google.android.material.datepicker.n(13, this));
        ((SwipeRefreshLayout) this.f8613w0.f482z).setOnRefreshListener(new q(this));
    }

    @Override // mc.a
    public final boolean P() {
        if (((FragmentContainerView) this.f8613w0.f481y).getVisibility() != 0) {
            return true;
        }
        this.A0.f3689z.c("Playlists");
        ((FloatingActionButton) this.f8613w0.f480x).setVisibility(0);
        ((SwipeRefreshLayout) this.f8613w0.f482z).setVisibility(0);
        ((FragmentContainerView) this.f8613w0.f481y).setVisibility(8);
        q0 q0VarI = i();
        q0VarI.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(q0VarI);
        aVar.g(this.f8616z0);
        aVar.d(false);
        this.f8616z0 = null;
        this.B0 = null;
        return false;
    }

    @Override // mc.a
    public final String Q() {
        return !TextUtils.isEmpty(this.B0) ? this.B0 : this.f8571v0;
    }

    @Override // mc.a
    public final void U(String str) {
        if (str == null) {
            return;
        }
        if (((FragmentContainerView) this.f8613w0.f481y).getVisibility() == 0) {
            this.f8616z0.U(str);
            return;
        }
        if (this.f8615y0 != null) {
            if (TextUtils.isEmpty(str)) {
                hc.q qVar = this.f8614x0;
                ArrayList arrayList = this.f8615y0;
                qVar.getClass();
                qVar.f = new ArrayList(arrayList);
                qVar.f9680a.b();
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = this.f8615y0;
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList3.get(i);
                i++;
                pc.j jVar = (pc.j) obj;
                String str2 = jVar.f10535a;
                if (str2 != null && str2.toLowerCase().contains(str.toLowerCase())) {
                    arrayList2.add(jVar);
                }
            }
            hc.q qVar2 = this.f8614x0;
            qVar2.getClass();
            qVar2.f = new ArrayList(arrayList2);
            qVar2.f9680a.b();
        }
    }

    public final void V(String str, String str2) throws IOException {
        File file = new File(h().getExternalFilesDir(null), str);
        int i = 1;
        while (file.exists()) {
            file = new File(h().getExternalFilesDir(null), i + "_" + str);
            i++;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(str2.getBytes());
        fileOutputStream.close();
        String absolutePath = file.getAbsolutePath();
        vc.a.a(j(), str, absolutePath, "", "");
        this.D0.b(str, absolutePath, "", "");
    }

    public final void W() {
        boolean z2;
        String str;
        String str2;
        Context contextJ = j();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = vc.a.j(contextJ).getStringSet("play_list", new HashSet()).iterator();
        while (it.hasNext()) {
            String[] strArrSplit = it.next().split("\\*");
            if (strArrSplit.length > 2) {
                z2 = true;
                str = strArrSplit[2];
                str2 = strArrSplit[3];
            } else {
                z2 = false;
                str = "";
                str2 = str;
            }
            arrayList.add(new pc.j(strArrSplit[0], strArrSplit[1], str, str2, z2));
        }
        this.f8615y0 = arrayList;
        hc.q qVar = this.f8614x0;
        if (qVar == null) {
            hc.q qVar2 = new hc.q(j(), this.f8615y0, new k4(this));
            this.f8614x0 = qVar2;
            ((RecyclerView) this.f8613w0.A).setAdapter(qVar2);
            ((RecyclerView) this.f8613w0.A).setLayoutManager(new LinearLayoutManager(1));
        } else {
            qVar.f = new ArrayList(arrayList);
            qVar.f9680a.b();
            ((RecyclerView) this.f8613w0.A).j0(0);
        }
        ((SwipeRefreshLayout) this.f8613w0.f482z).setRefreshing(false);
    }

    @Override // androidx.fragment.app.y
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(fc.m.fragment_playlist, (ViewGroup) null, false);
        int i = fc.l.add_playlist;
        FloatingActionButton floatingActionButton = (FloatingActionButton) a.a.k(viewInflate, i);
        if (floatingActionButton != null) {
            i = fc.l.fragment_container;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) a.a.k(viewInflate, i);
            if (fragmentContainerView != null) {
                i = fc.l.playlist_refresh_layout;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a.a.k(viewInflate, i);
                if (swipeRefreshLayout != null) {
                    i = fc.l.recycler_view;
                    RecyclerView recyclerView = (RecyclerView) a.a.k(viewInflate, i);
                    if (recyclerView != null) {
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                        this.f8613w0 = new ad.c(coordinatorLayout, floatingActionButton, fragmentContainerView, swipeRefreshLayout, recyclerView, 9);
                        return coordinatorLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

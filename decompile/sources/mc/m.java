package mc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.livxow.tv.app.App;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class m extends a {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public jc.b f8602w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public hc.k f8603x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ArrayList f8604y0;

    @Override // androidx.fragment.app.y
    public final void E() {
        this.f8571v0 = "Highlights";
        this.f8570u0 = true;
        b8.h.s(b8.h.q(I(), "highlights.txt"), new l(this));
        this.f8602w0.f7022c.setOnRefreshListener(new l(this));
        this.f8602w0.f7022c.setRefreshing(true);
    }

    @Override // mc.a
    public final void S(int i) {
        if (i == 1) {
            this.f8602w0.f7021b.setLayoutManager(new LinearLayoutManager(1));
        } else {
            this.f8602w0.f7021b.setLayoutManager(new GridLayoutManager(i));
        }
    }

    @Override // mc.a
    public final void U(String str) {
        if (this.f8604y0 == null || this.f8603x0 == null) {
            return;
        }
        if (str.isEmpty()) {
            hc.k kVar = this.f8603x0;
            ArrayList arrayList = this.f8604y0;
            kVar.getClass();
            kVar.f6240g = new ArrayList(arrayList);
            kVar.f9680a.b();
            this.f8602w0.f7021b.setVisibility(0);
            this.f8602w0.f7020a.setVisibility(8);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String lowerCase = str.toLowerCase();
        ArrayList arrayList3 = this.f8604y0;
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            pc.f fVar = (pc.f) obj;
            String lowerCase2 = fVar.f10513d.toLowerCase();
            String lowerCase3 = fVar.f10514e.toLowerCase();
            if (lowerCase2.contains(lowerCase) || lowerCase3.contains(lowerCase) || fVar.f10510a.toLowerCase().contains(lowerCase) || fVar.f10511b.toLowerCase().contains(lowerCase)) {
                arrayList2.add(fVar);
            }
        }
        if (arrayList2.isEmpty()) {
            this.f8602w0.f7021b.setVisibility(8);
            this.f8602w0.f7020a.setVisibility(0);
            return;
        }
        this.f8602w0.f7021b.setVisibility(0);
        this.f8602w0.f7020a.setVisibility(8);
        hc.k kVar2 = this.f8603x0;
        kVar2.getClass();
        kVar2.f6240g = new ArrayList(arrayList2);
        kVar2.f9680a.b();
    }

    public final void V(JSONArray jSONArray) {
        if (j() == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = new JSONObject(jSONArray.getJSONObject(i).getString("highlight"));
                if (jSONObject.getBoolean("visible")) {
                    pc.f fVar = new pc.f();
                    fVar.f10518k = jSONObject.optBoolean("isHot", false);
                    fVar.f10510a = jSONObject.getString("category");
                    fVar.f10511b = jSONObject.getString("eventName").trim();
                    fVar.f10512c = jSONObject.optString("eventLogo", "");
                    fVar.f10513d = jSONObject.getString("teamAName");
                    fVar.f10514e = jSONObject.getString("teamBName");
                    fVar.f = jSONObject.getString("teamAFlag");
                    fVar.f10515g = jSONObject.getString("teamBFlag");
                    fVar.f10516h = jSONObject.getString("links");
                    fVar.i = jSONObject.getString("date");
                    fVar.f10517j = jSONObject.optJSONArray("link_names");
                    arrayList.add(fVar);
                }
            } catch (JSONException unused) {
            }
        }
        this.f8604y0 = arrayList;
        App.P.C = arrayList;
        this.f8602w0.f7022c.setRefreshing(false);
        if (this.f8604y0.isEmpty()) {
            this.f8602w0.f7020a.setVisibility(0);
            return;
        }
        this.f8602w0.f7020a.setVisibility(8);
        hc.k kVar = this.f8603x0;
        if (kVar != null) {
            kVar.f6240g = new ArrayList(this.f8604y0);
            kVar.f9680a.b();
            this.f8602w0.f7021b.j0(0);
            return;
        }
        hc.k kVar2 = new hc.k(j(), this.f8604y0);
        this.f8603x0 = kVar2;
        this.f8602w0.f7021b.setAdapter(kVar2);
        if (R()) {
            this.f8602w0.f7021b.setLayoutManager(new GridLayoutManager(3));
        } else {
            this.f8602w0.f7021b.setLayoutManager(new LinearLayoutManager(1));
        }
    }

    @Override // androidx.fragment.app.y
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(fc.m.fragment_highlights, (ViewGroup) null, false);
        int i = fc.l.not_available;
        TextView textView = (TextView) a.a.k(viewInflate, i);
        if (textView != null) {
            i = fc.l.recycler_view;
            RecyclerView recyclerView = (RecyclerView) a.a.k(viewInflate, i);
            if (recyclerView != null) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate;
                this.f8602w0 = new jc.b(swipeRefreshLayout, textView, recyclerView, swipeRefreshLayout);
                return swipeRefreshLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}

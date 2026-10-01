package hc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.livxow.tv.app.App;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import o4.b0;
import o4.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e extends b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final App f6214e = App.P;
    public final h.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f6215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public mc.j f6216h;
    public String i;

    public e(h.j jVar, ArrayList arrayList) {
        this.f = jVar;
        this.f6215g = new ArrayList(arrayList);
        this.f6213d = vc.a.s(jVar);
    }

    @Override // o4.b0
    public final int a() {
        return this.f6215g.size();
    }

    @Override // o4.b0
    public final long b(int i) {
        return i;
    }

    @Override // o4.b0
    public final void d(z0 z0Var, int i) {
        d dVar = (d) z0Var;
        final pc.c cVar = (pc.c) this.f6215g.get(i);
        TextView textView = dVar.f6212w;
        View view = dVar.f6210u;
        ImageView imageView = dVar.f6211v;
        textView.setText(cVar.f10487a);
        textView.setSelected(true);
        if (cVar.f10488b == null) {
            imageView.setImageResource(fc.k.icon);
        } else {
            h.j jVar = this.f;
            ((com.bumptech.glide.m) com.bumptech.glide.b.b(jVar).c(jVar).n(cVar.f10488b).i(fc.k.icon)).v(imageView);
        }
        view.setOnClickListener(new gc.r(1, this, cVar));
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: hc.c
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                e eVar = this.f6208v;
                h.j jVar2 = eVar.f;
                String str = eVar.i;
                mc.j jVar3 = eVar.f6216h;
                Executors.newSingleThreadExecutor().execute(new e2.v(jVar2, cVar, str, jVar3, 3));
                return true;
            }
        });
    }

    @Override // o4.b0
    public final z0 e(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(fc.m.item_channel, viewGroup, false);
        d dVar = new d(viewInflate);
        dVar.f6210u = viewInflate;
        dVar.f6211v = (ImageView) viewInflate.findViewById(fc.l.channel_img);
        dVar.f6212w = (TextView) viewInflate.findViewById(fc.l.channel_text_view);
        return dVar;
    }

    public final void g(List list) {
        this.f6215g = new ArrayList(list);
        this.f9680a.b();
    }

    @Override // o4.b0
    public final int c(int i) {
        return i;
    }
}

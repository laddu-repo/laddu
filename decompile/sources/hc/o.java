package hc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import o4.b0;
import o4.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o extends b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f6246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f6247e;
    public final n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6248g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f6249h;

    public o(Context context, ArrayList arrayList, n nVar) {
        this.f6246d = context;
        this.f6247e = arrayList;
        this.f = nVar;
    }

    @Override // o4.b0
    public final int a() {
        return this.f6247e.size();
    }

    @Override // o4.b0
    public final long b(int i) {
        return i;
    }

    @Override // o4.b0
    public final void d(z0 z0Var, final int i) {
        final m mVar = (m) z0Var;
        final pc.h hVar = (pc.h) this.f6247e.get(i);
        Chip chip = mVar.f6245u;
        chip.setText(hVar.f10522v);
        if (i == this.f6248g) {
            chip.setChecked(true);
            this.f6249h = mVar;
        } else {
            chip.setChecked(false);
        }
        chip.setOnClickListener(new View.OnClickListener() { // from class: hc.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o oVar = this.f6241v;
                oVar.f6249h.f6245u.setChecked(false);
                m mVar2 = mVar;
                mVar2.f6245u.setChecked(true);
                oVar.f6248g = i;
                oVar.f6249h = mVar2;
                pc.h hVar2 = hVar;
                oVar.f.a(hVar2.f10523w.replaceAll("\\\\", "").replaceAll("]", "").replaceAll("\"", ""), hVar2.f10524x, hVar2.f10525y, hVar2.f10526z, hVar2.A, hVar2.B);
            }
        });
    }

    @Override // o4.b0
    public final z0 e(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(this.f6246d).inflate(fc.m.item_link, viewGroup, false);
        m mVar = new m(viewInflate);
        mVar.f6245u = (Chip) viewInflate;
        return mVar;
    }

    @Override // o4.b0
    public final int c(int i) {
        return i;
    }
}

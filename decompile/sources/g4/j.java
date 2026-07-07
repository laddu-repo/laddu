package g4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import o4.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j extends o4.b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f5509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f5510e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r f5511g;

    public j(r rVar, String[] strArr, float[] fArr) {
        this.f5511g = rVar;
        this.f5509d = strArr;
        this.f5510e = fArr;
    }

    @Override // o4.b0
    public final int a() {
        return this.f5509d.length;
    }

    @Override // o4.b0
    public final void d(z0 z0Var, int i) {
        n nVar = (n) z0Var;
        View view = nVar.f5521v;
        View view2 = nVar.f9910a;
        String[] strArr = this.f5509d;
        if (i < strArr.length) {
            nVar.f5520u.setText(strArr[i]);
        }
        if (i == this.f) {
            view2.setSelected(true);
            view.setVisibility(0);
        } else {
            view2.setSelected(false);
            view.setVisibility(4);
        }
        view2.setOnClickListener(new i(this, i, 0));
    }

    @Override // o4.b0
    public final z0 e(ViewGroup viewGroup, int i) {
        return new n(LayoutInflater.from(this.f5511g.getContext()).inflate(i0.exo_styled_sub_settings_list_item, viewGroup, false));
    }
}

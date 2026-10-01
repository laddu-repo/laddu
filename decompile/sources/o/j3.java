package o;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j3 implements View.OnClickListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final n.a f9186v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k3 f9187w;

    public j3(k3 k3Var) {
        this.f9187w = k3Var;
        Context context = k3Var.f9199a.getContext();
        CharSequence charSequence = k3Var.f9205h;
        n.a aVar = new n.a();
        aVar.f8856e = 4096;
        aVar.f8857g = 4096;
        aVar.f8861l = null;
        aVar.f8862m = null;
        aVar.f8863n = false;
        aVar.f8864o = false;
        aVar.f8865p = 16;
        aVar.i = context;
        aVar.f8852a = charSequence;
        this.f9186v = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k3 k3Var = this.f9187w;
        Window.Callback callback = k3Var.f9207k;
        if (callback == null || !k3Var.f9208l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f9186v);
    }
}

package kc;

import android.content.DialogInterface;
import androidx.fragment.app.d1;
import t1.x0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ x0 f7926v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f7927w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d1 f7928x;

    public /* synthetic */ m(r2.j jVar, o oVar, d1 d1Var) {
        this.f7926v = jVar;
        this.f7927w = oVar;
        this.f7928x = d1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        o.S(this.f7926v, this.f7927w, this.f7928x);
    }
}

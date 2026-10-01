package qc;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.d1;
import c6.w;
import o2.i0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i implements r6.f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d1 f10980v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Activity f10981w;

    public i(d1 d1Var, h.j jVar) {
        this.f10980v = d1Var;
        this.f10981w = jVar;
    }

    @Override // r6.f
    /* JADX INFO: renamed from: a */
    public final boolean mo0a(Object obj) {
        this.f10981w.runOnUiThread(new i0(3, this.f10980v, (Drawable) obj));
        return true;
    }

    @Override // r6.f
    public final void i(w wVar) {
    }
}

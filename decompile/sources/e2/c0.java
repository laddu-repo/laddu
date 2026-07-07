package e2;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends AudioTrack$StreamEventCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a7.j f4557a;

    public c0(a7.j jVar) {
        this.f4557a = jVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        d0 d0Var;
        m mVar;
        if (audioTrack.equals(((d0) this.f4557a.f204y).f4596w) && (mVar = (d0Var = (d0) this.f4557a.f204y).f4592s) != null && d0Var.W) {
            mVar.w();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(((d0) this.f4557a.f204y).f4596w)) {
            ((d0) this.f4557a.f204y).V = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        d0 d0Var;
        m mVar;
        if (audioTrack.equals(((d0) this.f4557a.f204y).f4596w) && (mVar = (d0Var = (d0) this.f4557a.f204y).f4592s) != null && d0Var.W) {
            mVar.w();
        }
    }
}

package c2;

import android.media.AudioTrack;
import androidx.lifecycle.j1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h0 extends AudioTrack.StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j1 f1812a;

    public h0(j1 j1Var) {
        this.f1812a = j1Var;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i6) {
        i0 i0Var;
        q qVar;
        if (audioTrack.equals(((i0) this.f1812a.A).f1853x) && (qVar = (i0Var = (i0) this.f1812a.A).f1849t) != null && i0Var.X) {
            qVar.D();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (!audioTrack.equals(((i0) this.f1812a.A).f1853x)) {
            return;
        }
        ((i0) this.f1812a.A).W = true;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        i0 i0Var;
        q qVar;
        if (audioTrack.equals(((i0) this.f1812a.A).f1853x) && (qVar = (i0Var = (i0) this.f1812a.A).f1849t) != null && i0Var.X) {
            qVar.D();
        }
    }
}

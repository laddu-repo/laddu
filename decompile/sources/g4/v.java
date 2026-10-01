package g4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f5600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f5601c;

    public /* synthetic */ v(w wVar, r rVar, int i) {
        this.f5599a = i;
        this.f5601c = wVar;
        this.f5600b = rVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5599a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                w wVar = this.f5601c;
                wVar.i(1);
                if (wVar.B) {
                    this.f5600b.post(wVar.f5618s);
                    wVar.B = false;
                }
                break;
            case 1:
                w wVar2 = this.f5601c;
                wVar2.i(2);
                if (wVar2.B) {
                    this.f5600b.post(wVar2.f5618s);
                    wVar2.B = false;
                }
                break;
            default:
                w wVar3 = this.f5601c;
                wVar3.i(2);
                if (wVar3.B) {
                    this.f5600b.post(wVar3.f5618s);
                    wVar3.B = false;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f5599a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                this.f5601c.i(3);
                break;
            case 1:
                this.f5601c.i(3);
                break;
            default:
                this.f5601c.i(3);
                break;
        }
    }
}

package e5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.media3.decoder.DecoderInputBuffer;
import t0.r0;
import t0.u0;
import t0.y0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4812c;

    public /* synthetic */ k(Object obj, View view, int i) {
        this.f4810a = i;
        this.f4811b = obj;
        this.f4812c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f4810a) {
            case 1:
                ((r0) this.f4811b).b();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4810a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((v.e) this.f4811b).remove(animator);
                ((p) this.f4812c).I.remove(animator);
                break;
            case 1:
                ((r0) this.f4811b).a();
                break;
            default:
                y0 y0Var = (y0) this.f4811b;
                y0Var.f11904a.e(1.0f);
                u0.f((View) this.f4812c, y0Var);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f4810a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((p) this.f4812c).I.add(animator);
                break;
            case 1:
                ((r0) this.f4811b).c();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public k(p pVar, v.e eVar) {
        this.f4810a = 0;
        this.f4812c = pVar;
        this.f4811b = eVar;
    }
}

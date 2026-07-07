package fc;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.media3.ui.PlayerView;
import c2.j0;
import g4.w;
import java.util.Formatter;
import w1.b0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f5371v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public MotionEvent f5372w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f5373x;

    public f(h hVar) {
        this.f5373x = hVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        g4.r rVar;
        w wVar;
        int i;
        if (motionEvent == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        h hVar = this.f5373x;
        boolean z2 = x10 > ((float) (hVar.f5379x / 2));
        Formatter formatter = hVar.D;
        StringBuilder sb2 = hVar.C;
        hd.a aVar = hVar.f5381z;
        if (hVar.J || hVar.B == null) {
            return true;
        }
        hVar.L = true;
        if (hVar.I && (rVar = hVar.A.E) != null && (i = (wVar = rVar.f5581v).f5625z) != 3 && i != 2) {
            wVar.f();
            wVar.i(2);
        }
        if (z2 && ((j0) hVar.B).S() != 4 && ((c3.e) hVar.B).n(12)) {
            hVar.H += 10;
            hVar.G++;
            long jL = ((j0) hVar.B).L();
            long jQ = ((j0) hVar.B).Q();
            long j8 = hVar.H * 1000;
            long j9 = j8 + jL;
            if (j9 > jQ) {
                j8 = jQ - jL;
            } else {
                jQ = j9;
            }
            ((ImageView) aVar.f6279w).setImageResource(k.ic_forward);
            ((TextView) aVar.f6281y).setText("+" + b0.B(sb2, formatter, j8));
            hVar.a(jQ);
            ((CardView) aVar.f6280x).setVisibility(0);
            return true;
        }
        if (!((c3.e) hVar.B).n(11)) {
            if (z2) {
                ((TextView) aVar.f6281y).setText("+00:00");
                ((ImageView) aVar.f6279w).setImageResource(k.ic_forward);
            } else {
                ((TextView) aVar.f6281y).setText("-00:00");
                ((ImageView) aVar.f6279w).setImageResource(k.ic_rewind);
            }
            hVar.a(-5L);
            ((CardView) aVar.f6280x).setVisibility(0);
            return true;
        }
        hVar.H += 10;
        hVar.G++;
        long jL2 = ((j0) hVar.B).L();
        long j10 = hVar.H * 1000;
        long j11 = jL2 - j10;
        if (j11 < 0) {
            j11 = 0;
        } else {
            jL2 = j10;
        }
        ((TextView) aVar.f6281y).setText("-" + b0.B(sb2, formatter, jL2));
        ((ImageView) aVar.f6279w).setImageResource(k.ic_rewind);
        hVar.a(j11);
        ((CardView) aVar.f6280x).setVisibility(0);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onScroll(android.view.MotionEvent r21, android.view.MotionEvent r22, float r23, float r24) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fc.f.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        w wVar;
        w wVar2;
        int i;
        h hVar = this.f5373x;
        PlayerView playerView = hVar.A;
        g4.r rVar = playerView.E;
        g4.r rVar2 = playerView.E;
        if (rVar == null || !rVar.h() || hVar.K || hVar.L) {
            if (hVar.I) {
                return true;
            }
            if (rVar2 != null && (wVar = rVar2.f5581v) != null) {
                wVar.f();
            }
            playerView.g(playerView.f());
            return true;
        }
        if (!hVar.J) {
            playerView.b();
            return true;
        }
        if (rVar2 == null || (i = (wVar2 = rVar2.f5581v).f5625z) == 3 || i == 2) {
            return true;
        }
        wVar2.f();
        wVar2.i(2);
        return true;
    }
}

package fc;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.media3.ui.PlayerView;
import c2.j0;
import c2.u;
import g4.w;
import java.util.Formatter;
import java.util.Locale;
import k8.k4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h implements View.OnTouchListener {
    public final PlayerView A;
    public u B;
    public final StringBuilder C;
    public final Formatter D;
    public float E;
    public float F;
    public int G;
    public long H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k4 f5377v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f f5378w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f5379x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final h.j f5380y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final hd.a f5381z;

    public h(h.j jVar, hd.a aVar, PlayerView playerView, j0 j0Var) {
        f fVar = new f(this);
        this.f5378w = fVar;
        this.f5377v = new k4(jVar, fVar);
        if (Build.VERSION.SDK_INT >= 30) {
            Rect bounds = jVar.getWindowManager().getCurrentWindowMetrics().getBounds();
            this.f5379x = bounds.width();
            bounds.height();
        } else {
            Display defaultDisplay = jVar.getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            this.f5379x = point.x;
        }
        this.E = -1.0f;
        this.F = -1.0f;
        this.G = -1;
        this.H = 0L;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.f5380y = jVar;
        this.f5381z = aVar;
        this.A = playerView;
        this.B = j0Var;
        StringBuilder sb2 = new StringBuilder();
        this.C = sb2;
        this.D = new Formatter(sb2, Locale.getDefault());
        playerView.setControllerVisibilityListener(new s5.c(14, this));
    }

    public final void a(final long j8) {
        final int i = this.G;
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: fc.g
            @Override // java.lang.Runnable
            public final void run() {
                w wVar;
                h hVar = this.f5374v;
                PlayerView playerView = hVar.A;
                if (i == hVar.G) {
                    hVar.L = false;
                    ((CardView) hVar.f5381z.f6280x).setVisibility(8);
                    hVar.G = -1;
                    hVar.H = 0L;
                    if (hVar.I) {
                        g4.r rVar = playerView.E;
                        if (rVar != null && (wVar = rVar.f5581v) != null) {
                            wVar.f();
                        }
                        playerView.g(playerView.f());
                    }
                    long j9 = j8;
                    if (j9 != -5) {
                        c3.e eVar = (c3.e) hVar.B;
                        eVar.getClass();
                        eVar.y(((j0) eVar).K(), j9, false);
                    }
                }
            }
        }, 1000L);
    }

    public final Rect b() {
        PlayerView playerView = this.A;
        return new Rect(playerView.getLeft(), playerView.getTop(), playerView.getRight(), playerView.getBottom());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x011c  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r20, android.view.MotionEvent r21) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fc.h.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}

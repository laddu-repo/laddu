package t9;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Date;
import java.util.WeakHashMap;
import o.r1;
import t0.m0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f12513v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f12514w;

    public /* synthetic */ x(int i, Object obj) {
        this.f12513v = i;
        this.f12514w = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zA;
        switch (this.f12513v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f12514w).f3561x.B;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 1:
                p9.d dVar = (p9.d) this.f12514w;
                dVar.f10439c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) dVar.f10441e;
                b1.e eVar = bottomSheetBehavior.O;
                if (eVar != null && eVar.f()) {
                    dVar.a(dVar.f10438b);
                    return;
                } else {
                    if (bottomSheetBehavior.N == 2) {
                        bottomSheetBehavior.C(dVar.f10438b);
                        return;
                    }
                    return;
                }
            case 2:
                wb.j jVar = (wb.j) this.f12514w;
                synchronized (jVar) {
                    zA = jVar.a();
                    if (zA) {
                        jVar.j(true);
                    }
                    break;
                }
                if (zA) {
                    wb.k kVarC = jVar.f14006q.c();
                    jVar.f14005p.getClass();
                    if (new Date(System.currentTimeMillis()).before(kVarC.f14009b)) {
                        jVar.i();
                        return;
                    }
                    nb.c cVar = (nb.c) jVar.f14000k;
                    o8.o oVarE = cVar.e();
                    o8.o oVarD = cVar.d();
                    o8.o oVarF = b8.h.P(oVarE, oVarD).f(jVar.f13998h, new ed.d(jVar, oVarE, oVarD, 10));
                    b8.h.P(oVarF).e(jVar.f13998h, new androidx.fragment.app.e(21, jVar, oVarF));
                    return;
                }
                return;
            default:
                x0.d dVar2 = (x0.d) this.f12514w;
                r1 r1Var = dVar2.f14076x;
                x0.a aVar = dVar2.f14074v;
                if (dVar2.J) {
                    if (dVar2.H) {
                        dVar2.H = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f14071e = jCurrentAnimationTimeMillis;
                        aVar.f14072g = -1L;
                        aVar.f = jCurrentAnimationTimeMillis;
                        aVar.f14073h = 0.5f;
                    }
                    if ((aVar.f14072g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f14072g + ((long) aVar.i)) || !dVar2.e()) {
                        dVar2.J = false;
                        return;
                    }
                    if (dVar2.I) {
                        dVar2.I = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        r1Var.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar.a(jCurrentAnimationTimeMillis2);
                    long j8 = jCurrentAnimationTimeMillis2 - aVar.f;
                    aVar.f = jCurrentAnimationTimeMillis2;
                    dVar2.L.scrollListBy((int) (j8 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar.f14070d));
                    WeakHashMap weakHashMap = m0.f11853a;
                    r1Var.postOnAnimation(this);
                    return;
                }
                return;
        }
    }
}

package androidx.media3.ui;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import bf.o;
import com.playfy.tv.activities.PlayerActivity;
import com.unity3d.services.UnityAdsConstants;
import db.k0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k4.a;
import k4.h;
import k4.p;
import k4.q;
import k4.v;
import k4.w;
import k4.x;
import k4.y;
import lc.c;
import r1.n;
import r1.n0;
import r1.p0;
import r1.p1;
import r1.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class PlayerView extends FrameLayout {

    /* renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ int f1091h0 = 0;
    public final View A;
    public final boolean B;
    public final c C;
    public final ImageView D;
    public final ImageView E;
    public final SubtitleView F;
    public final View G;
    public final TextView H;
    public final q I;
    public final FrameLayout J;
    public final FrameLayout K;
    public final Handler L;
    public final Class M;
    public final Method N;
    public final Object O;
    public u0 P;
    public boolean Q;
    public p R;
    public int S;
    public int T;
    public Drawable U;
    public int V;
    public boolean W;

    /* renamed from: a0, reason: collision with root package name */
    public n f1092a0;

    /* renamed from: b0, reason: collision with root package name */
    public CharSequence f1093b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f1094c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f1095d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f1096e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1097f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f1098g0;

    /* renamed from: x, reason: collision with root package name */
    public final w f1099x;

    /* renamed from: y, reason: collision with root package name */
    public final AspectRatioFrameLayout f1100y;

    /* renamed from: z, reason: collision with root package name */
    public final View f1101z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PlayerView(android.content.Context r24, android.util.AttributeSet r25) {
        /*
            Method dump skipped, instructions count: 825
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static void a(PlayerView playerView, Bitmap bitmap) {
        playerView.setImage(new BitmapDrawable(playerView.getResources(), bitmap));
        u0 u0Var = playerView.P;
        if (u0Var != null && u0Var.n0(30) && u0Var.g0().a(2)) {
            return;
        }
        ImageView imageView = playerView.D;
        if (imageView != null) {
            imageView.setVisibility(0);
            playerView.p();
        }
        View view = playerView.f1101z;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        p();
    }

    private void setImageOutput(u0 u0Var) {
        Class cls = this.M;
        if (cls != null && cls.isAssignableFrom(u0Var.getClass())) {
            try {
                Method method = this.N;
                method.getClass();
                Object obj = this.O;
                obj.getClass();
                method.invoke(u0Var, obj);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final boolean b() {
        u0 u0Var = this.P;
        if (u0Var != null && this.O != null && u0Var.n0(30) && u0Var.g0().a(4)) {
            return true;
        }
        return false;
    }

    public final void c() {
        ImageView imageView = this.D;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
        }
    }

    public final void d() {
        q qVar = this.I;
        if (qVar != null) {
            qVar.g();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        c cVar;
        SurfaceSyncGroup surfaceSyncGroup;
        super.dispatchDraw(canvas);
        if (Build.VERSION.SDK_INT == 34 && (cVar = this.C) != null && this.f1098g0 && (surfaceSyncGroup = (SurfaceSyncGroup) cVar.f8328x) != null) {
            surfaceSyncGroup.markSyncReady();
            cVar.f8328x = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        u0 u0Var = this.P;
        if (u0Var != null && u0Var.n0(16) && this.P.h()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 19 && keyCode != 270 && keyCode != 22 && keyCode != 271 && keyCode != 20 && keyCode != 269 && keyCode != 21 && keyCode != 268 && keyCode != 23) {
            z10 = false;
        } else {
            z10 = true;
        }
        q qVar = this.I;
        if (z10 && q() && !qVar.j()) {
            f(true);
            return true;
        }
        if ((q() && qVar.d(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            f(true);
            return true;
        }
        if (z10 && q()) {
            f(true);
        }
        return false;
    }

    public final boolean e() {
        u0 u0Var = this.P;
        if (u0Var != null && u0Var.n0(16) && this.P.h() && this.P.m()) {
            return true;
        }
        return false;
    }

    public final void f(boolean z10) {
        boolean z11;
        if ((!e() || !this.f1096e0) && q()) {
            q qVar = this.I;
            if (qVar.j() && qVar.getShowTimeoutMs() <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean h4 = h();
            if (z10 || z11 || h4) {
                i(h4);
            }
        }
    }

    public final boolean g(Drawable drawable) {
        ImageView imageView = this.E;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f3 = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.S == 2) {
                    f3 = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f1100y;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f3);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public List<p0> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.K;
        if (frameLayout != null) {
            arrayList.add(new p0(frameLayout));
        }
        q qVar = this.I;
        if (qVar != null) {
            arrayList.add(new p0(qVar));
        }
        return k0.k(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.J;
        u1.c.i(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.S;
    }

    public boolean getControllerAutoShow() {
        return this.f1095d0;
    }

    public boolean getControllerHideOnTouch() {
        return this.f1097f0;
    }

    public int getControllerShowTimeoutMs() {
        return this.f1094c0;
    }

    public Drawable getDefaultArtwork() {
        return this.U;
    }

    public int getImageDisplayMode() {
        return this.T;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.K;
    }

    public u0 getPlayer() {
        return this.P;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f1100y;
        u1.c.h(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.F;
    }

    @Deprecated
    public boolean getUseArtwork() {
        if (this.S != 0) {
            return true;
        }
        return false;
    }

    public boolean getUseController() {
        return this.Q;
    }

    public View getVideoSurfaceView() {
        return this.A;
    }

    public final boolean h() {
        u0 u0Var = this.P;
        if (u0Var != null) {
            int e02 = u0Var.e0();
            if (this.f1095d0) {
                if (!this.P.n0(17) || !this.P.y0().p()) {
                    if (e02 != 1 && e02 != 4) {
                        u0 u0Var2 = this.P;
                        u0Var2.getClass();
                        if (u0Var2.m()) {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final void i(boolean z10) {
        int i6;
        if (!q()) {
            return;
        }
        if (z10) {
            i6 = 0;
        } else {
            i6 = this.f1094c0;
        }
        q qVar = this.I;
        qVar.setShowTimeoutMs(i6);
        v vVar = qVar.f7687x;
        q qVar2 = vVar.f7702a;
        if (!qVar2.l()) {
            qVar2.setVisibility(0);
            qVar2.m();
            ImageView imageView = qVar2.R;
            if (imageView != null) {
                imageView.requestFocus();
            }
        }
        vVar.k();
    }

    public final void j() {
        if (q() && this.P != null) {
            q qVar = this.I;
            if (!qVar.j()) {
                f(true);
            } else if (this.f1097f0) {
                qVar.g();
            }
        }
    }

    public final void k() {
        p1 p1Var;
        float f3;
        u0 u0Var = this.P;
        if (u0Var != null) {
            p1Var = u0Var.y();
        } else {
            p1Var = p1.f11626d;
        }
        int i6 = p1Var.f11630a;
        int i10 = p1Var.f11631b;
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (i10 != 0 && i6 != 0) {
            f3 = (i6 * p1Var.f11632c) / i10;
        } else {
            f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (!this.B) {
            f10 = f3;
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f1100y;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r5.P.m() == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            r5 = this;
            android.view.View r0 = r5.G
            if (r0 == 0) goto L29
            r1.u0 r1 = r5.P
            r2 = 0
            if (r1 == 0) goto L20
            int r1 = r1.e0()
            r3 = 2
            if (r1 != r3) goto L20
            int r1 = r5.V
            r4 = 1
            if (r1 == r3) goto L21
            if (r1 != r4) goto L20
            r1.u0 r1 = r5.P
            boolean r1 = r1.m()
            if (r1 == 0) goto L20
            goto L21
        L20:
            r4 = 0
        L21:
            if (r4 == 0) goto L24
            goto L26
        L24:
            r2 = 8
        L26:
            r0.setVisibility(r2)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerView.l():void");
    }

    public final void m() {
        String str = null;
        q qVar = this.I;
        if (qVar != null && this.Q) {
            if (qVar.j()) {
                if (this.f1097f0) {
                    str = getResources().getString(com.playfy.tv.R.string.exo_controls_hide);
                }
                setContentDescription(str);
                return;
            }
            setContentDescription(getResources().getString(com.playfy.tv.R.string.exo_controls_show));
            return;
        }
        setContentDescription(null);
    }

    public final void n() {
        n0 n0Var;
        n nVar;
        Pair pair;
        TextView textView = this.H;
        if (textView != null) {
            CharSequence charSequence = this.f1093b0;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            u0 u0Var = this.P;
            if (u0Var != null) {
                n0Var = u0Var.S();
            } else {
                n0Var = null;
            }
            if (n0Var != null && (nVar = this.f1092a0) != null) {
                c cVar = (c) nVar;
                cVar.getClass();
                PlayerActivity playerActivity = (PlayerActivity) cVar.f8328x;
                o[] oVarArr = PlayerActivity.V;
                playerActivity.getClass();
                int i6 = n0Var.f11589x;
                if (i6 != 1000) {
                    if (i6 != 1001) {
                        if (i6 != 1003) {
                            if (i6 != 2000) {
                                if (i6 != 4001) {
                                    pair = new Pair(0, "Playback failed");
                                } else {
                                    pair = new Pair(0, "Decoder initialization failed");
                                }
                            } else {
                                pair = new Pair(0, "Error occurred during playback");
                            }
                        } else {
                            pair = new Pair(0, "Playback timed out");
                        }
                    } else {
                        pair = new Pair(0, "A remote error occurred");
                    }
                } else {
                    pair = new Pair(0, "An unspecified error occurred");
                }
                textView.setText((CharSequence) pair.second);
                textView.setVisibility(0);
                return;
            }
            textView.setVisibility(8);
        }
    }

    public final void o(boolean z10) {
        boolean z11;
        boolean z12;
        byte[] bArr;
        Drawable drawable;
        u0 u0Var = this.P;
        boolean z13 = true;
        boolean z14 = false;
        if (u0Var != null && u0Var.n0(30) && !u0Var.g0().f11582a.isEmpty()) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z15 = this.W;
        ImageView imageView = this.E;
        View view = this.f1101z;
        if (!z15 && (!z11 || z10)) {
            if (imageView != null) {
                imageView.setImageResource(R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            c();
        }
        if (z11) {
            u0 u0Var2 = this.P;
            if (u0Var2 != null && u0Var2.n0(30) && u0Var2.g0().a(2)) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean b10 = b();
            if (!z12 && !b10) {
                if (view != null) {
                    view.setVisibility(0);
                }
                c();
            }
            ImageView imageView2 = this.D;
            if (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) {
                z13 = false;
            }
            if (b10 && !z12 && z13) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    p();
                }
            } else if (z12 && !b10 && z13) {
                c();
            }
            if (!z12 && !b10 && this.S != 0) {
                u1.c.h(imageView);
                if (u0Var != null && u0Var.n0(18) && (bArr = u0Var.O0().f11472k) != null) {
                    z14 = g(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (z14 || g(this.U)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (q() && this.P != null) {
            f(true);
            return true;
        }
        return false;
    }

    public final void p() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.D;
        if (imageView != null && (drawable = imageView.getDrawable()) != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f3 = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.T == 1) {
                    f3 = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.f1100y) != null) {
                    aspectRatioFrameLayout.setAspectRatio(f3);
                }
                imageView.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        j();
        return super.performClick();
    }

    public final boolean q() {
        if (this.Q) {
            u1.c.h(this.I);
            return true;
        }
        return false;
    }

    public void setArtworkDisplayMode(int i6) {
        boolean z10;
        if (i6 != 0 && this.E == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        u1.c.g(z10);
        if (this.S != i6) {
            this.S = i6;
            o(false);
        }
    }

    public void setAspectRatioListener(a aVar) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f1100y;
        u1.c.h(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(aVar);
    }

    public void setControllerAnimationEnabled(boolean z10) {
        q qVar = this.I;
        u1.c.h(qVar);
        qVar.setAnimationEnabled(z10);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f1095d0 = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f1096e0 = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        u1.c.h(this.I);
        this.f1097f0 = z10;
        m();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(h hVar) {
        q qVar = this.I;
        u1.c.h(qVar);
        qVar.setOnFullScreenModeChangedListener(hVar);
    }

    public void setControllerShowTimeoutMs(int i6) {
        q qVar = this.I;
        u1.c.h(qVar);
        this.f1094c0 = i6;
        if (qVar.j()) {
            i(h());
        }
    }

    public void setControllerVisibilityListener(x xVar) {
        if (xVar != null) {
            setControllerVisibilityListener((p) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        boolean z10;
        if (this.H != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        this.f1093b0 = charSequence;
        n();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.U != drawable) {
            this.U = drawable;
            o(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z10) {
        this.f1098g0 = z10;
    }

    public void setErrorMessageProvider(n nVar) {
        if (this.f1092a0 != nVar) {
            this.f1092a0 = nVar;
            n();
        }
    }

    public void setFullscreenButtonClickListener(y yVar) {
        q qVar = this.I;
        u1.c.h(qVar);
        qVar.setOnFullScreenModeChangedListener(this.f1099x);
    }

    public void setFullscreenButtonState(boolean z10) {
        q qVar = this.I;
        u1.c.h(qVar);
        qVar.o(z10);
    }

    public void setImageDisplayMode(int i6) {
        boolean z10;
        if (this.D != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        if (this.T != i6) {
            this.T = i6;
            p();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            o(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e9, code lost:
    
        if (r3 != false) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setPlayer(r1.u0 r10) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerView.setPlayer(r1.u0):void");
    }

    public void setRepeatToggleModes(int i6) {
        q qVar = this.I;
        u1.c.h(qVar);
        qVar.setRepeatToggleModes(i6);
    }

    public void setResizeMode(int i6) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f1100y;
        u1.c.h(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i6);
    }

    public void setShowBuffering(int i6) {
        if (this.V != i6) {
            this.V = i6;
            l();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        q qVar = this.I;
        u1.c.h(qVar);
        qVar.setShowFastForwardButton(z10);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        q qVar = this.I;
        u1.c.h(qVar);
        qVar.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        q qVar = this.I;
        u1.c.h(qVar);
        qVar.setShowNextButton(z10);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        q qVar = this.I;
        u1.c.h(qVar);
        qVar.setShowPlayButtonIfPlaybackIsSuppressed(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        q qVar = this.I;
        u1.c.h(qVar);
        qVar.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        q qVar = this.I;
        u1.c.h(qVar);
        qVar.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        q qVar = this.I;
        u1.c.h(qVar);
        qVar.setShowShuffleButton(z10);
    }

    public void setShowSubtitleButton(boolean z10) {
        q qVar = this.I;
        u1.c.h(qVar);
        qVar.setShowSubtitleButton(z10);
    }

    public void setShowVrButton(boolean z10) {
        q qVar = this.I;
        u1.c.h(qVar);
        qVar.setShowVrButton(z10);
    }

    public void setShutterBackgroundColor(int i6) {
        View view = this.f1101z;
        if (view != null) {
            view.setBackgroundColor(i6);
        }
    }

    public void setTimeBarScrubbingEnabled(boolean z10) {
        q qVar = this.I;
        u1.c.h(qVar);
        qVar.setTimeBarScrubbingEnabled(z10);
    }

    @Deprecated
    public void setUseArtwork(boolean z10) {
        setArtworkDisplayMode(!z10 ? 1 : 0);
    }

    public void setUseController(boolean z10) {
        boolean z11;
        boolean z12 = true;
        q qVar = this.I;
        if (z10 && qVar == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        u1.c.g(z11);
        if (!z10 && !hasOnClickListeners()) {
            z12 = false;
        }
        setClickable(z12);
        if (this.Q == z10) {
            return;
        }
        this.Q = z10;
        if (q()) {
            qVar.setPlayer(this.P);
        } else if (qVar != null) {
            qVar.g();
            qVar.setPlayer(null);
        }
        m();
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        super.setVisibility(i6);
        View view = this.A;
        if (view instanceof SurfaceView) {
            view.setVisibility(i6);
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(p pVar) {
        q qVar = this.I;
        u1.c.h(qVar);
        CopyOnWriteArrayList copyOnWriteArrayList = qVar.G;
        p pVar2 = this.R;
        if (pVar2 == pVar) {
            return;
        }
        if (pVar2 != null) {
            copyOnWriteArrayList.remove(pVar2);
        }
        this.R = pVar;
        if (pVar != null) {
            copyOnWriteArrayList.add(pVar);
            setControllerVisibilityListener((x) null);
        }
    }
}

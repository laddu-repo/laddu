package k4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.ui.DefaultTimeBar;
import androidx.recyclerview.widget.RecyclerView;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import r1.a1;
import r1.c1;
import r1.d1;
import r1.j1;
import r1.k1;
import r1.l1;
import r1.o0;
import r1.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q extends FrameLayout {

    /* renamed from: d1, reason: collision with root package name */
    public static final float[] f7662d1;
    public final Class A;
    public final float A0;
    public final Method B;
    public final float B0;
    public final Method C;
    public final String C0;
    public final Class D;
    public final String D0;
    public final Method E;
    public final Drawable E0;
    public final Method F;
    public final Drawable F0;
    public final CopyOnWriteArrayList G;
    public final String G0;
    public final RecyclerView H;
    public final String H0;
    public final l I;
    public final Drawable I0;
    public final i J;
    public final Drawable J0;
    public final f K;
    public final String K0;
    public final f L;
    public final String L0;
    public final k7.d M;
    public u0 M0;
    public final PopupWindow N;
    public boolean N0;
    public final int O;
    public boolean O0;
    public final ImageView P;
    public boolean P0;
    public final ImageView Q;
    public boolean Q0;
    public final ImageView R;
    public boolean R0;
    public final View S;
    public boolean S0;
    public final View T;
    public int T0;
    public final TextView U;
    public boolean U0;
    public final TextView V;
    public int V0;
    public final ImageView W;
    public int W0;
    public long[] X0;
    public boolean[] Y0;
    public final long[] Z0;

    /* renamed from: a0, reason: collision with root package name */
    public final ImageView f7663a0;

    /* renamed from: a1, reason: collision with root package name */
    public final boolean[] f7664a1;

    /* renamed from: b0, reason: collision with root package name */
    public final ImageView f7665b0;

    /* renamed from: b1, reason: collision with root package name */
    public long f7666b1;

    /* renamed from: c0, reason: collision with root package name */
    public final ImageView f7667c0;
    public boolean c1;

    /* renamed from: d0, reason: collision with root package name */
    public final ImageView f7668d0;

    /* renamed from: e0, reason: collision with root package name */
    public final ImageView f7669e0;

    /* renamed from: f0, reason: collision with root package name */
    public final View f7670f0;

    /* renamed from: g0, reason: collision with root package name */
    public final View f7671g0;

    /* renamed from: h0, reason: collision with root package name */
    public final View f7672h0;

    /* renamed from: i0, reason: collision with root package name */
    public final TextView f7673i0;

    /* renamed from: j0, reason: collision with root package name */
    public final TextView f7674j0;

    /* renamed from: k0, reason: collision with root package name */
    public final g0 f7675k0;

    /* renamed from: l0, reason: collision with root package name */
    public final StringBuilder f7676l0;

    /* renamed from: m0, reason: collision with root package name */
    public final Formatter f7677m0;

    /* renamed from: n0, reason: collision with root package name */
    public final a1 f7678n0;
    public final c1 o0;

    /* renamed from: p0, reason: collision with root package name */
    public final j2.h f7679p0;

    /* renamed from: q0, reason: collision with root package name */
    public final Drawable f7680q0;

    /* renamed from: r0, reason: collision with root package name */
    public final Drawable f7681r0;

    /* renamed from: s0, reason: collision with root package name */
    public final Drawable f7682s0;

    /* renamed from: t0, reason: collision with root package name */
    public final Drawable f7683t0;

    /* renamed from: u0, reason: collision with root package name */
    public final Drawable f7684u0;

    /* renamed from: v0, reason: collision with root package name */
    public final String f7685v0;

    /* renamed from: w0, reason: collision with root package name */
    public final String f7686w0;

    /* renamed from: x, reason: collision with root package name */
    public final v f7687x;

    /* renamed from: x0, reason: collision with root package name */
    public final String f7688x0;

    /* renamed from: y, reason: collision with root package name */
    public final Resources f7689y;

    /* renamed from: y0, reason: collision with root package name */
    public final Drawable f7690y0;

    /* renamed from: z, reason: collision with root package name */
    public final g f7691z;

    /* renamed from: z0, reason: collision with root package name */
    public final Drawable f7692z0;

    static {
        r1.f0.a("media3.ui");
        f7662d1 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03f6  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q(android.content.Context r49, android.util.AttributeSet r50) {
        /*
            Method dump skipped, instructions count: 1653
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.q.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static void a(q qVar, u0 u0Var, long j) {
        if (qVar.R0) {
            if (u0Var.n0(17) && u0Var.n0(10)) {
                d1 y02 = u0Var.y0();
                int o10 = y02.o();
                int i6 = 0;
                while (true) {
                    long e02 = u1.a0.e0(y02.m(i6, qVar.o0, 0L).f11338m);
                    if (j < e02) {
                        break;
                    }
                    if (i6 == o10 - 1) {
                        j = e02;
                        break;
                    } else {
                        j -= e02;
                        i6++;
                    }
                }
                u0Var.k(i6, j);
            }
        } else if (u0Var.n0(5)) {
            u0Var.M(j);
        }
        qVar.s();
    }

    public static boolean c(u0 u0Var, c1 c1Var) {
        d1 y02;
        int o10;
        if (u0Var.n0(17) && (o10 = (y02 = u0Var.y0()).o()) > 1 && o10 <= 100) {
            for (int i6 = 0; i6 < o10; i6++) {
                if (y02.m(i6, c1Var, 0L).f11338m != -9223372036854775807L) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f3) {
        u0 u0Var = this.M0;
        if (u0Var != null && u0Var.n0(13)) {
            u0 u0Var2 = this.M0;
            u0Var2.e(new o0(f3, u0Var2.d().f11597b));
        }
    }

    public final boolean d(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        u0 u0Var = this.M0;
        if (u0Var != null) {
            if (keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88) {
                if (keyEvent.getAction() == 0) {
                    if (keyCode == 90) {
                        if (u0Var.e0() != 4 && u0Var.n0(12)) {
                            u0Var.L0();
                        }
                    } else if (keyCode == 89 && u0Var.n0(11)) {
                        u0Var.N0();
                    } else if (keyEvent.getRepeatCount() == 0) {
                        if (keyCode != 79 && keyCode != 85) {
                            if (keyCode != 87) {
                                if (keyCode != 88) {
                                    if (keyCode != 126) {
                                        if (keyCode == 127) {
                                            String str = u1.a0.f12750a;
                                            if (u0Var.n0(1)) {
                                                u0Var.pause();
                                            }
                                        }
                                    } else {
                                        u1.a0.H(u0Var);
                                    }
                                } else if (u0Var.n0(7)) {
                                    u0Var.P();
                                }
                            } else if (u0Var.n0(9)) {
                                u0Var.K0();
                            }
                        } else if (u1.a0.a0(u0Var, this.Q0)) {
                            u1.a0.H(u0Var);
                        } else if (u0Var.n0(1)) {
                            u0Var.pause();
                        }
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!d(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public final void e(w4.k0 k0Var, View view) {
        this.H.setAdapter(k0Var);
        u();
        this.c1 = false;
        PopupWindow popupWindow = this.N;
        popupWindow.dismiss();
        this.c1 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i6 = this.O;
        popupWindow.showAsDropDown(view, width - i6, (-popupWindow.getHeight()) - i6);
    }

    public final db.c1 f(l1 l1Var, int i6) {
        db.r.e(4, "initialCapacity");
        Object[] objArr = new Object[4];
        db.k0 k0Var = l1Var.f11582a;
        int i10 = 0;
        for (int i11 = 0; i11 < k0Var.size(); i11++) {
            k1 k1Var = (k1) k0Var.get(i11);
            if (k1Var.f11571b.f11388c == i6) {
                for (int i12 = 0; i12 < k1Var.f11570a; i12++) {
                    if (k1Var.a(i12)) {
                        r1.q qVar = k1Var.f11571b.f11389d[i12];
                        if ((qVar.f11662e & 2) == 0) {
                            n nVar = new n(l1Var, i11, i12, this.M.M(qVar));
                            int i13 = i10 + 1;
                            int f3 = db.e0.f(objArr.length, i13);
                            if (f3 > objArr.length) {
                                objArr = Arrays.copyOf(objArr, f3);
                            }
                            objArr[i10] = nVar;
                            i10 = i13;
                        }
                    }
                }
            }
        }
        return db.k0.h(i10, objArr);
    }

    public final void g() {
        v vVar = this.f7687x;
        int i6 = vVar.f7725z;
        if (i6 != 3 && i6 != 2) {
            vVar.f();
            if (!vVar.C) {
                vVar.i(2);
            } else if (vVar.f7725z == 1) {
                vVar.f7713m.start();
            } else {
                vVar.f7714n.start();
            }
        }
    }

    public u0 getPlayer() {
        return this.M0;
    }

    public int getRepeatToggleModes() {
        return this.W0;
    }

    public boolean getShowShuffleButton() {
        return this.f7687x.b(this.f7663a0);
    }

    public boolean getShowSubtitleButton() {
        return this.f7687x.b(this.f7667c0);
    }

    public int getShowTimeoutMs() {
        return this.T0;
    }

    public boolean getShowVrButton() {
        return this.f7687x.b(this.f7665b0);
    }

    public final boolean h(u0 u0Var) {
        Class cls;
        if (u0Var != null && (cls = this.D) != null && cls.isAssignableFrom(u0Var.getClass())) {
            return true;
        }
        return false;
    }

    public final boolean i(u0 u0Var) {
        Class cls;
        if (u0Var != null && (cls = this.A) != null && cls.isAssignableFrom(u0Var.getClass())) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        v vVar = this.f7687x;
        if (vVar.f7725z == 0 && vVar.f7702a.l()) {
            return true;
        }
        return false;
    }

    public final boolean k(u0 u0Var) {
        try {
            if (i(u0Var)) {
                Method method = this.C;
                method.getClass();
                Object invoke = method.invoke(u0Var, null);
                invoke.getClass();
                if (((Boolean) invoke).booleanValue()) {
                    return true;
                }
            }
            if (h(u0Var)) {
                Method method2 = this.F;
                method2.getClass();
                Object invoke2 = method2.invoke(u0Var, null);
                invoke2.getClass();
                if (((Boolean) invoke2).booleanValue()) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e11) {
            e = e11;
            throw new RuntimeException(e);
        }
    }

    public final boolean l() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void m() {
        q();
        p();
        t();
        v();
        x();
        r();
        w();
    }

    public final void n(View view, boolean z10) {
        float f3;
        if (view == null) {
            return;
        }
        view.setEnabled(z10);
        if (z10) {
            f3 = this.A0;
        } else {
            f3 = this.B0;
        }
        view.setAlpha(f3);
    }

    public final void o(boolean z10) {
        if (this.N0 == z10) {
            return;
        }
        this.N0 = z10;
        String str = this.L0;
        Drawable drawable = this.J0;
        String str2 = this.K0;
        Drawable drawable2 = this.I0;
        ImageView imageView = this.f7668d0;
        if (imageView != null) {
            if (z10) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = this.f7669e0;
        if (imageView2 != null) {
            if (z10) {
                imageView2.setImageDrawable(drawable2);
                imageView2.setContentDescription(str2);
            } else {
                imageView2.setImageDrawable(drawable);
                imageView2.setContentDescription(str);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v vVar = this.f7687x;
        vVar.f7702a.addOnLayoutChangeListener(vVar.f7723x);
        this.O0 = true;
        if (j()) {
            vVar.g();
        }
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v vVar = this.f7687x;
        vVar.f7702a.removeOnLayoutChangeListener(vVar.f7723x);
        this.O0 = false;
        removeCallbacks(this.f7679p0);
        vVar.f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        super.onLayout(z10, i6, i10, i11, i12);
        View view = this.f7687x.f7703b;
        if (view != null) {
            view.layout(0, 0, i11 - i6, i12 - i10);
        }
    }

    public final void p() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        long j;
        long j10;
        if (l() && this.O0) {
            u0 u0Var = this.M0;
            if (u0Var != null) {
                if (this.P0 && c(u0Var, this.o0)) {
                    z11 = u0Var.n0(10);
                } else {
                    z11 = u0Var.n0(5);
                }
                z12 = u0Var.n0(7);
                z13 = u0Var.n0(11);
                z14 = u0Var.n0(12);
                z10 = u0Var.n0(9);
            } else {
                z10 = false;
                z11 = false;
                z12 = false;
                z13 = false;
                z14 = false;
            }
            Resources resources = this.f7689y;
            View view = this.T;
            if (z13) {
                u0 u0Var2 = this.M0;
                if (u0Var2 != null) {
                    j10 = u0Var2.R0();
                } else {
                    j10 = ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT;
                }
                int i6 = (int) (j10 / 1000);
                TextView textView = this.V;
                if (textView != null) {
                    textView.setText(String.valueOf(i6));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, i6, Integer.valueOf(i6)));
                }
            }
            View view2 = this.S;
            if (z14) {
                u0 u0Var3 = this.M0;
                if (u0Var3 != null) {
                    j = u0Var3.X();
                } else {
                    j = 15000;
                }
                int i10 = (int) (j / 1000);
                TextView textView2 = this.U;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(i10));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, i10, Integer.valueOf(i10)));
                }
            }
            n(this.P, z12);
            n(view, z13);
            n(view2, z14);
            n(this.Q, z10);
            g0 g0Var = this.f7675k0;
            if (g0Var != null) {
                g0Var.setEnabled(z11);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r1.y0().p() == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q() {
        /*
            r4 = this;
            boolean r0 = r4.l()
            if (r0 == 0) goto L55
            boolean r0 = r4.O0
            if (r0 != 0) goto Lb
            goto L55
        Lb:
            android.widget.ImageView r0 = r4.R
            if (r0 == 0) goto L55
            r1.u0 r1 = r4.M0
            boolean r2 = r4.Q0
            boolean r1 = u1.a0.a0(r1, r2)
            if (r1 == 0) goto L1c
            android.graphics.drawable.Drawable r2 = r4.f7680q0
            goto L1e
        L1c:
            android.graphics.drawable.Drawable r2 = r4.f7681r0
        L1e:
            if (r1 == 0) goto L24
            r1 = 2132017310(0x7f14009e, float:1.9672895E38)
            goto L27
        L24:
            r1 = 2132017309(0x7f14009d, float:1.9672893E38)
        L27:
            r0.setImageDrawable(r2)
            android.content.res.Resources r2 = r4.f7689y
            java.lang.String r1 = r2.getString(r1)
            r0.setContentDescription(r1)
            r1.u0 r1 = r4.M0
            if (r1 == 0) goto L51
            r2 = 1
            boolean r3 = r1.n0(r2)
            if (r3 == 0) goto L51
            r3 = 17
            boolean r3 = r1.n0(r3)
            if (r3 == 0) goto L52
            r1.d1 r1 = r1.y0()
            boolean r1 = r1.p()
            if (r1 != 0) goto L51
            goto L52
        L51:
            r2 = 0
        L52:
            r4.n(r0, r2)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.q.q():void");
    }

    public final void r() {
        i iVar;
        u0 u0Var = this.M0;
        if (u0Var == null) {
            return;
        }
        float f3 = u0Var.d().f11596a;
        boolean z10 = false;
        float f10 = Float.MAX_VALUE;
        int i6 = 0;
        int i10 = 0;
        while (true) {
            iVar = this.J;
            float[] fArr = iVar.B;
            if (i6 >= fArr.length) {
                break;
            }
            float abs = Math.abs(f3 - fArr[i6]);
            if (abs < f10) {
                i10 = i6;
                f10 = abs;
            }
            i6++;
        }
        iVar.C = i10;
        String str = iVar.A[i10];
        l lVar = this.I;
        lVar.B[0] = str;
        if (lVar.h(1) || lVar.h(0)) {
            z10 = true;
        }
        n(this.f7670f0, z10);
    }

    public final void s() {
        long j;
        long j10;
        int e02;
        long j11;
        if (l() && this.O0) {
            u0 u0Var = this.M0;
            if (u0Var != null && u0Var.n0(16)) {
                j = u0Var.Y() + this.f7666b1;
                j10 = u0Var.I0() + this.f7666b1;
            } else {
                j = 0;
                j10 = 0;
            }
            TextView textView = this.f7674j0;
            if (textView != null && !this.S0) {
                textView.setText(u1.a0.E(this.f7676l0, this.f7677m0, j));
            }
            g0 g0Var = this.f7675k0;
            if (g0Var != null) {
                g0Var.setPosition(j);
                if (k(u0Var)) {
                    j10 = j;
                }
                g0Var.setBufferedPosition(j10);
            }
            j2.h hVar = this.f7679p0;
            removeCallbacks(hVar);
            if (u0Var == null) {
                e02 = 1;
            } else {
                e02 = u0Var.e0();
            }
            long j12 = 1000;
            if (u0Var != null && u0Var.isPlaying()) {
                if (g0Var != null) {
                    j11 = g0Var.getPreferredUpdateDelay();
                } else {
                    j11 = 1000;
                }
                long min = Math.min(j11, 1000 - (j % 1000));
                float f3 = u0Var.d().f11596a;
                if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    j12 = ((float) min) / f3;
                }
                postDelayed(hVar, u1.a0.j(j12, this.V0, 1000L));
                return;
            }
            if (e02 != 4 && e02 != 1) {
                postDelayed(hVar, 1000L);
            }
        }
    }

    public void setAnimationEnabled(boolean z10) {
        this.f7687x.C = z10;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(h hVar) {
        boolean z10;
        boolean z11 = true;
        if (hVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ImageView imageView = this.f7668d0;
        if (imageView != null) {
            if (z10) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        if (hVar == null) {
            z11 = false;
        }
        ImageView imageView2 = this.f7669e0;
        if (imageView2 == null) {
            return;
        }
        if (z11) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(u0 u0Var) {
        boolean z10;
        boolean z11 = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        if (u0Var == null || u0Var.B0() == Looper.getMainLooper()) {
            z11 = true;
        }
        u1.c.b(z11);
        u0 u0Var2 = this.M0;
        if (u0Var2 == u0Var) {
            return;
        }
        g gVar = this.f7691z;
        if (u0Var2 != null) {
            u0Var2.t(gVar);
        }
        this.M0 = u0Var;
        if (u0Var != null) {
            u0Var.U(gVar);
        }
        m();
    }

    public void setRepeatToggleModes(int i6) {
        this.W0 = i6;
        u0 u0Var = this.M0;
        boolean z10 = false;
        if (u0Var != null && u0Var.n0(15)) {
            int x02 = this.M0.x0();
            if (i6 == 0 && x02 != 0) {
                this.M0.p0(0);
            } else if (i6 == 1 && x02 == 2) {
                this.M0.p0(1);
            } else if (i6 == 2 && x02 == 1) {
                this.M0.p0(2);
            }
        }
        if (i6 != 0) {
            z10 = true;
        }
        this.f7687x.h(this.W, z10);
        t();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.f7687x.h(this.S, z10);
        p();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        this.P0 = z10;
        w();
    }

    public void setShowNextButton(boolean z10) {
        this.f7687x.h(this.Q, z10);
        p();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        this.Q0 = z10;
        q();
    }

    public void setShowPreviousButton(boolean z10) {
        this.f7687x.h(this.P, z10);
        p();
    }

    public void setShowRewindButton(boolean z10) {
        this.f7687x.h(this.T, z10);
        p();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f7687x.h(this.f7663a0, z10);
        v();
    }

    public void setShowSubtitleButton(boolean z10) {
        this.f7687x.h(this.f7667c0, z10);
    }

    public void setShowTimeoutMs(int i6) {
        this.T0 = i6;
        if (j()) {
            this.f7687x.g();
        }
    }

    public void setShowVrButton(boolean z10) {
        this.f7687x.h(this.f7665b0, z10);
    }

    public void setTimeBarMinUpdateInterval(int i6) {
        this.V0 = u1.a0.i(i6, 16, UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT);
    }

    public void setTimeBarScrubbingEnabled(boolean z10) {
        this.U0 = z10;
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        boolean z10;
        ImageView imageView = this.f7665b0;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            if (onClickListener != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n(imageView, z10);
        }
    }

    public final void t() {
        ImageView imageView;
        if (l() && this.O0 && (imageView = this.W) != null) {
            if (this.W0 == 0) {
                n(imageView, false);
                return;
            }
            u0 u0Var = this.M0;
            String str = this.f7685v0;
            Drawable drawable = this.f7682s0;
            if (u0Var != null && u0Var.n0(15)) {
                n(imageView, true);
                int x02 = u0Var.x0();
                if (x02 != 0) {
                    if (x02 != 1) {
                        if (x02 == 2) {
                            imageView.setImageDrawable(this.f7684u0);
                            imageView.setContentDescription(this.f7688x0);
                            return;
                        }
                        return;
                    }
                    imageView.setImageDrawable(this.f7683t0);
                    imageView.setContentDescription(this.f7686w0);
                    return;
                }
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            n(imageView, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    public final void u() {
        RecyclerView recyclerView = this.H;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i6 = this.O;
        int min = Math.min(recyclerView.getMeasuredWidth(), width - (i6 * 2));
        PopupWindow popupWindow = this.N;
        popupWindow.setWidth(min);
        popupWindow.setHeight(Math.min(getHeight() - (i6 * 2), recyclerView.getMeasuredHeight()));
    }

    public final void v() {
        ImageView imageView;
        if (l() && this.O0 && (imageView = this.f7663a0) != null) {
            u0 u0Var = this.M0;
            if (!this.f7687x.b(imageView)) {
                n(imageView, false);
                return;
            }
            String str = this.D0;
            Drawable drawable = this.f7692z0;
            if (u0Var != null && u0Var.n0(14)) {
                n(imageView, true);
                if (u0Var.F0()) {
                    drawable = this.f7690y0;
                }
                imageView.setImageDrawable(drawable);
                if (u0Var.F0()) {
                    str = this.C0;
                }
                imageView.setContentDescription(str);
                return;
            }
            n(imageView, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    public final void w() {
        boolean z10;
        d1 d1Var;
        boolean z11;
        long j;
        int i6;
        int i10;
        int i11;
        int i12;
        d1 d1Var2;
        boolean[] zArr;
        boolean z12;
        int length;
        u0 u0Var = this.M0;
        if (u0Var == null) {
            return;
        }
        boolean z13 = this.P0;
        c1 c1Var = this.o0;
        boolean z14 = false;
        boolean z15 = true;
        if (z13 && c(u0Var, c1Var)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.R0 = z10;
        long j10 = 0;
        this.f7666b1 = 0L;
        if (u0Var.n0(17)) {
            d1Var = u0Var.y0();
        } else {
            d1Var = d1.f11368a;
        }
        long j11 = -9223372036854775807L;
        if (!d1Var.p()) {
            int m02 = u0Var.m0();
            boolean z16 = this.R0;
            if (z16) {
                i10 = 0;
            } else {
                i10 = m02;
            }
            if (z16) {
                i11 = d1Var.o() - 1;
            } else {
                i11 = m02;
            }
            long j12 = 0;
            i6 = 0;
            while (true) {
                if (i10 > i11) {
                    break;
                }
                long j13 = j10;
                if (i10 == m02) {
                    this.f7666b1 = u1.a0.e0(j12);
                }
                d1Var.n(i10, c1Var);
                if (c1Var.f11338m == j11) {
                    u1.c.g(this.R0 ^ z15);
                    break;
                }
                int i13 = c1Var.f11339n;
                while (i13 <= c1Var.f11340o) {
                    a1 a1Var = this.f7678n0;
                    d1Var.f(i13, a1Var, z14);
                    long j14 = j11;
                    r1.b bVar = a1Var.f11301g;
                    bVar.getClass();
                    int i14 = bVar.f11305a;
                    int i15 = 0;
                    while (i15 < i14) {
                        a1Var.d(i15);
                        long j15 = a1Var.f11299e;
                        if (j15 >= j13) {
                            long[] jArr = this.X0;
                            i12 = m02;
                            if (i6 == jArr.length) {
                                if (jArr.length == 0) {
                                    length = 1;
                                } else {
                                    length = jArr.length * 2;
                                }
                                this.X0 = Arrays.copyOf(jArr, length);
                                this.Y0 = Arrays.copyOf(this.Y0, length);
                            }
                            this.X0[i6] = u1.a0.e0(j15 + j12);
                            boolean[] zArr2 = this.Y0;
                            r1.a a10 = a1Var.f11301g.a(i15);
                            int i16 = a10.f11269a;
                            if (i16 == -1) {
                                zArr = zArr2;
                                d1Var2 = d1Var;
                            } else {
                                int i17 = 0;
                                while (i17 < i16) {
                                    zArr = zArr2;
                                    int i18 = a10.f11273e[i17];
                                    d1Var2 = d1Var;
                                    if (i18 != 0 && i18 != 1) {
                                        i17++;
                                        zArr2 = zArr;
                                        d1Var = d1Var2;
                                    }
                                }
                                zArr = zArr2;
                                d1Var2 = d1Var;
                                z12 = false;
                                zArr[i6] = !z12;
                                i6++;
                            }
                            z12 = true;
                            zArr[i6] = !z12;
                            i6++;
                        } else {
                            i12 = m02;
                            d1Var2 = d1Var;
                        }
                        i15++;
                        m02 = i12;
                        d1Var = d1Var2;
                        j13 = 0;
                    }
                    i13++;
                    j11 = j14;
                    d1Var = d1Var;
                    z14 = false;
                    j13 = 0;
                }
                j12 += c1Var.f11338m;
                i10++;
                d1Var = d1Var;
                z14 = false;
                z15 = true;
                j10 = 0;
            }
            z11 = true;
            j = j12;
        } else {
            z11 = true;
            if (u0Var.n0(16)) {
                long v10 = u0Var.v();
                if (v10 != -9223372036854775807L) {
                    j = u1.a0.Q(v10);
                    i6 = 0;
                }
            }
            j = 0;
            i6 = 0;
        }
        long e02 = u1.a0.e0(j);
        TextView textView = this.f7673i0;
        if (textView != null) {
            textView.setText(u1.a0.E(this.f7676l0, this.f7677m0, e02));
        }
        g0 g0Var = this.f7675k0;
        if (g0Var != null) {
            g0Var.setDuration(e02);
            long[] jArr2 = this.Z0;
            int length2 = jArr2.length;
            int i19 = i6 + length2;
            long[] jArr3 = this.X0;
            if (i19 > jArr3.length) {
                this.X0 = Arrays.copyOf(jArr3, i19);
                this.Y0 = Arrays.copyOf(this.Y0, i19);
            }
            System.arraycopy(jArr2, 0, this.X0, i6, length2);
            System.arraycopy(this.f7664a1, 0, this.Y0, i6, length2);
            long[] jArr4 = this.X0;
            boolean[] zArr3 = this.Y0;
            DefaultTimeBar defaultTimeBar = (DefaultTimeBar) g0Var;
            if (i19 != 0 && (jArr4 == null || zArr3 == null)) {
                z11 = false;
            }
            u1.c.b(z11);
            defaultTimeBar.f1086m0 = i19;
            defaultTimeBar.f1087n0 = jArr4;
            defaultTimeBar.o0 = zArr3;
            defaultTimeBar.e();
        }
        s();
    }

    public final void x() {
        boolean z10;
        f fVar = this.K;
        fVar.getClass();
        List list = Collections.EMPTY_LIST;
        fVar.A = list;
        f fVar2 = this.L;
        fVar2.getClass();
        fVar2.A = list;
        u0 u0Var = this.M0;
        ImageView imageView = this.f7667c0;
        boolean z11 = false;
        if (u0Var != null && u0Var.n0(30) && this.M0.n0(29)) {
            l1 g02 = this.M0.g0();
            db.c1 f3 = f(g02, 1);
            fVar2.A = f3;
            q qVar = fVar2.D;
            u0 u0Var2 = qVar.M0;
            l lVar = qVar.I;
            u0Var2.getClass();
            j1 H0 = u0Var2.H0();
            if (f3.isEmpty()) {
                lVar.B[1] = qVar.getResources().getString(R.string.exo_track_selection_none);
            } else if (!fVar2.h(H0)) {
                lVar.B[1] = qVar.getResources().getString(R.string.exo_track_selection_auto);
            } else {
                int i6 = 0;
                while (true) {
                    if (i6 >= f3.A) {
                        break;
                    }
                    n nVar = (n) f3.get(i6);
                    k1 k1Var = nVar.f7656a;
                    if (k1Var.f11574e[nVar.f7657b]) {
                        lVar.B[1] = nVar.f7658c;
                        break;
                    }
                    i6++;
                }
            }
            if (this.f7687x.b(imageView)) {
                fVar.i(f(g02, 3));
            } else {
                fVar.i(db.c1.B);
            }
        }
        if (fVar.a() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        n(imageView, z10);
        l lVar2 = this.I;
        if (lVar2.h(1) || lVar2.h(0)) {
            z11 = true;
        }
        n(this.f7670f0, z11);
    }

    public void setProgressUpdateListener(j jVar) {
    }
}

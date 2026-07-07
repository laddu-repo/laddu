package jc;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.media3.ui.DefaultTimeBar;
import fc.l;
import g4.g0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f7048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageButton f7049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageButton f7050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageButton f7051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageButton f7052e;
    public final ImageButton f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageButton f7053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageButton f7054h;
    public final ImageButton i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageButton f7055j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageButton f7056k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final FrameLayout f7057l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageButton f7058m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinearLayout f7059n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f7060o;

    public e(LinearLayout linearLayout, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, ImageButton imageButton4, ImageButton imageButton5, ImageButton imageButton6, ImageButton imageButton7, ImageButton imageButton8, ImageButton imageButton9, ImageButton imageButton10, FrameLayout frameLayout, ImageButton imageButton11, LinearLayout linearLayout2, TextView textView) {
        this.f7048a = linearLayout;
        this.f7049b = imageButton;
        this.f7050c = imageButton2;
        this.f7051d = imageButton3;
        this.f7052e = imageButton4;
        this.f = imageButton5;
        this.f7053g = imageButton6;
        this.f7054h = imageButton7;
        this.i = imageButton8;
        this.f7055j = imageButton9;
        this.f7056k = imageButton10;
        this.f7057l = frameLayout;
        this.f7058m = imageButton11;
        this.f7059n = linearLayout2;
        this.f7060o = textView;
    }

    public static e a(View view) {
        int i = l.bottom_controller;
        LinearLayout linearLayout = (LinearLayout) a.a.k(view, i);
        if (linearLayout != null) {
            i = l.btn_back;
            ImageButton imageButton = (ImageButton) a.a.k(view, i);
            if (imageButton != null) {
                i = l.btn_lock_unlock;
                ImageButton imageButton2 = (ImageButton) a.a.k(view, i);
                if (imageButton2 != null) {
                    i = l.btn_mute;
                    ImageButton imageButton3 = (ImageButton) a.a.k(view, i);
                    if (imageButton3 != null) {
                        i = l.btn_pip;
                        ImageButton imageButton4 = (ImageButton) a.a.k(view, i);
                        if (imageButton4 != null) {
                            i = l.btn_settings;
                            ImageButton imageButton5 = (ImageButton) a.a.k(view, i);
                            if (imageButton5 != null) {
                                i = l.close_btn;
                                ImageButton imageButton6 = (ImageButton) a.a.k(view, i);
                                if (imageButton6 != null) {
                                    i = g0.exo_duration;
                                    if (((TextView) a.a.k(view, i)) != null) {
                                        i = g0.exo_ffwd;
                                        if (((ImageButton) a.a.k(view, i)) != null) {
                                            i = l.exo_pause;
                                            ImageButton imageButton7 = (ImageButton) a.a.k(view, i);
                                            if (imageButton7 != null) {
                                                i = l.exo_play;
                                                ImageButton imageButton8 = (ImageButton) a.a.k(view, i);
                                                if (imageButton8 != null) {
                                                    i = g0.exo_position;
                                                    if (((TextView) a.a.k(view, i)) != null) {
                                                        i = g0.exo_progress;
                                                        if (((DefaultTimeBar) a.a.k(view, i)) != null) {
                                                            i = g0.exo_rew;
                                                            if (((ImageButton) a.a.k(view, i)) != null) {
                                                                i = l.floating_fullscreen_btn;
                                                                ImageButton imageButton9 = (ImageButton) a.a.k(view, i);
                                                                if (imageButton9 != null) {
                                                                    i = l.fullscreen;
                                                                    ImageButton imageButton10 = (ImageButton) a.a.k(view, i);
                                                                    if (imageButton10 != null) {
                                                                        i = l.links_container;
                                                                        FrameLayout frameLayout = (FrameLayout) a.a.k(view, i);
                                                                        if (frameLayout != null) {
                                                                            i = l.resize_mode;
                                                                            ImageButton imageButton11 = (ImageButton) a.a.k(view, i);
                                                                            if (imageButton11 != null) {
                                                                                i = l.timer_bar_ly;
                                                                                LinearLayout linearLayout2 = (LinearLayout) a.a.k(view, i);
                                                                                if (linearLayout2 != null) {
                                                                                    i = l.title;
                                                                                    TextView textView = (TextView) a.a.k(view, i);
                                                                                    if (textView != null) {
                                                                                        i = l.top_btns_lay;
                                                                                        if (((LinearLayout) a.a.k(view, i)) != null) {
                                                                                            return new e(linearLayout, imageButton, imageButton2, imageButton3, imageButton4, imageButton5, imageButton6, imageButton7, imageButton8, imageButton9, imageButton10, frameLayout, imageButton11, linearLayout2, textView);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}

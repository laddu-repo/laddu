package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textview.MaterialTextView;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ActivitySplashBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f3169a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearProgressIndicator f3170b;

    /* renamed from: c, reason: collision with root package name */
    public final ErrorLyBinding f3171c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f3172d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f3173e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f3174f;

    /* renamed from: g, reason: collision with root package name */
    public final ConstraintLayout f3175g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f3176h;

    /* renamed from: i, reason: collision with root package name */
    public final MaterialButton f3177i;
    public final MaterialButton j;

    /* renamed from: k, reason: collision with root package name */
    public final LinearLayout f3178k;

    /* renamed from: l, reason: collision with root package name */
    public final MaterialTextView f3179l;

    /* renamed from: m, reason: collision with root package name */
    public final MaterialButton f3180m;

    public ActivitySplashBinding(FrameLayout frameLayout, LinearProgressIndicator linearProgressIndicator, ErrorLyBinding errorLyBinding, TextView textView, LinearLayout linearLayout, TextView textView2, ConstraintLayout constraintLayout, TextView textView3, MaterialButton materialButton, MaterialButton materialButton2, LinearLayout linearLayout2, MaterialTextView materialTextView, MaterialButton materialButton3) {
        this.f3169a = frameLayout;
        this.f3170b = linearProgressIndicator;
        this.f3171c = errorLyBinding;
        this.f3172d = textView;
        this.f3173e = linearLayout;
        this.f3174f = textView2;
        this.f3175g = constraintLayout;
        this.f3176h = textView3;
        this.f3177i = materialButton;
        this.j = materialButton2;
        this.f3178k = linearLayout2;
        this.f3179l = materialTextView;
        this.f3180m = materialButton3;
    }

    public static ActivitySplashBinding bind(View view) {
        int i6 = R.id.animationView;
        if (((LottieAnimationView) f.N(view, R.id.animationView)) != null) {
            i6 = R.id.download_progress;
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) f.N(view, R.id.download_progress);
            if (linearProgressIndicator != null) {
                i6 = R.id.error_ly_splash;
                View N = f.N(view, R.id.error_ly_splash);
                if (N != null) {
                    ErrorLyBinding bind = ErrorLyBinding.bind(N);
                    i6 = R.id.linearLayout;
                    if (((LinearLayout) f.N(view, R.id.linearLayout)) != null) {
                        i6 = R.id.percent_txt;
                        TextView textView = (TextView) f.N(view, R.id.percent_txt);
                        if (textView != null) {
                            i6 = R.id.progress_container;
                            LinearLayout linearLayout = (LinearLayout) f.N(view, R.id.progress_container);
                            if (linearLayout != null) {
                                i6 = R.id.size_txt;
                                TextView textView2 = (TextView) f.N(view, R.id.size_txt);
                                if (textView2 != null) {
                                    i6 = R.id.splash_view;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) f.N(view, R.id.splash_view);
                                    if (constraintLayout != null) {
                                        i6 = R.id.textView;
                                        TextView textView3 = (TextView) f.N(view, R.id.textView);
                                        if (textView3 != null) {
                                            i6 = R.id.tg_btn_update;
                                            MaterialButton materialButton = (MaterialButton) f.N(view, R.id.tg_btn_update);
                                            if (materialButton != null) {
                                                i6 = R.id.update_btn;
                                                MaterialButton materialButton2 = (MaterialButton) f.N(view, R.id.update_btn);
                                                if (materialButton2 != null) {
                                                    i6 = R.id.update_container;
                                                    LinearLayout linearLayout2 = (LinearLayout) f.N(view, R.id.update_container);
                                                    if (linearLayout2 != null) {
                                                        i6 = R.id.update_wt;
                                                        MaterialTextView materialTextView = (MaterialTextView) f.N(view, R.id.update_wt);
                                                        if (materialTextView != null) {
                                                            i6 = R.id.website_btn;
                                                            MaterialButton materialButton3 = (MaterialButton) f.N(view, R.id.website_btn);
                                                            if (materialButton3 != null) {
                                                                return new ActivitySplashBinding((FrameLayout) view, linearProgressIndicator, bind, textView, linearLayout, textView2, constraintLayout, textView3, materialButton, materialButton2, linearLayout2, materialTextView, materialButton3);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    public static ActivitySplashBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySplashBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_splash, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}

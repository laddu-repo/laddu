package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ActivitySponsorBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final CoordinatorLayout f3181a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f3182b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f3183c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f3184d;

    /* renamed from: e, reason: collision with root package name */
    public final MaterialCardView f3185e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f3186f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f3187g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f3188h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f3189i;
    public final TextView j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f3190k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f3191l;

    public ActivitySponsorBinding(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, MaterialCardView materialCardView, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f3181a = coordinatorLayout;
        this.f3182b = linearLayout;
        this.f3183c = linearLayout2;
        this.f3184d = linearLayout3;
        this.f3185e = materialCardView;
        this.f3186f = imageView;
        this.f3187g = imageView2;
        this.f3188h = textView;
        this.f3189i = textView2;
        this.j = textView3;
        this.f3190k = textView4;
        this.f3191l = textView5;
    }

    public static ActivitySponsorBinding bind(View view) {
        int i6 = R.id.appBarLayout;
        if (((AppBarLayout) f.N(view, R.id.appBarLayout)) != null) {
            i6 = R.id.btnClickHere;
            LinearLayout linearLayout = (LinearLayout) f.N(view, R.id.btnClickHere);
            if (linearLayout != null) {
                i6 = R.id.btnClickHereContainer;
                if (((ConstraintLayout) f.N(view, R.id.btnClickHereContainer)) != null) {
                    i6 = R.id.btnGetApp;
                    LinearLayout linearLayout2 = (LinearLayout) f.N(view, R.id.btnGetApp);
                    if (linearLayout2 != null) {
                        i6 = R.id.btnJoinTelegram;
                        LinearLayout linearLayout3 = (LinearLayout) f.N(view, R.id.btnJoinTelegram);
                        if (linearLayout3 != null) {
                            i6 = R.id.cardInstructions;
                            if (((MaterialCardView) f.N(view, R.id.cardInstructions)) != null) {
                                i6 = R.id.cardTelegram;
                                if (((MaterialCardView) f.N(view, R.id.cardTelegram)) != null) {
                                    i6 = R.id.cardWarning;
                                    MaterialCardView materialCardView = (MaterialCardView) f.N(view, R.id.cardWarning);
                                    if (materialCardView != null) {
                                        i6 = R.id.ivHandLeft;
                                        ImageView imageView = (ImageView) f.N(view, R.id.ivHandLeft);
                                        if (imageView != null) {
                                            i6 = R.id.ivHandRight;
                                            ImageView imageView2 = (ImageView) f.N(view, R.id.ivHandRight);
                                            if (imageView2 != null) {
                                                i6 = R.id.scrollView;
                                                if (((NestedScrollView) f.N(view, R.id.scrollView)) != null) {
                                                    i6 = R.id.topBar;
                                                    if (((ConstraintLayout) f.N(view, R.id.topBar)) != null) {
                                                        i6 = R.id.tvAdFrequency;
                                                        TextView textView = (TextView) f.N(view, R.id.tvAdFrequency);
                                                        if (textView != null) {
                                                            i6 = R.id.tvAppName;
                                                            if (((TextView) f.N(view, R.id.tvAppName)) != null) {
                                                                i6 = R.id.tvCountdown;
                                                                TextView textView2 = (TextView) f.N(view, R.id.tvCountdown);
                                                                if (textView2 != null) {
                                                                    i6 = R.id.tvInstructions;
                                                                    TextView textView3 = (TextView) f.N(view, R.id.tvInstructions);
                                                                    if (textView3 != null) {
                                                                        i6 = R.id.tvInstructionsTitle;
                                                                        if (((TextView) f.N(view, R.id.tvInstructionsTitle)) != null) {
                                                                            i6 = R.id.tvSubtitle;
                                                                            if (((TextView) f.N(view, R.id.tvSubtitle)) != null) {
                                                                                i6 = R.id.tvSupportMeta;
                                                                                TextView textView4 = (TextView) f.N(view, R.id.tvSupportMeta);
                                                                                if (textView4 != null) {
                                                                                    i6 = R.id.tvTitle;
                                                                                    if (((TextView) f.N(view, R.id.tvTitle)) != null) {
                                                                                        i6 = R.id.tvWarning;
                                                                                        TextView textView5 = (TextView) f.N(view, R.id.tvWarning);
                                                                                        if (textView5 != null) {
                                                                                            return new ActivitySponsorBinding((CoordinatorLayout) view, linearLayout, linearLayout2, linearLayout3, materialCardView, imageView, imageView2, textView, textView2, textView3, textView4, textView5);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    public static ActivitySponsorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivitySponsorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_sponsor, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}

package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.ChipGroup;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ActivityPlayerBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3153a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f3154b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f3155c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f3156d;

    /* renamed from: e, reason: collision with root package name */
    public final ErrorLyBinding f3157e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f3158f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f3159g;

    /* renamed from: h, reason: collision with root package name */
    public final MessageLyBinding f3160h;

    /* renamed from: i, reason: collision with root package name */
    public final RecyclerView f3161i;
    public final PlayerView j;

    /* renamed from: k, reason: collision with root package name */
    public final FrameLayout f3162k;

    /* renamed from: l, reason: collision with root package name */
    public final ChipGroup f3163l;

    /* renamed from: m, reason: collision with root package name */
    public final HorizontalScrollView f3164m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f3165n;

    /* renamed from: o, reason: collision with root package name */
    public final ImageView f3166o;

    /* renamed from: p, reason: collision with root package name */
    public final ImageView f3167p;

    /* renamed from: q, reason: collision with root package name */
    public final LinearLayout f3168q;

    public ActivityPlayerBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, ImageView imageView, TextView textView, ErrorLyBinding errorLyBinding, TextView textView2, LinearLayout linearLayout2, MessageLyBinding messageLyBinding, RecyclerView recyclerView, PlayerView playerView, FrameLayout frameLayout, ChipGroup chipGroup, HorizontalScrollView horizontalScrollView, TextView textView3, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout3) {
        this.f3153a = constraintLayout;
        this.f3154b = linearLayout;
        this.f3155c = imageView;
        this.f3156d = textView;
        this.f3157e = errorLyBinding;
        this.f3158f = textView2;
        this.f3159g = linearLayout2;
        this.f3160h = messageLyBinding;
        this.f3161i = recyclerView;
        this.j = playerView;
        this.f3162k = frameLayout;
        this.f3163l = chipGroup;
        this.f3164m = horizontalScrollView;
        this.f3165n = textView3;
        this.f3166o = imageView2;
        this.f3167p = imageView3;
        this.f3168q = linearLayout3;
    }

    public static ActivityPlayerBinding bind(View view) {
        int i6 = R.id.ad_ly_player;
        LinearLayout linearLayout = (LinearLayout) f.N(view, R.id.ad_ly_player);
        if (linearLayout != null) {
            i6 = R.id.bv_icon;
            ImageView imageView = (ImageView) f.N(view, R.id.bv_icon);
            if (imageView != null) {
                i6 = R.id.bv_progress;
                TextView textView = (TextView) f.N(view, R.id.bv_progress);
                if (textView != null) {
                    i6 = R.id.content_player;
                    if (((FrameLayout) f.N(view, R.id.content_player)) != null) {
                        i6 = R.id.error_ly;
                        View N = f.N(view, R.id.error_ly);
                        if (N != null) {
                            ErrorLyBinding bind = ErrorLyBinding.bind(N);
                            i6 = R.id.eventDateTime;
                            TextView textView2 = (TextView) f.N(view, R.id.eventDateTime);
                            if (textView2 != null) {
                                i6 = R.id.item_details_container;
                                LinearLayout linearLayout2 = (LinearLayout) f.N(view, R.id.item_details_container);
                                if (linearLayout2 != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                    i6 = R.id.notice_txt_player;
                                    View N2 = f.N(view, R.id.notice_txt_player);
                                    if (N2 != null) {
                                        MessageLyBinding bind2 = MessageLyBinding.bind(N2);
                                        i6 = R.id.player_recycler;
                                        RecyclerView recyclerView = (RecyclerView) f.N(view, R.id.player_recycler);
                                        if (recyclerView != null) {
                                            i6 = R.id.player_view;
                                            PlayerView playerView = (PlayerView) f.N(view, R.id.player_view);
                                            if (playerView != null) {
                                                i6 = R.id.server_container_ly;
                                                FrameLayout frameLayout = (FrameLayout) f.N(view, R.id.server_container_ly);
                                                if (frameLayout != null) {
                                                    i6 = R.id.servers_container;
                                                    ChipGroup chipGroup = (ChipGroup) f.N(view, R.id.servers_container);
                                                    if (chipGroup != null) {
                                                        i6 = R.id.servers_scroller;
                                                        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) f.N(view, R.id.servers_scroller);
                                                        if (horizontalScrollView != null) {
                                                            i6 = R.id.status_txt;
                                                            TextView textView3 = (TextView) f.N(view, R.id.status_txt);
                                                            if (textView3 != null) {
                                                                i6 = R.id.teamAFlag;
                                                                ImageView imageView2 = (ImageView) f.N(view, R.id.teamAFlag);
                                                                if (imageView2 != null) {
                                                                    i6 = R.id.teamBFlag;
                                                                    ImageView imageView3 = (ImageView) f.N(view, R.id.teamBFlag);
                                                                    if (imageView3 != null) {
                                                                        i6 = R.id.vb_ly;
                                                                        LinearLayout linearLayout3 = (LinearLayout) f.N(view, R.id.vb_ly);
                                                                        if (linearLayout3 != null) {
                                                                            i6 = R.id.vsText;
                                                                            if (((TextView) f.N(view, R.id.vsText)) != null) {
                                                                                return new ActivityPlayerBinding(constraintLayout, linearLayout, imageView, textView, bind, textView2, linearLayout2, bind2, recyclerView, playerView, frameLayout, chipGroup, horizontalScrollView, textView3, imageView2, imageView3, linearLayout3);
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

    public static ActivityPlayerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPlayerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_player, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}

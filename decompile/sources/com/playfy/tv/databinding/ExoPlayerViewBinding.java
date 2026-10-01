package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.SubtitleView;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ExoPlayerViewBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final View f3287a;

    /* renamed from: b, reason: collision with root package name */
    public final View f3288b;

    /* renamed from: c, reason: collision with root package name */
    public final View f3289c;

    public ExoPlayerViewBinding(View view, View view2, View view3) {
        this.f3287a = view;
        this.f3288b = view2;
        this.f3289c = view3;
    }

    public static ExoPlayerViewBinding bind(View view) {
        int i6 = R.id.exo_ad_overlay;
        if (((FrameLayout) f.N(view, R.id.exo_ad_overlay)) != null) {
            i6 = R.id.exo_artwork;
            if (((ImageView) f.N(view, R.id.exo_artwork)) != null) {
                i6 = R.id.exo_content_frame;
                if (((AspectRatioFrameLayout) f.N(view, R.id.exo_content_frame)) != null) {
                    i6 = R.id.exo_controller_placeholder;
                    View N = f.N(view, R.id.exo_controller_placeholder);
                    if (N != null) {
                        i6 = R.id.exo_error_message;
                        if (((TextView) f.N(view, R.id.exo_error_message)) != null) {
                            i6 = R.id.exo_overlay;
                            if (((FrameLayout) f.N(view, R.id.exo_overlay)) != null) {
                                i6 = R.id.exo_shutter;
                                View N2 = f.N(view, R.id.exo_shutter);
                                if (N2 != null) {
                                    i6 = R.id.exo_subtitles;
                                    if (((SubtitleView) f.N(view, R.id.exo_subtitles)) != null) {
                                        i6 = R.id.pb_player;
                                        if (((ProgressBar) f.N(view, R.id.pb_player)) != null) {
                                            return new ExoPlayerViewBinding(view, N, N2);
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

    public static ExoPlayerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.exo_player_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }
}

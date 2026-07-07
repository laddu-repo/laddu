package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.media3.ui.DefaultTimeBar;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ExoPlayerControlViewBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final View f3286a;

    public ExoPlayerControlViewBinding(View view) {
        this.f3286a = view;
    }

    public static ExoPlayerControlViewBinding bind(View view) {
        int i6 = R.id.adjust_btn;
        if (((ImageView) f.N(view, R.id.adjust_btn)) != null) {
            i6 = R.id.exo_back;
            if (((ImageButton) f.N(view, R.id.exo_back)) != null) {
                i6 = R.id.exo_bottom_bar;
                if (((LinearLayout) f.N(view, R.id.exo_bottom_bar)) != null) {
                    i6 = R.id.exo_duration;
                    if (((TextView) f.N(view, R.id.exo_duration)) != null) {
                        i6 = R.id.exo_ffwd;
                        if (((ImageButton) f.N(view, R.id.exo_ffwd)) != null) {
                            i6 = R.id.exo_lock;
                            if (((ImageButton) f.N(view, R.id.exo_lock)) != null) {
                                i6 = R.id.exo_minimal_controls;
                                if (((LinearLayout) f.N(view, R.id.exo_minimal_controls)) != null) {
                                    i6 = R.id.exo_play_pause;
                                    if (((ImageButton) f.N(view, R.id.exo_play_pause)) != null) {
                                        i6 = R.id.exo_position;
                                        if (((TextView) f.N(view, R.id.exo_position)) != null) {
                                            i6 = R.id.exo_progress;
                                            if (((DefaultTimeBar) f.N(view, R.id.exo_progress)) != null) {
                                                i6 = R.id.exo_quality;
                                                if (((ImageButton) f.N(view, R.id.exo_quality)) != null) {
                                                    i6 = R.id.exo_rew;
                                                    if (((ImageButton) f.N(view, R.id.exo_rew)) != null) {
                                                        i6 = R.id.exo_top_bar;
                                                        if (((LinearLayout) f.N(view, R.id.exo_top_bar)) != null) {
                                                            i6 = R.id.exo_volume;
                                                            if (((ImageButton) f.N(view, R.id.exo_volume)) != null) {
                                                                i6 = R.id.full_screen_btn;
                                                                if (((ImageButton) f.N(view, R.id.full_screen_btn)) != null) {
                                                                    i6 = R.id.pip_btn;
                                                                    if (((ImageButton) f.N(view, R.id.pip_btn)) != null) {
                                                                        i6 = R.id.servers_container_controller;
                                                                        if (((FrameLayout) f.N(view, R.id.servers_container_controller)) != null) {
                                                                            i6 = R.id.timer_ly;
                                                                            if (((LinearLayout) f.N(view, R.id.timer_ly)) != null) {
                                                                                i6 = R.id.top_ui;
                                                                                if (((LinearLayout) f.N(view, R.id.top_ui)) != null) {
                                                                                    i6 = R.id.unlocked_ui;
                                                                                    if (((LinearLayout) f.N(view, R.id.unlocked_ui)) != null) {
                                                                                        return new ExoPlayerControlViewBinding(view);
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

    public static ExoPlayerControlViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.exo_player_control_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }
}

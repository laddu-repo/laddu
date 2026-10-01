package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.divider.MaterialDivider;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class DialogPlaylistEditorBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3234a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f3235b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f3236c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f3237d;

    /* renamed from: e, reason: collision with root package name */
    public final PlaylistInputBinding f3238e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f3239f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f3240g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f3241h;

    public DialogPlaylistEditorBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, PlaylistInputBinding playlistInputBinding, LinearLayout linearLayout3, TextView textView, TextView textView2) {
        this.f3234a = constraintLayout;
        this.f3235b = linearLayout;
        this.f3236c = imageView;
        this.f3237d = linearLayout2;
        this.f3238e = playlistInputBinding;
        this.f3239f = linearLayout3;
        this.f3240g = textView;
        this.f3241h = textView2;
    }

    public static DialogPlaylistEditorBinding bind(View view) {
        int i6 = R.id.action_bar;
        if (((LinearLayout) f.N(view, R.id.action_bar)) != null) {
            i6 = R.id.cancel_btn;
            LinearLayout linearLayout = (LinearLayout) f.N(view, R.id.cancel_btn);
            if (linearLayout != null) {
                i6 = R.id.close_btn;
                ImageView imageView = (ImageView) f.N(view, R.id.close_btn);
                if (imageView != null) {
                    i6 = R.id.delete_btn;
                    LinearLayout linearLayout2 = (LinearLayout) f.N(view, R.id.delete_btn);
                    if (linearLayout2 != null) {
                        i6 = R.id.divider_a;
                        if (((MaterialDivider) f.N(view, R.id.divider_a)) != null) {
                            i6 = R.id.divider_b;
                            if (((MaterialDivider) f.N(view, R.id.divider_b)) != null) {
                                i6 = R.id.header;
                                if (((LinearLayout) f.N(view, R.id.header)) != null) {
                                    i6 = R.id.playlist_input;
                                    View N = f.N(view, R.id.playlist_input);
                                    if (N != null) {
                                        PlaylistInputBinding bind = PlaylistInputBinding.bind(N);
                                        i6 = R.id.save_btn;
                                        LinearLayout linearLayout3 = (LinearLayout) f.N(view, R.id.save_btn);
                                        if (linearLayout3 != null) {
                                            i6 = R.id.save_btn_text;
                                            TextView textView = (TextView) f.N(view, R.id.save_btn_text);
                                            if (textView != null) {
                                                i6 = R.id.title_text;
                                                TextView textView2 = (TextView) f.N(view, R.id.title_text);
                                                if (textView2 != null) {
                                                    return new DialogPlaylistEditorBinding((ConstraintLayout) view, linearLayout, imageView, linearLayout2, bind, linearLayout3, textView, textView2);
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

    public static DialogPlaylistEditorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static DialogPlaylistEditorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_playlist_editor, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}

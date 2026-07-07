package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class PlaylistItemBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f3348a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageButton f3349b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageButton f3350c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f3351d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f3352e;

    public PlaylistItemBinding(LinearLayout linearLayout, ImageButton imageButton, ImageButton imageButton2, TextView textView, TextView textView2) {
        this.f3348a = linearLayout;
        this.f3349b = imageButton;
        this.f3350c = imageButton2;
        this.f3351d = textView;
        this.f3352e = textView2;
    }

    public static PlaylistItemBinding bind(View view) {
        int i6 = R.id.delete_btn;
        ImageButton imageButton = (ImageButton) f.N(view, R.id.delete_btn);
        if (imageButton != null) {
            i6 = R.id.edit_btn;
            ImageButton imageButton2 = (ImageButton) f.N(view, R.id.edit_btn);
            if (imageButton2 != null) {
                i6 = R.id.link;
                TextView textView = (TextView) f.N(view, R.id.link);
                if (textView != null) {
                    i6 = R.id.title;
                    TextView textView2 = (TextView) f.N(view, R.id.title);
                    if (textView2 != null) {
                        return new PlaylistItemBinding((LinearLayout) view, imageButton, imageButton2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    public static PlaylistItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PlaylistItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.playlist_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}

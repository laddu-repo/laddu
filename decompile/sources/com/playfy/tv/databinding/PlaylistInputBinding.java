package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class PlaylistInputBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f3344a;

    /* renamed from: b, reason: collision with root package name */
    public final TextInputEditText f3345b;

    /* renamed from: c, reason: collision with root package name */
    public final TextInputLayout f3346c;

    /* renamed from: d, reason: collision with root package name */
    public final TextInputEditText f3347d;

    public PlaylistInputBinding(TextInputLayout textInputLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout2, TextInputEditText textInputEditText2) {
        this.f3344a = textInputLayout;
        this.f3345b = textInputEditText;
        this.f3346c = textInputLayout2;
        this.f3347d = textInputEditText2;
    }

    public static PlaylistInputBinding bind(View view) {
        int i6 = R.id.link_container;
        TextInputLayout textInputLayout = (TextInputLayout) f.N(view, R.id.link_container);
        if (textInputLayout != null) {
            i6 = R.id.path_input;
            TextInputEditText textInputEditText = (TextInputEditText) f.N(view, R.id.path_input);
            if (textInputEditText != null) {
                i6 = R.id.title_container;
                TextInputLayout textInputLayout2 = (TextInputLayout) f.N(view, R.id.title_container);
                if (textInputLayout2 != null) {
                    i6 = R.id.title_input;
                    TextInputEditText textInputEditText2 = (TextInputEditText) f.N(view, R.id.title_input);
                    if (textInputEditText2 != null) {
                        return new PlaylistInputBinding(textInputLayout, textInputEditText, textInputLayout2, textInputEditText2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i6)));
    }

    public static PlaylistInputBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static PlaylistInputBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.playlist_input, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}

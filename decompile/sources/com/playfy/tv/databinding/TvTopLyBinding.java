package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class TvTopLyBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f3361a;

    /* renamed from: b, reason: collision with root package name */
    public final MaterialButton f3362b;

    /* renamed from: c, reason: collision with root package name */
    public final MaterialButton f3363c;

    /* renamed from: d, reason: collision with root package name */
    public final MaterialButton f3364d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageButton f3365e;

    /* renamed from: f, reason: collision with root package name */
    public final TextInputLayout f3366f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialButton f3367g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputEditText f3368h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearLayout f3369i;

    public TvTopLyBinding(MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, ImageButton imageButton, TextInputLayout textInputLayout, MaterialButton materialButton5, TextInputEditText textInputEditText, LinearLayout linearLayout) {
        this.f3361a = materialButton;
        this.f3362b = materialButton2;
        this.f3363c = materialButton3;
        this.f3364d = materialButton4;
        this.f3365e = imageButton;
        this.f3366f = textInputLayout;
        this.f3367g = materialButton5;
        this.f3368h = textInputEditText;
        this.f3369i = linearLayout;
    }

    public static TvTopLyBinding bind(View view) {
        int i6 = R.id.cats_btn;
        MaterialButton materialButton = (MaterialButton) f.N(view, R.id.cats_btn);
        if (materialButton != null) {
            i6 = R.id.events_btn;
            MaterialButton materialButton2 = (MaterialButton) f.N(view, R.id.events_btn);
            if (materialButton2 != null) {
                i6 = R.id.fav_btn;
                MaterialButton materialButton3 = (MaterialButton) f.N(view, R.id.fav_btn);
                if (materialButton3 != null) {
                    i6 = R.id.high_btn;
                    MaterialButton materialButton4 = (MaterialButton) f.N(view, R.id.high_btn);
                    if (materialButton4 != null) {
                        i6 = R.id.search_btn;
                        ImageButton imageButton = (ImageButton) f.N(view, R.id.search_btn);
                        if (imageButton != null) {
                            i6 = R.id.search_view_tv;
                            TextInputLayout textInputLayout = (TextInputLayout) f.N(view, R.id.search_view_tv);
                            if (textInputLayout != null) {
                                i6 = R.id.settings_btn;
                                MaterialButton materialButton5 = (MaterialButton) f.N(view, R.id.settings_btn);
                                if (materialButton5 != null) {
                                    i6 = R.id.title_txt;
                                    if (((TextView) f.N(view, R.id.title_txt)) != null) {
                                        i6 = R.id.tv_search_input;
                                        TextInputEditText textInputEditText = (TextInputEditText) f.N(view, R.id.tv_search_input);
                                        if (textInputEditText != null) {
                                            i6 = R.id.tv_top_ly;
                                            LinearLayout linearLayout = (LinearLayout) f.N(view, R.id.tv_top_ly);
                                            if (linearLayout != null) {
                                                return new TvTopLyBinding(materialButton, materialButton2, materialButton3, materialButton4, imageButton, textInputLayout, materialButton5, textInputEditText, linearLayout);
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

    public static TvTopLyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static TvTopLyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.tv_top_ly, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}

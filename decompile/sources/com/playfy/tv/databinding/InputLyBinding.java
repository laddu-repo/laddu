package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class InputLyBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3308a;

    /* renamed from: b, reason: collision with root package name */
    public final CheckBox f3309b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f3310c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f3311d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f3312e;

    /* renamed from: f, reason: collision with root package name */
    public final TextInputLayout f3313f;

    /* renamed from: g, reason: collision with root package name */
    public final TextInputEditText f3314g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f3315h;

    /* renamed from: i, reason: collision with root package name */
    public final TextInputEditText f3316i;
    public final LinearLayout j;

    /* renamed from: k, reason: collision with root package name */
    public final TextInputLayout f3317k;

    /* renamed from: l, reason: collision with root package name */
    public final TextInputEditText f3318l;

    /* renamed from: m, reason: collision with root package name */
    public final Spinner f3319m;

    /* renamed from: n, reason: collision with root package name */
    public final TextInputLayout f3320n;

    /* renamed from: o, reason: collision with root package name */
    public final TextInputEditText f3321o;

    /* renamed from: p, reason: collision with root package name */
    public final TextInputLayout f3322p;

    /* renamed from: q, reason: collision with root package name */
    public final TextInputEditText f3323q;

    public InputLyBinding(ConstraintLayout constraintLayout, CheckBox checkBox, LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, TextInputLayout textInputLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout2, TextInputEditText textInputEditText2, LinearLayout linearLayout3, TextInputLayout textInputLayout3, TextInputEditText textInputEditText3, Spinner spinner, TextInputLayout textInputLayout4, TextInputEditText textInputEditText4, TextInputLayout textInputLayout5, TextInputEditText textInputEditText5) {
        this.f3308a = constraintLayout;
        this.f3309b = checkBox;
        this.f3310c = linearLayout;
        this.f3311d = linearLayout2;
        this.f3312e = imageView;
        this.f3313f = textInputLayout;
        this.f3314g = textInputEditText;
        this.f3315h = textInputLayout2;
        this.f3316i = textInputEditText2;
        this.j = linearLayout3;
        this.f3317k = textInputLayout3;
        this.f3318l = textInputEditText3;
        this.f3319m = spinner;
        this.f3320n = textInputLayout4;
        this.f3321o = textInputEditText4;
        this.f3322p = textInputLayout5;
        this.f3323q = textInputEditText5;
    }

    public static InputLyBinding bind(View view) {
        int i6 = R.id.adv;
        CheckBox checkBox = (CheckBox) f.N(view, R.id.adv);
        if (checkBox != null) {
            i6 = R.id.adv_container;
            LinearLayout linearLayout = (LinearLayout) f.N(view, R.id.adv_container);
            if (linearLayout != null) {
                i6 = R.id.cancel_btn;
                LinearLayout linearLayout2 = (LinearLayout) f.N(view, R.id.cancel_btn);
                if (linearLayout2 != null) {
                    i6 = R.id.close_btn;
                    ImageView imageView = (ImageView) f.N(view, R.id.close_btn);
                    if (imageView != null) {
                        i6 = R.id.divider_a_form;
                        if (((MaterialDivider) f.N(view, R.id.divider_a_form)) != null) {
                            i6 = R.id.dividerB_form;
                            if (((MaterialDivider) f.N(view, R.id.dividerB_form)) != null) {
                                i6 = R.id.formScroll;
                                if (((NestedScrollView) f.N(view, R.id.formScroll)) != null) {
                                    i6 = R.id.hly_n;
                                    if (((LinearLayout) f.N(view, R.id.hly_n)) != null) {
                                        i6 = R.id.licence_container;
                                        TextInputLayout textInputLayout = (TextInputLayout) f.N(view, R.id.licence_container);
                                        if (textInputLayout != null) {
                                            i6 = R.id.licence_input;
                                            TextInputEditText textInputEditText = (TextInputEditText) f.N(view, R.id.licence_input);
                                            if (textInputEditText != null) {
                                                i6 = R.id.linearLayout2;
                                                if (((LinearLayout) f.N(view, R.id.linearLayout2)) != null) {
                                                    i6 = R.id.origin_container;
                                                    TextInputLayout textInputLayout2 = (TextInputLayout) f.N(view, R.id.origin_container);
                                                    if (textInputLayout2 != null) {
                                                        i6 = R.id.origin_input;
                                                        TextInputEditText textInputEditText2 = (TextInputEditText) f.N(view, R.id.origin_input);
                                                        if (textInputEditText2 != null) {
                                                            i6 = R.id.play_btn;
                                                            LinearLayout linearLayout3 = (LinearLayout) f.N(view, R.id.play_btn);
                                                            if (linearLayout3 != null) {
                                                                i6 = R.id.ref_container;
                                                                TextInputLayout textInputLayout3 = (TextInputLayout) f.N(view, R.id.ref_container);
                                                                if (textInputLayout3 != null) {
                                                                    i6 = R.id.ref_input;
                                                                    TextInputEditText textInputEditText3 = (TextInputEditText) f.N(view, R.id.ref_input);
                                                                    if (textInputEditText3 != null) {
                                                                        i6 = R.id.spinner;
                                                                        Spinner spinner = (Spinner) f.N(view, R.id.spinner);
                                                                        if (spinner != null) {
                                                                            i6 = R.id.ua_container;
                                                                            TextInputLayout textInputLayout4 = (TextInputLayout) f.N(view, R.id.ua_container);
                                                                            if (textInputLayout4 != null) {
                                                                                i6 = R.id.ua_input;
                                                                                TextInputEditText textInputEditText4 = (TextInputEditText) f.N(view, R.id.ua_input);
                                                                                if (textInputEditText4 != null) {
                                                                                    i6 = R.id.url_container;
                                                                                    TextInputLayout textInputLayout5 = (TextInputLayout) f.N(view, R.id.url_container);
                                                                                    if (textInputLayout5 != null) {
                                                                                        i6 = R.id.url_input;
                                                                                        TextInputEditText textInputEditText5 = (TextInputEditText) f.N(view, R.id.url_input);
                                                                                        if (textInputEditText5 != null) {
                                                                                            return new InputLyBinding((ConstraintLayout) view, checkBox, linearLayout, linearLayout2, imageView, textInputLayout, textInputEditText, textInputLayout2, textInputEditText2, linearLayout3, textInputLayout3, textInputEditText3, spinner, textInputLayout4, textInputEditText4, textInputLayout5, textInputEditText5);
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

    public static InputLyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static InputLyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.input_ly, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}

package com.playfy.tv.databinding;

import a8.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.playfy.tv.R;
import r5.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CatChoseDialogBinding implements a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3192a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f3193b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f3194c;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f3195d;

    /* renamed from: e, reason: collision with root package name */
    public final TextInputEditText f3196e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f3197f;

    /* renamed from: g, reason: collision with root package name */
    public final TextInputLayout f3198g;

    public CatChoseDialogBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, RecyclerView recyclerView, FrameLayout frameLayout2, TextInputEditText textInputEditText, ImageView imageView, TextInputLayout textInputLayout) {
        this.f3192a = constraintLayout;
        this.f3193b = frameLayout;
        this.f3194c = recyclerView;
        this.f3195d = frameLayout2;
        this.f3196e = textInputEditText;
        this.f3197f = imageView;
        this.f3198g = textInputLayout;
    }

    public static CatChoseDialogBinding bind(View view) {
        int i6 = R.id.close_btn;
        FrameLayout frameLayout = (FrameLayout) f.N(view, R.id.close_btn);
        if (frameLayout != null) {
            i6 = R.id.content_layout;
            if (((LinearLayout) f.N(view, R.id.content_layout)) != null) {
                i6 = R.id.divider_a;
                if (((MaterialDivider) f.N(view, R.id.divider_a)) != null) {
                    i6 = R.id.header;
                    if (((LinearLayout) f.N(view, R.id.header)) != null) {
                        i6 = R.id.optionsRecyclerView;
                        RecyclerView recyclerView = (RecyclerView) f.N(view, R.id.optionsRecyclerView);
                        if (recyclerView != null) {
                            i6 = R.id.search_btn;
                            FrameLayout frameLayout2 = (FrameLayout) f.N(view, R.id.search_btn);
                            if (frameLayout2 != null) {
                                i6 = R.id.searchEditText;
                                TextInputEditText textInputEditText = (TextInputEditText) f.N(view, R.id.searchEditText);
                                if (textInputEditText != null) {
                                    i6 = R.id.search_img;
                                    ImageView imageView = (ImageView) f.N(view, R.id.search_img);
                                    if (imageView != null) {
                                        i6 = R.id.searchLayout;
                                        TextInputLayout textInputLayout = (TextInputLayout) f.N(view, R.id.searchLayout);
                                        if (textInputLayout != null) {
                                            return new CatChoseDialogBinding((ConstraintLayout) view, frameLayout, recyclerView, frameLayout2, textInputEditText, imageView, textInputLayout);
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

    public static CatChoseDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CatChoseDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.cat_chose_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}

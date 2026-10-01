package com.google.android.material.datepicker;

import a2.a2;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.material.internal.CheckableImageButton;
import com.playfy.tv.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import t0.h0;
import t0.q0;
import t0.x1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class p<S> extends j1.r {
    public final LinkedHashSet P0;
    public final LinkedHashSet Q0;
    public int R0;
    public w S0;
    public b T0;
    public m U0;
    public int V0;
    public CharSequence W0;
    public boolean X0;
    public int Y0;
    public int Z0;

    /* renamed from: a1, reason: collision with root package name */
    public CharSequence f2676a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f2677b1;
    public CharSequence c1;

    /* renamed from: d1, reason: collision with root package name */
    public int f2678d1;

    /* renamed from: e1, reason: collision with root package name */
    public CharSequence f2679e1;

    /* renamed from: f1, reason: collision with root package name */
    public int f2680f1;

    /* renamed from: g1, reason: collision with root package name */
    public CharSequence f2681g1;

    /* renamed from: h1, reason: collision with root package name */
    public TextView f2682h1;

    /* renamed from: i1, reason: collision with root package name */
    public CheckableImageButton f2683i1;

    /* renamed from: j1, reason: collision with root package name */
    public ua.i f2684j1;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f2685k1;

    /* renamed from: l1, reason: collision with root package name */
    public CharSequence f2686l1;

    /* renamed from: m1, reason: collision with root package name */
    public CharSequence f2687m1;

    public p() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.P0 = new LinkedHashSet();
        this.Q0 = new LinkedHashSet();
    }

    public static int S(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar b10 = y.b();
        b10.set(5, 1);
        Calendar a10 = y.a(b10);
        a10.get(2);
        a10.get(1);
        int maximum = a10.getMaximum(7);
        a10.getActualMaximum(5);
        a10.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean T(Context context, int i6) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a8.g.q(R.attr.materialCalendarStyle, context, m.class.getCanonicalName()).data, new int[]{i6});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    @Override // j1.r, j1.y
    public final void A() {
        this.S0.f2698z0.clear();
        super.A();
    }

    @Override // j1.r
    public final Dialog O() {
        Context F = F();
        F();
        int i6 = this.R0;
        if (i6 != 0) {
            Dialog dialog = new Dialog(F, i6);
            Context context = dialog.getContext();
            this.X0 = T(context, android.R.attr.windowFullscreen);
            this.f2684j1 = new ua.i(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, t9.a.f12693w, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
            int color = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
            this.f2684j1.m(context);
            this.f2684j1.q(ColorStateList.valueOf(color));
            this.f2684j1.p(dialog.getWindow().getDecorView().getElevation());
            return dialog;
        }
        R();
        throw null;
    }

    public final void R() {
        if (this.D.getParcelable("DATE_SELECTOR_KEY") == null) {
        } else {
            throw new ClassCastException();
        }
    }

    @Override // j1.r, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.P0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // j1.r, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.Q0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f7024g0;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // j1.r, j1.y
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.D;
        }
        this.R0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") == null) {
            this.T0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.V0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
                this.W0 = bundle.getCharSequence("TITLE_TEXT_KEY");
                this.Y0 = bundle.getInt("INPUT_MODE_KEY");
                this.Z0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
                this.f2676a1 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
                this.f2677b1 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.c1 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                this.f2678d1 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
                this.f2679e1 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
                this.f2680f1 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.f2681g1 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                CharSequence charSequence = this.W0;
                if (charSequence == null) {
                    charSequence = F().getResources().getText(this.V0);
                }
                this.f2686l1 = charSequence;
                if (charSequence != null) {
                    CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
                    if (split.length > 1) {
                        charSequence = split[0];
                    }
                } else {
                    charSequence = null;
                }
                this.f2687m1 = charSequence;
                return;
            }
            throw new ClassCastException();
        }
        throw new ClassCastException();
    }

    @Override // j1.y
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i6;
        String string;
        if (this.X0) {
            i6 = R.layout.mtrl_picker_fullscreen;
        } else {
            i6 = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i6, viewGroup);
        Context context = inflate.getContext();
        if (this.X0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(S(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(S(context), -1));
        }
        ((TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.f2683i1 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f2682h1 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f2683i1.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f2683i1;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, c9.a.f(context, R.drawable.material_ic_calendar_black_24dp));
        boolean z10 = false;
        stateListDrawable.addState(new int[0], c9.a.f(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.f2683i1;
        if (this.Y0 != 0) {
            z10 = true;
        }
        checkableImageButton2.setChecked(z10);
        q0.r(this.f2683i1, null);
        CheckableImageButton checkableImageButton3 = this.f2683i1;
        if (this.Y0 == 1) {
            string = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f2683i1.setContentDescription(string);
        this.f2683i1.setOnClickListener(new n(this, 0));
        R();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.android.material.datepicker.a] */
    @Override // j1.r, j1.y
    public final void y(Bundle bundle) {
        r rVar;
        r b10;
        super.y(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.R0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.T0;
        ?? obj = new Object();
        int i6 = a.f2649b;
        int i10 = a.f2649b;
        long j = bVar.f2651x.C;
        long j10 = bVar.f2652y.C;
        obj.f2650a = Long.valueOf(bVar.A.C);
        int i11 = bVar.B;
        d dVar = bVar.f2653z;
        m mVar = this.U0;
        if (mVar == null) {
            rVar = null;
        } else {
            rVar = mVar.C0;
        }
        if (rVar != null) {
            obj.f2650a = Long.valueOf(rVar.C);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dVar);
        r b11 = r.b(j);
        r b12 = r.b(j10);
        d dVar2 = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l10 = obj.f2650a;
        if (l10 == null) {
            b10 = null;
        } else {
            b10 = r.b(l10.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(b11, b12, dVar2, b10, i11));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.V0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.W0);
        bundle.putInt("INPUT_MODE_KEY", this.Y0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.Z0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f2676a1);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f2677b1);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.c1);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f2678d1);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f2679e1);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f2680f1);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f2681g1);
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [t0.s, com.google.android.material.datepicker.o, java.lang.Object] */
    @Override // j1.r, j1.y
    public final void z() {
        CharSequence charSequence;
        Integer num;
        boolean z10;
        int i6;
        int i10;
        boolean z11;
        a8.d x1Var;
        a8.d x1Var2;
        super.z();
        Window window = P().getWindow();
        if (this.X0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f2684j1);
            if (!this.f2685k1) {
                View findViewById = G().findViewById(R.id.fullscreen_header);
                ColorStateList g10 = a4.g(findViewById.getBackground());
                if (g10 != null) {
                    num = Integer.valueOf(g10.getDefaultColor());
                } else {
                    num = null;
                }
                boolean z12 = false;
                if (num != null && num.intValue() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                int n10 = jb.b.n(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z10) {
                    num = Integer.valueOf(n10);
                }
                a8.b.m(window, false);
                Context context = window.getContext();
                int i11 = Build.VERSION.SDK_INT;
                if (i11 < 23) {
                    i6 = l0.b.d(jb.b.n(context, android.R.attr.statusBarColor, -16777216), 128);
                } else {
                    i6 = 0;
                }
                Context context2 = window.getContext();
                if (i11 < 27) {
                    i10 = l0.b.d(jb.b.n(context2, android.R.attr.navigationBarColor, -16777216), 128);
                } else {
                    i10 = 0;
                }
                window.setStatusBarColor(i6);
                window.setNavigationBarColor(i10);
                boolean t10 = jb.b.t(num.intValue());
                if (!jb.b.t(i6) && (i6 != 0 || !t10)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                a2 a2Var = new a2(window.getDecorView());
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 35) {
                    x1Var = new t0.a2(window, a2Var);
                } else if (i12 >= 30) {
                    x1Var = new t0.a2(window, a2Var);
                } else if (i12 >= 26) {
                    x1Var = new x1(window, a2Var);
                } else if (i12 >= 23) {
                    x1Var = new x1(window, a2Var);
                } else {
                    x1Var = new x1(window, a2Var);
                }
                x1Var.j(z11);
                boolean t11 = jb.b.t(n10);
                if (jb.b.t(i10) || (i10 == 0 && t11)) {
                    z12 = true;
                }
                a2 a2Var2 = new a2(window.getDecorView());
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 35) {
                    x1Var2 = new t0.a2(window, a2Var2);
                } else if (i13 >= 30) {
                    x1Var2 = new t0.a2(window, a2Var2);
                } else if (i13 >= 26) {
                    x1Var2 = new x1(window, a2Var2);
                } else if (i13 >= 23) {
                    x1Var2 = new x1(window, a2Var2);
                } else {
                    x1Var2 = new x1(window, a2Var2);
                }
                x1Var2.i(z12);
                int paddingTop = findViewById.getPaddingTop();
                int paddingLeft = findViewById.getPaddingLeft();
                int paddingRight = findViewById.getPaddingRight();
                int i14 = findViewById.getLayoutParams().height;
                ?? obj = new Object();
                obj.f2673x = i14;
                obj.B = findViewById;
                obj.f2674y = paddingLeft;
                obj.f2675z = paddingTop;
                obj.A = paddingRight;
                WeakHashMap weakHashMap = q0.f12397a;
                h0.l(findViewById, obj);
                this.f2685k1 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = h().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f2684j1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ga.a(P(), rect));
        }
        F();
        int i15 = this.R0;
        if (i15 != 0) {
            R();
            b bVar = this.T0;
            m mVar = new m();
            Bundle bundle = new Bundle();
            bundle.putInt("THEME_RES_ID_KEY", i15);
            bundle.putParcelable("GRID_SELECTOR_KEY", null);
            bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
            bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
            bundle.putParcelable("CURRENT_MONTH_KEY", bVar.A);
            mVar.J(bundle);
            this.U0 = mVar;
            w wVar = mVar;
            if (this.Y0 == 1) {
                R();
                b bVar2 = this.T0;
                w qVar = new q();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i15);
                bundle2.putParcelable("DATE_SELECTOR_KEY", null);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
                qVar.J(bundle2);
                wVar = qVar;
            }
            this.S0 = wVar;
            TextView textView = this.f2682h1;
            if (this.Y0 == 1 && h().getConfiguration().orientation == 2) {
                charSequence = this.f2687m1;
            } else {
                charSequence = this.f2686l1;
            }
            textView.setText(charSequence);
            R();
            throw null;
        }
        R();
        throw null;
    }
}

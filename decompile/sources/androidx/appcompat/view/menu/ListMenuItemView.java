package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.playfy.tv.R;
import h.a;
import n9.j;
import o.l;
import o.n;
import o.y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements y, AbsListView.SelectionBoundsAdjuster {
    public TextView A;
    public CheckBox B;
    public TextView C;
    public ImageView D;
    public ImageView E;
    public LinearLayout F;
    public final Drawable G;
    public final int H;
    public final Context I;
    public boolean J;
    public final Drawable K;
    public final boolean L;
    public LayoutInflater M;
    public boolean N;

    /* renamed from: x, reason: collision with root package name */
    public n f745x;

    /* renamed from: y, reason: collision with root package name */
    public ImageView f746y;

    /* renamed from: z, reason: collision with root package name */
    public RadioButton f747z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j E = j.E(getContext(), attributeSet, a.s, R.attr.listMenuViewStyle);
        this.G = E.v(5);
        TypedArray typedArray = (TypedArray) E.f9356z;
        this.H = typedArray.getResourceId(1, -1);
        this.J = typedArray.getBoolean(7, false);
        this.I = context;
        this.K = E.v(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.L = obtainStyledAttributes.hasValue(0);
        E.G();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.M == null) {
            this.M = LayoutInflater.from(getContext());
        }
        return this.M;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        int i6;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (z10) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            imageView.setVisibility(i6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011d  */
    @Override // o.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(o.n r11) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.a(o.n):void");
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.E;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.E.getLayoutParams();
            rect.top = this.E.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    @Override // o.y
    public n getItemData() {
        return this.f745x;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.G);
        TextView textView = (TextView) findViewById(R.id.title);
        this.A = textView;
        int i6 = this.H;
        if (i6 != -1) {
            textView.setTextAppearance(this.I, i6);
        }
        this.C = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.D = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.K);
        }
        this.E = (ImageView) findViewById(R.id.group_divider);
        this.F = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        if (this.f746y != null && this.J) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f746y.getLayoutParams();
            int i11 = layoutParams.height;
            if (i11 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i11;
            }
        }
        super.onMeasure(i6, i10);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (z10 || this.f747z != null || this.B != null) {
            if ((this.f745x.f9822x & 4) != 0) {
                if (this.f747z == null) {
                    RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                    this.f747z = radioButton;
                    LinearLayout linearLayout = this.F;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.f747z;
                view = this.B;
            } else {
                if (this.B == null) {
                    CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                    this.B = checkBox;
                    LinearLayout linearLayout2 = this.F;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.B;
                view = this.f747z;
            }
            if (z10) {
                compoundButton.setChecked(this.f745x.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox2 = this.B;
            if (checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.f747z;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if ((this.f745x.f9822x & 4) != 0) {
            if (this.f747z == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f747z = radioButton;
                LinearLayout linearLayout = this.F;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f747z;
        } else {
            if (this.B == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.B = checkBox;
                LinearLayout linearLayout2 = this.F;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.B;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.N = z10;
        this.J = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        int i6;
        ImageView imageView = this.E;
        if (imageView != null) {
            if (!this.L && z10) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            imageView.setVisibility(i6);
        }
    }

    public void setIcon(Drawable drawable) {
        l lVar = this.f745x.f9813n;
        boolean z10 = this.N;
        if (z10 || this.J) {
            ImageView imageView = this.f746y;
            if (imageView != null || drawable != null || this.J) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                    this.f746y = imageView2;
                    LinearLayout linearLayout = this.F;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable == null && !this.J) {
                    this.f746y.setVisibility(8);
                    return;
                }
                ImageView imageView3 = this.f746y;
                if (!z10) {
                    drawable = null;
                }
                imageView3.setImageDrawable(drawable);
                if (this.f746y.getVisibility() != 0) {
                    this.f746y.setVisibility(0);
                }
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.A.setText(charSequence);
            if (this.A.getVisibility() != 0) {
                this.A.setVisibility(0);
                return;
            }
            return;
        }
        if (this.A.getVisibility() != 8) {
            this.A.setVisibility(8);
        }
    }
}

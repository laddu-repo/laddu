package i;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;
import p.x1;
import t0.q0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends d0 implements DialogInterface {
    public final f C;

    public h(ContextThemeWrapper contextThemeWrapper, int i6) {
        super(contextThemeWrapper, e(contextThemeWrapper, i6));
        this.C = new f(getContext(), this, getWindow());
    }

    public static int e(Context context, int i6) {
        if (((i6 >>> 24) & 255) >= 1) {
            return i6;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // i.d0, d.r, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean z10;
        int i6;
        boolean z11;
        int i10;
        boolean z12;
        ListAdapter listAdapter;
        int i11;
        View view;
        int i12;
        int i13;
        View findViewById;
        View findViewById2;
        super.onCreate(bundle);
        f fVar = this.C;
        fVar.f6178b.setContentView(fVar.D);
        Context context = fVar.f6177a;
        Window window = fVar.f6179c;
        View findViewById3 = window.findViewById(R.id.parentPanel);
        View findViewById4 = findViewById3.findViewById(R.id.topPanel);
        View findViewById5 = findViewById3.findViewById(R.id.contentPanel);
        View findViewById6 = findViewById3.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(R.id.customPanel);
        View view2 = fVar.f6183g;
        if (view2 == null) {
            view2 = null;
        }
        if (view2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !f.a(view2)) {
            window.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (fVar.f6187l) {
                frameLayout.setPadding(fVar.f6184h, fVar.f6185i, fVar.j, fVar.f6186k);
            }
            if (fVar.f6182f != null) {
                ((LinearLayout.LayoutParams) ((x1) viewGroup.getLayoutParams())).weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById7 = viewGroup.findViewById(R.id.topPanel);
        View findViewById8 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById9 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup c10 = f.c(findViewById7, findViewById4);
        ViewGroup c11 = f.c(findViewById8, findViewById5);
        ViewGroup c12 = f.c(findViewById9, findViewById6);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        fVar.f6196v = nestedScrollView;
        nestedScrollView.setFocusable(false);
        fVar.f6196v.setNestedScrollingEnabled(false);
        TextView textView = (TextView) c11.findViewById(android.R.id.message);
        fVar.f6200z = textView;
        if (textView != null) {
            String str = fVar.f6181e;
            if (str != null) {
                textView.setText(str);
            } else {
                textView.setVisibility(8);
                fVar.f6196v.removeView(fVar.f6200z);
                if (fVar.f6182f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) fVar.f6196v.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(fVar.f6196v);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(fVar.f6182f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    c11.setVisibility(8);
                }
            }
        }
        Button button = (Button) c12.findViewById(android.R.id.button1);
        fVar.f6188m = button;
        com.google.android.material.datepicker.l lVar = fVar.J;
        button.setOnClickListener(lVar);
        if (TextUtils.isEmpty(fVar.f6189n)) {
            fVar.f6188m.setVisibility(8);
            i6 = 0;
        } else {
            fVar.f6188m.setText(fVar.f6189n);
            fVar.f6188m.setVisibility(0);
            i6 = 1;
        }
        Button button2 = (Button) c12.findViewById(android.R.id.button2);
        fVar.f6191p = button2;
        button2.setOnClickListener(lVar);
        if (TextUtils.isEmpty(fVar.f6192q)) {
            fVar.f6191p.setVisibility(8);
        } else {
            fVar.f6191p.setText(fVar.f6192q);
            fVar.f6191p.setVisibility(0);
            i6 |= 2;
        }
        Button button3 = (Button) c12.findViewById(android.R.id.button3);
        fVar.s = button3;
        button3.setOnClickListener(lVar);
        if (TextUtils.isEmpty(fVar.f6194t)) {
            fVar.s.setVisibility(8);
        } else {
            fVar.s.setText(fVar.f6194t);
            fVar.s.setVisibility(0);
            i6 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i6 == 1) {
                Button button4 = fVar.f6188m;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i6 == 2) {
                Button button5 = fVar.f6191p;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i6 == 4) {
                Button button6 = fVar.s;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i6 == 0) {
            c12.setVisibility(8);
        }
        if (fVar.A != null) {
            c10.addView(fVar.A, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            fVar.f6198x = (ImageView) window.findViewById(android.R.id.icon);
            if (!TextUtils.isEmpty(fVar.f6180d) && fVar.H) {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                fVar.f6199y = textView2;
                textView2.setText(fVar.f6180d);
                Drawable drawable = fVar.f6197w;
                if (drawable != null) {
                    fVar.f6198x.setImageDrawable(drawable);
                } else {
                    fVar.f6199y.setPadding(fVar.f6198x.getPaddingLeft(), fVar.f6198x.getPaddingTop(), fVar.f6198x.getPaddingRight(), fVar.f6198x.getPaddingBottom());
                    fVar.f6198x.setVisibility(8);
                }
            } else {
                window.findViewById(R.id.title_template).setVisibility(8);
                fVar.f6198x.setVisibility(8);
                c10.setVisibility(8);
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c10 != null && c10.getVisibility() != 8) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (c12.getVisibility() != 8) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12 && (findViewById2 = c11.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (i10 != 0) {
            NestedScrollView nestedScrollView2 = fVar.f6196v;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (fVar.f6181e == null && fVar.f6182f == null) {
                findViewById = null;
            } else {
                findViewById = c10.findViewById(R.id.titleDividerNoCustom);
            }
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        } else {
            View findViewById10 = c11.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = fVar.f6182f;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z12 || i10 == 0) {
                int paddingLeft = alertController$RecycleListView.getPaddingLeft();
                if (i10 != 0) {
                    i12 = alertController$RecycleListView.getPaddingTop();
                } else {
                    i12 = alertController$RecycleListView.f741x;
                }
                int paddingRight = alertController$RecycleListView.getPaddingRight();
                if (z12) {
                    i13 = alertController$RecycleListView.getPaddingBottom();
                } else {
                    i13 = alertController$RecycleListView.f742y;
                }
                alertController$RecycleListView.setPadding(paddingLeft, i12, paddingRight, i13);
            }
        }
        if (!z11) {
            View view3 = fVar.f6182f;
            if (view3 == null) {
                view3 = fVar.f6196v;
            }
            if (view3 != null) {
                if (z12) {
                    i11 = 2;
                } else {
                    i11 = 0;
                }
                int i14 = i10 | i11;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 23) {
                    WeakHashMap weakHashMap = q0.f12397a;
                    if (i15 >= 23) {
                        t0.i0.b(view3, i14, 3);
                    }
                    if (findViewById11 != null) {
                        c11.removeView(findViewById11);
                    }
                    if (findViewById12 != null) {
                        c11.removeView(findViewById12);
                    }
                } else {
                    if (findViewById11 != null && (i14 & 1) == 0) {
                        c11.removeView(findViewById11);
                        findViewById11 = null;
                    }
                    if (findViewById12 != null && (i14 & 2) == 0) {
                        c11.removeView(findViewById12);
                        view = null;
                    } else {
                        view = findViewById12;
                    }
                    if (findViewById11 != null || view != null) {
                        if (fVar.f6181e != null) {
                            fVar.f6196v.setOnScrollChangeListener(new j4.b0(findViewById11, view));
                            fVar.f6196v.post(new a(fVar, findViewById11, view, 0));
                        } else {
                            AlertController$RecycleListView alertController$RecycleListView2 = fVar.f6182f;
                            if (alertController$RecycleListView2 != null) {
                                alertController$RecycleListView2.setOnScrollListener(new b(findViewById11, view));
                                fVar.f6182f.post(new a(fVar, findViewById11, view, 1));
                            } else {
                                if (findViewById11 != null) {
                                    c11.removeView(findViewById11);
                                }
                                if (view != null) {
                                    c11.removeView(view);
                                }
                            }
                        }
                    }
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView3 = fVar.f6182f;
        if (alertController$RecycleListView3 != null && (listAdapter = fVar.B) != null) {
            alertController$RecycleListView3.setAdapter(listAdapter);
            int i16 = fVar.C;
            if (i16 > -1) {
                alertController$RecycleListView3.setItemChecked(i16, true);
                alertController$RecycleListView3.setSelection(i16);
            }
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i6, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.C.f6196v;
        if (nestedScrollView != null && nestedScrollView.i(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i6, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i6, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.C.f6196v;
        if (nestedScrollView != null && nestedScrollView.i(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i6, keyEvent);
    }

    @Override // i.d0, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        f fVar = this.C;
        fVar.f6180d = charSequence;
        TextView textView = fVar.f6199y;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}

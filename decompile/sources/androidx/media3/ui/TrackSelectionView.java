package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.material.datepicker.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import k4.h0;
import k4.i0;
import k7.d;
import ld.o;
import r1.e1;
import r1.f1;
import r1.k1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {
    public final CheckedTextView A;
    public final l B;
    public final ArrayList C;
    public final HashMap D;
    public boolean E;
    public boolean F;
    public h0 G;
    public CheckedTextView[][] H;
    public boolean I;
    public o.a J;

    /* renamed from: x, reason: collision with root package name */
    public final int f1105x;

    /* renamed from: y, reason: collision with root package name */
    public final LayoutInflater f1106y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckedTextView f1107z;

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.f1105x = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.f1106y = from;
        l lVar = new l(this, 2);
        this.B = lVar;
        this.G = new d(getResources());
        this.C = new ArrayList();
        this.D = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f1107z = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(com.playfy.tv.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(lVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(com.playfy.tv.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.A = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(com.playfy.tv.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(lVar);
        addView(checkedTextView2);
    }

    public static HashMap a(Map map, ArrayList arrayList, boolean z10) {
        HashMap hashMap = new HashMap();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            f1 f1Var = (f1) map.get(((k1) arrayList.get(i6)).f11571b);
            if (f1Var != null && (z10 || hashMap.isEmpty())) {
                hashMap.put(f1Var.f11397a, f1Var);
            }
        }
        return hashMap;
    }

    public final void b() {
        boolean z10;
        this.f1107z.setChecked(this.I);
        boolean z11 = this.I;
        HashMap hashMap = this.D;
        if (!z11 && hashMap.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.A.setChecked(z10);
        for (int i6 = 0; i6 < this.H.length; i6++) {
            f1 f1Var = (f1) hashMap.get(((k1) this.C.get(i6)).f11571b);
            int i10 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.H[i6];
                if (i10 < checkedTextViewArr.length) {
                    if (f1Var != null) {
                        Object tag = checkedTextViewArr[i10].getTag();
                        tag.getClass();
                        this.H[i6][i10].setChecked(f1Var.f11398b.contains(Integer.valueOf(((i0) tag).f7645b)));
                    } else {
                        checkedTextViewArr[i10].setChecked(false);
                    }
                    i10++;
                }
            }
        }
    }

    public final void c() {
        boolean z10;
        boolean z11;
        int i6;
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.C;
        boolean isEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.A;
        CheckedTextView checkedTextView2 = this.f1107z;
        if (isEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.H = new CheckedTextView[arrayList.size()];
        if (this.F && arrayList.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            k1 k1Var = (k1) arrayList.get(i10);
            if (this.E && k1Var.f11572c) {
                z11 = true;
            } else {
                z11 = false;
            }
            CheckedTextView[][] checkedTextViewArr = this.H;
            int i11 = k1Var.f11570a;
            checkedTextViewArr[i10] = new CheckedTextView[i11];
            i0[] i0VarArr = new i0[i11];
            for (int i12 = 0; i12 < k1Var.f11570a; i12++) {
                i0VarArr[i12] = new i0(k1Var, i12);
            }
            for (int i13 = 0; i13 < i11; i13++) {
                LayoutInflater layoutInflater = this.f1106y;
                if (i13 == 0) {
                    addView(layoutInflater.inflate(com.playfy.tv.R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                if (!z11 && !z10) {
                    i6 = R.layout.simple_list_item_single_choice;
                } else {
                    i6 = R.layout.simple_list_item_multiple_choice;
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate(i6, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.f1105x);
                h0 h0Var = this.G;
                i0 i0Var = i0VarArr[i13];
                d dVar = (d) h0Var;
                checkedTextView3.setText(dVar.M(i0Var.f7644a.f11571b.f11389d[i0Var.f7645b]));
                checkedTextView3.setTag(i0VarArr[i13]);
                if (k1Var.a(i13)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.B);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.H[i10][i13] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        b();
    }

    public boolean getIsDisabled() {
        return this.I;
    }

    public Map<e1, f1> getOverrides() {
        return this.D;
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.E != z10) {
            this.E = z10;
            c();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.F != z10) {
            this.F = z10;
            if (!z10) {
                HashMap hashMap = this.D;
                if (hashMap.size() > 1) {
                    HashMap a10 = a(hashMap, this.C, false);
                    hashMap.clear();
                    hashMap.putAll(a10);
                }
            }
            c();
        }
    }

    public void setShowDisableOption(boolean z10) {
        int i6;
        if (z10) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        this.f1107z.setVisibility(i6);
    }

    public void setTrackNameProvider(h0 h0Var) {
        h0Var.getClass();
        this.G = h0Var;
        c();
    }
}

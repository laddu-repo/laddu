package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import t0.q0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: x, reason: collision with root package name */
    public final boolean f2648x;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        y.c(null);
        if (p.T(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.playfy.tv.R.id.cancel_button);
            setNextFocusRightId(com.playfy.tv.R.id.confirm_button);
        }
        this.f2648x = p.T(getContext(), com.playfy.tv.R.attr.nestedScrollable);
        q0.r(this, new h(2));
    }

    public final s a() {
        return (s) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (s) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((s) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        s sVar = (s) super.getAdapter();
        sVar.getClass();
        int max = Math.max(sVar.a(), getFirstVisiblePosition());
        int min = Math.min(sVar.c(), getLastVisiblePosition());
        sVar.getItem(max);
        sVar.getItem(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z10, int i6, Rect rect) {
        if (z10) {
            if (i6 == 33) {
                setSelection(((s) super.getAdapter()).c());
                return;
            } else if (i6 == 130) {
                setSelection(((s) super.getAdapter()).a());
                return;
            } else {
                super.onFocusChanged(true, i6, rect);
                return;
            }
        }
        super.onFocusChanged(false, i6, rect);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i6, KeyEvent keyEvent) {
        if (!super.onKeyDown(i6, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= ((s) super.getAdapter()).a() && selectedItemPosition <= ((s) super.getAdapter()).c())) {
            return true;
        }
        if (19 != i6) {
            return false;
        }
        setSelection(((s) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i6, int i10) {
        if (this.f2648x) {
            super.onMeasure(i6, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i6, i10);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i6) {
        if (i6 < ((s) super.getAdapter()).a()) {
            super.setSelection(((s) super.getAdapter()).a());
        } else {
            super.setSelection(i6);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (s) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof s) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), s.class.getCanonicalName()));
    }
}

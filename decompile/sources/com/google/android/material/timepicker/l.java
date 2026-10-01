package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l implements View.OnTouchListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ GestureDetector f2818x;

    public l(GestureDetector gestureDetector) {
        this.f2818x = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f2818x.onTouchEvent(motionEvent);
        }
        return false;
    }
}

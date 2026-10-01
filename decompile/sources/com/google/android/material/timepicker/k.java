package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TimePickerView f2817x;

    public k(TimePickerView timePickerView) {
        this.f2817x = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int i6 = TimePickerView.O;
        this.f2817x.getClass();
        return false;
    }
}

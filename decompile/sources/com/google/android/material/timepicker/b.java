package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2812x;

    public b(ClockFaceView clockFaceView) {
        this.f2812x = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f2812x;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.Q.A) - clockFaceView.f2801b0;
        if (height != clockFaceView.O) {
            clockFaceView.O = height;
            clockFaceView.m();
            ClockHandView clockHandView = clockFaceView.Q;
            clockHandView.I = clockFaceView.O;
            clockHandView.invalidate();
        }
        return true;
    }
}

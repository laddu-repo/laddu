package com.google.android.material.timepicker;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.playfy.tv.R;
import u5.r;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends t0.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2813d;

    public c(ClockFaceView clockFaceView) {
        this.f2813d = clockFaceView;
    }

    @Override // t0.b
    public final void d(View view, u0.c cVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f12745a;
        this.f12323a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            View view2 = (View) this.f2813d.U.get(intValue - 1);
            if (Build.VERSION.SDK_INT >= 22) {
                accessibilityNodeInfo.setTraversalAfter(view2);
            }
        }
        cVar.j(r.w(0, 1, intValue, 1, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        cVar.b(u0.b.f12733e);
    }

    @Override // t0.b
    public final boolean g(View view, int i6, Bundle bundle) {
        if (i6 == 16) {
            long uptimeMillis = SystemClock.uptimeMillis();
            ClockFaceView clockFaceView = this.f2813d;
            view.getHitRect(clockFaceView.R);
            float centerX = clockFaceView.R.centerX();
            float centerY = clockFaceView.R.centerY();
            clockFaceView.Q.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            clockFaceView.Q.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
        return super.g(view, i6, bundle);
    }
}

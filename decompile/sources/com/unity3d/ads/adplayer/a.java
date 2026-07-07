package com.unity3d.ads.adplayer;

import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import bf.o;
import com.playfy.tv.activities.PlayerActivity;
import kotlin.jvm.internal.s;
import za.i;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnTouchListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f3382x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f3383y;

    public /* synthetic */ a(Object obj, int i6) {
        this.f3382x = i6;
        this.f3383y = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i6 = this.f3382x;
        Object obj = this.f3383y;
        switch (i6) {
            case 0:
                return AndroidWebViewContainer.a((AndroidWebViewContainer) obj, view, motionEvent);
            case 1:
                o[] oVarArr = PlayerActivity.V;
                return ((GestureDetector) obj).onTouchEvent(motionEvent);
            case 2:
                s sVar = (s) obj;
                if (motionEvent.getAction() == 0) {
                    sVar.f8051x = true;
                }
                return false;
            default:
                i iVar = (i) obj;
                if (motionEvent.getAction() == 1) {
                    long uptimeMillis = SystemClock.uptimeMillis() - iVar.f15259o;
                    if (uptimeMillis < 0 || uptimeMillis > 300) {
                        iVar.f15257m = false;
                    }
                    iVar.t();
                    iVar.f15257m = true;
                    iVar.f15259o = SystemClock.uptimeMillis();
                }
                return false;
        }
    }
}

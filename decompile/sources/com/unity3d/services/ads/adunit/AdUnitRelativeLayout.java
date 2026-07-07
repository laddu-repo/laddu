package com.unity3d.services.ads.adunit;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class AdUnitRelativeLayout extends RelativeLayout {
    private InputEvent _lastInputEvent;
    private int _maxEvents;
    private final ArrayList<AdUnitMotionEvent> _motionEvents;
    private boolean _shouldCapture;

    public AdUnitRelativeLayout(Context context) {
        super(context);
        this._motionEvents = new ArrayList<>();
        this._maxEvents = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
        this._shouldCapture = false;
    }

    public void clearCapture() {
        synchronized (this._motionEvents) {
            this._motionEvents.clear();
        }
    }

    public void endCapture() {
        this._shouldCapture = false;
    }

    public int getCurrentEventCount() {
        int size;
        synchronized (this._motionEvents) {
            size = this._motionEvents.size();
        }
        return size;
    }

    public SparseIntArray getEventCount(ArrayList<Integer> arrayList) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        synchronized (this._motionEvents) {
            try {
                ArrayList<AdUnitMotionEvent> arrayList2 = this._motionEvents;
                int size = arrayList2.size();
                int i6 = 0;
                while (i6 < size) {
                    AdUnitMotionEvent adUnitMotionEvent = arrayList2.get(i6);
                    i6++;
                    AdUnitMotionEvent adUnitMotionEvent2 = adUnitMotionEvent;
                    int size2 = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            Integer num = arrayList.get(i10);
                            i10++;
                            Integer num2 = num;
                            if (adUnitMotionEvent2.getAction() == num2.intValue()) {
                                sparseIntArray.put(num2.intValue(), sparseIntArray.get(num2.intValue(), 0) + 1);
                                break;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sparseIntArray;
    }

    public SparseArray<SparseArray<AdUnitMotionEvent>> getEvents(SparseArray<ArrayList<Integer>> sparseArray) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseArray<SparseArray<AdUnitMotionEvent>> sparseArray2 = new SparseArray<>();
        synchronized (this._motionEvents) {
            try {
                ArrayList<AdUnitMotionEvent> arrayList = this._motionEvents;
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    AdUnitMotionEvent adUnitMotionEvent = arrayList.get(i6);
                    i6++;
                    AdUnitMotionEvent adUnitMotionEvent2 = adUnitMotionEvent;
                    ArrayList<Integer> arrayList2 = sparseArray.get(adUnitMotionEvent2.getAction());
                    if (arrayList2 != null) {
                        int intValue = arrayList2.get(0).intValue();
                        if (sparseIntArray.get(adUnitMotionEvent2.getAction(), 0) == intValue) {
                            if (sparseArray2.get(adUnitMotionEvent2.getAction()) == null) {
                                sparseArray2.put(adUnitMotionEvent2.getAction(), new SparseArray<>());
                            }
                            sparseArray2.get(adUnitMotionEvent2.getAction()).put(intValue, adUnitMotionEvent2);
                            arrayList2.remove(0);
                        }
                        sparseIntArray.put(adUnitMotionEvent2.getAction(), sparseIntArray.get(adUnitMotionEvent2.getAction()) + 1);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sparseArray2;
    }

    public InputEvent getLastInputEvent() {
        return this._lastInputEvent;
    }

    public int getMaxEventCount() {
        return this._maxEvents;
    }

    @Override // android.view.ViewGroup
    @TargetApi(14)
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 6 || motionEvent.getActionMasked() == 5) {
            this._lastInputEvent = motionEvent;
        }
        if (this._shouldCapture && this._motionEvents.size() < this._maxEvents) {
            if ((motionEvent.getFlags() & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            synchronized (this._motionEvents) {
                this._motionEvents.add(new AdUnitMotionEvent(motionEvent.getActionMasked(), z10, motionEvent.getToolType(0), motionEvent.getSource(), motionEvent.getDeviceId(), motionEvent.getX(0), motionEvent.getY(0), motionEvent.getEventTime(), motionEvent.getPressure(0), motionEvent.getSize(0)));
            }
        }
        return false;
    }

    public void startCapture(int i6) {
        this._maxEvents = i6;
        this._shouldCapture = true;
    }
}

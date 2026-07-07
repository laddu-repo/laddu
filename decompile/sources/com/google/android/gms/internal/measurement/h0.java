package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class h0 extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Looper looper, int i6) {
        super(looper);
        switch (i6) {
            case 1:
                super(looper);
                Looper.getMainLooper();
                return;
            case 2:
            default:
                Looper.getMainLooper();
                return;
            case 3:
                super(looper);
                Looper.getMainLooper();
                return;
        }
    }
}

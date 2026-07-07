package com.google.android.gms.internal.measurement;

import android.os.Build;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2203a;

    static {
        int i6;
        if (Build.VERSION.SDK_INT >= 31) {
            i6 = 33554432;
        } else {
            i6 = 0;
        }
        f2203a = i6;
    }
}

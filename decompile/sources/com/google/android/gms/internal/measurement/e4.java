package com.google.android.gms.internal.measurement;

import android.os.Build;
import android.os.UserManager;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class e4 {

    /* renamed from: a, reason: collision with root package name */
    public static UserManager f2196a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f2197b = !a();

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }
}

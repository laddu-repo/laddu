package com.playfy.tv.helpers;

import android.content.Context;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class NintyMin {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3373a = 0;

    static {
        System.loadLibrary("native-lib");
        System.loadLibrary("umairi-lib");
    }

    public static final native String ohMyNo(String str, Context context);

    public static final native String ohMyYes(String str, String str2, Context context);
}

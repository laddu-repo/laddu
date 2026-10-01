package com.livxow.tv.utils;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class DataHelper {
    static {
        System.loadLibrary("native-lib");
    }

    public static native byte[] MyApp(Context context, String str);
}

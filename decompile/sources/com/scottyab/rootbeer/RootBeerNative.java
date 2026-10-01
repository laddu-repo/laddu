package com.scottyab.rootbeer;

import com.bumptech.glide.c;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class RootBeerNative {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f3697a;

    static {
        try {
            System.loadLibrary("toolChecker");
            f3697a = true;
        } catch (UnsatisfiedLinkError e7) {
            c.k(e7);
        }
    }

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z2);
}

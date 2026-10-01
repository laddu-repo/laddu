package com.bumptech.glide.load;

import a6.d;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(0),
    JPEG(1),
    RAW(2),
    PNG_A(3),
    PNG(4),
    WEBP_A(5),
    WEBP(6),
    ANIMATED_WEBP(7),
    AVIF(8),
    ANIMATED_AVIF(9),
    UNKNOWN(10);


    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f2376v;

    ImageHeaderParser$ImageType(int i) {
        this.f2376v = z;
    }

    public boolean hasAlpha() {
        return this.f2376v;
    }

    public boolean isWebp() {
        int i = d.f154a[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}

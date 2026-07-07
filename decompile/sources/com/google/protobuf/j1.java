package com.google.protobuf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f2955a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f2956b;

    static {
        int[] iArr = new int[JavaType.values().length];
        f2956b = iArr;
        try {
            iArr[JavaType.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f2956b[JavaType.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f2956b[JavaType.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[k1.values().length];
        f2955a = iArr2;
        try {
            iArr2[3] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f2955a[1] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f2955a[0] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}

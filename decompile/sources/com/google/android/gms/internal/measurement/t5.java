package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class t5 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f2444a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f2445b;

    static {
        Charset.forName("US-ASCII");
        f2444a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f2445b = bArr;
        ByteBuffer.wrap(bArr);
    }
}

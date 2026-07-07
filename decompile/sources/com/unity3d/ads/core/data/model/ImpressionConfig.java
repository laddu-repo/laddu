package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ImpressionConfig {
    private final String data;

    private /* synthetic */ ImpressionConfig(String str) {
        this.data = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImpressionConfig m46boximpl(String str) {
        return new ImpressionConfig(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m47constructorimpl(String data) {
        k.e(data, "data");
        return data;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m48equalsimpl(String str, Object obj) {
        if (!(obj instanceof ImpressionConfig) || !k.a(str, ((ImpressionConfig) obj).m52unboximpl())) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m49equalsimpl0(String str, String str2) {
        return k.a(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m50hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m51toStringimpl(String str) {
        return w8.k.b(')', "ImpressionConfig(data=", str);
    }

    public boolean equals(Object obj) {
        return m48equalsimpl(this.data, obj);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m50hashCodeimpl(this.data);
    }

    public String toString() {
        return m51toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m52unboximpl() {
        return this.data;
    }
}

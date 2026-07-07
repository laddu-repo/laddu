package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AdDataRefreshToken {
    private final String data;

    private /* synthetic */ AdDataRefreshToken(String str) {
        this.data = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AdDataRefreshToken m39boximpl(String str) {
        return new AdDataRefreshToken(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m40constructorimpl(String data) {
        k.e(data, "data");
        return data;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m41equalsimpl(String str, Object obj) {
        if (!(obj instanceof AdDataRefreshToken) || !k.a(str, ((AdDataRefreshToken) obj).m45unboximpl())) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m42equalsimpl0(String str, String str2) {
        return k.a(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m43hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m44toStringimpl(String str) {
        return w8.k.b(')', "AdDataRefreshToken(data=", str);
    }

    public boolean equals(Object obj) {
        return m41equalsimpl(this.data, obj);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m43hashCodeimpl(this.data);
    }

    public String toString() {
        return m44toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m45unboximpl() {
        return this.data;
    }
}

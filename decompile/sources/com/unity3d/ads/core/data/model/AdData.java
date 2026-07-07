package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AdData {
    private final String data;

    private /* synthetic */ AdData(String str) {
        this.data = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AdData m32boximpl(String str) {
        return new AdData(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m33constructorimpl(String data) {
        k.e(data, "data");
        return data;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m34equalsimpl(String str, Object obj) {
        if (!(obj instanceof AdData) || !k.a(str, ((AdData) obj).m38unboximpl())) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m35equalsimpl0(String str, String str2) {
        return k.a(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m36hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m37toStringimpl(String str) {
        return w8.k.b(')', "AdData(data=", str);
    }

    public boolean equals(Object obj) {
        return m34equalsimpl(this.data, obj);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m36hashCodeimpl(this.data);
    }

    public String toString() {
        return m37toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m38unboximpl() {
        return this.data;
    }
}

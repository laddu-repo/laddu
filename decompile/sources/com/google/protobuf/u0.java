package com.google.protobuf;

import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3056a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3057b;

    public u0(int i6, MessageLite messageLite) {
        this.f3056a = messageLite;
        this.f3057b = i6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (this.f3056a != u0Var.f3056a || this.f3057b != u0Var.f3057b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f3056a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f3057b;
    }
}

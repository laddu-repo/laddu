package com.google.android.gms.internal.measurement;

import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q6 implements Map.Entry, Comparable {

    /* renamed from: x, reason: collision with root package name */
    public final Comparable f2398x;

    /* renamed from: y, reason: collision with root package name */
    public Object f2399y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ p6 f2400z;

    public q6(p6 p6Var, Comparable comparable, Object obj) {
        this.f2400z = p6Var;
        this.f2398x = comparable;
        this.f2399y = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f2398x.compareTo(((q6) obj).f2398x);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f2398x;
                if (comparable == null) {
                    if (key != null) {
                        equals = false;
                    } else {
                        equals = true;
                    }
                } else {
                    equals = comparable.equals(key);
                }
                if (equals) {
                    Object obj2 = this.f2399y;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        if (value != null) {
                            equals2 = false;
                        } else {
                            equals2 = true;
                        }
                    } else {
                        equals2 = obj2.equals(value);
                    }
                    if (equals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f2398x;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2399y;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i6 = 0;
        Comparable comparable = this.f2398x;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f2399y;
        if (obj != null) {
            i6 = obj.hashCode();
        }
        return i6 ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f2400z.f();
        Object obj2 = this.f2399y;
        this.f2399y = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2398x);
        String valueOf2 = String.valueOf(this.f2399y);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append("=");
        sb2.append(valueOf2);
        return sb2.toString();
    }
}

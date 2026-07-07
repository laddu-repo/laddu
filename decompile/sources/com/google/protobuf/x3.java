package com.google.protobuf;

import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x3 implements Map.Entry, Comparable {

    /* renamed from: x, reason: collision with root package name */
    public final Comparable f3108x;

    /* renamed from: y, reason: collision with root package name */
    public Object f3109y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ s3 f3110z;

    public x3(s3 s3Var, Comparable comparable, Object obj) {
        this.f3110z = s3Var;
        this.f3108x = comparable;
        this.f3109y = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3108x.compareTo(((x3) obj).f3108x);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f3108x;
                if (comparable == null) {
                    if (key == null) {
                        equals = true;
                    } else {
                        equals = false;
                    }
                } else {
                    equals = comparable.equals(key);
                }
                if (equals) {
                    Object obj2 = this.f3109y;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        if (value == null) {
                            equals2 = true;
                        } else {
                            equals2 = false;
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
    public final Object getKey() {
        return this.f3108x;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3109y;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i6 = 0;
        Comparable comparable = this.f3108x;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f3109y;
        if (obj != null) {
            i6 = obj.hashCode();
        }
        return i6 ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f3110z.b();
        Object obj2 = this.f3109y;
        this.f3109y = obj;
        return obj2;
    }

    public final String toString() {
        return this.f3108x + "=" + this.f3109y;
    }
}

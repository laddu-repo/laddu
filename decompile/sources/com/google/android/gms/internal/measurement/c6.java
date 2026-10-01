package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c6 extends LinkedHashMap {

    /* renamed from: y, reason: collision with root package name */
    public static final c6 f2169y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2170x = true;

    static {
        c6 c6Var = new c6();
        f2169y = c6Var;
        c6Var.f2170x = false;
    }

    public static int b(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            Charset charset = t5.f2444a;
            int i6 = length;
            for (byte b10 : bArr) {
                i6 = (i6 * 31) + b10;
            }
            if (i6 == 0) {
                return 1;
            }
            return i6;
        }
        if (!(obj instanceof o5)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.LinkedHashMap, com.google.android.gms.internal.measurement.c6] */
    public final c6 a() {
        if (isEmpty()) {
            return new c6();
        }
        ?? linkedHashMap = new LinkedHashMap(this);
        linkedHashMap.f2170x = true;
        return linkedHashMap;
    }

    public final void c() {
        if (this.f2170x) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            Object value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                            } else {
                                equals = value.equals(obj2);
                            }
                            if (!equals) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i6 = 0;
        for (Map.Entry entry : entrySet()) {
            i6 += b(entry.getValue()) ^ b(entry.getKey());
        }
        return i6;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        Charset charset = t5.f2444a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        c();
        for (Object obj : map.keySet()) {
            Charset charset = t5.f2444a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        c();
        return super.remove(obj);
    }
}

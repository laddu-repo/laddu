package com.google.android.gms.internal.measurement;

import java.util.HashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final db.p0 f2150d = db.p0.j(3, "_syn", "_err", "_el");

    /* renamed from: a, reason: collision with root package name */
    public String f2151a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2152b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2153c;

    public b(String str, long j, HashMap hashMap) {
        this.f2151a = str;
        this.f2152b = j;
        HashMap hashMap2 = new HashMap();
        this.f2153c = hashMap2;
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
    }

    public static Object b(Object obj, Object obj2, String str) {
        if (f2150d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (obj instanceof String) {
                return obj2;
            }
            if (obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        return new b(this.f2151a, this.f2152b, new HashMap(this.f2153c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f2152b != bVar.f2152b || !this.f2151a.equals(bVar.f2151a)) {
                return false;
            }
            return this.f2153c.equals(bVar.f2153c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f2151a.hashCode() * 31;
        long j = this.f2152b;
        return this.f2153c.hashCode() + ((hashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f2151a;
        String obj = this.f2153c.toString();
        int length = String.valueOf(str).length();
        long j = this.f2152b;
        StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(j).length() + 9 + obj.length() + 1);
        sb2.append("Event{name='");
        sb2.append(str);
        sb2.append("', timestamp=");
        sb2.append(j);
        sb2.append(", params=");
        sb2.append(obj);
        sb2.append("}");
        return sb2.toString();
    }
}

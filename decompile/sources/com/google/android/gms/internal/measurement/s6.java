package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class s6 extends AbstractSet {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2415x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Map f2416y;

    public /* synthetic */ s6(Map map, int i6) {
        this.f2415x = i6;
        this.f2416y = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f2415x) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    ((p6) this.f2416y).put((Comparable) entry.getKey(), entry.getValue());
                    return true;
                }
                return false;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    ((com.google.protobuf.s3) this.f2416y).put((Comparable) entry2.getKey(), entry2.getValue());
                    return true;
                }
                return false;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f2415x) {
            case 0:
                ((p6) this.f2416y).clear();
                return;
            case 1:
                ((com.google.protobuf.s3) this.f2416y).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f2415x) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((p6) this.f2416y).get(entry.getKey());
                Object value = entry.getValue();
                if (obj2 == value) {
                    return true;
                }
                if (obj2 != null && obj2.equals(value)) {
                    return true;
                }
                return false;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((com.google.protobuf.s3) this.f2416y).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj3 != value2 && (obj3 == null || !obj3.equals(value2))) {
                    return false;
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f2415x) {
            case 0:
                return new r6((p6) this.f2416y);
            case 1:
                return new r6((com.google.protobuf.s3) this.f2416y);
            default:
                return new v.c((v.e) this.f2416y);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f2415x) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    ((p6) this.f2416y).remove(entry.getKey());
                    return true;
                }
                return false;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    ((com.google.protobuf.s3) this.f2416y).remove(entry2.getKey());
                    return true;
                }
                return false;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f2415x) {
            case 0:
                return ((p6) this.f2416y).size();
            case 1:
                return ((com.google.protobuf.s3) this.f2416y).size();
            default:
                return ((v.e) this.f2416y).f13174z;
        }
    }
}

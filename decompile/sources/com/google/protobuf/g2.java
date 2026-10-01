package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g2 extends i2 {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f2924c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(long j, Object obj, int i6) {
        List arrayList;
        List list = (List) q4.f3024c.m(j, obj);
        if (list.isEmpty()) {
            if (list instanceof LazyStringList) {
                arrayList = new LazyStringArrayList(i6);
            } else if ((list instanceof h3) && (list instanceof Internal.ProtobufList)) {
                arrayList = ((Internal.ProtobufList) list).mutableCopyWithCapacity(i6);
            } else {
                arrayList = new ArrayList(i6);
            }
            q4.s(j, obj, arrayList);
            return arrayList;
        }
        if (f2924c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i6);
            arrayList2.addAll(list);
            q4.s(j, obj, arrayList2);
            return arrayList2;
        }
        if (list instanceof UnmodifiableLazyStringList) {
            LazyStringArrayList lazyStringArrayList = new LazyStringArrayList(list.size() + i6);
            lazyStringArrayList.addAll((UnmodifiableLazyStringList) list);
            q4.s(j, obj, lazyStringArrayList);
            return lazyStringArrayList;
        }
        if ((list instanceof h3) && (list instanceof Internal.ProtobufList)) {
            Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
            if (!protobufList.isModifiable()) {
                Internal.ProtobufList mutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(list.size() + i6);
                q4.s(j, obj, mutableCopyWithCapacity);
                return mutableCopyWithCapacity;
            }
        }
        return list;
    }

    @Override // com.google.protobuf.i2
    public final void a(long j, Object obj) {
        Object unmodifiableList;
        List list = (List) q4.f3024c.m(j, obj);
        if (list instanceof LazyStringList) {
            unmodifiableList = ((LazyStringList) list).getUnmodifiableView();
        } else if (!f2924c.isAssignableFrom(list.getClass())) {
            if ((list instanceof h3) && (list instanceof Internal.ProtobufList)) {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                if (protobufList.isModifiable()) {
                    protobufList.makeImmutable();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        } else {
            return;
        }
        q4.s(j, obj, unmodifiableList);
    }

    @Override // com.google.protobuf.i2
    public final void b(long j, Object obj, Object obj2) {
        List list = (List) q4.f3024c.m(j, obj2);
        List d10 = d(j, obj, list.size());
        int size = d10.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d10.addAll(list);
        }
        if (size > 0) {
            list = d10;
        }
        q4.s(j, obj, list);
    }

    @Override // com.google.protobuf.i2
    public final List c(long j, Object obj) {
        return d(j, obj, 10);
    }
}

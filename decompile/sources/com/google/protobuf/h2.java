package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h2 extends i2 {
    @Override // com.google.protobuf.i2
    public final void a(long j, Object obj) {
        ((Internal.ProtobufList) q4.f3024c.m(j, obj)).makeImmutable();
    }

    @Override // com.google.protobuf.i2
    public final void b(long j, Object obj, Object obj2) {
        p4 p4Var = q4.f3024c;
        Internal.ProtobufList protobufList = (Internal.ProtobufList) p4Var.m(j, obj);
        Internal.ProtobufList protobufList2 = (Internal.ProtobufList) p4Var.m(j, obj2);
        int size = protobufList.size();
        int size2 = protobufList2.size();
        if (size > 0 && size2 > 0) {
            if (!protobufList.isModifiable()) {
                protobufList = protobufList.mutableCopyWithCapacity(size2 + size);
            }
            protobufList.addAll(protobufList2);
        }
        if (size > 0) {
            protobufList2 = protobufList;
        }
        q4.s(j, obj, protobufList2);
    }

    @Override // com.google.protobuf.i2
    public final List c(long j, Object obj) {
        int i6;
        Internal.ProtobufList protobufList = (Internal.ProtobufList) q4.f3024c.m(j, obj);
        if (!protobufList.isModifiable()) {
            int size = protobufList.size();
            if (size == 0) {
                i6 = 10;
            } else {
                i6 = size * 2;
            }
            Internal.ProtobufList mutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(i6);
            q4.s(j, obj, mutableCopyWithCapacity);
            return mutableCopyWithCapacity;
        }
        return protobufList;
    }
}

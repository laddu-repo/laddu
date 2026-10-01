package com.google.protobuf;

import com.google.protobuf.Field;
import com.google.protobuf.Internal;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b1 implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final b1 f2871a = new Object();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i6) {
        if (Field.Cardinality.forNumber(i6) != null) {
            return true;
        }
        return false;
    }
}

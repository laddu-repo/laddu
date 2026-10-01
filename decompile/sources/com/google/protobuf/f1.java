package com.google.protobuf;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f1 implements Comparable {
    public final java.lang.reflect.Field A;
    public final int B;
    public final boolean C;
    public final boolean D;
    public final java.lang.reflect.Field E;
    public final Object F;
    public final Internal.EnumVerifier G;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.reflect.Field f2910x;

    /* renamed from: y, reason: collision with root package name */
    public final FieldType f2911y;

    /* renamed from: z, reason: collision with root package name */
    public final int f2912z;

    public f1(java.lang.reflect.Field field, int i6, FieldType fieldType, java.lang.reflect.Field field2, int i10, boolean z10, boolean z11, Object obj, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field3) {
        this.f2910x = field;
        this.f2911y = fieldType;
        this.f2912z = i6;
        this.A = field2;
        this.B = i10;
        this.C = z10;
        this.D = z11;
        this.F = obj;
        this.G = enumVerifier;
        this.E = field3;
    }

    public static void a(int i6) {
        if (i6 > 0) {
        } else {
            throw new IllegalArgumentException(h8.c.i(i6, "fieldNumber must be positive: "));
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2912z - ((f1) obj).f2912z;
    }
}

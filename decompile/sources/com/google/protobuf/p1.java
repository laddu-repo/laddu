package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p1 implements FieldSet$FieldDescriptorLite {
    public final boolean A;
    public final boolean B;

    /* renamed from: x, reason: collision with root package name */
    public final Internal.EnumLiteMap f3009x;

    /* renamed from: y, reason: collision with root package name */
    public final int f3010y;

    /* renamed from: z, reason: collision with root package name */
    public final WireFormat.FieldType f3011z;

    public p1(Internal.EnumLiteMap enumLiteMap, int i6, WireFormat.FieldType fieldType, boolean z10, boolean z11) {
        this.f3009x = enumLiteMap;
        this.f3010y = i6;
        this.f3011z = fieldType;
        this.A = z10;
        this.B = z11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3010y - ((p1) obj).f3010y;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final Internal.EnumLiteMap getEnumType() {
        return this.f3009x;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final WireFormat.JavaType getLiteJavaType() {
        return this.f3011z.getJavaType();
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final WireFormat.FieldType getLiteType() {
        return this.f3011z;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final int getNumber() {
        return this.f3010y;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite) {
        return ((GeneratedMessageLite.Builder) builder).mergeFrom((GeneratedMessageLite.Builder) messageLite);
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final boolean isPacked() {
        return this.B;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final boolean isRepeated() {
        return this.A;
    }
}

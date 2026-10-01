package com.google.protobuf;

import com.google.protobuf.FieldSet$FieldDescriptorLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface FieldSet$FieldDescriptorLite<T extends FieldSet$FieldDescriptorLite<T>> extends Comparable<T> {
    Internal.EnumLiteMap<?> getEnumType();

    WireFormat.JavaType getLiteJavaType();

    WireFormat.FieldType getLiteType();

    int getNumber();

    MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite);

    boolean isPacked();

    boolean isRepeated();
}

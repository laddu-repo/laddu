package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface Parser<MessageType> {
    MessageType parseDelimitedFrom(InputStream inputStream);

    MessageType parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite);

    MessageType parseFrom(ByteString byteString);

    MessageType parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite);

    MessageType parseFrom(CodedInputStream codedInputStream);

    MessageType parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    MessageType parseFrom(InputStream inputStream);

    MessageType parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite);

    MessageType parseFrom(ByteBuffer byteBuffer);

    MessageType parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite);

    MessageType parseFrom(byte[] bArr);

    MessageType parseFrom(byte[] bArr, int i6, int i10);

    MessageType parseFrom(byte[] bArr, int i6, int i10, ExtensionRegistryLite extensionRegistryLite);

    MessageType parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite);

    MessageType parsePartialDelimitedFrom(InputStream inputStream);

    MessageType parsePartialDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite);

    MessageType parsePartialFrom(ByteString byteString);

    MessageType parsePartialFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite);

    MessageType parsePartialFrom(CodedInputStream codedInputStream);

    MessageType parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

    MessageType parsePartialFrom(InputStream inputStream);

    MessageType parsePartialFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite);

    MessageType parsePartialFrom(byte[] bArr);

    MessageType parsePartialFrom(byte[] bArr, int i6, int i10);

    MessageType parsePartialFrom(byte[] bArr, int i6, int i10, ExtensionRegistryLite extensionRegistryLite);

    MessageType parsePartialFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite);
}

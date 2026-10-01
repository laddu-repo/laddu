package com.google.protobuf;

import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.util.AbstractMap;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class MapEntryLite<K, V> {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final K key;
    private final p2 metadata;
    private final V value;

    private MapEntryLite(WireFormat.FieldType fieldType, K k8, WireFormat.FieldType fieldType2, V v10) {
        this.metadata = new p2(fieldType, k8, fieldType2, v10);
        this.key = k8;
        this.value = v10;
    }

    public static <K, V> int computeSerializedSize(p2 p2Var, K k8, V v10) {
        return i1.c(p2Var.f3014c, 2, v10) + i1.c(p2Var.f3012a, 1, k8);
    }

    public static <K, V> MapEntryLite<K, V> newDefaultInstance(WireFormat.FieldType fieldType, K k8, WireFormat.FieldType fieldType2, V v10) {
        return new MapEntryLite<>(fieldType, k8, fieldType2, v10);
    }

    public static <T> T parseField(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, WireFormat.FieldType fieldType, T t10) {
        int i6 = o2.f3002a[fieldType.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    i1 i1Var = i1.f2935d;
                    return (T) WireFormat.readPrimitiveField(codedInputStream, fieldType, d5.f2896y);
                }
                throw new RuntimeException("Groups are not allowed in maps.");
            }
            return (T) Integer.valueOf(codedInputStream.readEnum());
        }
        MessageLite.Builder builder = ((MessageLite) t10).toBuilder();
        codedInputStream.readMessage(builder, extensionRegistryLite);
        return (T) builder.buildPartial();
    }

    public static <K, V> void writeTo(CodedOutputStream codedOutputStream, p2 p2Var, K k8, V v10) {
        i1.r(codedOutputStream, p2Var.f3012a, 1, k8);
        i1.r(codedOutputStream, p2Var.f3014c, 2, v10);
    }

    public int computeMessageSize(int i6, K k8, V v10) {
        return CodedOutputStream.computeLengthDelimitedFieldSize(computeSerializedSize(this.metadata, k8, v10)) + CodedOutputStream.computeTagSize(i6);
    }

    public K getKey() {
        return this.key;
    }

    public p2 getMetadata() {
        return this.metadata;
    }

    public V getValue() {
        return this.value;
    }

    public Map.Entry<K, V> parseEntry(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return parseEntry(byteString.newCodedInput(), this.metadata, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parseInto(MapFieldLite<K, V> mapFieldLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
        p2 p2Var = this.metadata;
        Object obj = p2Var.f3013b;
        Object obj2 = p2Var.f3015d;
        while (true) {
            int readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == WireFormat.makeTag(1, this.metadata.f3012a.getWireType())) {
                obj = parseField(codedInputStream, extensionRegistryLite, this.metadata.f3012a, obj);
            } else if (readTag == WireFormat.makeTag(2, this.metadata.f3014c.getWireType())) {
                obj2 = parseField(codedInputStream, extensionRegistryLite, this.metadata.f3014c, obj2);
            } else if (!codedInputStream.skipField(readTag)) {
                break;
            }
        }
        codedInputStream.checkLastTagWas(0);
        codedInputStream.popLimit(pushLimit);
        mapFieldLite.put(obj, obj2);
    }

    public void serializeTo(CodedOutputStream codedOutputStream, int i6, K k8, V v10) {
        codedOutputStream.writeTag(i6, 2);
        codedOutputStream.writeUInt32NoTag(computeSerializedSize(this.metadata, k8, v10));
        writeTo(codedOutputStream, this.metadata, k8, v10);
    }

    public static <K, V> Map.Entry<K, V> parseEntry(CodedInputStream codedInputStream, p2 p2Var, ExtensionRegistryLite extensionRegistryLite) {
        Object obj = p2Var.f3013b;
        WireFormat.FieldType fieldType = p2Var.f3014c;
        WireFormat.FieldType fieldType2 = p2Var.f3012a;
        Object obj2 = p2Var.f3015d;
        while (true) {
            int readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == WireFormat.makeTag(1, fieldType2.getWireType())) {
                obj = parseField(codedInputStream, extensionRegistryLite, fieldType2, obj);
            } else if (readTag == WireFormat.makeTag(2, fieldType.getWireType())) {
                obj2 = parseField(codedInputStream, extensionRegistryLite, fieldType, obj2);
            } else if (!codedInputStream.skipField(readTag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    private MapEntryLite(p2 p2Var, K k8, V v10) {
        this.metadata = p2Var;
        this.key = k8;
        this.value = v10;
    }
}

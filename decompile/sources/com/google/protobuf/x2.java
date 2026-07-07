package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x2 implements q3 {

    /* renamed from: a, reason: collision with root package name */
    public final MessageLite f3104a;

    /* renamed from: b, reason: collision with root package name */
    public final j4 f3105b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3106c;

    /* renamed from: d, reason: collision with root package name */
    public final v0 f3107d;

    public x2(j4 j4Var, v0 v0Var, MessageLite messageLite) {
        this.f3105b = j4Var;
        ((x0) v0Var).getClass();
        this.f3106c = messageLite instanceof GeneratedMessageLite.ExtendableMessage;
        this.f3107d = v0Var;
        this.f3104a = messageLite;
    }

    @Override // com.google.protobuf.q3
    public final void a(Object obj, Object obj2) {
        r3.l(this.f3105b, obj, obj2);
        if (this.f3106c) {
            ((x0) this.f3107d).getClass();
            i1 i1Var = ((GeneratedMessageLite.ExtendableMessage) obj2).extensions;
            if (!i1Var.f2936a.isEmpty()) {
                ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable().n(i1Var);
            }
        }
    }

    @Override // com.google.protobuf.q3
    public final void b(Object obj, b0 b0Var, ExtensionRegistryLite extensionRegistryLite) {
        j4 j4Var = this.f3105b;
        UnknownFieldSetLite a10 = j4Var.a(obj);
        v0 v0Var = this.f3107d;
        ((x0) v0Var).getClass();
        i1 ensureExtensionsAreMutable = ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
        while (b0Var.a() != Integer.MAX_VALUE) {
            try {
                b0 b0Var2 = b0Var;
                ExtensionRegistryLite extensionRegistryLite2 = extensionRegistryLite;
                if (!k(b0Var2, extensionRegistryLite2, v0Var, ensureExtensionsAreMutable, j4Var, a10)) {
                    break;
                }
                b0Var = b0Var2;
                extensionRegistryLite = extensionRegistryLite2;
            } finally {
                ((GeneratedMessageLite) obj).unknownFields = a10;
            }
        }
    }

    @Override // com.google.protobuf.q3
    public final void c(Object obj) {
        ((k4) this.f3105b).getClass();
        ((GeneratedMessageLite) obj).unknownFields.makeImmutable();
        ((x0) this.f3107d).getClass();
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions.m();
    }

    @Override // com.google.protobuf.q3
    public final boolean d(Object obj) {
        ((x0) this.f3107d).getClass();
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions.j();
    }

    @Override // com.google.protobuf.q3
    public final void e(MessageLite messageLite, e5 e5Var) {
        ((x0) this.f3107d).getClass();
        Iterator l10 = ((GeneratedMessageLite.ExtendableMessage) messageLite).extensions.l();
        while (l10.hasNext()) {
            Map.Entry entry = (Map.Entry) l10.next();
            FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
            if (fieldSet$FieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !fieldSet$FieldDescriptorLite.isRepeated() && !fieldSet$FieldDescriptorLite.isPacked()) {
                if (entry instanceof d2) {
                    ((l0) e5Var).h(fieldSet$FieldDescriptorLite.getNumber(), ((LazyField) ((d2) entry).f2894x.getValue()).toByteString());
                } else {
                    ((l0) e5Var).h(fieldSet$FieldDescriptorLite.getNumber(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        ((k4) this.f3105b).getClass();
        ((GeneratedMessageLite) messageLite).unknownFields.writeAsMessageSetTo(e5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5 A[EDGE_INSN: B:37:0x00d5->B:38:0x00d5 BREAK  A[LOOP:1: B:20:0x0076->B:28:0x00a7], SYNTHETIC] */
    @Override // com.google.protobuf.q3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.Object r17, byte[] r18, int r19, int r20, com.google.protobuf.g r21) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.x2.f(java.lang.Object, byte[], int, int, com.google.protobuf.g):void");
    }

    @Override // com.google.protobuf.q3
    public final int g(GeneratedMessageLite generatedMessageLite) {
        ((k4) this.f3105b).getClass();
        int hashCode = generatedMessageLite.unknownFields.hashCode();
        if (this.f3106c) {
            ((x0) this.f3107d).getClass();
            return ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.f2936a.hashCode() + (hashCode * 53);
        }
        return hashCode;
    }

    @Override // com.google.protobuf.q3
    public final boolean h(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        k4 k4Var = (k4) this.f3105b;
        k4Var.getClass();
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        k4Var.getClass();
        if (!unknownFieldSetLite.equals(generatedMessageLite2.unknownFields)) {
            return false;
        }
        if (this.f3106c) {
            x0 x0Var = (x0) this.f3107d;
            x0Var.getClass();
            i1 i1Var = ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions;
            x0Var.getClass();
            return i1Var.equals(((GeneratedMessageLite.ExtendableMessage) generatedMessageLite2).extensions);
        }
        return true;
    }

    @Override // com.google.protobuf.q3
    public final int i(AbstractMessageLite abstractMessageLite) {
        ((k4) this.f3105b).getClass();
        int serializedSizeAsMessageSet = ((GeneratedMessageLite) abstractMessageLite).unknownFields.getSerializedSizeAsMessageSet();
        if (this.f3106c) {
            ((x0) this.f3107d).getClass();
            return ((GeneratedMessageLite.ExtendableMessage) abstractMessageLite).extensions.g() + serializedSizeAsMessageSet;
        }
        return serializedSizeAsMessageSet;
    }

    @Override // com.google.protobuf.q3
    public final Object j() {
        MessageLite messageLite = this.f3104a;
        if (messageLite instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) messageLite).newMutableInstance();
        }
        return messageLite.newBuilderForType().buildPartial();
    }

    public final boolean k(b0 b0Var, ExtensionRegistryLite extensionRegistryLite, v0 v0Var, i1 i1Var, j4 j4Var, UnknownFieldSetLite unknownFieldSetLite) {
        int i6 = b0Var.f2868b;
        int i10 = WireFormat.MESSAGE_SET_ITEM_TAG;
        MessageLite messageLite = this.f3104a;
        if (i6 != i10) {
            if (WireFormat.getTagWireType(i6) == 2) {
                int tagFieldNumber = WireFormat.getTagFieldNumber(i6);
                x0 x0Var = (x0) v0Var;
                x0Var.getClass();
                GeneratedMessageLite.GeneratedExtension findLiteExtensionByNumber = extensionRegistryLite.findLiteExtensionByNumber(messageLite, tagFieldNumber);
                if (findLiteExtensionByNumber != null) {
                    x0Var.getClass();
                    i1Var.p(findLiteExtensionByNumber.descriptor, b0Var.o(findLiteExtensionByNumber.getMessageDefaultInstance().getClass(), extensionRegistryLite));
                    return true;
                }
                return j4Var.b(unknownFieldSetLite, b0Var, 0);
            }
            return b0Var.y();
        }
        GeneratedMessageLite.GeneratedExtension generatedExtension = null;
        ByteString byteString = null;
        int i11 = 0;
        while (b0Var.a() != Integer.MAX_VALUE) {
            int i12 = b0Var.f2868b;
            if (i12 == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                b0Var.x(0);
                i11 = b0Var.f2867a.readUInt32();
                ((x0) v0Var).getClass();
                generatedExtension = extensionRegistryLite.findLiteExtensionByNumber(messageLite, i11);
            } else if (i12 == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                if (generatedExtension != null) {
                    ((x0) v0Var).getClass();
                    i1Var.p(generatedExtension.descriptor, b0Var.o(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite));
                } else {
                    byteString = b0Var.e();
                }
            } else if (!b0Var.y()) {
                break;
            }
        }
        if (b0Var.f2868b == WireFormat.MESSAGE_SET_ITEM_END_TAG) {
            if (byteString != null) {
                if (generatedExtension != null) {
                    ((x0) v0Var).getClass();
                    MessageLite.Builder newBuilderForType = generatedExtension.getMessageDefaultInstance().newBuilderForType();
                    CodedInputStream newCodedInput = byteString.newCodedInput();
                    newBuilderForType.mergeFrom(newCodedInput, extensionRegistryLite);
                    i1Var.p(generatedExtension.descriptor, newBuilderForType.buildPartial());
                    newCodedInput.checkLastTagWas(0);
                    return true;
                }
                ((k4) j4Var).getClass();
                unknownFieldSetLite.storeField(WireFormat.makeTag(i11, 2), byteString);
            }
            return true;
        }
        throw InvalidProtocolBufferException.invalidEndTag();
    }
}

package com.google.protobuf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class j4 {
    public abstract UnknownFieldSetLite a(Object obj);

    public final boolean b(Object obj, l3 l3Var, int i6) {
        b0 b0Var = (b0) l3Var;
        int i10 = b0Var.f2868b;
        int tagFieldNumber = WireFormat.getTagFieldNumber(i10);
        int tagWireType = WireFormat.getTagWireType(i10);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType == 4) {
                            return false;
                        }
                        if (tagWireType == 5) {
                            b0Var.x(5);
                            ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 5), Integer.valueOf(b0Var.f2867a.readFixed32()));
                            return true;
                        }
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
                    int makeTag = WireFormat.makeTag(tagFieldNumber, 4);
                    int i11 = i6 + 1;
                    if (i11 >= 100) {
                        throw InvalidProtocolBufferException.recursionLimitExceeded();
                    }
                    while (b0Var.a() != Integer.MAX_VALUE && b(newInstance, b0Var, i11)) {
                    }
                    if (makeTag == b0Var.f2868b) {
                        newInstance.makeImmutable();
                        ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 3), newInstance);
                        return true;
                    }
                    throw InvalidProtocolBufferException.invalidEndTag();
                }
                ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 2), b0Var.e());
                return true;
            }
            b0Var.x(1);
            ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 1), Long.valueOf(b0Var.f2867a.readFixed64()));
            return true;
        }
        b0Var.x(0);
        ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 0), Long.valueOf(b0Var.f2867a.readInt64()));
        return true;
    }

    public abstract void c(Object obj, Object obj2);
}

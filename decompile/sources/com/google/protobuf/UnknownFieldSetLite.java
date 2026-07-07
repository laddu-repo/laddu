package com.google.protobuf;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class UnknownFieldSetLite {
    private static final UnknownFieldSetLite DEFAULT_INSTANCE = new UnknownFieldSetLite(0, new int[0], new Object[0], false);
    private static final int MIN_CAPACITY = 8;
    private int count;
    private boolean isMutable;
    private int memoizedSerializedSize;
    private Object[] objects;
    private int[] tags;

    private UnknownFieldSetLite() {
        this(0, new int[8], new Object[8], true);
    }

    private void ensureCapacity(int i6) {
        int[] iArr = this.tags;
        if (i6 > iArr.length) {
            int i10 = this.count;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i6) {
                i6 = i11;
            }
            if (i6 < 8) {
                i6 = 8;
            }
            this.tags = Arrays.copyOf(iArr, i6);
            this.objects = Arrays.copyOf(this.objects, i6);
        }
    }

    public static UnknownFieldSetLite getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static int hashCode(int[] iArr, int i6) {
        int i10 = 17;
        for (int i11 = 0; i11 < i6; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        return i10;
    }

    private UnknownFieldSetLite mergeFrom(CodedInputStream codedInputStream) {
        int readTag;
        do {
            readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            }
        } while (mergeFieldFrom(readTag, codedInputStream));
        return this;
    }

    public static UnknownFieldSetLite mutableCopyOf(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        int i6 = unknownFieldSetLite.count + unknownFieldSetLite2.count;
        int[] copyOf = Arrays.copyOf(unknownFieldSetLite.tags, i6);
        System.arraycopy(unknownFieldSetLite2.tags, 0, copyOf, unknownFieldSetLite.count, unknownFieldSetLite2.count);
        Object[] copyOf2 = Arrays.copyOf(unknownFieldSetLite.objects, i6);
        System.arraycopy(unknownFieldSetLite2.objects, 0, copyOf2, unknownFieldSetLite.count, unknownFieldSetLite2.count);
        return new UnknownFieldSetLite(i6, copyOf, copyOf2, true);
    }

    public static UnknownFieldSetLite newInstance() {
        return new UnknownFieldSetLite();
    }

    private static boolean objectsEquals(Object[] objArr, Object[] objArr2, int i6) {
        for (int i10 = 0; i10 < i6; i10++) {
            if (!objArr[i10].equals(objArr2[i10])) {
                return false;
            }
        }
        return true;
    }

    private static boolean tagsEquals(int[] iArr, int[] iArr2, int i6) {
        for (int i10 = 0; i10 < i6; i10++) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    private static void writeField(int i6, Object obj, e5 e5Var) {
        int tagFieldNumber = WireFormat.getTagFieldNumber(i6);
        int tagWireType = WireFormat.getTagWireType(i6);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType == 5) {
                            ((l0) e5Var).b(tagFieldNumber, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(InvalidProtocolBufferException.invalidWireType());
                    }
                    l0 l0Var = (l0) e5Var;
                    l0Var.getClass();
                    Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
                    l0Var.f2978a.writeTag(tagFieldNumber, 3);
                    ((UnknownFieldSetLite) obj).writeTo(e5Var);
                    l0Var.f2978a.writeTag(tagFieldNumber, 4);
                    return;
                }
                ((l0) e5Var).a(tagFieldNumber, (ByteString) obj);
                return;
            }
            ((l0) e5Var).c(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        ((l0) e5Var).f(tagFieldNumber, ((Long) obj).longValue());
    }

    public void checkMutable() {
        if (this.isMutable) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnknownFieldSetLite)) {
            return false;
        }
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i6 = this.count;
        if (i6 == unknownFieldSetLite.count && tagsEquals(this.tags, unknownFieldSetLite.tags, i6) && objectsEquals(this.objects, unknownFieldSetLite.objects, this.count)) {
            return true;
        }
        return false;
    }

    public int getSerializedSize() {
        int computeUInt64Size;
        int i6 = this.memoizedSerializedSize;
        if (i6 != -1) {
            return i6;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.count; i11++) {
            int i12 = this.tags[i11];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i12);
            int tagWireType = WireFormat.getTagWireType(i12);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                computeUInt64Size = CodedOutputStream.computeFixed32Size(tagFieldNumber, ((Integer) this.objects[i11]).intValue());
                            } else {
                                throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
                            }
                        } else {
                            i10 = ((UnknownFieldSetLite) this.objects[i11]).getSerializedSize() + (CodedOutputStream.computeTagSize(tagFieldNumber) * 2) + i10;
                        }
                    } else {
                        computeUInt64Size = CodedOutputStream.computeBytesSize(tagFieldNumber, (ByteString) this.objects[i11]);
                    }
                } else {
                    computeUInt64Size = CodedOutputStream.computeFixed64Size(tagFieldNumber, ((Long) this.objects[i11]).longValue());
                }
            } else {
                computeUInt64Size = CodedOutputStream.computeUInt64Size(tagFieldNumber, ((Long) this.objects[i11]).longValue());
            }
            i10 = computeUInt64Size + i10;
        }
        this.memoizedSerializedSize = i10;
        return i10;
    }

    public int getSerializedSizeAsMessageSet() {
        int i6 = this.memoizedSerializedSize;
        if (i6 != -1) {
            return i6;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.count; i11++) {
            i10 += CodedOutputStream.computeRawMessageSetExtensionSize(WireFormat.getTagFieldNumber(this.tags[i11]), (ByteString) this.objects[i11]);
        }
        this.memoizedSerializedSize = i10;
        return i10;
    }

    public void makeImmutable() {
        if (this.isMutable) {
            this.isMutable = false;
        }
    }

    public boolean mergeFieldFrom(int i6, CodedInputStream codedInputStream) {
        checkMutable();
        int tagFieldNumber = WireFormat.getTagFieldNumber(i6);
        int tagWireType = WireFormat.getTagWireType(i6);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType != 4) {
                            if (tagWireType == 5) {
                                storeField(i6, Integer.valueOf(codedInputStream.readFixed32()));
                                return true;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        return false;
                    }
                    UnknownFieldSetLite unknownFieldSetLite = new UnknownFieldSetLite();
                    unknownFieldSetLite.mergeFrom(codedInputStream);
                    codedInputStream.checkLastTagWas(WireFormat.makeTag(tagFieldNumber, 4));
                    storeField(i6, unknownFieldSetLite);
                    return true;
                }
                storeField(i6, codedInputStream.readBytes());
                return true;
            }
            storeField(i6, Long.valueOf(codedInputStream.readFixed64()));
            return true;
        }
        storeField(i6, Long.valueOf(codedInputStream.readInt64()));
        return true;
    }

    public UnknownFieldSetLite mergeLengthDelimitedField(int i6, ByteString byteString) {
        checkMutable();
        if (i6 != 0) {
            storeField(WireFormat.makeTag(i6, 2), byteString);
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public UnknownFieldSetLite mergeVarintField(int i6, int i10) {
        checkMutable();
        if (i6 != 0) {
            storeField(WireFormat.makeTag(i6, 0), Long.valueOf(i10));
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public final void printWithIndent(StringBuilder sb2, int i6) {
        for (int i10 = 0; i10 < this.count; i10++) {
            u2.b(sb2, i6, String.valueOf(WireFormat.getTagFieldNumber(this.tags[i10])), this.objects[i10]);
        }
    }

    public void storeField(int i6, Object obj) {
        checkMutable();
        ensureCapacity(this.count + 1);
        int[] iArr = this.tags;
        int i10 = this.count;
        iArr[i10] = i6;
        this.objects[i10] = obj;
        this.count = i10 + 1;
    }

    public void writeAsMessageSetTo(CodedOutputStream codedOutputStream) {
        for (int i6 = 0; i6 < this.count; i6++) {
            codedOutputStream.writeRawMessageSetExtension(WireFormat.getTagFieldNumber(this.tags[i6]), (ByteString) this.objects[i6]);
        }
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i6 = 0; i6 < this.count; i6++) {
            int i10 = this.tags[i6];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i10);
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType == 0) {
                codedOutputStream.writeUInt64(tagFieldNumber, ((Long) this.objects[i6]).longValue());
            } else if (tagWireType == 1) {
                codedOutputStream.writeFixed64(tagFieldNumber, ((Long) this.objects[i6]).longValue());
            } else if (tagWireType == 2) {
                codedOutputStream.writeBytes(tagFieldNumber, (ByteString) this.objects[i6]);
            } else if (tagWireType == 3) {
                codedOutputStream.writeTag(tagFieldNumber, 3);
                ((UnknownFieldSetLite) this.objects[i6]).writeTo(codedOutputStream);
                codedOutputStream.writeTag(tagFieldNumber, 4);
            } else if (tagWireType == 5) {
                codedOutputStream.writeFixed32(tagFieldNumber, ((Integer) this.objects[i6]).intValue());
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    private UnknownFieldSetLite(int i6, int[] iArr, Object[] objArr, boolean z10) {
        this.memoizedSerializedSize = -1;
        this.count = i6;
        this.tags = iArr;
        this.objects = objArr;
        this.isMutable = z10;
    }

    private static int hashCode(Object[] objArr, int i6) {
        int i10 = 17;
        for (int i11 = 0; i11 < i6; i11++) {
            i10 = (i10 * 31) + objArr[i11].hashCode();
        }
        return i10;
    }

    public int hashCode() {
        int i6 = this.count;
        return ((((527 + i6) * 31) + hashCode(this.tags, i6)) * 31) + hashCode(this.objects, this.count);
    }

    public UnknownFieldSetLite mergeFrom(UnknownFieldSetLite unknownFieldSetLite) {
        if (unknownFieldSetLite.equals(getDefaultInstance())) {
            return this;
        }
        checkMutable();
        int i6 = this.count + unknownFieldSetLite.count;
        ensureCapacity(i6);
        System.arraycopy(unknownFieldSetLite.tags, 0, this.tags, this.count, unknownFieldSetLite.count);
        System.arraycopy(unknownFieldSetLite.objects, 0, this.objects, this.count, unknownFieldSetLite.count);
        this.count = i6;
        return this;
    }

    public void writeAsMessageSetTo(e5 e5Var) {
        ((l0) e5Var).getClass();
        if (Writer$FieldOrder.ASCENDING == Writer$FieldOrder.DESCENDING) {
            for (int i6 = this.count - 1; i6 >= 0; i6--) {
                ((l0) e5Var).h(WireFormat.getTagFieldNumber(this.tags[i6]), this.objects[i6]);
            }
            return;
        }
        for (int i10 = 0; i10 < this.count; i10++) {
            ((l0) e5Var).h(WireFormat.getTagFieldNumber(this.tags[i10]), this.objects[i10]);
        }
    }

    public void writeTo(e5 e5Var) {
        if (this.count == 0) {
            return;
        }
        ((l0) e5Var).getClass();
        Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
        for (int i6 = 0; i6 < this.count; i6++) {
            writeField(this.tags[i6], this.objects[i6], e5Var);
        }
    }
}

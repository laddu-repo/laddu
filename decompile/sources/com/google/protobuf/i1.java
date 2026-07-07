package com.google.protobuf;

import com.google.android.gms.internal.measurement.s6;
import com.google.protobuf.Internal;
import com.google.protobuf.WireFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: d, reason: collision with root package name */
    public static final i1 f2935d = new i1(0);

    /* renamed from: a, reason: collision with root package name */
    public final s3 f2936a = new s3(16);

    /* renamed from: b, reason: collision with root package name */
    public boolean f2937b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2938c;

    public i1() {
    }

    public static int c(WireFormat.FieldType fieldType, int i6, Object obj) {
        int computeTagSize = CodedOutputStream.computeTagSize(i6);
        if (fieldType == WireFormat.FieldType.GROUP) {
            computeTagSize *= 2;
        }
        return d(fieldType, obj) + computeTagSize;
    }

    public static int d(WireFormat.FieldType fieldType, Object obj) {
        switch (h1.f2929b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.computeGroupSizeNoTag((MessageLite) obj);
            case 10:
                if (obj instanceof LazyField) {
                    return CodedOutputStream.computeLazyFieldSizeNoTag((LazyField) obj);
                }
                return CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            case 11:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
                }
                return CodedOutputStream.computeStringSizeNoTag((String) obj);
            case 12:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
                }
                return CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 18:
                if (obj instanceof Internal.EnumLite) {
                    return CodedOutputStream.computeEnumSizeNoTag(((Internal.EnumLite) obj).getNumber());
                }
                return CodedOutputStream.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int e(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldSet$FieldDescriptorLite.getLiteType();
        int number = fieldSet$FieldDescriptorLite.getNumber();
        if (fieldSet$FieldDescriptorLite.isRepeated()) {
            List list = (List) obj;
            int i6 = 0;
            if (fieldSet$FieldDescriptorLite.isPacked()) {
                if (list.isEmpty()) {
                    return 0;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i6 += d(liteType, it.next());
                }
                return CodedOutputStream.computeUInt32SizeNoTag(i6) + CodedOutputStream.computeTagSize(number) + i6;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                i6 += c(liteType, number, it2.next());
            }
            return i6;
        }
        return c(liteType, number, obj);
    }

    public static int h(Map.Entry entry) {
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (fieldSet$FieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !fieldSet$FieldDescriptorLite.isRepeated() && !fieldSet$FieldDescriptorLite.isPacked()) {
            if (value instanceof LazyField) {
                return CodedOutputStream.computeLazyFieldMessageSetExtensionSize(((FieldSet$FieldDescriptorLite) entry.getKey()).getNumber(), (LazyField) value);
            }
            return CodedOutputStream.computeMessageSetExtensionSize(((FieldSet$FieldDescriptorLite) entry.getKey()).getNumber(), (MessageLite) value);
        }
        return e(fieldSet$FieldDescriptorLite, value);
    }

    public static boolean k(Map.Entry entry) {
        boolean z10;
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
        if (fieldSet$FieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            if (fieldSet$FieldDescriptorLite.isRepeated()) {
                for (Object obj : (List) entry.getValue()) {
                    if (obj instanceof MessageLiteOrBuilder) {
                        z10 = ((MessageLiteOrBuilder) obj).isInitialized();
                    } else if (obj instanceof LazyField) {
                        z10 = true;
                    } else {
                        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                    }
                    if (!z10) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof MessageLiteOrBuilder) {
                    return ((MessageLiteOrBuilder) value).isInitialized();
                }
                if (value instanceof LazyField) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if ((r6 instanceof com.google.protobuf.LazyField) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
    
        if ((r6 instanceof com.google.protobuf.Internal.EnumLite) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        if ((r6 instanceof byte[]) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void q(com.google.protobuf.FieldSet$FieldDescriptorLite r5, java.lang.Object r6) {
        /*
            com.google.protobuf.WireFormat$FieldType r0 = r5.getLiteType()
            com.google.protobuf.Internal.checkNotNull(r6)
            int[] r1 = com.google.protobuf.h1.f2928a
            com.google.protobuf.WireFormat$JavaType r0 = r0.getJavaType()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L45;
                case 2: goto L42;
                case 3: goto L3f;
                case 4: goto L3c;
                case 5: goto L39;
                case 6: goto L36;
                case 7: goto L2d;
                case 8: goto L24;
                case 9: goto L1a;
                default: goto L18;
            }
        L18:
            r0 = 0
            goto L47
        L1a:
            boolean r0 = r6 instanceof com.google.protobuf.MessageLite
            if (r0 != 0) goto L22
            boolean r0 = r6 instanceof com.google.protobuf.LazyField
            if (r0 == 0) goto L18
        L22:
            r0 = 1
            goto L47
        L24:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L22
            boolean r0 = r6 instanceof com.google.protobuf.Internal.EnumLite
            if (r0 == 0) goto L18
            goto L22
        L2d:
            boolean r0 = r6 instanceof com.google.protobuf.ByteString
            if (r0 != 0) goto L22
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L18
            goto L22
        L36:
            boolean r0 = r6 instanceof java.lang.String
            goto L47
        L39:
            boolean r0 = r6 instanceof java.lang.Boolean
            goto L47
        L3c:
            boolean r0 = r6 instanceof java.lang.Double
            goto L47
        L3f:
            boolean r0 = r6 instanceof java.lang.Float
            goto L47
        L42:
            boolean r0 = r6 instanceof java.lang.Long
            goto L47
        L45:
            boolean r0 = r6 instanceof java.lang.Integer
        L47:
            if (r0 == 0) goto L4a
            return
        L4a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r3 = r5.getNumber()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.protobuf.WireFormat$FieldType r5 = r5.getLiteType()
            com.google.protobuf.WireFormat$JavaType r5 = r5.getJavaType()
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r3
            r4[r1] = r5
            r5 = 2
            r4[r5] = r6
            java.lang.String r5 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r5 = java.lang.String.format(r5, r4)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i1.q(com.google.protobuf.FieldSet$FieldDescriptorLite, java.lang.Object):void");
    }

    public static void r(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i6, Object obj) {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i6, (MessageLite) obj);
        } else {
            codedOutputStream.writeTag(i6, fieldType.getWireType());
            s(codedOutputStream, fieldType, obj);
        }
    }

    public static void s(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) {
        switch (h1.f2929b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.writeDoubleNoTag(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.writeFloatNoTag(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.writeInt64NoTag(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.writeUInt64NoTag(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.writeInt32NoTag(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.writeFixed64NoTag(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.writeFixed32NoTag(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.writeBoolNoTag(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.writeGroupNoTag((MessageLite) obj);
                return;
            case 10:
                codedOutputStream.writeMessageNoTag((MessageLite) obj);
                return;
            case 11:
                if (obj instanceof ByteString) {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.writeStringNoTag((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof ByteString) {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                    return;
                }
            case 13:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                return;
            case 14:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                return;
            case 17:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof Internal.EnumLite) {
                    codedOutputStream.writeEnumNoTag(((Internal.EnumLite) obj).getNumber());
                    return;
                } else {
                    codedOutputStream.writeEnumNoTag(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public final void a(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj) {
        List list;
        if (fieldSet$FieldDescriptorLite.isRepeated()) {
            q(fieldSet$FieldDescriptorLite, obj);
            Object f3 = f(fieldSet$FieldDescriptorLite);
            if (f3 == null) {
                list = new ArrayList();
                this.f2936a.put(fieldSet$FieldDescriptorLite, list);
            } else {
                list = (List) f3;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final i1 clone() {
        s3 s3Var;
        i1 i1Var = new i1();
        int i6 = 0;
        while (true) {
            s3Var = this.f2936a;
            if (i6 >= s3Var.f3044y.size()) {
                break;
            }
            Map.Entry c10 = s3Var.c(i6);
            i1Var.p((FieldSet$FieldDescriptorLite) c10.getKey(), c10.getValue());
            i6++;
        }
        for (Map.Entry entry : s3Var.d()) {
            i1Var.p((FieldSet$FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        i1Var.f2938c = this.f2938c;
        return i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        return this.f2936a.equals(((i1) obj).f2936a);
    }

    public final Object f(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite) {
        Object obj = this.f2936a.get(fieldSet$FieldDescriptorLite);
        if (obj instanceof LazyField) {
            return ((LazyField) obj).getValue();
        }
        return obj;
    }

    public final int g() {
        s3 s3Var;
        int i6 = 0;
        int i10 = 0;
        while (true) {
            s3Var = this.f2936a;
            if (i6 >= s3Var.f3044y.size()) {
                break;
            }
            i10 += h(s3Var.c(i6));
            i6++;
        }
        Iterator it = s3Var.d().iterator();
        while (it.hasNext()) {
            i10 += h((Map.Entry) it.next());
        }
        return i10;
    }

    public final int hashCode() {
        return this.f2936a.hashCode();
    }

    public final int i() {
        s3 s3Var;
        int i6 = 0;
        int i10 = 0;
        while (true) {
            s3Var = this.f2936a;
            if (i6 >= s3Var.f3044y.size()) {
                break;
            }
            Map.Entry c10 = s3Var.c(i6);
            i10 += e((FieldSet$FieldDescriptorLite) c10.getKey(), c10.getValue());
            i6++;
        }
        for (Map.Entry entry : s3Var.d()) {
            i10 += e((FieldSet$FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return i10;
    }

    public final boolean j() {
        int i6 = 0;
        while (true) {
            s3 s3Var = this.f2936a;
            if (i6 < s3Var.f3044y.size()) {
                if (!k(s3Var.c(i6))) {
                    return false;
                }
                i6++;
            } else {
                Iterator it = s3Var.d().iterator();
                while (it.hasNext()) {
                    if (!k((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    public final Iterator l() {
        boolean z10 = this.f2938c;
        s3 s3Var = this.f2936a;
        if (z10) {
            return new e2(((s6) s3Var.entrySet()).iterator());
        }
        return ((s6) s3Var.entrySet()).iterator();
    }

    public final void m() {
        s3 s3Var;
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.f2937b) {
            return;
        }
        int i6 = 0;
        while (true) {
            s3Var = this.f2936a;
            if (i6 >= s3Var.f3044y.size()) {
                break;
            }
            Map.Entry c10 = s3Var.c(i6);
            if (c10.getValue() instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) c10.getValue()).makeImmutable();
            }
            i6++;
        }
        if (!s3Var.A) {
            for (int i10 = 0; i10 < s3Var.f3044y.size(); i10++) {
                Map.Entry c11 = s3Var.c(i10);
                if (((FieldSet$FieldDescriptorLite) c11.getKey()).isRepeated()) {
                    c11.setValue(Collections.unmodifiableList((List) c11.getValue()));
                }
            }
            for (Map.Entry entry : s3Var.d()) {
                if (((FieldSet$FieldDescriptorLite) entry.getKey()).isRepeated()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!s3Var.A) {
            if (s3Var.f3045z.isEmpty()) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(s3Var.f3045z);
            }
            s3Var.f3045z = unmodifiableMap;
            if (s3Var.C.isEmpty()) {
                unmodifiableMap2 = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(s3Var.C);
            }
            s3Var.C = unmodifiableMap2;
            s3Var.A = true;
        }
        this.f2937b = true;
    }

    public final void n(i1 i1Var) {
        s3 s3Var;
        int i6 = 0;
        while (true) {
            s3Var = i1Var.f2936a;
            if (i6 >= s3Var.f3044y.size()) {
                break;
            }
            o(s3Var.c(i6));
            i6++;
        }
        Iterator it = s3Var.d().iterator();
        while (it.hasNext()) {
            o((Map.Entry) it.next());
        }
    }

    public final void o(Map.Entry entry) {
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        boolean isRepeated = fieldSet$FieldDescriptorLite.isRepeated();
        s3 s3Var = this.f2936a;
        if (isRepeated) {
            Object f3 = f(fieldSet$FieldDescriptorLite);
            if (f3 == null) {
                f3 = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) f3;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            s3Var.put(fieldSet$FieldDescriptorLite, f3);
            return;
        }
        if (fieldSet$FieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            Object f10 = f(fieldSet$FieldDescriptorLite);
            if (f10 == null) {
                if (value instanceof byte[]) {
                    byte[] bArr3 = (byte[]) value;
                    byte[] bArr4 = new byte[bArr3.length];
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                    value = bArr4;
                }
                s3Var.put(fieldSet$FieldDescriptorLite, value);
                return;
            }
            s3Var.put(fieldSet$FieldDescriptorLite, fieldSet$FieldDescriptorLite.internalMergeFrom(((MessageLite) f10).toBuilder(), (MessageLite) value).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        s3Var.put(fieldSet$FieldDescriptorLite, value);
    }

    public final void p(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj) {
        if (fieldSet$FieldDescriptorLite.isRepeated()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj2 = arrayList.get(i6);
                    i6++;
                    q(fieldSet$FieldDescriptorLite, obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            q(fieldSet$FieldDescriptorLite, obj);
        }
        if (obj instanceof LazyField) {
            this.f2938c = true;
        }
        this.f2936a.put(fieldSet$FieldDescriptorLite, obj);
    }

    public i1(int i6) {
        m();
        m();
    }
}

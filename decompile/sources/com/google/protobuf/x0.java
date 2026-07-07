package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x0 extends v0 {
    @Override // com.google.protobuf.v0
    public final Object a(Object obj, b0 b0Var, GeneratedMessageLite.GeneratedExtension generatedExtension, ExtensionRegistryLite extensionRegistryLite, i1 i1Var, Object obj2, j4 j4Var) {
        Object valueOf;
        Object f3;
        ArrayList arrayList;
        int number = generatedExtension.getNumber();
        p1 p1Var = generatedExtension.descriptor;
        if (p1Var.A && p1Var.B) {
            switch (w0.f3072a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    b0Var.g(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    b0Var.l(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    b0Var.n(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    b0Var.v(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    b0Var.m(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    b0Var.k(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    b0Var.j(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    b0Var.d(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    b0Var.u(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    b0Var.p(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    b0Var.q(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    b0Var.r(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    b0Var.s(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    b0Var.h(arrayList);
                    obj2 = r3.j(obj, number, arrayList, generatedExtension.descriptor.f3009x, obj2, j4Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.f3011z);
            }
            i1Var.p(generatedExtension.descriptor, arrayList);
            return obj2;
        }
        if (generatedExtension.getLiteType() == WireFormat.FieldType.ENUM) {
            b0Var.x(0);
            int readInt32 = b0Var.f2867a.readInt32();
            if (generatedExtension.descriptor.f3009x.findValueByNumber(readInt32) == null) {
                return r3.n(obj, number, readInt32, obj2, j4Var);
            }
            valueOf = Integer.valueOf(readInt32);
        } else {
            switch (w0.f3072a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    b0Var.x(1);
                    valueOf = Double.valueOf(b0Var.f2867a.readDouble());
                    break;
                case 2:
                    b0Var.x(5);
                    valueOf = Float.valueOf(b0Var.f2867a.readFloat());
                    break;
                case 3:
                    b0Var.x(0);
                    valueOf = Long.valueOf(b0Var.f2867a.readInt64());
                    break;
                case 4:
                    b0Var.x(0);
                    valueOf = Long.valueOf(b0Var.f2867a.readUInt64());
                    break;
                case 5:
                    b0Var.x(0);
                    valueOf = Integer.valueOf(b0Var.f2867a.readInt32());
                    break;
                case 6:
                    b0Var.x(1);
                    valueOf = Long.valueOf(b0Var.f2867a.readFixed64());
                    break;
                case 7:
                    b0Var.x(5);
                    valueOf = Integer.valueOf(b0Var.f2867a.readFixed32());
                    break;
                case 8:
                    b0Var.x(0);
                    valueOf = Boolean.valueOf(b0Var.f2867a.readBool());
                    break;
                case 9:
                    b0Var.x(0);
                    valueOf = Integer.valueOf(b0Var.f2867a.readUInt32());
                    break;
                case 10:
                    b0Var.x(5);
                    valueOf = Integer.valueOf(b0Var.f2867a.readSFixed32());
                    break;
                case 11:
                    b0Var.x(1);
                    valueOf = Long.valueOf(b0Var.f2867a.readSFixed64());
                    break;
                case 12:
                    b0Var.x(0);
                    valueOf = Integer.valueOf(b0Var.f2867a.readSInt32());
                    break;
                case 13:
                    b0Var.x(0);
                    valueOf = Long.valueOf(b0Var.f2867a.readSInt64());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    valueOf = b0Var.e();
                    break;
                case 16:
                    b0Var.x(2);
                    valueOf = b0Var.f2867a.readString();
                    break;
                case 17:
                    if (!generatedExtension.isRepeated()) {
                        Object f10 = i1Var.f(generatedExtension.descriptor);
                        if (f10 instanceof GeneratedMessageLite) {
                            i3 i3Var = i3.f2941c;
                            i3Var.getClass();
                            q3 a10 = i3Var.a(f10.getClass());
                            if (!((GeneratedMessageLite) f10).isMutable()) {
                                Object j = a10.j();
                                a10.a(j, f10);
                                i1Var.p(generatedExtension.descriptor, j);
                                f10 = j;
                            }
                            b0Var.x(3);
                            b0Var.b(f10, a10, extensionRegistryLite);
                            return obj2;
                        }
                    }
                    Class<?> cls = generatedExtension.getMessageDefaultInstance().getClass();
                    b0Var.x(3);
                    q3 a11 = i3.f2941c.a(cls);
                    Object j10 = a11.j();
                    b0Var.b(j10, a11, extensionRegistryLite);
                    a11.c(j10);
                    valueOf = j10;
                    break;
                case 18:
                    if (!generatedExtension.isRepeated()) {
                        Object f11 = i1Var.f(generatedExtension.descriptor);
                        if (f11 instanceof GeneratedMessageLite) {
                            i3 i3Var2 = i3.f2941c;
                            i3Var2.getClass();
                            q3 a12 = i3Var2.a(f11.getClass());
                            if (!((GeneratedMessageLite) f11).isMutable()) {
                                Object j11 = a12.j();
                                a12.a(j11, f11);
                                i1Var.p(generatedExtension.descriptor, j11);
                                f11 = j11;
                            }
                            b0Var.x(2);
                            b0Var.c(f11, a12, extensionRegistryLite);
                            return obj2;
                        }
                    }
                    valueOf = b0Var.o(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                    break;
                default:
                    valueOf = null;
                    break;
            }
        }
        if (generatedExtension.isRepeated()) {
            i1Var.a(generatedExtension.descriptor, valueOf);
            return obj2;
        }
        int i6 = w0.f3072a[generatedExtension.getLiteType().ordinal()];
        if ((i6 == 17 || i6 == 18) && (f3 = i1Var.f(generatedExtension.descriptor)) != null) {
            valueOf = Internal.mergeMessage(f3, valueOf);
        }
        i1Var.p(generatedExtension.descriptor, valueOf);
        return obj2;
    }

    @Override // com.google.protobuf.v0
    public final void b(e5 e5Var, Map.Entry entry) {
        p1 p1Var = (p1) entry.getKey();
        boolean z10 = p1Var.A;
        WireFormat.FieldType fieldType = p1Var.f3011z;
        boolean z11 = p1Var.B;
        int i6 = p1Var.f3010y;
        if (z10) {
            switch (w0.f3072a[fieldType.ordinal()]) {
                case 1:
                    r3.q(i6, (List) entry.getValue(), e5Var, z11);
                    return;
                case 2:
                    r3.u(i6, (List) entry.getValue(), e5Var, z11);
                    return;
                case 3:
                    r3.x(i6, (List) entry.getValue(), e5Var, z11);
                    return;
                case 4:
                    r3.F(i6, (List) entry.getValue(), e5Var, z11);
                    return;
                case 5:
                    r3.w(i6, (List) entry.getValue(), e5Var, z11);
                    return;
                case 6:
                    r3.t(i6, (List) entry.getValue(), e5Var, z11);
                    return;
                case 7:
                    r3.s(i6, (List) entry.getValue(), e5Var, z11);
                    return;
                case 8:
                    r3.o(i6, (List) entry.getValue(), e5Var, z11);
                    return;
                case 9:
                    r3.E(i6, (List) entry.getValue(), e5Var, z11);
                    return;
                case 10:
                    r3.z(i6, (List) entry.getValue(), e5Var, z11);
                    return;
                case 11:
                    r3.A(i6, (List) entry.getValue(), e5Var, z11);
                    return;
                case 12:
                    r3.B(i6, (List) entry.getValue(), e5Var, z11);
                    return;
                case 13:
                    r3.C(i6, (List) entry.getValue(), e5Var, z11);
                    return;
                case 14:
                    r3.w(i6, (List) entry.getValue(), e5Var, z11);
                    return;
                case 15:
                    r3.p(i6, (List) entry.getValue(), e5Var);
                    return;
                case 16:
                    r3.D(i6, (List) entry.getValue(), e5Var);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        r3.v(i6, (List) entry.getValue(), e5Var, i3.f2941c.a(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        r3.y(i6, (List) entry.getValue(), e5Var, i3.f2941c.a(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        switch (w0.f3072a[fieldType.ordinal()]) {
            case 1:
                ((l0) e5Var).f2978a.writeDouble(i6, ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                ((l0) e5Var).f2978a.writeFloat(i6, ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                ((l0) e5Var).f(i6, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                ((l0) e5Var).f2978a.writeUInt64(i6, ((Long) entry.getValue()).longValue());
                return;
            case 5:
                ((l0) e5Var).e(i6, ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                ((l0) e5Var).c(i6, ((Long) entry.getValue()).longValue());
                return;
            case 7:
                ((l0) e5Var).b(i6, ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                ((l0) e5Var).f2978a.writeBool(i6, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                ((l0) e5Var).f2978a.writeUInt32(i6, ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                ((l0) e5Var).f2978a.writeSFixed32(i6, ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                ((l0) e5Var).f2978a.writeSFixed64(i6, ((Long) entry.getValue()).longValue());
                return;
            case 12:
                ((l0) e5Var).f2978a.writeSInt32(i6, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                ((l0) e5Var).f2978a.writeSInt64(i6, ((Long) entry.getValue()).longValue());
                return;
            case 14:
                ((l0) e5Var).e(i6, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                ((l0) e5Var).a(i6, (ByteString) entry.getValue());
                return;
            case 16:
                ((l0) e5Var).f2978a.writeString(i6, (String) entry.getValue());
                return;
            case 17:
                ((l0) e5Var).d(i6, entry.getValue(), i3.f2941c.a(entry.getValue().getClass()));
                return;
            case 18:
                ((l0) e5Var).g(i6, entry.getValue(), i3.f2941c.a(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }
}

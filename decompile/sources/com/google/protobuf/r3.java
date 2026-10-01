package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class r3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f3036a;

    /* renamed from: b, reason: collision with root package name */
    public static final j4 f3037b;

    /* renamed from: c, reason: collision with root package name */
    public static final k4 f3038c;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.protobuf.k4, java.lang.Object] */
    static {
        Class<?> cls;
        Class<?> cls2;
        j4 j4Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f3036a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                j4Var = (j4) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f3037b = j4Var;
        f3038c = new Object();
    }

    public static void A(int i6, List list, e5 e5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((l0) e5Var).f2978a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.writeTag(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += CodedOutputStream.computeSFixed64SizeNoTag(((Long) list.get(i12)).longValue());
                }
                codedOutputStream.writeUInt32NoTag(i11);
                while (i10 < list.size()) {
                    codedOutputStream.writeSFixed64NoTag(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                codedOutputStream.writeSFixed64(i6, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void B(int i6, List list, e5 e5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((l0) e5Var).f2978a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.writeTag(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += CodedOutputStream.computeSInt32SizeNoTag(((Integer) list.get(i12)).intValue());
                }
                codedOutputStream.writeUInt32NoTag(i11);
                while (i10 < list.size()) {
                    codedOutputStream.writeSInt32NoTag(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                codedOutputStream.writeSInt32(i6, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void C(int i6, List list, e5 e5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((l0) e5Var).f2978a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.writeTag(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += CodedOutputStream.computeSInt64SizeNoTag(((Long) list.get(i12)).longValue());
                }
                codedOutputStream.writeUInt32NoTag(i11);
                while (i10 < list.size()) {
                    codedOutputStream.writeSInt64NoTag(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                codedOutputStream.writeSInt64(i6, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void D(int i6, List list, e5 e5Var) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((l0) e5Var).f2978a;
            int i10 = 0;
            if (list instanceof LazyStringList) {
                LazyStringList lazyStringList = (LazyStringList) list;
                while (i10 < list.size()) {
                    Object raw = lazyStringList.getRaw(i10);
                    if (raw instanceof String) {
                        codedOutputStream.writeString(i6, (String) raw);
                    } else {
                        codedOutputStream.writeBytes(i6, (ByteString) raw);
                    }
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                codedOutputStream.writeString(i6, (String) list.get(i10));
                i10++;
            }
        }
    }

    public static void E(int i6, List list, e5 e5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((l0) e5Var).f2978a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.writeTag(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += CodedOutputStream.computeUInt32SizeNoTag(((Integer) list.get(i12)).intValue());
                }
                codedOutputStream.writeUInt32NoTag(i11);
                while (i10 < list.size()) {
                    codedOutputStream.writeUInt32NoTag(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                codedOutputStream.writeUInt32(i6, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void F(int i6, List list, e5 e5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((l0) e5Var).f2978a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.writeTag(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += CodedOutputStream.computeUInt64SizeNoTag(((Long) list.get(i12)).longValue());
                }
                codedOutputStream.writeUInt32NoTag(i11);
                while (i10 < list.size()) {
                    codedOutputStream.writeUInt64NoTag(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                codedOutputStream.writeUInt64(i6, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static int a(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s1) {
            s1 s1Var = (s1) list;
            int i10 = 0;
            while (i6 < size) {
                i10 += CodedOutputStream.computeEnumSizeNoTag(s1Var.getInt(i6));
                i6++;
            }
            return i10;
        }
        int i11 = 0;
        while (i6 < size) {
            i11 += CodedOutputStream.computeEnumSizeNoTag(((Integer) list.get(i6)).intValue());
            i6++;
        }
        return i11;
    }

    public static int b(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.computeFixed32Size(i6, 0) * size;
    }

    public static int c(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.computeFixed64Size(i6, 0L) * size;
    }

    public static int d(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s1) {
            s1 s1Var = (s1) list;
            int i10 = 0;
            while (i6 < size) {
                i10 += CodedOutputStream.computeInt32SizeNoTag(s1Var.getInt(i6));
                i6++;
            }
            return i10;
        }
        int i11 = 0;
        while (i6 < size) {
            i11 += CodedOutputStream.computeInt32SizeNoTag(((Integer) list.get(i6)).intValue());
            i6++;
        }
        return i11;
    }

    public static int e(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof k2) {
            k2 k2Var = (k2) list;
            int i10 = 0;
            while (i6 < size) {
                i10 += CodedOutputStream.computeInt64SizeNoTag(k2Var.getLong(i6));
                i6++;
            }
            return i10;
        }
        int i11 = 0;
        while (i6 < size) {
            i11 += CodedOutputStream.computeInt64SizeNoTag(((Long) list.get(i6)).longValue());
            i6++;
        }
        return i11;
    }

    public static int f(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s1) {
            s1 s1Var = (s1) list;
            int i10 = 0;
            while (i6 < size) {
                i10 += CodedOutputStream.computeSInt32SizeNoTag(s1Var.getInt(i6));
                i6++;
            }
            return i10;
        }
        int i11 = 0;
        while (i6 < size) {
            i11 += CodedOutputStream.computeSInt32SizeNoTag(((Integer) list.get(i6)).intValue());
            i6++;
        }
        return i11;
    }

    public static int g(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof k2) {
            k2 k2Var = (k2) list;
            int i10 = 0;
            while (i6 < size) {
                i10 += CodedOutputStream.computeSInt64SizeNoTag(k2Var.getLong(i6));
                i6++;
            }
            return i10;
        }
        int i11 = 0;
        while (i6 < size) {
            i11 += CodedOutputStream.computeSInt64SizeNoTag(((Long) list.get(i6)).longValue());
            i6++;
        }
        return i11;
    }

    public static int h(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s1) {
            s1 s1Var = (s1) list;
            int i10 = 0;
            while (i6 < size) {
                i10 += CodedOutputStream.computeUInt32SizeNoTag(s1Var.getInt(i6));
                i6++;
            }
            return i10;
        }
        int i11 = 0;
        while (i6 < size) {
            i11 += CodedOutputStream.computeUInt32SizeNoTag(((Integer) list.get(i6)).intValue());
            i6++;
        }
        return i11;
    }

    public static int i(List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof k2) {
            k2 k2Var = (k2) list;
            int i10 = 0;
            while (i6 < size) {
                i10 += CodedOutputStream.computeUInt64SizeNoTag(k2Var.getLong(i6));
                i6++;
            }
            return i10;
        }
        int i11 = 0;
        while (i6 < size) {
            i11 += CodedOutputStream.computeUInt64SizeNoTag(((Long) list.get(i6)).longValue());
            i6++;
        }
        return i11;
    }

    public static Object j(Object obj, int i6, AbstractList abstractList, Internal.EnumLiteMap enumLiteMap, Object obj2, j4 j4Var) {
        if (enumLiteMap == null) {
            return obj2;
        }
        int size = abstractList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Integer num = (Integer) abstractList.get(i11);
            int intValue = num.intValue();
            if (enumLiteMap.findValueByNumber(intValue) != null) {
                if (i11 != i10) {
                    abstractList.set(i10, num);
                }
                i10++;
            } else {
                obj2 = n(obj, i6, intValue, obj2, j4Var);
            }
        }
        if (i10 != size) {
            abstractList.subList(i10, size).clear();
        }
        return obj2;
    }

    public static Object k(Object obj, int i6, List list, Internal.EnumVerifier enumVerifier, Object obj2, j4 j4Var) {
        if (enumVerifier == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = (Integer) list.get(i11);
                int intValue = num.intValue();
                if (enumVerifier.isInRange(intValue)) {
                    if (i11 != i10) {
                        list.set(i10, num);
                    }
                    i10++;
                } else {
                    obj2 = n(obj, i6, intValue, obj2, j4Var);
                }
            }
            if (i10 != size) {
                list.subList(i10, size).clear();
            }
            return obj2;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue2 = ((Integer) it.next()).intValue();
            if (!enumVerifier.isInRange(intValue2)) {
                obj2 = n(obj, i6, intValue2, obj2, j4Var);
                it.remove();
            }
        }
        return obj2;
    }

    public static void l(j4 j4Var, Object obj, Object obj2) {
        ((k4) j4Var).getClass();
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        UnknownFieldSetLite unknownFieldSetLite2 = ((GeneratedMessageLite) obj2).unknownFields;
        if (!UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLite2)) {
            if (UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLite)) {
                unknownFieldSetLite = UnknownFieldSetLite.mutableCopyOf(unknownFieldSetLite, unknownFieldSetLite2);
            } else {
                unknownFieldSetLite = unknownFieldSetLite.mergeFrom(unknownFieldSetLite2);
            }
        }
        generatedMessageLite.unknownFields = unknownFieldSetLite;
    }

    public static boolean m(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static Object n(Object obj, int i6, int i10, Object obj2, j4 j4Var) {
        if (obj2 == null) {
            obj2 = j4Var.a(obj);
        }
        ((k4) j4Var).getClass();
        ((UnknownFieldSetLite) obj2).storeField(WireFormat.makeTag(i6, 0), Long.valueOf(i10));
        return obj2;
    }

    public static void o(int i6, List list, e5 e5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((l0) e5Var).f2978a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.writeTag(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += CodedOutputStream.computeBoolSizeNoTag(((Boolean) list.get(i12)).booleanValue());
                }
                codedOutputStream.writeUInt32NoTag(i11);
                while (i10 < list.size()) {
                    codedOutputStream.writeBoolNoTag(((Boolean) list.get(i10)).booleanValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                codedOutputStream.writeBool(i6, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
        }
    }

    public static void p(int i6, List list, e5 e5Var) {
        if (list != null && !list.isEmpty()) {
            l0 l0Var = (l0) e5Var;
            l0Var.getClass();
            for (int i10 = 0; i10 < list.size(); i10++) {
                l0Var.f2978a.writeBytes(i6, (ByteString) list.get(i10));
            }
        }
    }

    public static void q(int i6, List list, e5 e5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((l0) e5Var).f2978a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.writeTag(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += CodedOutputStream.computeDoubleSizeNoTag(((Double) list.get(i12)).doubleValue());
                }
                codedOutputStream.writeUInt32NoTag(i11);
                while (i10 < list.size()) {
                    codedOutputStream.writeDoubleNoTag(((Double) list.get(i10)).doubleValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                codedOutputStream.writeDouble(i6, ((Double) list.get(i10)).doubleValue());
                i10++;
            }
        }
    }

    public static void r(int i6, List list, e5 e5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((l0) e5Var).f2978a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.writeTag(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += CodedOutputStream.computeEnumSizeNoTag(((Integer) list.get(i12)).intValue());
                }
                codedOutputStream.writeUInt32NoTag(i11);
                while (i10 < list.size()) {
                    codedOutputStream.writeEnumNoTag(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                codedOutputStream.writeEnum(i6, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void s(int i6, List list, e5 e5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((l0) e5Var).f2978a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.writeTag(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += CodedOutputStream.computeFixed32SizeNoTag(((Integer) list.get(i12)).intValue());
                }
                codedOutputStream.writeUInt32NoTag(i11);
                while (i10 < list.size()) {
                    codedOutputStream.writeFixed32NoTag(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                codedOutputStream.writeFixed32(i6, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void t(int i6, List list, e5 e5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((l0) e5Var).f2978a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.writeTag(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += CodedOutputStream.computeFixed64SizeNoTag(((Long) list.get(i12)).longValue());
                }
                codedOutputStream.writeUInt32NoTag(i11);
                while (i10 < list.size()) {
                    codedOutputStream.writeFixed64NoTag(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                codedOutputStream.writeFixed64(i6, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void u(int i6, List list, e5 e5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((l0) e5Var).f2978a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.writeTag(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += CodedOutputStream.computeFloatSizeNoTag(((Float) list.get(i12)).floatValue());
                }
                codedOutputStream.writeUInt32NoTag(i11);
                while (i10 < list.size()) {
                    codedOutputStream.writeFloatNoTag(((Float) list.get(i10)).floatValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                codedOutputStream.writeFloat(i6, ((Float) list.get(i10)).floatValue());
                i10++;
            }
        }
    }

    public static void v(int i6, List list, e5 e5Var, q3 q3Var) {
        if (list != null && !list.isEmpty()) {
            l0 l0Var = (l0) e5Var;
            l0Var.getClass();
            for (int i10 = 0; i10 < list.size(); i10++) {
                l0Var.d(i6, list.get(i10), q3Var);
            }
        }
    }

    public static void w(int i6, List list, e5 e5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((l0) e5Var).f2978a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.writeTag(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += CodedOutputStream.computeInt32SizeNoTag(((Integer) list.get(i12)).intValue());
                }
                codedOutputStream.writeUInt32NoTag(i11);
                while (i10 < list.size()) {
                    codedOutputStream.writeInt32NoTag(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                codedOutputStream.writeInt32(i6, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void x(int i6, List list, e5 e5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((l0) e5Var).f2978a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.writeTag(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += CodedOutputStream.computeInt64SizeNoTag(((Long) list.get(i12)).longValue());
                }
                codedOutputStream.writeUInt32NoTag(i11);
                while (i10 < list.size()) {
                    codedOutputStream.writeInt64NoTag(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                codedOutputStream.writeInt64(i6, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void y(int i6, List list, e5 e5Var, q3 q3Var) {
        if (list != null && !list.isEmpty()) {
            l0 l0Var = (l0) e5Var;
            l0Var.getClass();
            for (int i10 = 0; i10 < list.size(); i10++) {
                l0Var.g(i6, list.get(i10), q3Var);
            }
        }
    }

    public static void z(int i6, List list, e5 e5Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            CodedOutputStream codedOutputStream = ((l0) e5Var).f2978a;
            int i10 = 0;
            if (z10) {
                codedOutputStream.writeTag(i6, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += CodedOutputStream.computeSFixed32SizeNoTag(((Integer) list.get(i12)).intValue());
                }
                codedOutputStream.writeUInt32NoTag(i11);
                while (i10 < list.size()) {
                    codedOutputStream.writeSFixed32NoTag(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                codedOutputStream.writeSFixed32(i6, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }
}

package com.google.protobuf;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class FieldType {
    private static final /* synthetic */ FieldType[] $VALUES;
    public static final FieldType BOOL;
    public static final FieldType BOOL_LIST;
    public static final FieldType BOOL_LIST_PACKED;
    public static final FieldType BYTES;
    public static final FieldType BYTES_LIST;
    public static final FieldType DOUBLE;
    public static final FieldType DOUBLE_LIST;
    public static final FieldType DOUBLE_LIST_PACKED;
    private static final java.lang.reflect.Type[] EMPTY_TYPES;
    public static final FieldType ENUM;
    public static final FieldType ENUM_LIST;
    public static final FieldType ENUM_LIST_PACKED;
    public static final FieldType FIXED32;
    public static final FieldType FIXED32_LIST;
    public static final FieldType FIXED32_LIST_PACKED;
    public static final FieldType FIXED64;
    public static final FieldType FIXED64_LIST;
    public static final FieldType FIXED64_LIST_PACKED;
    public static final FieldType FLOAT;
    public static final FieldType FLOAT_LIST;
    public static final FieldType FLOAT_LIST_PACKED;
    public static final FieldType GROUP;
    public static final FieldType GROUP_LIST;
    public static final FieldType INT32;
    public static final FieldType INT32_LIST;
    public static final FieldType INT32_LIST_PACKED;
    public static final FieldType INT64;
    public static final FieldType INT64_LIST;
    public static final FieldType INT64_LIST_PACKED;
    public static final FieldType MAP;
    public static final FieldType MESSAGE;
    public static final FieldType MESSAGE_LIST;
    public static final FieldType SFIXED32;
    public static final FieldType SFIXED32_LIST;
    public static final FieldType SFIXED32_LIST_PACKED;
    public static final FieldType SFIXED64;
    public static final FieldType SFIXED64_LIST;
    public static final FieldType SFIXED64_LIST_PACKED;
    public static final FieldType SINT32;
    public static final FieldType SINT32_LIST;
    public static final FieldType SINT32_LIST_PACKED;
    public static final FieldType SINT64;
    public static final FieldType SINT64_LIST;
    public static final FieldType SINT64_LIST_PACKED;
    public static final FieldType STRING;
    public static final FieldType STRING_LIST;
    public static final FieldType UINT32;
    public static final FieldType UINT32_LIST;
    public static final FieldType UINT32_LIST_PACKED;
    public static final FieldType UINT64;
    public static final FieldType UINT64_LIST;
    public static final FieldType UINT64_LIST_PACKED;
    private static final FieldType[] VALUES;
    private final k1 collection;
    private final Class<?> elementType;

    /* renamed from: id, reason: collision with root package name */
    private final int f2861id;
    private final JavaType javaType;
    private final boolean primitiveScalar;

    static {
        JavaType javaType = JavaType.DOUBLE;
        k1 k1Var = k1.SCALAR;
        FieldType fieldType = new FieldType("DOUBLE", 0, 0, k1Var, javaType);
        DOUBLE = fieldType;
        JavaType javaType2 = JavaType.FLOAT;
        FieldType fieldType2 = new FieldType("FLOAT", 1, 1, k1Var, javaType2);
        FLOAT = fieldType2;
        JavaType javaType3 = JavaType.LONG;
        FieldType fieldType3 = new FieldType("INT64", 2, 2, k1Var, javaType3);
        INT64 = fieldType3;
        FieldType fieldType4 = new FieldType("UINT64", 3, 3, k1Var, javaType3);
        UINT64 = fieldType4;
        JavaType javaType4 = JavaType.INT;
        FieldType fieldType5 = new FieldType("INT32", 4, 4, k1Var, javaType4);
        INT32 = fieldType5;
        FieldType fieldType6 = new FieldType("FIXED64", 5, 5, k1Var, javaType3);
        FIXED64 = fieldType6;
        FieldType fieldType7 = new FieldType("FIXED32", 6, 6, k1Var, javaType4);
        FIXED32 = fieldType7;
        JavaType javaType5 = JavaType.BOOLEAN;
        FieldType fieldType8 = new FieldType("BOOL", 7, 7, k1Var, javaType5);
        BOOL = fieldType8;
        JavaType javaType6 = JavaType.STRING;
        FieldType fieldType9 = new FieldType("STRING", 8, 8, k1Var, javaType6);
        STRING = fieldType9;
        JavaType javaType7 = JavaType.MESSAGE;
        FieldType fieldType10 = new FieldType("MESSAGE", 9, 9, k1Var, javaType7);
        MESSAGE = fieldType10;
        JavaType javaType8 = JavaType.BYTE_STRING;
        FieldType fieldType11 = new FieldType("BYTES", 10, 10, k1Var, javaType8);
        BYTES = fieldType11;
        FieldType fieldType12 = new FieldType("UINT32", 11, 11, k1Var, javaType4);
        UINT32 = fieldType12;
        JavaType javaType9 = JavaType.ENUM;
        FieldType fieldType13 = new FieldType("ENUM", 12, 12, k1Var, javaType9);
        ENUM = fieldType13;
        FieldType fieldType14 = new FieldType("SFIXED32", 13, 13, k1Var, javaType4);
        SFIXED32 = fieldType14;
        FieldType fieldType15 = new FieldType("SFIXED64", 14, 14, k1Var, javaType3);
        SFIXED64 = fieldType15;
        FieldType fieldType16 = new FieldType("SINT32", 15, 15, k1Var, javaType4);
        SINT32 = fieldType16;
        FieldType fieldType17 = new FieldType("SINT64", 16, 16, k1Var, javaType3);
        SINT64 = fieldType17;
        FieldType fieldType18 = new FieldType("GROUP", 17, 17, k1Var, javaType7);
        GROUP = fieldType18;
        k1 k1Var2 = k1.VECTOR;
        FieldType fieldType19 = new FieldType("DOUBLE_LIST", 18, 18, k1Var2, javaType);
        DOUBLE_LIST = fieldType19;
        FieldType fieldType20 = new FieldType("FLOAT_LIST", 19, 19, k1Var2, javaType2);
        FLOAT_LIST = fieldType20;
        FieldType fieldType21 = new FieldType("INT64_LIST", 20, 20, k1Var2, javaType3);
        INT64_LIST = fieldType21;
        FieldType fieldType22 = new FieldType("UINT64_LIST", 21, 21, k1Var2, javaType3);
        UINT64_LIST = fieldType22;
        FieldType fieldType23 = new FieldType("INT32_LIST", 22, 22, k1Var2, javaType4);
        INT32_LIST = fieldType23;
        FieldType fieldType24 = new FieldType("FIXED64_LIST", 23, 23, k1Var2, javaType3);
        FIXED64_LIST = fieldType24;
        FieldType fieldType25 = new FieldType("FIXED32_LIST", 24, 24, k1Var2, javaType4);
        FIXED32_LIST = fieldType25;
        FieldType fieldType26 = new FieldType("BOOL_LIST", 25, 25, k1Var2, javaType5);
        BOOL_LIST = fieldType26;
        FieldType fieldType27 = new FieldType("STRING_LIST", 26, 26, k1Var2, javaType6);
        STRING_LIST = fieldType27;
        FieldType fieldType28 = new FieldType("MESSAGE_LIST", 27, 27, k1Var2, javaType7);
        MESSAGE_LIST = fieldType28;
        FieldType fieldType29 = new FieldType("BYTES_LIST", 28, 28, k1Var2, javaType8);
        BYTES_LIST = fieldType29;
        FieldType fieldType30 = new FieldType("UINT32_LIST", 29, 29, k1Var2, javaType4);
        UINT32_LIST = fieldType30;
        FieldType fieldType31 = new FieldType("ENUM_LIST", 30, 30, k1Var2, javaType9);
        ENUM_LIST = fieldType31;
        FieldType fieldType32 = new FieldType("SFIXED32_LIST", 31, 31, k1Var2, javaType4);
        SFIXED32_LIST = fieldType32;
        FieldType fieldType33 = new FieldType("SFIXED64_LIST", 32, 32, k1Var2, javaType3);
        SFIXED64_LIST = fieldType33;
        FieldType fieldType34 = new FieldType("SINT32_LIST", 33, 33, k1Var2, javaType4);
        SINT32_LIST = fieldType34;
        FieldType fieldType35 = new FieldType("SINT64_LIST", 34, 34, k1Var2, javaType3);
        SINT64_LIST = fieldType35;
        k1 k1Var3 = k1.PACKED_VECTOR;
        FieldType fieldType36 = new FieldType("DOUBLE_LIST_PACKED", 35, 35, k1Var3, javaType);
        DOUBLE_LIST_PACKED = fieldType36;
        FieldType fieldType37 = new FieldType("FLOAT_LIST_PACKED", 36, 36, k1Var3, javaType2);
        FLOAT_LIST_PACKED = fieldType37;
        FieldType fieldType38 = new FieldType("INT64_LIST_PACKED", 37, 37, k1Var3, javaType3);
        INT64_LIST_PACKED = fieldType38;
        FieldType fieldType39 = new FieldType("UINT64_LIST_PACKED", 38, 38, k1Var3, javaType3);
        UINT64_LIST_PACKED = fieldType39;
        FieldType fieldType40 = new FieldType("INT32_LIST_PACKED", 39, 39, k1Var3, javaType4);
        INT32_LIST_PACKED = fieldType40;
        FieldType fieldType41 = new FieldType("FIXED64_LIST_PACKED", 40, 40, k1Var3, javaType3);
        FIXED64_LIST_PACKED = fieldType41;
        FieldType fieldType42 = new FieldType("FIXED32_LIST_PACKED", 41, 41, k1Var3, javaType4);
        FIXED32_LIST_PACKED = fieldType42;
        FieldType fieldType43 = new FieldType("BOOL_LIST_PACKED", 42, 42, k1Var3, javaType5);
        BOOL_LIST_PACKED = fieldType43;
        FieldType fieldType44 = new FieldType("UINT32_LIST_PACKED", 43, 43, k1Var3, javaType4);
        UINT32_LIST_PACKED = fieldType44;
        FieldType fieldType45 = new FieldType("ENUM_LIST_PACKED", 44, 44, k1Var3, javaType9);
        ENUM_LIST_PACKED = fieldType45;
        FieldType fieldType46 = new FieldType("SFIXED32_LIST_PACKED", 45, 45, k1Var3, javaType4);
        SFIXED32_LIST_PACKED = fieldType46;
        FieldType fieldType47 = new FieldType("SFIXED64_LIST_PACKED", 46, 46, k1Var3, javaType3);
        SFIXED64_LIST_PACKED = fieldType47;
        FieldType fieldType48 = new FieldType("SINT32_LIST_PACKED", 47, 47, k1Var3, javaType4);
        SINT32_LIST_PACKED = fieldType48;
        FieldType fieldType49 = new FieldType("SINT64_LIST_PACKED", 48, 48, k1Var3, javaType3);
        SINT64_LIST_PACKED = fieldType49;
        FieldType fieldType50 = new FieldType("GROUP_LIST", 49, 49, k1Var2, javaType7);
        GROUP_LIST = fieldType50;
        FieldType fieldType51 = new FieldType("MAP", 50, 50, k1.MAP, JavaType.VOID);
        MAP = fieldType51;
        $VALUES = new FieldType[]{fieldType, fieldType2, fieldType3, fieldType4, fieldType5, fieldType6, fieldType7, fieldType8, fieldType9, fieldType10, fieldType11, fieldType12, fieldType13, fieldType14, fieldType15, fieldType16, fieldType17, fieldType18, fieldType19, fieldType20, fieldType21, fieldType22, fieldType23, fieldType24, fieldType25, fieldType26, fieldType27, fieldType28, fieldType29, fieldType30, fieldType31, fieldType32, fieldType33, fieldType34, fieldType35, fieldType36, fieldType37, fieldType38, fieldType39, fieldType40, fieldType41, fieldType42, fieldType43, fieldType44, fieldType45, fieldType46, fieldType47, fieldType48, fieldType49, fieldType50, fieldType51};
        EMPTY_TYPES = new java.lang.reflect.Type[0];
        FieldType[] values = values();
        VALUES = new FieldType[values.length];
        for (FieldType fieldType52 : values) {
            VALUES[fieldType52.f2861id] = fieldType52;
        }
    }

    private FieldType(String str, int i6, int i10, k1 k1Var, JavaType javaType) {
        int i11;
        this.f2861id = i10;
        this.collection = k1Var;
        this.javaType = javaType;
        int ordinal = k1Var.ordinal();
        if (ordinal != 1) {
            if (ordinal != 3) {
                this.elementType = null;
            } else {
                this.elementType = javaType.getBoxedType();
            }
        } else {
            this.elementType = javaType.getBoxedType();
        }
        this.primitiveScalar = (k1Var != k1.SCALAR || (i11 = j1.f2956b[javaType.ordinal()]) == 1 || i11 == 2 || i11 == 3) ? false : true;
    }

    public static FieldType forId(int i6) {
        if (i6 >= 0) {
            FieldType[] fieldTypeArr = VALUES;
            if (i6 < fieldTypeArr.length) {
                return fieldTypeArr[i6];
            }
            return null;
        }
        return null;
    }

    private static java.lang.reflect.Type getGenericSuperList(Class<?> cls) {
        for (java.lang.reflect.Type type : cls.getGenericInterfaces()) {
            if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        java.lang.reflect.Type genericSuperclass = cls.getGenericSuperclass();
        if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private static java.lang.reflect.Type getListParameter(Class<?> cls, java.lang.reflect.Type[] typeArr) {
        while (true) {
            int i6 = 0;
            if (cls != List.class) {
                java.lang.reflect.Type genericSuperList = getGenericSuperList(cls);
                if (genericSuperList instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) genericSuperList;
                    java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
                        java.lang.reflect.Type type = actualTypeArguments[i10];
                        if (type instanceof TypeVariable) {
                            TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                            if (typeArr.length == typeParameters.length) {
                                for (int i11 = 0; i11 < typeParameters.length; i11++) {
                                    if (type == typeParameters[i11]) {
                                        actualTypeArguments[i10] = typeArr[i11];
                                    }
                                }
                                throw new RuntimeException("Unable to find replacement for " + type);
                            }
                            throw new RuntimeException("Type array mismatch");
                        }
                    }
                    cls = (Class) parameterizedType.getRawType();
                    typeArr = actualTypeArguments;
                } else {
                    typeArr = EMPTY_TYPES;
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length = interfaces.length;
                    while (true) {
                        if (i6 < length) {
                            Class<?> cls2 = interfaces[i6];
                            if (List.class.isAssignableFrom(cls2)) {
                                cls = cls2;
                                break;
                            }
                            i6++;
                        } else {
                            cls = cls.getSuperclass();
                            break;
                        }
                    }
                }
            } else {
                if (typeArr.length == 1) {
                    return typeArr[0];
                }
                throw new RuntimeException("Unable to identify parameter type for List<T>");
            }
        }
    }

    private boolean isValidForList(java.lang.reflect.Field field) {
        Class<?> type = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type)) {
            return false;
        }
        java.lang.reflect.Type[] typeArr = EMPTY_TYPES;
        if (field.getGenericType() instanceof ParameterizedType) {
            typeArr = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        java.lang.reflect.Type listParameter = getListParameter(type, typeArr);
        if (!(listParameter instanceof Class)) {
            return true;
        }
        return this.elementType.isAssignableFrom((Class) listParameter);
    }

    public static FieldType valueOf(String str) {
        return (FieldType) java.lang.Enum.valueOf(FieldType.class, str);
    }

    public static FieldType[] values() {
        return (FieldType[]) $VALUES.clone();
    }

    public JavaType getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.f2861id;
    }

    public boolean isList() {
        return this.collection.f2967x;
    }

    public boolean isMap() {
        if (this.collection == k1.MAP) {
            return true;
        }
        return false;
    }

    public boolean isPacked() {
        return k1.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        if (this.collection == k1.SCALAR) {
            return true;
        }
        return false;
    }

    public boolean isValidForField(java.lang.reflect.Field field) {
        if (k1.VECTOR.equals(this.collection)) {
            return isValidForList(field);
        }
        return this.javaType.getType().isAssignableFrom(field.getType());
    }
}

package com.google.protobuf;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class FieldInfo$Builder {
    private java.lang.reflect.Field cachedSizeField;
    private boolean enforceUtf8;
    private Internal.EnumVerifier enumVerifier;
    private java.lang.reflect.Field field;
    private int fieldNumber;
    private Object mapDefaultEntry;
    private f3 oneof;
    private Class<?> oneofStoredType;
    private java.lang.reflect.Field presenceField;
    private int presenceMask;
    private boolean required;
    private FieldType type;

    public /* synthetic */ FieldInfo$Builder(e1 e1Var) {
        this();
    }

    public f1 build() {
        Object obj = this.mapDefaultEntry;
        if (obj != null) {
            java.lang.reflect.Field field = this.field;
            int i6 = this.fieldNumber;
            Internal.EnumVerifier enumVerifier = this.enumVerifier;
            Internal.checkNotNull(obj, "mapDefaultEntry");
            f1.a(i6);
            Internal.checkNotNull(field, "field");
            return new f1(field, i6, FieldType.MAP, null, 0, false, true, obj, enumVerifier, null);
        }
        java.lang.reflect.Field field2 = this.presenceField;
        if (field2 != null) {
            if (this.required) {
                java.lang.reflect.Field field3 = this.field;
                int i10 = this.fieldNumber;
                FieldType fieldType = this.type;
                int i11 = this.presenceMask;
                boolean z10 = this.enforceUtf8;
                Internal.EnumVerifier enumVerifier2 = this.enumVerifier;
                f1.a(i10);
                Internal.checkNotNull(field3, "field");
                Internal.checkNotNull(fieldType, "fieldType");
                Internal.checkNotNull(field2, "presenceField");
                if (i11 != 0 && ((i11 - 1) & i11) == 0) {
                    return new f1(field3, i10, fieldType, field2, i11, true, z10, null, enumVerifier2, null);
                }
                throw new IllegalArgumentException(h8.c.i(i11, "presenceMask must have exactly one bit set: "));
            }
            java.lang.reflect.Field field4 = this.field;
            int i12 = this.fieldNumber;
            FieldType fieldType2 = this.type;
            int i13 = this.presenceMask;
            boolean z11 = this.enforceUtf8;
            Internal.EnumVerifier enumVerifier3 = this.enumVerifier;
            f1.a(i12);
            Internal.checkNotNull(field4, "field");
            Internal.checkNotNull(fieldType2, "fieldType");
            Internal.checkNotNull(field2, "presenceField");
            if (i13 != 0 && ((i13 - 1) & i13) == 0) {
                return new f1(field4, i12, fieldType2, field2, i13, false, z11, null, enumVerifier3, null);
            }
            throw new IllegalArgumentException(h8.c.i(i13, "presenceMask must have exactly one bit set: "));
        }
        Internal.EnumVerifier enumVerifier4 = this.enumVerifier;
        if (enumVerifier4 != null) {
            java.lang.reflect.Field field5 = this.cachedSizeField;
            if (field5 == null) {
                java.lang.reflect.Field field6 = this.field;
                int i14 = this.fieldNumber;
                FieldType fieldType3 = this.type;
                f1.a(i14);
                Internal.checkNotNull(field6, "field");
                return new f1(field6, i14, fieldType3, null, 0, false, false, null, enumVerifier4, null);
            }
            java.lang.reflect.Field field7 = this.field;
            int i15 = this.fieldNumber;
            FieldType fieldType4 = this.type;
            f1.a(i15);
            Internal.checkNotNull(field7, "field");
            return new f1(field7, i15, fieldType4, null, 0, false, false, null, enumVerifier4, field5);
        }
        java.lang.reflect.Field field8 = this.cachedSizeField;
        if (field8 == null) {
            java.lang.reflect.Field field9 = this.field;
            int i16 = this.fieldNumber;
            FieldType fieldType5 = this.type;
            boolean z12 = this.enforceUtf8;
            f1.a(i16);
            Internal.checkNotNull(field9, "field");
            Internal.checkNotNull(fieldType5, "fieldType");
            if (fieldType5 != FieldType.MESSAGE_LIST && fieldType5 != FieldType.GROUP_LIST) {
                return new f1(field9, i16, fieldType5, null, 0, false, z12, null, null, null);
            }
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        java.lang.reflect.Field field10 = this.field;
        int i17 = this.fieldNumber;
        FieldType fieldType6 = this.type;
        f1.a(i17);
        Internal.checkNotNull(field10, "field");
        Internal.checkNotNull(fieldType6, "fieldType");
        if (fieldType6 != FieldType.MESSAGE_LIST && fieldType6 != FieldType.GROUP_LIST) {
            return new f1(field10, i17, fieldType6, null, 0, false, false, null, null, field8);
        }
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    public FieldInfo$Builder withCachedSizeField(java.lang.reflect.Field field) {
        this.cachedSizeField = field;
        return this;
    }

    public FieldInfo$Builder withEnforceUtf8(boolean z10) {
        this.enforceUtf8 = z10;
        return this;
    }

    public FieldInfo$Builder withEnumVerifier(Internal.EnumVerifier enumVerifier) {
        this.enumVerifier = enumVerifier;
        return this;
    }

    public FieldInfo$Builder withField(java.lang.reflect.Field field) {
        this.field = field;
        return this;
    }

    public FieldInfo$Builder withFieldNumber(int i6) {
        this.fieldNumber = i6;
        return this;
    }

    public FieldInfo$Builder withMapDefaultEntry(Object obj) {
        this.mapDefaultEntry = obj;
        return this;
    }

    public FieldInfo$Builder withOneof(f3 f3Var, Class<?> cls) {
        if (this.field == null && this.presenceField == null) {
            this.oneofStoredType = cls;
            return this;
        }
        throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
    }

    public FieldInfo$Builder withPresence(java.lang.reflect.Field field, int i6) {
        this.presenceField = (java.lang.reflect.Field) Internal.checkNotNull(field, "presenceField");
        this.presenceMask = i6;
        return this;
    }

    public FieldInfo$Builder withRequired(boolean z10) {
        this.required = z10;
        return this;
    }

    public FieldInfo$Builder withType(FieldType fieldType) {
        this.type = fieldType;
        return this;
    }

    private FieldInfo$Builder() {
    }
}

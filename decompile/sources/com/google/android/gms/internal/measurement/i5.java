package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
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
public final class i5 {
    public static final i5[] A;
    public static final /* synthetic */ i5[] B;

    /* renamed from: y, reason: collision with root package name */
    public static final i5 f2257y;

    /* renamed from: z, reason: collision with root package name */
    public static final i5 f2258z;

    /* renamed from: x, reason: collision with root package name */
    public final int f2259x;

    /* JADX INFO: Fake field, exist only in values array */
    i5 EF0;

    static {
        w5 w5Var = w5.B;
        i5 i5Var = new i5("DOUBLE", 0, 0, 1, w5Var);
        w5 w5Var2 = w5.A;
        i5 i5Var2 = new i5("FLOAT", 1, 1, 1, w5Var2);
        w5 w5Var3 = w5.f2511z;
        i5 i5Var3 = new i5("INT64", 2, 2, 1, w5Var3);
        i5 i5Var4 = new i5("UINT64", 3, 3, 1, w5Var3);
        w5 w5Var4 = w5.f2510y;
        i5 i5Var5 = new i5("INT32", 4, 4, 1, w5Var4);
        i5 i5Var6 = new i5("FIXED64", 5, 5, 1, w5Var3);
        i5 i5Var7 = new i5("FIXED32", 6, 6, 1, w5Var4);
        w5 w5Var5 = w5.C;
        i5 i5Var8 = new i5("BOOL", 7, 7, 1, w5Var5);
        w5 w5Var6 = w5.D;
        i5 i5Var9 = new i5("STRING", 8, 8, 1, w5Var6);
        w5 w5Var7 = w5.G;
        i5 i5Var10 = new i5("MESSAGE", 9, 9, 1, w5Var7);
        w5 w5Var8 = w5.E;
        i5 i5Var11 = new i5("BYTES", 10, 10, 1, w5Var8);
        i5 i5Var12 = new i5("UINT32", 11, 11, 1, w5Var4);
        w5 w5Var9 = w5.F;
        i5 i5Var13 = new i5("ENUM", 12, 12, 1, w5Var9);
        i5 i5Var14 = new i5("SFIXED32", 13, 13, 1, w5Var4);
        i5 i5Var15 = new i5("SFIXED64", 14, 14, 1, w5Var3);
        i5 i5Var16 = new i5("SINT32", 15, 15, 1, w5Var4);
        i5 i5Var17 = new i5("SINT64", 16, 16, 1, w5Var3);
        i5 i5Var18 = new i5("GROUP", 17, 17, 1, w5Var7);
        i5 i5Var19 = new i5("DOUBLE_LIST", 18, 18, 2, w5Var);
        i5 i5Var20 = new i5("FLOAT_LIST", 19, 19, 2, w5Var2);
        i5 i5Var21 = new i5("INT64_LIST", 20, 20, 2, w5Var3);
        i5 i5Var22 = new i5("UINT64_LIST", 21, 21, 2, w5Var3);
        i5 i5Var23 = new i5("INT32_LIST", 22, 22, 2, w5Var4);
        i5 i5Var24 = new i5("FIXED64_LIST", 23, 23, 2, w5Var3);
        i5 i5Var25 = new i5("FIXED32_LIST", 24, 24, 2, w5Var4);
        i5 i5Var26 = new i5("BOOL_LIST", 25, 25, 2, w5Var5);
        i5 i5Var27 = new i5("STRING_LIST", 26, 26, 2, w5Var6);
        i5 i5Var28 = new i5("MESSAGE_LIST", 27, 27, 2, w5Var7);
        i5 i5Var29 = new i5("BYTES_LIST", 28, 28, 2, w5Var8);
        i5 i5Var30 = new i5("UINT32_LIST", 29, 29, 2, w5Var4);
        i5 i5Var31 = new i5("ENUM_LIST", 30, 30, 2, w5Var9);
        i5 i5Var32 = new i5("SFIXED32_LIST", 31, 31, 2, w5Var4);
        i5 i5Var33 = new i5("SFIXED64_LIST", 32, 32, 2, w5Var3);
        i5 i5Var34 = new i5("SINT32_LIST", 33, 33, 2, w5Var4);
        i5 i5Var35 = new i5("SINT64_LIST", 34, 34, 2, w5Var3);
        i5 i5Var36 = new i5("DOUBLE_LIST_PACKED", 35, 35, 3, w5Var);
        f2257y = i5Var36;
        i5 i5Var37 = new i5("FLOAT_LIST_PACKED", 36, 36, 3, w5Var2);
        i5 i5Var38 = new i5("INT64_LIST_PACKED", 37, 37, 3, w5Var3);
        i5 i5Var39 = new i5("UINT64_LIST_PACKED", 38, 38, 3, w5Var3);
        i5 i5Var40 = new i5("INT32_LIST_PACKED", 39, 39, 3, w5Var4);
        i5 i5Var41 = new i5("FIXED64_LIST_PACKED", 40, 40, 3, w5Var3);
        i5 i5Var42 = new i5("FIXED32_LIST_PACKED", 41, 41, 3, w5Var4);
        i5 i5Var43 = new i5("BOOL_LIST_PACKED", 42, 42, 3, w5Var5);
        i5 i5Var44 = new i5("UINT32_LIST_PACKED", 43, 43, 3, w5Var4);
        i5 i5Var45 = new i5("ENUM_LIST_PACKED", 44, 44, 3, w5Var9);
        i5 i5Var46 = new i5("SFIXED32_LIST_PACKED", 45, 45, 3, w5Var4);
        i5 i5Var47 = new i5("SFIXED64_LIST_PACKED", 46, 46, 3, w5Var3);
        i5 i5Var48 = new i5("SINT32_LIST_PACKED", 47, 47, 3, w5Var4);
        i5 i5Var49 = new i5("SINT64_LIST_PACKED", 48, 48, 3, w5Var3);
        f2258z = i5Var49;
        B = new i5[]{i5Var, i5Var2, i5Var3, i5Var4, i5Var5, i5Var6, i5Var7, i5Var8, i5Var9, i5Var10, i5Var11, i5Var12, i5Var13, i5Var14, i5Var15, i5Var16, i5Var17, i5Var18, i5Var19, i5Var20, i5Var21, i5Var22, i5Var23, i5Var24, i5Var25, i5Var26, i5Var27, i5Var28, i5Var29, i5Var30, i5Var31, i5Var32, i5Var33, i5Var34, i5Var35, i5Var36, i5Var37, i5Var38, i5Var39, i5Var40, i5Var41, i5Var42, i5Var43, i5Var44, i5Var45, i5Var46, i5Var47, i5Var48, i5Var49, new i5("GROUP_LIST", 49, 49, 2, w5Var7), new i5("MAP", 50, 50, 4, w5.f2509x)};
        i5[] values = values();
        A = new i5[values.length];
        for (i5 i5Var50 : values) {
            A[i5Var50.f2259x] = i5Var50;
        }
    }

    public i5(String str, int i6, int i10, int i11, w5 w5Var) {
        this.f2259x = i10;
        int i12 = i11 - 1;
        if (i12 != 1) {
            if (i12 == 3) {
                w5Var.getClass();
            }
        } else {
            w5Var.getClass();
        }
        if (i11 == 1) {
            w5 w5Var2 = w5.f2509x;
            w5Var.ordinal();
        }
    }

    public static i5[] values() {
        return (i5[]) B.clone();
    }
}

package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
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
public final class b7 {
    public static final b7 A;
    public static final /* synthetic */ b7[] B;

    /* renamed from: z, reason: collision with root package name */
    public static final b7 f2158z;

    /* renamed from: x, reason: collision with root package name */
    public final c7 f2159x;

    /* renamed from: y, reason: collision with root package name */
    public final int f2160y;

    /* JADX INFO: Fake field, exist only in values array */
    b7 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    b7 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    b7 EF2;

    static {
        b7 b7Var = new b7("DOUBLE", 0, c7.A, 1);
        b7 b7Var2 = new b7("FLOAT", 1, c7.f2173z, 5);
        c7 c7Var = c7.f2172y;
        b7 b7Var3 = new b7("INT64", 2, c7Var, 0);
        b7 b7Var4 = new b7("UINT64", 3, c7Var, 0);
        c7 c7Var2 = c7.f2171x;
        b7 b7Var5 = new b7("INT32", 4, c7Var2, 0);
        b7 b7Var6 = new b7("FIXED64", 5, c7Var, 1);
        b7 b7Var7 = new b7("FIXED32", 6, c7Var2, 5);
        b7 b7Var8 = new b7("BOOL", 7, c7.B, 0);
        b7 b7Var9 = new b7("STRING", 8, c7.C, 2);
        f2158z = b7Var9;
        c7 c7Var3 = c7.F;
        b7 b7Var10 = new b7("GROUP", 9, c7Var3, 3);
        A = b7Var10;
        B = new b7[]{b7Var, b7Var2, b7Var3, b7Var4, b7Var5, b7Var6, b7Var7, b7Var8, b7Var9, b7Var10, new b7("MESSAGE", 10, c7Var3, 2), new b7("BYTES", 11, c7.D, 2), new b7("UINT32", 12, c7Var2, 0), new b7("ENUM", 13, c7.E, 0), new b7("SFIXED32", 14, c7Var2, 5), new b7("SFIXED64", 15, c7Var, 1), new b7("SINT32", 16, c7Var2, 0), new b7("SINT64", 17, c7Var, 0)};
    }

    public b7(String str, int i6, c7 c7Var, int i10) {
        this.f2159x = c7Var;
        this.f2160y = i10;
    }

    public static b7[] values() {
        return (b7[]) B.clone();
    }
}

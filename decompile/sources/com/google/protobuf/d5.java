package com.google.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class d5 {

    /* renamed from: x, reason: collision with root package name */
    public static final a5 f2895x;

    /* renamed from: y, reason: collision with root package name */
    public static final b5 f2896y;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ d5[] f2897z;

    static {
        a5 a5Var = new a5();
        f2895x = a5Var;
        b5 b5Var = new b5();
        f2896y = b5Var;
        f2897z = new d5[]{a5Var, b5Var, new d5() { // from class: com.google.protobuf.c5
            @Override // com.google.protobuf.d5
            public final Object a(CodedInputStream codedInputStream) {
                return codedInputStream.readBytes();
            }
        }};
    }

    public static d5 valueOf(String str) {
        return (d5) java.lang.Enum.valueOf(d5.class, str);
    }

    public static d5[] values() {
        return (d5[]) f2897z.clone();
    }

    public abstract Object a(CodedInputStream codedInputStream);
}

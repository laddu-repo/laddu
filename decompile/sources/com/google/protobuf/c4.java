package com.google.protobuf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c4 implements s2 {

    /* renamed from: a, reason: collision with root package name */
    public final ProtoSyntax f2883a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2884b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f2885c;

    /* renamed from: d, reason: collision with root package name */
    public final f1[] f2886d;

    /* renamed from: e, reason: collision with root package name */
    public final MessageLite f2887e;

    public c4(ProtoSyntax protoSyntax, boolean z10, int[] iArr, f1[] f1VarArr, Object obj) {
        this.f2883a = protoSyntax;
        this.f2884b = z10;
        this.f2885c = iArr;
        this.f2886d = f1VarArr;
        this.f2887e = (MessageLite) Internal.checkNotNull(obj, "defaultInstance");
    }

    @Override // com.google.protobuf.s2
    public final boolean a() {
        return this.f2884b;
    }

    @Override // com.google.protobuf.s2
    public final MessageLite b() {
        return this.f2887e;
    }

    @Override // com.google.protobuf.s2
    public final ProtoSyntax getSyntax() {
        return this.f2883a;
    }
}

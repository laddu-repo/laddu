package com.google.protobuf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k3 implements s2 {

    /* renamed from: a, reason: collision with root package name */
    public final MessageLite f2971a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2972b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f2973c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2974d;

    public k3(MessageLite messageLite, String str, Object[] objArr) {
        this.f2971a = messageLite;
        this.f2972b = str;
        this.f2973c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f2974d = charAt;
            return;
        }
        int i6 = charAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 >= 55296) {
                i6 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            } else {
                this.f2974d = i6 | (charAt2 << i10);
                return;
            }
        }
    }

    @Override // com.google.protobuf.s2
    public final boolean a() {
        if ((this.f2974d & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.s2
    public final MessageLite b() {
        return this.f2971a;
    }

    @Override // com.google.protobuf.s2
    public final ProtoSyntax getSyntax() {
        int i6 = this.f2974d;
        if ((i6 & 1) != 0) {
            return ProtoSyntax.PROTO2;
        }
        if ((i6 & 4) == 4) {
            return ProtoSyntax.EDITIONS;
        }
        return ProtoSyntax.PROTO3;
    }
}

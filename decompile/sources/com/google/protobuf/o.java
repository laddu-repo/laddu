package com.google.protobuf;

import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2999a;

    @Override // com.google.protobuf.q
    public final byte[] a(byte[] bArr, int i6, int i10) {
        switch (this.f2999a) {
            case 0:
                return Arrays.copyOfRange(bArr, i6, i10 + i6);
            default:
                byte[] bArr2 = new byte[i10];
                System.arraycopy(bArr, i6, bArr2, 0, i10);
                return bArr2;
        }
    }
}

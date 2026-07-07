package com.google.protobuf;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l extends n {

    /* renamed from: x, reason: collision with root package name */
    public int f2975x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final int f2976y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ ByteString f2977z;

    public l(ByteString byteString) {
        this.f2977z = byteString;
        this.f2976y = byteString.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2975x < this.f2976y) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.ByteString.ByteIterator
    public final byte nextByte() {
        int i6 = this.f2975x;
        if (i6 < this.f2976y) {
            this.f2975x = i6 + 1;
            return this.f2977z.internalByteAt(i6);
        }
        throw new NoSuchElementException();
    }
}

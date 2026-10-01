package com.google.protobuf;

import com.google.protobuf.ByteString;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m3 extends n {

    /* renamed from: x, reason: collision with root package name */
    public final n3 f2989x;

    /* renamed from: y, reason: collision with root package name */
    public ByteString.ByteIterator f2990y = a();

    public m3(p3 p3Var) {
        this.f2989x = new n3(p3Var);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.protobuf.ByteString$ByteIterator] */
    public final ByteString.ByteIterator a() {
        n3 n3Var = this.f2989x;
        if (n3Var.hasNext()) {
            return n3Var.next().iterator2();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2990y != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.ByteString.ByteIterator
    public final byte nextByte() {
        ByteString.ByteIterator byteIterator = this.f2990y;
        if (byteIterator != null) {
            byte nextByte = byteIterator.nextByte();
            if (!this.f2990y.hasNext()) {
                this.f2990y = a();
            }
            return nextByte;
        }
        throw new NoSuchElementException();
    }
}

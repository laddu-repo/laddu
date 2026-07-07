package com.google.protobuf;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class t extends s {

    /* renamed from: x, reason: collision with root package name */
    public final byte[] f3049x;

    public t(byte[] bArr) {
        bArr.getClass();
        this.f3049x = bArr;
    }

    @Override // com.google.protobuf.s
    public final boolean a(s sVar, int i6, int i10) {
        if (i10 <= sVar.size()) {
            int i11 = i6 + i10;
            if (i11 <= sVar.size()) {
                if (sVar instanceof t) {
                    t tVar = (t) sVar;
                    byte[] bArr = tVar.f3049x;
                    int b10 = b() + i10;
                    int b11 = b();
                    int b12 = tVar.b() + i6;
                    while (b11 < b10) {
                        if (this.f3049x[b11] != bArr[b12]) {
                            return false;
                        }
                        b11++;
                        b12++;
                    }
                    return true;
                }
                return sVar.substring(i6, i11).equals(substring(0, i10));
            }
            StringBuilder p10 = r4.a.p(i6, i10, "Ran off end of other: ", ", ", ", ");
            p10.append(sVar.size());
            throw new IllegalArgumentException(p10.toString());
        }
        throw new IllegalArgumentException("Length too large: " + i10 + size());
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(this.f3049x, b(), size()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final List asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    public int b() {
        return 0;
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int i6) {
        return this.f3049x[i6];
    }

    @Override // com.google.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f3049x, b(), size());
    }

    @Override // com.google.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i6, int i10, int i11) {
        System.arraycopy(this.f3049x, i6, bArr, i10, i11);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof ByteString) && size() == ((ByteString) obj).size()) {
                if (size() == 0) {
                    return true;
                }
                if (obj instanceof t) {
                    t tVar = (t) obj;
                    int peekCachedHashCode = peekCachedHashCode();
                    int peekCachedHashCode2 = tVar.peekCachedHashCode();
                    if (peekCachedHashCode == 0 || peekCachedHashCode2 == 0 || peekCachedHashCode == peekCachedHashCode2) {
                        return a(tVar, 0, size());
                    }
                } else {
                    return obj.equals(this);
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.s, com.google.protobuf.ByteString
    public byte internalByteAt(int i6) {
        return this.f3049x[i6];
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isValidUtf8() {
        int b10 = b();
        return t4.f3054a.j(this.f3049x, b10, size() + b10);
    }

    @Override // com.google.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(this.f3049x, b(), size(), true);
    }

    @Override // com.google.protobuf.ByteString
    public final InputStream newInput() {
        return new ByteArrayInputStream(this.f3049x, b(), size());
    }

    @Override // com.google.protobuf.ByteString
    public final int partialHash(int i6, int i10, int i11) {
        return Internal.partialHash(i6, this.f3049x, b() + i10, i11);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialIsValidUtf8(int i6, int i10, int i11) {
        int b10 = b() + i10;
        return t4.f3054a.l(i6, this.f3049x, b10, i11 + b10);
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.f3049x.length;
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substring(int i6, int i10) {
        int checkRange = ByteString.checkRange(i6, i10, size());
        if (checkRange == 0) {
            return ByteString.EMPTY;
        }
        return new p(this.f3049x, b() + i6, checkRange);
    }

    @Override // com.google.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        return new String(this.f3049x, b(), size(), charset);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) {
        outputStream.write(toByteArray());
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i6, int i10) {
        outputStream.write(this.f3049x, b() + i6, i10);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(ByteOutput byteOutput) {
        byteOutput.writeLazy(this.f3049x, b(), size());
    }
}

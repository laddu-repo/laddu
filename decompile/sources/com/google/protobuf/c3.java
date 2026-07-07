package com.google.protobuf;

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c3 extends s {

    /* renamed from: x, reason: collision with root package name */
    public final ByteBuffer f2882x;

    public c3(ByteBuffer byteBuffer) {
        Internal.checkNotNull(byteBuffer, "buffer");
        this.f2882x = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    @Override // com.google.protobuf.s
    public final boolean a(s sVar, int i6, int i10) {
        return substring(0, i10).equals(sVar.substring(i6, i10 + i6));
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return this.f2882x.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final List asReadOnlyByteBufferList() {
        return Collections.singletonList(this.f2882x.asReadOnlyBuffer());
    }

    public final ByteBuffer b(int i6, int i10) {
        ByteBuffer byteBuffer = this.f2882x;
        if (i6 >= byteBuffer.position() && i10 <= byteBuffer.limit() && i6 <= i10) {
            ByteBuffer slice = byteBuffer.slice();
            slice.position(i6 - byteBuffer.position());
            slice.limit(i10 - byteBuffer.position());
            return slice;
        }
        throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i6), Integer.valueOf(i10)));
    }

    @Override // com.google.protobuf.ByteString
    public final byte byteAt(int i6) {
        try {
            return this.f2882x.get(i6);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f2882x.slice());
    }

    @Override // com.google.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i6, int i10, int i11) {
        ByteBuffer slice = this.f2882x.slice();
        slice.position(i6);
        slice.get(bArr, i10, i11);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        ByteBuffer byteBuffer = this.f2882x;
        if (byteBuffer.remaining() != byteString.size()) {
            return false;
        }
        if (byteBuffer.remaining() == 0) {
            return true;
        }
        if (obj instanceof c3) {
            return byteBuffer.equals(((c3) obj).f2882x);
        }
        if (obj instanceof p3) {
            return obj.equals(this);
        }
        return byteBuffer.equals(byteString.asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isValidUtf8() {
        s4 s4Var = t4.f3054a;
        ByteBuffer byteBuffer = this.f2882x;
        if (s4Var.k(0, byteBuffer.position(), byteBuffer.remaining(), byteBuffer) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(this.f2882x, true);
    }

    @Override // com.google.protobuf.ByteString
    public final InputStream newInput() {
        return new bg.j(this);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialHash(int i6, int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            i6 = (i6 * 31) + this.f2882x.get(i12);
        }
        return i6;
    }

    @Override // com.google.protobuf.ByteString
    public final int partialIsValidUtf8(int i6, int i10, int i11) {
        return t4.f3054a.k(i6, i10, i11 + i10, this.f2882x);
    }

    @Override // com.google.protobuf.ByteString
    public final int size() {
        return this.f2882x.remaining();
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substring(int i6, int i10) {
        try {
            return new c3(b(i6, i10));
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        byte[] byteArray;
        int length;
        int i6;
        ByteBuffer byteBuffer = this.f2882x;
        if (byteBuffer.hasArray()) {
            byteArray = byteBuffer.array();
            i6 = byteBuffer.position() + byteBuffer.arrayOffset();
            length = byteBuffer.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            i6 = 0;
        }
        return new String(byteArray, i6, length, charset);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) {
        outputStream.write(toByteArray());
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i6, int i10) {
        int length;
        WritableByteChannel writableByteChannel;
        ByteBuffer byteBuffer = this.f2882x;
        if (byteBuffer.hasArray()) {
            outputStream.write(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset() + i6, i10);
            return;
        }
        ByteBuffer b10 = b(i6, i10 + i6);
        ThreadLocal threadLocal = k.f2961a;
        int position = b10.position();
        try {
            if (b10.hasArray()) {
                outputStream.write(b10.array(), b10.arrayOffset() + b10.position(), b10.remaining());
            } else {
                long j = k.f2963c;
                byte[] bArr = null;
                if (j >= 0 && k.f2962b.isInstance(outputStream)) {
                    try {
                        writableByteChannel = (WritableByteChannel) q4.f3024c.m(j, outputStream);
                    } catch (ClassCastException unused) {
                        writableByteChannel = null;
                    }
                    if (writableByteChannel != null) {
                        writableByteChannel.write(b10);
                    }
                }
                int max = Math.max(b10.remaining(), 1024);
                ThreadLocal threadLocal2 = k.f2961a;
                SoftReference softReference = (SoftReference) threadLocal2.get();
                if (softReference != null) {
                    bArr = (byte[]) softReference.get();
                }
                if (bArr == null || ((length = bArr.length) < max && length < max * 0.5f)) {
                    bArr = new byte[max];
                    if (max <= 16384) {
                        threadLocal2.set(new SoftReference(bArr));
                    }
                }
                while (b10.hasRemaining()) {
                    int min = Math.min(b10.remaining(), bArr.length);
                    b10.get(bArr, 0, min);
                    outputStream.write(bArr, 0, min);
                }
            }
            b10.position(position);
        } catch (Throwable th) {
            b10.position(position);
            throw th;
        }
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(ByteOutput byteOutput) {
        byteOutput.writeLazy(this.f2882x.slice());
    }
}

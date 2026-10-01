package com.google.protobuf;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p3 extends ByteString {
    public static final int[] C = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public final int A;
    public final int B;

    /* renamed from: x, reason: collision with root package name */
    public final int f3016x;

    /* renamed from: y, reason: collision with root package name */
    public final ByteString f3017y;

    /* renamed from: z, reason: collision with root package name */
    public final ByteString f3018z;

    public p3(ByteString byteString, ByteString byteString2) {
        this.f3017y = byteString;
        this.f3018z = byteString2;
        int size = byteString.size();
        this.A = size;
        this.f3016x = byteString2.size() + size;
        this.B = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    public static int a(int i6) {
        if (i6 >= 47) {
            return Integer.MAX_VALUE;
        }
        return C[i6];
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final List asReadOnlyByteBufferList() {
        boolean z10;
        s sVar;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.B);
        arrayDeque.push(this);
        ByteString byteString = this.f3017y;
        while (byteString instanceof p3) {
            p3 p3Var = (p3) byteString;
            arrayDeque.push(p3Var);
            byteString = p3Var.f3017y;
        }
        s sVar2 = (s) byteString;
        while (true) {
            if (sVar2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (sVar2 == null) {
                    throw new NoSuchElementException();
                }
                while (true) {
                    if (arrayDeque.isEmpty()) {
                        sVar = null;
                        break;
                    }
                    ByteString byteString2 = ((p3) arrayDeque.pop()).f3018z;
                    while (byteString2 instanceof p3) {
                        p3 p3Var2 = (p3) byteString2;
                        arrayDeque.push(p3Var2);
                        byteString2 = p3Var2.f3017y;
                    }
                    sVar = (s) byteString2;
                    if (!sVar.isEmpty()) {
                        break;
                    }
                }
                arrayList.add(sVar2.asReadOnlyByteBuffer());
                sVar2 = sVar;
            } else {
                return arrayList;
            }
        }
    }

    @Override // com.google.protobuf.ByteString
    public final byte byteAt(int i6) {
        ByteString.checkIndex(i6, this.f3016x);
        return internalByteAt(i6);
    }

    @Override // com.google.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        this.f3017y.copyTo(byteBuffer);
        this.f3018z.copyTo(byteBuffer);
    }

    @Override // com.google.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i6, int i10, int i11) {
        int i12 = i6 + i11;
        ByteString byteString = this.f3017y;
        int i13 = this.A;
        if (i12 <= i13) {
            byteString.copyToInternal(bArr, i6, i10, i11);
            return;
        }
        ByteString byteString2 = this.f3018z;
        if (i6 >= i13) {
            byteString2.copyToInternal(bArr, i6 - i13, i10, i11);
            return;
        }
        int i14 = i13 - i6;
        byteString.copyToInternal(bArr, i6, i10, i14);
        byteString2.copyToInternal(bArr, 0, i10 + i14, i11 - i14);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean equals(Object obj) {
        boolean a10;
        if (obj != this) {
            if (obj instanceof ByteString) {
                ByteString byteString = (ByteString) obj;
                int size = byteString.size();
                int i6 = this.f3016x;
                if (i6 == size) {
                    if (i6 != 0) {
                        int peekCachedHashCode = peekCachedHashCode();
                        int peekCachedHashCode2 = byteString.peekCachedHashCode();
                        if (peekCachedHashCode == 0 || peekCachedHashCode2 == 0 || peekCachedHashCode == peekCachedHashCode2) {
                            n3 n3Var = new n3(this);
                            s next = n3Var.next();
                            n3 n3Var2 = new n3(byteString);
                            s next2 = n3Var2.next();
                            int i10 = 0;
                            int i11 = 0;
                            int i12 = 0;
                            while (true) {
                                int size2 = next.size() - i10;
                                int size3 = next2.size() - i11;
                                int min = Math.min(size2, size3);
                                if (i10 == 0) {
                                    a10 = next.a(next2, i11, min);
                                } else {
                                    a10 = next2.a(next, i10, min);
                                }
                                if (!a10) {
                                    break;
                                }
                                i12 += min;
                                if (i12 >= i6) {
                                    if (i12 == i6) {
                                        return true;
                                    }
                                    throw new IllegalStateException();
                                }
                                if (min == size2) {
                                    next = n3Var.next();
                                    i10 = 0;
                                } else {
                                    i10 += min;
                                }
                                if (min == size3) {
                                    next2 = n3Var2.next();
                                    i11 = 0;
                                } else {
                                    i11 += min;
                                }
                            }
                        }
                    } else {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.ByteString
    public final int getTreeDepth() {
        return this.B;
    }

    @Override // com.google.protobuf.ByteString
    public final byte internalByteAt(int i6) {
        int i10 = this.A;
        if (i6 < i10) {
            return this.f3017y.internalByteAt(i6);
        }
        return this.f3018z.internalByteAt(i6 - i10);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isBalanced() {
        if (this.f3016x >= a(this.B)) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isValidUtf8() {
        int partialIsValidUtf8 = this.f3017y.partialIsValidUtf8(0, 0, this.A);
        ByteString byteString = this.f3018z;
        if (byteString.partialIsValidUtf8(partialIsValidUtf8, 0, byteString.size()) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator */
    public final Iterator<Byte> iterator2() {
        return new m3(this);
    }

    @Override // com.google.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance((Iterable<ByteBuffer>) asReadOnlyByteBufferList(), true);
    }

    @Override // com.google.protobuf.ByteString
    public final InputStream newInput() {
        return new o3(this);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialHash(int i6, int i10, int i11) {
        int i12 = i10 + i11;
        ByteString byteString = this.f3017y;
        int i13 = this.A;
        if (i12 <= i13) {
            return byteString.partialHash(i6, i10, i11);
        }
        ByteString byteString2 = this.f3018z;
        if (i10 >= i13) {
            return byteString2.partialHash(i6, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return byteString2.partialHash(byteString.partialHash(i6, i10, i14), 0, i11 - i14);
    }

    @Override // com.google.protobuf.ByteString
    public final int partialIsValidUtf8(int i6, int i10, int i11) {
        int i12 = i10 + i11;
        ByteString byteString = this.f3017y;
        int i13 = this.A;
        if (i12 <= i13) {
            return byteString.partialIsValidUtf8(i6, i10, i11);
        }
        ByteString byteString2 = this.f3018z;
        if (i10 >= i13) {
            return byteString2.partialIsValidUtf8(i6, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return byteString2.partialIsValidUtf8(byteString.partialIsValidUtf8(i6, i10, i14), 0, i11 - i14);
    }

    @Override // com.google.protobuf.ByteString
    public final int size() {
        return this.f3016x;
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString substring(int i6, int i10) {
        int i11 = this.f3016x;
        int checkRange = ByteString.checkRange(i6, i10, i11);
        if (checkRange == 0) {
            return ByteString.EMPTY;
        }
        if (checkRange == i11) {
            return this;
        }
        ByteString byteString = this.f3017y;
        int i12 = this.A;
        if (i10 <= i12) {
            return byteString.substring(i6, i10);
        }
        ByteString byteString2 = this.f3018z;
        if (i6 >= i12) {
            return byteString2.substring(i6 - i12, i10 - i12);
        }
        return new p3(byteString.substring(i6), byteString2.substring(0, i10 - i12));
    }

    @Override // com.google.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) {
        this.f3017y.writeTo(outputStream);
        this.f3018z.writeTo(outputStream);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i6, int i10) {
        int i11 = i6 + i10;
        ByteString byteString = this.f3017y;
        int i12 = this.A;
        if (i11 <= i12) {
            byteString.writeToInternal(outputStream, i6, i10);
            return;
        }
        ByteString byteString2 = this.f3018z;
        if (i6 >= i12) {
            byteString2.writeToInternal(outputStream, i6 - i12, i10);
            return;
        }
        int i13 = i12 - i6;
        byteString.writeToInternal(outputStream, i6, i13);
        byteString2.writeToInternal(outputStream, 0, i10 - i13);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToReverse(ByteOutput byteOutput) {
        this.f3018z.writeToReverse(byteOutput);
        this.f3017y.writeToReverse(byteOutput);
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator, reason: avoid collision after fix types in other method */
    public final Iterator<Byte> iterator2() {
        return new m3(this);
    }

    @Override // com.google.protobuf.ByteString
    public final void writeTo(ByteOutput byteOutput) {
        this.f3017y.writeTo(byteOutput);
        this.f3018z.writeTo(byteOutput);
    }
}

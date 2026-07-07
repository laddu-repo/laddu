package com.google.protobuf;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final ByteString EMPTY = new t(Internal.EMPTY_BYTE_ARRAY);
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final Comparator<ByteString> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    private static final q byteArrayCopier;
    private static final long serialVersionUID = 1;
    private int hash = 0;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Comparator<com.google.protobuf.ByteString>] */
    static {
        o oVar;
        if (c.a()) {
            oVar = new o(1);
        } else {
            oVar = new o(0);
        }
        byteArrayCopier = oVar;
        UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = new Object();
    }

    private static ByteString balancedConcat(Iterator<ByteString> it, int i6) {
        if (i6 >= 1) {
            if (i6 == 1) {
                return it.next();
            }
            int i10 = i6 >>> 1;
            return balancedConcat(it, i10).concat(balancedConcat(it, i6 - i10));
        }
        throw new IllegalArgumentException(h8.c.j(i6, "length (", ") must be >= 1"));
    }

    public static void checkIndex(int i6, int i10) {
        if (((i10 - (i6 + 1)) | i6) < 0) {
            if (i6 < 0) {
                throw new ArrayIndexOutOfBoundsException(h8.c.i(i6, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(h8.c.l("Index > length: ", ", ", i6, i10));
        }
    }

    public static int checkRange(int i6, int i10, int i11) {
        int i12 = i10 - i6;
        if ((i6 | i10 | i12 | (i11 - i10)) < 0) {
            if (i6 >= 0) {
                if (i10 < i6) {
                    throw new IndexOutOfBoundsException(h8.c.l("Beginning index larger than ending index: ", ", ", i6, i10));
                }
                throw new IndexOutOfBoundsException(h8.c.l("End index: ", " >= ", i10, i11));
            }
            throw new IndexOutOfBoundsException(h8.c.j(i6, "Beginning index: ", " < 0"));
        }
        return i12;
    }

    public static ByteString copyFrom(byte[] bArr, int i6, int i10) {
        checkRange(i6, i6 + i10, bArr.length);
        return new t(byteArrayCopier.a(bArr, i6, i10));
    }

    public static ByteString copyFromUtf8(String str) {
        return new t(str.getBytes(Internal.UTF_8));
    }

    public static final ByteString empty() {
        return EMPTY;
    }

    private static int extractHexDigit(String str, int i6) {
        int hexDigit = hexDigit(str.charAt(i6));
        if (hexDigit != -1) {
            return hexDigit;
        }
        StringBuilder q9 = r4.a.q("Invalid hexString ", str, " must only contain [0-9a-fA-F] but contained ");
        q9.append(str.charAt(i6));
        q9.append(" at index ");
        q9.append(i6);
        throw new NumberFormatException(q9.toString());
    }

    public static ByteString fromHex(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i6 = 0; i6 < length; i6++) {
                int i10 = i6 * 2;
                bArr[i6] = (byte) (extractHexDigit(str, i10 + 1) | (extractHexDigit(str, i10) << 4));
            }
            return new t(bArr);
        }
        StringBuilder q9 = r4.a.q("Invalid hexString ", str, " of length ");
        q9.append(str.length());
        q9.append(" must be even.");
        throw new NumberFormatException(q9.toString());
    }

    private static int hexDigit(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'A' && c10 <= 'F') {
            return c10 - '7';
        }
        if (c10 >= 'a' && c10 <= 'f') {
            return c10 - 'W';
        }
        return -1;
    }

    public static r newCodedBuilder(int i6) {
        return new r(i6);
    }

    public static Output newOutput(int i6) {
        return new Output(i6);
    }

    private static ByteString readChunk(InputStream inputStream, int i6) {
        byte[] bArr = new byte[i6];
        int i10 = 0;
        while (i10 < i6) {
            int read = inputStream.read(bArr, i10, i6 - i10);
            if (read == -1) {
                break;
            }
            i10 += read;
        }
        if (i10 == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i10);
    }

    public static ByteString readFrom(InputStream inputStream) {
        return readFrom(inputStream, MIN_READ_FROM_CHUNK_SIZE, MAX_READ_FROM_CHUNK_SIZE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toInt(byte b10) {
        return b10 & 255;
    }

    private String truncateAndEscapeForDisplay() {
        if (size() <= 50) {
            return s4.h(this);
        }
        return s4.h(substring(0, 47)) + "...";
    }

    public static Comparator<ByteString> unsignedLexicographicalComparator() {
        return UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    }

    public static ByteString wrap(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return wrap(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        }
        return new c3(byteBuffer);
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i6);

    public final ByteString concat(ByteString byteString) {
        if (Integer.MAX_VALUE - size() >= byteString.size()) {
            if (byteString.size() == 0) {
                return this;
            }
            if (size() == 0) {
                return byteString;
            }
            int size = byteString.size() + size();
            if (size < 128) {
                int size2 = size();
                int size3 = byteString.size();
                byte[] bArr = new byte[size2 + size3];
                copyTo(bArr, 0, 0, size2);
                byteString.copyTo(bArr, 0, size2, size3);
                return wrap(bArr);
            }
            if (this instanceof p3) {
                p3 p3Var = (p3) this;
                ByteString byteString2 = p3Var.f3018z;
                int size4 = byteString.size() + byteString2.size();
                ByteString byteString3 = p3Var.f3017y;
                if (size4 < 128) {
                    int size5 = byteString2.size();
                    int size6 = byteString.size();
                    byte[] bArr2 = new byte[size5 + size6];
                    byteString2.copyTo(bArr2, 0, 0, size5);
                    byteString.copyTo(bArr2, 0, size5, size6);
                    return new p3(byteString3, wrap(bArr2));
                }
                if (byteString3.getTreeDepth() > byteString2.getTreeDepth() && p3Var.B > byteString.getTreeDepth()) {
                    return new p3(byteString3, new p3(byteString2, byteString));
                }
            }
            if (size >= p3.a(Math.max(getTreeDepth(), byteString.getTreeDepth()) + 1)) {
                return new p3(this, byteString);
            }
            n2 n2Var = new n2(1);
            n2Var.a(this);
            n2Var.a(byteString);
            ArrayDeque arrayDeque = (ArrayDeque) n2Var.f2995a;
            ByteString byteString4 = (ByteString) arrayDeque.pop();
            while (!arrayDeque.isEmpty()) {
                byteString4 = new p3((ByteString) arrayDeque.pop(), byteString4);
            }
            return byteString4;
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + byteString.size());
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    public void copyTo(byte[] bArr, int i6) {
        copyTo(bArr, 0, i6, size());
    }

    public abstract void copyToInternal(byte[] bArr, int i6, int i10, int i11);

    public final boolean endsWith(ByteString byteString) {
        if (size() >= byteString.size() && substring(size() - byteString.size()).equals(byteString)) {
            return true;
        }
        return false;
    }

    public abstract boolean equals(Object obj);

    public abstract int getTreeDepth();

    public final int hashCode() {
        int i6 = this.hash;
        if (i6 == 0) {
            int size = size();
            i6 = partialHash(size, 0, size);
            if (i6 == 0) {
                i6 = 1;
            }
            this.hash = i6;
        }
        return i6;
    }

    public abstract byte internalByteAt(int i6);

    public abstract boolean isBalanced();

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public abstract boolean isValidUtf8();

    public abstract CodedInputStream newCodedInput();

    public abstract InputStream newInput();

    public abstract int partialHash(int i6, int i10, int i11);

    public abstract int partialIsValidUtf8(int i6, int i10, int i11);

    public final int peekCachedHashCode() {
        return this.hash;
    }

    public abstract int size();

    public final boolean startsWith(ByteString byteString) {
        if (size() < byteString.size() || !substring(0, byteString.size()).equals(byteString)) {
            return false;
        }
        return true;
    }

    public final ByteString substring(int i6) {
        return substring(i6, size());
    }

    public abstract ByteString substring(int i6, int i10);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString(String str) {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e10) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e10);
            throw unsupportedEncodingException;
        }
    }

    public abstract String toStringInternal(Charset charset);

    public final String toStringUtf8() {
        return toString(Internal.UTF_8);
    }

    public abstract void writeTo(ByteOutput byteOutput);

    public abstract void writeTo(OutputStream outputStream);

    public final void writeTo(OutputStream outputStream, int i6, int i10) {
        checkRange(i6, i6 + i10, size());
        if (i10 > 0) {
            writeToInternal(outputStream, i6, i10);
        }
    }

    public abstract void writeToInternal(OutputStream outputStream, int i6, int i10);

    public abstract void writeToReverse(ByteOutput byteOutput);

    public static Output newOutput() {
        return new Output(128);
    }

    public static ByteString readFrom(InputStream inputStream, int i6) {
        return readFrom(inputStream, i6, i6);
    }

    @Deprecated
    public final void copyTo(byte[] bArr, int i6, int i10, int i11) {
        checkRange(i6, i6 + i11, size());
        checkRange(i10, i10 + i11, bArr.length);
        if (i11 > 0) {
            copyToInternal(bArr, i6, i10, i11);
        }
    }

    @Override // java.lang.Iterable
    /* renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public Iterator<Byte> iterator2() {
        return new l(this);
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteString readFrom(InputStream inputStream, int i6, int i10) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            ByteString readChunk = readChunk(inputStream, i6);
            if (readChunk == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(readChunk);
            i6 = Math.min(i6 * 2, i10);
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Output extends OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
        private byte[] buffer;
        private int bufferPos;
        private final ArrayList<ByteString> flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        public Output(int i6) {
            if (i6 >= 0) {
                this.initialCapacity = i6;
                this.flushedBuffers = new ArrayList<>();
                this.buffer = new byte[i6];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        private void flushFullBuffer(int i6) {
            this.flushedBuffers.add(new t(this.buffer));
            int length = this.flushedBuffersTotalBytes + this.buffer.length;
            this.flushedBuffersTotalBytes = length;
            this.buffer = new byte[Math.max(this.initialCapacity, Math.max(i6, length >>> 1))];
            this.bufferPos = 0;
        }

        private void flushLastBuffer() {
            int i6 = this.bufferPos;
            byte[] bArr = this.buffer;
            if (i6 < bArr.length) {
                if (i6 > 0) {
                    this.flushedBuffers.add(new t(Arrays.copyOf(bArr, i6)));
                }
            } else {
                this.flushedBuffers.add(new t(this.buffer));
                this.buffer = EMPTY_BYTE_ARRAY;
            }
            this.flushedBuffersTotalBytes += this.bufferPos;
            this.bufferPos = 0;
        }

        public synchronized void reset() {
            this.flushedBuffers.clear();
            this.flushedBuffersTotalBytes = 0;
            this.bufferPos = 0;
        }

        public synchronized int size() {
            return this.flushedBuffersTotalBytes + this.bufferPos;
        }

        public synchronized ByteString toByteString() {
            flushLastBuffer();
            return ByteString.copyFrom(this.flushedBuffers);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i6) {
            try {
                if (this.bufferPos == this.buffer.length) {
                    flushFullBuffer(1);
                }
                byte[] bArr = this.buffer;
                int i10 = this.bufferPos;
                this.bufferPos = i10 + 1;
                bArr[i10] = (byte) i6;
            } catch (Throwable th) {
                throw th;
            }
        }

        public void writeTo(OutputStream outputStream) {
            int i6;
            ByteString[] byteStringArr;
            byte[] bArr;
            int i10;
            synchronized (this) {
                byteStringArr = (ByteString[]) this.flushedBuffers.toArray(new ByteString[0]);
                bArr = this.buffer;
                i10 = this.bufferPos;
            }
            for (ByteString byteString : byteStringArr) {
                byteString.writeTo(outputStream);
            }
            outputStream.write(Arrays.copyOf(bArr, i10));
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i6, int i10) {
            try {
                byte[] bArr2 = this.buffer;
                int length = bArr2.length;
                int i11 = this.bufferPos;
                if (i10 <= length - i11) {
                    System.arraycopy(bArr, i6, bArr2, i11, i10);
                    this.bufferPos += i10;
                } else {
                    int length2 = bArr2.length - i11;
                    System.arraycopy(bArr, i6, bArr2, i11, length2);
                    int i12 = i10 - length2;
                    flushFullBuffer(i12);
                    System.arraycopy(bArr, i6 + length2, this.buffer, 0, i12);
                    this.bufferPos = i12;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer, int i6) {
        checkRange(0, i6, byteBuffer.remaining());
        byte[] bArr = new byte[i6];
        byteBuffer.get(bArr);
        return new t(bArr);
    }

    public static ByteString wrap(byte[] bArr) {
        return new t(bArr);
    }

    public final String toString(Charset charset) {
        return size() == 0 ? HttpUrl.FRAGMENT_ENCODE_SET : toStringInternal(charset);
    }

    public static ByteString wrap(byte[] bArr, int i6, int i10) {
        return new p(bArr, i6, i10);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        String truncateAndEscapeForDisplay = truncateAndEscapeForDisplay();
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return r4.a.o(sb2, truncateAndEscapeForDisplay, "\">");
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static ByteString copyFrom(String str, String str2) {
        return new t(str.getBytes(str2));
    }

    public static ByteString copyFrom(String str, Charset charset) {
        return new t(str.getBytes(charset));
    }

    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator<ByteString> it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((Collection) iterable).size();
        }
        if (size == 0) {
            return EMPTY;
        }
        return balancedConcat(iterable.iterator(), size);
    }
}

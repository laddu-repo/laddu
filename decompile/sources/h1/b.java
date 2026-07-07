package h1;

import android.util.Log;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class b extends InputStream implements DataInput {
    public byte[] A;
    public final int B;

    /* renamed from: x, reason: collision with root package name */
    public final DataInputStream f5819x;

    /* renamed from: y, reason: collision with root package name */
    public int f5820y;

    /* renamed from: z, reason: collision with root package name */
    public ByteOrder f5821z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(byte[] r3) {
        /*
            r2 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r3)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r1 = 0
            r2.<init>(r0, r1)
            int r3 = r3.length
            r2.B = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.b.<init>(byte[]):void");
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f5819x.available();
    }

    public final void d(int i6) {
        int i10 = 0;
        while (i10 < i6) {
            int i11 = i6 - i10;
            DataInputStream dataInputStream = this.f5819x;
            int skip = (int) dataInputStream.skip(i11);
            if (skip <= 0) {
                if (this.A == null) {
                    this.A = new byte[8192];
                }
                skip = dataInputStream.read(this.A, 0, Math.min(8192, i11));
                if (skip == -1) {
                    throw new EOFException(h8.c.j(i6, "Reached EOF while skipping ", " bytes."));
                }
            }
            i10 += skip;
        }
        this.f5820y += i10;
    }

    @Override // java.io.InputStream
    public final void mark(int i6) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f5820y++;
        return this.f5819x.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f5820y++;
        return this.f5819x.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f5820y++;
        int read = this.f5819x.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f5820y += 2;
        return this.f5819x.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i6, int i10) {
        this.f5820y += i10;
        this.f5819x.readFully(bArr, i6, i10);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f5820y += 4;
        DataInputStream dataInputStream = this.f5819x;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.f5821z;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f5821z);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        long j;
        long j10;
        this.f5820y += 8;
        DataInputStream dataInputStream = this.f5819x;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.f5821z;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                j = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
                j10 = read;
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                j = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
                j10 = read8;
            } else {
                throw new IOException("Invalid byte order: " + this.f5821z);
            }
            return j + j10;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f5820y += 2;
        DataInputStream dataInputStream = this.f5819x;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f5821z;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f5821z);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f5820y += 2;
        return this.f5819x.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f5820y++;
        return this.f5819x.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f5820y += 2;
        DataInputStream dataInputStream = this.f5819x;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f5821z;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f5821z);
        }
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i6) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i6, int i10) {
        int read = this.f5819x.read(bArr, i6, i10);
        this.f5820y += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f5820y += bArr.length;
        this.f5819x.readFully(bArr);
    }

    public b(InputStream inputStream, int i6) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f5819x = dataInputStream;
        dataInputStream.mark(0);
        this.f5820y = 0;
        this.f5821z = byteOrder;
        this.B = inputStream instanceof b ? ((b) inputStream).B : -1;
    }
}

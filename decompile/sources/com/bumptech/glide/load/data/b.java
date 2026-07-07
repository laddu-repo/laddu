package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final FileOutputStream f2379v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte[] f2380w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final d6.f f2381x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f2382y;

    public b(FileOutputStream fileOutputStream, d6.f fVar) {
        this.f2379v = fileOutputStream;
        this.f2381x = fVar;
        this.f2380w = (byte[]) fVar.d(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f2379v;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f2380w;
            if (bArr != null) {
                this.f2381x.h(bArr);
                this.f2380w = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f2382y;
        FileOutputStream fileOutputStream = this.f2379v;
        if (i > 0) {
            fileOutputStream.write(this.f2380w, 0, i);
            this.f2382y = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f2380w;
        int i10 = this.f2382y;
        int i11 = i10 + 1;
        this.f2382y = i11;
        bArr[i10] = (byte) i;
        if (i11 != bArr.length || i11 <= 0) {
            return;
        }
        this.f2379v.write(bArr, 0, i11);
        this.f2382y = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i10) throws IOException {
        int i11 = 0;
        do {
            int i12 = i10 - i11;
            int i13 = i + i11;
            int i14 = this.f2382y;
            FileOutputStream fileOutputStream = this.f2379v;
            if (i14 == 0 && i12 >= this.f2380w.length) {
                fileOutputStream.write(bArr, i13, i12);
                return;
            }
            int iMin = Math.min(i12, this.f2380w.length - i14);
            System.arraycopy(bArr, i13, this.f2380w, this.f2382y, iMin);
            int i15 = this.f2382y + iMin;
            this.f2382y = i15;
            i11 += iMin;
            byte[] bArr2 = this.f2380w;
            if (i15 == bArr2.length && i15 > 0) {
                fileOutputStream.write(bArr2, 0, i15);
                this.f2382y = 0;
            }
        } while (i11 < i10);
    }
}

package ib;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f6587v;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f6587v++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f6587v += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i10) {
        int i11;
        if (i >= 0 && i <= bArr.length && i10 >= 0 && (i11 = i + i10) <= bArr.length && i11 >= 0) {
            this.f6587v += (long) i10;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}

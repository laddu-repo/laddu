package com.google.protobuf;

import java.io.FilterInputStream;
import java.io.InputStream;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends FilterInputStream {

    /* renamed from: x, reason: collision with root package name */
    public int f2862x;

    public a(InputStream inputStream, int i6) {
        super(inputStream);
        this.f2862x = i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f2862x);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.f2862x <= 0) {
            return -1;
        }
        int read = super.read();
        if (read >= 0) {
            this.f2862x--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        int skip = (int) super.skip(Math.min(j, this.f2862x));
        if (skip >= 0) {
            this.f2862x -= skip;
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i6, int i10) {
        int i11 = this.f2862x;
        if (i11 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i6, Math.min(i10, i11));
        if (read >= 0) {
            this.f2862x -= read;
        }
        return read;
    }
}

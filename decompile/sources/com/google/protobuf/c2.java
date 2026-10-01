package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c2 extends InputStream {
    public int A;
    public int B;
    public boolean C;
    public byte[] D;
    public int E;
    public long F;

    /* renamed from: x, reason: collision with root package name */
    public final Iterator f2879x;

    /* renamed from: y, reason: collision with root package name */
    public ByteBuffer f2880y;

    /* renamed from: z, reason: collision with root package name */
    public final int f2881z = 0;

    public c2(Iterable iterable) {
        this.f2879x = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f2881z++;
        }
        this.A = -1;
        if (!d()) {
            this.f2880y = Internal.EMPTY_BYTE_BUFFER;
            this.A = 0;
            this.B = 0;
            this.F = 0L;
        }
    }

    public final boolean d() {
        this.A++;
        Iterator it = this.f2879x;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) it.next();
        this.f2880y = byteBuffer;
        this.B = byteBuffer.position();
        if (this.f2880y.hasArray()) {
            this.C = true;
            this.D = this.f2880y.array();
            this.E = this.f2880y.arrayOffset();
        } else {
            this.C = false;
            this.F = q4.b(this.f2880y);
            this.D = null;
        }
        return true;
    }

    public final void f(int i6) {
        int i10 = this.B + i6;
        this.B = i10;
        if (i10 == this.f2880y.limit()) {
            d();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.A == this.f2881z) {
            return -1;
        }
        if (this.C) {
            int i6 = this.D[this.B + this.E] & 255;
            f(1);
            return i6;
        }
        int f3 = q4.f3024c.f(this.B + this.F) & 255;
        f(1);
        return f3;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i6, int i10) {
        if (this.A == this.f2881z) {
            return -1;
        }
        int limit = this.f2880y.limit();
        int i11 = this.B;
        int i12 = limit - i11;
        if (i10 > i12) {
            i10 = i12;
        }
        if (this.C) {
            System.arraycopy(this.D, i11 + this.E, bArr, i6, i10);
            f(i10);
            return i10;
        }
        int position = this.f2880y.position();
        this.f2880y.position(this.B);
        this.f2880y.get(bArr, i6, i10);
        this.f2880y.position(position);
        f(i10);
        return i10;
    }
}

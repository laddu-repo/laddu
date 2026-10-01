package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g {
    public final int A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f761z;

    public f(byte[] bArr, int i, int i10) {
        super(bArr);
        g.b(i, i + i10, bArr.length);
        this.f761z = i;
        this.A = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final byte a(int i) {
        int i10 = this.A;
        if (((i10 - (i + 1)) | i) >= 0) {
            return this.f768w[this.f761z + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(d0.d.h(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(j4.a.k(i, i10, "Index > length: ", ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final void d(int i, byte[] bArr) {
        System.arraycopy(this.f768w, this.f761z, bArr, 0, i);
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final int e() {
        return this.f761z;
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final byte f(int i) {
        return this.f768w[this.f761z + i];
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final int size() {
        return this.A;
    }
}

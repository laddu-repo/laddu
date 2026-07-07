package vf;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f13633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13637e;
    public o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o f13638g;

    public o() {
        this.f13633a = new byte[8192];
        this.f13637e = true;
        this.f13636d = false;
    }

    public final o a() {
        o oVar = this.f;
        if (oVar == this) {
            oVar = null;
        }
        o oVar2 = this.f13638g;
        de.i.b(oVar2);
        oVar2.f = this.f;
        o oVar3 = this.f;
        de.i.b(oVar3);
        oVar3.f13638g = this.f13638g;
        this.f = null;
        this.f13638g = null;
        return oVar;
    }

    public final void b(o oVar) {
        de.i.e(oVar, "segment");
        oVar.f13638g = this;
        oVar.f = this.f;
        o oVar2 = this.f;
        de.i.b(oVar2);
        oVar2.f13638g = oVar;
        this.f = oVar;
    }

    public final o c() {
        this.f13636d = true;
        return new o(this.f13633a, this.f13634b, this.f13635c, true);
    }

    public final void d(o oVar, int i) {
        de.i.e(oVar, "sink");
        byte[] bArr = oVar.f13633a;
        if (!oVar.f13637e) {
            throw new IllegalStateException("only owner can write");
        }
        int i10 = oVar.f13635c;
        int i11 = i10 + i;
        if (i11 > 8192) {
            if (oVar.f13636d) {
                throw new IllegalArgumentException();
            }
            int i12 = oVar.f13634b;
            if (i11 - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            pd.i.X(0, i12, i10, bArr, bArr);
            oVar.f13635c -= oVar.f13634b;
            oVar.f13634b = 0;
        }
        int i13 = oVar.f13635c;
        int i14 = this.f13634b;
        pd.i.X(i13, i14, i14 + i, this.f13633a, bArr);
        oVar.f13635c += i;
        this.f13634b += i;
    }

    public o(byte[] bArr, int i, int i10, boolean z2) {
        de.i.e(bArr, "data");
        this.f13633a = bArr;
        this.f13634b = i;
        this.f13635c = i10;
        this.f13636d = z2;
        this.f13637e = false;
    }
}

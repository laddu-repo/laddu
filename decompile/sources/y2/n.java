package y2;

import com.google.protobuf.CodedOutputStream;
import java.io.EOFException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f14929a = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];

    @Override // y2.f0
    public final /* synthetic */ void a(int i6, u1.t tVar) {
        w8.k.a(this, tVar, i6);
    }

    @Override // y2.f0
    public final void b(u1.t tVar, int i6, int i10) {
        tVar.L(i6);
    }

    @Override // y2.f0
    public final int d(r1.i iVar, int i6, boolean z10) {
        byte[] bArr = this.f14929a;
        int read = iVar.read(bArr, 0, Math.min(bArr.length, i6));
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }

    @Override // y2.f0
    public final int e(r1.i iVar, int i6, boolean z10) {
        return d(iVar, i6, z10);
    }

    @Override // y2.f0
    public final void f(r1.q qVar) {
    }

    @Override // y2.f0
    public final void c(long j, int i6, int i10, int i11, e0 e0Var) {
    }
}

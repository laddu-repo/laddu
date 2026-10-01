package x2;

import j4.b0;
import java.nio.ByteBuffer;
import r1.q;
import u1.a0;
import u1.t;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends a2.g {
    public final y1.h P;
    public final t Q;
    public a R;
    public long S;

    public b() {
        super(6);
        this.P = new y1.h(1, 0);
        this.Q = new t();
    }

    @Override // a2.g
    public final int A(q qVar) {
        if ("application/x-camera-motion".equals(qVar.f11670n)) {
            return r4.a.d(4, 0, 0, 0);
        }
        return r4.a.d(0, 0, 0, 0);
    }

    @Override // a2.g, a2.u1
    public final void h(int i6, Object obj) {
        if (i6 == 8) {
            this.R = (a) obj;
        }
    }

    @Override // a2.g
    public final String j() {
        return "CameraMotionRenderer";
    }

    @Override // a2.g
    public final boolean l() {
        return k();
    }

    @Override // a2.g
    public final boolean m() {
        return true;
    }

    @Override // a2.g
    public final void o() {
        a aVar = this.R;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // a2.g
    public final void q(boolean z10, long j) {
        this.S = Long.MIN_VALUE;
        a aVar = this.R;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // a2.g
    public final void x(long j, long j10) {
        boolean z10;
        float[] fArr;
        while (!k() && this.S < 100000 + j) {
            y1.h hVar = this.P;
            hVar.clear();
            b0 b0Var = this.f246z;
            b0Var.i();
            if (w(b0Var, hVar, 0) == -4 && !hVar.isEndOfStream()) {
                long j11 = hVar.B;
                this.S = j11;
                if (j11 < this.I) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.R != null && !z10) {
                    hVar.d();
                    ByteBuffer byteBuffer = hVar.f14812z;
                    String str = a0.f12750a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        t tVar = this.Q;
                        tVar.I(limit, array);
                        tVar.K(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i6 = 0; i6 < 3; i6++) {
                            fArr2[i6] = Float.intBitsToFloat(tVar.m());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.R.a(this.S - this.H, fArr);
                    }
                }
            } else {
                return;
            }
        }
    }
}

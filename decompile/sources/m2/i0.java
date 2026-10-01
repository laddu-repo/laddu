package m2;

import android.net.Uri;
import java.net.DatagramSocket;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i0 implements e {

    /* renamed from: x, reason: collision with root package name */
    public final w1.c0 f8508x = new w1.c0(a8.f.G(8000));

    /* renamed from: y, reason: collision with root package name */
    public i0 f8509y;

    @Override // m2.e
    public final String a() {
        boolean z10;
        int e10 = e();
        if (e10 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        String str = u1.a0.f12750a;
        Locale locale = Locale.US;
        return h8.c.l("RTP/AVP;unicast;client_port=", "-", e10, e10 + 1);
    }

    @Override // w1.h
    public final void close() {
        this.f8508x.close();
        i0 i0Var = this.f8509y;
        if (i0Var != null) {
            i0Var.close();
        }
    }

    @Override // m2.e
    public final int e() {
        int localPort;
        DatagramSocket datagramSocket = this.f8508x.F;
        if (datagramSocket == null) {
            localPort = -1;
        } else {
            localPort = datagramSocket.getLocalPort();
        }
        if (localPort == -1) {
            return -1;
        }
        return localPort;
    }

    @Override // m2.e
    public final boolean i() {
        return true;
    }

    @Override // m2.e
    public final h0 m() {
        return null;
    }

    @Override // w1.h
    public final void q(w1.a0 a0Var) {
        this.f8508x.q(a0Var);
    }

    @Override // r1.i
    public final int read(byte[] bArr, int i6, int i10) {
        try {
            return this.f8508x.read(bArr, i6, i10);
        } catch (w1.b0 e10) {
            if (e10.f13538x == 2002) {
                return -1;
            }
            throw e10;
        }
    }

    @Override // w1.h
    public final Map u() {
        return Collections.EMPTY_MAP;
    }

    @Override // w1.h
    public final long y(w1.l lVar) {
        this.f8508x.y(lVar);
        return -1L;
    }

    @Override // w1.h
    public final Uri z() {
        return this.f8508x.E;
    }
}

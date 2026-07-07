package m2;

import android.net.Uri;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h0 extends w1.c implements e {
    public final LinkedBlockingQueue B;
    public final long C;
    public byte[] D;
    public int E;

    public h0() {
        super(true);
        this.C = 8000L;
        this.B = new LinkedBlockingQueue();
        this.D = new byte[0];
        this.E = -1;
    }

    @Override // m2.e
    public final String a() {
        boolean z10;
        if (this.E != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        int i6 = this.E;
        int i10 = this.E + 1;
        String str = u1.a0.f12750a;
        Locale locale = Locale.US;
        return h8.c.l("RTP/AVP/TCP;unicast;interleaved=", "-", i6, i10);
    }

    @Override // m2.e
    public final int e() {
        return this.E;
    }

    @Override // m2.e
    public final boolean i() {
        return false;
    }

    @Override // r1.i
    public final int read(byte[] bArr, int i6, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int min = Math.min(i10, this.D.length);
        System.arraycopy(this.D, 0, bArr, i6, min);
        byte[] bArr2 = this.D;
        this.D = Arrays.copyOfRange(bArr2, min, bArr2.length);
        if (min == i10) {
            return min;
        }
        try {
            byte[] bArr3 = (byte[]) this.B.poll(this.C, TimeUnit.MILLISECONDS);
            if (bArr3 == null) {
                return -1;
            }
            int min2 = Math.min(i10 - min, bArr3.length);
            System.arraycopy(bArr3, 0, bArr, i6 + min, min2);
            if (min2 < bArr3.length) {
                this.D = Arrays.copyOfRange(bArr3, min2, bArr3.length);
            }
            return min + min2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }

    @Override // w1.h
    public final long y(w1.l lVar) {
        this.E = lVar.f13542a.getPort();
        return -1L;
    }

    @Override // w1.h
    public final Uri z() {
        return null;
    }

    @Override // w1.h
    public final void close() {
    }

    @Override // m2.e
    public final h0 m() {
        return this;
    }
}

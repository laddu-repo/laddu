package g2;

import com.google.android.gms.internal.measurement.k4;
import java.util.Arrays;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends r2.e {
    public byte[] G;
    public volatile boolean H;
    public byte[] I;

    @Override // u2.l
    public final void h() {
        try {
            this.F.y(this.f11786y);
            int i6 = 0;
            int i10 = 0;
            while (i6 != -1 && !this.H) {
                byte[] bArr = this.G;
                if (bArr.length < i10 + Http2.INITIAL_MAX_FRAME_SIZE) {
                    this.G = Arrays.copyOf(bArr, bArr.length + Http2.INITIAL_MAX_FRAME_SIZE);
                }
                i6 = this.F.read(this.G, i10, Http2.INITIAL_MAX_FRAME_SIZE);
                if (i6 != -1) {
                    i10 += i6;
                }
            }
            if (!this.H) {
                this.I = Arrays.copyOf(this.G, i10);
            }
            k4.f(this.F);
        } catch (Throwable th) {
            k4.f(this.F);
            throw th;
        }
    }

    @Override // u2.l
    public final void p() {
        this.H = true;
    }
}

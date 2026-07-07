package a2;

import android.media.MediaFormat;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l0 implements w2.v, x2.a, u1 {
    public x2.a A;

    /* renamed from: x, reason: collision with root package name */
    public w2.v f308x;

    /* renamed from: y, reason: collision with root package name */
    public x2.a f309y;

    /* renamed from: z, reason: collision with root package name */
    public w2.v f310z;

    @Override // x2.a
    public final void a(long j, float[] fArr) {
        x2.a aVar = this.A;
        if (aVar != null) {
            aVar.a(j, fArr);
        }
        x2.a aVar2 = this.f309y;
        if (aVar2 != null) {
            aVar2.a(j, fArr);
        }
    }

    @Override // x2.a
    public final void b() {
        x2.a aVar = this.A;
        if (aVar != null) {
            aVar.b();
        }
        x2.a aVar2 = this.f309y;
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    @Override // w2.v
    public final void c(long j, long j10, r1.q qVar, MediaFormat mediaFormat) {
        long j11;
        long j12;
        r1.q qVar2;
        MediaFormat mediaFormat2;
        w2.v vVar = this.f310z;
        if (vVar != null) {
            vVar.c(j, j10, qVar, mediaFormat);
            mediaFormat2 = mediaFormat;
            qVar2 = qVar;
            j12 = j10;
            j11 = j;
        } else {
            j11 = j;
            j12 = j10;
            qVar2 = qVar;
            mediaFormat2 = mediaFormat;
        }
        w2.v vVar2 = this.f308x;
        if (vVar2 != null) {
            vVar2.c(j11, j12, qVar2, mediaFormat2);
        }
    }

    @Override // a2.u1
    public final void h(int i6, Object obj) {
        if (i6 != 7) {
            if (i6 != 8) {
                if (i6 != 10000) {
                    return;
                }
                x2.k kVar = (x2.k) obj;
                if (kVar == null) {
                    this.f310z = null;
                    this.A = null;
                    return;
                } else {
                    this.f310z = kVar.getVideoFrameMetadataListener();
                    this.A = kVar.getCameraMotionListener();
                    return;
                }
            }
            this.f309y = (x2.a) obj;
            return;
        }
        this.f308x = (w2.v) obj;
    }
}

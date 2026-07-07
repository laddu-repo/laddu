package q2;

import com.google.android.gms.internal.measurement.k4;
import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f1 implements u2.l {

    /* renamed from: x, reason: collision with root package name */
    public final w1.l f10878x;

    /* renamed from: y, reason: collision with root package name */
    public final w1.z f10879y;

    /* renamed from: z, reason: collision with root package name */
    public byte[] f10880z;

    public f1(w1.h hVar, w1.l lVar) {
        u.f10969b.getAndIncrement();
        this.f10878x = lVar;
        this.f10879y = new w1.z(hVar);
    }

    @Override // u2.l
    public final void h() {
        w1.z zVar = this.f10879y;
        zVar.f13559y = 0L;
        try {
            zVar.y(this.f10878x);
            int i6 = 0;
            while (i6 != -1) {
                int i10 = (int) zVar.f13559y;
                byte[] bArr = this.f10880z;
                if (bArr == null) {
                    this.f10880z = new byte[1024];
                } else if (i10 == bArr.length) {
                    this.f10880z = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f10880z;
                i6 = zVar.read(bArr2, i10, bArr2.length - i10);
            }
            k4.f(zVar);
        } catch (Throwable th) {
            k4.f(zVar);
            throw th;
        }
    }

    @Override // u2.l
    public final void p() {
    }
}

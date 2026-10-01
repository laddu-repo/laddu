package t3;

import java.io.EOFException;
import u1.t;
import y2.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f f12576a = new f();

    /* renamed from: b, reason: collision with root package name */
    public final t f12577b = new t(0, new byte[65025]);

    /* renamed from: c, reason: collision with root package name */
    public int f12578c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f12579d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12580e;

    public final int a(int i6) {
        int i10;
        int i11 = 0;
        this.f12579d = 0;
        do {
            int i12 = this.f12579d;
            int i13 = i6 + i12;
            f fVar = this.f12576a;
            if (i13 >= fVar.f12583c) {
                break;
            }
            int[] iArr = fVar.f12586f;
            this.f12579d = i12 + 1;
            i10 = iArr[i13];
            i11 += i10;
        } while (i10 == 255);
        return i11;
    }

    public final boolean b(p pVar) {
        boolean z10;
        boolean z11;
        int i6;
        if (pVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        boolean z12 = this.f12580e;
        t tVar = this.f12577b;
        if (z12) {
            this.f12580e = false;
            tVar.H(0);
        }
        while (!this.f12580e) {
            int i10 = this.f12578c;
            f fVar = this.f12576a;
            if (i10 < 0) {
                if (fVar.b(pVar, -1L) && fVar.a(pVar, true)) {
                    int i11 = fVar.f12584d;
                    if ((fVar.f12581a & 1) == 1 && tVar.f12813c == 0) {
                        i11 += a(0);
                        i6 = this.f12579d;
                    } else {
                        i6 = 0;
                    }
                    try {
                        pVar.w(i11);
                        this.f12578c = i6;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a10 = a(this.f12578c);
            int i12 = this.f12578c + this.f12579d;
            if (a10 > 0) {
                tVar.c(tVar.f12813c + a10);
                try {
                    pVar.readFully(tVar.f12811a, tVar.f12813c, a10);
                    tVar.J(tVar.f12813c + a10);
                    if (fVar.f12586f[i12 - 1] != 255) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f12580e = z11;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i12 == fVar.f12583c) {
                i12 = -1;
            }
            this.f12578c = i12;
        }
        return true;
    }
}

package w1;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z implements h {

    /* renamed from: x, reason: collision with root package name */
    public final h f13558x;

    /* renamed from: y, reason: collision with root package name */
    public long f13559y;

    /* renamed from: z, reason: collision with root package name */
    public Uri f13560z;

    public z(h hVar) {
        hVar.getClass();
        this.f13558x = hVar;
        this.f13560z = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // w1.h
    public final void close() {
        this.f13558x.close();
    }

    @Override // w1.h
    public final void q(a0 a0Var) {
        a0Var.getClass();
        this.f13558x.q(a0Var);
    }

    @Override // r1.i
    public final int read(byte[] bArr, int i6, int i10) {
        int read = this.f13558x.read(bArr, i6, i10);
        if (read != -1) {
            this.f13559y += read;
        }
        return read;
    }

    @Override // w1.h
    public final Map u() {
        return this.f13558x.u();
    }

    @Override // w1.h
    public final long y(l lVar) {
        h hVar = this.f13558x;
        this.f13560z = lVar.f13542a;
        Map map = Collections.EMPTY_MAP;
        try {
            return hVar.y(lVar);
        } finally {
            Uri z10 = hVar.z();
            if (z10 != null) {
                this.f13560z = z10;
            }
            hVar.u();
        }
    }

    @Override // w1.h
    public final Uri z() {
        return this.f13558x.z();
    }
}

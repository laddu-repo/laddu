package h2;

import android.net.Uri;
import android.os.SystemClock;
import j2.y;
import java.util.HashMap;
import java.util.List;
import o5.e0;
import u1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements t {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f5856x;

    public a(c cVar) {
        this.f5856x = cVar;
    }

    @Override // h2.t
    public final void b() {
        this.f5856x.B.remove(this);
    }

    @Override // h2.t
    public final boolean d(Uri uri, y yVar, boolean z10) {
        b bVar;
        c cVar = this.f5856x;
        HashMap hashMap = cVar.A;
        if (cVar.I == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o oVar = cVar.G;
            String str = a0.f12750a;
            List list = oVar.f5939e;
            int i6 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                b bVar2 = (b) hashMap.get(((n) list.get(i10)).f5931a);
                if (bVar2 != null && elapsedRealtime < bVar2.E) {
                    i6++;
                }
            }
            u2.h hVar = new u2.h(1, 0, cVar.G.f5939e.size(), i6);
            cVar.f5862z.getClass();
            ef.g e10 = e0.e(hVar, yVar);
            if (e10 != null && e10.f4580a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, e10.f4581b);
            }
        }
        return false;
    }
}

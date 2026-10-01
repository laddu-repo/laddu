package e7;

import android.os.Handler;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import o5.e0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements b, wc.d {
    public static c B;
    public Object A;

    /* renamed from: x, reason: collision with root package name */
    public float f4399x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f4400y;

    /* renamed from: z, reason: collision with root package name */
    public Object f4401z;

    public c(e0 e0Var, p.l lVar) {
        this.f4399x = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f4400y = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, p.l] */
    /* JADX WARN: Type inference failed for: r1v0, types: [o5.e0, java.lang.Object] */
    public static c b() {
        if (B == null) {
            B = new c(new Object(), new Object());
        }
        return B;
    }

    @Override // wc.d
    public void a(boolean z10) {
        if (z10) {
            ad.b.f678g.getClass();
            ad.b.b();
            return;
        }
        ad.b.f678g.getClass();
        Handler handler = ad.b.f680i;
        if (handler != null) {
            handler.removeCallbacks(ad.b.f681k);
            ad.b.f680i = null;
        }
    }

    public o7.a c(float f3) {
        List list = (List) this.f4400y;
        o7.a aVar = (o7.a) list.get(list.size() - 1);
        if (f3 >= aVar.b()) {
            return aVar;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            o7.a aVar2 = (o7.a) list.get(size);
            if (((o7.a) this.f4401z) != aVar2 && f3 >= aVar2.b() && f3 < aVar2.a()) {
                return aVar2;
            }
        }
        return (o7.a) list.get(0);
    }

    @Override // e7.b
    public boolean d(float f3) {
        o7.a aVar = (o7.a) this.A;
        o7.a aVar2 = (o7.a) this.f4401z;
        if (aVar == aVar2 && this.f4399x == f3) {
            return true;
        }
        this.A = aVar2;
        this.f4399x = f3;
        return false;
    }

    @Override // e7.b
    public o7.a e() {
        return (o7.a) this.f4401z;
    }

    @Override // e7.b
    public boolean f(float f3) {
        o7.a aVar = (o7.a) this.f4401z;
        if (f3 >= aVar.b() && f3 < aVar.a()) {
            return !((o7.a) this.f4401z).c();
        }
        this.f4401z = c(f3);
        return true;
    }

    @Override // e7.b
    public boolean isEmpty() {
        return false;
    }

    @Override // e7.b
    public float j() {
        return ((o7.a) ((List) this.f4400y).get(r0.size() - 1)).a();
    }

    @Override // e7.b
    public float n() {
        return ((o7.a) ((List) this.f4400y).get(0)).b();
    }

    public c(List list) {
        this.A = null;
        this.f4399x = -1.0f;
        this.f4400y = list;
        this.f4401z = c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}

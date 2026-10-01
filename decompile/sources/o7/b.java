package o7;

import android.graphics.Matrix;
import android.graphics.Path;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import ua.p;
import ua.q;
import ua.r;
import ua.t;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public float f10027a;

    /* renamed from: b, reason: collision with root package name */
    public float f10028b;

    /* renamed from: c, reason: collision with root package name */
    public float f10029c;

    /* renamed from: d, reason: collision with root package name */
    public float f10030d;

    /* renamed from: e, reason: collision with root package name */
    public float f10031e;

    /* renamed from: f, reason: collision with root package name */
    public Object f10032f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public Object f10033g = new ArrayList();

    public b() {
        d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 270.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public void a(float f3) {
        float f10 = this.f10030d;
        if (f10 != f3) {
            float f11 = ((f3 - f10) + 360.0f) % 360.0f;
            if (f11 > 180.0f) {
                return;
            }
            float f12 = this.f10028b;
            float f13 = this.f10029c;
            r rVar = new r(f12, f13, f12, f13);
            rVar.f13038f = this.f10030d;
            rVar.f13039g = f11;
            ((ArrayList) this.f10033g).add(new p(rVar));
            this.f10030d = f3;
        }
    }

    public void b(Matrix matrix, Path path) {
        ArrayList arrayList = (ArrayList) this.f10032f;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((t) arrayList.get(i6)).a(matrix, path);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ua.t, ua.s, java.lang.Object] */
    public void c(float f3, float f10) {
        ?? tVar = new t();
        tVar.f13040b = f3;
        tVar.f13041c = f10;
        ((ArrayList) this.f10032f).add(tVar);
        q qVar = new q(tVar, this.f10028b, this.f10029c);
        float b10 = qVar.b() + 270.0f;
        float b11 = qVar.b() + 270.0f;
        a(b10);
        ((ArrayList) this.f10033g).add(qVar);
        this.f10030d = b11;
        this.f10028b = f3;
        this.f10029c = f10;
    }

    public void d(float f3, float f10, float f11) {
        this.f10027a = f3;
        this.f10028b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f10029c = f3;
        this.f10030d = f10;
        this.f10031e = (f10 + f11) % 360.0f;
        ((ArrayList) this.f10032f).clear();
        ((ArrayList) this.f10033g).clear();
    }
}

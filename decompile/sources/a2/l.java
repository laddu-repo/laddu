package a2;

import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final u2.e f299a;

    /* renamed from: b, reason: collision with root package name */
    public final long f300b;

    /* renamed from: c, reason: collision with root package name */
    public final long f301c;

    /* renamed from: d, reason: collision with root package name */
    public final long f302d;

    /* renamed from: e, reason: collision with root package name */
    public final long f303e;

    /* renamed from: f, reason: collision with root package name */
    public final int f304f;

    /* renamed from: g, reason: collision with root package name */
    public final long f305g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f306h;

    /* renamed from: i, reason: collision with root package name */
    public long f307i;

    public l() {
        u2.e eVar = new u2.e();
        a("bufferForPlaybackMs", "0", UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, 0);
        a("bufferForPlaybackAfterRebufferMs", "0", 2000, 0);
        a("minBufferMs", "bufferForPlaybackMs", 50000, UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT);
        a("minBufferMs", "bufferForPlaybackAfterRebufferMs", 50000, 2000);
        a("maxBufferMs", "minBufferMs", 50000, 50000);
        a("backBufferDurationMs", "0", 0, 0);
        this.f299a = eVar;
        long j = 50000;
        this.f300b = u1.a0.Q(j);
        this.f301c = u1.a0.Q(j);
        this.f302d = u1.a0.Q(UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT);
        this.f303e = u1.a0.Q(2000);
        this.f304f = -1;
        this.f305g = u1.a0.Q(0);
        this.f306h = new HashMap();
        this.f307i = -1L;
    }

    public static void a(String str, String str2, int i6, int i10) {
        boolean z10;
        if (i6 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.a(str + " cannot be less than " + str2, z10);
    }

    public final int b() {
        Iterator it = this.f306h.values().iterator();
        int i6 = 0;
        while (it.hasNext()) {
            i6 += ((k) it.next()).f294b;
        }
        return i6;
    }

    public final boolean c(y0 y0Var) {
        int i6;
        boolean z10;
        long j = this.f301c;
        k kVar = (k) this.f306h.get(y0Var.f500a);
        kVar.getClass();
        u2.e eVar = this.f299a;
        synchronized (eVar) {
            i6 = eVar.f12836d * eVar.f12834b;
        }
        if (i6 >= b()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j10 = this.f300b;
        float f3 = y0Var.f502c;
        if (f3 > 1.0f) {
            j10 = Math.min(u1.a0.z(j10, f3), j);
        }
        long max = Math.max(j10, 500000L);
        long j11 = y0Var.f501b;
        if (j11 < max) {
            kVar.f293a = !z10;
            if (z10 && j11 < 500000) {
                u1.a.p("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= j || z10) {
            kVar.f293a = false;
        }
        return kVar.f293a;
    }

    public final void d() {
        if (this.f306h.isEmpty()) {
            u2.e eVar = this.f299a;
            synchronized (eVar) {
                if (eVar.f12833a) {
                    eVar.a(0);
                }
            }
            return;
        }
        this.f299a.a(b());
    }
}

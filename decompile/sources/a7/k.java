package a7;

import android.os.SystemClock;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: a, reason: collision with root package name */
    public static final k f611a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static n6.g f612b;

    @Override // a7.i
    public boolean a(w6.h hVar) {
        int i6;
        e9.f fVar = hVar.f14135a;
        int i10 = Integer.MAX_VALUE;
        if (fVar instanceof w6.a) {
            i6 = ((w6.a) fVar).f14123k;
        } else {
            i6 = Integer.MAX_VALUE;
        }
        if (i6 > 100) {
            e9.f fVar2 = hVar.f14136b;
            if (fVar2 instanceof w6.a) {
                i10 = ((w6.a) fVar2).f14123k;
            }
            if (i10 > 100) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // a7.i
    public boolean b() {
        boolean z10;
        synchronized (h.f601a) {
            try {
                int i6 = h.f603c;
                h.f603c = i6 + 1;
                if (i6 >= 30 || SystemClock.uptimeMillis() > h.f604d + 30000) {
                    boolean z11 = false;
                    h.f603c = 0;
                    h.f604d = SystemClock.uptimeMillis();
                    String[] list = h.f602b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    if (list.length < 800) {
                        z11 = true;
                    }
                    h.f605e = z11;
                }
                z10 = h.f605e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }
}

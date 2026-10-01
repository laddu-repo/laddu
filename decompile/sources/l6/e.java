package l6;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.StatFs;
import bg.c0;
import bg.q;
import bg.x;
import d.a0;
import gf.o0;
import he.m;
import ie.r;
import j2.y;
import java.io.File;
import s8.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8229a;

    /* renamed from: b, reason: collision with root package name */
    public v6.c f8230b = a7.d.f593a;

    /* renamed from: c, reason: collision with root package name */
    public he.d f8231c = null;

    /* renamed from: d, reason: collision with root package name */
    public b f8232d = null;

    /* renamed from: e, reason: collision with root package name */
    public final a7.j f8233e = new a7.j();

    public e(Context context) {
        this.f8229a = context.getApplicationContext();
    }

    public final k a() {
        b bVar;
        v6.c cVar = this.f8230b;
        final int i6 = 0;
        m d10 = he.a.d(new ve.a(this) { // from class: l6.d

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ e f8228y;

            {
                this.f8228y = this;
            }

            @Override // ve.a
            public final Object invoke() {
                t6.f cVar2;
                int i10;
                n6.g gVar;
                switch (i6) {
                    case 0:
                        Context context = this.f8228y.f8229a;
                        Bitmap.Config[] configArr = a7.f.f595a;
                        double d11 = 0.2d;
                        try {
                            Object e10 = i0.f.e(context, ActivityManager.class);
                            kotlin.jvm.internal.k.b(e10);
                            if (((ActivityManager) e10).isLowRamDevice()) {
                                d11 = 0.15d;
                            }
                        } catch (Exception unused) {
                        }
                        int i11 = 0;
                        y yVar = new y((byte) 0, 4);
                        if (d11 > 0.0d) {
                            Bitmap.Config[] configArr2 = a7.f.f595a;
                            try {
                                Object e11 = i0.f.e(context, ActivityManager.class);
                                kotlin.jvm.internal.k.b(e11);
                                ActivityManager activityManager = (ActivityManager) e11;
                                if ((context.getApplicationInfo().flags & 1048576) != 0) {
                                    i10 = activityManager.getLargeMemoryClass();
                                } else {
                                    i10 = activityManager.getMemoryClass();
                                }
                            } catch (Exception unused2) {
                                i10 = 256;
                            }
                            double d12 = d11 * i10;
                            double d13 = 1024;
                            i11 = (int) (d12 * d13 * d13);
                        }
                        if (i11 > 0) {
                            cVar2 = new l(i11, yVar);
                        } else {
                            cVar2 = new k7.c(yVar, 26);
                        }
                        return new t6.c(cVar2, yVar);
                    default:
                        e eVar = this.f8228y;
                        a7.k kVar = a7.k.f611a;
                        Context context2 = eVar.f8229a;
                        synchronized (kVar) {
                            try {
                                gVar = a7.k.f612b;
                                if (gVar == null) {
                                    x xVar = q.f1741a;
                                    of.d dVar = o0.f5694b;
                                    Bitmap.Config[] configArr3 = a7.f.f595a;
                                    File cacheDir = context2.getCacheDir();
                                    if (cacheDir != null) {
                                        cacheDir.mkdirs();
                                        File r10 = se.h.r(cacheDir);
                                        String str = c0.f1692y;
                                        c0 u3 = zb.d.u(r10);
                                        long j = 10485760;
                                        try {
                                            File file = u3.toFile();
                                            file.mkdir();
                                            StatFs statFs = new StatFs(file.getAbsolutePath());
                                            j = android.support.v4.media.session.b.e((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                        } catch (Exception unused3) {
                                        }
                                        n6.g gVar2 = new n6.g(j, xVar, u3, dVar);
                                        a7.k.f612b = gVar2;
                                        gVar = gVar2;
                                    } else {
                                        throw new IllegalStateException("cacheDir == null");
                                    }
                                }
                            } finally {
                            }
                        }
                        return gVar;
                }
            }
        });
        final int i10 = 1;
        m d11 = he.a.d(new ve.a(this) { // from class: l6.d

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ e f8228y;

            {
                this.f8228y = this;
            }

            @Override // ve.a
            public final Object invoke() {
                t6.f cVar2;
                int i102;
                n6.g gVar;
                switch (i10) {
                    case 0:
                        Context context = this.f8228y.f8229a;
                        Bitmap.Config[] configArr = a7.f.f595a;
                        double d112 = 0.2d;
                        try {
                            Object e10 = i0.f.e(context, ActivityManager.class);
                            kotlin.jvm.internal.k.b(e10);
                            if (((ActivityManager) e10).isLowRamDevice()) {
                                d112 = 0.15d;
                            }
                        } catch (Exception unused) {
                        }
                        int i11 = 0;
                        y yVar = new y((byte) 0, 4);
                        if (d112 > 0.0d) {
                            Bitmap.Config[] configArr2 = a7.f.f595a;
                            try {
                                Object e11 = i0.f.e(context, ActivityManager.class);
                                kotlin.jvm.internal.k.b(e11);
                                ActivityManager activityManager = (ActivityManager) e11;
                                if ((context.getApplicationInfo().flags & 1048576) != 0) {
                                    i102 = activityManager.getLargeMemoryClass();
                                } else {
                                    i102 = activityManager.getMemoryClass();
                                }
                            } catch (Exception unused2) {
                                i102 = 256;
                            }
                            double d12 = d112 * i102;
                            double d13 = 1024;
                            i11 = (int) (d12 * d13 * d13);
                        }
                        if (i11 > 0) {
                            cVar2 = new l(i11, yVar);
                        } else {
                            cVar2 = new k7.c(yVar, 26);
                        }
                        return new t6.c(cVar2, yVar);
                    default:
                        e eVar = this.f8228y;
                        a7.k kVar = a7.k.f611a;
                        Context context2 = eVar.f8229a;
                        synchronized (kVar) {
                            try {
                                gVar = a7.k.f612b;
                                if (gVar == null) {
                                    x xVar = q.f1741a;
                                    of.d dVar = o0.f5694b;
                                    Bitmap.Config[] configArr3 = a7.f.f595a;
                                    File cacheDir = context2.getCacheDir();
                                    if (cacheDir != null) {
                                        cacheDir.mkdirs();
                                        File r10 = se.h.r(cacheDir);
                                        String str = c0.f1692y;
                                        c0 u3 = zb.d.u(r10);
                                        long j = 10485760;
                                        try {
                                            File file = u3.toFile();
                                            file.mkdir();
                                            StatFs statFs = new StatFs(file.getAbsolutePath());
                                            j = android.support.v4.media.session.b.e((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                        } catch (Exception unused3) {
                                        }
                                        n6.g gVar2 = new n6.g(j, xVar, u3, dVar);
                                        a7.k.f612b = gVar2;
                                        gVar = gVar2;
                                    } else {
                                        throw new IllegalStateException("cacheDir == null");
                                    }
                                }
                            } finally {
                            }
                        }
                        return gVar;
                }
            }
        });
        he.f fVar = this.f8231c;
        if (fVar == null) {
            fVar = he.a.d(new a0(15));
        }
        he.f fVar2 = fVar;
        b bVar2 = this.f8232d;
        if (bVar2 == null) {
            r rVar = r.f6846x;
            bVar = new b(rVar, rVar, rVar, rVar, rVar);
        } else {
            bVar = bVar2;
        }
        return new k(this.f8229a, cVar, d10, d11, fVar2, bVar, this.f8233e);
    }
}

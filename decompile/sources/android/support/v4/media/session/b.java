package android.support.v4.media.session;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EdgeEffect;
import androidx.lifecycle.z;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.UnityAdsConstants;
import d.p0;
import gf.f0;
import he.y;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import je.f;
import je.i;
import k0.e;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;
import ve.p;
import w8.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class b {
    public b() {
        new ConcurrentHashMap();
    }

    public static final Context b(tg.a aVar) {
        k.e(aVar, "<this>");
        try {
            return (Context) aVar.a(x.a(Context.class), null);
        } catch (kg.a unused) {
            throw new eg.a("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.", 0);
        }
    }

    public static i c(i iVar) {
        f fVar = iVar.f7435x;
        fVar.b();
        if (fVar.F > 0) {
            return iVar;
        }
        return i.f7434y;
    }

    public static int d(int i6, int i10) {
        if (i10 >= 0) {
            if (i6 < 0) {
                return 0;
            }
            if (i6 > i10) {
                return i10;
            }
            return i6;
        }
        throw new IllegalArgumentException(h8.c.j(i10, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
    }

    public static long e(long j, long j10, long j11) {
        if (j10 <= j11) {
            if (j < j10) {
                return j10;
            }
            if (j > j11) {
                return j11;
            }
            return j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j11 + " is less than minimum " + j10 + '.');
    }

    public static float l(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return w0.c.b(edgeEffect);
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static final void m(String key) {
        k.e(key, "key");
        throw new IllegalArgumentException(h8.c.m("No valid saved state was found for the key '", key, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static float p(EdgeEffect edgeEffect, float f3, float f10) {
        if (Build.VERSION.SDK_INT >= 31) {
            return w0.c.c(edgeEffect, f3, f10);
        }
        w0.b.a(edgeEffect, f3, f10);
        return f3;
    }

    public static final void q(p pVar) {
        Thread.interrupted();
        f0.C(new z(pVar, (le.c) null));
    }

    public static Set r(Object obj) {
        Set singleton = Collections.singleton(obj);
        k.d(singleton, "singleton(...)");
        return singleton;
    }

    public static void t(p pVar, gf.a aVar, gf.a aVar2) {
        try {
            mf.a.h(y.f6101a, a8.c.i(a8.c.e(aVar, aVar2, pVar)));
        } catch (Throwable th) {
            aVar2.resumeWith(he.a.b(th));
            throw th;
        }
    }

    public static af.a u(af.c cVar, int i6) {
        boolean z10;
        k.e(cVar, "<this>");
        if (i6 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Integer valueOf = Integer.valueOf(i6);
        if (z10) {
            int i10 = cVar.f709x;
            int i11 = cVar.f710y;
            if (cVar.f711z <= 0) {
                i6 = -i6;
            }
            return new af.a(i10, i11, i6);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static Bundle v(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(b.class.getClassLoader());
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [af.a, af.c] */
    public static af.c w(int i6, int i10) {
        if (i10 <= Integer.MIN_VALUE) {
            af.c cVar = af.c.A;
            return af.c.A;
        }
        return new af.a(i6, i10 - 1, 1);
    }

    public static int x(int i6) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i10 = 0; i10 < 6; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 != 0) {
                if (i12 == i6) {
                    return i11;
                }
            } else {
                throw null;
            }
        }
        return 1;
    }

    public abstract Typeface f(Context context, e eVar, Resources resources, int i6);

    public abstract Typeface g(Context context, q0.i[] iVarArr, int i6);

    public Typeface h(Context context, List list, int i6) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface i(Context context, InputStream inputStream) {
        File p10 = bf.y.p(context);
        if (p10 == null) {
            return null;
        }
        try {
            if (!bf.y.k(p10, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(p10.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            p10.delete();
        }
    }

    public Typeface j(Context context, Resources resources, int i6, String str, int i10) {
        File p10 = bf.y.p(context);
        if (p10 == null) {
            return null;
        }
        try {
            if (!bf.y.j(p10, resources, i6)) {
                return null;
            }
            return Typeface.createFromFile(p10.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            p10.delete();
        }
    }

    public q0.i k(q0.i[] iVarArr, int i6) {
        int i10;
        boolean z10;
        int i11;
        new l(17);
        if ((i6 & 1) == 0) {
            i10 = CommonGatewayClient.CODE_400;
        } else {
            i10 = 700;
        }
        if ((i6 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        q0.i iVar = null;
        int i12 = Integer.MAX_VALUE;
        for (q0.i iVar2 : iVarArr) {
            int abs = Math.abs(iVar2.f10819c - i10) * 2;
            if (iVar2.f10820d == z10) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            int i13 = abs + i11;
            if (iVar == null || i12 > i13) {
                iVar = iVar2;
                i12 = i13;
            }
        }
        return iVar;
    }

    public abstract void n(int i6);

    public abstract void o(Typeface typeface, boolean z10);

    public abstract void s(p0 p0Var, p0 p0Var2, Window window, View view, boolean z10, boolean z11);

    public void a(Window window) {
    }
}

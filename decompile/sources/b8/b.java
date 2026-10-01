package b8;

import android.os.Handler;
import android.os.Looper;
import he.m;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final m f1619a = he.a.d(a.f1618x);

    public static final void a(ve.a aVar) {
        if (k.a(Looper.myLooper(), Looper.getMainLooper())) {
            aVar.invoke();
        } else {
            ((Handler) f1619a.getValue()).post(new a2.a(aVar));
        }
    }
}

package t5;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static v.j f12286b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f12285a = new LinearInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ob.d f12287c = ob.d.f("t", "s", "e", "o", "i", "h", "to", "ti");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ob.d f12288d = ob.d.f("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator pathInterpolator;
        pointF.x = v5.g.b(pointF.x, -1.0f, 1.0f);
        pointF.y = v5.g.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = v5.g.b(pointF2.x, -1.0f, 1.0f);
        float fB = v5.g.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        float f = pointF.x;
        float f4 = pointF.y;
        float f10 = pointF2.x;
        Matrix matrix = v5.i.f13208a;
        int i = f != 0.0f ? (int) (527 * f) : 17;
        if (f4 != 0.0f) {
            i = (int) (i * 31 * f4);
        }
        if (f10 != 0.0f) {
            i = (int) (i * 31 * f10);
        }
        if (fB != 0.0f) {
            i = (int) (i * 31 * fB);
        }
        synchronized (o.class) {
            if (f12286b == null) {
                f12286b = new v.j();
            }
            weakReference = (WeakReference) f12286b.c(i);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference != null && interpolator != null) {
            return interpolator;
        }
        try {
            pathInterpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e7) {
            pathInterpolator = "The Path cannot loop back on itself.".equals(e7.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        try {
            c(i, new WeakReference(pathInterpolator));
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return pathInterpolator;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static w5.a b(u5.b r25, j5.j r26, float r27, t5.d0 r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.o.b(u5.b, j5.j, float, t5.d0, boolean, boolean):w5.a");
    }

    public static void c(int i, WeakReference weakReference) {
        synchronized (o.class) {
            f12286b.d(i, weakReference);
        }
    }
}

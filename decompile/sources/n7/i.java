package n7;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.os.Build;
import com.unity3d.services.UnityAdsConstants;
import java.io.Closeable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Matrix f9124a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public static final e9.h f9125b = new e9.h(1);

    /* renamed from: c, reason: collision with root package name */
    public static final e9.h f9126c = new e9.h(2);

    /* renamed from: d, reason: collision with root package name */
    public static final e9.h f9127d = new e9.h(3);

    /* renamed from: e, reason: collision with root package name */
    public static final e9.h f9128e = new e9.h(4);

    /* renamed from: f, reason: collision with root package name */
    public static final float f9129f = (float) (Math.sqrt(2.0d) / 2.0d);

    public static void a(Path path, float f3, float f10, float f11) {
        PathMeasure pathMeasure = (PathMeasure) f9125b.get();
        Path path2 = (Path) f9126c.get();
        Path path3 = (Path) f9127d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if ((f3 != 1.0f || f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && length >= 1.0f && Math.abs((f10 - f3) - 1.0f) >= 0.01d) {
            float f12 = f3 * length;
            float f13 = f10 * length;
            float f14 = f11 * length;
            float min = Math.min(f12, f13) + f14;
            float max = Math.max(f12, f13) + f14;
            if (min >= length && max >= length) {
                min = g.d(min, length);
                max = g.d(max, length);
            }
            if (min < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                min = g.d(min, length);
            }
            if (max < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                max = g.d(max, length);
            }
            if (min == max) {
                path.reset();
                return;
            }
            if (min >= max) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
        }
    }

    public static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static Bitmap d(Bitmap bitmap, int i6, int i10) {
        if (bitmap.getWidth() == i6 && bitmap.getHeight() == i10) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i6, i10, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static void e(Canvas canvas, RectF rectF, Paint paint, int i6) {
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i6);
        } else {
            canvas.saveLayer(rectF, paint);
        }
    }
}

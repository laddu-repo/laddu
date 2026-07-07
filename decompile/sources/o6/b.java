package o6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import kotlin.jvm.internal.k;
import w6.g;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends Drawable implements Animatable {
    public Canvas E;
    public Bitmap F;
    public float I;
    public float J;
    public boolean K;
    public long L;
    public long M;
    public Picture O;
    public boolean Q;

    /* renamed from: x, reason: collision with root package name */
    public final Movie f10006x;

    /* renamed from: y, reason: collision with root package name */
    public final Bitmap.Config f10007y;

    /* renamed from: z, reason: collision with root package name */
    public final g f10008z;
    public final Paint A = new Paint(3);
    public final ArrayList B = new ArrayList();
    public final Rect C = new Rect();
    public final Rect D = new Rect();
    public float G = 1.0f;
    public float H = 1.0f;
    public int N = -1;
    public y6.a P = y6.a.f15003x;

    public b(Movie movie, Bitmap.Config config, g gVar) {
        Bitmap.Config config2;
        this.f10006x = movie;
        this.f10007y = config;
        this.f10008z = gVar;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                throw new IllegalArgumentException("Bitmap config must not be hardware.");
            }
        }
    }

    public final void a(Canvas canvas) {
        Paint paint = this.A;
        Canvas canvas2 = this.E;
        Bitmap bitmap = this.F;
        if (canvas2 != null && bitmap != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            int save = canvas2.save();
            try {
                float f3 = this.G;
                canvas2.scale(f3, f3);
                this.f10006x.draw(canvas2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
                Picture picture = this.O;
                if (picture != null) {
                    picture.draw(canvas2);
                }
                canvas2.restoreToCount(save);
                int save2 = canvas.save();
                try {
                    canvas.translate(this.I, this.J);
                    float f10 = this.H;
                    canvas.scale(f10, f10);
                    canvas.drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
                } finally {
                    canvas.restoreToCount(save2);
                }
            } catch (Throwable th) {
                canvas2.restoreToCount(save);
                throw th;
            }
        }
    }

    public final void b(Rect rect) {
        Rect rect2 = this.C;
        if (!k.a(rect2, rect)) {
            rect2.set(rect);
            int width = rect.width();
            int height = rect.height();
            Movie movie = this.f10006x;
            int width2 = movie.width();
            int height2 = movie.height();
            if (width2 > 0 && height2 > 0) {
                g gVar = this.f10008z;
                double f3 = a8.a.f(width2, height2, width, height, gVar);
                if (!this.Q && f3 > 1.0d) {
                    f3 = 1.0d;
                }
                float f10 = (float) f3;
                this.G = f10;
                int i6 = (int) (width2 * f10);
                int i10 = (int) (f10 * height2);
                Bitmap createBitmap = Bitmap.createBitmap(i6, i10, this.f10007y);
                Bitmap bitmap = this.F;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.F = createBitmap;
                this.E = new Canvas(createBitmap);
                if (this.Q) {
                    this.H = 1.0f;
                    this.I = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    this.J = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    return;
                }
                float f11 = (float) a8.a.f(i6, i10, width, height, gVar);
                this.H = f11;
                float f12 = width - (i6 * f11);
                float f13 = 2;
                this.I = (f12 / f13) + rect.left;
                this.J = ((height - (f11 * i10)) / f13) + rect.top;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        Movie movie = this.f10006x;
        int duration = movie.duration();
        if (duration == 0) {
            duration = 0;
            z10 = false;
        } else {
            if (this.K) {
                this.M = SystemClock.uptimeMillis();
            }
            int i6 = (int) (this.M - this.L);
            int i10 = i6 / duration;
            int i11 = this.N;
            if (i11 != -1 && i10 > i11) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                duration = i6 - (i10 * duration);
            }
        }
        movie.setTime(duration);
        if (this.Q) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            Rect rect = this.D;
            rect.set(0, 0, width, height);
            b(rect);
            int save = canvas.save();
            try {
                float f3 = 1 / this.G;
                canvas.scale(f3, f3);
                a(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            b(getBounds());
            a(canvas);
        }
        if (this.K && z10) {
            invalidateSelf();
        } else {
            stop();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f10006x.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f10006x.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.A.getAlpha() == 255) {
            y6.a aVar = this.P;
            if (aVar != y6.a.f15004y) {
                if (aVar == y6.a.f15003x && this.f10006x.isOpaque()) {
                    return -1;
                }
                return -3;
            }
            return -1;
        }
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.K;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        if (i6 >= 0 && i6 < 256) {
            this.A.setAlpha(i6);
            return;
        }
        throw new IllegalArgumentException(h8.c.i(i6, "Invalid alpha: ").toString());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.K) {
            return;
        }
        this.K = true;
        this.L = SystemClock.uptimeMillis();
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((pa.c) arrayList.get(i6)).b(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.K) {
            this.K = false;
            ArrayList arrayList = this.B;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((pa.c) arrayList.get(i6)).a(this);
            }
        }
    }
}

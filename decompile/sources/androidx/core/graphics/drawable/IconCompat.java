package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.unity3d.services.UnityAdsConstants;
import j0.a;
import j4.n;
import java.lang.reflect.InvocationTargetException;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f858k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f859a;

    /* renamed from: b, reason: collision with root package name */
    public Object f860b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f861c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f862d;

    /* renamed from: e, reason: collision with root package name */
    public int f863e;

    /* renamed from: f, reason: collision with root package name */
    public int f864f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f865g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f866h;

    /* renamed from: i, reason: collision with root package name */
    public String f867i;
    public String j;

    public IconCompat() {
        this.f859a = -1;
        this.f861c = null;
        this.f862d = null;
        this.f863e = 0;
        this.f864f = 0;
        this.f865g = null;
        this.f866h = f858k;
        this.f867i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z10) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f3 = min;
        float f10 = 0.5f * f3;
        float f11 = 0.9166667f * f10;
        if (z10) {
            float f12 = 0.010416667f * f3;
            paint.setColor(0);
            paint.setShadowLayer(f12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3 * 0.020833334f, 1023410176);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.setShadowLayer(f12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 503316480);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f10, f10, f11, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(int i6) {
        if (i6 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f863e = i6;
            iconCompat.f860b = HttpUrl.FRAGMENT_ENCODE_SET;
            iconCompat.j = HttpUrl.FRAGMENT_ENCODE_SET;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public final Bitmap c() {
        int i6 = this.f859a;
        if (i6 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f860b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i6 == 1) {
            return (Bitmap) this.f860b;
        }
        if (i6 == 5) {
            return a((Bitmap) this.f860b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public final int d() {
        int i6;
        int i10 = this.f859a;
        if (i10 == -1 && (i6 = Build.VERSION.SDK_INT) >= 23) {
            Object obj = this.f860b;
            if (i6 >= 28) {
                return a.e(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }
        if (i10 == 2) {
            return this.f863e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final int e() {
        int i6;
        int i10 = this.f859a;
        if (i10 == -1 && (i6 = Build.VERSION.SDK_INT) >= 23) {
            Object obj = this.f860b;
            if (i6 >= 28) {
                return a.m(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                return -1;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                return -1;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                return -1;
            }
        }
        return i10;
    }

    public final Uri f() {
        int i6;
        int i10 = this.f859a;
        if (i10 == -1 && (i6 = Build.VERSION.SDK_INT) >= 23) {
            Object obj = this.f860b;
            if (i6 >= 28) {
                return a.n(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }
        if (i10 != 4 && i10 != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.f860b);
    }

    public final Icon g(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return n.p(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    public final String toString() {
        String str;
        if (this.f859a == -1) {
            return String.valueOf(this.f860b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f859a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f859a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f860b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f860b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(d())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f863e);
                if (this.f864f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f864f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f860b);
                break;
        }
        if (this.f865g != null) {
            sb2.append(" tint=");
            sb2.append(this.f865g);
        }
        if (this.f866h != f858k) {
            sb2.append(" mode=");
            sb2.append(this.f866h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i6) {
        this.f861c = null;
        this.f862d = null;
        this.f863e = 0;
        this.f864f = 0;
        this.f865g = null;
        this.f866h = f858k;
        this.f867i = null;
        this.f859a = i6;
    }
}

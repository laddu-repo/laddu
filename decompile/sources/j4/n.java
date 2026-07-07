package j4;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.graphics.drawable.LayerDrawable;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import p.b1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class n {
    public static int a(b1 b1Var) {
        return b1Var.getBreakStrategy();
    }

    public static Drawable b(CompoundButton compoundButton) {
        return compoundButton.getButtonDrawable();
    }

    public static int c(b1 b1Var) {
        return b1Var.getHyphenationFrequency();
    }

    public static int d(Drawable drawable) {
        return drawable.getLayoutDirection();
    }

    public static Uri e(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    public static boolean f(TextPaint textPaint, String str) {
        return textPaint.hasGlyph(str);
    }

    public static ActivityOptions g() {
        return ActivityOptions.makeBasic();
    }

    public static void h(b1 b1Var, int i6) {
        b1Var.setBreakStrategy(i6);
    }

    public static void i(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public static void j(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    public static void k(b1 b1Var, int i6) {
        b1Var.setHyphenationFrequency(i6);
    }

    public static boolean l(Drawable drawable, int i6) {
        return drawable.setLayoutDirection(i6);
    }

    public static void m(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }

    public static void n(PopupWindow popupWindow, boolean z10) {
        popupWindow.setOverlapAnchor(z10);
    }

    public static void o(PopupWindow popupWindow, int i6) {
        popupWindow.setWindowLayoutType(i6);
    }

    public static Icon p(IconCompat iconCompat, Context context) {
        Icon createWithBitmap;
        int i6;
        int i10 = iconCompat.f859a;
        String str = null;
        r2 = null;
        InputStream openInputStream = null;
        str = null;
        str = null;
        switch (i10) {
            case -1:
                return (Icon) iconCompat.f860b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f860b);
                break;
            case 2:
                if (i10 == -1 && (i6 = Build.VERSION.SDK_INT) >= 23) {
                    Object obj = iconCompat.f860b;
                    if (i6 >= 28) {
                        str = j0.a.f(obj);
                    } else {
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e10) {
                            Log.e("IconCompat", "Unable to get icon package", e10);
                        } catch (NoSuchMethodException e11) {
                            Log.e("IconCompat", "Unable to get icon package", e11);
                        } catch (InvocationTargetException e12) {
                            Log.e("IconCompat", "Unable to get icon package", e12);
                        }
                    }
                } else if (i10 == 2) {
                    String str2 = iconCompat.j;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) iconCompat.f860b).split(":", -1)[0] : iconCompat.j;
                } else {
                    throw new IllegalStateException("called getResPackage() on " + iconCompat);
                }
                createWithBitmap = Icon.createWithResource(str, iconCompat.f863e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) iconCompat.f860b, iconCompat.f863e, iconCompat.f864f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) iconCompat.f860b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    createWithBitmap = jd.u.a((Bitmap) iconCompat.f860b);
                    break;
                } else {
                    createWithBitmap = Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.f860b, false));
                    break;
                }
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = m0.a.a(iconCompat.f());
                    break;
                } else if (context != null) {
                    Uri f3 = iconCompat.f();
                    String scheme = f3.getScheme();
                    if (!HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(scheme) && !"file".equals(scheme)) {
                        try {
                            openInputStream = new FileInputStream(new File((String) iconCompat.f860b));
                        } catch (FileNotFoundException e13) {
                            Log.w("IconCompat", "Unable to load image from path: " + f3, e13);
                        }
                    } else {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(f3);
                        } catch (Exception e14) {
                            Log.w("IconCompat", "Unable to load image from URI: " + f3, e14);
                        }
                    }
                    if (openInputStream != null) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            createWithBitmap = jd.u.a(BitmapFactory.decodeStream(openInputStream));
                            break;
                        } else {
                            createWithBitmap = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(openInputStream), false));
                            break;
                        }
                    } else {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.f());
                    }
                } else {
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.f());
                }
        }
        ColorStateList colorStateList = iconCompat.f865g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.f866h;
        if (mode != IconCompat.f858k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public static void q(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i6) {
        layerDrawable2.setLayerGravity(i6, layerDrawable.getLayerGravity(i6));
        layerDrawable2.setLayerWidth(i6, layerDrawable.getLayerWidth(i6));
        layerDrawable2.setLayerHeight(i6, layerDrawable.getLayerHeight(i6));
        layerDrawable2.setLayerInsetLeft(i6, layerDrawable.getLayerInsetLeft(i6));
        layerDrawable2.setLayerInsetRight(i6, layerDrawable.getLayerInsetRight(i6));
        layerDrawable2.setLayerInsetTop(i6, layerDrawable.getLayerInsetTop(i6));
        layerDrawable2.setLayerInsetBottom(i6, layerDrawable.getLayerInsetBottom(i6));
        layerDrawable2.setLayerInsetStart(i6, layerDrawable.getLayerInsetStart(i6));
        layerDrawable2.setLayerInsetEnd(i6, layerDrawable.getLayerInsetEnd(i6));
    }
}

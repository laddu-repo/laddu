package c9;

import android.app.UiModeManager;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Bundle;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.j5;
import j2.e;
import j4.n;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import jb.g;
import kotlin.jvm.internal.k;
import mc.d;
import mc.l;
import p.b1;
import p.n2;
import r1.j0;
import w0.h;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f1986a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f1987b;

    /* renamed from: c, reason: collision with root package name */
    public static UiModeManager f1988c;

    public static float a(float f3, float f10, float f11) {
        if (f3 < f10) {
            return f10;
        }
        if (f3 > f11) {
            return f11;
        }
        return f3;
    }

    public static int b(int i6, int i10, int i11) {
        if (i6 < i10) {
            return i10;
        }
        if (i6 > i11) {
            return i11;
        }
        return i6;
    }

    public static final void c(AutoCloseable autoCloseable, Throwable th) {
        if (autoCloseable != null) {
            if (th == null) {
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                    return;
                }
                if (autoCloseable instanceof ExecutorService) {
                    e.u((ExecutorService) autoCloseable);
                    return;
                }
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                }
                if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                }
                if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof DrmManagerClient) {
                    ((DrmManagerClient) autoCloseable).release();
                    return;
                } else {
                    if (autoCloseable instanceof ContentProviderClient) {
                        ((ContentProviderClient) autoCloseable).release();
                        return;
                    }
                    throw new IllegalArgumentException();
                }
            }
            try {
                h8.c.r(autoCloseable);
            } catch (Throwable th2) {
                he.a.a(th, th2);
            }
        }
    }

    public static Drawable f(Context context, int i6) {
        return n2.d().f(context, i6);
    }

    public static final d g() {
        d c10 = ((l) g.c().b(l.class)).c();
        k.d(c10, "getInstance()");
        return c10;
    }

    public static r0.c h(b1 b1Var) {
        int i6;
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            return new r0.c(j0.a.l(b1Var));
        }
        TextPaint textPaint = new TextPaint(b1Var.getPaint());
        boolean z10 = false;
        if (i11 >= 23) {
            i6 = 1;
            i10 = 1;
        } else {
            i6 = 0;
            i10 = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (i11 >= 23) {
            i6 = n.a(b1Var);
            i10 = n.c(b1Var);
        }
        if (b1Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i11 >= 28 && (b1Var.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(j0.a.c(p0.b.c(b1Var.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        } else {
            if (b1Var.getLayoutDirection() == 1) {
                z10 = true;
            }
            switch (b1Var.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z10) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    }
                    break;
            }
        }
        return new r0.c(textPaint, textDirectionHeuristic, i6, i10);
    }

    public static synchronized boolean j(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f1986a;
            if (context2 != null && (bool = f1987b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f1987b = null;
            if (a9.b.d()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                f1987b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f1987b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f1987b = Boolean.FALSE;
                }
            }
            f1986a = applicationContext;
            return f1987b.booleanValue();
        }
    }

    public static final ArrayList k(Map map, ve.l lVar) {
        Boolean bool;
        k.e(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            l4.g gVar = (l4.g) entry.getValue();
            if (gVar != null) {
                bool = Boolean.valueOf(gVar.f8121b);
            } else {
                bool = null;
            }
            k.b(bool);
            if (!bool.booleanValue() && !gVar.f8122c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) lVar.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void l(String key, Bundle bundle) {
        k.e(key, "key");
        bundle.putString(key, null);
    }

    public static final void m(Bundle bundle, String key, Bundle value) {
        k.e(key, "key");
        k.e(value, "value");
        bundle.putBundle(key, value);
    }

    public static final void n(String key, String value, Bundle bundle) {
        k.e(key, "key");
        k.e(value, "value");
        bundle.putString(key, value);
    }

    public static final void o(Bundle bundle, String str, List list) {
        ArrayList<String> arrayList;
        if (list instanceof ArrayList) {
            arrayList = (ArrayList) list;
        } else {
            arrayList = new ArrayList<>(list);
        }
        bundle.putStringArrayList(str, arrayList);
    }

    public static b4.g p(b4.g gVar, String[] strArr, Map map) {
        int i6 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (b4.g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                b4.g gVar2 = new b4.g();
                int length = strArr.length;
                while (i6 < length) {
                    gVar2.a((b4.g) map.get(strArr[i6]));
                    i6++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                gVar.a((b4.g) map.get(strArr[0]));
                return gVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i6 < length2) {
                    gVar.a((b4.g) map.get(strArr[i6]));
                    i6++;
                }
            }
        }
        return gVar;
    }

    public static void q(TextView textView, int i6) {
        int i10;
        j5.c(i6);
        if (Build.VERSION.SDK_INT >= 28) {
            j0.a.o(textView, i6);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i10 = fontMetricsInt.top;
        } else {
            i10 = fontMetricsInt.ascent;
        }
        if (i6 > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), i6 + i10, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void r(TextView textView, int i6) {
        int i10;
        j5.c(i6);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i10 = fontMetricsInt.bottom;
        } else {
            i10 = fontMetricsInt.descent;
        }
        if (i6 > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i6 - i10);
        }
    }

    public static void s(TextView textView, int i6) {
        j5.c(i6);
        if (i6 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i6 - r0, 1.0f);
        }
    }

    public static void t(TextView textView, int i6) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i6);
        } else {
            textView.setTextAppearance(textView.getContext(), i6);
        }
    }

    public static ActionMode.Callback v(ActionMode.Callback callback) {
        if ((callback instanceof h) && Build.VERSION.SDK_INT >= 26) {
            return ((h) callback).f13524a;
        }
        return callback;
    }

    public static ActionMode.Callback w(ActionMode.Callback callback, TextView textView) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26 && i6 <= 27 && !(callback instanceof h) && callback != null) {
            return new h(callback, textView);
        }
        return callback;
    }

    public j0 d(h3.a aVar) {
        boolean z10;
        ByteBuffer byteBuffer = aVar.f14812z;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        return e(aVar, byteBuffer);
    }

    public abstract j0 e(h3.a aVar, ByteBuffer byteBuffer);

    public abstract float i(Object obj);

    public abstract void u(Object obj, float f3);
}

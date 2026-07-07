package o5;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class e0 implements t0.w, u4.a, u6.f, sd.b, v3.k, y2.g {
    public static Field A = null;
    public static boolean B = false;
    public static boolean C = true;
    public static boolean D = true;

    /* renamed from: x, reason: collision with root package name */
    public static boolean f9949x = true;

    /* renamed from: y, reason: collision with root package name */
    public static Method f9950y;

    /* renamed from: z, reason: collision with root package name */
    public static boolean f9951z;

    public static ef.g e(u2.h hVar, j2.y yVar) {
        IOException iOException = (IOException) yVar.f7145z;
        if (iOException instanceof w1.v) {
            int i6 = ((w1.v) iOException).A;
            if (i6 == 403 || i6 == 404 || i6 == 410 || i6 == 416 || i6 == 500 || i6 == 503) {
                if (hVar.a(1)) {
                    return new ef.g(1, 300000L);
                }
                if (hVar.a(2)) {
                    return new ef.g(2, 60000L);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static long h(j2.y yVar) {
        Throwable th = (IOException) yVar.f7145z;
        if (!(th instanceof r1.l0) && !(th instanceof FileNotFoundException) && !(th instanceof w1.s) && !(th instanceof u2.n)) {
            int i6 = w1.j.f13537y;
            while (th != null) {
                if (!(th instanceof w1.j) || ((w1.j) th).f13538x != 2008) {
                    th = th.getCause();
                } else {
                    return -9223372036854775807L;
                }
            }
            return Math.min((yVar.f7144y - 1) * UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_DURATION);
        }
        return -9223372036854775807L;
    }

    @Override // u6.f
    public boolean a() {
        return true;
    }

    @Override // v3.k
    public v3.m c(r1.q qVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // u4.a
    public void d() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public int f(int i6) {
        if (i6 == 7) {
            return 6;
        }
        return 3;
    }

    @Override // v3.k
    public boolean g(r1.q qVar) {
        return false;
    }

    @Override // u4.a
    public void i(int i6, Object obj) {
        String str;
        switch (i6) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = HttpUrl.FRAGMENT_ENCODE_SET;
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i6 != 6 && i6 != 7 && i6 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
    }

    public float j(View view) {
        if (f9949x) {
            try {
                return c0.a(view);
            } catch (NoSuchMethodError unused) {
                f9949x = false;
            }
        }
        return view.getAlpha();
    }

    public void k(View view, int i6, int i10, int i11, int i12) {
        if (!f9951z) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f9950y = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setFrame method", e10);
            }
            f9951z = true;
        }
        Method method = f9950y;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i6), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }
    }

    public void l(s8.l lVar, float f3) {
        u.b bVar = (u.b) ((Drawable) lVar.f12251y);
        u.a aVar = (u.a) lVar.f12252z;
        boolean useCompatPadding = aVar.getUseCompatPadding();
        boolean preventCornerOverlap = aVar.getPreventCornerOverlap();
        if (f3 != bVar.f12723e || bVar.f12724f != useCompatPadding || bVar.f12725g != preventCornerOverlap) {
            bVar.f12723e = f3;
            bVar.f12724f = useCompatPadding;
            bVar.f12725g = preventCornerOverlap;
            bVar.b(null);
            bVar.invalidateSelf();
        }
        if (!aVar.getUseCompatPadding()) {
            lVar.y(0, 0, 0, 0);
            return;
        }
        u.b bVar2 = (u.b) ((Drawable) lVar.f12251y);
        float f10 = bVar2.f12723e;
        float f11 = bVar2.f12719a;
        int ceil = (int) Math.ceil(u.c.a(f10, f11, aVar.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(u.c.b(f10, f11, aVar.getPreventCornerOverlap()));
        lVar.y(ceil, ceil2, ceil, ceil2);
    }

    public void m(View view, float f3) {
        if (f9949x) {
            try {
                c0.b(view, f3);
                return;
            } catch (NoSuchMethodError unused) {
                f9949x = false;
            }
        }
        view.setAlpha(f3);
    }

    public void n(View view, int i6) {
        if (!B) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                A = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            B = true;
        }
        Field field = A;
        if (field != null) {
            try {
                A.setInt(view, i6 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    @Override // v3.k
    public int o(r1.q qVar) {
        return 1;
    }

    public void p(View view, Matrix matrix) {
        if (C) {
            try {
                d0.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                C = false;
            }
        }
    }

    public void q(View view, Matrix matrix) {
        if (D) {
            try {
                d0.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                D = false;
            }
        }
    }

    @Override // u6.f
    public void shutdown() {
    }

    @Override // y2.g
    public long b(long j) {
        return j;
    }

    @Override // t0.w
    public void onScrollLimit(int i6, int i10, int i11, boolean z10) {
    }

    @Override // t0.w
    public void onScrollProgress(int i6, int i10, int i11, int i12) {
    }
}

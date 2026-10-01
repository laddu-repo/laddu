package h8;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import db.h0;
import db.k0;
import j1.p0;
import j1.y;
import j2.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.k;
import v3.l;
import v3.m;
import w6.h;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static v3.b a(m mVar, byte[] bArr, int i6) {
        h0 j = k0.j();
        mVar.o(bArr, 0, i6, l.f13282c, new u(j, 15));
        return new v3.b(j.g());
    }

    public static e9.f b(int i6, int i10, int i11) {
        if (i6 == -2) {
            return w6.b.f14124k;
        }
        int i12 = i6 - i11;
        if (i12 > 0) {
            return new w6.a(i12);
        }
        int i13 = i10 - i11;
        if (i13 > 0) {
            return new w6.a(i13);
        }
        return null;
    }

    public static h c(w6.f fVar) {
        int i6;
        View view = fVar.f14130a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i10 = -1;
        if (layoutParams != null) {
            i6 = layoutParams.width;
        } else {
            i6 = -1;
        }
        e9.f b10 = b(i6, view.getWidth(), view.getPaddingRight() + view.getPaddingLeft());
        if (b10 != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                i10 = layoutParams2.height;
            }
            e9.f b11 = b(i10, view.getHeight(), view.getPaddingBottom() + view.getPaddingTop());
            if (b11 == null) {
                return null;
            }
            return new h(b10, b11);
        }
        return null;
    }

    public static final void d(int i6, View view, ViewGroup container) {
        k.e(view, "view");
        k.e(container, "container");
        if (p0.L(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int c10 = y.e.c(i6);
        ViewGroup viewGroup = null;
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 == 3) {
                        if (p0.L(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    return;
                }
                if (p0.L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                }
                view.setVisibility(8);
                return;
            }
            if (p0.L(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            }
            if (viewGroup == null) {
                if (p0.L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                }
                container.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        ViewParent parent2 = view.getParent();
        if (parent2 instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent2;
        }
        if (viewGroup != null) {
            if (p0.L(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
            }
            viewGroup.removeView(view);
        }
    }

    public static final boolean e(int i6) {
        if (i6 != 3 && i6 != 4 && i6 != 6) {
            return false;
        }
        return true;
    }

    public static float f(float f3, float f10, float f11, float f12) {
        return ((f3 - f10) * f11) + f12;
    }

    public static int g(String str, int i6, int i10) {
        return (str.hashCode() + i6) * i10;
    }

    public static ClassCastException h(int i6, ArrayList arrayList) {
        arrayList.get(i6).getClass();
        return new ClassCastException();
    }

    public static String i(int i6, String str) {
        return str + i6;
    }

    public static String j(int i6, String str, String str2) {
        return str + i6 + str2;
    }

    public static String k(String str, y yVar, String str2) {
        return str + yVar + str2;
    }

    public static String l(String str, String str2, int i6, int i10) {
        return str + i6 + str2 + i10;
    }

    public static String m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static StringBuilder n(int i6, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i6);
        sb2.append(str2);
        return sb2;
    }

    public static /* synthetic */ void o(int i6, String str) {
        if (i6 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = k.class.getName();
            int i10 = 0;
            while (!stackTrace[i10].getClassName().equals(name)) {
                i10++;
            }
            while (stackTrace[i10].getClassName().equals(name)) {
                i10++;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            k.h(nullPointerException, k.class.getName());
            throw nullPointerException;
        }
    }

    public static void p(int i6, String str, String str2) {
        u1.a.p(str2, str + i6);
    }

    public static void q(int i6, HashMap hashMap, String str, int i10, String str2) {
        hashMap.put(str, Integer.valueOf(i6));
        hashMap.put(str2, Integer.valueOf(i10));
    }

    public static /* synthetic */ void r(AutoCloseable autoCloseable) {
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            j2.e.u((ExecutorService) autoCloseable);
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
        } else if (autoCloseable instanceof DrmManagerClient) {
            ((DrmManagerClient) autoCloseable).release();
        } else {
            if (autoCloseable instanceof ContentProviderClient) {
                ((ContentProviderClient) autoCloseable).release();
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    public static void s(String str, String str2, String str3) {
        u1.a.p(str3, str + str2);
    }

    public static /* synthetic */ String t(int i6) {
        switch (i6) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String u(int i6) {
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    return "null";
                }
                return "REMOVING";
            }
            return "ADDING";
        }
        return "NONE";
    }

    public static /* synthetic */ String v(int i6) {
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        return "null";
                    }
                    return "INVISIBLE";
                }
                return "GONE";
            }
            return "VISIBLE";
        }
        return "REMOVED";
    }

    public static /* synthetic */ String w(int i6) {
        switch (i6) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String x(int i6) {
        switch (i6) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }
}

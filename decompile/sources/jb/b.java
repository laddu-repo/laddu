package jb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.View;
import b1.m;
import b1.r;
import df.u;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.k;
import l4.i0;
import l4.k0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class b {
    public static void a(Parcel parcel, Parcelable parcelable) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
    }

    public static String b(String str, int i6, int i10) {
        if (i6 < 0) {
            return k6.e.f("%s (%s) must not be negative", str, Integer.valueOf(i6));
        }
        if (i10 >= 0) {
            return k6.e.f("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i6), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(h8.c.i(i10, "negative size: "));
    }

    public static void c(long j, String str, boolean z10) {
        if (z10) {
        } else {
            throw new IllegalArgumentException(k6.e.f(str, Long.valueOf(j)));
        }
    }

    public static void d(String str, boolean z10) {
        if (z10) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static void e(int i6, int i10) {
        String f3;
        if (i6 >= 0 && i6 < i10) {
            return;
        }
        if (i6 >= 0) {
            if (i10 >= 0) {
                f3 = k6.e.f("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i6), Integer.valueOf(i10));
            } else {
                throw new IllegalArgumentException(h8.c.i(i10, "negative size: "));
            }
        } else {
            f3 = k6.e.f("%s (%s) must not be negative", "index", Integer.valueOf(i6));
        }
        throw new IndexOutOfBoundsException(f3);
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static void g(int i6, int i10) {
        if (i6 >= 0 && i6 <= i10) {
        } else {
            throw new IndexOutOfBoundsException(b("index", i6, i10));
        }
    }

    public static void h(int i6, int i10, int i11) {
        String b10;
        if (i6 >= 0 && i10 >= i6 && i10 <= i11) {
            return;
        }
        if (i6 >= 0 && i6 <= i11) {
            if (i10 >= 0 && i10 <= i11) {
                b10 = k6.e.f("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i6));
            } else {
                b10 = b("end index", i10, i11);
            }
        } else {
            b10 = b("start index", i6, i11);
        }
        throw new IndexOutOfBoundsException(b10);
    }

    public static void i(String str, boolean z10) {
        if (z10) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static final void j(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                he.a.a(th, th2);
            }
        }
    }

    public static final int k(g5.c cVar, String str) {
        k.e(cVar, "<this>");
        int l10 = l(cVar, str);
        if (l10 >= 0) {
            return l10;
        }
        int l11 = l(cVar, "`" + str + '`');
        if (l11 >= 0) {
            return l11;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount = cVar.getColumnCount();
            String concat = ".".concat(str);
            String b10 = w8.k.b('`', ".", str);
            for (int i6 = 0; i6 < columnCount; i6++) {
                String columnName = cVar.getColumnName(i6);
                if (columnName.length() >= str.length() + 2 && (u.z(columnName, concat, false) || (columnName.charAt(0) == '`' && u.z(columnName, b10, false)))) {
                    return i6;
                }
            }
            return -1;
        }
        return -1;
    }

    public static final int l(g5.c cVar, String name) {
        k.e(cVar, "<this>");
        k.e(name, "name");
        int columnCount = cVar.getColumnCount();
        for (int i6 = 0; i6 < columnCount; i6++) {
            if (name.equals(cVar.getColumnName(i6))) {
                return i6;
            }
        }
        return -1;
    }

    public static int m(int i6, int i10) {
        return l0.b.d(i6, (Color.alpha(i6) * i10) / 255);
    }

    public static int n(Context context, int i6, int i10) {
        Integer num;
        int i11;
        TypedValue o10 = a8.g.o(context, i6);
        if (o10 != null) {
            int i12 = o10.resourceId;
            if (i12 != 0) {
                i11 = i0.f.c(context, i12);
            } else {
                i11 = o10.data;
            }
            num = Integer.valueOf(i11);
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return i10;
    }

    public static int o(View view, int i6) {
        Context context = view.getContext();
        TypedValue q9 = a8.g.q(i6, view.getContext(), view.getClass().getCanonicalName());
        int i10 = q9.resourceId;
        if (i10 != 0) {
            return i0.f.c(context, i10);
        }
        return q9.data;
    }

    public static final int p(g5.c stmt, String str) {
        k.e(stmt, "stmt");
        int k8 = k(stmt, str);
        if (k8 >= 0) {
            return k8;
        }
        int columnCount = stmt.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i6 = 0; i6 < columnCount; i6++) {
            arrayList.add(stmt.getColumnName(i6));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + ie.j.L(arrayList, null, null, null, null, 63) + ']');
    }

    public static String q(Class cls) {
        LinkedHashMap linkedHashMap = k0.f8156b;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            i0 i0Var = (i0) cls.getAnnotation(i0.class);
            if (i0Var != null) {
                str = i0Var.value();
            } else {
                str = null;
            }
            if (str != null && str.length() > 0) {
                linkedHashMap.put(cls, str);
            } else {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
        }
        k.b(str);
        return str;
    }

    public static Object r(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return d.k.b(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (f.a.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final j6.a s(i.j jVar, Class cls) {
        boolean z10 = true;
        h8.c.o(1, "createMethod");
        int c10 = y.e.c(1);
        boolean z11 = false;
        byte b10 = 0;
        byte b11 = 0;
        if (c10 != 0) {
            if (c10 == 1) {
                return new j6.a(z11, new m(2, cls, jVar), b11 == true ? 1 : 0);
            }
            throw new RuntimeException();
        }
        j6.d dVar = j6.d.f7238x;
        return new j6.a(z10, new r(cls), b10 == true ? 1 : 0);
    }

    public static boolean t(int i6) {
        double pow;
        double pow2;
        double pow3;
        if (i6 != 0) {
            ThreadLocal threadLocal = l0.b.f8060a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i6);
            int green = Color.green(i6);
            int blue = Color.blue(i6);
            if (dArr.length == 3) {
                double d10 = red / 255.0d;
                if (d10 < 0.04045d) {
                    pow = d10 / 12.92d;
                } else {
                    pow = Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
                }
                double d11 = green / 255.0d;
                if (d11 < 0.04045d) {
                    pow2 = d11 / 12.92d;
                } else {
                    pow2 = Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
                }
                double d12 = blue / 255.0d;
                if (d12 < 0.04045d) {
                    pow3 = d12 / 12.92d;
                } else {
                    pow3 = Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
                }
                dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                double d13 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr[1] = d13;
                dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (d13 / 100.0d <= 0.5d) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        return false;
    }

    public static int u(float f3, int i6, int i10) {
        return l0.b.b(l0.b.d(i10, Math.round(Color.alpha(i10) * f3)), i6);
    }

    public static void v(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Animator animator = (Animator) arrayList.get(i6);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }
}

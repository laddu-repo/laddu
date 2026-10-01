package s1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.m;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.t;
import com.unity3d.services.core.device.MimeTypes;
import ic.s;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.x;
import o5.e0;
import okhttp3.Call;
import okhttp3.Request;
import wf.d1;
import wf.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static AudioManager f11972a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f11973b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f11974c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f11975d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f11976e;

    /* JADX WARN: Type inference failed for: r0v2, types: [m0.d, android.graphics.drawable.Drawable] */
    public static Drawable A(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 23 && !(drawable instanceof m0.b)) {
            ?? drawable2 = new Drawable();
            drawable2.A = drawable2.c();
            drawable2.h(drawable);
            m0.d.a();
            return drawable2;
        }
        return drawable;
    }

    public static void B(Parcel parcel, int i6, int i10) {
        if (i6 == i10) {
            return;
        }
        throw new x8.b(r4.a.o(r4.a.p(i10, i6, "Expected size ", " got ", " (0x"), Integer.toHexString(i6), ")"), parcel);
    }

    public static n C(com.google.android.gms.internal.measurement.d dVar, s sVar, ArrayList arrayList, boolean z10) {
        n nVar;
        int i6;
        int i10;
        a8.a.x("reduce", 1, arrayList);
        a8.a.y("reduce", 2, arrayList);
        n c10 = ((t) sVar.f6782y).c(sVar, (n) arrayList.get(0));
        if (c10 instanceof com.google.android.gms.internal.measurement.h) {
            if (arrayList.size() == 2) {
                nVar = ((t) sVar.f6782y).c(sVar, (n) arrayList.get(1));
                if (nVar instanceof com.google.android.gms.internal.measurement.f) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            } else if (dVar.m() != 0) {
                nVar = null;
            } else {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            com.google.android.gms.internal.measurement.h hVar = (com.google.android.gms.internal.measurement.h) c10;
            int m9 = dVar.m();
            if (z10) {
                i6 = 0;
            } else {
                i6 = m9 - 1;
            }
            int i11 = -1;
            if (z10) {
                i10 = m9 - 1;
            } else {
                i10 = 0;
            }
            if (true == z10) {
                i11 = 1;
            }
            if (nVar == null) {
                nVar = dVar.n(i6);
                i6 += i11;
            }
            while ((i10 - i6) * i11 >= 0) {
                if (!dVar.p(i6)) {
                    i6 += i11;
                } else {
                    nVar = hVar.i(sVar, Arrays.asList(nVar, dVar.n(i6), new com.google.android.gms.internal.measurement.g(Double.valueOf(i6)), dVar));
                    if (!(nVar instanceof com.google.android.gms.internal.measurement.f)) {
                        i6 += i11;
                    } else {
                        throw new IllegalStateException("Reduce operation failed");
                    }
                }
            }
            return nVar;
        }
        throw new IllegalArgumentException("Callback should be a method");
    }

    public static void D(Parcel parcel, int i6, int i10) {
        int t10 = t(parcel, i6);
        if (t10 == i10) {
            return;
        }
        throw new x8.b(r4.a.o(r4.a.p(i10, t10, "Expected size ", " got ", " (0x"), Integer.toHexString(t10), ")"), parcel);
    }

    public static com.google.android.gms.internal.measurement.d E(com.google.android.gms.internal.measurement.d dVar, s sVar, m mVar, Boolean bool, Boolean bool2) {
        com.google.android.gms.internal.measurement.d dVar2 = new com.google.android.gms.internal.measurement.d();
        Iterator l10 = dVar.l();
        while (l10.hasNext()) {
            int intValue = ((Integer) l10.next()).intValue();
            if (dVar.p(intValue)) {
                n i6 = mVar.i(sVar, Arrays.asList(dVar.n(intValue), new com.google.android.gms.internal.measurement.g(Double.valueOf(intValue)), dVar));
                if (i6.e().equals(bool)) {
                    break;
                }
                if (bool2 == null || i6.e().equals(bool2)) {
                    dVar2.o(intValue, i6);
                }
            }
        }
        return dVar2;
    }

    public static final String a(Object[] objArr, int i6, int i10, ie.e eVar) {
        StringBuilder sb2 = new StringBuilder((i10 * 3) + 2);
        sb2.append("[");
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i6 + i11];
            if (obj == eVar) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        String sb3 = sb2.toString();
        kotlin.jvm.internal.k.d(sb3, "toString(...)");
        return sb3;
    }

    public static final dd.e b(ArrayList arrayList) {
        Object obj;
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (it.hasNext()) {
                dd.a aVar = ((dd.e) next).f4113a;
                kotlin.jvm.internal.k.b(aVar);
                int i6 = aVar.f4087e;
                do {
                    Object next2 = it.next();
                    dd.a aVar2 = ((dd.e) next2).f4113a;
                    kotlin.jvm.internal.k.b(aVar2);
                    int i10 = aVar2.f4087e;
                    if (i6 < i10) {
                        next = next2;
                        i6 = i10;
                    }
                } while (it.hasNext());
            }
            obj = next;
        }
        return (dd.e) obj;
    }

    public static final void c(le.f fVar) {
        Object obj;
        if (fVar != null) {
            Iterator it = p7.a.f10621g.iterator();
            kotlin.jvm.internal.k.d(it, "NetConfig.runningCalls.iterator()");
            while (it.hasNext()) {
                Call call = (Call) ((WeakReference) it.next()).get();
                if (call == null) {
                    it.remove();
                } else {
                    Request request = call.request();
                    kotlin.jvm.internal.k.e(request, "<this>");
                    a8.j jVar = (a8.j) request.tag(a8.j.class);
                    Object obj2 = null;
                    if (jVar != null) {
                        obj = jVar.f627a;
                    } else {
                        obj = null;
                    }
                    if (obj != null) {
                        obj2 = obj;
                    }
                    if (fVar.equals(obj2)) {
                        call.cancel();
                        it.remove();
                    }
                }
            }
        }
    }

    public static void d(String str, long j) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            e(((InsetDrawable) drawable).getDrawable());
            return;
        }
        if (drawable instanceof m0.c) {
            e(((m0.d) ((m0.c) drawable)).C);
            return;
        }
        if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
            int childCount = drawableContainerState.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                Drawable child = drawableContainerState.getChild(i6);
                if (child != null) {
                    e(child);
                }
            }
        }
    }

    public static Bundle f(Parcel parcel, int i6) {
        int t10 = t(parcel, i6);
        int dataPosition = parcel.dataPosition();
        if (t10 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + t10);
        return readBundle;
    }

    public static Parcelable g(Parcel parcel, int i6, Parcelable.Creator creator) {
        int t10 = t(parcel, i6);
        int dataPosition = parcel.dataPosition();
        if (t10 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + t10);
        return parcelable;
    }

    public static String h(Parcel parcel, int i6) {
        int t10 = t(parcel, i6);
        int dataPosition = parcel.dataPosition();
        if (t10 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + t10);
        return readString;
    }

    public static Object[] i(Parcel parcel, int i6, Parcelable.Creator creator) {
        int t10 = t(parcel, i6);
        int dataPosition = parcel.dataPosition();
        if (t10 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + t10);
        return createTypedArray;
    }

    public static ArrayList j(Parcel parcel, int i6, Parcelable.Creator creator) {
        int t10 = t(parcel, i6);
        int dataPosition = parcel.dataPosition();
        if (t10 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + t10);
        return createTypedArrayList;
    }

    public static void k(Parcel parcel, int i6) {
        if (parcel.dataPosition() == i6) {
        } else {
            throw new x8.b(h8.c.i(i6, "Overread allowed size end="), parcel);
        }
    }

    public static synchronized AudioManager l(Context context) {
        synchronized (c.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    f11972a = null;
                }
                AudioManager audioManager = f11972a;
                if (audioManager != null) {
                    return audioManager;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    u1.f fVar = new u1.f();
                    u1.a.i().execute(new m8.c(7, applicationContext, fVar));
                    fVar.b();
                    AudioManager audioManager2 = f11972a;
                    audioManager2.getClass();
                    return audioManager2;
                }
                AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                f11972a = audioManager3;
                audioManager3.getClass();
                return audioManager3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final ArrayList m(SparseArray sparseArray) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ie.k.t(171, 249, 250, 251).iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            if (sparseArray.get(intValue) != null) {
                arrayList.add(sparseArray.get(intValue));
            }
        }
        return arrayList;
    }

    public static final bf.d n(uf.g gVar) {
        kotlin.jvm.internal.k.e(gVar, "<this>");
        if (gVar instanceof uf.b) {
            return ((uf.b) gVar).f13112b;
        }
        if (gVar instanceof d1) {
            return n(((d1) gVar).f14310a);
        }
        return null;
    }

    public static int o(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return j4.n.d(drawable);
        }
        if (!f11976e) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                f11975d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e10);
            }
            f11976e = true;
        }
        Method method = f11975d;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, null)).intValue();
            } catch (Exception e11) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e11);
                f11975d = null;
                return 0;
            }
        }
        return 0;
    }

    public static i5.c p(k7.c refHolder, SQLiteDatabase sQLiteDatabase) {
        kotlin.jvm.internal.k.e(refHolder, "refHolder");
        i5.c cVar = (i5.c) refHolder.f7745y;
        if (cVar != null && cVar.f6609x.equals(sQLiteDatabase)) {
            return cVar;
        }
        i5.c cVar2 = new i5.c(sQLiteDatabase);
        refHolder.f7745y = cVar2;
        return cVar2;
    }

    public static boolean q(Parcel parcel, int i6) {
        D(parcel, i6, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static int r(Parcel parcel, int i6) {
        D(parcel, i6, 4);
        return parcel.readInt();
    }

    public static long s(Parcel parcel, int i6) {
        D(parcel, i6, 8);
        return parcel.readLong();
    }

    public static int t(Parcel parcel, int i6) {
        if ((i6 & (-65536)) != -65536) {
            return (char) (i6 >> 16);
        }
        return parcel.readInt();
    }

    public static final void u(Object[] objArr, int i6, int i10) {
        kotlin.jvm.internal.k.e(objArr, "<this>");
        while (i6 < i10) {
            objArr[i6] = null;
            i6++;
        }
    }

    public static final sf.a v(e0 e0Var, Type type) {
        kotlin.jvm.internal.k.e(e0Var, "<this>");
        sf.a s = a.a.s(e0Var, type, true);
        if (s != null) {
            return s;
        }
        Class q9 = a.a.q(type);
        kotlin.jvm.internal.k.e(q9, "<this>");
        throw new IllegalArgumentException(u0.g(x.a(q9)));
    }

    public static boolean w(Drawable drawable, int i6) {
        if (Build.VERSION.SDK_INT >= 23) {
            return j4.n.l(drawable, i6);
        }
        if (!f11974c) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f11973b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e10);
            }
            f11974c = true;
        }
        Method method = f11973b;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i6));
                return true;
            } catch (Exception e11) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e11);
                f11973b = null;
            }
        }
        return false;
    }

    public static void x(Drawable drawable, int i6) {
        drawable.setTint(i6);
    }

    public static void y(Parcel parcel, int i6) {
        parcel.setDataPosition(parcel.dataPosition() + t(parcel, i6));
    }

    public static int z(Parcel parcel) {
        int readInt = parcel.readInt();
        int t10 = t(parcel, readInt);
        char c10 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c10 == 20293) {
            int i6 = t10 + dataPosition;
            if (i6 >= dataPosition && i6 <= parcel.dataSize()) {
                return i6;
            }
            throw new x8.b(h8.c.l("Size read is invalid start=", " end=", dataPosition, i6), parcel);
        }
        throw new x8.b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }
}

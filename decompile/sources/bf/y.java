package bf;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.services.UnityAdsConstants;
import gf.f0;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.a0;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static Method f1680a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f1681b;

    /* renamed from: c, reason: collision with root package name */
    public static Field f1682c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f1683d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(java.util.List r6, b1.z r7, ne.c r8) {
        /*
            boolean r0 = r8 instanceof b1.e
            if (r0 == 0) goto L13
            r0 = r8
            b1.e r0 = (b1.e) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            b1.e r0 = new b1.e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f1285z
            int r1 = r0.A
            r2 = 2
            r3 = 1
            me.a r4 = me.a.f8833x
            if (r1 == 0) goto L42
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            java.util.Iterator r6 = r0.f1284y
            java.io.Serializable r7 = r0.f1283x
            kotlin.jvm.internal.w r7 = (kotlin.jvm.internal.w) r7
            he.a.f(r8)     // Catch: java.lang.Throwable -> L30
            goto L65
        L30:
            r8 = move-exception
            goto L7e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.io.Serializable r6 = r0.f1283x
            java.util.List r6 = (java.util.List) r6
            he.a.f(r8)
            goto L5c
        L42:
            he.a.f(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            b1.g r1 = new b1.g
            r5 = 0
            r1.<init>(r6, r8, r5)
            r0.f1283x = r8
            r0.A = r3
            java.lang.Object r6 = r7.a(r1, r0)
            if (r6 != r4) goto L5b
            goto L93
        L5b:
            r6 = r8
        L5c:
            kotlin.jvm.internal.w r7 = new kotlin.jvm.internal.w
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L65:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r6.next()
            ve.l r8 = (ve.l) r8
            r0.f1283x = r7     // Catch: java.lang.Throwable -> L30
            r0.f1284y = r6     // Catch: java.lang.Throwable -> L30
            r0.A = r2     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r4) goto L65
            goto L93
        L7e:
            java.lang.Object r1 = r7.f8055x
            if (r1 != 0) goto L85
            r7.f8055x = r8
            goto L65
        L85:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            he.a.a(r1, r8)
            goto L65
        L8b:
            java.lang.Object r6 = r7.f8055x
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L94
            he.y r4 = he.y.f6101a
        L93:
            return r4
        L94:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.y.a(java.util.List, b1.z, ne.c):java.lang.Object");
    }

    public static final String b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                cf.j M = cf.l.M(x.f1679x, type);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(((Class) cf.l.O(M)).getName());
                Iterator it = M.iterator();
                int i6 = 0;
                while (it.hasNext()) {
                    it.next();
                    i6++;
                    if (i6 < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
                sb2.append(df.u.D(i6, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
                return sb2.toString();
            }
            return cls.getName();
        }
        return type.toString();
    }

    public static void c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = s1.c.A(drawable).mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            } else {
                drawable.setTintList(colorStateList);
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final Type e(p pVar, boolean z10) {
        Class r10;
        Object obj;
        int i6;
        a0 a0Var = (a0) pVar;
        kotlin.jvm.internal.e eVar = a0Var.f8044x;
        if (z10) {
            r10 = cf.m.s(eVar);
        } else {
            r10 = cf.m.r(eVar);
        }
        List list = a0Var.f8045y;
        if (!list.isEmpty()) {
            if (r10.isArray()) {
                if (!r10.getComponentType().isPrimitive()) {
                    if (list.size() == 1) {
                        obj = list.get(0);
                    } else {
                        obj = null;
                    }
                    r rVar = (r) obj;
                    if (rVar != null) {
                        s sVar = rVar.f1669a;
                        p pVar2 = rVar.f1670b;
                        if (sVar == null) {
                            i6 = -1;
                        } else {
                            i6 = w.f1678a[sVar.ordinal()];
                        }
                        if (i6 != -1 && i6 != 1) {
                            if (i6 != 2 && i6 != 3) {
                                throw new RuntimeException();
                            }
                            kotlin.jvm.internal.k.b(pVar2);
                            Type e10 = e(pVar2, false);
                            if (!(e10 instanceof Class)) {
                                return new a(e10);
                            }
                            return r10;
                        }
                        return r10;
                    }
                    throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + pVar);
                }
                return r10;
            }
            return l(r10, list);
        }
        return r10;
    }

    public static final boolean f(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj != obj2 && !kotlin.jvm.internal.k.a(obj, obj2)) {
                if (obj != null && obj2 != null) {
                    if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                        if (!f((Bundle) obj, (Bundle) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                        if (!ie.i.a0((Object[]) obj, (Object[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                        if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                        if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                        if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                        if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                        if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                        if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                        if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                        if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            return false;
                        }
                    } else if (!obj.equals(obj2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static final int g(Bundle bundle) {
        int i6;
        Iterator<String> it = bundle.keySet().iterator();
        int i10 = 1;
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            if (obj instanceof Bundle) {
                i6 = g((Bundle) obj);
            } else if (obj instanceof Object[]) {
                i6 = Arrays.deepHashCode((Object[]) obj);
            } else if (obj instanceof byte[]) {
                i6 = Arrays.hashCode((byte[]) obj);
            } else if (obj instanceof short[]) {
                i6 = Arrays.hashCode((short[]) obj);
            } else if (obj instanceof int[]) {
                i6 = Arrays.hashCode((int[]) obj);
            } else if (obj instanceof long[]) {
                i6 = Arrays.hashCode((long[]) obj);
            } else if (obj instanceof float[]) {
                i6 = Arrays.hashCode((float[]) obj);
            } else if (obj instanceof double[]) {
                i6 = Arrays.hashCode((double[]) obj);
            } else if (obj instanceof char[]) {
                i6 = Arrays.hashCode((char[]) obj);
            } else if (obj instanceof boolean[]) {
                i6 = Arrays.hashCode((boolean[]) obj);
            } else if (obj != null) {
                i6 = obj.hashCode();
            } else {
                i6 = 0;
            }
            i10 = (i10 * 31) + i6;
        }
        return i10;
    }

    public static ImageView.ScaleType h(int i6) {
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 5) {
                            if (i6 != 6) {
                                return ImageView.ScaleType.CENTER;
                            }
                            return ImageView.ScaleType.CENTER_INSIDE;
                        }
                        return ImageView.ScaleType.CENTER_CROP;
                    }
                    return ImageView.ScaleType.FIT_END;
                }
                return ImageView.ScaleType.FIT_CENTER;
            }
            return ImageView.ScaleType.FIT_START;
        }
        return ImageView.ScaleType.FIT_XY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] i(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i6 = 0; i6 < iArr.length; i6++) {
                jArr[i6] = iArr[i6];
            }
            return jArr;
        }
        if (serializable instanceof long[]) {
            return (long[]) serializable;
        }
        return null;
    }

    public static boolean j(File file, Resources resources, int i6) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i6);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean k8 = k(file, inputStream);
            d(inputStream);
            return k8;
        } catch (Throwable th2) {
            th = th2;
            d(inputStream);
            throw th;
        }
    }

    public static boolean k(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream2.write(bArr, 0, read);
                        } else {
                            d(fileOutputStream2);
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return true;
                        }
                    }
                } catch (IOException e10) {
                    e = e10;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    d(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    d(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    public static final v l(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(ie.l.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m((r) it.next()));
            }
            return new v(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(ie.l.x(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(m((r) it2.next()));
            }
            return new v(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        v l10 = l(declaringClass, list.subList(length, list.size()));
        List subList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(ie.l.x(subList, 10));
        Iterator it3 = subList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(m((r) it3.next()));
        }
        return new v(cls, l10, arrayList3);
    }

    public static final Type m(r rVar) {
        s sVar = rVar.f1669a;
        if (sVar == null) {
            return z.f1684z;
        }
        p pVar = rVar.f1670b;
        kotlin.jvm.internal.k.b(pVar);
        int ordinal = sVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return new z(e(pVar, true), null);
                }
                throw new RuntimeException();
            }
            return new z(null, e(pVar, true));
        }
        return e(pVar, true);
    }

    public static File p(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i6 = 0; i6 < 100; i6++) {
            File file = new File(cacheDir, str + i6);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static Typeface q(Configuration configuration, Typeface typeface) {
        int i6;
        int i10;
        int weight;
        int i11;
        Typeface create;
        if (Build.VERSION.SDK_INT >= 31) {
            i6 = configuration.fontWeightAdjustment;
            if (i6 != Integer.MAX_VALUE) {
                i10 = configuration.fontWeightAdjustment;
                if (i10 != 0 && typeface != null) {
                    weight = typeface.getWeight();
                    i11 = configuration.fontWeightAdjustment;
                    create = Typeface.create(typeface, c9.a.b(i11 + weight, 1, UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT), typeface.isItalic());
                    return create;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static MappedByteBuffer r(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static void s(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = s1.c.A(drawable).mutate();
            mutate.setTintList(ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static void t(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z10;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z11 = false;
        int i6 = 1;
        if (onLongClickListener != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (hasOnClickListeners || z10) {
            z11 = true;
        }
        checkableImageButton.setFocusable(z11);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z10);
        if (!z11) {
            i6 = 2;
        }
        checkableImageButton.setImportantForAccessibility(i6);
    }

    public static void u(p.a0 a0Var, boolean z10) {
        if (Build.VERSION.SDK_INT >= 23) {
            j4.n.n(a0Var, z10);
            return;
        }
        if (!f1683d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f1682c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e10);
            }
            f1683d = true;
        }
        Field field = f1682c;
        if (field != null) {
            try {
                field.set(a0Var, Boolean.valueOf(z10));
            } catch (IllegalAccessException e11) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e11);
            }
        }
    }

    public static void v(PopupWindow popupWindow, int i6) {
        if (Build.VERSION.SDK_INT >= 23) {
            j4.n.o(popupWindow, i6);
            return;
        }
        if (!f1681b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f1680a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f1681b = true;
        }
        Method method = f1680a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i6));
            } catch (Exception unused2) {
            }
        }
    }

    public static final void w(cf.n nVar) {
        synchronized (ig.a.f6853a) {
            hg.a aVar = new hg.a();
            if (ig.a.f6854b == null) {
                ig.a.f6854b = aVar.f6108a;
                nVar.invoke(aVar);
                aVar.f6108a.f();
            } else {
                throw new Exception("A Koin Application has already been started");
            }
        }
    }

    public static final Object x(mf.t tVar, mf.t tVar2, ve.p pVar) {
        Object tVar3;
        Object L;
        try {
            kotlin.jvm.internal.z.c(2, pVar);
            tVar3 = pVar.invoke(tVar2, tVar);
        } catch (Throwable th) {
            tVar3 = new gf.t(th, false);
        }
        me.a aVar = me.a.f8833x;
        if (tVar3 != aVar && (L = tVar.L(tVar3)) != f0.f5669e) {
            if (!(L instanceof gf.t)) {
                return f0.H(L);
            }
            throw ((gf.t) L).f5710a;
        }
        return aVar;
    }

    public abstract void n(Context context, String str, sd.d dVar);

    public abstract void o(Context context, sd.d dVar, v5.o oVar, rg.a aVar);
}

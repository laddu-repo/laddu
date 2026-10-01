package l0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class i extends g {

    /* renamed from: f, reason: collision with root package name */
    public final Class f8081f;

    /* renamed from: g, reason: collision with root package name */
    public final Constructor f8082g;

    /* renamed from: h, reason: collision with root package name */
    public final Method f8083h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f8084i;
    public final Method j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f8085k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f8086l;

    public i() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = D(cls2);
            Class<?> cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = E(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e10.getClass().getName()), e10);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f8081f = cls;
        this.f8082g = constructor;
        this.f8083h = method2;
        this.f8084i = method3;
        this.j = method4;
        this.f8085k = method5;
        this.f8086l = method;
    }

    public static Method D(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final boolean A(Context context, Object obj, String str, int i6, int i10, int i11, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f8083h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i6), Integer.valueOf(i10), Integer.valueOf(i11), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface B(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f8081f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f8086l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean C(Object obj) {
        try {
            return ((Boolean) this.j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method E(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // l0.g, android.support.v4.media.session.b
    public final Typeface f(Context context, k0.e eVar, Resources resources, int i6) {
        Object obj;
        Method method = this.f8083h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                obj = this.f8082g.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                k0.f[] fVarArr = eVar.f7552a;
                int length = fVarArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        k0.f fVar = fVarArr[i10];
                        Context context2 = context;
                        if (!A(context2, obj, fVar.f7553a, fVar.f7557e, fVar.f7554b, fVar.f7555c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fVar.f7556d))) {
                            try {
                                this.f8085k.invoke(obj, null);
                                break;
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        } else {
                            i10++;
                            context = context2;
                        }
                    } else if (C(obj)) {
                        return B(obj);
                    }
                }
            }
            return null;
        }
        return super.f(context, eVar, resources, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2 A[SYNTHETIC] */
    @Override // l0.g, android.support.v4.media.session.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Typeface g(android.content.Context r18, q0.i[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.i.g(android.content.Context, q0.i[], int):android.graphics.Typeface");
    }

    @Override // android.support.v4.media.session.b
    public final Typeface j(Context context, Resources resources, int i6, String str, int i10) {
        Object obj;
        Method method = this.f8083h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                obj = this.f8082g.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                if (!A(context, obj, str, 0, -1, -1, null)) {
                    try {
                        this.f8085k.invoke(obj, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (C(obj)) {
                    return B(obj);
                }
            }
            return null;
        }
        return super.j(context, resources, i6, str, i10);
    }
}

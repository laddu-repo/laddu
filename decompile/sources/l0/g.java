package l0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import bf.y;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class g extends android.support.v4.media.session.b {

    /* renamed from: a, reason: collision with root package name */
    public static Class f8072a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Constructor f8073b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Method f8074c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Method f8075d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f8076e = false;

    public static boolean y(String str, boolean z10, int i6, Object obj) {
        z();
        try {
        } catch (IllegalAccessException | InvocationTargetException e10) {
            e = e10;
        }
        try {
            return ((Boolean) f8074c.invoke(obj, str, Integer.valueOf(i6), Boolean.valueOf(z10))).booleanValue();
        } catch (InvocationTargetException e11) {
            e = e11;
            throw new RuntimeException(e);
        }
    }

    public static void z() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f8076e) {
            return;
        }
        f8076e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f8073b = constructor;
        f8072a = cls;
        f8074c = method2;
        f8075d = method;
    }

    @Override // android.support.v4.media.session.b
    public Typeface f(Context context, k0.e eVar, Resources resources, int i6) {
        z();
        try {
            Object newInstance = f8073b.newInstance(null);
            for (k0.f fVar : eVar.f7552a) {
                File p10 = y.p(context);
                if (p10 == null) {
                    return null;
                }
                try {
                    if (!y.j(p10, resources, fVar.f7558f)) {
                        return null;
                    }
                    if (!y(p10.getPath(), fVar.f7555c, fVar.f7554b, newInstance)) {
                        return null;
                    }
                    p10.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    p10.delete();
                }
            }
            z();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f8072a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f8075d.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // android.support.v4.media.session.b
    public Typeface g(Context context, q0.i[] iVarArr, int i6) {
        File file;
        String readlink;
        if (iVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(k(iVarArr, i6).f10817a, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                } else {
                    try {
                        try {
                            readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                        } catch (ErrnoException unused) {
                        }
                        try {
                            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                                file = new File(readlink);
                                if (file != null && file.canRead()) {
                                    Typeface createFromFile = Typeface.createFromFile(file);
                                    openFileDescriptor.close();
                                    return createFromFile;
                                }
                                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                                Typeface i10 = i(context, fileInputStream);
                                fileInputStream.close();
                                openFileDescriptor.close();
                                return i10;
                            }
                            Typeface i102 = i(context, fileInputStream);
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return i102;
                        } finally {
                        }
                        file = null;
                        if (file != null) {
                            Typeface createFromFile2 = Typeface.createFromFile(file);
                            openFileDescriptor.close();
                            return createFromFile2;
                        }
                        FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}

package l0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import bf.y;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends android.support.v4.media.session.b {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f8077a;

    /* renamed from: b, reason: collision with root package name */
    public static final Constructor f8078b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f8079c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f8080d;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            method2 = null;
        }
        f8078b = constructor;
        f8077a = cls;
        f8079c = method2;
        f8080d = method;
    }

    public static boolean y(Object obj, ByteBuffer byteBuffer, int i6, int i10, boolean z10) {
        try {
            return ((Boolean) f8079c.invoke(obj, byteBuffer, Integer.valueOf(i6), null, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface z(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f8077a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f8080d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // android.support.v4.media.session.b
    public final Typeface f(Context context, k0.e eVar, Resources resources, int i6) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        try {
            obj = f8078b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (k0.f fVar : eVar.f7552a) {
                int i10 = fVar.f7558f;
                File p10 = y.p(context);
                if (p10 != null) {
                    try {
                        if (y.j(p10, resources, i10)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(p10);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                } finally {
                                    break;
                                }
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            if (mappedByteBuffer != null && y(obj, mappedByteBuffer, fVar.f7557e, fVar.f7554b, fVar.f7555c)) {
                            }
                        }
                    } finally {
                        p10.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return z(obj);
        }
        return null;
    }

    @Override // android.support.v4.media.session.b
    public final Typeface g(Context context, q0.i[] iVarArr, int i6) {
        Object obj;
        try {
            obj = f8078b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i10 = 0;
            v.l lVar = new v.l(0);
            int length = iVarArr.length;
            while (true) {
                if (i10 < length) {
                    q0.i iVar = iVarArr[i10];
                    Uri uri = iVar.f10817a;
                    ByteBuffer byteBuffer = (ByteBuffer) lVar.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = y.r(context, uri);
                        lVar.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !y(obj, byteBuffer, iVar.f10818b, iVar.f10819c, iVar.f10820d)) {
                        break;
                    }
                    i10++;
                } else {
                    Typeface z10 = z(obj);
                    if (z10 != null) {
                        return Typeface.create(z10, i6);
                    }
                }
            }
        }
        return null;
    }
}

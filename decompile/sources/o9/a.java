package o9;

import android.content.Context;
import android.util.Log;
import e9.b;
import e9.e;
import hb.s;
import java.lang.reflect.Method;
import org.chromium.net.ApiVersion;
import s9.h;
import s9.n;
import t8.f;
import t8.g;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final f f10036a = f.f12640b;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f10037b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static e f10038c = null;

    /* renamed from: d, reason: collision with root package name */
    public static String f10039d = "0";

    public static n a(Context context) {
        e eVar;
        x.h(context, "Context must not be null");
        h hVar = new h();
        n nVar = hVar.f12263a;
        synchronized (f10037b) {
            eVar = f10038c;
        }
        if (eVar != null) {
            hVar.a(null);
            return nVar;
        }
        new Thread(new s(26, context, hVar)).start();
        return nVar;
    }

    public static boolean b() {
        e eVar;
        synchronized (f10037b) {
            eVar = f10038c;
        }
        if (eVar != null) {
            return true;
        }
        return false;
    }

    public static void c(Context context) {
        synchronized (f10037b) {
            try {
                if (b()) {
                    return;
                }
                x.h(context, "Context must not be null");
                ClassLoader classLoader = a.class.getClassLoader();
                x.g(classLoader);
                try {
                    classLoader.loadClass("org.chromium.net.CronetEngine");
                    int apiLevel = ApiVersion.getApiLevel();
                    f fVar = f10036a;
                    fVar.getClass();
                    f.c(context);
                    try {
                        e c10 = e.c(context, e.f4478b, "com.google.android.gms.cronet_dynamite");
                        try {
                            Class<?> loadClass = c10.f4491a.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                            if (loadClass.getClassLoader() != a.class.getClassLoader()) {
                                Method method = loadClass.getMethod("getApiLevel", null);
                                Method method2 = loadClass.getMethod("getCronetVersion", null);
                                Integer num = (Integer) method.invoke(null, null);
                                x.g(num);
                                int intValue = num.intValue();
                                String str = (String) method2.invoke(null, null);
                                x.g(str);
                                f10039d = str;
                                if (apiLevel > intValue) {
                                    if (fVar.a(2, context, "cr") == null) {
                                        Log.e("a", "Unable to fetch error resolution intent");
                                        throw new Exception();
                                    }
                                    String str2 = f10039d;
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 174);
                                    sb2.append("Google Play Services update is required. The API Level of the client is ");
                                    sb2.append(apiLevel);
                                    sb2.append(". The API Level of the implementation is ");
                                    sb2.append(intValue);
                                    sb2.append(". The Cronet implementation version is ");
                                    sb2.append(str2);
                                    throw new Exception(sb2.toString());
                                }
                                f10038c = c10;
                                return;
                            }
                            Log.e("a", "ImplVersion class is missing from Cronet module.");
                            throw new Exception();
                        } catch (Exception e10) {
                            Log.e("a", "Unable to read Cronet version from the Cronet module ", e10);
                            throw ((g) new Exception().initCause(e10));
                        }
                    } catch (b e11) {
                        Log.e("a", "Unable to load Cronet module", e11);
                        throw ((g) new Exception().initCause(e11));
                    }
                } catch (ClassNotFoundException e12) {
                    Log.e("a", "Cronet API is not available. Have you included all required dependencies?");
                    throw ((g) new Exception().initCause(e12));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

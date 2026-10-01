package e9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import v5.o;
import w8.l;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final zb.d f4478b;

    /* renamed from: c, reason: collision with root package name */
    public static final ua.f f4479c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f4480d;

    /* renamed from: e, reason: collision with root package name */
    public static final zb.d f4481e;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f4482f = null;

    /* renamed from: g, reason: collision with root package name */
    public static String f4483g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f4484h = false;

    /* renamed from: i, reason: collision with root package name */
    public static int f4485i = -1;
    public static Boolean j;

    /* renamed from: k, reason: collision with root package name */
    public static final ThreadLocal f4486k = new ThreadLocal();

    /* renamed from: l, reason: collision with root package name */
    public static final h f4487l = new h(0);

    /* renamed from: m, reason: collision with root package name */
    public static final l f4488m;

    /* renamed from: n, reason: collision with root package name */
    public static j f4489n;

    /* renamed from: o, reason: collision with root package name */
    public static k f4490o;

    /* renamed from: a, reason: collision with root package name */
    public final Context f4491a;

    static {
        int i6 = 9;
        f4488m = new l(i6);
        f4478b = new zb.d(i6);
        int i10 = 10;
        f4479c = new ua.f(i10);
        f4480d = new l(i10);
        f4481e = new zb.d(i10);
    }

    public e(Context context) {
        this.f4491a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!x.j(declaredField.get(null), str)) {
                Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [e9.i, java.lang.Object] */
    public static e c(Context context, d dVar, String str) {
        long j10;
        a3.c i6;
        e eVar;
        Boolean bool;
        d9.a M;
        e eVar2;
        k kVar;
        boolean z10;
        d9.a M2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            ThreadLocal threadLocal = f4486k;
            i iVar = (i) threadLocal.get();
            ?? obj = new Object();
            threadLocal.set(obj);
            h hVar = f4487l;
            Long l10 = (Long) hVar.get();
            long longValue = l10.longValue();
            try {
                hVar.set(Long.valueOf(SystemClock.uptimeMillis()));
                i6 = dVar.i(context, str, f4488m);
                j10 = longValue;
            } catch (Throwable th) {
                th = th;
                j10 = longValue;
            }
            try {
                Log.i("DynamiteModule", "Considering local module " + str + ":" + i6.f521a + " and remote module " + str + ":" + i6.f522b);
                int i10 = i6.f523c;
                if (i10 != 0) {
                    if (i10 == -1) {
                        if (i6.f521a != 0) {
                            i10 = -1;
                        }
                    }
                    if (i10 != 1 || i6.f522b != 0) {
                        if (i10 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            eVar = new e(applicationContext);
                        } else if (i10 == 1) {
                            try {
                                int i11 = i6.f522b;
                                try {
                                    synchronized (e.class) {
                                        if (g(context)) {
                                            bool = f4482f;
                                        } else {
                                            throw new Exception("Remote loading disabled");
                                        }
                                    }
                                    if (bool != null) {
                                        if (bool.booleanValue()) {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i11);
                                            synchronized (e.class) {
                                                kVar = f4490o;
                                            }
                                            if (kVar != null) {
                                                i iVar2 = (i) threadLocal.get();
                                                if (iVar2 != null && iVar2.f4502a != null) {
                                                    Context applicationContext2 = context.getApplicationContext();
                                                    Cursor cursor = iVar2.f4502a;
                                                    new d9.b(null);
                                                    synchronized (e.class) {
                                                        if (f4485i >= 2) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                    }
                                                    if (z10) {
                                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                        M2 = kVar.N(new d9.b(applicationContext2), str, i11, new d9.b(cursor));
                                                    } else {
                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                        M2 = kVar.M(new d9.b(applicationContext2), str, i11, new d9.b(cursor));
                                                    }
                                                    Context context2 = (Context) d9.b.L(M2);
                                                    if (context2 != null) {
                                                        eVar2 = new e(context2);
                                                    } else {
                                                        throw new Exception("Failed to get module context");
                                                    }
                                                } else {
                                                    throw new Exception("No result cursor");
                                                }
                                            } else {
                                                throw new Exception("DynamiteLoaderV2 was not cached.");
                                            }
                                        } else {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i11);
                                            j h4 = h(context);
                                            if (h4 != null) {
                                                Parcel a10 = h4.a(h4.J(), 6);
                                                int readInt = a10.readInt();
                                                a10.recycle();
                                                if (readInt >= 3) {
                                                    i iVar3 = (i) threadLocal.get();
                                                    if (iVar3 != null) {
                                                        M = h4.N(new d9.b(context), str, i11, new d9.b(iVar3.f4502a));
                                                    } else {
                                                        throw new Exception("No cached result cursor holder");
                                                    }
                                                } else if (readInt == 2) {
                                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                    M = h4.O(new d9.b(context), str, i11);
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                    M = h4.M(new d9.b(context), str, i11);
                                                }
                                                Object L = d9.b.L(M);
                                                if (L != null) {
                                                    eVar2 = new e((Context) L);
                                                } else {
                                                    throw new Exception("Failed to load remote module.");
                                                }
                                            } else {
                                                throw new Exception("Failed to create IDynamiteLoader.");
                                            }
                                        }
                                        eVar = eVar2;
                                    } else {
                                        throw new Exception("Failed to determine which loading route to use.");
                                    }
                                } catch (RemoteException e10) {
                                    throw new Exception("Failed to load remote module.", e10);
                                } catch (b e11) {
                                    throw e11;
                                } catch (Throwable th2) {
                                    throw new Exception("Failed to load remote module.", th2);
                                }
                            } catch (b e12) {
                                Log.w("DynamiteModule", "Failed to load remote module: " + e12.getMessage());
                                int i12 = i6.f521a;
                                if (i12 != 0 && dVar.i(context, str, new o(i12)).f523c == -1) {
                                    Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                    eVar = new e(applicationContext);
                                } else {
                                    throw new Exception("Remote load failed. No local fallback found.", e12);
                                }
                            }
                        } else {
                            throw new Exception("VersionPolicy returned invalid code:" + i10);
                        }
                        if (j10 == 0) {
                            f4487l.remove();
                        } else {
                            f4487l.set(l10);
                        }
                        Cursor cursor2 = obj.f4502a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        f4486k.set(iVar);
                        return eVar;
                    }
                }
                throw new Exception("No acceptable module " + str + " found. Local version is " + i6.f521a + " and remote version is " + i6.f522b + ".");
            } catch (Throwable th3) {
                th = th3;
                if (j10 == 0) {
                    f4487l.remove();
                } else {
                    f4487l.set(l10);
                }
                Cursor cursor3 = obj.f4502a;
                if (cursor3 != null) {
                    cursor3.close();
                }
                f4486k.set(iVar);
                throw th;
            }
        }
        throw new Exception("null application Context");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x017c, code lost:
    
        if (r2 != false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(android.content.Context r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.e.d(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0134, code lost:
    
        if (r5 != false) goto L93;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int e(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.e.e(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.measurement.x] */
    public static void f(ClassLoader classLoader) {
        try {
            k kVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof k) {
                    kVar = (k) queryLocalInterface;
                } else {
                    kVar = new com.google.android.gms.internal.measurement.x(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 1);
                }
            }
            f4490o = kVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new Exception("Failed to instantiate dynamite loader", e10);
        }
    }

    public static boolean g(Context context) {
        int i6;
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(j)) {
            return true;
        }
        boolean z10 = false;
        if (j == null) {
            PackageManager packageManager = context.getPackageManager();
            if (Build.VERSION.SDK_INT >= 29) {
                i6 = 268435456;
            } else {
                i6 = 0;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider("com.google.android.gms.chimera", i6);
            if (t8.f.f12640b.b(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            j = Boolean.valueOf(z10);
            if (z10 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f4484h = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static j h(Context context) {
        j jVar;
        synchronized (e.class) {
            j jVar2 = f4489n;
            if (jVar2 != null) {
                return jVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    jVar = 0;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof j) {
                        jVar = (j) queryLocalInterface;
                    } else {
                        jVar = new com.google.android.gms.internal.measurement.x(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 1);
                    }
                }
                if (jVar != 0) {
                    f4489n = jVar;
                    return jVar;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f4491a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new Exception("Failed to instantiate module class: ".concat(str), e10);
        }
    }
}

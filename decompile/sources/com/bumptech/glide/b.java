package com.bumptech.glide;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import c6.y;
import com.bumptech.glide.integration.okhttp3.OkHttpGlideModule;
import com.bumptech.glide.manager.t;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k8.a0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {
    public static volatile b C;
    public static volatile boolean D;
    public final t7.k A;
    public final ArrayList B = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d6.a f2342v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e6.e f2343w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g f2344x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d6.f f2345y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final com.bumptech.glide.manager.k f2346z;

    public b(Context context, c6.m mVar, e6.e eVar, d6.a aVar, d6.f fVar, com.bumptech.glide.manager.k kVar, t7.k kVar2, kb.e eVar2, v.e eVar3, List list, ArrayList arrayList, b8.h hVar, a9.g gVar) {
        this.f2342v = aVar;
        this.f2345y = fVar;
        this.f2343w = eVar;
        this.f2346z = kVar;
        this.A = kVar2;
        this.f2344x = new g(context, fVar, new t(this, arrayList, hVar), new a0(25), eVar2, eVar3, list, mVar, gVar);
    }

    public static b a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (C == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e7);
            } catch (InstantiationException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            } catch (InvocationTargetException e12) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
            }
            synchronized (b.class) {
                if (C == null) {
                    if (D) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    D = true;
                    try {
                        c(context, generatedAppGlideModule);
                        D = false;
                    } catch (Throwable th) {
                        D = false;
                        throw th;
                    }
                }
            }
        }
        return C;
    }

    public static com.bumptech.glide.manager.k b(Context context) {
        v6.f.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).f2346z;
    }

    public static void c(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        f6.d dVar;
        v.e eVar = new v.e(0);
        y yVar = new y(1);
        kb.e eVar2 = new kb.e(8);
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(c.C(str));
                        if (Log.isLoggable("ManifestParser", 3)) {
                            Log.d("ManifestParser", "Loaded Glide module: " + str);
                        }
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
        } catch (PackageManager.NameNotFoundException e7) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e7);
            }
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                OkHttpGlideModule okHttpGlideModule = (OkHttpGlideModule) it.next();
                if (hashSet.contains(okHttpGlideModule.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + okHttpGlideModule);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Log.d("Glide", "Discovered GlideModule from manifest: " + ((OkHttpGlideModule) obj).getClass());
            }
        }
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((OkHttpGlideModule) obj2).getClass();
        }
        f6.a aVar = new f6.a();
        if (f6.d.f5298x == 0) {
            f6.d.f5298x = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i11 = f6.d.f5298x;
        if (TextUtils.isEmpty("source")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        f6.d dVar2 = new f6.d(new ThreadPoolExecutor(i11, i11, 0L, timeUnit, new PriorityBlockingQueue(), new f6.b(aVar, "source", false)));
        f6.a aVar2 = new f6.a();
        if (TextUtils.isEmpty("disk-cache")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
        }
        f6.d dVar3 = new f6.d(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new f6.b(aVar2, "disk-cache", true)));
        if (f6.d.f5298x == 0) {
            f6.d.f5298x = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i12 = f6.d.f5298x >= 4 ? 2 : 1;
        f6.a aVar3 = new f6.a();
        if (TextUtils.isEmpty("animation")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
        }
        f6.d dVar4 = new f6.d(new ThreadPoolExecutor(i12, i12, 0L, timeUnit, new PriorityBlockingQueue(), new f6.b(aVar3, "animation", true)));
        e6.f fVar = new e6.f(applicationContext);
        b8.d dVar5 = new b8.d();
        Context context2 = fVar.f4854a;
        float f = fVar.f4857d;
        ActivityManager activityManager = fVar.f4855b;
        int i13 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        dVar5.f1577c = i13;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) fVar.f4856c.f11492w;
        float f4 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int iRound2 = Math.round(f4 * f);
        int iRound3 = Math.round(f4 * 2.0f);
        int i14 = iRound - i13;
        int i15 = iRound3 + iRound2;
        if (i15 <= i14) {
            dVar5.f1576b = iRound3;
            dVar5.f1575a = iRound2;
        } else {
            float f10 = i14 / (f + 2.0f);
            dVar5.f1576b = Math.round(2.0f * f10);
            dVar5.f1575a = Math.round(f10 * f);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            dVar = dVar4;
            sb2.append(Formatter.formatFileSize(context2, dVar5.f1576b));
            sb2.append(", pool size: ");
            sb2.append(Formatter.formatFileSize(context2, dVar5.f1575a));
            sb2.append(", byte array size: ");
            sb2.append(Formatter.formatFileSize(context2, i13));
            sb2.append(", memory class limited? ");
            sb2.append(i15 > iRound);
            sb2.append(", max size: ");
            sb2.append(Formatter.formatFileSize(context2, iRound));
            sb2.append(", memoryClass: ");
            sb2.append(activityManager.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb2.toString());
        } else {
            dVar = dVar4;
        }
        t7.k kVar = new t7.k(8);
        int i16 = dVar5.f1575a;
        d6.a gVar = i16 > 0 ? new d6.g(i16) : new o9.f(10);
        d6.f fVar2 = new d6.f(dVar5.f1577c);
        e6.e eVar3 = new e6.e(dVar5.f1576b);
        b bVar = new b(applicationContext, new c6.m(eVar3, new a9.g(applicationContext), dVar3, dVar2, new f6.d(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f6.d.f5297w, timeUnit, new SynchronousQueue(), new f6.b(new f6.a(), "source-unlimited", false))), dVar), eVar3, gVar, fVar2, new com.bumptech.glide.manager.k(), kVar, eVar2, eVar, Collections.EMPTY_LIST, arrayList, generatedAppGlideModule, new a9.g(yVar));
        applicationContext.registerComponentCallbacks(bVar);
        C = bVar;
    }

    public static o e(Context context) {
        return b(context).b(context);
    }

    public final void d(o oVar) {
        synchronized (this.B) {
            try {
                if (!this.B.contains(oVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.B.remove(oVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        v6.m.a();
        this.f2343w.f(0L);
        this.f2342v.i();
        this.f2345y.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        v6.m.a();
        synchronized (this.B) {
            try {
                ArrayList arrayList = this.B;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((o) obj).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2343w.g(i);
        this.f2342v.h(i);
        this.f2345y.i(i);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}

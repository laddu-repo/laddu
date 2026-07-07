package jb;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import qb.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements bc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7323a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7324b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7325c;

    public /* synthetic */ c(int i6, Object obj, Object obj2) {
        this.f7323a = i6;
        this.f7324b = obj;
        this.f7325c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, gc.a] */
    /* JADX WARN: Type inference failed for: r3v3, types: [c6.h, java.lang.Object] */
    @Override // bc.a
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        boolean z10;
        switch (this.f7323a) {
            case 0:
                g gVar = (g) this.f7324b;
                Context context = (Context) this.f7325c;
                String d10 = gVar.d();
                ?? obj = new Object();
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 24) {
                    if (i6 >= 24) {
                        context = i0.b.a(context);
                    } else {
                        context = null;
                    }
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + d10, 0);
                boolean z11 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z11 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z11 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                obj.f5605a = z11;
                return obj;
            case 1:
                qb.e eVar = (qb.e) this.f7324b;
                qb.b bVar = (qb.b) this.f7325c;
                qb.d dVar = bVar.f11158f;
                ?? obj2 = new Object();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<qb.h> set = bVar.f11155c;
                Set set2 = bVar.f11159g;
                for (qb.h hVar : set) {
                    int i10 = hVar.f11170c;
                    int i11 = hVar.f11169b;
                    if (i10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    p pVar = hVar.f11168a;
                    if (z10) {
                        if (i11 == 2) {
                            hashSet4.add(pVar);
                        } else {
                            hashSet.add(pVar);
                        }
                    } else if (i10 == 2) {
                        hashSet3.add(pVar);
                    } else if (i11 == 2) {
                        hashSet5.add(pVar);
                    } else {
                        hashSet2.add(pVar);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(p.a(yb.b.class));
                }
                obj2.f1981x = Collections.unmodifiableSet(hashSet);
                obj2.f1982y = Collections.unmodifiableSet(hashSet2);
                Collections.unmodifiableSet(hashSet3);
                obj2.f1983z = Collections.unmodifiableSet(hashSet4);
                Collections.unmodifiableSet(hashSet5);
                obj2.A = eVar;
                return dVar.d(obj2);
            default:
                return new w5.a((Context) this.f7325c, (String) this.f7324b);
        }
    }

    public /* synthetic */ c(Context context, String str) {
        this.f7323a = 2;
        this.f7325c = context;
        this.f7324b = str;
    }
}

package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a6 implements e6 {

    /* renamed from: b, reason: collision with root package name */
    public static final k5 f2144b = new k5(3);

    /* renamed from: a, reason: collision with root package name */
    public final Object f2145a;

    public /* synthetic */ a6(Object obj) {
        this.f2145a = obj;
    }

    @Override // com.google.android.gms.internal.measurement.e6
    public boolean a(Class cls) {
        for (int i6 = 0; i6 < 2; i6++) {
            if (((e6[]) this.f2145a)[i6].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.e6
    public m6 b(Class cls) {
        for (int i6 = 0; i6 < 2; i6++) {
            e6 e6Var = ((e6[]) this.f2145a)[i6];
            if (e6Var.a(cls)) {
                return e6Var.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [v.l] */
    public Object c() {
        HashMap hashMap;
        g4 g4Var = (g4) this.f2145a;
        ContentResolver contentResolver = g4Var.f2218a;
        Uri uri = g4Var.f2219b;
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (acquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            Cursor query = acquireUnstableContentProviderClient.query(uri, g4.f2217i, null, null, null);
            try {
                if (query == null) {
                    Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                    return Collections.EMPTY_MAP;
                }
                int count = query.getCount();
                if (count == 0) {
                    Map map = Collections.EMPTY_MAP;
                    query.close();
                    return map;
                }
                if (count <= 256) {
                    hashMap = new v.l(count);
                } else {
                    hashMap = new HashMap(count, 1.0f);
                }
                while (query.moveToNext()) {
                    hashMap.put(query.getString(0), query.getString(1));
                }
                if (!query.isAfterLast()) {
                    Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                    Map map2 = Collections.EMPTY_MAP;
                    query.close();
                    return map2;
                }
                query.close();
                return hashMap;
            } finally {
            }
        } catch (RemoteException e10) {
            Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e10);
            return Collections.EMPTY_MAP;
        } finally {
            acquireUnstableContentProviderClient.release();
        }
    }

    public void d(int i6, Object obj, n6 n6Var) {
        v4 v4Var = (v4) obj;
        d5 d5Var = (d5) this.f2145a;
        d5Var.A((i6 << 3) | 2);
        d5Var.A(v4Var.b(n6Var));
        n6Var.c(v4Var, d5Var.f2183a);
    }

    public void e(int i6, Object obj, n6 n6Var) {
        d5 d5Var = (d5) this.f2145a;
        d5Var.r(i6, 3);
        n6Var.c((v4) obj, d5Var.f2183a);
        d5Var.r(i6, 4);
    }

    public a6(int i6) {
        switch (i6) {
            case 1:
                this.f2145a = new HashMap();
                return;
            default:
                k6 k6Var = k6.f2322c;
                a6 a6Var = new a6(new e6[]{k5.f2320b, f2144b});
                Charset charset = t5.f2444a;
                this.f2145a = a6Var;
                return;
        }
    }

    public a6(d5 d5Var) {
        Charset charset = t5.f2444a;
        this.f2145a = d5Var;
        d5Var.f2183a = this;
    }
}

package com.google.firebase.crashlytics;

import android.util.Log;
import androidx.fragment.app.d1;
import bc.d;
import com.bumptech.glide.e;
import com.google.firebase.components.ComponentRegistrar;
import fa.g;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import la.a;
import la.b;
import la.c;
import ma.j;
import ma.s;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f3603d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f3604a = new s(a.class, ExecutorService.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f3605b = new s(b.class, ExecutorService.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f3606c = new s(c.class, ExecutorService.class);

    static {
        Map map = bc.c.f1605b;
        d dVar = d.f1606v;
        if (map.containsKey(dVar)) {
            Log.d("FirebaseSessions", "Dependency " + dVar + " already added.");
            return;
        }
        map.put(dVar, new bc.a(new CountDownLatch(1)));
        Log.d("FirebaseSessions", "Dependency to " + dVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        ma.a aVarA = ma.b.a(oa.b.class);
        aVarA.f8526a = "fire-cls";
        aVarA.a(j.a(g.class));
        aVarA.a(j.a(nb.d.class));
        aVarA.a(new j(this.f3604a, 1, 0));
        aVarA.a(new j(this.f3605b, 1, 0));
        aVarA.a(new j(this.f3606c, 1, 0));
        aVarA.a(new j(0, 2, pa.b.class));
        aVarA.a(new j(0, 2, ja.b.class));
        aVarA.a(new j(0, 2, yb.a.class));
        aVarA.f = new d1(29, this);
        aVarA.c(2);
        return Arrays.asList(aVarA.b(), e.d("fire-cls", "20.0.6"));
    }
}

package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ob implements x9.m {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2956v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Context f2957w;

    public /* synthetic */ ob(Context context, int i) {
        this.f2956v = i;
        this.f2957w = context;
    }

    @Override // x9.m
    public final Object get() {
        int i = this.f2956v;
        Context context = this.f2957w;
        switch (i) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                Object obj = nb.f2919j;
                final int i10 = 0;
                final mb mbVar = new mb(0);
                mbVar.f2888b = context;
                context.getClass();
                if (((x9.m) mbVar.f2889c) == null) {
                    mbVar.f2889c = nb.f2922m;
                }
                final int i11 = 1;
                if (((x9.m) mbVar.f2890d) == null) {
                    mbVar.f2890d = u1.c.z(new ob((Context) mbVar.f2888b, i11));
                }
                if (((lb) mbVar.f) == null) {
                    mbVar.f = new x9.m() { // from class: com.google.android.gms.internal.measurement.lb
                        @Override // x9.m
                        public final Object get() {
                            int i12 = i11;
                            mb mbVar2 = mbVar;
                            switch (i12) {
                                case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                    Context context2 = (Context) mbVar2.f2888b;
                                    Object obj2 = nb.f2919j;
                                    try {
                                        ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                                        applicationInfo.getClass();
                                        return new x9.k(applicationInfo);
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return x9.a.f14288v;
                                    }
                                default:
                                    return new x9.k(new fe((x9.m) mbVar2.f2889c));
                            }
                        }
                    };
                }
                if (((x9.m) mbVar.f2891e) == null) {
                    Context context2 = (Context) mbVar.f2888b;
                    ArrayList arrayList = new ArrayList();
                    af afVar = new af(new p6(context2));
                    new ConcurrentHashMap();
                    Collections.addAll(arrayList, afVar, new df());
                    mbVar.f2891e = u1.c.z(new pb(i10, arrayList));
                }
                if (((lb) mbVar.f2892g) == null) {
                    mbVar.f2892g = new x9.m() { // from class: com.google.android.gms.internal.measurement.lb
                        @Override // x9.m
                        public final Object get() {
                            int i12 = i10;
                            mb mbVar2 = mbVar;
                            switch (i12) {
                                case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                    Context context22 = (Context) mbVar2.f2888b;
                                    Object obj2 = nb.f2919j;
                                    try {
                                        ApplicationInfo applicationInfo = context22.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                                        applicationInfo.getClass();
                                        return new x9.k(applicationInfo);
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return x9.a.f14288v;
                                    }
                                default:
                                    return new x9.k(new fe((x9.m) mbVar2.f2889c));
                            }
                        }
                    };
                }
                return new nb((Context) mbVar.f2888b, (x9.m) mbVar.f2889c, (x9.m) mbVar.f2890d, (lb) mbVar.f, (x9.m) mbVar.f2891e, (lb) mbVar.f2892g);
            case 1:
                Object obj2 = nb.f2919j;
                return new hc(new ya(context, e1.f2594v, r7.b.f11341a, r7.e.f11343c));
            default:
                Object obj3 = ub.f3137a;
                return jb.e(context);
        }
    }
}

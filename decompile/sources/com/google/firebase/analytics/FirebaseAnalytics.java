package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import cc.d;
import cc.e;
import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.l1;
import com.google.android.gms.internal.measurement.x0;
import dg.b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import jb.g;
import mb.a;
import n9.n2;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: b, reason: collision with root package name */
    public static volatile FirebaseAnalytics f2830b;

    /* renamed from: a, reason: collision with root package name */
    public final l1 f2831a;

    public FirebaseAnalytics(l1 l1Var) {
        x.g(l1Var);
        this.f2831a = l1Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f2830b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f2830b == null) {
                        f2830b = new FirebaseAnalytics(l1.e(context, null));
                    }
                } finally {
                }
            }
        }
        return f2830b;
    }

    @Keep
    public static n2 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        l1 e10 = l1.e(context, bundle);
        if (e10 == null) {
            return null;
        }
        return new a(e10);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = d.f2026m;
            return (String) b.b(((d) g.c().b(e.class)).d(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        x0 a10 = x0.a(activity);
        l1 l1Var = this.f2831a;
        l1Var.getClass();
        l1Var.c(new a1(l1Var, a10, str, str2));
    }
}

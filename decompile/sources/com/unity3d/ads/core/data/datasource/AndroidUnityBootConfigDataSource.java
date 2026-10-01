package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import df.a;
import he.j;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.k;
import lg.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidUnityBootConfigDataSource implements UnityBootConfigDataSource {
    private final Context context;

    public AndroidUnityBootConfigDataSource(Context context) {
        k.e(context, "context");
        this.context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.jvm.internal.w] */
    @Override // com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource
    public String getValue(String key) {
        Object b10;
        k.e(key, "key");
        try {
            String concat = key.concat("=");
            ?? obj = new Object();
            InputStream stream = this.context.getAssets().open("bin/Data/boot.config");
            try {
                k.d(stream, "stream");
                c.h(new BufferedReader(new InputStreamReader(stream, a.f4115a), 8192), new AndroidUnityBootConfigDataSource$getValue$1$1$1(concat, obj));
                stream.close();
                b10 = (String) obj.f8055x;
            } finally {
            }
        } catch (Throwable th) {
            b10 = he.a.b(th);
        }
        if (b10 instanceof j) {
            b10 = null;
        }
        return (String) b10;
    }
}

package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vd implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f3163v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f3164w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f3165x;

    public /* synthetic */ vd() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3163v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                Context context = ((nb) this.f3164w).f2924b;
                y9.e1 e1Var = wd.f3198y;
                if (e1Var == null) {
                    synchronized (wd.f3197x) {
                        e1Var = wd.f3198y;
                        if (e1Var == null) {
                            b3.a aVarA = y9.e1.a();
                            try {
                                String[] list = context.getAssets().list("phenotype");
                                if (list != null) {
                                    for (String str : list) {
                                        if (str.endsWith("_package_metadata.binarypb")) {
                                            try {
                                                AssetManager assets = context.getAssets();
                                                StringBuilder sb2 = new StringBuilder(str.length() + 10);
                                                sb2.append("phenotype/");
                                                sb2.append(str);
                                                InputStream inputStreamOpen = assets.open(sb2.toString());
                                                try {
                                                    a1 a1Var = a1.f2467a;
                                                    int i = o0.f2941a;
                                                    wd wdVar = new wd(context, xd.w(inputStreamOpen, a1.f2468b));
                                                    aVarA.r(wdVar.f3200w, wdVar);
                                                    if (inputStreamOpen != null) {
                                                        inputStreamOpen.close();
                                                    }
                                                } catch (Throwable th) {
                                                    if (inputStreamOpen != null) {
                                                        try {
                                                            inputStreamOpen.close();
                                                        } catch (Throwable th2) {
                                                            th.addSuppressed(th2);
                                                        }
                                                        break;
                                                    }
                                                    throw th;
                                                }
                                            } catch (u1 e7) {
                                                StringBuilder sb3 = new StringBuilder(str.length() + 45);
                                                sb3.append("Unable to read Phenotype PackageMetadata for ");
                                                sb3.append(str);
                                                Log.e("PackageInfo", sb3.toString(), e7);
                                            }
                                        }
                                    }
                                }
                            } catch (IOException e10) {
                                Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e10);
                            }
                            y9.e1 e1VarB = aVarA.b(true);
                            wd.f3198y = e1VarB;
                            e1Var = e1VarB;
                        }
                        break;
                    }
                }
                String str2 = (String) this.f3165x;
                if (e1Var.containsKey(str2)) {
                    return;
                }
                StringBuilder sb4 = new StringBuilder(str2.length() + 173);
                sb4.append("Config package ");
                sb4.append(str2);
                sb4.append(" cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags.");
                Log.e("FilePhenotypeFlags", sb4.toString());
                return;
            default:
                this.f3164w = null;
                this.f3165x = null;
                return;
        }
    }

    public /* synthetic */ vd(nb nbVar, String str) {
        this.f3164w = nbVar;
        this.f3165x = str;
    }
}

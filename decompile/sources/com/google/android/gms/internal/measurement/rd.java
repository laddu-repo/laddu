package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rd implements x9.f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f3052v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3053w;

    public /* synthetic */ rd(int i, Object obj) {
        this.f3052v = i;
        this.f3053w = obj;
    }

    @Override // x9.f
    public final Object apply(Object obj) {
        switch (this.f3052v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                Log.w("FlagStore", "Failed to commit to updated flags for ".concat(String.valueOf(((td) this.f3053w).f3111c)), (Throwable) obj);
                return null;
            case 1:
                cd cdVar = (cd) obj;
                xf xfVar = yd.f3255a;
                String str = (String) this.f3053w;
                yc ycVar = (yc) cdVar.u(str, zc.v()).l();
                if (!Collections.unmodifiableList(((zc) ycVar.f2653w).u()).contains("")) {
                    ycVar.b();
                    ((zc) ycVar.f2653w).w("");
                }
                bd bdVar = (bd) cdVar.l();
                ycVar.b();
                ((zc) ycVar.f2653w).x("");
                zc zcVar = (zc) ycVar.e();
                bdVar.b();
                ((cd) bdVar.f2653w).w().put(str, zcVar);
                return (cd) bdVar.e();
            default:
                qe qeVar = (qe) this.f3053w;
                xc xcVar = (xc) obj;
                qeVar.getClass();
                f6 f6Var = new f6(5);
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                try {
                    try {
                        synchronized (qe.f3024j) {
                            ye yeVar = (ye) qeVar.f3029d.get();
                            Uri uri = qeVar.f3031g;
                            f6 f6Var2 = new f6(xcVar.u());
                            f6Var2.f2639x = new f6[]{f6Var};
                            yeVar.a(uri, f6Var2);
                            qeVar.f3032h = xcVar.u();
                            break;
                        }
                        synchronized (qe.f3025k) {
                            ye yeVar2 = (ye) qeVar.f3029d.get();
                            Uri uri2 = qeVar.i;
                            f6 f6Var3 = new f6(xcVar.v());
                            f6Var3.f2639x = new f6[]{f6Var};
                            yeVar2.a(uri2, f6Var3);
                            xcVar.v();
                            break;
                        }
                        return null;
                    } catch (IOException e7) {
                        throw new RuntimeException(e7);
                    }
                } finally {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
        }
    }
}

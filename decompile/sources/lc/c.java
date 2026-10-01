package lc;

import a2.o0;
import android.content.ContentProviderClient;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import c2.k;
import c2.q;
import com.google.android.gms.tasks.Task;
import com.unity3d.services.core.webview.WebView;
import d2.g;
import j1.a0;
import j4.b0;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;
import kf.h;
import n9.i4;
import n9.m2;
import n9.n1;
import n9.u0;
import ne.j;
import o.w;
import o1.d;
import o1.f;
import okhttp3.HttpUrl;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import r1.n;
import u1.t;
import u5.x;
import v3.m;
import v6.e;
import ve.l;
import ve.p;
import w4.q1;
import w4.s0;
import w4.t0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements aa.b, q, m, n, w, i8.b, h, i4, org.chromium.net.c, p.n, q0.a, s9.c, x, e, q1 {

    /* renamed from: y, reason: collision with root package name */
    public static volatile c f8327y;

    /* renamed from: x, reason: collision with root package name */
    public Object f8328x;

    public /* synthetic */ c(Object obj) {
        this.f8328x = obj;
    }

    @Override // c2.q
    public void A(c2.n nVar) {
        b0 b0Var = ((androidx.media3.decoder.ffmpeg.c) this.f8328x).P;
        Handler handler = (Handler) b0Var.f7158x;
        if (handler != null) {
            handler.post(new k(b0Var, nVar, 9));
        }
    }

    @Override // v3.m
    public int B() {
        return 2;
    }

    @Override // w4.q1
    public int C(View view) {
        return view.getRight() + ((t0) view.getLayoutParams()).f14021b.right + ((ViewGroup.MarginLayoutParams) ((t0) view.getLayoutParams())).rightMargin;
    }

    public void E(kotlin.jvm.internal.e eVar, l lVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f8328x;
        if (!linkedHashMap.containsKey(eVar)) {
            linkedHashMap.put(eVar, new f(eVar, lVar));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + eVar.b() + '.').toString());
    }

    public d F() {
        Collection initializers = ((LinkedHashMap) this.f8328x).values();
        kotlin.jvm.internal.k.e(initializers, "initializers");
        f[] fVarArr = (f[]) initializers.toArray(new f[0]);
        return new d((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }

    public k7.a G() {
        n6.b l10;
        a2.c cVar = (a2.c) this.f8328x;
        n6.e eVar = (n6.e) cVar.A;
        synchronized (eVar) {
            cVar.a(true);
            l10 = eVar.l(((n6.a) cVar.f171y).f9062a);
        }
        if (l10 != null) {
            return new k7.a(l10, 1);
        }
        return null;
    }

    public Set H() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.f8328x)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) this.f8328x);
        }
        return unmodifiableSet;
    }

    public void I() {
        ((a0) this.f8328x).D.S();
    }

    public void J() {
        long j;
        g gVar = (g) this.f8328x;
        synchronized (v2.b.f13258b) {
            try {
                if (v2.b.f13259c) {
                    j = v2.b.f13260d;
                } else {
                    j = -9223372036854775807L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        gVar.f3726i0 = j;
        gVar.B(true);
    }

    public boolean K() {
        n1 n1Var = (n1) this.f8328x;
        try {
            c9.b a10 = c9.c.a(n1Var.f9413x);
            if (a10 == null) {
                u0 u0Var = n1Var.C;
                n1.g(u0Var);
                u0Var.L.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            }
            if (a10.b(128, "com.android.vending").versionCode < 80837300) {
                return false;
            }
            return true;
        } catch (Exception e10) {
            u0 u0Var2 = n1Var.C;
            n1.g(u0Var2);
            u0Var2.L.b(e10, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }

    @Override // c2.q
    public void a(int i6) {
        b0 b0Var = ((androidx.media3.decoder.ffmpeg.c) this.f8328x).P;
        Handler handler = (Handler) b0Var.f7158x;
        if (handler != null) {
            handler.post(new o0(i6, 1, b0Var));
        }
    }

    @Override // w4.q1
    public int b(View view) {
        return (view.getLeft() - ((t0) view.getLayoutParams()).f14021b.left) - ((ViewGroup.MarginLayoutParams) ((t0) view.getLayoutParams())).leftMargin;
    }

    @Override // n9.i4
    public void c(String str, String str2, Bundle bundle) {
        m2 m2Var = (m2) this.f8328x;
        if (TextUtils.isEmpty(str)) {
            ((n1) m2Var.f4301y).H.getClass();
            m2Var.i1("auto", "_err", bundle, true, true, System.currentTimeMillis());
        } else {
            m2Var.getClass();
            throw new IllegalStateException("Unexpected call on client side");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f8328x;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                j2.e.u((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v4, types: [ne.j, ve.p] */
    @Override // kf.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(kf.i r6, le.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kf.a
            if (r0 == 0) goto L13
            r0 = r7
            kf.a r0 = (kf.a) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            kf.a r0 = new kf.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f7912y
            int r1 = r0.A
            he.y r2 = he.y.f6101a
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 != r3) goto L2b
            lf.v r6 = r0.f7911x
            he.a.f(r7)     // Catch: java.lang.Throwable -> L29
            goto L55
        L29:
            r7 = move-exception
            goto L5f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            he.a.f(r7)
            lf.v r7 = new lf.v
            le.h r1 = r0.getContext()
            r7.<init>(r6, r1)
            r0.f7911x = r7     // Catch: java.lang.Throwable -> L5d
            r0.A = r3     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r6 = r5.f8328x     // Catch: java.lang.Throwable -> L5d
            ne.j r6 = (ne.j) r6     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r6 = r6.invoke(r7, r0)     // Catch: java.lang.Throwable -> L5d
            me.a r0 = me.a.f8833x
            if (r6 != r0) goto L50
            goto L51
        L50:
            r6 = r2
        L51:
            if (r6 != r0) goto L54
            return r0
        L54:
            r6 = r7
        L55:
            r6.releaseIntercepted()
            return r2
        L59:
            r4 = r7
            r7 = r6
            r6 = r4
            goto L5f
        L5d:
            r6 = move-exception
            goto L59
        L5f:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lc.c.collect(kf.i, le.c):java.lang.Object");
    }

    @Override // c2.q
    public void d(boolean z10) {
        b0 b0Var = ((androidx.media3.decoder.ffmpeg.c) this.f8328x).P;
        Handler handler = (Handler) b0Var.f7158x;
        if (handler != null) {
            handler.post(new c2.l(b0Var, z10));
        }
    }

    @Override // o.w
    public void e(o.l lVar, boolean z10) {
        boolean z11;
        int i6;
        i.a0 a0Var;
        i.b0 b0Var = (i.b0) this.f8328x;
        o.l k8 = lVar.k();
        int i10 = 0;
        if (k8 != lVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            lVar = k8;
        }
        i.a0[] a0VarArr = b0Var.f6139j0;
        if (a0VarArr != null) {
            i6 = a0VarArr.length;
        } else {
            i6 = 0;
        }
        while (true) {
            if (i10 < i6) {
                a0Var = a0VarArr[i10];
                if (a0Var != null && a0Var.f6120h == lVar) {
                    break;
                } else {
                    i10++;
                }
            } else {
                a0Var = null;
                break;
            }
        }
        if (a0Var != null) {
            if (z11) {
                b0Var.o(a0Var.f6113a, a0Var, k8);
                b0Var.q(a0Var, true);
            } else {
                b0Var.q(a0Var, z10);
            }
        }
    }

    @Override // c2.q
    public void f(long j) {
        b0 b0Var = ((androidx.media3.decoder.ffmpeg.c) this.f8328x).P;
        Handler handler = (Handler) b0Var.f7158x;
        if (handler != null) {
            handler.post(new k(b0Var, j));
        }
    }

    @Override // v3.m
    public /* synthetic */ v3.d g(byte[] bArr, int i6, int i10) {
        return h8.c.a(this, bArr, i10);
    }

    @Override // ge.a
    public Object get() {
        return this.f8328x;
    }

    @Override // u5.x
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) dg.b.d(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f8328x).getWebkitToCompatConverter());
    }

    @Override // w4.q1
    public int h() {
        return ((s0) this.f8328x).E();
    }

    @Override // c2.q
    public void i() {
        ((androidx.media3.decoder.ffmpeg.c) this.f8328x).f1035m0 = true;
    }

    @Override // u5.x
    public String[] k() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f8328x).getSupportedFeatures();
    }

    @Override // w4.q1
    public int n() {
        s0 s0Var = (s0) this.f8328x;
        return s0Var.f14016n - s0Var.F();
    }

    @Override // v3.m
    public void o(byte[] bArr, int i6, int i10, v3.l lVar, u1.g gVar) {
        boolean z10;
        t1.b a10;
        boolean z11;
        t tVar = (t) this.f8328x;
        tVar.I(i6 + i10, bArr);
        tVar.K(i6);
        ArrayList arrayList = new ArrayList();
        while (tVar.a() > 0) {
            if (tVar.a() >= 8) {
                z10 = true;
            } else {
                z10 = false;
            }
            u1.c.a("Incomplete Mp4Webvtt Top Level box header found.", z10);
            int k8 = tVar.k();
            if (tVar.k() == 1987343459) {
                int i11 = k8 - 8;
                CharSequence charSequence = null;
                t1.a aVar = null;
                while (i11 > 0) {
                    if (i11 >= 8) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    u1.c.a("Incomplete vtt cue box header found.", z11);
                    int k9 = tVar.k();
                    int k10 = tVar.k();
                    int i12 = k9 - 8;
                    byte[] bArr2 = tVar.f12811a;
                    int i13 = tVar.f12812b;
                    String str = u1.a0.f12750a;
                    String str2 = new String(bArr2, i13, i12, StandardCharsets.UTF_8);
                    tVar.L(i12);
                    i11 = (i11 - 8) - i12;
                    if (k10 == 1937011815) {
                        e4.g gVar2 = new e4.g();
                        e4.h.e(str2, gVar2);
                        aVar = gVar2.a();
                    } else if (k10 == 1885436268) {
                        charSequence = e4.h.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (aVar != null) {
                    aVar.f12434a = charSequence;
                    aVar.f12435b = null;
                    a10 = aVar.a();
                } else {
                    Pattern pattern = e4.h.f4345a;
                    e4.g gVar3 = new e4.g();
                    gVar3.f4337c = charSequence;
                    a10 = gVar3.a().a();
                }
                arrayList.add(a10);
            } else {
                tVar.L(k8 - 8);
            }
        }
        gVar.accept(new v3.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // s9.c
    public void onComplete(Task task) {
        ((CountDownLatch) this.f8328x).countDown();
    }

    @Override // org.chromium.net.c
    public FileChannel p() {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.f8328x;
        if (parcelFileDescriptor.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
        }
        parcelFileDescriptor.close();
        throw new IllegalArgumentException("Not a file: " + parcelFileDescriptor);
    }

    @Override // c2.q
    public void q(int i6, long j, long j10) {
        b0 b0Var = ((androidx.media3.decoder.ffmpeg.c) this.f8328x).P;
        Handler handler = (Handler) b0Var.f7158x;
        if (handler != null) {
            handler.post(new k(b0Var, i6, j, j10));
        }
    }

    @Override // w4.q1
    public View s(int i6) {
        return ((s0) this.f8328x).u(i6);
    }

    @Override // q0.a
    public Cursor t(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f8328x;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e10) {
            Log.w("FontsProvider", "Unable to query the content provider", e10);
            return null;
        }
    }

    @Override // c2.q
    public void u() {
        t2.q qVar;
        androidx.media3.decoder.ffmpeg.c cVar = (androidx.media3.decoder.ffmpeg.c) this.f8328x;
        synchronized (cVar.f244x) {
            qVar = cVar.O;
        }
        if (qVar != null) {
            qVar.h();
        }
    }

    @Override // o.w
    public boolean v(o.l lVar) {
        Window.Callback callback;
        i.b0 b0Var = (i.b0) this.f8328x;
        if (lVar == lVar.k() && b0Var.f6133d0 && (callback = b0Var.I.getCallback()) != null && !b0Var.o0) {
            callback.onMenuOpened(108, lVar);
            return true;
        }
        return true;
    }

    @Override // c2.q
    public void w(Exception exc) {
        u1.a.h("DecoderAudioRenderer", "Audio sink error", exc);
        b0 b0Var = ((androidx.media3.decoder.ffmpeg.c) this.f8328x).P;
        Handler handler = (Handler) b0Var.f7158x;
        if (handler != null) {
            handler.post(new k(b0Var, exc, 5));
        }
    }

    @Override // c2.q
    public void x(c2.n nVar) {
        b0 b0Var = ((androidx.media3.decoder.ffmpeg.c) this.f8328x).P;
        Handler handler = (Handler) b0Var.f7158x;
        if (handler != null) {
            handler.post(new k(b0Var, nVar, 1));
        }
    }

    @Override // c2.q
    public void y() {
        ((androidx.media3.decoder.ffmpeg.c) this.f8328x).f1029g0 = true;
    }

    @Override // u5.x
    public WebViewProviderBoundaryInterface z(WebView webView) {
        return (WebViewProviderBoundaryInterface) dg.b.d(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f8328x).createWebView(webView));
    }

    public c(int i6) {
        switch (i6) {
            case 4:
                this.f8328x = new t();
                return;
            case 7:
                this.f8328x = new LinkedHashMap(5, 1.0f, false);
                return;
            case 18:
                this.f8328x = new LinkedHashMap();
                return;
            default:
                this.f8328x = new HashSet();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar) {
        this.f8328x = (j) pVar;
    }

    @Override // c2.q
    public /* synthetic */ void D() {
    }

    @Override // c2.q
    public /* synthetic */ void j() {
    }

    @Override // v3.m
    public /* synthetic */ void reset() {
    }
}

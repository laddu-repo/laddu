package a2;

import android.content.Intent;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import com.google.android.gms.tasks.Task;
import com.playfy.tv.activities.PlayerActivity;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.webview.WebView;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal.Util;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements u1.l, EventListener.Factory, t0.s, s9.e, y2.g, v1.s, f2.p, i4.a0, i4.g1, u1.g, i4.e1, s9.c {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f211x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f212y;

    public /* synthetic */ e0(b2.a aVar, Object obj, int i6) {
        this.f211x = i6;
        this.f212y = obj;
    }

    @Override // i4.e1
    public void a(i4.l1 l1Var, i4.s sVar) {
        ((u1.g) this.f212y).accept(l1Var);
    }

    @Override // u1.g
    public void accept(Object obj) {
        switch (this.f211x) {
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
                ((i4.l1) obj).e((r1.o0) this.f212y);
                return;
            default:
                ((i4.l1) obj).g((Surface) this.f212y);
                return;
        }
    }

    @Override // y2.g
    public long b(long j) {
        return u1.a0.j((j * r0.f14935e) / 1000000, 0L, ((y2.s) this.f212y).j - 1);
    }

    @Override // i4.g1
    public Object c(i4.b0 b0Var, i4.s sVar, int i6) {
        int i10 = this.f211x;
        Object obj = this.f212y;
        switch (i10) {
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                return b0Var.l(sVar, (db.k0) obj);
            default:
                i4.e1 e1Var = (i4.e1) obj;
                hb.u uVar = hb.u.f6034y;
                if (!b0Var.j()) {
                    e1Var.a(b0Var.f6318t, sVar);
                    i4.h1.Q(b0Var, sVar, i6, new i4.s1(0));
                }
                return hb.u.f6034y;
        }
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        EventListener asFactory$lambda$8;
        asFactory$lambda$8 = Util.asFactory$lambda$8((EventListener) this.f212y, call);
        return asFactory$lambda$8;
    }

    @Override // i4.a0
    public void d(i4.r rVar, int i6) {
        rVar.d(i6, (r1.q0) this.f212y);
    }

    @Override // v1.s
    public void e(long j, u1.t tVar) {
        switch (this.f211x) {
            case 18:
                y2.a.f(j, tVar, ((f4.d0) this.f212y).f4739c);
                return;
            default:
                y2.a.g(j, tVar, ((f4.d0) this.f212y).f4739c);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [o5.e0, java.lang.Object] */
    @Override // f2.p
    public f2.o f(r1.e0 it) {
        u5.r rVar = (u5.r) this.f212y;
        bf.o[] oVarArr = PlayerActivity.V;
        kotlin.jvm.internal.k.e(it, "it");
        ?? obj = new Object();
        UUID uuid = r1.g.f11401c;
        uuid.getClass();
        return new f2.g(uuid, rVar, new HashMap(), true, new int[0], true, obj);
    }

    public e8.b g(androidx.lifecycle.j1 j1Var) {
        InputStream inputStream;
        e8.c cVar = (e8.c) this.f212y;
        URL url = (URL) j1Var.f949y;
        String Q = a8.f.Q("CctTransportBackend");
        if (Log.isLoggable(Q, 4)) {
            Log.i(Q, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.f4477g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty(CommonGatewayClient.HEADER_CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) j1Var.A;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    w4.c cVar2 = cVar.f4471a;
                    f8.i iVar = (f8.i) j1Var.f950z;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    wb.d dVar = (wb.d) cVar2.f13822a;
                    wb.e eVar = new wb.e(bufferedWriter, dVar.f14266a, dVar.f14267b, dVar.f14268c, dVar.f14269d);
                    eVar.f(iVar);
                    eVar.h();
                    eVar.f14271b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String Q2 = a8.f.Q("CctTransportBackend");
                    if (Log.isLoggable(Q2, 4)) {
                        Log.i(Q2, String.format("Status Code: %d", valueOf));
                    }
                    a8.f.K("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField(CommonGatewayClient.HEADER_CONTENT_TYPE));
                    a8.f.K("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                        if (responseCode != 200) {
                            return new e8.b(responseCode, null, 0L);
                        }
                        InputStream inputStream2 = httpURLConnection.getInputStream();
                        try {
                            if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                                inputStream = new GZIPInputStream(inputStream2);
                            } else {
                                inputStream = inputStream2;
                            }
                            try {
                                e8.b bVar = new e8.b(responseCode, null, f8.m.a(new BufferedReader(new InputStreamReader(inputStream))).f5139a);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (inputStream2 != null) {
                                    inputStream2.close();
                                }
                                return bVar;
                            } finally {
                            }
                        } finally {
                        }
                    } else {
                        return new e8.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                } finally {
                }
            } finally {
            }
        } catch (ConnectException e10) {
            e = e10;
            a8.f.M("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new e8.b(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            a8.f.M("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new e8.b(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, null, 0L);
        } catch (IOException e12) {
            e = e12;
            a8.f.M("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new e8.b(CommonGatewayClient.CODE_400, null, 0L);
        } catch (ub.b e13) {
            e = e13;
            a8.f.M("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new e8.b(CommonGatewayClient.CODE_400, null, 0L);
        }
    }

    @Override // u1.l
    public void invoke(Object obj) {
        switch (this.f211x) {
            case 0:
                ((r1.s0) obj).k((r1.j1) this.f212y);
                return;
            case 1:
                ((r1.s0) obj).C((r1.d) this.f212y);
                return;
            case 2:
                ((r1.s0) obj).y((t1.c) this.f212y);
                return;
            case 3:
                ((r1.s0) obj).s(((k0) this.f212y).f295x.f339n0);
                return;
            case 4:
                ((r1.s0) obj).E((r1.j0) this.f212y);
                return;
            case 5:
            case 6:
            case 7:
            default:
                n2.g gVar = (n2.g) this.f212y;
                b2.l lVar = (b2.l) obj;
                lVar.getClass();
                lVar.f1405w = gVar.f8999a;
                return;
            case 8:
                ((b2.l) obj).f1398o = (r1.n0) this.f212y;
                return;
            case 9:
                h hVar = (h) this.f212y;
                b2.l lVar2 = (b2.l) obj;
                lVar2.f1407y += hVar.f256g;
                lVar2.f1408z += hVar.f254e;
                return;
        }
    }

    @Override // s9.c
    public void onComplete(Task task) {
        switch (this.f211x) {
            case 27:
                ic.c0.b((Intent) this.f212y);
                return;
            case 28:
                ((ic.e0) this.f212y).f6746b.c(null);
                return;
            default:
                ((ScheduledFuture) this.f212y).cancel(false);
                return;
        }
    }

    @Override // s9.e
    public void onSuccess(Object obj) {
        AndroidAppSetIdDataSource.a((ve.l) this.f212y, obj);
    }

    @Override // t0.s
    public t0.w1 v(View view, t0.w1 w1Var) {
        t0.w1 applySafeAreaInsets$lambda$3;
        t0.w1 applySafeAreaInsets$lambda$32;
        switch (this.f211x) {
            case 13:
                applySafeAreaInsets$lambda$3 = AndroidWebViewContainer.applySafeAreaInsets$lambda$3((AndroidWebViewContainer) this.f212y, view, w1Var);
                return applySafeAreaInsets$lambda$3;
            default:
                applySafeAreaInsets$lambda$32 = WebView.applySafeAreaInsets$lambda$3((WebView) this.f212y, view, w1Var);
                return applySafeAreaInsets$lambda$32;
        }
    }

    public /* synthetic */ e0(b2.a aVar, q2.u uVar, n2.g gVar, IOException iOException, boolean z10) {
        this.f211x = 10;
        this.f212y = gVar;
    }

    public /* synthetic */ e0(Object obj, int i6) {
        this.f211x = i6;
        this.f212y = obj;
    }
}

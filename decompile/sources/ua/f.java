package ua;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.google.android.gms.internal.measurement.b9;
import com.google.android.gms.internal.measurement.d8;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.i7;
import com.google.android.gms.internal.measurement.o7;
import com.google.android.gms.internal.measurement.t8;
import com.google.android.gms.internal.measurement.v8;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import n9.e0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class f implements o1.b, b1.b, e7.b, e9.d, h2.s, j2.x, u2.j, n9.w {

    /* renamed from: y, reason: collision with root package name */
    public static f f12975y;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f12977x;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ f f12976z = new f(20);
    public static final /* synthetic */ f A = new f(21);
    public static final /* synthetic */ f B = new f(22);
    public static final /* synthetic */ f C = new f(23);
    public static final /* synthetic */ f D = new f(24);
    public static final /* synthetic */ f E = new f(25);
    public static final /* synthetic */ f F = new f(26);
    public static final /* synthetic */ f G = new f(27);
    public static final /* synthetic */ f H = new f(28);
    public static final /* synthetic */ f I = new f(29);

    public /* synthetic */ f(int i6) {
        this.f12977x = i6;
    }

    public static k7.a s(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new k7.a(httpURLConnection, 0);
    }

    @Override // u2.j
    public ef.g C(u2.l lVar, long j, long j10, IOException iOException, int i6) {
        return u2.o.B;
    }

    @Override // n9.w
    public Object b() {
        switch (this.f12977x) {
            case 20:
                return new Boolean(((Boolean) o7.f2381a.b()).booleanValue());
            case 21:
                return new Boolean(((Boolean) d8.f2190a.b()).booleanValue());
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                List list = e0.f9226a;
                t8.f2452y.get();
                Boolean bool = (Boolean) v8.f2472c.b();
                bool.getClass();
                return bool;
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
                List list2 = e0.f9226a;
                Boolean bool2 = (Boolean) b9.f2163a.b();
                bool2.getClass();
                return bool2;
            case 24:
                List list3 = e0.f9226a;
                g7.f2236y.get();
                return Integer.valueOf((int) ((Long) i7.f2283l0.b()).longValue());
            case 25:
                List list4 = e0.f9226a;
                g7.f2236y.get();
                return Integer.valueOf((int) ((Long) i7.f2292q0.b()).longValue());
            case 26:
                List list5 = e0.f9226a;
                g7.f2236y.get();
                return (String) i7.f2286n.b();
            case 27:
                List list6 = e0.f9226a;
                g7.f2236y.get();
                Long l10 = (Long) i7.T.b();
                l10.getClass();
                return l10;
            case 28:
                List list7 = e0.f9226a;
                g7.f2236y.get();
                Long l11 = (Long) i7.J.b();
                l11.getClass();
                return l11;
            default:
                List list8 = e0.f9226a;
                g7.f2236y.get();
                return Integer.valueOf((int) ((Long) i7.P.b()).longValue());
        }
    }

    @Override // j2.x
    public MediaCodecInfo c(int i6) {
        return MediaCodecList.getCodecInfoAt(i6);
    }

    @Override // e7.b
    public boolean d(float f3) {
        throw new IllegalStateException("not implemented");
    }

    @Override // e7.b
    public o7.a e() {
        throw new IllegalStateException("not implemented");
    }

    @Override // e7.b
    public boolean f(float f3) {
        return false;
    }

    @Override // j2.x
    public boolean g(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && MimeTypes.VIDEO_H264.equals(str2)) {
            return true;
        }
        return false;
    }

    @Override // h2.s
    public u2.q h(h2.o oVar, h2.l lVar) {
        return new h2.r(oVar, lVar);
    }

    @Override // e9.d
    public a3.c i(Context context, String str, e9.c cVar) {
        a3.c cVar2 = new a3.c();
        int m9 = cVar.m(context, str);
        cVar2.f521a = m9;
        if (m9 != 0) {
            cVar2.f523c = -1;
            return cVar2;
        }
        int d10 = cVar.d(context, str, true);
        cVar2.f522b = d10;
        if (d10 != 0) {
            cVar2.f523c = 1;
        }
        return cVar2;
    }

    @Override // e7.b
    public boolean isEmpty() {
        return true;
    }

    @Override // e7.b
    public float j() {
        return 1.0f;
    }

    @Override // u2.j
    public /* bridge */ /* synthetic */ void k(u2.l lVar, long j, long j10) {
    }

    @Override // j2.x
    public boolean l(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // j2.x
    public int m() {
        return MediaCodecList.getCodecCount();
    }

    @Override // e7.b
    public float n() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // u2.j
    public /* bridge */ /* synthetic */ void o(u2.l lVar, long j, long j10, boolean z10) {
    }

    @Override // h2.s
    public u2.q p() {
        return new h2.r(h2.o.f5937n, null);
    }

    @Override // j2.x
    public boolean q() {
        return false;
    }

    public void r(String msg) {
        kotlin.jvm.internal.k.e(msg, "msg");
        t(mg.a.f8887x, msg);
    }

    public void t(mg.a aVar, String msg) {
        kotlin.jvm.internal.k.e(msg, "msg");
        mg.a.B.compareTo(aVar);
    }

    public f() {
        this.f12977x = 2;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    public f(m2.z zVar) {
        this.f12977x = 18;
    }

    @Override // b1.b
    public Object a(b1.a aVar) {
        throw aVar;
    }

    @Override // u2.j
    public /* synthetic */ void z(u2.l lVar, long j, long j10, int i6) {
    }
}

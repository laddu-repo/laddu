package k8;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.f6;
import com.google.android.gms.internal.measurement.fd;
import com.google.android.gms.internal.measurement.id;
import com.google.android.gms.internal.measurement.p6;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements w, l2.w, sd.g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7395v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ b0 f7391w = new b0(0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ b0 f7392x = new b0(1);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ b0 f7393y = new b0(2);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ b0 f7394z = new b0(3);
    public static final /* synthetic */ b0 A = new b0(4);
    public static final /* synthetic */ b0 B = new b0(5);
    public static final /* synthetic */ b0 C = new b0(6);
    public static final /* synthetic */ b0 D = new b0(7);
    public static final /* synthetic */ b0 E = new b0(8);
    public static final /* synthetic */ b0 F = new b0(9);
    public static final /* synthetic */ b0 G = new b0(10);
    public static final /* synthetic */ b0 H = new b0(11);
    public static final /* synthetic */ b0 I = new b0(12);
    public static final /* synthetic */ b0 J = new b0(13);
    public static final /* synthetic */ b0 K = new b0(14);
    public static final /* synthetic */ b0 L = new b0(15);

    public /* synthetic */ b0(int i) {
        this.f7395v = i;
    }

    public static final void f(vf.b bVar) {
        c6.i iVar = vf.b.f13595h;
        if (vf.b.i == null) {
            vf.b.i = new vf.b();
            b8.g gVar = new b8.g("Okio Watchdog");
            gVar.setDaemon(true);
            gVar.start();
        }
        long jNanoTime = System.nanoTime();
        long j8 = bVar.f13646c;
        boolean z2 = bVar.f13644a;
        if (j8 != 0 && z2) {
            bVar.f13601g = Math.min(j8, bVar.c() - jNanoTime) + jNanoTime;
        } else if (j8 != 0) {
            bVar.f13601g = jNanoTime + j8;
        } else {
            if (!z2) {
                throw new AssertionError();
            }
            bVar.f13601g = bVar.c();
        }
        c6.i iVar2 = vf.b.f13595h;
        int i = iVar2.f2194w + 1;
        iVar2.f2194w = i;
        vf.b[] bVarArr = (vf.b[]) iVar2.f2195x;
        if (i == bVarArr.length) {
            vf.b[] bVarArr2 = new vf.b[i * 2];
            pd.i.a0(0, 0, 14, bVarArr, bVarArr2);
            iVar2.f2195x = bVarArr2;
        }
        iVar2.m(i, bVar);
        if (bVar.f == 1) {
            vf.b.f13597k.signal();
        }
    }

    public static vf.b h() throws InterruptedException {
        c6.i iVar = vf.b.f13595h;
        vf.b bVar = ((vf.b[]) iVar.f2195x)[1];
        if (bVar == null) {
            long jNanoTime = System.nanoTime();
            vf.b.f13597k.await(vf.b.f13598l, TimeUnit.MILLISECONDS);
            if (((vf.b[]) iVar.f2195x)[1] != null || System.nanoTime() - jNanoTime < vf.b.f13599m) {
                return null;
            }
            return vf.b.i;
        }
        long jNanoTime2 = bVar.f13601g - System.nanoTime();
        if (jNanoTime2 > 0) {
            vf.b.f13597k.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        iVar.p(bVar);
        bVar.f13600e = 2;
        return bVar;
    }

    @Override // k8.w
    public Object a() {
        switch (this.f7395v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                List list = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return (String) com.google.android.gms.internal.measurement.g3.f2655a.i(7, "measurement.config.url_authority", "app-measurement.com").get();
            case 1:
                List list2 = f0.f7479a;
                com.google.android.gms.internal.measurement.q4.f3007w.get();
                f6 f6Var = com.google.android.gms.internal.measurement.s4.f3073a;
                AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) f6Var.f2638w;
                id idVar = (id) atomicReferenceArray.get(2);
                if (idVar == null) {
                    fd fdVar = new fd("measurement.test.double_flag", (q7.h) ((p6) f6Var.f2639x).f2983w);
                    while (true) {
                        if (atomicReferenceArray.compareAndSet(2, null, fdVar)) {
                            idVar = fdVar;
                        } else if (atomicReferenceArray.get(2) != null) {
                            idVar = (id) atomicReferenceArray.get(2);
                            idVar.getClass();
                        }
                    }
                }
                return (Double) idVar.get();
            case 2:
                List list3 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.g3.f2655a.g(3, 100L, "measurement.max_bundles_per_iteration").get()).longValue());
            case 3:
                List list4 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.g3.f2655a.g(26, 7L, "measurement.rb.attribution.client.min_ad_services_version").get()).longValue());
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                List list5 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return (String) com.google.android.gms.internal.measurement.g3.f2655a.i(58, "measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion").get();
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                List list6 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return (String) com.google.android.gms.internal.measurement.g3.f2655a.i(13, "measurement.rb.attribution.event_params", "value|currency").get();
            case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                List list7 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.g3.f2655a.g(54, 16L, "measurement.rb.attribution.max_retry_delay_seconds").get()).longValue());
            case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                List list8 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return (Boolean) com.google.android.gms.internal.measurement.g3.f2655a.b("measurement.config.bundle_for_all_apps_on_backgrounded", true, 2).get();
            case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                List list9 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return (Long) com.google.android.gms.internal.measurement.g3.f2655a.g(11, 3600000L, "45769094").get();
            case 9:
                List list10 = f0.f7479a;
                return (Boolean) com.google.android.gms.internal.measurement.c4.f2533c.get();
            case 10:
                List list11 = f0.f7479a;
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.j3.f2786a.get()).longValue());
            case 11:
                List list12 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.g3.f2655a.g(70, 1000L, "measurement.upload.max_events_per_bundle").get()).longValue());
            case 12:
                List list13 = f0.f7479a;
                com.google.android.gms.internal.measurement.t4.f3103w.get();
                return (Boolean) com.google.android.gms.internal.measurement.v4.f3159a.b("measurement.rb.attribution.uuid_generation", true, 8).get();
            case 13:
                List list14 = f0.f7479a;
                com.google.android.gms.internal.measurement.t4.f3103w.get();
                return (Boolean) com.google.android.gms.internal.measurement.v4.f3159a.b("measurement.rb.attribution.service.trigger_uris_high_priority", true, 2).get();
            case 14:
                List list15 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return (Long) com.google.android.gms.internal.measurement.g3.f2655a.g(0, 10000L, "measurement.ad_id_cache_time").get();
            default:
                return new Boolean(((Boolean) e5.f2607a.get()).booleanValue());
        }
    }

    @Override // l2.w
    public MediaCodecInfo b(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // l2.w
    public boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // l2.w
    public int d() {
        return MediaCodecList.getCodecCount();
    }

    @Override // l2.w
    public boolean e(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // l2.w
    public boolean g() {
        return false;
    }

    public void i(v4.c cVar, Object obj) {
        sc.c cVar2 = (sc.c) obj;
        cVar.o(cVar2.f11788a);
        String str = cVar2.f11789b;
        if (str == null) {
            cVar.e(2);
        } else {
            cVar.K(2, str);
        }
        String str2 = cVar2.f11790c;
        if (str2 == null) {
            cVar.e(3);
        } else {
            cVar.K(3, str2);
        }
        String str3 = cVar2.f11791d;
        if (str3 == null) {
            cVar.e(4);
        } else {
            cVar.K(4, str3);
        }
        String str4 = cVar2.f11792e;
        if (str4 == null) {
            cVar.e(5);
        } else {
            cVar.K(5, str4);
        }
    }
}

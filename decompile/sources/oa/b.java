package oa;

import ab.d;
import ab.g;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import androidx.fragment.app.q0;
import b8.f;
import com.bumptech.glide.manager.l;
import com.google.android.gms.internal.measurement.e3;
import com.google.android.gms.internal.measurement.g3;
import com.google.android.gms.internal.measurement.q3;
import com.google.android.gms.internal.measurement.t3;
import h2.h;
import h2.k;
import h2.m;
import h2.n;
import h2.q;
import h2.z;
import j6.d0;
import j6.o;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import k8.a0;
import k8.f0;
import k8.w;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b implements g, b8.c, bb.a, com.bumptech.glide.manager.g, l, w6.a, n, o, d0, jb.a, w {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f10086v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ b f10082w = new b(15);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ b f10083x = new b(17);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ b f10084y = new b(18);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ b f10085z = new b(19);
    public static final /* synthetic */ b A = new b(20);
    public static final /* synthetic */ b B = new b(21);
    public static final /* synthetic */ b C = new b(22);
    public static final /* synthetic */ b D = new b(23);
    public static final /* synthetic */ b E = new b(24);
    public static final /* synthetic */ b F = new b(25);
    public static final /* synthetic */ b G = new b(26);
    public static final /* synthetic */ b H = new b(27);
    public static final /* synthetic */ b I = new b(28);
    public static final /* synthetic */ b J = new b(29);

    public /* synthetic */ b(int i) {
        this.f10086v = i;
    }

    public static d p(a0 a0Var) {
        return new d(System.currentTimeMillis() + ((long) 3600000), new ab.c(8), new ab.b(true, false, false), 10.0d, 1.2d, 60);
    }

    public static final boolean r() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // k8.w
    public Object a() {
        switch (this.f10086v) {
            case 17:
                return new Boolean(((Boolean) q3.f3006a.get()).booleanValue());
            case 18:
                List list = f0.f7479a;
                e3.f2605w.get();
                return (String) g3.f2655a.i(4, "measurement.gbraid_campaign.campaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid").get();
            case 19:
                List list2 = f0.f7479a;
                return (String) t3.f3102c.get();
            case 20:
                List list3 = f0.f7479a;
                e3.f2605w.get();
                return Integer.valueOf((int) ((Long) g3.f2655a.g(74, 10L, "measurement.upload.max_realtime_events_per_day").get()).longValue());
            case 21:
                List list4 = f0.f7479a;
                e3.f2605w.get();
                return (String) g3.f2655a.i(44, "measurement.sgtm.service_upload_apps_list", "").get();
            case 22:
                List list5 = f0.f7479a;
                e3.f2605w.get();
                return (Long) g3.f2655a.g(52, 21600000L, "measurement.sgtm.upload.retry_max_wait").get();
            case 23:
                List list6 = f0.f7479a;
                e3.f2605w.get();
                return Integer.valueOf((int) ((Long) g3.f2655a.g(47, 5000L, "measurement.sgtm.upload.max_queued_batches").get()).longValue());
            case 24:
                List list7 = f0.f7479a;
                e3.f2605w.get();
                return (Long) g3.f2655a.g(48, 600000L, "measurement.sgtm.upload.min_delay_after_background").get();
            case 25:
                List list8 = f0.f7479a;
                e3.f2605w.get();
                return (Long) g3.f2655a.g(79, 3600000L, "measurement.upload.window_interval").get();
            case 26:
                List list9 = f0.f7479a;
                e3.f2605w.get();
                return (Long) g3.f2655a.g(28, 500L, "measurement.upload.minimum_delay").get();
            case 27:
                List list10 = f0.f7479a;
                e3.f2605w.get();
                return (Long) g3.f2655a.g(64, 15000L, "measurement.upload.initial_upload_delay_time").get();
            case 28:
                List list11 = f0.f7479a;
                e3.f2605w.get();
                return (Long) g3.f2655a.g(73, 518400000L, "measurement.upload.max_queue_time").get();
            default:
                List list12 = f0.f7479a;
                e3.f2605w.get();
                return (Long) g3.f2655a.g(36, 5000L, "measurement.service_client.idle_disconnect_millis").get();
        }
    }

    @Override // b8.c
    public int b(Context context, String str, boolean z2) {
        return f.d(context, str, z2);
    }

    @Override // h2.n
    public int c(t1.o oVar) {
        return oVar.f12065r != null ? 1 : 0;
    }

    @Override // h2.n
    public h e(k kVar, t1.o oVar) {
        if (oVar.f12065r == null) {
            return null;
        }
        return new q(new h2.g(new z(), 6001));
    }

    @Override // b8.c
    public int g(Context context, String str) {
        return f.a(context, str);
    }

    @Override // ab.g
    public d i(a0 a0Var, JSONObject jSONObject) {
        return p(a0Var);
    }

    @Override // com.bumptech.glide.manager.g
    public void j(com.bumptech.glide.manager.h hVar) {
        hVar.k();
    }

    @Override // j6.d0
    public void k(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // bb.a
    public StackTraceElement[] m(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // h2.n
    public /* synthetic */ m n(k kVar, t1.o oVar) {
        return m.f6098n;
    }

    @Override // j6.d0
    public void o(MediaExtractor mediaExtractor, Object obj) throws IOException {
        mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // w6.a
    public Object q() {
        try {
            return new e6.g(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e7) {
            throw new RuntimeException(e7);
        }
    }

    public b() {
        this.f10086v = 6;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    public b(sc.b bVar, q0 q0Var) {
        this.f10086v = 9;
    }

    @Override // j6.o
    public void D() {
    }

    @Override // h2.n
    public /* synthetic */ void h() {
    }

    @Override // h2.n
    public /* synthetic */ void release() {
    }

    @Override // com.bumptech.glide.manager.g
    public void l(com.bumptech.glide.manager.h hVar) {
    }

    @Override // h2.n
    public void d(Looper looper, d2.l lVar) {
    }

    @Override // j6.o
    public void f(Bitmap bitmap, d6.a aVar) {
    }
}

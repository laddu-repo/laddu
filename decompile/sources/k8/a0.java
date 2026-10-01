package k8;

import android.os.SystemClock;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.u5;
import com.google.android.gms.internal.measurement.y4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements w, r3.g, s2.k, t3.k, ua.c {
    public static a0 M;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7348v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ a0 f7344w = new a0(0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ a0 f7345x = new a0(1);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ a0 f7346y = new a0(2);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ a0 f7347z = new a0(3);
    public static final /* synthetic */ a0 A = new a0(4);
    public static final /* synthetic */ a0 B = new a0(5);
    public static final /* synthetic */ a0 C = new a0(6);
    public static final /* synthetic */ a0 D = new a0(7);
    public static final /* synthetic */ a0 E = new a0(8);
    public static final /* synthetic */ a0 F = new a0(9);
    public static final /* synthetic */ a0 G = new a0(10);
    public static final /* synthetic */ a0 H = new a0(11);
    public static final /* synthetic */ a0 I = new a0(12);
    public static final /* synthetic */ a0 J = new a0(13);
    public static final /* synthetic */ a0 K = new a0(14);
    public static final /* synthetic */ a0 L = new a0(15);

    public /* synthetic */ a0(int i) {
        this.f7348v = i;
    }

    @Override // k8.w
    public Object a() {
        switch (this.f7348v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                List list = f0.f7479a;
                com.google.android.gms.internal.measurement.q4.f3007w.get();
                return (String) com.google.android.gms.internal.measurement.s4.f3073a.i(5, "measurement.test.string_flag", "---").get();
            case 1:
                List list2 = f0.f7479a;
                com.google.android.gms.internal.measurement.q4.f3007w.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.s4.f3073a.g(3, -2L, "measurement.test.int_flag").get()).longValue());
            case 2:
                List list3 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.g3.f2655a.g(19, 500L, "measurement.upload.max_event_parameter_value_length").get()).longValue());
            case 3:
                List list4 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.g3.f2655a.g(67, 100L, "measurement.upload.max_bundles").get()).longValue());
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                List list5 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return (String) com.google.android.gms.internal.measurement.g3.f2655a.i(56, "measurement.rb.attribution.uri_authority", "google-analytics.com").get();
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                List list6 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return (String) com.google.android.gms.internal.measurement.g3.f2655a.i(80, "measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot").get();
            case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                List list7 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return (Long) com.google.android.gms.internal.measurement.g3.f2655a.g(57, 864000000L, "measurement.rb.attribution.max_queue_time").get();
            case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                List list8 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.g3.f2655a.g(24, 1000L, "measurement.rb.max_trigger_registrations_per_day").get()).longValue());
            case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                List list9 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return (Boolean) com.google.android.gms.internal.measurement.g3.f2655a.b("measurement.config.default_flag_values", true, 10).get();
            case 9:
                List list10 = f0.f7479a;
                return (Boolean) com.google.android.gms.internal.measurement.c4.f2531a.get();
            case 10:
                List list11 = f0.f7479a;
                return (Boolean) u5.f3128a.get();
            case 11:
                List list12 = f0.f7479a;
                return (Boolean) h5.f2682a.get();
            case 12:
                List list13 = f0.f7479a;
                com.google.android.gms.internal.measurement.t4.f3103w.get();
                return (Boolean) com.google.android.gms.internal.measurement.v4.f3159a.b("measurement.rb.attribution.client2", true, 1).get();
            case 13:
                List list14 = f0.f7479a;
                return (Boolean) y4.f3243a.get();
            case 14:
                List list15 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.g3.f2655a.g(71, 100000L, "measurement.upload.max_events_per_day").get()).longValue());
            default:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.p4.f2976a.get()).booleanValue());
        }
    }

    @Override // s2.k
    public void c() {
        synchronized (t2.b.f12187a) {
            Object obj = t2.b.f12188b;
            synchronized (obj) {
                if (t2.b.f12189c) {
                    return;
                }
                long jA = t2.b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    t2.b.f12190d = jA;
                    t2.b.f12189c = true;
                }
            }
        }
    }

    @Override // r3.g
    public w2.a0 d() {
        return new w2.s(-9223372036854775807L);
    }

    @Override // t3.k
    public int e(t1.o oVar) {
        return 1;
    }

    @Override // t3.k
    public t3.m f(t1.o oVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // ua.c
    public String g() {
        return null;
    }

    @Override // r3.g
    public long h(w2.p pVar) {
        return -1L;
    }

    @Override // t3.k
    public boolean i(t1.o oVar) {
        return false;
    }

    @Override // ua.c
    public void b() {
    }

    @Override // s2.k
    public void j() {
    }

    @Override // r3.g
    public void l(long j8) {
    }

    @Override // ua.c
    public void k(String str, long j8) {
    }
}

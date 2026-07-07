package hb;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import androidx.lifecycle.j1;
import com.google.android.gms.internal.measurement.n0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import n9.c1;
import n9.c3;
import n9.d1;
import n9.e4;
import n9.f3;
import n9.g3;
import n9.h0;
import n9.h3;
import n9.k3;
import n9.m0;
import n9.m2;
import n9.n1;
import n9.t3;
import n9.u0;
import n9.u2;
import n9.z1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6031x;

    /* renamed from: y, reason: collision with root package name */
    public Object f6032y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f6033z;

    public /* synthetic */ s(int i6, Object obj, Object obj2) {
        this.f6031x = i6;
        this.f6032y = obj;
        this.f6033z = obj2;
    }

    private final void a() {
        m2 m2Var = (m2) this.f6033z;
        n1 n1Var = (n1) m2Var.f4301y;
        c1 c1Var = n1Var.B;
        u0 u0Var = n1Var.C;
        n1.e(c1Var);
        c1Var.d1();
        c1Var.d1();
        n9.q b10 = n9.q.b(c1Var.h1().getString("dma_consent_settings", null));
        n9.q qVar = (n9.q) this.f6032y;
        int i6 = qVar.f9439a;
        if (z1.l(i6, b10.f9439a)) {
            SharedPreferences.Editor edit = c1Var.h1().edit();
            edit.putString("dma_consent_settings", qVar.f9440b);
            edit.apply();
            n1.g(u0Var);
            u0Var.L.b(qVar, "Setting DMA consent(FE)");
            n1 n1Var2 = (n1) m2Var.f4301y;
            if (n1Var2.j().n1()) {
                h3 j = n1Var2.j();
                j.d1();
                j.e1();
                j.r1(new f3(j, 1));
                return;
            }
            h3 j10 = n1Var2.j();
            j10.d1();
            j10.e1();
            if (j10.m1()) {
                j10.r1(new c3(j10, j10.t1(false)));
                return;
            }
            return;
        }
        n1.g(u0Var);
        u0Var.J.b(Integer.valueOf(i6), "Lower precedence consent source ignored, proposed source");
    }

    private final void b() {
        boolean contains;
        m2 m2Var = (m2) this.f6032y;
        m2Var.d1();
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        List<t3> list = (List) this.f6033z;
        c1 c1Var = ((n1) m2Var.f4301y).B;
        n1.e(c1Var);
        SparseArray j12 = c1Var.j1();
        for (t3 t3Var : list) {
            int i6 = t3Var.f9491z;
            contains = j12.contains(i6);
            if (!contains || ((Long) j12.get(i6)).longValue() < t3Var.f9490y) {
                m2Var.A1().add(t3Var);
            }
        }
        m2Var.B1();
    }

    private final void c() {
        n1 n1Var = (n1) ((m2) this.f6032y).f4301y;
        m0 l10 = n1Var.l();
        String str = (String) this.f6033z;
        String str2 = l10.O;
        boolean z10 = false;
        if (str2 != null && !str2.equals(str)) {
            z10 = true;
        }
        l10.O = str;
        if (z10) {
            n1Var.l().i1();
        }
    }

    private final void d() {
        h3 h3Var = (h3) this.f6033z;
        h0 h0Var = h3Var.B;
        n1 n1Var = (n1) h3Var.f4301y;
        if (h0Var == null) {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.D.a("Failed to send current screen to service");
            return;
        }
        try {
            u2 u2Var = (u2) this.f6032y;
            if (u2Var == null) {
                h0Var.n(0L, null, null, n1Var.f9413x.getPackageName());
            } else {
                h0Var.n(u2Var.f9496c, u2Var.f9494a, u2Var.f9495b, n1Var.f9413x.getPackageName());
            }
            h3Var.q1();
        } catch (RemoteException e10) {
            u0 u0Var2 = ((n1) h3Var.f4301y).C;
            n1.g(u0Var2);
            u0Var2.D.b(e10, "Failed to send current screen to the service");
        }
    }

    private final void e() {
        h3 h3Var = ((g3) this.f6033z).f9330z;
        h3Var.B = null;
        if (((t8.b) this.f6032y).f12629y == 7777) {
            if (h3Var.E == null) {
                h3Var.E = Executors.newScheduledThreadPool(1);
            }
            h3Var.E.schedule(new a1.e(this, 11), ((Long) n9.e0.f9227a0.a(null)).longValue(), TimeUnit.MILLISECONDS);
            return;
        }
        h3Var.s1();
    }

    private final void f() {
        e4 e4Var = (e4) this.f6032y;
        e4Var.w();
        Runnable runnable = (Runnable) this.f6033z;
        e4Var.D().d1();
        if (e4Var.M == null) {
            e4Var.M = new ArrayList();
        }
        e4Var.M.add(runnable);
        e4Var.l();
    }

    private final /* synthetic */ void g() {
        u5.r rVar = (u5.r) this.f6032y;
        JobParameters jobParameters = (JobParameters) this.f6033z;
        Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((k3) ((Service) rVar.f12916y)).c(jobParameters);
    }

    private final void h() {
        Context context = (Context) this.f6032y;
        s9.h hVar = (s9.h) this.f6033z;
        try {
            o9.a.c(context);
            hVar.a(null);
        } catch (Exception e10) {
            hVar.f12263a.l(e10);
        }
    }

    private final void i() {
        ((pf.e) ((pf.f) this.f6032y)).g((pf.b) this.f6033z, he.y.f6101a);
    }

    private final void j() {
        u5.r rVar = (u5.r) this.f6032y;
        Typeface typeface = (Typeface) this.f6033z;
        k0.b bVar = (k0.b) rVar.f12916y;
        if (bVar != null) {
            bVar.i(typeface);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:87|(1:89)(7:340|341|342|(1:344)(2:367|(1:369))|345|346|(27:348|(1:350)(1:363)|351|352|353|354|355|356|91|(2:93|(2:95|(2:97|(2:99|(2:101|(2:103|(1:105)(1:333))(1:334))(1:335))(1:336))(1:337))(1:338))(1:339)|106|107|108|(1:110)(1:330)|111|(1:113)|115|116|(1:118)(2:327|(8:329|(3:320|321|(6:323|(5:123|(1:125)(3:311|(3:314|(1:316)(1:317)|312)|318)|(1:127)(1:310)|128|(9:130|(1:132)(1:307)|133|(1:135)|136|(1:138)(1:306)|139|(1:141)|(34:304|143|(1:145)(2:299|(1:301)(1:302))|146|(1:148)|149|(3:295|296|(18:298|(1:165)(1:294)|166|(1:168)|169|(2:272|(2:278|(2:285|(2:286|(1:293)(2:288|(2:290|291)(1:292)))))(1:277))(1:173)|174|(3:268|(1:270)|271)|178|(1:180)|181|(1:185)|186|(3:188|(7:190|(1:192)(1:224)|193|(1:195)|196|(4:200|(1:202)|203|(1:205))|206)(1:225)|207)(10:226|(4:228|(2:231|(6:233|(1:235)(1:265)|236|(1:238)|239|240))|266|240)(1:267)|241|(1:243)|244|245|246|247|248|(5:250|(1:252)(1:260)|(1:256)|(1:258)|259))|208|(3:210|(1:212)(1:221)|(5:214|(1:216)|217|(1:219)|220))|222|223))(1:152)|153|(1:162)|163|(0)(0)|166|(0)|169|(1:171)|272|(1:275)|278|(4:281|283|285|(3:286|(0)(0)|292))|174|(1:176)|268|(0)|271|178|(0)|181|(2:183|185)|186|(0)(0)|208|(0)|222|223)(33:305|149|(0)|295|296|(0)|153|(1:162)|163|(0)(0)|166|(0)|169|(0)|272|(0)|278|(0)|174|(0)|268|(0)|271|178|(0)|181|(0)|186|(0)(0)|208|(0)|222|223))(2:308|309))|319|(0)(0)|128|(0)(0)))|121|(0)|319|(0)(0)|128|(0)(0)))|119|(0)|121|(0)|319|(0)(0)|128|(0)(0))(1:364))|90|91|(0)(0)|106|107|108|(0)(0)|111|(0)|115|116|(0)(0)|119|(0)|121|(0)|319|(0)(0)|128|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0541, code lost:
    
        if (r3.z1() == 1) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x03b0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x03b1, code lost:
    
        n9.n1.g(r12);
        r12.D.c(n9.u0.l1(r6), r0, "Fetching Google App Id failed with exception. appId");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03a0 A[Catch: IllegalStateException -> 0x03b0, TRY_LEAVE, TryCatch #0 {IllegalStateException -> 0x03b0, blocks: (B:108:0x038e, B:111:0x039c, B:113:0x03a0), top: B:107:0x038e }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0696 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x06ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x09c6  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x03f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0c29  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0318  */
    /* JADX WARN: Type inference failed for: r0v120, types: [n9.g0, n9.r2, e3.e] */
    /* JADX WARN: Type inference failed for: r0v129, types: [n9.l2] */
    /* JADX WARN: Type inference failed for: r2v39, types: [n9.u1, n9.r] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 3202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.s.run():void");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, j4.b0] */
    public String toString() {
        switch (this.f6031x) {
            case 0:
                j1 j1Var = new j1(s.class.getSimpleName(), 6);
                r rVar = (r) this.f6033z;
                ?? obj = new Object();
                ((j4.b0) j1Var.A).f7159y = obj;
                j1Var.A = obj;
                obj.f7158x = rVar;
                return j1Var.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ s(Object obj, Object obj2, int i6, boolean z10) {
        this.f6031x = i6;
        this.f6033z = obj;
        this.f6032y = obj2;
    }

    public s(d1 d1Var, com.google.android.gms.internal.measurement.c0 c0Var, d1 d1Var2) {
        this.f6031x = 12;
        this.f6032y = c0Var;
        this.f6033z = d1Var;
    }

    public s(m2 m2Var, n0 n0Var) {
        this.f6031x = 15;
        this.f6032y = n0Var;
        Objects.requireNonNull(m2Var);
        this.f6033z = m2Var;
    }

    public s(h3 h3Var, u2 u2Var) {
        this.f6031x = 21;
        this.f6032y = u2Var;
        Objects.requireNonNull(h3Var);
        this.f6033z = h3Var;
    }

    public s(u5.r rVar, e4 e4Var, Runnable runnable) {
        this.f6031x = 24;
        this.f6032y = e4Var;
        this.f6033z = runnable;
    }
}

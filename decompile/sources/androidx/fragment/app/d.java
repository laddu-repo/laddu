package androidx.fragment.app;

import android.app.job.JobParameters;
import android.graphics.Typeface;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c2.l1;
import c2.q1;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.material.tabs.TabLayout;
import com.google.common.util.concurrent.ListenableFuture;
import com.livxow.tv.activities.MainActivity;
import com.livxow.tv.app.App;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import k8.k2;
import k8.k4;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f997v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f998w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f999x;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.f997v = i;
        this.f998w = obj;
        this.f999x = obj2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:126:0x020b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    private final void a() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.d.a():void");
    }

    private final void b() {
        k2 k2Var = (k2) this.f998w;
        synchronized (((c2.g) this.f999x)) {
        }
        e2.i iVar = (e2.i) k2Var.f7603x;
        int i = w1.b0.f13686a;
        d2.f fVar = ((c2.g0) iVar).f1743v.O;
        fVar.S(fVar.O((o2.d0) fVar.f3989y.f), 1013, new d2.b(9));
    }

    private final void c() {
        mb.a aVar;
        ma.q qVar = (ma.q) this.f998w;
        mb.b bVar = (mb.b) this.f999x;
        if (qVar.f8566b != ma.q.f8564d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (qVar) {
            aVar = qVar.f8565a;
            qVar.f8565a = null;
            qVar.f8566b = bVar;
        }
        aVar.f(bVar);
    }

    private final void d() {
        ma.o oVar = (ma.o) this.f998w;
        mb.b bVar = (mb.b) this.f999x;
        synchronized (oVar) {
            try {
                if (oVar.f8561b == null) {
                    oVar.f8560a.add(bVar);
                } else {
                    oVar.f8561b.add(bVar.get());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        long j8;
        boolean z2;
        jd.k kVar;
        cf.h hVar;
        fd.c cVar;
        final int i = 1;
        final int i10 = 0;
        switch (this.f997v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ArrayList arrayList = (ArrayList) this.f998w;
                c1 c1Var = (c1) this.f999x;
                if (arrayList.contains(c1Var)) {
                    arrayList.remove(c1Var);
                    View view = c1Var.f992c.f1135b0;
                    int i11 = c1Var.f990a;
                    de.i.d(view, "view");
                    j4.a.a(view, i11);
                    return;
                }
                return;
            case 1:
                h.j jVar = (h.j) this.f998w;
                jVar.f6012v.a(new c.d((c.a0) this.f999x, jVar));
                return;
            case 2:
                c2.j0 j0Var = (c2.j0) this.f998w;
                c2.o0 o0Var = (c2.o0) this.f999x;
                int i12 = j0Var.f1783e0 - o0Var.f1871b;
                j0Var.f1783e0 = i12;
                if (o0Var.f1873d) {
                    j0Var.f1784f0 = o0Var.f1874e;
                    j0Var.f1785g0 = true;
                }
                if (i12 == 0) {
                    t1.s0 s0Var = ((l1) o0Var.f).f1840a;
                    if (!j0Var.E0.f1840a.p() && s0Var.p()) {
                        j0Var.F0 = -1;
                        j0Var.G0 = 0L;
                    }
                    if (!s0Var.p()) {
                        List listAsList = Arrays.asList(((q1) s0Var).f1899h);
                        w1.a.j(listAsList.size() == j0Var.L.size());
                        for (int i13 = 0; i13 < listAsList.size(); i13++) {
                            ((c2.i0) j0Var.L.get(i13)).f1773b = (t1.s0) listAsList.get(i13);
                        }
                    }
                    long j9 = -9223372036854775807L;
                    if (j0Var.f1785g0) {
                        if (((l1) o0Var.f).f1841b.equals(j0Var.E0.f1841b) && ((l1) o0Var.f).f1843d == j0Var.E0.f1856s) {
                            i = 0;
                        }
                        if (i != 0) {
                            if (s0Var.p() || ((l1) o0Var.f).f1841b.b()) {
                                j9 = ((l1) o0Var.f).f1843d;
                            } else {
                                l1 l1Var = (l1) o0Var.f;
                                o2.d0 d0Var = l1Var.f1841b;
                                long j10 = l1Var.f1843d;
                                Object obj = d0Var.f9404a;
                                t1.q0 q0Var = j0Var.K;
                                s0Var.g(obj, q0Var);
                                j9 = j10 + q0Var.f12090e;
                            }
                        }
                        j8 = j9;
                        z2 = i;
                    } else {
                        j8 = -9223372036854775807L;
                        z2 = 0;
                    }
                    j0Var.f1785g0 = false;
                    j0Var.o0((l1) o0Var.f, 1, z2, j0Var.f1784f0, j8, -1, false);
                    return;
                }
                return;
            case 3:
                ad.e eVar = (ad.e) this.f998w;
                cd.a aVar = (cd.a) this.f999x;
                try {
                    Thread.currentThread().setName(eVar.f484w + "-" + eVar.f483v);
                    break;
                } catch (Exception unused) {
                }
                int i14 = 2;
                try {
                    try {
                        cd.b bVarD = aVar.D(eVar);
                        synchronized (aVar.E) {
                            if (aVar.I.containsKey(Integer.valueOf(eVar.f483v))) {
                                bVarD.c0(new fd.a(aVar.f2292y, (ed.o) aVar.A.i));
                                aVar.I.put(Integer.valueOf(eVar.f483v), bVarD);
                                aVar.f2293z.a(eVar.f483v, bVarD);
                                aVar.f2290w.b("DownloadManager starting download " + eVar);
                            } else {
                                i = 0;
                            }
                            break;
                        }
                        if (i != 0) {
                            bVarD.run();
                        }
                        aVar.G(eVar);
                        aVar.D.o();
                        aVar.G(eVar);
                        cVar = aVar.G;
                    } catch (Exception e7) {
                        aVar.f2290w.c("DownloadManager failed to start download " + eVar, e7);
                        aVar.G(eVar);
                        fd.c cVar2 = aVar.G;
                        if (cVar2 == null) {
                            return;
                        }
                        kVar = cVar2.f5386v;
                        hVar = new cf.h(i14, cVar2, "LibGlobalFetchLib");
                    }
                    if (cVar != null) {
                        kVar = cVar.f5386v;
                        hVar = new cf.h(i14, cVar, "LibGlobalFetchLib");
                        kVar.d(hVar);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    aVar.G(eVar);
                    fd.c cVar3 = aVar.G;
                    if (cVar3 != null) {
                        cVar3.f5386v.d(new cf.h(i14, cVar3, "LibGlobalFetchLib"));
                    }
                    throw th;
                }
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                a();
                return;
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                ((d2.k) this.f998w).f4007d.reportTrackChangeEvent((TrackChangeEvent) this.f999x);
                return;
            case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                ((d2.k) this.f998w).f4007d.reportNetworkEvent((NetworkEvent) this.f999x);
                return;
            case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                ((d2.k) this.f998w).f4007d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.f999x);
                return;
            case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                ((d2.k) this.f998w).f4007d.reportPlaybackMetrics((PlaybackMetrics) this.f999x);
                return;
            case 9:
                ((d2.k) this.f998w).f4007d.reportPlaybackStateEvent((PlaybackStateEvent) this.f999x);
                return;
            case 10:
                ((da.e0) this.f998w).t((ListenableFuture) this.f999x);
                return;
            case 11:
                ((da.e0) this.f998w).q((y9.a0) this.f999x);
                return;
            case 12:
                b();
                return;
            case 13:
                ((e2.m) this.f998w).j((e2.j) this.f999x);
                return;
            case 14:
                ed.d dVar = (ed.d) this.f999x;
                ArrayList arrayList2 = (ArrayList) this.f998w;
                ArrayList arrayList3 = new ArrayList(pd.l.C(arrayList2, 10));
                int size = arrayList2.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj2 = arrayList2.get(i15);
                    i15++;
                    od.f fVar = (od.f) obj2;
                    ad.e eVar2 = (ad.e) fVar.f10116v;
                    zc.k kVar2 = new zc.k(eVar2.f485x, eVar2.f486y);
                    kVar2.f14909w = eVar2.f487z;
                    kVar2.f14910x.putAll(eVar2.B);
                    zc.g gVar = eVar2.G;
                    de.i.e(gVar, "<set-?>");
                    kVar2.f14912z = gVar;
                    zc.h hVar2 = eVar2.A;
                    de.i.e(hVar2, "<set-?>");
                    kVar2.f14911y = hVar2;
                    zc.a aVar2 = eVar2.J;
                    de.i.e(aVar2, "<set-?>");
                    kVar2.B = aVar2;
                    kVar2.f14908v = eVar2.K;
                    kVar2.C = eVar2.L;
                    jd.g gVar2 = eVar2.M;
                    de.i.e(gVar2, "value");
                    kVar2.E = new jd.g(pd.s.T(gVar2.f7084v));
                    int i16 = eVar2.N;
                    if (i16 < 0) {
                        throw new IllegalArgumentException("The maximum number of attempts has to be greater than -1");
                    }
                    kVar2.D = i16;
                    arrayList3.add(new od.f(kVar2, fVar.f10117w));
                }
                ed.g gVar3 = (ed.g) dVar.f4875w;
                final ma.p pVar = (ma.p) dVar.f4876x;
                final ma.p pVar2 = (ma.p) dVar.f4877y;
                ArrayList arrayList4 = arrayList3;
                de.i.e(arrayList4, "result");
                if (arrayList4.isEmpty()) {
                    ((Handler) gVar3.f4885b).post(new ed.b(pVar));
                    return;
                }
                final od.f fVar2 = (od.f) pd.j.E(arrayList4);
                if (fVar2.f10117w != zc.b.f14880y) {
                    ((Handler) gVar3.f4885b).post(new Runnable(pVar, fVar2, i10) { // from class: ed.f

                        /* JADX INFO: renamed from: v, reason: collision with root package name */
                        public final /* synthetic */ int f4882v;

                        /* JADX INFO: renamed from: w, reason: collision with root package name */
                        public final /* synthetic */ od.f f4883w;

                        {
                            this.f4882v = i10;
                            this.f4883w = fVar2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (this.f4882v) {
                                case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                    break;
                                default:
                                    break;
                            }
                        }
                    });
                    return;
                } else {
                    ((Handler) gVar3.f4885b).post(new Runnable(pVar2, fVar2, i) { // from class: ed.f

                        /* JADX INFO: renamed from: v, reason: collision with root package name */
                        public final /* synthetic */ int f4882v;

                        /* JADX INFO: renamed from: w, reason: collision with root package name */
                        public final /* synthetic */ od.f f4883w;

                        {
                            this.f4882v = i;
                            this.f4883w = fVar2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (this.f4882v) {
                                case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                    break;
                                default:
                                    break;
                            }
                        }
                    });
                    return;
                }
            case 15:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f998w;
                JobParameters jobParameters = (JobParameters) this.f999x;
                int i17 = JobInfoSchedulerService.f2449v;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 16:
                ((App) this.f999x).O = ((FrameLayout) ((MainActivity) this.f998w).W.f9255x).getHeight();
                return;
            case 17:
                h.o oVar = (h.o) this.f998w;
                Runnable runnable = (Runnable) this.f999x;
                oVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    oVar.b();
                }
            case 18:
                h2.e eVar3 = (h2.e) this.f998w;
                t1.o oVar2 = (t1.o) this.f999x;
                h2.f fVar3 = eVar3.f6083y;
                if (fVar3.J == 0 || eVar3.f6082x) {
                    return;
                }
                Looper looper = fVar3.N;
                looper.getClass();
                eVar3.f6081w = fVar3.a(looper, eVar3.f6080v, oVar2, false);
                fVar3.H.add(eVar3);
                return;
            case 19:
                ((j2.b) ((i2.k) ((i2.q) this.f998w).f6442x.f11493v).f6395w.f6659y.get(((i2.j) this.f999x).H)).c(true);
                return;
            case 20:
                j2.b bVar = (j2.b) this.f998w;
                Uri uri = (Uri) this.f999x;
                bVar.D = false;
                bVar.d(uri);
                return;
            case 21:
                ((k0.b) this.f998w).i((Typeface) this.f999x);
                return;
            case 22:
                mc.j jVar2 = (mc.j) this.f998w;
                pc.c cVar4 = (pc.c) this.f999x;
                mc.k kVar3 = jVar2.f8596v;
                kVar3.f8600z0.remove(cVar4);
                kVar3.f8599y0.g(kVar3.f8600z0);
                if (kVar3.f8600z0.isEmpty()) {
                    kVar3.f8598x0.f7020a.setVisibility(0);
                    return;
                }
                return;
            case 23:
                c();
                return;
            case 24:
                d();
                return;
            case 25:
                mc.g gVar4 = (mc.g) this.f998w;
                StringBuilder sb2 = (StringBuilder) this.f999x;
                gVar4.getClass();
                gVar4.a0(sb2.toString());
                return;
            case 26:
                ((TabLayout) ((mc.g) this.f998w).f8587x0.f2892g).i((s9.g) this.f999x, true);
                return;
            case 27:
                mc.k kVar4 = (mc.k) this.f998w;
                List<sc.c> list = (List) this.f999x;
                kVar4.f8598x0.f7022c.setRefreshing(false);
                if (list == null || list.isEmpty()) {
                    kVar4.f8598x0.f7020a.setVisibility(0);
                }
                ArrayList arrayList5 = new ArrayList();
                if (list != null) {
                    for (sc.c cVar5 : list) {
                        pc.c cVar6 = new pc.c();
                        String str = cVar5.f11792e;
                        String str2 = cVar5.f11789b;
                        boolean zIsEmpty = TextUtils.isEmpty(str);
                        String string = cVar5.f11791d;
                        if (!zIsEmpty) {
                            try {
                                JSONObject jSONObject = new JSONArray(string).getJSONObject(0);
                                jSONObject.put("playlist", cVar5.f11792e);
                                jSONObject.put("channel", str2);
                                string = new JSONArray().put(jSONObject).toString();
                                break;
                            } catch (ArrayIndexOutOfBoundsException | JSONException unused2) {
                            }
                        }
                        cVar6.f10487a = str2;
                        cVar6.f10488b = cVar5.f11790c;
                        cVar6.f10489c = string;
                        cVar6.f10490d = !zIsEmpty ? "m3u" : "custom";
                        arrayList5.add(cVar6);
                    }
                }
                kVar4.f8600z0 = arrayList5;
                if (arrayList5.isEmpty()) {
                    kVar4.f8598x0.f7020a.setVisibility(0);
                    return;
                }
                kVar4.f8598x0.f7020a.setVisibility(8);
                hc.e eVar4 = kVar4.f8599y0;
                if (eVar4 != null) {
                    eVar4.g(kVar4.f8600z0);
                    kVar4.f8598x0.f7021b.j0(0);
                    return;
                }
                hc.e eVar5 = new hc.e(kVar4.H(), kVar4.f8600z0);
                kVar4.f8599y0 = eVar5;
                eVar5.f6216h = new mc.j(kVar4);
                kVar4.f8598x0.f7021b.setAdapter(eVar5);
                RecyclerView recyclerView = kVar4.f8598x0.f7021b;
                kVar4.I();
                recyclerView.setLayoutManager(new GridLayoutManager(kVar4.R() ? 8 : 4));
                App app = kVar4.f8597w0;
                if (app != null) {
                    app.a(kVar4.f8598x0.f7021b);
                    return;
                }
                return;
            case 28:
                na.a aVar3 = (na.a) this.f998w;
                Runnable runnable2 = (Runnable) this.f999x;
                Process.setThreadPriority(aVar3.f9043c);
                StrictMode.ThreadPolicy threadPolicy = aVar3.f9044d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            default:
                Callable callable = (Callable) this.f998w;
                na.g gVar5 = (na.g) ((k4) this.f999x).f7607v;
                try {
                    gVar5.j(callable.call());
                    return;
                } catch (Exception e10) {
                    gVar5.k(e10);
                    return;
                }
        }
    }

    public /* synthetic */ d(da.e0 e0Var, int i, ListenableFuture listenableFuture) {
        this.f997v = 10;
        this.f998w = e0Var;
        this.f999x = listenableFuture;
    }

    public /* synthetic */ d(ed.d dVar, ArrayList arrayList) {
        this.f997v = 14;
        this.f999x = dVar;
        this.f998w = arrayList;
    }

    public /* synthetic */ d(ArrayList arrayList, c1 c1Var, l lVar) {
        this.f997v = 0;
        this.f998w = arrayList;
        this.f999x = c1Var;
    }

    public /* synthetic */ d(mc.j jVar, boolean z2, pc.c cVar) {
        this.f997v = 22;
        this.f998w = jVar;
        this.f999x = cVar;
    }
}

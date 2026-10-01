package androidx.lifecycle;

import a2.a2;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.location.LocationManager;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.text.Editable;
import android.text.Selection;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.gms.internal.measurement.k4;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import gf.b2;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.Adler32;
import okhttp3.HttpUrl;
import p.q3;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j1 implements v3.d, f2.p, f4.b0, i8.b, h6.a, kf.h {
    public static j1 B;
    public Object A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f948x;

    /* renamed from: y, reason: collision with root package name */
    public Object f949y;

    /* renamed from: z, reason: collision with root package name */
    public Object f950z;

    public j1(int i6) {
        this.f948x = i6;
        switch (i6) {
            case 7:
                this.f949y = new com.google.android.gms.internal.measurement.b(HttpUrl.FRAGMENT_ENCODE_SET, 0L, null);
                this.f950z = new com.google.android.gms.internal.measurement.b(HttpUrl.FRAGMENT_ENCODE_SET, 0L, null);
                this.A = new ArrayList();
                return;
            case 14:
                this.f949y = new Object();
                return;
            case 16:
                return;
            case 25:
                j2.l lVar = j2.l.f7088x;
                this.f949y = new HashSet();
                this.f950z = lVar;
                return;
            default:
                this.f950z = new ArrayDeque();
                this.A = null;
                this.f949y = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [o5.e0, java.lang.Object] */
    public static f2.g i(r1.y yVar) {
        String uri;
        d0.g gVar = new d0.g();
        Uri uri2 = yVar.f11752b;
        byte[] bArr = null;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        a2.c cVar = new a2.c(uri, yVar.f11756f, gVar);
        db.n0 n0Var = yVar.f11753c;
        db.p0 p0Var = n0Var.f4021x;
        if (p0Var == null) {
            p0Var = n0Var.b();
            n0Var.f4021x = p0Var;
        }
        db.q1 it = p0Var.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) cVar.A)) {
                ((HashMap) cVar.A).put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        UUID uuid = r1.g.f11399a;
        ?? obj = new Object();
        UUID uuid2 = yVar.f11751a;
        uuid2.getClass();
        boolean z10 = yVar.f11754d;
        boolean z11 = yVar.f11755e;
        int[] U = a8.f.U(yVar.f11757g);
        for (int i6 : U) {
            boolean z12 = true;
            if (i6 != 2 && i6 != 1) {
                z12 = false;
            }
            u1.c.b(z12);
        }
        f2.g gVar2 = new f2.g(uuid2, cVar, hashMap, z10, (int[]) U.clone(), z11, obj);
        byte[] bArr2 = yVar.f11758h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        }
        u1.c.g(gVar2.I.isEmpty());
        gVar2.R = bArr;
        return gVar2;
    }

    public static boolean j(Editable editable, KeyEvent keyEvent, boolean z10) {
        e1.x[] xVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (xVarArr = (e1.x[]) editable.getSpans(selectionStart, selectionEnd, e1.x.class)) != null && xVarArr.length > 0) {
                for (e1.x xVar : xVarArr) {
                    int spanStart = editable.getSpanStart(xVar);
                    int spanEnd = editable.getSpanEnd(xVar);
                    if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void A(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f949y;
        workDatabase_Impl.b();
        e6.e eVar = (e6.e) this.A;
        i5.j a10 = eVar.a();
        if (str == null) {
            a10.c(1);
        } else {
            a10.i(1, str);
        }
        workDatabase_Impl.c();
        try {
            a10.d();
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.h();
            eVar.c(a10);
        }
    }

    public void B(g8.i iVar, int i6, boolean z10) {
        Long l10;
        char c10;
        m8.a aVar = (m8.a) this.A;
        Context context = (Context) this.f949y;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f5539a;
        String str2 = iVar.f5539a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        d8.d dVar = iVar.f5541c;
        adler32.update(allocate.putInt(q8.a.a(dVar)).array());
        byte[] bArr = iVar.f5540b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i10 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i10 >= i6) {
                        a8.f.K("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", iVar);
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((n8.g) ((n8.d) this.f950z)).d().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(q8.a.a(dVar))});
        try {
            if (rawQuery.moveToNext()) {
                l10 = Long.valueOf(rawQuery.getLong(0));
            } else {
                l10 = 0L;
            }
            rawQuery.close();
            long longValue = l10.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(dVar, longValue, i6));
            Set set = ((m8.b) aVar.f8704b.get(dVar)).f8707c;
            if (set.contains(m8.d.f8711x)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(m8.d.f8713z)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(m8.d.f8712y)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i6);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, q8.a.a(dVar));
            if (bArr != null) {
                c10 = 0;
                persistableBundle.putString(HandleInvocationsFromAdViewer.KEY_EXTRAS, Base64.encodeToString(bArr, 0));
            } else {
                c10 = 0;
            }
            builder.setExtras(persistableBundle);
            Integer valueOf = Integer.valueOf(value);
            Long valueOf2 = Long.valueOf(aVar.a(dVar, longValue, i6));
            Integer valueOf3 = Integer.valueOf(i6);
            Object[] objArr = new Object[5];
            objArr[c10] = iVar;
            objArr[1] = valueOf;
            objArr[2] = valueOf2;
            objArr[3] = l10;
            objArr[4] = valueOf3;
            String Q = a8.f.Q("JobInfoScheduler");
            if (Log.isLoggable(Q, 3)) {
                Log.d(Q, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.lifecycle.d, java.lang.Object] */
    public void C(d8.a aVar) {
        com.unity3d.ads.adplayer.b bVar = new com.unity3d.ads.adplayer.b(9);
        g8.r rVar = (g8.r) this.A;
        g8.i iVar = (g8.i) this.f949y;
        d8.c cVar = (d8.c) this.f950z;
        l8.b bVar2 = rVar.f5558c;
        j1 a10 = g8.i.a();
        a10.E(iVar.f5539a);
        a10.A = d8.d.f3973x;
        a10.f950z = iVar.f5540b;
        g8.i g10 = a10.g();
        ?? obj = new Object();
        obj.f901f = new HashMap();
        obj.f899d = Long.valueOf(rVar.f5556a.f());
        obj.f900e = Long.valueOf(rVar.f5557b.f());
        obj.f896a = "FCM_CLIENT_EVENT_LOGGING";
        kc.e eVar = aVar.f3969a;
        n9.j jVar = ic.p.f6775a;
        jVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            jVar.o(eVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        obj.f898c = new g8.m(cVar, byteArrayOutputStream.toByteArray());
        obj.f897b = null;
        l8.a aVar2 = (l8.a) bVar2;
        aVar2.f8312b.execute(new a2.e1(aVar2, g10, bVar, obj.d()));
    }

    public void D(int i6) {
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.A;
        if (loudnessCodecController != null) {
            j2.a.b(loudnessCodecController);
            this.A = null;
        }
        LoudnessCodecController a10 = j2.a.a(i6, new j2.k(this));
        this.A = a10;
        Iterator it = ((HashSet) this.f949y).iterator();
        while (it.hasNext()) {
            if (!j2.a.e(a10, (MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public void E(String str) {
        if (str != null) {
            this.f949y = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    public void F(a0.e eVar, int i6, int i10, int i11) {
        eVar.getClass();
        int i12 = eVar.f33b0;
        int i13 = eVar.f35c0;
        eVar.f33b0 = 0;
        eVar.f35c0 = 0;
        eVar.O(i10);
        eVar.L(i11);
        if (i12 < 0) {
            eVar.f33b0 = 0;
        } else {
            eVar.f33b0 = i12;
        }
        if (i13 < 0) {
            eVar.f35c0 = 0;
        } else {
            eVar.f35c0 = i13;
        }
        a0.e eVar2 = (a0.e) this.A;
        eVar2.f72t0 = i6;
        eVar2.U();
    }

    public void G(a0.e eVar) {
        ArrayList arrayList = (ArrayList) this.f949y;
        arrayList.clear();
        int size = eVar.f69q0.size();
        for (int i6 = 0; i6 < size; i6++) {
            a0.d dVar = (a0.d) eVar.f69q0.get(i6);
            int[] iArr = dVar.f59p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f71s0.f1228b = true;
    }

    @Override // f4.b0
    public void a(u1.t tVar) {
        long d10;
        long j;
        u1.c.h((u1.y) this.f950z);
        String str = u1.a0.f12750a;
        u1.y yVar = (u1.y) this.f950z;
        synchronized (yVar) {
            try {
                long j10 = yVar.f12823c;
                if (j10 != -9223372036854775807L) {
                    d10 = j10 + yVar.f12822b;
                } else {
                    d10 = yVar.d();
                }
                j = d10;
            } finally {
            }
        }
        long e10 = ((u1.y) this.f950z).e();
        if (j != -9223372036854775807L && e10 != -9223372036854775807L) {
            r1.q qVar = (r1.q) this.f949y;
            if (e10 != qVar.s) {
                r1.p a10 = qVar.a();
                a10.f11616r = e10;
                r1.q qVar2 = new r1.q(a10);
                this.f949y = qVar2;
                ((y2.f0) this.A).f(qVar2);
            }
            int a11 = tVar.a();
            ((y2.f0) this.A).a(a11, tVar);
            ((y2.f0) this.A).c(j, 1, a11, 0, null);
        }
    }

    @Override // f4.b0
    public void b(u1.y yVar, y2.q qVar, f4.h0 h0Var) {
        this.f950z = yVar;
        h0Var.a();
        h0Var.b();
        y2.f0 A = qVar.A(h0Var.f4814d, 5);
        this.A = A;
        A.f((r1.q) this.f949y);
    }

    @Override // v3.d
    public int c(long j) {
        long[] jArr = (long[]) this.A;
        int a10 = u1.a0.a(jArr, j, false);
        if (a10 < jArr.length) {
            return a10;
        }
        return -1;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.f948x) {
            case 7:
                j1 j1Var = new j1(((com.google.android.gms.internal.measurement.b) this.f949y).clone());
                ArrayList arrayList = (ArrayList) this.A;
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    ((ArrayList) j1Var.A).add(((com.google.android.gms.internal.measurement.b) obj).clone());
                }
                return j1Var;
            default:
                return super.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [ne.j, ve.q] */
    @Override // kf.h
    public Object collect(kf.i iVar, le.c cVar) {
        lf.p pVar = new lf.p(new kf.h[]{(kf.h) this.f949y, (kf.h) this.f950z}, new kf.f0((ne.j) this.A, null), iVar, null);
        b2 b2Var = new b2(cVar.getContext(), cVar, 1);
        Object x10 = bf.y.x(b2Var, b2Var, pVar);
        he.y yVar = he.y.f6101a;
        me.a aVar = me.a.f8833x;
        if (x10 != aVar) {
            x10 = yVar;
        }
        if (x10 == aVar) {
            return x10;
        }
        return yVar;
    }

    public void d() {
        bd.a aVar = (bd.a) ((ArrayDeque) this.f950z).poll();
        this.A = aVar;
        if (aVar != null) {
            aVar.executeOnExecutor((ThreadPoolExecutor) this.f949y, new Object[0]);
        }
    }

    @Override // v3.d
    public long e(int i6) {
        boolean z10;
        long[] jArr = (long[]) this.A;
        boolean z11 = false;
        if (i6 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        if (i6 < jArr.length) {
            z11 = true;
        }
        u1.c.b(z11);
        return jArr[i6];
    }

    @Override // f2.p
    public f2.o f(r1.e0 e0Var) {
        f2.g gVar;
        e0Var.f11379b.getClass();
        r1.y yVar = e0Var.f11379b.f11285c;
        if (yVar == null) {
            return f2.o.j;
        }
        synchronized (this.f949y) {
            try {
                if (!yVar.equals((r1.y) this.f950z)) {
                    this.f950z = yVar;
                    this.A = i(yVar);
                }
                gVar = (f2.g) this.A;
                gVar.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public g8.i g() {
        String str;
        if (((String) this.f949y) == null) {
            str = " backendName";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (((d8.d) this.A) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new g8.i((String) this.f949y, (byte[]) this.f950z, (d8.d) this.A);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [p8.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [p8.a, java.lang.Object] */
    @Override // ge.a
    public Object get() {
        switch (this.f948x) {
            case 18:
                return new g8.r(new Object(), new Object(), (l8.b) ((b4.h) this.f949y).get(), (e6.j) ((q3) this.f950z).get(), (c6.h) ((ic.s) this.A).get());
            default:
                return new j1((Context) ((ge.a) this.f949y).get(), (n8.d) ((ge.a) this.f950z).get(), (m8.a) ((zb.d) this.A).get(), 29);
        }
    }

    public String h(String str, long j, int i6, long j10) {
        ArrayList arrayList = (ArrayList) this.f949y;
        ArrayList arrayList2 = (ArrayList) this.A;
        ArrayList arrayList3 = (ArrayList) this.f950z;
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            sb2.append((String) arrayList.get(i10));
            if (((Integer) arrayList3.get(i10)).intValue() == 1) {
                sb2.append(str);
            } else if (((Integer) arrayList3.get(i10)).intValue() == 2) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i10), Long.valueOf(j)));
            } else if (((Integer) arrayList3.get(i10)).intValue() == 3) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i10), Integer.valueOf(i6)));
            } else if (((Integer) arrayList3.get(i10)).intValue() == 4) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i10), Long.valueOf(j10)));
            }
        }
        sb2.append((String) arrayList.get(arrayList3.size()));
        return sb2.toString();
    }

    public void k(Runnable runnable) {
        ((f6.i) this.f949y).execute(runnable);
    }

    public e6.d n(String str) {
        e6.d dVar;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f949y;
        x4.z d10 = x4.z.d(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            d10.c(1);
        } else {
            d10.i(1, str);
        }
        workDatabase_Impl.b();
        Cursor r10 = j5.r(workDatabase_Impl, d10);
        try {
            int i6 = k4.i(r10, "work_spec_id");
            int i10 = k4.i(r10, "system_id");
            if (r10.moveToFirst()) {
                dVar = new e6.d(r10.getString(i6), r10.getInt(i10));
            } else {
                dVar = null;
            }
            return dVar;
        } finally {
            r10.close();
            d10.f();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(87:5|(2:7|(2:9|(2:10|(2:12|(3:14|15|(1:17)(0))(1:18))(1:19)))(0))(0)|20|(84:288|289|23|(1:25)|26|27|28|(1:30)|285|32|33|(3:260|261|(78:263|(70:265|(1:267)|36|(1:38)|39|(1:41)|42|(1:259)(2:44|(1:244)(60:48|49|(1:51)|52|(1:54)(2:234|(1:239)(1:238))|55|(1:57)(1:233)|58|(1:60)(5:221|(1:223)|224|(1:226)(1:232)|(1:228)(2:229|(1:231)))|61|(1:63)(8:199|(4:202|(2:210|211)(1:208)|209|200)|212|213|(1:215)|216|(1:218)(1:220)|219)|64|(1:66)(3:194|(1:196)(1:198)|197)|(1:68)|69|(43:190|191|(1:75)|76|(1:78)|79|(37:181|(1:185)|(1:83)|84|(33:176|(1:180)|(1:88)|89|(29:173|(1:175)|(1:93)|94|(25:169|170|(1:98)|99|(3:159|160|(22:162|(1:164)|165|(1:103)|104|(4:144|145|146|(2:148|(16:150|(3:108|(1:113)(1:111)|112)|114|(1:116)|117|(1:119)|120|(1:122)|123|(1:143)|125|(4:132|133|(1:135)(1:138)|136)|127|(1:129)|130|131)(2:151|152))(2:153|154))|106|(0)|114|(0)|117|(0)|120|(0)|123|(0)|125|(0)|127|(0)|130|131)(2:166|167))|101|(0)|104|(0)|106|(0)|114|(0)|117|(0)|120|(0)|123|(0)|125|(0)|127|(0)|130|131)|96|(0)|99|(0)|101|(0)|104|(0)|106|(0)|114|(0)|117|(0)|120|(0)|123|(0)|125|(0)|127|(0)|130|131)|91|(0)|94|(0)|96|(0)|99|(0)|101|(0)|104|(0)|106|(0)|114|(0)|117|(0)|120|(0)|123|(0)|125|(0)|127|(0)|130|131)|86|(0)|89|(0)|91|(0)|94|(0)|96|(0)|99|(0)|101|(0)|104|(0)|106|(0)|114|(0)|117|(0)|120|(0)|123|(0)|125|(0)|127|(0)|130|131)|81|(0)|84|(0)|86|(0)|89|(0)|91|(0)|94|(0)|96|(0)|99|(0)|101|(0)|104|(0)|106|(0)|114|(0)|117|(0)|120|(0)|123|(0)|125|(0)|127|(0)|130|131)|71|(43:186|187|(0)|76|(0)|79|(0)|81|(0)|84|(0)|86|(0)|89|(0)|91|(0)|94|(0)|96|(0)|99|(0)|101|(0)|104|(0)|106|(0)|114|(0)|117|(0)|120|(0)|123|(0)|125|(0)|127|(0)|130|131)|73|(0)|76|(0)|79|(0)|81|(0)|84|(0)|86|(0)|89|(0)|91|(0)|94|(0)|96|(0)|99|(0)|101|(0)|104|(0)|106|(0)|114|(0)|117|(0)|120|(0)|123|(0)|125|(0)|127|(0)|130|131))|245|(2:254|255)|(1:253)(1:252)|49|(0)|52|(0)(0)|55|(0)(0)|58|(0)(0)|61|(0)(0)|64|(0)(0)|(0)|69|(0)|71|(0)|73|(0)|76|(0)|79|(0)|81|(0)|84|(0)|86|(0)|89|(0)|91|(0)|94|(0)|96|(0)|99|(0)|101|(0)|104|(0)|106|(0)|114|(0)|117|(0)|120|(0)|123|(0)|125|(0)|127|(0)|130|131)|268|(73:270|(1:272)|36|(0)|39|(0)|42|(0)(0)|245|(1:247)|254|255|(1:250)|253|49|(0)|52|(0)(0)|55|(0)(0)|58|(0)(0)|61|(0)(0)|64|(0)(0)|(0)|69|(0)|71|(0)|73|(0)|76|(0)|79|(0)|81|(0)|84|(0)|86|(0)|89|(0)|91|(0)|94|(0)|96|(0)|99|(0)|101|(0)|104|(0)|106|(0)|114|(0)|117|(0)|120|(0)|123|(0)|125|(0)|127|(0)|130|131)(1:281)|273|(3:275|(1:277)(1:279)|278)|280|36|(0)|39|(0)|42|(0)(0)|245|(0)|254|255|(0)|253|49|(0)|52|(0)(0)|55|(0)(0)|58|(0)(0)|61|(0)(0)|64|(0)(0)|(0)|69|(0)|71|(0)|73|(0)|76|(0)|79|(0)|81|(0)|84|(0)|86|(0)|89|(0)|91|(0)|94|(0)|96|(0)|99|(0)|101|(0)|104|(0)|106|(0)|114|(0)|117|(0)|120|(0)|123|(0)|125|(0)|127|(0)|130|131))|35|36|(0)|39|(0)|42|(0)(0)|245|(0)|254|255|(0)|253|49|(0)|52|(0)(0)|55|(0)(0)|58|(0)(0)|61|(0)(0)|64|(0)(0)|(0)|69|(0)|71|(0)|73|(0)|76|(0)|79|(0)|81|(0)|84|(0)|86|(0)|89|(0)|91|(0)|94|(0)|96|(0)|99|(0)|101|(0)|104|(0)|106|(0)|114|(0)|117|(0)|120|(0)|123|(0)|125|(0)|127|(0)|130|131)|22|23|(0)|26|27|28|(0)|285|32|33|(0)|35|36|(0)|39|(0)|42|(0)(0)|245|(0)|254|255|(0)|253|49|(0)|52|(0)(0)|55|(0)(0)|58|(0)(0)|61|(0)(0)|64|(0)(0)|(0)|69|(0)|71|(0)|73|(0)|76|(0)|79|(0)|81|(0)|84|(0)|86|(0)|89|(0)|91|(0)|94|(0)|96|(0)|99|(0)|101|(0)|104|(0)|106|(0)|114|(0)|117|(0)|120|(0)|123|(0)|125|(0)|127|(0)|130|131) */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x020c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x020d, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x00c2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x00c3, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00be, code lost:
    
        if (r0 != null) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0622 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc A[Catch: NameNotFoundException -> 0x00c2, TRY_LEAVE, TryCatch #7 {NameNotFoundException -> 0x00c2, blocks: (B:28:0x00b6, B:30:0x00bc), top: B:27:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04e8  */
    /* JADX WARN: Type inference failed for: r0v134, types: [int] */
    /* JADX WARN: Type inference failed for: r0v159 */
    /* JADX WARN: Type inference failed for: r0v213 */
    /* JADX WARN: Type inference failed for: r0v214 */
    /* JADX WARN: Type inference failed for: r15v0, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r5v26, types: [h0.n, e3.e] */
    /* JADX WARN: Type inference failed for: r5v36, types: [h0.o, e3.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean o() {
        /*
            Method dump skipped, instructions count: 1697
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.j1.o():boolean");
    }

    @Override // v3.d
    public List p(long j) {
        List list = (List) this.f949y;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i6 = 0; i6 < list.size(); i6++) {
            long[] jArr = (long[]) this.f950z;
            int i10 = i6 * 2;
            if (jArr[i10] <= j && j < jArr[i10 + 1]) {
                e4.c cVar = (e4.c) list.get(i6);
                t1.b bVar = cVar.f4323a;
                if (bVar.f12462e == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new d2.a(2));
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            t1.a a10 = ((e4.c) arrayList2.get(i11)).f4323a.a();
            a10.f12438e = (-1) - i11;
            a10.f12439f = 1;
            arrayList.add(a10.a());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bc, code lost:
    
        if (r6 >= r7) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean q(java.lang.CharSequence r10, int r11, int r12, e1.w r13) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.j1.q(java.lang.CharSequence, int, int, e1.w):boolean");
    }

    @Override // v3.d
    public int s() {
        return ((long[]) this.A).length;
    }

    public boolean t() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.f950z;
        if (((String) this.A) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.A = str;
                return true;
            }
            do {
                String readLine = ((BufferedReader) this.f949y).readLine();
                this.A = readLine;
                if (readLine != null) {
                    trim = readLine.trim();
                    this.A = trim;
                } else {
                    return false;
                }
            } while (trim.isEmpty());
        }
        return true;
    }

    public String toString() {
        switch (this.f948x) {
            case 6:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f949y);
                sb2.append('{');
                j4.b0 b0Var = (j4.b0) ((j4.b0) this.f950z).f7159y;
                String str = HttpUrl.FRAGMENT_ENCODE_SET;
                while (b0Var != null) {
                    Object obj = b0Var.f7158x;
                    sb2.append(str);
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    b0Var = (j4.b0) b0Var.f7159y;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 27:
                String str2 = (String) this.A;
                String str3 = (String) this.f950z;
                StringBuilder sb3 = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f949y;
                if (uri != null) {
                    sb3.append(" uri=");
                    sb3.append(String.valueOf(uri));
                }
                if (str3 != null) {
                    sb3.append(" action=");
                    sb3.append(str3);
                }
                if (str2 != null) {
                    sb3.append(" mimetype=");
                    sb3.append(str2);
                }
                sb3.append(" }");
                String sb4 = sb3.toString();
                kotlin.jvm.internal.k.d(sb4, "toString(...)");
                return sb4;
            default:
                return super.toString();
        }
    }

    public void u(e6.d dVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f949y;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((e6.b) this.f950z).e(dVar);
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.h();
        }
    }

    public boolean v(int i6, a0.d dVar, d0.f fVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        b0.b bVar = (b0.b) this.f950z;
        int[] iArr = dVar.f59p0;
        int[] iArr2 = dVar.f62t;
        bVar.f1216a = iArr[0];
        bVar.f1217b = iArr[1];
        bVar.f1218c = dVar.q();
        bVar.f1219d = dVar.k();
        bVar.f1224i = false;
        bVar.j = i6;
        if (bVar.f1216a == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (bVar.f1217b == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && dVar.W > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 && dVar.W > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 && iArr2[0] == 4) {
            bVar.f1216a = 1;
        }
        if (z13 && iArr2[1] == 4) {
            bVar.f1217b = 1;
        }
        fVar.b(dVar, bVar);
        dVar.O(bVar.f1220e);
        dVar.L(bVar.f1221f);
        dVar.E = bVar.f1223h;
        dVar.I(bVar.f1222g);
        bVar.j = 0;
        return bVar.f1224i;
    }

    public String w() {
        if (t()) {
            String str = (String) this.A;
            this.A = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public void x(w wVar) {
        i1 i1Var = (i1) this.A;
        if (i1Var != null) {
            i1Var.run();
        }
        i1 i1Var2 = new i1((h0) this.f949y, wVar);
        this.A = i1Var2;
        ((Handler) this.f950z).postAtFrontOfQueue(i1Var2);
    }

    public Object y(CharSequence charSequence, int i6, int i10, int i11, boolean z10, e1.o oVar) {
        e1.t tVar;
        char c10;
        e1.q qVar = new e1.q((e1.t) ((ic.s) this.f950z).f6783z);
        int i12 = i6;
        int codePointAt = Character.codePointAt(charSequence, i6);
        int i13 = 0;
        boolean z11 = true;
        int i14 = i12;
        while (i14 < i10 && i13 < i11 && z11) {
            SparseArray sparseArray = qVar.f4176c.f4189a;
            if (sparseArray == null) {
                tVar = null;
            } else {
                tVar = (e1.t) sparseArray.get(codePointAt);
            }
            if (qVar.f4174a != 2) {
                if (tVar == null) {
                    qVar.a();
                    c10 = 1;
                } else {
                    qVar.f4174a = 2;
                    qVar.f4176c = tVar;
                    qVar.f4179f = 1;
                    c10 = 2;
                }
            } else {
                if (tVar != null) {
                    qVar.f4176c = tVar;
                    qVar.f4179f++;
                } else {
                    if (codePointAt == 65038) {
                        qVar.a();
                    } else if (codePointAt != 65039) {
                        e1.t tVar2 = qVar.f4176c;
                        if (tVar2.f4190b != null) {
                            if (qVar.f4179f == 1) {
                                if (qVar.b()) {
                                    qVar.f4177d = qVar.f4176c;
                                    qVar.a();
                                } else {
                                    qVar.a();
                                }
                            } else {
                                qVar.f4177d = tVar2;
                                qVar.a();
                            }
                            c10 = 3;
                        } else {
                            qVar.a();
                        }
                    }
                    c10 = 1;
                }
                c10 = 2;
            }
            qVar.f4178e = codePointAt;
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 == 3) {
                        if (z10 || !q(charSequence, i12, i14, qVar.f4177d.f4190b)) {
                            z11 = oVar.c(charSequence, i12, i14, qVar.f4177d.f4190b);
                            i13++;
                        }
                    }
                } else {
                    int charCount = Character.charCount(codePointAt) + i14;
                    if (charCount < i10) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i14 = charCount;
                }
            } else {
                i14 = Character.charCount(Character.codePointAt(charSequence, i12)) + i12;
                if (i14 < i10) {
                    codePointAt = Character.codePointAt(charSequence, i14);
                }
            }
            i12 = i14;
        }
        if (qVar.f4174a == 2 && qVar.f4176c.f4190b != null && ((qVar.f4179f > 1 || qVar.b()) && i13 < i11 && z11 && (z10 || !q(charSequence, i12, i14, qVar.f4176c.f4190b)))) {
            oVar.c(charSequence, i12, i14, qVar.f4176c.f4190b);
        }
        return oVar.getResult();
    }

    public void z(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (((HashSet) this.f949y).remove(mediaCodec) && (loudnessCodecController = (LoudnessCodecController) this.A) != null) {
            j2.a.c(loudnessCodecController, mediaCodec);
        }
    }

    public /* synthetic */ j1(Object obj, Object obj2, Object obj3, int i6) {
        this.f948x = i6;
        this.f949y = obj;
        this.f950z = obj2;
        this.A = obj3;
    }

    public j1(com.google.android.gms.internal.measurement.b bVar) {
        this.f948x = 7;
        this.f949y = bVar;
        this.f950z = bVar.clone();
        this.A = new ArrayList();
    }

    public j1(List list) {
        this.f948x = 12;
        this.A = list;
        this.f949y = new ArrayList(list.size());
        this.f950z = new ArrayList(list.size());
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((ArrayList) this.f949y).add(new e7.n((List) ((i7.f) list.get(i6)).f6653b.f4301y));
            ((ArrayList) this.f950z).add(((i7.f) list.get(i6)).f6654c.G0());
        }
    }

    public j1(WorkDatabase_Impl workDatabase_Impl) {
        this.f948x = 11;
        this.f949y = workDatabase_Impl;
        this.f950z = new e6.b(workDatabase_Impl, 2);
        this.A = new e6.e(workDatabase_Impl, 0);
    }

    public j1(i0 i0Var) {
        this.f948x = 0;
        this.f949y = new h0(i0Var);
        this.f950z = new Handler();
    }

    public j1(g8.i iVar, d8.c cVar, i4.u0 u0Var, g8.r rVar) {
        this.f948x = 17;
        this.f949y = iVar;
        this.f950z = cVar;
        this.A = rVar;
    }

    public j1(ArrayList arrayList) {
        this.f948x = 10;
        this.f949y = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f950z = new long[arrayList.size() * 2];
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            e4.c cVar = (e4.c) arrayList.get(i6);
            int i10 = i6 * 2;
            long[] jArr = (long[]) this.f950z;
            jArr[i10] = cVar.f4324b;
            jArr[i10 + 1] = cVar.f4325c;
        }
        long[] jArr2 = (long[]) this.f950z;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.A = copyOf;
        Arrays.sort(copyOf);
    }

    public j1(ExecutorService executorService) {
        this.f948x = 20;
        this.f950z = new Handler(Looper.getMainLooper());
        this.A = new g8.p(this, 1);
        this.f949y = new f6.i(executorService);
    }

    public j1(FirebaseMessagingService firebaseMessagingService, a2 a2Var, ExecutorService executorService) {
        this.f948x = 24;
        this.f949y = executorService;
        this.f950z = firebaseMessagingService;
        this.A = a2Var;
    }

    public j1(Context context, LocationManager locationManager) {
        this.f948x = 22;
        this.A = new Object();
        this.f949y = context;
        this.f950z = locationManager;
    }

    public j1(a0.e eVar) {
        this.f948x = 1;
        this.f949y = new ArrayList();
        this.f950z = new Object();
        this.A = eVar;
    }

    public j1(byte[] bArr, hb.x xVar) {
        this.f948x = 23;
        this.f949y = bArr;
        this.f950z = null;
        this.A = xVar;
    }

    public j1(Uri uri, hb.x xVar) {
        this.f948x = 23;
        this.f949y = null;
        this.f950z = uri;
        this.A = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j1(kf.h hVar, kf.h hVar2, ve.q qVar) {
        this.f948x = 26;
        this.f949y = hVar;
        this.f950z = hVar2;
        this.A = (ne.j) qVar;
    }

    public j1(ic.s sVar, ua.f fVar, e1.d dVar, Set set) {
        this.f948x = 8;
        this.f949y = fVar;
        this.f950z = sVar;
        this.A = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            y(str, 0, str.length(), 1, true, new e1.p(str, 0));
        }
    }

    public j1(String str, int i6) {
        this.f948x = i6;
        switch (i6) {
            case 15:
                r1.p pVar = new r1.p();
                pVar.f11610l = r1.k0.p("video/mp2t");
                pVar.f11611m = r1.k0.p(str);
                this.f949y = new r1.q(pVar);
                return;
            default:
                Object obj = new Object();
                this.f950z = obj;
                this.A = obj;
                this.f949y = str;
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, s1.j] */
    public j1(s1.g[] gVarArr) {
        this.f948x = 3;
        c2.m0 m0Var = new c2.m0();
        ?? obj = new Object();
        obj.f12016c = 1.0f;
        obj.f12017d = 1.0f;
        s1.e eVar = s1.e.f11981e;
        obj.f12018e = eVar;
        obj.f12019f = eVar;
        obj.f12020g = eVar;
        obj.f12021h = eVar;
        ByteBuffer byteBuffer = s1.g.f11986a;
        obj.f12023k = byteBuffer;
        obj.f12024l = byteBuffer.asShortBuffer();
        obj.f12025m = byteBuffer;
        obj.f12015b = -1;
        s1.g[] gVarArr2 = new s1.g[gVarArr.length + 2];
        this.f949y = gVarArr2;
        System.arraycopy(gVarArr, 0, gVarArr2, 0, gVarArr.length);
        this.f950z = m0Var;
        this.A = obj;
        gVarArr2[gVarArr.length] = m0Var;
        gVarArr2[gVarArr.length + 1] = obj;
    }

    public j1(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f948x = 19;
        this.f950z = arrayDeque;
        this.f949y = bufferedReader;
    }

    public j1(AudioTrack audioTrack, c2.h hVar) {
        this.f948x = 4;
        this.f949y = audioTrack;
        this.f950z = hVar;
        this.A = new AudioRouting.OnRoutingChangedListener() { // from class: c2.e0
            /* JADX WARN: Code restructure failed: missing block: B:3:0x0009, code lost:
            
                r3 = r3.getRoutedDevice();
             */
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onRoutingChanged(android.media.AudioRouting r3) {
                /*
                    r2 = this;
                    androidx.lifecycle.j1 r0 = androidx.lifecycle.j1.this
                    java.lang.Object r1 = r0.A
                    c2.e0 r1 = (c2.e0) r1
                    if (r1 != 0) goto L9
                    goto L16
                L9:
                    android.media.AudioDeviceInfo r3 = c2.w.f(r3)
                    if (r3 == 0) goto L16
                    java.lang.Object r0 = r0.f950z
                    c2.h r0 = (c2.h) r0
                    r0.b(r3)
                L16:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: c2.e0.onRoutingChanged(android.media.AudioRouting):void");
            }
        };
        c2.w.r(audioTrack, (c2.e0) this.A, new Handler(Looper.myLooper()));
    }

    public j1(c2.i0 i0Var) {
        this.f948x = 5;
        this.A = i0Var;
        this.f950z = new Handler(Looper.myLooper());
        this.f949y = new c2.h0(this);
    }
}

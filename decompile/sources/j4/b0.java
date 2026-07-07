package j4;

import android.content.Context;
import android.database.Cursor;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Choreographer;
import android.view.Menu;
import android.view.ViewGroup;
import androidx.lifecycle.j1;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.measurement.j5;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import org.json.JSONException;
import org.json.JSONObject;
import t0.q0;
import t0.u0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class b0 implements e1.o, v3.m, y2.i, f4.b0, h2.s, i8.b, w0.f {

    /* renamed from: x, reason: collision with root package name */
    public Object f7158x;

    /* renamed from: y, reason: collision with root package name */
    public Object f7159y;

    public /* synthetic */ b0(Object obj) {
        this.f7159y = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j4.b0 f(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L2e java.lang.Error -> L32 java.io.IOException -> L34
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L27 java.lang.Error -> L2a java.io.IOException -> L2c
            j4.b0 r2 = new j4.b0     // Catch: java.nio.channels.OverlappingFileLockException -> L21 java.lang.Error -> L23 java.io.IOException -> L25
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L21 java.lang.Error -> L23 java.io.IOException -> L25
            return r2
        L21:
            r2 = move-exception
            goto L36
        L23:
            r2 = move-exception
            goto L36
        L25:
            r2 = move-exception
            goto L36
        L27:
            r2 = move-exception
        L28:
            r0 = r1
            goto L36
        L2a:
            r2 = move-exception
            goto L28
        L2c:
            r2 = move-exception
            goto L28
        L2e:
            r2 = move-exception
        L2f:
            r5 = r1
            r0 = r5
            goto L36
        L32:
            r2 = move-exception
            goto L2f
        L34:
            r2 = move-exception
            goto L2f
        L36:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L44
            r0.release()     // Catch: java.io.IOException -> L43
            goto L44
        L43:
        L44:
            if (r5 == 0) goto L49
            r5.close()     // Catch: java.io.IOException -> L49
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.b0.f(android.content.Context):j4.b0");
    }

    public static void l(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = b0.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
        }
    }

    public dc.b A() {
        JSONObject jSONObject;
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        try {
            FileInputStream fileInputStream = new FileInputStream(n());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, Http2.INITIAL_MAX_FRAME_SIZE);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i6 = y.e.d(5)[optInt];
        if (i6 != 0) {
            if (i6 == 0) {
                str = " registrationStatus";
            } else {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (str.isEmpty()) {
                return new dc.b(optString, i6, optString2, optString3, optLong2, optLong, optString4);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        throw new NullPointerException("Null registrationStatus");
    }

    @Override // v3.m
    public int B() {
        return 1;
    }

    public void C() {
        try {
            ((FileLock) this.f7159y).release();
            ((FileChannel) this.f7158x).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    public void D(s sVar, Handler handler) {
        u uVar = (u) this.f7158x;
        synchronized (uVar.f7211d) {
            uVar.f7219m = sVar;
            uVar.f7208a.setCallback(sVar.f7202b, handler);
            sVar.C(uVar, handler);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.AbstractCollection, java.util.List] */
    public void E(k0 k0Var) {
        u uVar = (u) this.f7158x;
        uVar.f7214g = k0Var;
        synchronized (uVar.f7211d) {
            for (int beginBroadcast = uVar.f7213f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((f) uVar.f7213f.getBroadcastItem(beginBroadcast)).A(k0Var);
                } catch (RemoteException | SecurityException e10) {
                    Log.e("MediaSessionCompat", "Dead object in setPlaybackState.", e10);
                }
            }
            uVar.f7213f.finishBroadcast();
        }
        MediaSession mediaSession = uVar.f7208a;
        if (k0Var.I == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(k0Var.f7183x, k0Var.f7184y, k0Var.A, k0Var.E);
            builder.setBufferedPosition(k0Var.f7185z);
            builder.setActions(k0Var.B);
            builder.setErrorMessage(k0Var.D);
            for (j0 j0Var : k0Var.F) {
                j0Var.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(j0Var.f7178x, j0Var.f7179y, j0Var.f7180z);
                builder2.setExtras(j0Var.A);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(k0Var.G);
            if (Build.VERSION.SDK_INT >= 22) {
                i0.a(builder, k0Var.H);
            }
            k0Var.I = builder.build();
        }
        mediaSession.setPlaybackState(k0Var.I);
    }

    @Override // f4.b0
    public void a(u1.t tVar) {
        f4.f0 f0Var = (f4.f0) this.f7159y;
        SparseArray sparseArray = f0Var.f4775h;
        u1.s sVar = (u1.s) this.f7158x;
        if (tVar.y() == 0 && (tVar.y() & 128) != 0) {
            tVar.L(6);
            int a10 = tVar.a() / 4;
            for (int i6 = 0; i6 < a10; i6++) {
                tVar.i(sVar.f12804b, 0, 4);
                sVar.q(0);
                int i10 = sVar.i(16);
                sVar.t(3);
                if (i10 == 0) {
                    sVar.t(13);
                } else {
                    int i11 = sVar.i(13);
                    if (sparseArray.get(i11) == null) {
                        sparseArray.put(i11, new f4.c0(new f4.e0(f0Var, i11)));
                        f0Var.f4780n++;
                    }
                }
            }
            if (f0Var.f4768a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // e1.o
    public boolean c(CharSequence charSequence, int i6, int i10, e1.w wVar) {
        Spannable spannableString;
        if ((wVar.f4198c & 4) > 0) {
            return true;
        }
        if (((e1.z) this.f7158x) == null) {
            if (charSequence instanceof Spannable) {
                spannableString = (Spannable) charSequence;
            } else {
                spannableString = new SpannableString(charSequence);
            }
            this.f7158x = new e1.z(spannableString);
        }
        ((ua.f) this.f7159y).getClass();
        ((e1.z) this.f7158x).setSpan(new e1.x(wVar), i6, i10, 33);
        return true;
    }

    @Override // y2.i
    public y2.h d(y2.p pVar, long j) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        u1.t tVar = (u1.t) this.f7159y;
        tVar.H(min);
        pVar.C(tVar.f12811a, 0, min);
        int i6 = -1;
        long j10 = -9223372036854775807L;
        int i10 = -1;
        while (tVar.a() >= 4) {
            if (d3.a.G(tVar.f12812b, tVar.f12811a) != 442) {
                tVar.L(1);
            } else {
                tVar.L(4);
                long c10 = f4.y.c(tVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((u1.y) this.f7158x).b(c10);
                    if (b10 > j) {
                        if (j10 == -9223372036854775807L) {
                            return new y2.h(-1, b10, position);
                        }
                        return new y2.h(0, -9223372036854775807L, position + i10);
                    }
                    if (b10 + 100000 > j) {
                        return new y2.h(0, -9223372036854775807L, position + tVar.f12812b);
                    }
                    j10 = b10;
                    i10 = tVar.f12812b;
                }
                int i11 = tVar.f12813c;
                if (tVar.a() < 10) {
                    tVar.K(i11);
                } else {
                    tVar.L(9);
                    int y9 = tVar.y() & 7;
                    if (tVar.a() < y9) {
                        tVar.K(i11);
                    } else {
                        tVar.L(y9);
                        if (tVar.a() < 4) {
                            tVar.K(i11);
                        } else {
                            if (d3.a.G(tVar.f12812b, tVar.f12811a) == 443) {
                                tVar.L(4);
                                int E = tVar.E();
                                if (tVar.a() < E) {
                                    tVar.K(i11);
                                } else {
                                    tVar.L(E);
                                }
                            }
                            while (true) {
                                if (tVar.a() < 4) {
                                    break;
                                }
                                int G = d3.a.G(tVar.f12812b, tVar.f12811a);
                                if (G == 442 || G == 441 || (G >>> 8) != 1) {
                                    break;
                                }
                                tVar.L(4);
                                if (tVar.a() < 2) {
                                    tVar.K(i11);
                                    break;
                                }
                                tVar.K(Math.min(tVar.f12813c, tVar.f12812b + tVar.E()));
                            }
                        }
                    }
                }
                i6 = tVar.f12812b;
            }
        }
        if (j10 != -9223372036854775807L) {
            return new y2.h(-2, j10, position + i6);
        }
        return y2.h.f14908d;
    }

    @Override // y2.i
    public void e() {
        u1.t tVar = (u1.t) this.f7159y;
        byte[] bArr = u1.a0.f12751b;
        tVar.getClass();
        tVar.I(bArr.length, bArr);
    }

    @Override // v3.m
    public /* synthetic */ v3.d g(byte[] bArr, int i6, int i10) {
        return h8.c.a(this, bArr, i10);
    }

    @Override // ge.a
    public Object get() {
        return new h8.e((Context) ((lc.c) this.f7158x).f8328x, (j1) ((u5.r) this.f7159y).get());
    }

    @Override // e1.o
    public Object getResult() {
        return (e1.z) this.f7158x;
    }

    @Override // h2.s
    public u2.q h(h2.o oVar, h2.l lVar) {
        return new j1.f0(8, ((h2.s) this.f7158x).h(oVar, lVar), (List) this.f7159y);
    }

    public void i() {
        this.f7158x = null;
        this.f7159y = null;
    }

    public hb.x j(byte[] bArr) {
        byte[] bArr2;
        j1 j1Var = (j1) this.f7159y;
        if (j1Var != null && (bArr2 = (byte[]) j1Var.f949y) != null && Arrays.equals(bArr2, bArr)) {
            hb.x xVar = (hb.x) ((j1) this.f7159y).A;
            u1.c.h(xVar);
            return xVar;
        }
        w1.i iVar = (w1.i) this.f7158x;
        hb.x d10 = ((hb.z) iVar.f13534a).d(new b7.d(5, iVar, bArr));
        this.f7159y = new j1(bArr, d10);
        return d10;
    }

    public void k(a2.h hVar) {
        synchronized (hVar) {
        }
        Handler handler = (Handler) this.f7158x;
        if (handler != null) {
            handler.post(new a2.c0(6, this, hVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.datatransport.cct.CctBackendFactory m(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.b0.m(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public File n() {
        if (((File) this.f7158x) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f7158x) == null) {
                        jb.g gVar = (jb.g) this.f7159y;
                        gVar.a();
                        this.f7158x = new File(gVar.f7331a.getFilesDir(), "PersistedInstallation." + ((jb.g) this.f7159y).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f7158x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x03a2, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0116, code lost:
    
        if (")".equals(e4.a.b(r11, r6)) == false) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, e4.b] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v7, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // v3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o(byte[] r19, int r20, int r21, v3.l r22, u1.g r23) {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.b0.o(byte[], int, int, v3.l, u1.g):void");
    }

    @Override // h2.s
    public u2.q p() {
        return new j1.f0(8, ((h2.s) this.f7158x).p(), (List) this.f7159y);
    }

    public ArrayList q(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f7158x;
        x4.z d10 = x4.z.d(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            d10.c(1);
        } else {
            d10.i(1, str);
        }
        workDatabase_Impl.b();
        Cursor r10 = j5.r(workDatabase_Impl, d10);
        try {
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                arrayList.add(r10.getString(0));
            }
            return arrayList;
        } finally {
            r10.close();
            d10.f();
        }
    }

    public Long r(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f7158x;
        x4.z d10 = x4.z.d(1, "SELECT long_value FROM Preference where `key`=?");
        d10.i(1, str);
        workDatabase_Impl.b();
        Cursor r10 = j5.r(workDatabase_Impl, d10);
        try {
            Long l10 = null;
            if (r10.moveToFirst() && !r10.isNull(0)) {
                l10 = Long.valueOf(r10.getLong(0));
            }
            return l10;
        } finally {
            r10.close();
            d10.f();
        }
    }

    public ArrayList s(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f7158x;
        x4.z d10 = x4.z.d(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            d10.c(1);
        } else {
            d10.i(1, str);
        }
        workDatabase_Impl.b();
        Cursor r10 = j5.r(workDatabase_Impl, d10);
        try {
            ArrayList arrayList = new ArrayList(r10.getCount());
            while (r10.moveToNext()) {
                arrayList.add(r10.getString(0));
            }
            return arrayList;
        } finally {
            r10.close();
            d10.f();
        }
    }

    public void t(dc.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f4073a);
            jSONObject.put("Status", y.e.c(bVar.f4074b));
            jSONObject.put("AuthToken", bVar.f4075c);
            jSONObject.put("RefreshToken", bVar.f4076d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f4078f);
            jSONObject.put("ExpiresInSecs", bVar.f4077e);
            jSONObject.put("FisError", bVar.f4079g);
            jb.g gVar = (jb.g) this.f7159y;
            gVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f7331a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(n())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void u(e6.c cVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f7158x;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((e6.b) this.f7159y).e(cVar);
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.h();
        }
    }

    public void v(n.a aVar) {
        ic.s sVar = (ic.s) this.f7158x;
        ((ActionMode.Callback) sVar.f6781x).onDestroyActionMode(sVar.f(aVar));
        i.b0 b0Var = (i.b0) this.f7159y;
        if (b0Var.T != null) {
            b0Var.I.getDecorView().removeCallbacks(b0Var.U);
        }
        if (b0Var.S != null) {
            u0 u0Var = b0Var.V;
            if (u0Var != null) {
                u0Var.b();
            }
            u0 a10 = q0.a(b0Var.S);
            a10.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            b0Var.V = a10;
            a10.d(new i.s(this, 2));
        }
        b0Var.R = null;
        ViewGroup viewGroup = b0Var.Y;
        WeakHashMap weakHashMap = q0.f12397a;
        t0.f0.c(viewGroup);
        b0Var.I();
    }

    public boolean w(n.a aVar, Menu menu) {
        ViewGroup viewGroup = ((i.b0) this.f7159y).Y;
        WeakHashMap weakHashMap = q0.f12397a;
        t0.f0.c(viewGroup);
        ic.s sVar = (ic.s) this.f7158x;
        ActionMode.Callback callback = (ActionMode.Callback) sVar.f6781x;
        n.e f3 = sVar.f(aVar);
        v.l lVar = (v.l) sVar.A;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new o.a0((Context) sVar.f6782y, (o.l) menu);
            lVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(f3, menu2);
    }

    public void x(Exception exc, boolean z10) {
        int i6;
        this.f7159y = null;
        HashSet hashSet = (HashSet) this.f7158x;
        db.k0 k8 = db.k0.k(hashSet);
        hashSet.clear();
        db.i0 listIterator = k8.listIterator(0);
        while (listIterator.hasNext()) {
            f2.d dVar = (f2.d) listIterator.next();
            dVar.getClass();
            if (z10) {
                i6 = 1;
            } else {
                i6 = 3;
            }
            dVar.j(exc, i6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0209, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0082. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x00c9. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0109 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, XmlPullParserException -> 0x0094, blocks: (B:19:0x0062, B:28:0x0209, B:29:0x0074, B:30:0x0082, B:33:0x0087, B:41:0x0097, B:44:0x00b1, B:47:0x00a0, B:51:0x00a9, B:54:0x00bf, B:57:0x00ce, B:59:0x00d6, B:62:0x00e0, B:66:0x0109, B:69:0x0110, B:70:0x0128, B:72:0x00e9, B:74:0x00f1, B:77:0x00ff, B:80:0x0129, B:82:0x0131, B:85:0x013f, B:88:0x0149, B:91:0x0154, B:92:0x016c, B:94:0x016d, B:97:0x0177, B:100:0x0182, B:101:0x019a, B:103:0x019b, B:105:0x01a3, B:108:0x01ac, B:111:0x01b6, B:114:0x01c0, B:115:0x01d8, B:117:0x01d9, B:120:0x01e3, B:123:0x01ed, B:124:0x0205, B:127:0x0206), top: B:18:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0110 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void y(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.b0.y(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public void z(f2.d dVar) {
        ((HashSet) this.f7158x).add(dVar);
        if (((f2.d) this.f7159y) != null) {
            return;
        }
        this.f7159y = dVar;
        f2.s g10 = dVar.f4642b.g();
        dVar.f4662x = g10;
        f2.a aVar = dVar.f4657r;
        String str = u1.a0.f12750a;
        g10.getClass();
        aVar.getClass();
        aVar.obtainMessage(1, new f2.b(q2.u.f10969b.getAndIncrement(), true, SystemClock.elapsedRealtime(), g10)).sendToTarget();
    }

    public /* synthetic */ b0(Object obj, Object obj2) {
        this.f7158x = obj;
        this.f7159y = obj2;
    }

    public /* synthetic */ b0(Object obj, boolean z10) {
        this.f7159y = null;
        this.f7158x = obj;
    }

    public b0(WorkDatabase_Impl workDatabase_Impl, int i6) {
        switch (i6) {
            case 15:
                this.f7158x = workDatabase_Impl;
                this.f7159y = new e6.b(workDatabase_Impl, 1);
                return;
            case 16:
                this.f7158x = workDatabase_Impl;
                this.f7159y = new e6.b(workDatabase_Impl, 3);
                return;
            case 17:
                this.f7158x = workDatabase_Impl;
                this.f7159y = new e6.b(workDatabase_Impl, 6);
                return;
            default:
                this.f7158x = workDatabase_Impl;
                this.f7159y = new e6.b(workDatabase_Impl, 0);
                return;
        }
    }

    @Override // v3.m
    public /* synthetic */ void reset() {
    }

    public b0(Handler handler, c2.m mVar) {
        if (mVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f7158x = handler;
        this.f7159y = mVar;
    }

    public b0(int i6) {
        switch (i6) {
            case 13:
                this.f7158x = new u1.t();
                this.f7159y = new e4.a();
                return;
            case 18:
                this.f7158x = new HashSet();
                return;
            default:
                this.f7158x = Choreographer.getInstance();
                this.f7159y = Looper.myLooper();
                return;
        }
    }

    @Override // f4.b0
    public void b(u1.y yVar, y2.q qVar, f4.h0 h0Var) {
    }
}

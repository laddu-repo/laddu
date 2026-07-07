package sc;

import ab.d;
import ab.e;
import ab.f;
import ab.h;
import ac.l1;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import androidx.emoji2.text.c0;
import androidx.emoji2.text.e0;
import androidx.emoji2.text.s;
import androidx.fragment.app.q0;
import androidx.fragment.app.y;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c6.g0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.util.concurrent.ListenableFuture;
import com.livxow.tv.room.db.AppDatabase;
import da.b1;
import da.c1;
import da.d1;
import da.f0;
import da.h0;
import da.i0;
import da.o0;
import da.r0;
import dc.k;
import e2.a0;
import g6.r;
import h.d0;
import j6.o;
import j6.x;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import k8.g2;
import k8.k2;
import l2.l;
import o4.i1;
import o4.j1;
import o8.g;
import org.json.JSONObject;
import s2.p;
import t0.m0;
import t0.n;
import t0.o1;
import v.i;
import v6.m;
import w1.b0;
import w1.t;
import w2.j;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b implements g, cc.b, s, c7.b, com.bumptech.glide.load.data.c, j, n, j2.s, o, vf.s, l, p {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f11785v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f11786w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f11787x;

    public /* synthetic */ b(int i, Object obj) {
        this.f11785v = i;
        this.f11787x = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static sc.b E(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L2a java.lang.Error -> L2d java.io.IOException -> L2f
            sc.b r2 = new sc.b     // Catch: java.nio.channels.OverlappingFileLockException -> L24 java.lang.Error -> L26 java.io.IOException -> L28
            r3 = 28
            r4 = 0
            r2.<init>(r5, r0, r4, r3)     // Catch: java.nio.channels.OverlappingFileLockException -> L24 java.lang.Error -> L26 java.io.IOException -> L28
            return r2
        L24:
            r2 = move-exception
            goto L39
        L26:
            r2 = move-exception
            goto L39
        L28:
            r2 = move-exception
            goto L39
        L2a:
            r2 = move-exception
        L2b:
            r0 = r1
            goto L39
        L2d:
            r2 = move-exception
            goto L2b
        L2f:
            r2 = move-exception
            goto L2b
        L31:
            r2 = move-exception
        L32:
            r5 = r1
            r0 = r5
            goto L39
        L35:
            r2 = move-exception
            goto L32
        L37:
            r2 = move-exception
            goto L32
        L39:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L45
            r0.release()     // Catch: java.io.IOException -> L45
        L45:
            if (r5 == 0) goto L4a
            r5.close()     // Catch: java.io.IOException -> L4a
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sc.b.E(android.content.Context):sc.b");
    }

    @Override // w2.j
    public void A() {
        t tVar = (t) this.f11787x;
        byte[] bArr = b0.f13688c;
        tVar.getClass();
        tVar.H(bArr.length, bArr);
    }

    @Override // j2.s
    public p B(j2.o oVar, j2.l lVar) {
        return new b(((j2.s) this.f11786w).B(oVar, lVar), (List) this.f11787x, false, 27);
    }

    @Override // o8.g
    public o8.o C(Object obj) throws Throwable {
        FileWriter fileWriter;
        f fVar = (f) this.f11787x;
        JSONObject jSONObject = (JSONObject) ((ta.c) this.f11786w).f12522c.f12517v.submit(new e(0, this)).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            d dVarD = ((a9.g) fVar.f300c).D(jSONObject);
            s5.c cVar = (s5.c) fVar.f302e;
            long j8 = dVarD.f293c;
            cVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j8);
                fileWriter = new FileWriter((File) cVar.f11492w);
            } catch (Exception e7) {
                e = e7;
                fileWriter = null;
            } catch (Throwable th) {
                th = th;
                sa.f.b(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            try {
                try {
                    fileWriter.write(jSONObject.toString());
                    fileWriter.flush();
                } catch (Exception e10) {
                    e = e10;
                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                }
                sa.f.b(fileWriter, "Failed to close settings writer.");
                f.f(jSONObject, "Loaded settings: ");
                String str = ((h) fVar.f299b).f;
                SharedPreferences.Editor editorEdit = ((Context) fVar.f298a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                editorEdit.putString("existing_instance_identifier", str);
                editorEdit.apply();
                ((AtomicReference) fVar.f304h).set(dVarD);
                ((o8.h) ((AtomicReference) fVar.i).get()).c(dVarD);
            } catch (Throwable th2) {
                th = th2;
                fileWriter2 = fileWriter;
                sa.f.b(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
        return b8.h.o(null);
    }

    @Override // j6.o
    public void D() {
        x xVar = (x) this.f11786w;
        synchronized (xVar) {
            xVar.f6983x = xVar.f6981v.length;
        }
    }

    public String F(a6.f fVar) {
        String str;
        e6.g gVar = (e6.g) ((hd.a) this.f11787x).k();
        try {
            fVar.a(gVar.f4858v);
            byte[] bArrDigest = gVar.f4858v.digest();
            char[] cArr = m.f13233b;
            synchronized (cArr) {
                for (int i = 0; i < bArrDigest.length; i++) {
                    byte b9 = bArrDigest[i];
                    int i10 = i * 2;
                    char[] cArr2 = m.f13232a;
                    cArr[i10] = cArr2[(b9 & 255) >>> 4];
                    cArr[i10 + 1] = cArr2[b9 & 15];
                }
                str = new String(cArr);
            }
            return str;
        } finally {
            ((hd.a) this.f11787x).e(gVar);
        }
    }

    public void G() {
        this.f11786w = null;
        this.f11787x = null;
    }

    public void H(boolean z2) {
        y yVar = ((q0) this.f11787x).f1087v;
        if (yVar != null) {
            yVar.l().f1077l.H(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f11786w).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void I(boolean z2) {
        q0 q0Var = (q0) this.f11787x;
        h.j jVar = q0Var.f1085t.f988y;
        y yVar = q0Var.f1087v;
        if (yVar != null) {
            yVar.l().f1077l.I(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f11786w).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void J(boolean z2) {
        y yVar = ((q0) this.f11787x).f1087v;
        if (yVar != null) {
            yVar.l().f1077l.J(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f11786w).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void K(boolean z2) {
        y yVar = ((q0) this.f11787x).f1087v;
        if (yVar != null) {
            yVar.l().f1077l.K(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f11786w).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void L(boolean z2) {
        y yVar = ((q0) this.f11787x).f1087v;
        if (yVar != null) {
            yVar.l().f1077l.L(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f11786w).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void M(boolean z2) {
        y yVar = ((q0) this.f11787x).f1087v;
        if (yVar != null) {
            yVar.l().f1077l.M(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f11786w).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void N(boolean z2) {
        q0 q0Var = (q0) this.f11787x;
        h.j jVar = q0Var.f1085t.f988y;
        y yVar = q0Var.f1087v;
        if (yVar != null) {
            yVar.l().f1077l.N(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f11786w).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void O(boolean z2) {
        y yVar = ((q0) this.f11787x).f1087v;
        if (yVar != null) {
            yVar.l().f1077l.O(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f11786w).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void P(boolean z2) {
        y yVar = ((q0) this.f11787x).f1087v;
        if (yVar != null) {
            yVar.l().f1077l.P(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f11786w).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void Q(boolean z2) {
        y yVar = ((q0) this.f11787x).f1087v;
        if (yVar != null) {
            yVar.l().f1077l.Q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f11786w).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void R(boolean z2) {
        y yVar = ((q0) this.f11787x).f1087v;
        if (yVar != null) {
            yVar.l().f1077l.R(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f11786w).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void S(boolean z2) {
        y yVar = ((q0) this.f11787x).f1087v;
        if (yVar != null) {
            yVar.l().f1077l.S(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f11786w).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void T(boolean z2) {
        y yVar = ((q0) this.f11787x).f1087v;
        if (yVar != null) {
            yVar.l().f1077l.T(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f11786w).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void U(boolean z2) {
        y yVar = ((q0) this.f11787x).f1087v;
        if (yVar != null) {
            yVar.l().f1077l.U(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f11786w).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public byte[] V(h3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f11787x;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f11786w;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f6114a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f6115b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f6116c);
            dataOutputStream.writeLong(aVar.f6117d);
            dataOutputStream.write(aVar.f6118e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    public View W(int i, int i10, int i11, int i12) {
        i1 i1Var = (i1) this.f11787x;
        j1 j1Var = (j1) this.f11786w;
        int iV = j1Var.v();
        int i13 = j1Var.i();
        int i14 = i10 > i ? 1 : -1;
        View view = null;
        while (i != i10) {
            View viewT = j1Var.t(i);
            int iK = j1Var.k(viewT);
            int iX = j1Var.x(viewT);
            i1Var.f9757b = iV;
            i1Var.f9758c = i13;
            i1Var.f9759d = iK;
            i1Var.f9760e = iX;
            if (i11 != 0) {
                i1Var.f9756a = i11;
                if (i1Var.a()) {
                    return viewT;
                }
            }
            if (i12 != 0) {
                i1Var.f9756a = i12;
                if (i1Var.a()) {
                    view = viewT;
                }
            }
            i += i14;
        }
        return view;
    }

    public Object X(d6.h hVar) {
        HashMap map = (HashMap) this.f11787x;
        d6.c cVar = (d6.c) map.get(hVar);
        if (cVar == null) {
            cVar = new d6.c(hVar);
            map.put(hVar, cVar);
        } else {
            hVar.a();
        }
        d6.c cVar2 = cVar.f4339d;
        cVar2.f4338c = cVar.f4338c;
        cVar.f4338c.f4339d = cVar2;
        d6.c cVar3 = (d6.c) this.f11786w;
        cVar.f4339d = cVar3;
        d6.c cVar4 = cVar3.f4338c;
        cVar.f4338c = cVar4;
        cVar4.f4339d = cVar;
        cVar.f4339d.f4338c = cVar;
        ArrayList arrayList = cVar.f4337b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return cVar.f4337b.remove(size - 1);
        }
        return null;
    }

    public String Y(a6.f fVar) {
        String strF;
        synchronized (((a0) this.f11786w)) {
            strF = (String) ((a0) this.f11786w).a(fVar);
        }
        if (strF == null) {
            strF = F(fVar);
        }
        synchronized (((a0) this.f11786w)) {
            ((a0) this.f11786w).d(fVar, strF);
        }
        return strF;
    }

    public boolean Z(View view) {
        i1 i1Var = (i1) this.f11787x;
        j1 j1Var = (j1) this.f11786w;
        int iV = j1Var.v();
        int i = j1Var.i();
        int iK = j1Var.k(view);
        int iX = j1Var.x(view);
        i1Var.f9757b = iV;
        i1Var.f9758c = i;
        i1Var.f9759d = iK;
        i1Var.f9760e = iX;
        i1Var.f9756a = 24579;
        return i1Var.a();
    }

    @Override // l2.l
    public void a(int i, a2.d dVar, long j8, int i10) {
        ((MediaCodec) this.f11786w).queueSecureInputBuffer(i, 0, dVar.i, j8, i10);
    }

    public void a0(m.a aVar) {
        sb.p pVar = (sb.p) this.f11786w;
        ((ActionMode.Callback) pVar.f11742w).onDestroyActionMode(pVar.n(aVar));
        d0 d0Var = (d0) this.f11787x;
        if (d0Var.R != null) {
            d0Var.G.getDecorView().removeCallbacks(d0Var.S);
        }
        if (d0Var.Q != null) {
            t0.q0 q0Var = d0Var.T;
            if (q0Var != null) {
                q0Var.b();
            }
            t0.q0 q0VarA = m0.a(d0Var.Q);
            q0VarA.a(0.0f);
            d0Var.T = q0VarA;
            q0VarA.d(new h.t(2, this));
        }
        d0Var.P = null;
        ViewGroup viewGroup = d0Var.W;
        WeakHashMap weakHashMap = m0.f11853a;
        t0.b0.c(viewGroup);
        d0Var.K();
    }

    @Override // l2.l
    public void b(Bundle bundle) {
        ((MediaCodec) this.f11786w).setParameters(bundle);
    }

    public boolean b0(m.a aVar, Menu menu) {
        ViewGroup viewGroup = ((d0) this.f11787x).W;
        WeakHashMap weakHashMap = m0.f11853a;
        t0.b0.c(viewGroup);
        sb.p pVar = (sb.p) this.f11786w;
        ActionMode.Callback callback = (ActionMode.Callback) pVar.f11742w;
        m.e eVarN = pVar.n(aVar);
        i iVar = (i) pVar.f11745z;
        Menu a0Var = (Menu) iVar.get(menu);
        if (a0Var == null) {
            a0Var = new n.a0((Context) pVar.f11743x, (n.l) menu);
            iVar.put(menu, a0Var);
        }
        return callback.onPrepareActionMode(eVarN, a0Var);
    }

    @Override // vf.s
    public vf.t c() {
        return (jf.g) this.f11787x;
    }

    public void c0(d6.h hVar, Object obj) {
        HashMap map = (HashMap) this.f11787x;
        d6.c cVar = (d6.c) map.get(hVar);
        if (cVar == null) {
            cVar = new d6.c(hVar);
            cVar.f4339d = cVar;
            d6.c cVar2 = (d6.c) this.f11786w;
            cVar.f4339d = cVar2.f4339d;
            cVar.f4338c = cVar2;
            cVar2.f4339d = cVar;
            cVar.f4339d.f4338c = cVar;
            map.put(hVar, cVar);
        } else {
            hVar.a();
        }
        if (cVar.f4337b == null) {
            cVar.f4337b = new ArrayList();
        }
        cVar.f4337b.add(obj);
    }

    @Override // l2.l
    public void d(int i, int i10, long j8, int i11) {
        ((MediaCodec) this.f11786w).queueInputBuffer(i, 0, i10, j8, i11);
    }

    public void d0() {
        try {
            ((FileLock) this.f11787x).release();
            ((FileChannel) this.f11786w).close();
        } catch (IOException e7) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e7);
        }
    }

    @Override // l2.l
    public int e(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = ((MediaCodec) this.f11786w).dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    public Object e0() {
        d6.c cVar = (d6.c) this.f11786w;
        d6.c cVar2 = cVar.f4339d;
        while (true) {
            boolean zEquals = cVar2.equals(cVar);
            Object obj = cVar2.f4336a;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = cVar2.f4337b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? cVar2.f4337b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            d6.c cVar3 = cVar2.f4339d;
            cVar3.f4338c = cVar2.f4338c;
            cVar2.f4338c.f4339d = cVar3;
            ((HashMap) this.f11787x).remove(obj);
            ((d6.h) obj).a();
            cVar2 = cVar2.f4339d;
        }
    }

    @Override // j6.o
    public void f(Bitmap bitmap, d6.a aVar) throws IOException {
        IOException iOException = ((v6.e) this.f11787x).f13220w;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            aVar.f(bitmap);
            throw iOException;
        }
    }

    public ListenableFuture f0(da.a0 a0Var, Executor executor) {
        executor.getClass();
        final i0 i0Var = new i0(h0.f4420v);
        i0Var.f4426w = executor;
        i0Var.f4425v = this;
        k2 k2Var = new k2(i0Var, a0Var, false, 10);
        final b1 b1Var = new b1();
        final ListenableFuture listenableFuture = (ListenableFuture) ((AtomicReference) this.f11786w).getAndSet(b1Var);
        final d1 d1Var = new d1();
        d1Var.D = new c1(d1Var, k2Var);
        listenableFuture.f(d1Var, i0Var);
        final ListenableFuture listenableFutureE = o0.e(d1Var);
        Runnable runnable = new Runnable() { // from class: da.g0
            @Override // java.lang.Runnable
            public final void run() {
                d1 d1Var2 = d1Var;
                if (d1Var2.isDone()) {
                    b1Var.o(listenableFuture);
                    return;
                }
                if (listenableFutureE.isCancelled()) {
                    int i = i0.f4424z;
                    if (i0Var.compareAndSet(h0.f4420v, h0.f4421w)) {
                        d1Var2.cancel(false);
                    }
                }
            }
        };
        f0 f0Var = f0.f4407v;
        listenableFutureE.f(runnable, f0Var);
        d1Var.f(runnable, f0Var);
        return listenableFutureE;
    }

    @Override // l2.l
    public void flush() {
        ((MediaCodec) this.f11786w).flush();
    }

    @Override // androidx.emoji2.text.s
    public Object g() {
        return (e0) this.f11786w;
    }

    @Override // nd.a
    public Object get() {
        switch (this.f11785v) {
            case 2:
                return new ac.h0((Context) ((cc.c) this.f11786w).f2288v, (l1) ((cc.d) this.f11787x).get());
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                return new b7.d((Context) ((a9.g) this.f11786w).f273w, (a7.j) ((a9.g) this.f11787x).get());
            default:
                return new k((dc.p) ((cc.d) this.f11786w).get(), (dc.p) ((cc.d) this.f11787x).get());
        }
    }

    @Override // l2.l
    public void h(int i) {
        ((MediaCodec) this.f11786w).releaseOutputBuffer(i, false);
    }

    @Override // androidx.emoji2.text.s
    public boolean i(CharSequence charSequence, int i, int i10, androidx.emoji2.text.b0 b0Var) {
        if ((b0Var.f891c & 4) > 0) {
            return true;
        }
        if (((e0) this.f11786w) == null) {
            this.f11786w = new e0(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((oa.b) this.f11787x).getClass();
        ((e0) this.f11786w).setSpan(new c0(b0Var), i, i10, 33);
        return true;
    }

    @Override // s2.p
    public Object j(Uri uri, y1.j jVar) {
        n2.a aVar = (n2.a) ((p) this.f11786w).j(uri, jVar);
        List list = (List) this.f11787x;
        return (list == null || list.isEmpty()) ? aVar : (n2.a) aVar.a(list);
    }

    @Override // com.bumptech.glide.load.data.c
    public void k(Exception exc) {
        g0 g0Var = (g0) this.f11787x;
        r rVar = (r) this.f11786w;
        r rVar2 = g0Var.A;
        if (rVar2 == null || rVar2 != rVar) {
            return;
        }
        g0 g0Var2 = (g0) this.f11787x;
        r rVar3 = (r) this.f11786w;
        c6.j jVar = g0Var2.f2173w;
        c6.e eVar = g0Var2.B;
        com.bumptech.glide.load.data.d dVar = rVar3.f5696c;
        jVar.a(eVar, exc, dVar, dVar.d());
    }

    @Override // l2.l
    public void l(int i) {
        ((MediaCodec) this.f11786w).setVideoScalingMode(i);
    }

    @Override // l2.l
    public void m(u2.j jVar, Handler handler) {
        ((MediaCodec) this.f11786w).setOnFrameRenderedListener(new l2.b(this, jVar, 1), handler);
    }

    @Override // t0.n
    public o1 n(View view, o1 o1Var) {
        i5.h hVar = (i5.h) this.f11787x;
        o1 o1VarI = m0.i(view, o1Var);
        if (o1VarI.f11861a.n()) {
            return o1VarI;
        }
        Rect rect = (Rect) this.f11786w;
        rect.left = o1VarI.b();
        rect.top = o1VarI.d();
        rect.right = o1VarI.c();
        rect.bottom = o1VarI.a();
        int childCount = hVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            o1 o1VarB = m0.b(hVar.getChildAt(i), o1VarI);
            rect.left = Math.min(o1VarB.b(), rect.left);
            rect.top = Math.min(o1VarB.d(), rect.top);
            rect.right = Math.min(o1VarB.c(), rect.right);
            rect.bottom = Math.min(o1VarB.a(), rect.bottom);
        }
        return o1VarI.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // l2.l
    public MediaFormat o() {
        return ((MediaCodec) this.f11786w).getOutputFormat();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011c A[EDGE_INSN: B:68:0x011c->B:52:0x011c BREAK  A[LOOP:1: B:38:0x00e3->B:51:0x010b], SYNTHETIC] */
    @Override // w2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public w2.i p(w2.p r17, long r18) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sc.b.p(w2.p, long):w2.i");
    }

    @Override // com.bumptech.glide.load.data.c
    public void q(Object obj) {
        g0 g0Var = (g0) this.f11787x;
        r rVar = (r) this.f11786w;
        r rVar2 = g0Var.A;
        if (rVar2 == null || rVar2 != rVar) {
            return;
        }
        g0 g0Var2 = (g0) this.f11787x;
        r rVar3 = (r) this.f11786w;
        c6.l lVar = g0Var2.f2172v.f2190p;
        if (obj != null && lVar.a(rVar3.f5696c.d())) {
            g0Var2.f2176z = obj;
            g0Var2.f2173w.o(2);
        } else {
            c6.j jVar = g0Var2.f2173w;
            a6.f fVar = rVar3.f5694a;
            com.bumptech.glide.load.data.d dVar = rVar3.f5696c;
            jVar.b(fVar, obj, dVar, dVar.d(), g0Var2.B);
        }
    }

    @Override // l2.l
    public void r() {
        ((MediaCodec) this.f11786w).detachOutputSurface();
    }

    @Override // l2.l
    public void release() {
        hd.a aVar = (hd.a) this.f11787x;
        MediaCodec mediaCodec = (MediaCodec) this.f11786w;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && aVar != null) {
                aVar.L(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && aVar != null) {
                aVar.L(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // l2.l
    public ByteBuffer s(int i) {
        return ((MediaCodec) this.f11786w).getInputBuffer(i);
    }

    @Override // l2.l
    public void t(Surface surface) {
        ((MediaCodec) this.f11786w).setOutputSurface(surface);
    }

    public String toString() {
        switch (this.f11785v) {
            case 10:
                StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
                d6.c cVar = (d6.c) this.f11786w;
                d6.c cVar2 = cVar.f4338c;
                boolean z2 = false;
                while (!cVar2.equals(cVar)) {
                    sb2.append('{');
                    sb2.append(cVar2.f4336a);
                    sb2.append(':');
                    ArrayList arrayList = cVar2.f4337b;
                    sb2.append(arrayList != null ? arrayList.size() : 0);
                    sb2.append("}, ");
                    cVar2 = cVar2.f4338c;
                    z2 = true;
                }
                if (z2) {
                    sb2.delete(sb2.length() - 2, sb2.length());
                }
                sb2.append(" )");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // l2.l
    public ByteBuffer u(int i) {
        return ((MediaCodec) this.f11786w).getOutputBuffer(i);
    }

    @Override // j2.s
    public p v() {
        return new b(((j2.s) this.f11786w).v(), (List) this.f11787x, false, 27);
    }

    @Override // l2.l
    public void w(int i, long j8) {
        ((MediaCodec) this.f11786w).releaseOutputBuffer(i, j8);
    }

    @Override // vf.s
    public vf.r x() {
        return (jf.f) this.f11786w;
    }

    @Override // l2.l
    public /* synthetic */ boolean y(g2 g2Var) {
        return false;
    }

    @Override // l2.l
    public int z() {
        return ((MediaCodec) this.f11786w).dequeueInputBuffer(0L);
    }

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.f11785v = i;
        this.f11787x = obj;
        this.f11786w = obj2;
    }

    public /* synthetic */ b(Object obj, Object obj2, boolean z2, int i) {
        this.f11785v = i;
        this.f11786w = obj;
        this.f11787x = obj2;
    }

    public b(AppMeasurementSdk appMeasurementSdk, k2 k2Var) {
        this.f11785v = 25;
        this.f11787x = k2Var;
        appMeasurementSdk.a(new ka.b(0, this));
        this.f11786w = new HashSet();
    }

    public b(t7.k kVar) {
        this.f11785v = 8;
        this.f11786w = new HashMap();
        this.f11787x = kVar;
    }

    public b(SwipeRefreshLayout swipeRefreshLayout, SwipeRefreshLayout swipeRefreshLayout2, WebView webView) {
        this.f11785v = 21;
        this.f11786w = swipeRefreshLayout2;
        this.f11787x = webView;
    }

    public b(AppDatabase appDatabase) {
        this.f11785v = 0;
        this.f11786w = appDatabase;
        this.f11787x = new k8.b0(26);
    }

    public b(int i) {
        this.f11785v = i;
        switch (i) {
            case 10:
                this.f11786w = new d6.c(null);
                this.f11787x = new HashMap();
                break;
            case 11:
                this.f11786w = new AtomicReference(r0.f4441w);
                this.f11787x = new a7.j(19, false);
                break;
            case 14:
                this.f11786w = new a0(1000L);
                this.f11787x = w6.d.a(10, new oa.b(11));
                break;
            case 16:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f11786w = byteArrayOutputStream;
                this.f11787x = new DataOutputStream(byteArrayOutputStream);
                break;
        }
    }

    public b(q0 q0Var) {
        this.f11785v = 4;
        this.f11786w = new CopyOnWriteArrayList();
        this.f11787x = q0Var;
    }

    public b(Context context) {
        this.f11785v = 13;
        this.f11786w = context == null ? null : context.getApplicationContext();
    }

    public b(w1.y yVar) {
        this.f11785v = 9;
        this.f11786w = yVar;
        this.f11787x = new t();
    }

    public b(MediaCodec mediaCodec, hd.a aVar) {
        this.f11785v = 26;
        this.f11786w = mediaCodec;
        this.f11787x = aVar;
        if (Build.VERSION.SDK_INT < 35 || aVar == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) aVar.f6281y;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            w1.a.j(((HashSet) aVar.f6279w).add(mediaCodec));
        }
    }

    public b(j1 j1Var) {
        this.f11785v = 29;
        this.f11786w = j1Var;
        i1 i1Var = new i1();
        i1Var.f9756a = 0;
        this.f11787x = i1Var;
    }

    public b(c2.b bVar) {
        this.f11785v = 22;
        kf.f fVar = (kf.f) bVar.f1688y;
        this.f11786w = new jf.f(bVar, fVar.e().x(), -1L, true);
        this.f11787x = new jf.g(bVar, fVar.e().c(), -1L, true);
    }

    public b(EditText editText) {
        this.f11785v = 23;
        this.f11786w = editText;
        k1.i iVar = new k1.i(editText);
        this.f11787x = iVar;
        editText.addTextChangedListener(iVar);
        if (k1.a.f7257b == null) {
            synchronized (k1.a.f7256a) {
                try {
                    if (k1.a.f7257b == null) {
                        k1.a aVar = new k1.a();
                        try {
                            k1.a.f7258c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, k1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        k1.a.f7257b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(k1.a.f7257b);
    }

    public b(i5.h hVar) {
        this.f11785v = 18;
        this.f11787x = hVar;
        this.f11786w = new Rect();
    }
}

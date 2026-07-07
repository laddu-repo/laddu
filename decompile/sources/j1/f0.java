package j1;

import android.content.Context;
import android.graphics.Rect;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.SparseArray;
import android.view.Surface;
import android.view.View;
import androidx.lifecycle.j1;
import com.google.android.gms.internal.measurement.d4;
import com.playfy.tv.databinding.DonateDialogBinding;
import com.unity3d.services.UnityAdsConstants;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import n9.d2;
import n9.m2;
import n9.n1;
import n9.p3;
import n9.t3;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class f0 implements j2.m, j2.n, kf.h, kf.u0, u2.q, y2.q, t0.s, i8.b, hb.r, v6.j {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6906x;

    /* renamed from: y, reason: collision with root package name */
    public Object f6907y;

    /* renamed from: z, reason: collision with root package name */
    public Object f6908z;

    public /* synthetic */ f0(int i6, Object obj, Object obj2) {
        this.f6906x = i6;
        this.f6907y = obj;
        this.f6908z = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[Catch: IOException -> 0x006d, TryCatch #0 {IOException -> 0x006d, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:13:0x0042, B:15:0x003a, B:16:0x003d, B:27:0x0047, B:29:0x004a, B:32:0x005b), top: B:1:0x0000 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, bg.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j1.f0 V(java.lang.String... r12) {
        /*
            int r0 = r12.length     // Catch: java.io.IOException -> L6d
            bg.n[] r0 = new bg.n[r0]     // Catch: java.io.IOException -> L6d
            bg.k r1 = new bg.k     // Catch: java.io.IOException -> L6d
            r1.<init>()     // Catch: java.io.IOException -> L6d
            r2 = 0
            r3 = 0
        La:
            int r4 = r12.length     // Catch: java.io.IOException -> L6d
            if (r3 >= r4) goto L5b
            r4 = r12[r3]     // Catch: java.io.IOException -> L6d
            java.lang.String[] r5 = m7.a.B     // Catch: java.io.IOException -> L6d
            r6 = 34
            r1.l0(r6)     // Catch: java.io.IOException -> L6d
            int r7 = r4.length()     // Catch: java.io.IOException -> L6d
            r8 = 0
            r9 = 0
        L1c:
            if (r8 >= r7) goto L45
            char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L6d
            r11 = 128(0x80, float:1.8E-43)
            if (r10 >= r11) goto L2b
            r10 = r5[r10]     // Catch: java.io.IOException -> L6d
            if (r10 != 0) goto L38
            goto L42
        L2b:
            r11 = 8232(0x2028, float:1.1535E-41)
            if (r10 != r11) goto L32
            java.lang.String r10 = "\\u2028"
            goto L38
        L32:
            r11 = 8233(0x2029, float:1.1537E-41)
            if (r10 != r11) goto L42
            java.lang.String r10 = "\\u2029"
        L38:
            if (r9 >= r8) goto L3d
            r1.t0(r4, r9, r8)     // Catch: java.io.IOException -> L6d
        L3d:
            r1.s0(r10)     // Catch: java.io.IOException -> L6d
            int r9 = r8 + 1
        L42:
            int r8 = r8 + 1
            goto L1c
        L45:
            if (r9 >= r7) goto L4a
            r1.t0(r4, r9, r7)     // Catch: java.io.IOException -> L6d
        L4a:
            r1.l0(r6)     // Catch: java.io.IOException -> L6d
            r1.readByte()     // Catch: java.io.IOException -> L6d
            long r4 = r1.f1726y     // Catch: java.io.IOException -> L6d
            bg.n r4 = r1.g(r4)     // Catch: java.io.IOException -> L6d
            r0[r3] = r4     // Catch: java.io.IOException -> L6d
            int r3 = r3 + 1
            goto La
        L5b:
            j1.f0 r1 = new j1.f0     // Catch: java.io.IOException -> L6d
            java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L6d
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L6d
            bg.b0 r0 = bg.b.h(r0)     // Catch: java.io.IOException -> L6d
            r2 = 12
            r1.<init>(r2, r12, r0)     // Catch: java.io.IOException -> L6d
            return r1
        L6d:
            r12 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.f0.V(java.lang.String[]):j1.f0");
    }

    @Override // y2.q
    public y2.f0 A(int i6, int i10) {
        return (q2.y0) this.f6907y;
    }

    public synchronized void B() {
        if (!((LinkedHashSet) this.f6907y).isEmpty()) {
            ((nc.m) this.f6908z).e(0L);
        }
    }

    @Override // j2.m
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public j2.d q(androidx.lifecycle.d dVar) {
        MediaCodec mediaCodec;
        j2.d dVar2;
        int i6;
        String str = ((j2.q) dVar.f896a).f7091a;
        j2.d dVar3 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                dVar2 = new j2.d(mediaCodec, (HandlerThread) ((j2.c) this.f6907y).get(), new j2.g(mediaCodec, (HandlerThread) ((j2.c) this.f6908z).get()), (j1) dVar.f901f);
            } catch (Exception e10) {
                e = e10;
            }
            try {
                Trace.endSection();
                Surface surface = (Surface) dVar.f899d;
                if (surface == null && ((j2.q) dVar.f896a).f7098h && Build.VERSION.SDK_INT >= 35) {
                    i6 = 8;
                } else {
                    i6 = 0;
                }
                j2.d.h(dVar2, (MediaFormat) dVar.f897b, surface, (MediaCrypto) dVar.f900e, i6);
                return dVar2;
            } catch (Exception e11) {
                e = e11;
                dVar3 = dVar2;
                if (dVar3 == null) {
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                } else {
                    dVar3.a();
                }
                throw e;
            }
        } catch (Exception e12) {
            e = e12;
            mediaCodec = null;
        }
    }

    public void D(y f3, boolean z10) {
        kotlin.jvm.internal.k.e(f3, "f");
        y yVar = ((p0) this.f6907y).f6965y;
        if (yVar != null) {
            yVar.g().f6956o.D(f3, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f6908z).iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            if (z10) {
                e0Var.getClass();
            } else {
                f0 f0Var = e0Var.f6904a;
            }
        }
    }

    public void E(y f3, boolean z10) {
        kotlin.jvm.internal.k.e(f3, "f");
        p0 p0Var = (p0) this.f6907y;
        i.j jVar = p0Var.f6963w.B;
        y yVar = p0Var.f6965y;
        if (yVar != null) {
            yVar.g().f6956o.E(f3, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f6908z).iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            if (z10) {
                e0Var.getClass();
            } else {
                f0 f0Var = e0Var.f6904a;
            }
        }
    }

    public void F(y f3, boolean z10) {
        kotlin.jvm.internal.k.e(f3, "f");
        y yVar = ((p0) this.f6907y).f6965y;
        if (yVar != null) {
            yVar.g().f6956o.F(f3, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f6908z).iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            if (z10) {
                e0Var.getClass();
            } else {
                f0 f0Var = e0Var.f6904a;
            }
        }
    }

    public void G(y f3, boolean z10) {
        kotlin.jvm.internal.k.e(f3, "f");
        y yVar = ((p0) this.f6907y).f6965y;
        if (yVar != null) {
            yVar.g().f6956o.G(f3, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f6908z).iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            if (z10) {
                e0Var.getClass();
            } else {
                f0 f0Var = e0Var.f6904a;
                if (((WeakReference) f0Var.f6907y).get() == f3) {
                    j6.b bVar = (j6.b) f0Var.f6908z;
                    if (!j6.c.f7235c.post(new j2.h(bVar, 1))) {
                        bVar.b();
                    }
                }
            }
        }
    }

    public void H(y f3, boolean z10) {
        kotlin.jvm.internal.k.e(f3, "f");
        y yVar = ((p0) this.f6907y).f6965y;
        if (yVar != null) {
            yVar.g().f6956o.H(f3, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f6908z).iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            if (z10) {
                e0Var.getClass();
            } else {
                f0 f0Var = e0Var.f6904a;
            }
        }
    }

    public void I(y f3, boolean z10) {
        kotlin.jvm.internal.k.e(f3, "f");
        y yVar = ((p0) this.f6907y).f6965y;
        if (yVar != null) {
            yVar.g().f6956o.I(f3, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f6908z).iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            if (z10) {
                e0Var.getClass();
            } else {
                f0 f0Var = e0Var.f6904a;
            }
        }
    }

    public void J(y f3, boolean z10) {
        kotlin.jvm.internal.k.e(f3, "f");
        p0 p0Var = (p0) this.f6907y;
        i.j jVar = p0Var.f6963w.B;
        y yVar = p0Var.f6965y;
        if (yVar != null) {
            yVar.g().f6956o.J(f3, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f6908z).iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            if (z10) {
                e0Var.getClass();
            } else {
                f0 f0Var = e0Var.f6904a;
            }
        }
    }

    public void K(y f3, boolean z10) {
        kotlin.jvm.internal.k.e(f3, "f");
        y yVar = ((p0) this.f6907y).f6965y;
        if (yVar != null) {
            yVar.g().f6956o.K(f3, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f6908z).iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            if (z10) {
                e0Var.getClass();
            } else {
                f0 f0Var = e0Var.f6904a;
            }
        }
    }

    public void L(y f3, boolean z10) {
        kotlin.jvm.internal.k.e(f3, "f");
        y yVar = ((p0) this.f6907y).f6965y;
        if (yVar != null) {
            yVar.g().f6956o.L(f3, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f6908z).iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            if (z10) {
                e0Var.getClass();
            } else {
                f0 f0Var = e0Var.f6904a;
            }
        }
    }

    public void M(y f3, Bundle bundle, boolean z10) {
        kotlin.jvm.internal.k.e(f3, "f");
        y yVar = ((p0) this.f6907y).f6965y;
        if (yVar != null) {
            yVar.g().f6956o.M(f3, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f6908z).iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            if (z10) {
                e0Var.getClass();
            } else {
                f0 f0Var = e0Var.f6904a;
            }
        }
    }

    public void N(y f3, boolean z10) {
        kotlin.jvm.internal.k.e(f3, "f");
        y yVar = ((p0) this.f6907y).f6965y;
        if (yVar != null) {
            yVar.g().f6956o.N(f3, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f6908z).iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            if (z10) {
                e0Var.getClass();
            } else {
                f0 f0Var = e0Var.f6904a;
            }
        }
    }

    public void O(y f3, boolean z10) {
        kotlin.jvm.internal.k.e(f3, "f");
        y yVar = ((p0) this.f6907y).f6965y;
        if (yVar != null) {
            yVar.g().f6956o.O(f3, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f6908z).iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            if (z10) {
                e0Var.getClass();
            } else {
                f0 f0Var = e0Var.f6904a;
            }
        }
    }

    public void P(y f3, View v10, boolean z10) {
        kotlin.jvm.internal.k.e(f3, "f");
        kotlin.jvm.internal.k.e(v10, "v");
        y yVar = ((p0) this.f6907y).f6965y;
        if (yVar != null) {
            yVar.g().f6956o.P(f3, v10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f6908z).iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            if (z10) {
                e0Var.getClass();
            } else {
                f0 f0Var = e0Var.f6904a;
            }
        }
    }

    public void Q(y f3, boolean z10) {
        kotlin.jvm.internal.k.e(f3, "f");
        y yVar = ((p0) this.f6907y).f6965y;
        if (yVar != null) {
            yVar.g().f6956o.Q(f3, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f6908z).iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            if (z10) {
                e0Var.getClass();
            } else {
                f0 f0Var = e0Var.f6904a;
            }
        }
    }

    public byte[] R(j3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f6908z;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f6907y;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f7148a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f7149b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f7150c);
            dataOutputStream.writeLong(aVar.f7151d);
            dataOutputStream.write(aVar.f7152e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d A[Catch: JSONException -> 0x003d, TRY_ENTER, TRY_LEAVE, TryCatch #1 {JSONException -> 0x003d, blocks: (B:5:0x0013, B:7:0x002a, B:8:0x0040, B:13:0x005d, B:22:0x0075, B:24:0x007e, B:26:0x0088, B:28:0x008c, B:30:0x00a3, B:31:0x00aa, B:34:0x00ab, B:35:0x00b2, B:37:0x00b3, B:38:0x00ba), top: B:4:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e A[Catch: JSONException -> 0x003d, TryCatch #1 {JSONException -> 0x003d, blocks: (B:5:0x0013, B:7:0x002a, B:8:0x0040, B:13:0x005d, B:22:0x0075, B:24:0x007e, B:26:0x0088, B:28:0x008c, B:30:0x00a3, B:31:0x00aa, B:34:0x00ab, B:35:0x00b2, B:37:0x00b3, B:38:0x00ba), top: B:4:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v2, types: [qc.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public qc.d S(nc.g r14) {
        /*
            r13 = this;
            java.lang.String r0 = ""
            org.json.JSONArray r1 = r14.f9623g
            long r2 = r14.f9622f
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>()
            r4 = 0
            r5 = 0
        Ld:
            int r6 = r1.length()
            if (r5 >= r6) goto Lc3
            org.json.JSONObject r6 = r1.getJSONObject(r5)     // Catch: org.json.JSONException -> L3d
            java.lang.String r7 = "rolloutId"
            java.lang.String r7 = r6.getString(r7)     // Catch: org.json.JSONException -> L3d
            java.lang.String r8 = "affectedParameterKeys"
            org.json.JSONArray r8 = r6.getJSONArray(r8)     // Catch: org.json.JSONException -> L3d
            int r9 = r8.length()     // Catch: org.json.JSONException -> L3d
            r10 = 1
            if (r9 <= r10) goto L40
            java.lang.String r9 = "FirebaseRemoteConfig"
            java.lang.String r11 = "Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s"
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch: org.json.JSONException -> L3d
            r12[r4] = r7     // Catch: org.json.JSONException -> L3d
            r12[r10] = r8     // Catch: org.json.JSONException -> L3d
            java.lang.String r11 = java.lang.String.format(r11, r12)     // Catch: org.json.JSONException -> L3d
            android.util.Log.w(r9, r11)     // Catch: org.json.JSONException -> L3d
            goto L40
        L3d:
            r14 = move-exception
            goto Lbb
        L40:
            java.lang.String r8 = r8.optString(r4, r0)     // Catch: org.json.JSONException -> L3d
            java.lang.Object r9 = r13.f6907y     // Catch: org.json.JSONException -> L3d
            nc.e r9 = (nc.e) r9     // Catch: org.json.JSONException -> L3d
            nc.g r9 = r9.c()     // Catch: org.json.JSONException -> L3d
            r11 = 0
            if (r9 != 0) goto L51
        L4f:
            r9 = r11
            goto L5a
        L51:
            org.json.JSONObject r9 = r9.f9618b     // Catch: org.json.JSONException -> L58
            java.lang.String r9 = r9.getString(r8)     // Catch: org.json.JSONException -> L58
            goto L5a
        L58:
            goto L4f
        L5a:
            if (r9 == 0) goto L5d
            goto L75
        L5d:
            java.lang.Object r9 = r13.f6908z     // Catch: org.json.JSONException -> L3d
            nc.e r9 = (nc.e) r9     // Catch: org.json.JSONException -> L3d
            nc.g r9 = r9.c()     // Catch: org.json.JSONException -> L3d
            if (r9 != 0) goto L68
            goto L70
        L68:
            org.json.JSONObject r9 = r9.f9618b     // Catch: org.json.JSONException -> L6f
            java.lang.String r11 = r9.getString(r8)     // Catch: org.json.JSONException -> L6f
            goto L70
        L6f:
        L70:
            if (r11 == 0) goto L74
            r9 = r11
            goto L75
        L74:
            r9 = r0
        L75:
            int r11 = qc.e.f11203a     // Catch: org.json.JSONException -> L3d
            qc.b r11 = new qc.b     // Catch: org.json.JSONException -> L3d
            r11.<init>()     // Catch: org.json.JSONException -> L3d
            if (r7 == 0) goto Lb3
            r11.f11191a = r7     // Catch: org.json.JSONException -> L3d
            java.lang.String r7 = "variantId"
            java.lang.String r6 = r6.getString(r7)     // Catch: org.json.JSONException -> L3d
            if (r6 == 0) goto Lab
            r11.f11192b = r6     // Catch: org.json.JSONException -> L3d
            if (r8 == 0) goto La3
            r11.f11193c = r8     // Catch: org.json.JSONException -> L3d
            r11.f11194d = r9     // Catch: org.json.JSONException -> L3d
            r11.f11195e = r2     // Catch: org.json.JSONException -> L3d
            byte r6 = r11.f11196f     // Catch: org.json.JSONException -> L3d
            r6 = r6 | r10
            byte r6 = (byte) r6     // Catch: org.json.JSONException -> L3d
            r11.f11196f = r6     // Catch: org.json.JSONException -> L3d
            qc.c r6 = r11.a()     // Catch: org.json.JSONException -> L3d
            r14.add(r6)     // Catch: org.json.JSONException -> L3d
            int r5 = r5 + 1
            goto Ld
        La3:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch: org.json.JSONException -> L3d
            java.lang.String r0 = "Null parameterKey"
            r14.<init>(r0)     // Catch: org.json.JSONException -> L3d
            throw r14     // Catch: org.json.JSONException -> L3d
        Lab:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch: org.json.JSONException -> L3d
            java.lang.String r0 = "Null variantId"
            r14.<init>(r0)     // Catch: org.json.JSONException -> L3d
            throw r14     // Catch: org.json.JSONException -> L3d
        Lb3:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch: org.json.JSONException -> L3d
            java.lang.String r0 = "Null rolloutId"
            r14.<init>(r0)     // Catch: org.json.JSONException -> L3d
            throw r14     // Catch: org.json.JSONException -> L3d
        Lbb:
            mc.e r0 = new mc.e
            java.lang.String r1 = "Exception parsing rollouts metadata to create RolloutsState."
            r0.<init>(r1, r14)
            throw r0
        Lc3:
            qc.d r0 = new qc.d
            r0.<init>(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.f0.S(nc.g):qc.d");
    }

    public Object T(o7.b bVar) {
        return (b7.j0) this.f6908z;
    }

    public Object U(float f3, float f10, Object obj, Object obj2, float f11, float f12, float f13) {
        o7.b bVar = (o7.b) this.f6907y;
        bVar.f10027a = f3;
        bVar.f10028b = f10;
        bVar.f10032f = obj;
        bVar.f10033g = obj2;
        bVar.f10029c = f11;
        bVar.f10030d = f12;
        bVar.f10031e = f13;
        return T(bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x011b, code lost:
    
        if (r10.equals("L8") == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void W(j1.f0 r15) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.f0.W(j1.f0):void");
    }

    public void X() {
        boolean z10;
        m2.n nVar = (m2.n) this.f6908z;
        if (nVar.L == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        nVar.L = 1;
        nVar.O = false;
        long j = nVar.P;
        if (j != -9223372036854775807L) {
            nVar.y(u1.a0.e0(j));
        }
    }

    public void Y(q0.g gVar) {
        q0.l lVar = (q0.l) this.f6908z;
        u5.r rVar = (u5.r) this.f6907y;
        int i6 = gVar.f10812b;
        if (i6 == 0) {
            lVar.execute(new hb.s(28, rVar, gVar.f10811a));
        } else {
            lVar.execute(new com.google.android.material.datepicker.g(i6, 3, rVar));
        }
    }

    public y2.f0 Z(int i6) {
        int i10 = 0;
        while (true) {
            int[] iArr = (int[]) this.f6907y;
            if (i10 < iArr.length) {
                if (i6 == iArr[i10]) {
                    return ((q2.y0[]) this.f6908z)[i10];
                }
                i10++;
            } else {
                u1.a.g("BaseMediaChunkOutput", "Unmatched track of type: " + i6);
                return new y2.n();
            }
        }
    }

    @Override // j2.n
    public void a() {
        j1 j1Var = (j1) this.f6908z;
        MediaCodec mediaCodec = (MediaCodec) this.f6907y;
        try {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 30 && i6 < 33) {
                mediaCodec.stop();
            }
            if (i6 >= 35 && j1Var != null) {
                j1Var.z(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && j1Var != null) {
                j1Var.z(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    public void a0() {
        n1 n1Var = (n1) ((m2) this.f6908z).f4301y;
        n9.c1 c1Var = n1Var.B;
        n1.e(c1Var);
        SparseArray j12 = c1Var.j1();
        t3 t3Var = (t3) this.f6907y;
        j12.put(t3Var.f9491z, Long.valueOf(t3Var.f9490y));
        n9.c1 c1Var2 = n1Var.B;
        n1.e(c1Var2);
        int[] iArr = new int[j12.size()];
        long[] jArr = new long[j12.size()];
        for (int i6 = 0; i6 < j12.size(); i6++) {
            iArr[i6] = j12.keyAt(i6);
            jArr[i6] = ((Long) j12.valueAt(i6)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        c1Var2.L.E(bundle);
    }

    @Override // j2.n
    public void b(Bundle bundle) {
        ((MediaCodec) this.f6907y).setParameters(bundle);
    }

    @Override // j2.n
    public void c(int i6, y1.d dVar, long j, int i10) {
        ((MediaCodec) this.f6907y).queueSecureInputBuffer(i6, 0, dVar.f14809i, j, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Type inference failed for: r3v2, types: [ne.j, ve.p] */
    @Override // kf.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(kf.i r5, le.c r6) {
        /*
            r4 = this;
            int r0 = r4.f6906x
            switch(r0) {
                case 6: goto L87;
                case 7: goto L39;
                case 24: goto L1f;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f6907y
            kf.h r0 = (kf.h) r0
            kf.j0 r1 = new kf.j0
            java.lang.Object r2 = r4.f6908z
            od.x r2 = (od.x) r2
            r3 = 4
            r1.<init>(r3, r5, r2)
            java.lang.Object r5 = r0.collect(r1, r6)
            me.a r6 = me.a.f8833x
            if (r5 != r6) goto L1c
            goto L1e
        L1c:
            he.y r5 = he.y.f6101a
        L1e:
            return r5
        L1f:
            java.lang.Object r0 = r4.f6907y
            kf.h r0 = (kf.h) r0
            kf.j0 r1 = new kf.j0
            java.lang.Object r2 = r4.f6908z
            od.j r2 = (od.j) r2
            r3 = 3
            r1.<init>(r3, r5, r2)
            java.lang.Object r5 = r0.collect(r1, r6)
            me.a r6 = me.a.f8833x
            if (r5 != r6) goto L36
            goto L38
        L36:
            he.y r5 = he.y.f6101a
        L38:
            return r5
        L39:
            boolean r0 = r6 instanceof kf.j1
            if (r0 == 0) goto L4c
            r0 = r6
            kf.j1 r0 = (kf.j1) r0
            int r1 = r0.f7969z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L4c
            int r1 = r1 - r2
            r0.f7969z = r1
            goto L51
        L4c:
            kf.j1 r0 = new kf.j1
            r0.<init>(r4, r6)
        L51:
            java.lang.Object r6 = r0.f7967x
            int r1 = r0.f7969z
            r2 = 1
            if (r1 == 0) goto L66
            if (r1 == r2) goto L62
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L62:
            he.a.f(r6)
            goto L81
        L66:
            he.a.f(r6)
            java.lang.Object r6 = r4.f6907y
            kf.u0 r6 = (kf.u0) r6
            kf.i1 r1 = new kf.i1
            java.lang.Object r3 = r4.f6908z
            ne.j r3 = (ne.j) r3
            r1.<init>(r5, r3)
            r0.f7969z = r2
            java.lang.Object r5 = r6.collect(r1, r0)
            me.a r6 = me.a.f8833x
            if (r5 != r6) goto L81
            return r6
        L81:
            a2.x0 r5 = new a2.x0
            r5.<init>()
            throw r5
        L87:
            java.lang.Object r0 = r4.f6907y
            kf.h r0 = (kf.h) r0
            kf.j0 r1 = new kf.j0
            java.lang.Object r2 = r4.f6908z
            r3 = 1
            r1.<init>(r3, r5, r2)
            java.lang.Object r5 = r0.collect(r1, r6)
            me.a r6 = me.a.f8833x
            if (r5 != r6) goto L9c
            goto L9e
        L9c:
            he.y r5 = he.y.f6101a
        L9e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.f0.collect(kf.i, le.c):java.lang.Object");
    }

    @Override // j2.n
    public void d(int i6, int i10, long j, int i11) {
        ((MediaCodec) this.f6907y).queueInputBuffer(i6, 0, i10, j, i11);
    }

    @Override // j2.n
    public /* synthetic */ boolean e(lc.c cVar) {
        return false;
    }

    @Override // j2.n
    public void f(int i6) {
        ((MediaCodec) this.f6907y).releaseOutputBuffer(i6, false);
    }

    @Override // j2.n
    public void flush() {
        ((MediaCodec) this.f6907y).flush();
    }

    @Override // j2.n
    public MediaFormat g() {
        return ((MediaCodec) this.f6907y).getOutputFormat();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [p8.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [p8.a, java.lang.Object] */
    @Override // ge.a
    public Object get() {
        ?? obj = new Object();
        ?? obj2 = new Object();
        Object obj3 = ((ge.a) this.f6907y).get();
        ge.a aVar = (ge.a) this.f6908z;
        return new n8.g(obj, obj2, n8.a.f9130f, (n8.i) obj3, aVar);
    }

    @Override // u2.q
    public Object h(Uri uri, w1.k kVar) {
        l2.a aVar = (l2.a) ((u2.q) this.f6907y).h(uri, kVar);
        List list = (List) this.f6908z;
        if (list != null && !list.isEmpty()) {
            return (l2.a) aVar.a(list);
        }
        return aVar;
    }

    @Override // v6.j
    public void i() {
        ((DonateDialogBinding) this.f6907y).f3252f.setVisibility(8);
    }

    @Override // j2.n
    public void j() {
        j2.a.d((MediaCodec) this.f6907y);
    }

    @Override // j2.n
    public void k(int i6, long j) {
        ((MediaCodec) this.f6907y).releaseOutputBuffer(i6, j);
    }

    @Override // j2.n
    public int o() {
        return ((MediaCodec) this.f6907y).dequeueInputBuffer(0L);
    }

    @Override // hb.r
    public void onSuccess(Object obj) {
        m2 m2Var = (m2) this.f6908z;
        m2Var.d1();
        a0();
        m2Var.G = false;
        m2Var.H = 1;
        n9.u0 u0Var = ((n1) m2Var.f4301y).C;
        n1.g(u0Var);
        u0Var.K.b(((t3) this.f6907y).f9489x, "Successfully registered trigger URI");
        m2Var.B1();
    }

    @Override // j2.n
    public void p(w2.j jVar, Handler handler) {
        d4.C((MediaCodec) this.f6907y, new j2.b(this, jVar, 1), handler);
    }

    @Override // j2.n
    public int s(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = ((MediaCodec) this.f6907y).dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // y2.q
    public void t() {
        m2.s sVar = (m2.s) this.f6908z;
        sVar.f8541y.post(new m2.p(sVar, 0));
    }

    @Override // j2.n
    public void u(int i6) {
        ((MediaCodec) this.f6907y).setVideoScalingMode(i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012a  */
    @Override // t0.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t0.w1 v(android.view.View r20, t0.w1 r21) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.f0.v(android.view.View, t0.w1):t0.w1");
    }

    @Override // hb.r
    public void w(Throwable th) {
        t3 t3Var = (t3) this.f6907y;
        m2 m2Var = (m2) this.f6908z;
        m2Var.d1();
        m2Var.G = false;
        n1 n1Var = (n1) m2Var.f4301y;
        n9.g gVar = n1Var.A;
        n9.u0 u0Var = n1Var.C;
        int i6 = 2;
        if (gVar.n1(null, n9.e0.U0)) {
            String message = th.getMessage();
            m2Var.L = false;
            if (message != null) {
                if (!(th instanceof IllegalStateException) && !message.contains("garbage collected") && !th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                    if ((th instanceof SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                        i6 = 3;
                    }
                } else {
                    if (message.contains("Background")) {
                        m2Var.L = true;
                    }
                    i6 = 1;
                }
            }
        }
        int i10 = i6 - 1;
        if (i10 != 0) {
            if (i10 != 1) {
                n1.g(u0Var);
                u0Var.D.c(n9.u0.l1(n1Var.l().j1()), th, "registerTriggerAsync failed. Dropping URI. App ID, Throwable");
                a0();
                m2Var.H = 1;
                m2Var.B1();
                return;
            }
            m2Var.A1().add(t3Var);
            if (m2Var.H > ((Integer) n9.e0.f9280x0.a(null)).intValue()) {
                m2Var.H = 1;
                n1.g(u0Var);
                u0Var.G.c(n9.u0.l1(n1Var.l().j1()), n9.u0.l1(th.toString()), "registerTriggerAsync failed. May try later. App ID, throwable");
                return;
            }
            n1.g(u0Var);
            u0Var.G.d("registerTriggerAsync failed. App ID, delay in seconds, throwable", n9.u0.l1(n1Var.l().j1()), n9.u0.l1(String.valueOf(m2Var.H)), n9.u0.l1(th.toString()));
            int i11 = m2Var.H;
            if (m2Var.I == null) {
                m2Var.I = new d2(m2Var, n1Var, 1);
            }
            m2Var.I.b(i11 * 1000);
            int i12 = m2Var.H;
            m2Var.H = i12 + i12;
            return;
        }
        n1.g(u0Var);
        u0Var.G.c(n9.u0.l1(n1Var.l().j1()), n9.u0.l1(th.toString()), "registerTriggerAsync failed with retriable error. Will try later. App ID, throwable");
        m2Var.H = 1;
        m2Var.A1().add(t3Var);
    }

    @Override // j2.n
    public ByteBuffer x(int i6) {
        return ((MediaCodec) this.f6907y).getInputBuffer(i6);
    }

    @Override // j2.n
    public void y(Surface surface) {
        d4.p((MediaCodec) this.f6907y, surface);
    }

    @Override // j2.n
    public ByteBuffer z(int i6) {
        return ((MediaCodec) this.f6907y).getOutputBuffer(i6);
    }

    public /* synthetic */ f0(Object obj, Object obj2, int i6, boolean z10) {
        this.f6906x = i6;
        this.f6908z = obj;
        this.f6907y = obj2;
    }

    public f0(p3 p3Var) {
        this.f6906x = 17;
        this.f6908z = p3Var;
    }

    public f0(p0 p0Var) {
        this.f6906x = 0;
        this.f6907y = p0Var;
        this.f6908z = new CopyOnWriteArrayList();
    }

    public f0(int i6) {
        this.f6906x = i6;
        switch (i6) {
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                this.f6907y = new Object();
                this.f6908z = null;
                return;
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
                return;
            default:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f6907y = byteArrayOutputStream;
                this.f6908z = new DataOutputStream(byteArrayOutputStream);
                return;
        }
    }

    @Override // v6.j
    public void onSuccess() {
        DonateDialogBinding donateDialogBinding = (DonateDialogBinding) this.f6908z;
        donateDialogBinding.f3252f.setVisibility(0);
        donateDialogBinding.f3251e.setVisibility(0);
    }

    public f0(b7.j0 j0Var) {
        this.f6906x = 22;
        this.f6907y = new Object();
        this.f6908z = j0Var;
    }

    public f0(bc.a aVar) {
        this.f6906x = 20;
        this.f6908z = Collections.synchronizedMap(new HashMap());
        this.f6907y = aVar;
    }

    public f0(jb.g gVar, cc.e eVar, nc.j jVar, nc.e eVar2, Context context, nc.o oVar, ScheduledExecutorService scheduledExecutorService) {
        this.f6906x = 19;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f6907y = linkedHashSet;
        this.f6908z = new nc.m(gVar, eVar, jVar, eVar2, context, linkedHashSet, oVar, scheduledExecutorService);
    }

    @Override // y2.q
    public void n(y2.z zVar) {
    }

    public f0(MediaCodec mediaCodec, j1 j1Var) {
        this.f6906x = 2;
        this.f6907y = mediaCodec;
        this.f6908z = j1Var;
        if (Build.VERSION.SDK_INT < 35 || j1Var == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) j1Var.A;
        if (loudnessCodecController == null || j2.a.e(loudnessCodecController, mediaCodec)) {
            u1.c.g(((HashSet) j1Var.f949y).add(mediaCodec));
        }
    }

    public f0(jf.h hVar, jf.e eVar) {
        this.f6906x = 26;
        jf.c cVar = jf.c.f7442x;
        jf.d dVar = jf.d.f7443x;
        this.f6907y = hVar;
        this.f6908z = eVar;
    }

    public f0(ArrayList arrayList, ArrayList arrayList2) {
        this.f6906x = 5;
        int size = arrayList.size();
        this.f6907y = new int[size];
        this.f6908z = new float[size];
        for (int i6 = 0; i6 < size; i6++) {
            ((int[]) this.f6907y)[i6] = ((Integer) arrayList.get(i6)).intValue();
            ((float[]) this.f6908z)[i6] = ((Float) arrayList2.get(i6)).floatValue();
        }
    }

    public f0(int i6, int i10) {
        this.f6906x = 5;
        this.f6907y = new int[]{i6, i10};
        this.f6908z = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
    }

    public f0(int i6, int i10, int i11) {
        this.f6906x = 5;
        this.f6907y = new int[]{i6, i10, i11};
        this.f6908z = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f};
    }

    public f0(j6.b bVar, y yVar) {
        this.f6906x = 4;
        this.f6908z = bVar;
        this.f6907y = new WeakReference(yVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f0(kf.u0 u0Var, ve.p pVar) {
        this.f6906x = 7;
        this.f6907y = u0Var;
        this.f6908z = (ne.j) pVar;
    }

    public f0(s5.g gVar) {
        this.f6906x = 29;
        this.f6908z = gVar;
        this.f6907y = new Rect();
    }

    public f0(m2.n nVar) {
        this.f6906x = 9;
        this.f6908z = nVar;
        this.f6907y = u1.a0.n(null);
    }
}

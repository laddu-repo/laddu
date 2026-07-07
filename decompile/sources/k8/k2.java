package k8;

import android.animation.Animator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.Surface;
import android.widget.LinearLayout;
import android.widget.Spinner;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.gms.internal.measurement.ke;
import com.google.android.gms.internal.measurement.mb;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k2 implements cc.b, bb.a, t3.m, d4.b0, da.a0, c7.b, t0.n, a6.l, l2.k {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7601v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f7602w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f7603x;

    public /* synthetic */ k2(int i, Object obj) {
        this.f7601v = i;
        this.f7602w = obj;
        this.f7603x = null;
    }

    public static j6.a0 q(ImageDecoder.Source source, int i, int i10, a6.i iVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new i6.b(i, i10, iVar));
        if (androidx.emoji2.text.b.w(drawableDecodeDrawable)) {
            return new j6.a0(2, androidx.emoji2.text.b.j(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    public void A(Exception exc, boolean z2) {
        this.f7603x = null;
        HashSet hashSet = (HashSet) this.f7602w;
        y9.f0 f0VarM = y9.f0.m(hashSet);
        hashSet.clear();
        y9.c0 c0VarO = f0VarM.listIterator(0);
        while (c0VarO.hasNext()) {
            h2.c cVar = (h2.c) c0VarO.next();
            cVar.getClass();
            cVar.k(exc, z2 ? 1 : 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0209, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, XmlPullParserException -> 0x0094, blocks: (B:20:0x0062, B:97:0x0209, B:28:0x0074, B:29:0x0082, B:31:0x0087, B:38:0x0097, B:46:0x00b1, B:41:0x00a0, B:44:0x00a9, B:47:0x00bf, B:51:0x00ce, B:53:0x00d6, B:54:0x00e0, B:63:0x0109, B:64:0x0110, B:65:0x0128, B:57:0x00e9, B:59:0x00f1, B:60:0x00ff, B:66:0x0129, B:68:0x0131, B:69:0x013f, B:72:0x0149, B:73:0x0154, B:74:0x016c, B:75:0x016d, B:78:0x0177, B:79:0x0182, B:80:0x019a, B:81:0x019b, B:83:0x01a3, B:84:0x01ac, B:87:0x01b6, B:88:0x01c0, B:89:0x01d8, B:90:0x01d9, B:93:0x01e3, B:94:0x01ed, B:95:0x0205, B:96:0x0206), top: B:105:0x0062 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void B(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.k2.B(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public ke C(o4.z0 z0Var, int i) {
        o4.k1 k1Var;
        ke keVar;
        v.i iVar = (v.i) this.f7602w;
        int iD = iVar.d(z0Var);
        if (iD >= 0 && (k1Var = (o4.k1) iVar.j(iD)) != null) {
            int i10 = k1Var.f9805a;
            if ((i10 & i) != 0) {
                int i11 = i10 & (~i);
                k1Var.f9805a = i11;
                if (i == 4) {
                    keVar = k1Var.f9806b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    keVar = k1Var.f9807c;
                }
                if ((i11 & 12) == 0) {
                    iVar.h(iD);
                    k1Var.f9805a = 0;
                    k1Var.f9806b = null;
                    k1Var.f9807c = null;
                    o4.k1.f9804d.e(k1Var);
                }
                return keVar;
            }
        }
        return null;
    }

    public void D(String str, long j8) throws IOException {
        de.i.e(str, "file");
        if (str.length() == 0) {
            throw new FileNotFoundException(str.concat(" file_not_found"));
        }
        if (j8 < 1) {
            return;
        }
        Context context = (Context) this.f7602w;
        de.i.e(context, "context");
        if (!z7.b.G(str)) {
            a.a.a(new File(str), j8);
            return;
        }
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if (scheme != null) {
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3143036) {
                if (iHashCode == 951530617 && scheme.equals("content")) {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "w");
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        throw new IOException("file_allocation_error");
                    }
                    if (j8 > 0) {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                            if (fileOutputStream.getChannel().size() == j8) {
                                return;
                            }
                            fileOutputStream.getChannel().position(j8 - 1);
                            fileOutputStream.write(1);
                            return;
                        } catch (Exception unused) {
                            throw new IOException("file_allocation_error");
                        }
                    }
                    return;
                }
            } else if (scheme.equals("file")) {
                String path = uri.getPath();
                if (path != null) {
                    str = path;
                }
                a.a.a(new File(str), j8);
                return;
            }
        }
        throw new IOException("file_allocation_error");
    }

    public void E(h2.c cVar) {
        ((HashSet) this.f7602w).add(cVar);
        if (((h2.c) this.f7603x) != null) {
            return;
        }
        this.f7603x = cVar;
        h2.s sVarF = cVar.f6059b.f();
        cVar.f6079x = sVarF;
        h2.a aVar = cVar.f6073r;
        int i = w1.b0.f13686a;
        sVarF.getClass();
        aVar.getClass();
        aVar.obtainMessage(1, new h2.b(o2.u.f9532b.getAndIncrement(), true, SystemClock.elapsedRealtime(), sVarF)).sendToTarget();
    }

    public void F(String str) {
        e6.b bVar;
        synchronized (this) {
            try {
                bVar = (e6.b) ((HashMap) this.f7602w).get(str);
                v6.f.c(bVar, "Argument must not be null");
                int i = bVar.f4845b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + bVar.f4845b);
                }
                int i10 = i - 1;
                bVar.f4845b = i10;
                if (i10 == 0) {
                    e6.b bVar2 = (e6.b) ((HashMap) this.f7602w).remove(str);
                    if (!bVar2.equals(bVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + bVar + ", but actually removed: " + bVar2 + ", safeKey: " + str);
                    }
                    ((s5.c) this.f7603x).G(bVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        bVar.f4844a.unlock();
    }

    public void G(int i) {
        synchronized (this.f7602w) {
        }
    }

    public void H(o4.z0 z0Var) {
        o4.k1 k1Var = (o4.k1) ((v.i) this.f7602w).get(z0Var);
        if (k1Var == null) {
            return;
        }
        k1Var.f9805a &= -2;
    }

    public void I(o4.z0 z0Var) {
        v.g gVar = (v.g) this.f7603x;
        int i = gVar.i() - 1;
        while (true) {
            if (i < 0) {
                break;
            }
            if (z0Var == gVar.j(i)) {
                Object[] objArr = gVar.f13015x;
                Object obj = objArr[i];
                Object obj2 = v.h.f13017a;
                if (obj != obj2) {
                    objArr[i] = obj2;
                    gVar.f13013v = true;
                }
            } else {
                i--;
            }
        }
        o4.k1 k1Var = (o4.k1) ((v.i) this.f7602w).remove(z0Var);
        if (k1Var != null) {
            k1Var.f9805a = 0;
            k1Var.f9806b = null;
            k1Var.f9807c = null;
            o4.k1.f9804d.e(k1Var);
        }
    }

    public void a(int i, cd.b bVar) {
        synchronized (this.f7602w) {
            ((LinkedHashMap) this.f7603x).put(Integer.valueOf(i), bVar);
        }
    }

    @Override // d4.b0
    public void b(w1.t tVar) {
        d4.e0 e0Var = (d4.e0) this.f7603x;
        SparseArray sparseArray = e0Var.f4106h;
        u3.f fVar = (u3.f) this.f7602w;
        if (tVar.x() == 0 && (tVar.x() & 128) != 0) {
            tVar.K(6);
            int iA = tVar.a() / 4;
            for (int i = 0; i < iA; i++) {
                tVar.h(fVar.f12868b, 0, 4);
                fVar.q(0);
                int i10 = fVar.i(16);
                fVar.t(3);
                if (i10 == 0) {
                    fVar.t(13);
                } else {
                    int i11 = fVar.i(13);
                    if (sparseArray.get(i11) == null) {
                        sparseArray.put(i11, new d4.c0(new cf.m(e0Var, i11)));
                        e0Var.f4111n++;
                    }
                }
            }
            if (e0Var.f4100a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // da.a0
    public ListenableFuture call() {
        da.i0 i0Var = (da.i0) this.f7602w;
        int i = da.i0.f4424z;
        if (i0Var.compareAndSet(da.h0.f4420v, da.h0.f4422x)) {
            return ((da.a0) this.f7603x).call();
        }
        da.p0 p0Var = da.p0.C;
        return p0Var != null ? p0Var : new da.p0();
    }

    public void d(o4.z0 z0Var, ke keVar) {
        v.i iVar = (v.i) this.f7602w;
        o4.k1 k1VarA = (o4.k1) iVar.get(z0Var);
        if (k1VarA == null) {
            k1VarA = o4.k1.a();
            iVar.put(z0Var, k1VarA);
        }
        k1VarA.f9807c = keVar;
        k1VarA.f9805a |= 8;
    }

    public void e() {
        int[] iArr = (int[]) this.f7602w;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f7603x = null;
    }

    public void f() {
        synchronized (this.f7602w) {
            ((LinkedHashMap) this.f7603x).clear();
        }
    }

    @Override // a6.l
    public int g(a6.i iVar) {
        return 2;
    }

    @Override // nd.a
    public Object get() {
        switch (this.f7601v) {
            case 2:
                return new ac.x0((ac.k1) ((cc.d) this.f7602w).get(), (ac.l1) ((cc.d) this.f7603x).get());
            default:
                kb.e eVar = new kb.e(15);
                t7.k kVar = new t7.k(14);
                Object obj = ((nd.a) this.f7602w).get();
                nd.a aVar = (nd.a) this.f7603x;
                return new h7.h(eVar, kVar, h7.a.f, (h7.j) obj, aVar);
        }
    }

    public boolean h(int i) {
        boolean zContainsKey;
        synchronized (this.f7602w) {
            zContainsKey = ((LinkedHashMap) this.f7603x).containsKey(Integer.valueOf(i));
        }
        return zContainsKey;
    }

    @Override // l2.k
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public l2.d k(mb mbVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        l2.d dVar;
        String str = ((l2.o) mbVar.f2888b).f8099a;
        l2.d dVar2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                dVar = new l2.d(mediaCodecCreateByCodecName, (HandlerThread) ((l2.c) this.f7602w).get(), new l2.f(mediaCodecCreateByCodecName, (HandlerThread) ((l2.c) this.f7603x).get()), (hd.a) mbVar.f2892g);
            } catch (Exception e7) {
                e = e7;
            }
            try {
                Trace.endSection();
                Surface surface = (Surface) mbVar.f2891e;
                l2.d.c(dVar, (MediaFormat) mbVar.f2889c, surface, (MediaCrypto) mbVar.f, (surface == null && ((l2.o) mbVar.f2888b).f8105h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
                return dVar;
            } catch (Exception e10) {
                e = e10;
                dVar2 = dVar;
                if (dVar2 != null) {
                    dVar2.release();
                } else if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw e;
            }
        } catch (Exception e11) {
            e = e11;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override // t3.m
    public /* synthetic */ t3.d j(byte[] bArr, int i, int i10) {
        return d0.d.a(this, bArr, i10);
    }

    @Override // a6.b
    public boolean l(Object obj, File file, a6.i iVar) {
        return ((j6.b) this.f7603x).l(new j6.d(((BitmapDrawable) ((c6.b0) obj).get()).getBitmap(), (d6.a) this.f7602w), file, iVar);
    }

    @Override // bb.a
    public StackTraceElement[] m(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        bb.a[] aVarArr = (bb.a[]) this.f7602w;
        StackTraceElement[] stackTraceElementArrM = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            bb.a aVar = aVarArr[i];
            if (stackTraceElementArrM.length <= 1024) {
                break;
            }
            stackTraceElementArrM = aVar.m(stackTraceElementArr);
        }
        return stackTraceElementArrM.length > 1024 ? ((oa.b) this.f7603x).m(stackTraceElementArrM) : stackTraceElementArrM;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    @Override // t0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t0.o1 n(android.view.View r20, t0.o1 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.Object r3 = r0.f7602w
            c6.f0 r3 = (c6.f0) r3
            java.lang.Object r4 = r0.f7603x
            b8.d r4 = (b8.d) r4
            int r5 = r4.f1575a
            int r6 = r4.f1576b
            int r4 = r4.f1577c
            t0.l1 r7 = r2.f11861a
            r8 = 519(0x207, float:7.27E-43)
            l0.c r8 = r7.f(r8)
            r9 = 32
            l0.c r7 = r7.f(r9)
            java.lang.Object r9 = r3.f2171w
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r9
            int r10 = r8.f7996b
            int r11 = r8.f7997c
            int r12 = r8.f7995a
            r9.f3372w = r10
            int r10 = r1.getLayoutDirection()
            r14 = 1
            if (r10 != r14) goto L37
            r10 = r14
            goto L38
        L37:
            r10 = 0
        L38:
            int r15 = r1.getPaddingBottom()
            int r16 = r1.getPaddingLeft()
            int r17 = r1.getPaddingRight()
            boolean r13 = r9.f3364o
            if (r13 == 0) goto L4f
            int r15 = r2.a()
            r9.f3371v = r15
            int r15 = r15 + r4
        L4f:
            boolean r4 = r9.f3365p
            if (r4 == 0) goto L5a
            if (r10 == 0) goto L57
            r4 = r6
            goto L58
        L57:
            r4 = r5
        L58:
            int r16 = r4 + r12
        L5a:
            r4 = r16
            boolean r14 = r9.f3366q
            if (r14 == 0) goto L66
            if (r10 == 0) goto L63
            goto L64
        L63:
            r5 = r6
        L64:
            int r17 = r5 + r11
        L66:
            r5 = r17
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            boolean r10 = r9.f3368s
            if (r10 == 0) goto L7b
            int r10 = r6.leftMargin
            if (r10 == r12) goto L7b
            r6.leftMargin = r12
            r18 = 1
            goto L7d
        L7b:
            r18 = 0
        L7d:
            boolean r10 = r9.f3369t
            if (r10 == 0) goto L89
            int r10 = r6.rightMargin
            if (r10 == r11) goto L89
            r6.rightMargin = r11
            r18 = 1
        L89:
            boolean r10 = r9.f3370u
            if (r10 == 0) goto L97
            int r10 = r6.topMargin
            int r8 = r8.f7996b
            if (r10 == r8) goto L97
            r6.topMargin = r8
            r14 = 1
            goto L99
        L97:
            r14 = r18
        L99:
            if (r14 == 0) goto L9e
            r1.setLayoutParams(r6)
        L9e:
            int r6 = r1.getPaddingTop()
            r1.setPadding(r4, r6, r5, r15)
            boolean r1 = r3.f2170v
            if (r1 == 0) goto Lad
            int r3 = r7.f7998d
            r9.f3362m = r3
        Lad:
            if (r13 != 0) goto Lb3
            if (r1 == 0) goto Lb2
            goto Lb3
        Lb2:
            return r2
        Lb3:
            r9.I()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.k2.n(android.view.View, t0.o1):t0.o1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0363 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // t3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o(byte[] r19, int r20, int r21, t3.l r22, w1.f r23) {
        /*
            Method dump skipped, instruction units count: 1062
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.k2.o(byte[], int, int, t3.l, w1.f):void");
    }

    public String p(String str, boolean z2) throws IOException {
        de.i.e(str, "file");
        Context context = (Context) this.f7602w;
        de.i.e(context, "context");
        if (!z7.b.G(str)) {
            return a.a.i(str, z2);
        }
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if (scheme != null) {
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3143036) {
                if (iHashCode == 951530617 && scheme.equals("content")) {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "w");
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        throw new IOException("FNC");
                    }
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return str;
                }
            } else if (scheme.equals("file")) {
                String path = uri.getPath();
                if (path != null) {
                    str = path;
                }
                return a.a.i(str, z2);
            }
        }
        throw new IOException("FNC");
    }

    public void r(c2.g gVar) {
        synchronized (gVar) {
        }
        Handler handler = (Handler) this.f7602w;
        if (handler != null) {
            handler.post(new androidx.fragment.app.d(12, this, gVar));
        }
    }

    public void s(int i) {
        int[] iArr = (int[]) this.f7602w;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f7602w = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f7602w = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f7602w;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    @Override // t3.m
    public int t() {
        return 1;
    }

    public String toString() {
        switch (this.f7601v) {
            case 10:
                return ((da.a0) this.f7603x).toString();
            default:
                return super.toString();
        }
    }

    public boolean u(String str) {
        de.i.e(str, "file");
        if (str.length() == 0) {
            return false;
        }
        try {
            ContentResolver contentResolver = ((Context) this.f7602w).getContentResolver();
            de.i.d(contentResolver, "getContentResolver(...)");
            a.a.n(str, contentResolver).close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.datatransport.cct.CctBackendFactory v(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.k2.v(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public void w(int i, int i10) {
        int[] iArr = (int[]) this.f7602w;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i11 = i + i10;
        s(i11);
        int[] iArr2 = (int[]) this.f7602w;
        System.arraycopy(iArr2, i, iArr2, i11, (iArr2.length - i) - i10);
        Arrays.fill((int[]) this.f7602w, i, i11, -1);
        ArrayList arrayList = (ArrayList) this.f7603x;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o4.f1 f1Var = (o4.f1) ((ArrayList) this.f7603x).get(size);
            int i12 = f1Var.f9714v;
            if (i12 >= i) {
                f1Var.f9714v = i12 + i10;
            }
        }
    }

    public void x(int i, int i10) {
        int[] iArr = (int[]) this.f7602w;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i11 = i + i10;
        s(i11);
        int[] iArr2 = (int[]) this.f7602w;
        System.arraycopy(iArr2, i11, iArr2, i, (iArr2.length - i) - i10);
        int[] iArr3 = (int[]) this.f7602w;
        Arrays.fill(iArr3, iArr3.length - i10, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f7603x;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o4.f1 f1Var = (o4.f1) ((ArrayList) this.f7603x).get(size);
            int i12 = f1Var.f9714v;
            if (i12 >= i) {
                if (i12 < i11) {
                    ((ArrayList) this.f7603x).remove(size);
                } else {
                    f1Var.f9714v = i12 - i10;
                }
            }
        }
    }

    public void y(Throwable th) {
        u2 u2Var = (u2) this.f7603x;
        u2Var.D();
        p1 p1Var = (p1) u2Var.f2053w;
        u2Var.E = false;
        u2Var.b0().add((b4) this.f7602w);
        if (u2Var.F > ((Integer) f0.f7530w0.a(null)).intValue()) {
            u2Var.F = 1;
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.E.c(v0.L(p1Var.q().J()), v0.L(th.toString()), "registerTriggerAsync failed. May try later. App ID, throwable");
            return;
        }
        v0 v0Var2 = p1Var.A;
        p1.l(v0Var2);
        v0Var2.E.d("registerTriggerAsync failed. App ID, delay in seconds, throwable", v0.L(p1Var.q().J()), v0.L(String.valueOf(u2Var.F)), v0.L(th.toString()));
        int i = u2Var.F;
        if (u2Var.G == null) {
            u2Var.G = new j2(u2Var, p1Var, 1);
        }
        u2Var.G.b(((long) i) * 1000);
        int i10 = u2Var.F;
        u2Var.F = i10 + i10;
    }

    public void z(int i, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            qa.b bVar = "clx".equals(bundle2.getString("_o")) ? (hd.a) this.f7602w : (g2) this.f7603x;
            if (bVar == null) {
                return;
            }
            bVar.B(string, bundle2);
        }
    }

    public /* synthetic */ k2(int i, Object obj, Object obj2) {
        this.f7601v = i;
        this.f7602w = obj2;
        this.f7603x = obj;
    }

    public /* synthetic */ k2(int i, boolean z2) {
        this.f7601v = i;
    }

    public /* synthetic */ k2(Object obj, Object obj2, boolean z2, int i) {
        this.f7601v = i;
        this.f7602w = obj;
        this.f7603x = obj2;
    }

    public k2(Context context, String str) {
        this.f7601v = 20;
        de.i.e(context, "context");
        de.i.e(str, "defaultTempDir");
        this.f7602w = context;
        this.f7603x = str;
    }

    public k2(bb.a[] aVarArr) {
        this.f7601v = 5;
        this.f7602w = aVarArr;
        this.f7603x = new oa.b(5);
    }

    public k2(LinearLayout linearLayout, SwitchCompat switchCompat, Spinner spinner) {
        this.f7601v = 19;
        this.f7602w = switchCompat;
        this.f7603x = spinner;
    }

    public k2(int i) {
        this.f7601v = i;
        switch (i) {
            case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f7602w = new Object();
                this.f7603x = new LinkedHashMap();
                break;
            case 12:
                this.f7602w = new HashMap();
                this.f7603x = new s5.c(10);
                break;
            case 14:
                this.f7602w = new HashSet();
                break;
            case 16:
                this.f7602w = Choreographer.getInstance();
                this.f7603x = Looper.myLooper();
                break;
            case 28:
                this.f7602w = new v.i(0);
                this.f7603x = new v.g();
                break;
            default:
                this.f7602w = new w1.t();
                this.f7603x = new c4.a();
                break;
        }
    }

    @Override // t3.m
    public /* synthetic */ void reset() {
    }

    public k2(MediaCodec.CryptoInfo cryptoInfo) {
        this.f7601v = 1;
        this.f7602w = cryptoInfo;
        this.f7603x = a2.c.g();
    }

    public k2(Handler handler, e2.i iVar) {
        this.f7601v = 11;
        if (iVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f7602w = handler;
        this.f7603x = iVar;
    }

    public k2(Animator animator) {
        this.f7601v = 3;
        this.f7602w = null;
        this.f7603x = animator;
    }

    public k2(ArrayList arrayList, ArrayList arrayList2) {
        this.f7601v = 21;
        int size = arrayList.size();
        this.f7602w = new int[size];
        this.f7603x = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f7602w)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f7603x)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public k2(int i, int i10) {
        this.f7601v = 21;
        this.f7602w = new int[]{i, i10};
        this.f7603x = new float[]{0.0f, 1.0f};
    }

    public k2(int i, int i10, int i11) {
        this.f7601v = 21;
        this.f7602w = new int[]{i, i10, i11};
        this.f7603x = new float[]{0.0f, 0.5f, 1.0f};
    }

    public k2(d4.e0 e0Var) {
        this.f7601v = 9;
        this.f7603x = e0Var;
        this.f7602w = new u3.f(4, new byte[4]);
    }

    @Override // d4.b0
    public void c(w1.y yVar, w2.q qVar, d4.g0 g0Var) {
    }
}

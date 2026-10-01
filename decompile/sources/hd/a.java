package hd;

import ad.e;
import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import c6.b0;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.h;
import com.google.firebase.messaging.FirebaseMessagingService;
import d6.f;
import da.f0;
import de.i;
import fc.l;
import j6.r;
import j6.x;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import jd.o;
import k0.k;
import k8.g2;
import k8.k2;
import k8.k4;
import k8.p1;
import k8.w2;
import k8.x0;
import o.p0;
import o8.c;
import qa.b;
import sb.p;
import t7.j;
import t7.m;
import v0.g;
import v7.d;
import vf.n;
import vf.s;
import vf.t;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a implements s, w2, x0, o6.a, c, b, qa.a, g, s0.c {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static a f6277z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f6278v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f6279w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f6280x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f6281y;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i) {
        this.f6278v = i;
        this.f6279w = obj;
        this.f6280x = obj2;
        this.f6281y = obj3;
    }

    public static a I(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new a(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public static a m(View view) {
        int i = l.swipeImageView;
        ImageView imageView = (ImageView) a.a.k(view, i);
        if (imageView != null) {
            CardView cardView = (CardView) view;
            int i10 = l.swipeTextView;
            TextView textView = (TextView) a.a.k(view, i10);
            if (textView != null) {
                return new a(imageView, cardView, textView, 8);
            }
            i = i10;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public void A(int i, e eVar, o oVar) {
        i.e(eVar, "download");
        i.e(oVar, "reason");
        synchronized (this.f6280x) {
            z(i, oVar).a(((a9.g) this.f6279w).C(i, eVar), eVar, oVar);
        }
    }

    @Override // qa.b
    public void B(String str, Bundle bundle) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f6281y;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    public ImageHeaderParser$ImageType C() throws Throwable {
        x xVar;
        switch (this.f6278v) {
            case 3:
                return a.a.p((List) this.f6280x, v6.b.c((ByteBuffer) this.f6279w));
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                List list = (List) this.f6281y;
                x xVar2 = (x) ((h) this.f6279w).f2386w;
                xVar2.reset();
                return a.a.o(list, xVar2, (f) this.f6280x);
            default:
                List list2 = (List) this.f6280x;
                h hVar = (h) this.f6281y;
                f fVar = (f) this.f6279w;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    a6.e eVar = (a6.e) list2.get(i);
                    x xVar3 = null;
                    try {
                        xVar = new x(new FileInputStream(hVar.d().getFileDescriptor()), fVar);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        ImageHeaderParser$ImageType imageHeaderParser$ImageTypeE = eVar.e(xVar);
                        xVar.i();
                        hVar.d();
                        if (imageHeaderParser$ImageTypeE != ImageHeaderParser$ImageType.UNKNOWN) {
                            return imageHeaderParser$ImageTypeE;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        xVar3 = xVar;
                        if (xVar3 != null) {
                            xVar3.i();
                        }
                        hVar.d();
                        throw th;
                    }
                    break;
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x039d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0615 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023d  */
    /* JADX WARN: Type inference failed for: r0v123 */
    /* JADX WARN: Type inference failed for: r0v124, types: [int] */
    /* JADX WARN: Type inference failed for: r0v200 */
    /* JADX WARN: Type inference failed for: r0v201 */
    /* JADX WARN: Type inference failed for: r0v202 */
    /* JADX WARN: Type inference failed for: r0v203 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean D() {
        /*
            Method dump skipped, instruction units count: 1686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.a.D():boolean");
    }

    /* JADX WARN: Finally extract failed */
    public boolean E() throws Throwable {
        x xVar;
        switch (this.f6278v) {
            case 3:
                List list = (List) this.f6280x;
                ByteBuffer byteBufferC = v6.b.c((ByteBuffer) this.f6279w);
                f fVar = (f) this.f6281y;
                if (byteBufferC == null) {
                    return false;
                }
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    try {
                        if (((a6.e) list.get(i)).b(byteBufferC, fVar)) {
                            return true;
                        }
                    } finally {
                    }
                }
                return false;
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                List list2 = (List) this.f6281y;
                x xVar2 = (x) ((h) this.f6279w).f2386w;
                xVar2.reset();
                f fVar2 = (f) this.f6280x;
                xVar2.mark(5242880);
                int size2 = list2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    try {
                        boolean zD = ((a6.e) list2.get(i10)).d(xVar2, fVar2);
                        xVar2.reset();
                        if (zD) {
                            return true;
                        }
                    } catch (Throwable th) {
                        xVar2.reset();
                        throw th;
                    }
                }
                return false;
            default:
                List list3 = (List) this.f6280x;
                h hVar = (h) this.f6281y;
                f fVar3 = (f) this.f6279w;
                int size3 = list3.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    a6.e eVar = (a6.e) list3.get(i11);
                    x xVar3 = null;
                    try {
                        xVar = new x(new FileInputStream(hVar.d().getFileDescriptor()), fVar3);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        boolean zD2 = eVar.d(xVar, fVar3);
                        xVar.i();
                        hVar.d();
                        if (zD2) {
                            return true;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        xVar3 = xVar;
                        if (xVar3 != null) {
                            xVar3.i();
                        }
                        hVar.d();
                        throw th;
                    }
                    break;
                }
                return false;
        }
    }

    public boolean F() throws IOException {
        String strTrim;
        ArrayDeque arrayDeque = (ArrayDeque) this.f6280x;
        if (((String) this.f6281y) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.f6281y = str;
                return true;
            }
            do {
                String line = ((BufferedReader) this.f6279w).readLine();
                this.f6281y = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f6281y = strTrim;
            } while (strTrim.isEmpty());
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void G(y1.h r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, o2.u0 r15) throws c3.d {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.a.G(y1.h, android.net.Uri, java.util.Map, long, long, o2.u0):void");
    }

    public String H() {
        if (!F()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.f6281y;
        this.f6281y = null;
        return str;
    }

    public void J(int i, e eVar, o oVar) {
        i.e(eVar, "download");
        i.e(oVar, "reason");
        synchronized (this.f6280x) {
            try {
                WeakReference weakReference = (WeakReference) ((LinkedHashMap) this.f6281y).get(Integer.valueOf(i));
                gd.a aVar = weakReference != null ? (gd.a) weakReference.get() : null;
                if (aVar != null) {
                    aVar.a(((a9.g) this.f6279w).C(i, eVar), eVar, oVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void K() {
        ((TypedArray) this.f6280x).recycle();
    }

    public void L(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.f6279w).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.f6281y) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void M(int i) {
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.f6281y;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f6281y = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i, f0.f4407v, new l2.i(this));
        this.f6281y = loudnessCodecControllerCreate;
        Iterator it = ((HashSet) this.f6279w).iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public void P() {
        synchronized (this) {
            ((AtomicInteger) this.f6280x).decrementAndGet();
            if (((AtomicInteger) this.f6280x).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public synchronized void Q(int i, int i10, long j8, long j9) {
        ((p1) this.f6279w).F.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.f6281y;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        o8.o oVarC = ((d) this.f6280x).c(new m(0, Arrays.asList(new j(36301, i, 0, j8, j9, null, null, 0, i10))));
        e3.c cVar = new e3.c(this, jElapsedRealtime, 4);
        oVarC.getClass();
        oVarC.c(o8.i.f9964a, cVar);
    }

    @Override // o6.a
    public b0 a(b0 b0Var, a6.i iVar) {
        Drawable drawable = (Drawable) b0Var.get();
        if (drawable instanceof BitmapDrawable) {
            return ((c6.i) this.f6280x).a(j6.d.c(((BitmapDrawable) drawable).getBitmap(), (d6.a) this.f6279w), iVar);
        }
        if (drawable instanceof n6.b) {
            return ((o6.c) this.f6281y).a(b0Var, iVar);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // k8.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(java.lang.String r9, int r10, java.lang.Throwable r11, byte[] r12, java.util.Map r13) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.a.b(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    @Override // vf.s
    public t c() {
        return (n) this.f6280x;
    }

    @Override // v0.g
    public ClipDescription d() {
        return (ClipDescription) this.f6280x;
    }

    @Override // s0.c
    public boolean e(Object obj) {
        if (obj instanceof w6.b) {
            ((w6.b) obj).c().f13914a = true;
        }
        ((w6.c) this.f6280x).a(obj);
        return ((s0.e) this.f6281y).e(obj);
    }

    @Override // v0.g
    public Object f() {
        return null;
    }

    @Override // v0.g
    public Uri g() {
        return (Uri) this.f6279w;
    }

    @Override // v0.g
    public Uri i() {
        return (Uri) this.f6281y;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    @Override // k8.w2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(int r9, java.lang.Throwable r10, byte[] r11) {
        /*
            r8 = this;
            java.lang.Object r11 = r8.f6279w
            k8.u2 r11 = (k8.u2) r11
            r11.D()
            java.lang.Object r0 = r8.f6281y
            k8.e4 r0 = (k8.e4) r0
            r1 = 200(0xc8, float:2.8E-43)
            if (r9 == r1) goto L18
            r1 = 204(0xcc, float:2.86E-43)
            if (r9 == r1) goto L18
            r1 = 304(0x130, float:4.26E-43)
            if (r9 != r1) goto L33
            r9 = r1
        L18:
            if (r10 != 0) goto L33
            java.lang.Object r9 = r11.f2053w
            k8.p1 r9 = (k8.p1) r9
            k8.v0 r9 = r9.A
            k8.p1.l(r9)
            k8.t0 r9 = r9.J
            long r1 = r0.f7474v
            java.lang.Long r10 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "[sgtm] Upload succeeded for row_id"
            r9.b(r10, r1)
            k8.a3 r9 = k8.a3.f7379x
            goto L6f
        L33:
            java.lang.Object r1 = r11.f2053w
            k8.p1 r1 = (k8.p1) r1
            k8.v0 r1 = r1.A
            k8.p1.l(r1)
            k8.t0 r1 = r1.E
            long r2 = r0.f7474v
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            java.lang.String r4 = "[sgtm] Upload failed for row_id. response, exception"
            r1.d(r4, r2, r3, r10)
            k8.e0 r10 = k8.f0.f7525u
            r1 = 0
            java.lang.Object r10 = r10.a(r1)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r1 = ","
            java.lang.String[] r10 = r10.split(r1)
            java.util.List r10 = java.util.Arrays.asList(r10)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto L6d
            k8.a3 r9 = k8.a3.f7381z
            goto L6f
        L6d:
            k8.a3 r9 = k8.a3.f7380y
        L6f:
            java.lang.Object r10 = r8.f6280x
            java.util.concurrent.atomic.AtomicReference r10 = (java.util.concurrent.atomic.AtomicReference) r10
            java.lang.Object r1 = r11.f2053w
            k8.p1 r1 = (k8.p1) r1
            k8.p3 r1 = r1.o()
            k8.d r2 = new k8.d
            long r4 = r0.f7474v
            int r3 = r9.f7382v
            long r6 = r0.A
            r2.<init>(r3, r4, r6)
            r1.D()
            r1.E()
            r0 = 1
            k8.v4 r0 = r1.T(r0)
            com.google.android.gms.internal.measurement.ag r3 = new com.google.android.gms.internal.measurement.ag
            r6 = 9
            r3.<init>(r1, r0, r2, r6)
            r1.R(r3)
            java.lang.Object r11 = r11.f2053w
            k8.p1 r11 = (k8.p1) r11
            k8.v0 r11 = r11.A
            k8.p1.l(r11)
            k8.t0 r11 = r11.J
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.lang.String r1 = "[sgtm] Updated status for row_id"
            r11.c(r0, r9, r1)
            monitor-enter(r10)
            r10.set(r9)     // Catch: java.lang.Throwable -> Lb8
            r10.notifyAll()     // Catch: java.lang.Throwable -> Lb8
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb8
            return
        Lb8:
            r0 = move-exception
            r9 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb8
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.a.j(int, java.lang.Throwable, byte[]):void");
    }

    @Override // s0.c
    public Object k() {
        Object objK = ((s0.e) this.f6281y).k();
        if (objK == null) {
            objK = ((w6.a) this.f6279w).q();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objK.getClass());
            }
        }
        if (objK instanceof w6.b) {
            ((w6.b) objK).c().f13914a = false;
        }
        return objK;
    }

    @Override // qa.a
    public void l(Bundle bundle) {
        synchronized (this.f6280x) {
            try {
                pa.d dVar = pa.d.f10448a;
                dVar.e("Logging event _ae to Firebase Analytics with params " + bundle);
                this.f6281y = new CountDownLatch(1);
                ((k4) this.f6279w).l(bundle);
                dVar.e("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.f6281y).await(500, TimeUnit.MILLISECONDS)) {
                        dVar.e("App exception callback received from Analytics listener.");
                    } else {
                        dVar.f("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.f6281y = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean n() {
        synchronized (this) {
            if (((AtomicBoolean) this.f6281y).get()) {
                return false;
            }
            ((AtomicInteger) this.f6280x).incrementAndGet();
            return true;
        }
    }

    public void o() {
        synchronized (this.f6280x) {
            Iterator it = ((LinkedHashMap) this.f6281y).entrySet().iterator();
            while (it.hasNext()) {
                if (((WeakReference) ((Map.Entry) it.next()).getValue()).get() == null) {
                    it.remove();
                }
            }
        }
    }

    public void p() {
        synchronized (this.f6280x) {
            ((LinkedHashMap) this.f6281y).clear();
        }
    }

    public Bitmap q(BitmapFactory.Options options) throws Throwable {
        switch (this.f6278v) {
            case 3:
                return r.c(new v6.a(v6.b.c((ByteBuffer) this.f6279w)), options, this);
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                x xVar = (x) ((h) this.f6279w).f2386w;
                xVar.reset();
                return r.c(xVar, options, this);
            default:
                FileDescriptor fileDescriptor = ((h) this.f6281y).d().getFileDescriptor();
                Bitmap bitmapE = null;
                if (Build.VERSION.SDK_INT != 34 || !r.a(options) || !r.d(this)) {
                    return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                }
                v6.f.a("", options.inPreferredConfig == Bitmap.Config.HARDWARE);
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                try {
                    Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                    if (bitmapDecodeFileDescriptor == null) {
                        if (bitmapDecodeFileDescriptor != null) {
                        }
                        options.inPreferredConfig = Bitmap.Config.HARDWARE;
                        return bitmapE;
                    }
                    try {
                        bitmapE = r.e(bitmapDecodeFileDescriptor);
                    } catch (Throwable th) {
                        th = th;
                        bitmapE = bitmapDecodeFileDescriptor;
                        if (bitmapE != null) {
                            bitmapE.recycle();
                        }
                        options.inPreferredConfig = Bitmap.Config.HARDWARE;
                        throw th;
                    }
                    break;
                    bitmapDecodeFileDescriptor.recycle();
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    return bitmapE;
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
        }
    }

    public void r(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.f6279w;
        ib.f fVar = new ib.f(byteArrayOutputStream, map, (HashMap) this.f6280x, (fb.d) this.f6281y);
        fb.d dVar = (fb.d) map.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
        } else {
            throw new fb.b("No encoder for " + obj.getClass());
        }
    }

    public ColorStateList s(int i) {
        int resourceId;
        ColorStateList colorStateListC;
        TypedArray typedArray = (TypedArray) this.f6280x;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListC = i0.d.c((Context) this.f6279w, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListC;
    }

    public long t() {
        w2.l lVar = (w2.l) this.f6281y;
        if (lVar != null) {
            return lVar.f13837y;
        }
        return -1L;
    }

    public String toString() {
        switch (this.f6278v) {
            case 29:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f6279w);
                sb2.append('{');
                ob.d dVar = (ob.d) ((ob.d) this.f6280x).f10106x;
                String str = "";
                while (dVar != null) {
                    k2 k2Var = (k2) dVar.f10105w;
                    sb2.append(str);
                    if (k2Var == null || !k2.class.isArray()) {
                        sb2.append(k2Var);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{k2Var});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    dVar = (ob.d) dVar.f10106x;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // o8.c
    public void u(o8.o oVar) {
        p7.b bVar = (p7.b) this.f6279w;
        String str = (String) this.f6280x;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f6281y;
        synchronized (bVar.f10399a) {
            bVar.f10399a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public Drawable v(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f6280x;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : com.bumptech.glide.c.t((Context) this.f6279w, resourceId);
    }

    public Drawable w(int i) {
        int resourceId;
        Drawable drawableG;
        if (!((TypedArray) this.f6280x).hasValue(i) || (resourceId = ((TypedArray) this.f6280x).getResourceId(i, 0)) == 0) {
            return null;
        }
        o.s sVarA = o.s.a();
        Context context = (Context) this.f6279w;
        synchronized (sVarA) {
            drawableG = sVarA.f9293a.g(context, resourceId, true);
        }
        return drawableG;
    }

    @Override // vf.s
    public vf.r x() {
        return (vf.m) this.f6281y;
    }

    public Typeface y(int i, int i10, p0 p0Var) {
        int resourceId = ((TypedArray) this.f6280x).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f6281y) == null) {
            this.f6281y = new TypedValue();
        }
        Context context = (Context) this.f6279w;
        TypedValue typedValue = (TypedValue) this.f6281y;
        ThreadLocal threadLocal = k.f7244a;
        if (context.isRestricted()) {
            return null;
        }
        return k.b(context, resourceId, typedValue, i10, p0Var, true, false);
    }

    public gd.a z(int i, o oVar) {
        gd.a aVar;
        i.e(oVar, "reason");
        synchronized (this.f6280x) {
            try {
                WeakReference weakReference = (WeakReference) ((LinkedHashMap) this.f6281y).get(Integer.valueOf(i));
                aVar = weakReference != null ? (gd.a) weakReference.get() : null;
                if (aVar == null) {
                    aVar = new gd.a();
                    aVar.a(((ad.g) ((a9.g) this.f6279w).f273w).i(i), null, oVar);
                    ((LinkedHashMap) this.f6281y).put(Integer.valueOf(i), new WeakReference(aVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i, boolean z2) {
        this.f6278v = i;
        this.f6279w = obj2;
        this.f6280x = obj3;
        this.f6281y = obj;
    }

    public a(Context context, p1 p1Var) {
        this.f6278v = 11;
        this.f6281y = new AtomicLong(-1L);
        this.f6280x = new d(context, d.f13236l, new t7.n("measurement:api"), r7.e.f11343c);
        this.f6279w = p1Var;
    }

    public a(a9.g gVar) {
        this.f6278v = 0;
        this.f6279w = gVar;
        this.f6280x = new Object();
        this.f6281y = new LinkedHashMap();
    }

    public a(List list) {
        this.f6278v = 17;
        this.f6281y = list;
        this.f6279w = new ArrayList(list.size());
        this.f6280x = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.f6279w).add(new m5.n((List) ((q5.f) list.get(i)).f10833b.f2053w));
            ((ArrayList) this.f6280x).add(((q5.f) list.get(i)).f10834c.f());
        }
    }

    public a(p pVar) {
        this.f6278v = 9;
        this.f6279w = pVar;
        this.f6280x = z7.b.h((wf.d) pVar.f11744y);
        wf.c cVar = (wf.c) pVar.f11745z;
        i.e(cVar, "<this>");
        this.f6281y = new vf.m(cVar);
    }

    public a(LinearLayout linearLayout, TextView textView, ProgressBar progressBar, RecyclerView recyclerView) {
        this.f6278v = 7;
        this.f6279w = textView;
        this.f6280x = progressBar;
        this.f6281y = recyclerView;
    }

    private final void N() {
    }

    private final void O() {
    }

    @Override // v0.g
    public void h() {
    }

    public a(p4.t tVar) {
        this.f6278v = 22;
        this.f6279w = tVar;
        this.f6280x = new AtomicInteger(0);
        this.f6281y = new AtomicBoolean(false);
    }

    public a(k4 k4Var) {
        this.f6278v = 23;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f6280x = new Object();
        this.f6279w = k4Var;
    }

    public a(FirebaseMessagingService firebaseMessagingService, g2 g2Var, ExecutorService executorService) {
        this.f6278v = 24;
        this.f6279w = executorService;
        this.f6280x = firebaseMessagingService;
        this.f6281y = g2Var;
    }

    public a(int i) {
        this.f6278v = i;
        switch (i) {
            case 26:
                break;
            default:
                l2.j jVar = l2.j.f8096v;
                this.f6279w = new HashSet();
                this.f6280x = jVar;
                break;
        }
    }

    public a(w2.r rVar) {
        this.f6278v = 19;
        this.f6279w = rVar;
    }

    public a(Context context, TypedArray typedArray) {
        this.f6278v = 18;
        this.f6279w = context;
        this.f6280x = typedArray;
    }

    public a(Runnable runnable) {
        this.f6278v = 25;
        this.f6280x = new CopyOnWriteArrayList();
        this.f6281y = new HashMap();
        this.f6279w = runnable;
    }

    public a(String str) {
        this.f6278v = 29;
        ob.d dVar = new ob.d(21, false);
        this.f6280x = dVar;
        this.f6281y = dVar;
        this.f6279w = str;
    }

    public a(v6.j jVar, ArrayList arrayList, f fVar) {
        this.f6278v = 4;
        v6.f.c(fVar, "Argument must not be null");
        this.f6280x = fVar;
        v6.f.c(arrayList, "Argument must not be null");
        this.f6281y = arrayList;
        this.f6279w = new h(jVar, fVar);
    }

    public a(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, f fVar) {
        this.f6278v = 5;
        v6.f.c(fVar, "Argument must not be null");
        this.f6279w = fVar;
        v6.f.c(arrayList, "Argument must not be null");
        this.f6280x = arrayList;
        this.f6281y = new h(parcelFileDescriptor);
    }

    public a(Matcher matcher, CharSequence charSequence) {
        this.f6278v = 15;
        i.e(charSequence, "input");
        this.f6279w = matcher;
        this.f6280x = new ke.f(this);
    }

    public a(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f6278v = 2;
        this.f6280x = arrayDeque;
        this.f6279w = bufferedReader;
    }
}

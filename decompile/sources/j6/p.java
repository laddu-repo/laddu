package j6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public static final a6.h f = a6.h.a(a6.a.f152x, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a6.h f6958g = new a6.h("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, a6.h.f156e);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a6.h f6959h;
    public static final a6.h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Set f6960j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final oa.b f6961k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ArrayDeque f6962l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d6.a f6963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f6964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d6.f f6965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f6966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f6967e = w.a();

    static {
        n nVar = n.f6951b;
        Boolean bool = Boolean.FALSE;
        f6959h = a6.h.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = a6.h.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        f6960j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f6961k = new oa.b(13);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = v6.m.f13232a;
        f6962l = new ArrayDeque(0);
    }

    public p(ArrayList arrayList, DisplayMetrics displayMetrics, d6.a aVar, d6.f fVar) {
        this.f6966d = arrayList;
        v6.f.c(displayMetrics, "Argument must not be null");
        this.f6964b = displayMetrics;
        v6.f.c(aVar, "Argument must not be null");
        this.f6963a = aVar;
        v6.f.c(fVar, "Argument must not be null");
        this.f6965c = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(hd.a r9, android.graphics.BitmapFactory.Options r10, j6.o r11, d6.a r12) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r10.inJustDecodeBounds
            if (r1 != 0) goto L22
            r11.D()
            int r1 = r9.f6278v
            switch(r1) {
                case 3: goto L22;
                case 4: goto Lf;
                default: goto Le;
            }
        Le:
            goto L22
        Lf:
            java.lang.Object r1 = r9.f6279w
            com.bumptech.glide.load.data.h r1 = (com.bumptech.glide.load.data.h) r1
            java.lang.Object r1 = r1.f2386w
            j6.x r1 = (j6.x) r1
            monitor-enter(r1)
            byte[] r2 = r1.f6981v     // Catch: java.lang.Throwable -> L1f
            int r2 = r2.length     // Catch: java.lang.Throwable -> L1f
            r1.f6983x = r2     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)
            goto L22
        L1f:
            r9 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r9
        L22:
            int r1 = r10.outWidth
            int r2 = r10.outHeight
            java.lang.String r3 = r10.outMimeType
            java.util.concurrent.locks.Lock r4 = j6.z.f6987b
            r4.lock()
            android.graphics.Bitmap r9 = r9.q(r10)     // Catch: java.lang.IllegalArgumentException -> L35 java.lang.Throwable -> L7c
            r4.unlock()
            return r9
        L35:
            r4 = move-exception
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L7c
            java.lang.String r6 = "Exception decoding bitmap, outWidth: "
            java.lang.String r7 = ", outHeight: "
            java.lang.String r8 = ", outMimeType: "
            java.lang.StringBuilder r1 = j4.a.o(r1, r2, r6, r7, r8)     // Catch: java.lang.Throwable -> L7c
            r1.append(r3)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = ", inBitmap: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L7c
            android.graphics.Bitmap r2 = r10.inBitmap     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = d(r2)     // Catch: java.lang.Throwable -> L7c
            r1.append(r2)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7c
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L7c
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L7c
            if (r1 == 0) goto L66
            java.lang.String r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r1, r5)     // Catch: java.lang.Throwable -> L7c
        L66:
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L7b
            r12.f(r0)     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L7c
            r0 = 0
            r10.inBitmap = r0     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L7c
            android.graphics.Bitmap r9 = c(r9, r10, r11, r12)     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L7c
            java.util.concurrent.locks.Lock r10 = j6.z.f6987b
            r10.unlock()
            return r9
        L7a:
            throw r5     // Catch: java.lang.Throwable -> L7c
        L7b:
            throw r5     // Catch: java.lang.Throwable -> L7c
        L7c:
            r9 = move-exception
            java.util.concurrent.locks.Lock r10 = j6.z.f6987b
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.p.c(hd.a, android.graphics.BitmapFactory$Options, j6.o, d6.a):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
        f(options);
        ArrayDeque arrayDeque = f6962l;
        synchronized (arrayDeque) {
            arrayDeque.offer(options);
        }
    }

    public static void f(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final d a(hd.a aVar, int i10, int i11, a6.i iVar, o oVar) {
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.f6965c.d(65536, byte[].class);
        synchronized (p.class) {
            ArrayDeque arrayDeque = f6962l;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        a6.a aVar2 = (a6.a) iVar.c(f);
        a6.j jVar = (a6.j) iVar.c(f6958g);
        n nVar = (n) iVar.c(n.f6955g);
        boolean zBooleanValue = ((Boolean) iVar.c(f6959h)).booleanValue();
        a6.h hVar = i;
        try {
            return d.c(b(aVar, options2, nVar, aVar2, jVar, iVar.c(hVar) != null && ((Boolean) iVar.c(hVar)).booleanValue(), i10, i11, zBooleanValue, oVar), this.f6963a);
        } finally {
            e(options2);
            this.f6965c.h(bArr);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x040b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x048e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:261:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0155 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0157  */
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap b(hd.a r43, android.graphics.BitmapFactory.Options r44, j6.n r45, a6.a r46, a6.j r47, boolean r48, int r49, int r50, boolean r51, j6.o r52) {
        /*
            Method dump skipped, instruction units count: 1608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.p.b(hd.a, android.graphics.BitmapFactory$Options, j6.n, a6.a, a6.j, boolean, int, int, boolean, j6.o):android.graphics.Bitmap");
    }
}

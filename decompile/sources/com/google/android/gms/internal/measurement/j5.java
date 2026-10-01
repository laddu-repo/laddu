package com.google.android.gms.internal.measurement;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaCodecInfo;
import android.net.Uri;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceConfigurationError;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class j5 {
    public static String a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static void b(String str, boolean z10) {
        if (z10) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static void c(int i6) {
        if (i6 >= 0) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static l4.g0 d(TypedValue typedValue, l4.g0 g0Var, l4.g0 g0Var2, String str, String str2) {
        if (g0Var != null && g0Var != g0Var2) {
            throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
        }
        if (g0Var == null) {
            return g0Var2;
        }
        return g0Var;
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static final void f(g5.a connection) {
        kotlin.jvm.internal.k.e(connection, "connection");
        je.c h4 = a8.g.h();
        g5.c d02 = connection.d0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (d02.X()) {
            try {
                h4.add(d02.M(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    c9.a.c(d02, th);
                    throw th2;
                }
            }
        }
        c9.a.c(d02, null);
        ListIterator listIterator = a8.g.c(h4).listIterator(0);
        while (true) {
            je.a aVar = (je.a) listIterator;
            if (aVar.hasNext()) {
                String str = (String) aVar.next();
                if (df.u.H(str, "room_fts_content_sync_", false)) {
                    a8.d.d(connection, "DROP TRIGGER IF EXISTS ".concat(str));
                }
            } else {
                return;
            }
        }
    }

    public static int g(boolean z10) {
        Iterable d10;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List h4;
        try {
            r1.p pVar = new r1.p();
            pVar.f11611m = r1.k0.p(MimeTypes.VIDEO_H264);
            r1.q qVar = new r1.q(pVar);
            String str = qVar.f11670n;
            if (str != null) {
                List d11 = j2.a0.d(str, z10, false);
                String b10 = j2.a0.b(qVar);
                if (b10 == null) {
                    d10 = db.c1.B;
                } else {
                    d10 = j2.a0.d(b10, z10, false);
                }
                db.h0 j = db.k0.j();
                j.d(d11);
                j.d(d10);
                db.c1 g10 = j.g();
                for (int i6 = 0; i6 < g10.A; i6++) {
                    if (((j2.q) g10.get(i6)).f7094d != null && (videoCapabilities = ((j2.q) g10.get(i6)).f7094d.getVideoCapabilities()) != null && (h4 = androidx.lifecycle.x0.h(videoCapabilities)) != null && !h4.isEmpty()) {
                        androidx.lifecycle.x0.i();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint c10 = androidx.lifecycle.x0.c();
                        for (int i10 = 0; i10 < h4.size(); i10++) {
                            if (androidx.lifecycle.x0.x(androidx.lifecycle.x0.e(h4.get(i10)), c10)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (j2.w unused) {
        }
        return 0;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:11|12|13|(1:31)|(3:18|19|20)(2:21|22)) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        r7 = r0.A;
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r7 == 307) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (r9 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        r5 = r5 + 1;
        r0 = r4.a();
        r4 = android.net.Uri.parse(r9);
        r0.f5438e = r4;
        u1.c.i(r4, "The uri must be set.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a2, code lost:
    
        r4 = new w1.l((android.net.Uri) r0.f5438e, r0.f5434a, (byte[]) r0.f5439f, (java.util.Map) r0.f5440g, r0.f5435b, r0.f5436c, (java.lang.String) r0.f5441h, r0.f5437d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a4, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
    
        r9 = (java.lang.String) r7.get(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0036, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a5, code lost:
    
        u1.a0.g(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] h(w1.h r25, java.lang.String r26, byte[] r27, java.util.Map r28) {
        /*
            w1.z r1 = new w1.z
            r0 = r25
            r1.<init>(r0)
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            android.net.Uri r3 = android.net.Uri.parse(r26)
            java.lang.String r13 = "The uri must be set."
            u1.c.i(r3, r13)
            w1.l r2 = new w1.l
            r4 = 2
            r7 = 0
            r9 = -1
            r11 = 0
            r12 = 1
            r5 = r27
            r6 = r28
            r2.<init>(r3, r4, r5, r6, r7, r9, r11, r12)
            r3 = 0
            r4 = r2
            r5 = 0
        L25:
            w1.k r6 = new w1.k     // Catch: java.lang.Exception -> L32
            r6.<init>(r1, r4)     // Catch: java.lang.Exception -> L32
            byte[] r0 = eb.b.b(r6)     // Catch: java.lang.Throwable -> L36 w1.v -> L38
            u1.a0.g(r6)     // Catch: java.lang.Exception -> L32
            return r0
        L32:
            r0 = move-exception
            r10 = r0
            goto La9
        L36:
            r0 = move-exception
            goto La5
        L38:
            r0 = move-exception
            int r7 = r0.A     // Catch: java.lang.Throwable -> L36
            r8 = 307(0x133, float:4.3E-43)
            r9 = 0
            if (r7 == r8) goto L44
            r8 = 308(0x134, float:4.32E-43)
            if (r7 != r8) goto L62
        L44:
            r7 = 5
            if (r5 >= r7) goto L62
            java.util.Map r7 = r0.B     // Catch: java.lang.Throwable -> L36
            if (r7 == 0) goto L62
            java.lang.String r8 = "Location"
            java.lang.Object r7 = r7.get(r8)     // Catch: java.lang.Throwable -> L36
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L36
            if (r7 == 0) goto L62
            boolean r8 = r7.isEmpty()     // Catch: java.lang.Throwable -> L36
            if (r8 != 0) goto L62
            java.lang.Object r7 = r7.get(r3)     // Catch: java.lang.Throwable -> L36
            r9 = r7
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L36
        L62:
            if (r9 == 0) goto La4
            int r5 = r5 + 1
            g4.c r0 = r4.a()     // Catch: java.lang.Throwable -> L36
            android.net.Uri r4 = android.net.Uri.parse(r9)     // Catch: java.lang.Throwable -> L36
            r0.f5438e = r4     // Catch: java.lang.Throwable -> L36
            u1.c.i(r4, r13)     // Catch: java.lang.Throwable -> L36
            w1.l r14 = new w1.l     // Catch: java.lang.Throwable -> L36
            java.lang.Object r4 = r0.f5438e     // Catch: java.lang.Throwable -> L36
            r15 = r4
            android.net.Uri r15 = (android.net.Uri) r15     // Catch: java.lang.Throwable -> L36
            int r4 = r0.f5434a     // Catch: java.lang.Throwable -> L36
            java.lang.Object r7 = r0.f5439f     // Catch: java.lang.Throwable -> L36
            r17 = r7
            byte[] r17 = (byte[]) r17     // Catch: java.lang.Throwable -> L36
            java.lang.Object r7 = r0.f5440g     // Catch: java.lang.Throwable -> L36
            r18 = r7
            java.util.Map r18 = (java.util.Map) r18     // Catch: java.lang.Throwable -> L36
            long r7 = r0.f5435b     // Catch: java.lang.Throwable -> L36
            long r9 = r0.f5436c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r11 = r0.f5441h     // Catch: java.lang.Throwable -> L36
            r23 = r11
            java.lang.String r23 = (java.lang.String) r23     // Catch: java.lang.Throwable -> L36
            int r0 = r0.f5437d     // Catch: java.lang.Throwable -> L36
            r24 = r0
            r16 = r4
            r19 = r7
            r21 = r9
            r14.<init>(r15, r16, r17, r18, r19, r21, r23, r24)     // Catch: java.lang.Throwable -> L36
            u1.a0.g(r6)     // Catch: java.lang.Exception -> L32
            r4 = r14
            goto L25
        La4:
            throw r0     // Catch: java.lang.Throwable -> L36
        La5:
            u1.a0.g(r6)     // Catch: java.lang.Exception -> L32
            throw r0     // Catch: java.lang.Exception -> L32
        La9:
            f2.z r4 = new f2.z
            android.net.Uri r6 = r1.f13560z
            w1.h r0 = r1.f13558x
            java.util.Map r7 = r0.u()
            long r8 = r1.f13559y
            r5 = r2
            r4.<init>(r5, r6, r7, r8, r10)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.j5.h(w1.h, java.lang.String, byte[], java.util.Map):byte[]");
    }

    public static final le.h i(x4.w wVar, boolean z10, ne.c cVar) {
        if (wVar.n()) {
            if (cVar.getContext().get(x4.e0.f14566x) == null) {
                if (z10) {
                    le.h hVar = wVar.f14662b;
                    if (hVar != null) {
                        return hVar;
                    }
                    kotlin.jvm.internal.k.k("transactionContext");
                    throw null;
                }
                mf.e eVar = wVar.f14661a;
                if (eVar != null) {
                    return eVar.f8858x;
                }
                kotlin.jvm.internal.k.k("coroutineScope");
                throw null;
            }
            throw new ClassCastException();
        }
        return ((mf.e) wVar.i()).f8858x;
    }

    public static Object j(Future future) {
        Object obj;
        boolean z10 = false;
        if (future.isDone()) {
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            return obj;
        }
        throw new IllegalStateException(k6.e.f("Future was expected to be done: %s", future));
    }

    public static float k(String[] strArr, int i6) {
        float parseFloat = Float.parseFloat(strArr[i6]);
        if (parseFloat >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static hb.u l(Object obj) {
        if (obj == null) {
            return hb.u.f6034y;
        }
        return new hb.u(obj);
    }

    public static bf.r m(kotlin.jvm.internal.a0 a0Var) {
        return new bf.r(bf.s.f1671x, a0Var);
    }

    public static boolean n(Throwable th) {
        if (Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(")) {
            return true;
        }
        return false;
    }

    public static boolean o(Throwable th) {
        if (Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(")) {
            return true;
        }
        return false;
    }

    public static boolean p(String str, String str2) {
        if (str.startsWith(str2.concat("(")) && str.endsWith(")")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object q(le.c r14, ve.l r15, x4.w r16, boolean r17, boolean r18) {
        /*
            boolean r0 = r14 instanceof d5.b
            if (r0 == 0) goto L14
            r0 = r14
            d5.b r0 = (d5.b) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.C = r1
        L12:
            r14 = r0
            goto L1a
        L14:
            d5.b r0 = new d5.b
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r0 = r14.B
            int r1 = r14.C
            r2 = 3
            r3 = 2
            r6 = 1
            me.a r7 = me.a.f8833x
            if (r1 == 0) goto L4b
            if (r1 == r6) goto L47
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            he.a.f(r0)
            return r0
        L2f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L37:
            boolean r1 = r14.A
            boolean r3 = r14.f3794z
            ve.l r4 = r14.f3793y
            x4.w r5 = r14.f3792x
            he.a.f(r0)
            r13 = r1
            r12 = r3
            r10 = r4
            r11 = r5
            goto L95
        L47:
            he.a.f(r0)
            return r0
        L4b:
            he.a.f(r0)
            boolean r0 = r16.n()
            if (r0 == 0) goto L79
            boolean r0 = r16.q()
            if (r0 == 0) goto L79
            boolean r0 = r16.o()
            if (r0 == 0) goto L79
            d5.c r0 = new d5.c
            r1 = 0
            r2 = r15
            r3 = r16
            r5 = r17
            r4 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r0
            r0 = r3
            r14.C = r6
            java.lang.Object r14 = r0.s(r5, r1, r14)
            if (r14 != r7) goto L78
            goto Laa
        L78:
            return r14
        L79:
            r0 = r16
            r5 = r17
            r4 = r18
            r14.f3792x = r0
            r14.f3793y = r15
            r14.f3794z = r5
            r14.A = r4
            r14.C = r3
            le.h r3 = i(r0, r4, r14)
            if (r3 != r7) goto L90
            goto Laa
        L90:
            r10 = r15
            r11 = r0
            r0 = r3
            r13 = r4
            r12 = r5
        L95:
            le.h r0 = (le.h) r0
            d5.a r8 = new d5.a
            r9 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r1 = 0
            r14.f3792x = r1
            r14.f3793y = r1
            r14.C = r2
            java.lang.Object r14 = gf.f0.J(r0, r8, r14)
            if (r14 != r7) goto Lab
        Laa:
            return r7
        Lab:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.j5.q(le.c, ve.l, x4.w, boolean, boolean):java.lang.Object");
    }

    public static final Cursor r(x4.w db2, x4.z zVar) {
        kotlin.jvm.internal.k.e(db2, "db");
        db2.a();
        db2.b();
        return db2.k().G().E(zVar);
    }

    public static Uri s(Uri uri) {
        if (uri.getQueryParameter("CMCD") != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.clearQuery();
            for (String str : uri.getQueryParameterNames()) {
                if (!str.equals("CMCD")) {
                    Iterator<String> it = uri.getQueryParameters(str).iterator();
                    while (it.hasNext()) {
                        buildUpon.appendQueryParameter(str, it.next());
                    }
                }
            }
            return buildUpon.build();
        }
        return uri;
    }

    public static int t(Context context, int i6, int i10) {
        TypedValue o10 = a8.g.o(context, i6);
        if (o10 != null && o10.type == 16) {
            return o10.data;
        }
        return i10;
    }

    public static TimeInterpolator u(Context context, int i6, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i6, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!p(valueOf, "cubic-bezier") && !p(valueOf, "path")) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (p(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return new PathInterpolator(k(split, 0), k(split, 1), k(split, 2), k(split, 3));
                }
                throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
            }
            if (p(valueOf, "path")) {
                return new PathInterpolator(a8.i.f(valueOf.substring(5, valueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }

    public static f5 w() {
        String str;
        ClassLoader classLoader = j5.class.getClassLoader();
        if (!f5.class.equals(f5.class)) {
            if (!f5.class.getPackage().equals(j5.class.getPackage())) {
                throw new IllegalArgumentException(f5.class.getName());
            }
            str = f5.class.getPackage().getName() + ".BlazeGenerated" + f5.class.getSimpleName() + "Loader";
        } else {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        }
        try {
            try {
                try {
                    r4.a.t(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (InstantiationException e10) {
                    throw new IllegalStateException(e10);
                } catch (NoSuchMethodException e11) {
                    throw new IllegalStateException(e11);
                }
            } catch (IllegalAccessException e12) {
                throw new IllegalStateException(e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException(e13);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new j5[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                        break;
                    } catch (ServiceConfigurationError e14) {
                        Logger.getLogger(d5.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(f5.class.getSimpleName()), (Throwable) e14);
                    }
                }
                if (arrayList.size() == 1) {
                    return (f5) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (f5) f5.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e15) {
                    throw new IllegalStateException(e15);
                } catch (NoSuchMethodException e16) {
                    throw new IllegalStateException(e16);
                } catch (InvocationTargetException e17) {
                    throw new IllegalStateException(e17);
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public abstract void v(ArrayList arrayList);
}

package o;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f9180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f9181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f9182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Field f9183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Field f9184e;
    public static final Field f;

    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    static {
        /*
            r0 = 1
            r1 = 0
            r2 = 0
            java.lang.String r3 = "android.graphics.Insets"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L40 java.lang.NoSuchMethodException -> L43
            java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
            java.lang.String r5 = "getOpticalInsets"
            java.lang.reflect.Method r4 = r4.getMethod(r5, r1)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L40 java.lang.NoSuchMethodException -> L43
            java.lang.String r5 = "left"
            java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L34 java.lang.ClassNotFoundException -> L37 java.lang.NoSuchMethodException -> L3a
            java.lang.String r6 = "top"
            java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L2d java.lang.ClassNotFoundException -> L30 java.lang.NoSuchMethodException -> L32
            java.lang.String r7 = "right"
            java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r8 = "bottom"
            java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L46
            r8 = r0
            goto L48
        L2b:
            r7 = r1
            goto L46
        L2d:
            r6 = r1
        L2e:
            r7 = r6
            goto L46
        L30:
            r6 = r1
            goto L2e
        L32:
            r6 = r1
            goto L2e
        L34:
            r5 = r1
        L35:
            r6 = r5
            goto L2e
        L37:
            r5 = r1
        L38:
            r6 = r5
            goto L2e
        L3a:
            r5 = r1
        L3b:
            r6 = r5
            goto L2e
        L3d:
            r4 = r1
            r5 = r4
            goto L35
        L40:
            r4 = r1
            r5 = r4
            goto L38
        L43:
            r4 = r1
            r5 = r4
            goto L3b
        L46:
            r3 = r1
            r8 = r2
        L48:
            if (r8 == 0) goto L57
            o.j1.f9181b = r4
            o.j1.f9182c = r5
            o.j1.f9183d = r6
            o.j1.f9184e = r7
            o.j1.f = r3
            o.j1.f9180a = r0
            goto L63
        L57:
            o.j1.f9181b = r1
            o.j1.f9182c = r1
            o.j1.f9183d = r1
            o.j1.f9184e = r1
            o.j1.f = r1
            o.j1.f9180a = r2
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.j1.<clinit>():void");
    }
}

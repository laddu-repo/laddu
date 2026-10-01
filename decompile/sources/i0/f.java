package i0;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import h0.a0;
import h0.r;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f6271a = null;

    public static int a(Context context, String str) {
        boolean z10;
        if (str != null) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                a0 a0Var = new a0(context);
                if (i6 >= 24) {
                    z10 = r.a(a0Var.f5761a);
                } else {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    String packageName = context.getApplicationContext().getPackageName();
                    int i10 = applicationInfo.uid;
                    try {
                        Class<?> cls = Class.forName(AppOpsManager.class.getName());
                        Class<?> cls2 = Integer.TYPE;
                        Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
                        Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
                        num.getClass();
                        if (((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i10), packageName)).intValue() != 0) {
                            z10 = false;
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
                    }
                    z10 = true;
                }
                if (z10) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(android.content.Context r8, java.lang.String r9) {
        /*
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r8.getPackageName()
            int r0 = r8.checkPermission(r9, r0, r1)
            r3 = -1
            if (r0 != r3) goto L14
            goto L38
        L14:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r0 < r4) goto L1f
            java.lang.String r9 = h0.a.d(r9)
            goto L20
        L1f:
            r9 = 0
        L20:
            r5 = 0
            if (r9 != 0) goto L25
            goto L89
        L25:
            if (r2 != 0) goto L39
            android.content.pm.PackageManager r2 = r8.getPackageManager()
            java.lang.String[] r2 = r2.getPackagesForUid(r1)
            if (r2 == 0) goto L38
            int r6 = r2.length
            if (r6 > 0) goto L35
            goto L38
        L35:
            r2 = r2[r5]
            goto L39
        L38:
            return r3
        L39:
            int r3 = android.os.Process.myUid()
            java.lang.String r6 = r8.getPackageName()
            r7 = 1
            if (r3 != r1) goto L7a
            boolean r3 = java.util.Objects.equals(r6, r2)
            if (r3 == 0) goto L7a
            r3 = 29
            if (r0 < r3) goto L6d
            android.app.AppOpsManager r0 = h0.g.b(r8)
            int r3 = android.os.Binder.getCallingUid()
            if (r0 != 0) goto L5a
            r2 = 1
            goto L5e
        L5a:
            int r2 = r0.checkOpNoThrow(r9, r3, r2)
        L5e:
            if (r2 == 0) goto L61
            goto L87
        L61:
            java.lang.String r8 = h0.g.a(r8)
            if (r0 != 0) goto L68
            goto L86
        L68:
            int r7 = r0.checkOpNoThrow(r9, r1, r8)
            goto L86
        L6d:
            if (r0 < r4) goto L86
            java.lang.Object r8 = h0.a.b(r8)
            android.app.AppOpsManager r8 = (android.app.AppOpsManager) r8
            int r7 = h0.a.c(r8, r9, r2)
            goto L86
        L7a:
            if (r0 < r4) goto L86
            java.lang.Object r8 = h0.a.b(r8)
            android.app.AppOpsManager r8 = (android.app.AppOpsManager) r8
            int r7 = h0.a.c(r8, r9, r2)
        L86:
            r2 = r7
        L87:
            if (r2 != 0) goto L8a
        L89:
            return r5
        L8a:
            r8 = -2
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.b(android.content.Context, java.lang.String):int");
    }

    public static int c(Context context, int i6) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.a(context, i6);
        }
        return context.getResources().getColor(i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0046, code lost:
    
        if (r5.f7565c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList d(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            k0.j r1 = new k0.j
            r1.<init>(r0, r8)
            java.lang.Object r2 = k0.l.f7570c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = k0.l.f7569b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L4f
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L4f
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            k0.i r5 = (k0.i) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L4f
            android.content.res.Configuration r6 = r5.f7564b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4c
            if (r8 != 0) goto L3e
            int r6 = r5.f7565c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L48
            goto L3e
        L3c:
            r8 = move-exception
            goto L9c
        L3e:
            if (r8 == 0) goto L4c
            int r6 = r5.f7565c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4c
        L48:
            android.content.res.ColorStateList r3 = r5.f7563a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L51
        L4c:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L4f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L51:
            if (r3 == 0) goto L54
            return r3
        L54:
            java.lang.ThreadLocal r2 = k0.l.f7568a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L66
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L66:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L75
            r3 = 31
            if (r2 > r3) goto L75
            goto L86
        L75:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = k0.c.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7e
            goto L86
        L7e:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L86:
            if (r4 == 0) goto L8c
            k0.l.a(r1, r9, r4, r8)
            goto L9b
        L8c:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L97
            android.content.res.ColorStateList r4 = k0.h.a(r0, r9, r8)
            goto L9b
        L97:
            android.content.res.ColorStateList r4 = r0.getColorStateList(r9)
        L9b:
            return r4
        L9c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.d(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static Object e(Context context, Class cls) {
        String str;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 23) {
            return a.b(context, cls);
        }
        if (i6 >= 23) {
            str = a.c(context, cls);
        } else {
            str = (String) e.f6270a.get(cls);
        }
        if (str != null) {
            return context.getSystemService(str);
        }
        return null;
    }
}

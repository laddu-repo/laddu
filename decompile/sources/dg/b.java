package dg;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Looper;
import android.view.Display;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.WebView;
import android.widget.TextView;
import com.google.android.gms.tasks.Task;
import g8.p;
import j2.e;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.k;
import nc.d;
import o3.f;
import s9.i;
import s9.j;
import s9.n;
import u1.c;
import u1.s;
import u5.l;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f4144a;

    public static Object a(Task task) {
        x.f("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        x.h(task, "Task must not be null");
        if (task.g()) {
            return s(task);
        }
        d dVar = new d(1);
        Executor executor = i.f12265b;
        task.c(executor, dVar);
        task.b(executor, dVar);
        task.a(executor, dVar);
        dVar.f9604y.await();
        return s(task);
    }

    public static Object b(Task task, long j, TimeUnit timeUnit) {
        x.f("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        x.h(task, "Task must not be null");
        x.h(timeUnit, "TimeUnit must not be null");
        if (task.g()) {
            return s(task);
        }
        d dVar = new d(1);
        Executor executor = i.f12265b;
        task.c(executor, dVar);
        task.b(executor, dVar);
        task.a(executor, dVar);
        if (dVar.f9604y.await(j, timeUnit)) {
            return s(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static n c(Executor executor, Callable callable) {
        x.h(executor, "Executor must not be null");
        n nVar = new n();
        executor.execute(new rb.i(9, nVar, callable));
        return nVar;
    }

    public static Object d(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static boolean e(Context context) {
        Display display;
        boolean isHdr;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display != null) {
            isHdr = display.isHdr();
            if (isHdr) {
                for (int i6 : e.A(e.i(display))) {
                    if (i6 == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean f(String str, String str2) {
        char c10;
        int length = str.length();
        if (str != str2) {
            if (length == str2.length()) {
                for (int i6 = 0; i6 < length; i6++) {
                    if (str.charAt(i6) == str2.charAt(i6) || ((c10 = (char) ((r3 | ' ') - 97)) < 26 && c10 == ((char) ((r4 | ' ') - 97)))) {
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static InvocationHandler g() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = l.b();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (NoSuchMethodException e11) {
                throw new RuntimeException(e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException(e12);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092 A[EDGE_INSN: B:48:0x0092->B:32:0x0092 BREAK  A[LOOP:0: B:10:0x001a->B:33:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List h(w5.a r9, int r10, int r11) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.k.e(r9, r0)
            java.lang.Object r9 = r9.f14086x
            java.util.LinkedHashMap r9 = (java.util.LinkedHashMap) r9
            if (r10 != r11) goto Le
            ie.r r9 = ie.r.f6846x
            return r9
        Le:
            r0 = 0
            r1 = 1
            if (r11 <= r10) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1a:
            if (r2 == 0) goto L1f
            if (r10 >= r11) goto L93
            goto L21
        L1f:
            if (r10 <= r11) goto L93
        L21:
            r4 = 0
            if (r2 == 0) goto L3c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            java.lang.Object r5 = r9.get(r5)
            java.util.TreeMap r5 = (java.util.TreeMap) r5
            if (r5 != 0) goto L32
        L30:
            r7 = r4
            goto L52
        L32:
            java.util.NavigableSet r6 = r5.descendingKeySet()
            he.i r7 = new he.i
            r7.<init>(r5, r6)
            goto L52
        L3c:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            java.lang.Object r5 = r9.get(r5)
            java.util.TreeMap r5 = (java.util.TreeMap) r5
            if (r5 != 0) goto L49
            goto L30
        L49:
            java.util.Set r6 = r5.keySet()
            he.i r7 = new he.i
            r7.<init>(r5, r6)
        L52:
            if (r7 != 0) goto L55
            goto L92
        L55:
            java.lang.Object r5 = r7.f6076x
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r7.f6077y
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L61:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L8f
            java.lang.Object r7 = r6.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r2 == 0) goto L7a
            int r8 = r10 + 1
            if (r8 > r7) goto L61
            if (r7 > r11) goto L61
            goto L7e
        L7a:
            if (r11 > r7) goto L61
            if (r7 >= r10) goto L61
        L7e:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.lang.Object r10 = r5.get(r10)
            kotlin.jvm.internal.k.b(r10)
            r3.add(r10)
            r10 = r7
            r5 = 1
            goto L90
        L8f:
            r5 = 0
        L90:
            if (r5 != 0) goto L1a
        L92:
            return r4
        L93:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dg.b.h(w5.a, int, int):java.util.List");
    }

    public static n i(Exception exc) {
        n nVar = new n();
        nVar.l(exc);
        return nVar;
    }

    public static n j(Object obj) {
        n nVar = new n();
        nVar.m(obj);
        return nVar;
    }

    public static final boolean k(x4.a aVar, int i6, int i10) {
        k.e(aVar, "<this>");
        if (i6 > i10 && aVar.f14544l) {
            return false;
        }
        Set set = aVar.f14545m;
        if (!aVar.f14543k || (set != null && set.contains(Integer.valueOf(i6)))) {
            return false;
        }
        return true;
    }

    public static void l(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }

    public static int m(s sVar, int i6, int i10, int i11) {
        boolean z10;
        if (Math.max(Math.max(i6, i10), i11) <= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        c.b(z10);
        int i12 = (1 << i6) - 1;
        int i13 = (1 << i10) - 1;
        lg.c.d(lg.c.d(i12, i13), 1 << i11);
        if (sVar.b() >= i6) {
            int i14 = sVar.i(i6);
            if (i14 == i12) {
                if (sVar.b() >= i10) {
                    int i15 = sVar.i(i10);
                    i14 += i15;
                    if (i15 == i13) {
                        if (sVar.b() < i11) {
                            return -1;
                        }
                        return sVar.i(i11) + i14;
                    }
                } else {
                    return -1;
                }
            }
            return i14;
        }
        return -1;
    }

    public static void n(s sVar) {
        sVar.t(3);
        sVar.t(8);
        boolean h4 = sVar.h();
        boolean h10 = sVar.h();
        if (h4) {
            sVar.t(5);
        }
        if (h10) {
            sVar.t(6);
        }
    }

    public static void o(s sVar) {
        int i6;
        int i10;
        int i11 = sVar.i(2);
        int i12 = 6;
        if (i11 == 0) {
            sVar.t(6);
            return;
        }
        int i13 = 5;
        int m9 = m(sVar, 5, 8, 16) + 1;
        if (i11 == 1) {
            sVar.t(m9 * 7);
            return;
        }
        if (i11 == 2) {
            boolean h4 = sVar.h();
            if (h4) {
                i6 = 1;
            } else {
                i6 = 5;
            }
            if (h4) {
                i13 = 7;
            }
            if (h4) {
                i12 = 8;
            }
            int i14 = 0;
            while (i14 < m9) {
                if (sVar.h()) {
                    sVar.t(7);
                    i10 = 0;
                } else {
                    if (sVar.i(2) == 3 && sVar.i(i13) * i6 != 0) {
                        sVar.s();
                    }
                    i10 = sVar.i(i12) * i6;
                    if (i10 != 0 && i10 != 180) {
                        sVar.s();
                    }
                    sVar.s();
                }
                if (i10 != 0 && i10 != 180 && sVar.h()) {
                    i14++;
                }
                i14++;
            }
        }
    }

    public static String p(String str) {
        int length = str.length();
        int i6 = 0;
        while (i6 < length) {
            char charAt = str.charAt(i6);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i6 < length) {
                    char c10 = charArray[i6];
                    if (c10 >= 'A' && c10 <= 'Z') {
                        charArray[i6] = (char) (c10 ^ ' ');
                    }
                    i6++;
                }
                return String.valueOf(charArray);
            }
            i6++;
        }
        return str;
    }

    public static String q(String str) {
        int length = str.length();
        int i6 = 0;
        while (i6 < length) {
            char charAt = str.charAt(i6);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i6 < length) {
                    char c10 = charArray[i6];
                    if (c10 >= 'a' && c10 <= 'z') {
                        charArray[i6] = (char) (c10 ^ ' ');
                    }
                    i6++;
                }
                return String.valueOf(charArray);
            }
            i6++;
        }
        return str;
    }

    public static n r(Task... taskArr) {
        n nVar;
        if (taskArr.length == 0) {
            return j(Collections.EMPTY_LIST);
        }
        List<Task> asList = Arrays.asList(taskArr);
        p pVar = i.f12264a;
        if (asList != null && !asList.isEmpty()) {
            if (asList.isEmpty()) {
                nVar = j(null);
            } else {
                Iterator it = asList.iterator();
                while (it.hasNext()) {
                    if (((Task) it.next()) == null) {
                        throw new NullPointerException("null tasks are not accepted");
                    }
                }
                nVar = new n();
                j jVar = new j(asList.size(), nVar);
                for (Task task : asList) {
                    i.p pVar2 = i.f12265b;
                    task.c(pVar2, jVar);
                    task.b(pVar2, jVar);
                    task.a(pVar2, jVar);
                }
            }
            return nVar.d(pVar, new f(asList));
        }
        return j(Collections.EMPTY_LIST);
    }

    public static Object s(Task task) {
        if (task.h()) {
            return task.f();
        }
        if (((n) task).f12278d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.e());
    }
}

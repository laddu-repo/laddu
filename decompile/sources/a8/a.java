package a8;

import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.q;
import com.google.android.gms.internal.measurement.r;
import com.google.android.gms.internal.measurement.w;
import com.playfy.tv.R;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import gf.f0;
import ic.s;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import jf.o;
import jf.y;
import kotlin.jvm.internal.x;
import okhttp3.HttpUrl;
import t0.p0;
import t0.q0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f618b = false;

    /* renamed from: c, reason: collision with root package name */
    public static Method f619c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f620d = false;

    /* renamed from: e, reason: collision with root package name */
    public static Field f621e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f622a;

    public /* synthetic */ a(int i6) {
        this.f622a = i6;
    }

    public static w A(String str) {
        w wVar = null;
        if (str != null && !str.isEmpty()) {
            wVar = (w) w.I0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalArgumentException(r4.a.k("Unsupported commandId ", str));
    }

    public static boolean B(n nVar, n nVar2) {
        if (!nVar.getClass().equals(nVar2.getClass())) {
            return false;
        }
        if ((nVar instanceof r) || (nVar instanceof com.google.android.gms.internal.measurement.l)) {
            return true;
        }
        if (nVar instanceof com.google.android.gms.internal.measurement.g) {
            if (Double.isNaN(nVar.b().doubleValue()) || Double.isNaN(nVar2.b().doubleValue())) {
                return false;
            }
            return nVar.b().equals(nVar2.b());
        }
        if (nVar instanceof q) {
            return nVar.f().equals(nVar2.f());
        }
        if (nVar instanceof com.google.android.gms.internal.measurement.e) {
            return nVar.e().equals(nVar2.e());
        }
        if (nVar != nVar2) {
            return false;
        }
        return true;
    }

    public static int C(double d10) {
        int i6;
        if (!Double.isNaN(d10) && !Double.isInfinite(d10) && d10 != 0.0d) {
            if (d10 > 0.0d) {
                i6 = 1;
            } else {
                i6 = -1;
            }
            return (int) ((i6 * Math.floor(Math.abs(d10))) % 4.294967296E9d);
        }
        return 0;
    }

    public static double D(double d10) {
        int i6;
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (!Double.isInfinite(d10) && d10 != 0.0d && d10 != 0.0d) {
            if (d10 > 0.0d) {
                i6 = 1;
            } else {
                i6 = -1;
            }
            return i6 * Math.floor(Math.abs(d10));
        }
        return d10;
    }

    public static Object E(n nVar) {
        if (n.f2353b.equals(nVar)) {
            return null;
        }
        if (n.f2352a.equals(nVar)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (nVar instanceof com.google.android.gms.internal.measurement.k) {
            return F((com.google.android.gms.internal.measurement.k) nVar);
        }
        if (nVar instanceof com.google.android.gms.internal.measurement.d) {
            ArrayList arrayList = new ArrayList();
            com.google.android.gms.internal.measurement.d dVar = (com.google.android.gms.internal.measurement.d) nVar;
            int i6 = 0;
            while (i6 < dVar.m()) {
                if (i6 < dVar.m()) {
                    int i10 = i6 + 1;
                    Object E = E(dVar.n(i6));
                    if (E != null) {
                        arrayList.add(E);
                    }
                    i6 = i10;
                } else {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i6).length() + 21);
                    sb2.append("Out of bounds index: ");
                    sb2.append(i6);
                    throw new NoSuchElementException(sb2.toString());
                }
            }
            return arrayList;
        }
        if (!nVar.b().isNaN()) {
            return nVar.b();
        }
        return nVar.f();
    }

    public static HashMap F(com.google.android.gms.internal.measurement.k kVar) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList(kVar.f2315x.keySet());
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            String str = (String) obj;
            Object E = E(kVar.a(str));
            if (E != null) {
                hashMap.put(str, E);
            }
        }
        return hashMap;
    }

    public static void G(s sVar) {
        int C = C(sVar.G("runtime.counter").b().doubleValue() + 1.0d);
        if (C <= 1000000) {
            sVar.E("runtime.counter", new com.google.android.gms.internal.measurement.g(Double.valueOf(C)));
            return;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static final boolean a(String str) {
        for (int i6 = 0; i6 < str.length(); i6++) {
            char charAt = str.charAt(i6);
            if (kotlin.jvm.internal.k.g(charAt, 128) >= 0 || Character.isLetter(charAt)) {
                return true;
            }
        }
        return false;
    }

    public static final void b(int i6, String str) {
        if (str.charAt(i6) == '-') {
            return;
        }
        StringBuilder n10 = h8.c.n(i6, "Expected '-' (hyphen) at index ", ", but was '");
        n10.append(str.charAt(i6));
        n10.append('\'');
        throw new IllegalArgumentException(n10.toString().toString());
    }

    public static byte[] e(ArrayDeque arrayDeque, int i6) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i6) {
            return bArr;
        }
        int length = i6 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i6);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i6 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static final double f(int i6, int i10, int i11, int i12, w6.g gVar) {
        double d10 = i11 / i6;
        double d11 = i12 / i10;
        int ordinal = gVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return Math.min(d10, d11);
            }
            throw new RuntimeException();
        }
        return Math.max(d10, d11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, t0.p0] */
    public static boolean g(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = q0.f12397a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = p0.f12390d;
            p0 p0Var = (p0) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            p0 p0Var2 = p0Var;
            if (p0Var == null) {
                ?? obj = new Object();
                obj.f12391a = null;
                obj.f12392b = null;
                obj.f12393c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, obj);
                p0Var2 = obj;
            }
            WeakReference weakReference2 = p0Var2.f12393c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                p0Var2.f12393c = new WeakReference(keyEvent);
                if (p0Var2.f12392b == null) {
                    p0Var2.f12392b = new SparseArray();
                }
                SparseArray sparseArray = p0Var2.f12392b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    throw h8.c.h(size, arrayList);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean h(t0.j r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            r0 = 0
            if (r7 != 0) goto L5
            goto Le7
        L5:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L10
            boolean r7 = r7.superDispatchKeyEvent(r10)
            return r7
        L10:
            boolean r1 = r9 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L84
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L67
            android.app.ActionBar r8 = r9.getActionBar()
            int r1 = r10.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L67
            if (r8 == 0) goto L67
            boolean r1 = a8.a.f618b
            if (r1 != 0) goto L4d
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r0] = r6     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4b
            a8.a.f619c = r1     // Catch: java.lang.NoSuchMethodException -> L4b
        L4b:
            a8.a.f618b = r3
        L4d:
            java.lang.reflect.Method r1 = a8.a.f619c
            if (r1 == 0) goto L64
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L63
            r4[r0] = r10     // Catch: java.lang.Throwable -> L63
            java.lang.Object r8 = r1.invoke(r8, r4)     // Catch: java.lang.Throwable -> L63
            if (r8 != 0) goto L5c
            goto L64
        L5c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L63
            boolean r0 = r8.booleanValue()     // Catch: java.lang.Throwable -> L63
            goto L64
        L63:
        L64:
            if (r0 == 0) goto L67
            goto L83
        L67:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L6e
            goto L83
        L6e:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = t0.q0.c(r7, r10)
            if (r8 == 0) goto L79
            goto L83
        L79:
            if (r7 == 0) goto L7f
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L7f:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L83:
            return r3
        L84:
            boolean r1 = r9 instanceof android.app.Dialog
            if (r1 == 0) goto Ld8
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = a8.a.f620d
            if (r7 != 0) goto L9d
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch: java.lang.NoSuchFieldException -> L9b
            a8.a.f621e = r7     // Catch: java.lang.NoSuchFieldException -> L9b
            r7.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L9b
        L9b:
            a8.a.f620d = r3
        L9d:
            java.lang.reflect.Field r7 = a8.a.f621e
            if (r7 == 0) goto La9
            java.lang.Object r7 = r7.get(r9)     // Catch: java.lang.IllegalAccessException -> La8
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch: java.lang.IllegalAccessException -> La8
            goto Laa
        La8:
        La9:
            r7 = r2
        Laa:
            if (r7 == 0) goto Lb7
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto Lb7
            goto Ld7
        Lb7:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto Lc2
            goto Ld7
        Lc2:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = t0.q0.c(r7, r10)
            if (r8 == 0) goto Lcd
            goto Ld7
        Lcd:
            if (r7 == 0) goto Ld3
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        Ld3:
            boolean r3 = r10.dispatch(r9, r2, r9)
        Ld7:
            return r3
        Ld8:
            if (r8 == 0) goto Le0
            boolean r8 = t0.q0.c(r8, r10)
            if (r8 != 0) goto Le6
        Le0:
            boolean r7 = r7.superDispatchKeyEvent(r10)
            if (r7 == 0) goto Le7
        Le6:
            return r3
        Le7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.a.h(t0.j, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    public static final void i(long j, byte[] bArr, int i6, int i10, int i11) {
        int i12 = 7 - i10;
        int i13 = 8 - i11;
        if (i13 > i12) {
            return;
        }
        while (true) {
            int i14 = df.c.f4122a[(int) ((j >> (i12 << 3)) & 255)];
            int i15 = i6 + 1;
            bArr[i6] = (byte) (i14 >> 8);
            i6 += 2;
            bArr[i15] = (byte) i14;
            if (i12 != i13) {
                i12--;
            } else {
                return;
            }
        }
    }

    public static final long j(int i6, byte[] bArr) {
        return (bArr[i6 + 7] & 255) | ((bArr[i6] & 255) << 56) | ((bArr[i6 + 1] & 255) << 48) | ((bArr[i6 + 2] & 255) << 40) | ((bArr[i6 + 3] & 255) << 32) | ((bArr[i6 + 4] & 255) << 24) | ((bArr[i6 + 5] & 255) << 16) | ((bArr[i6 + 6] & 255) << 8);
    }

    public static byte[] t(ic.d dVar) {
        int i6;
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i10 = 0;
        while (i10 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i10);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i11 = 0;
            while (i11 < min2) {
                int read = dVar.read(bArr, i11, min2 - i11);
                if (read == -1) {
                    return e(arrayDeque, i10);
                }
                i11 += read;
                i10 += read;
            }
            long j = min;
            if (min < 4096) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            long j10 = j * i6;
            if (j10 > 2147483647L) {
                min = Integer.MAX_VALUE;
            } else if (j10 < -2147483648L) {
                min = Integer.MIN_VALUE;
            } else {
                min = (int) j10;
            }
        }
        if (dVar.read() == -1) {
            return e(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final void v(y yVar, VolumeSettingsChange volumeSettingsChange) {
        Object h4 = yVar.h(volumeSettingsChange);
        if (!(h4 instanceof jf.n)) {
            return;
        }
        Object obj = ((o) f0.B(le.i.f8353x, new dd.c(yVar, volumeSettingsChange, (le.c) null, 2))).f7476a;
    }

    public static void w(String str, int i6, List list) {
        if (list.size() == i6) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i6 + " parameters found " + list.size());
    }

    public static void x(String str, int i6, List list) {
        if (list.size() >= i6) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i6 + " parameters found " + list.size());
    }

    public static void y(String str, int i6, ArrayList arrayList) {
        if (arrayList.size() <= i6) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i6 + " parameters found " + arrayList.size());
    }

    public static boolean z(n nVar) {
        if (nVar == null) {
            return false;
        }
        Double b10 = nVar.b();
        if (b10.isNaN() || b10.doubleValue() < 0.0d || !b10.equals(Double.valueOf(Math.floor(b10.doubleValue())))) {
            return false;
        }
        return true;
    }

    public abstract int c(View view, int i6);

    public abstract int d(View view, int i6);

    public int hashCode() {
        switch (this.f622a) {
            case 10:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public abstract int k(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int l();

    public int m(View view) {
        return 0;
    }

    public abstract ViewPropertyAnimator n(View view, int i6);

    public int o() {
        return 0;
    }

    public abstract void q(int i6);

    public abstract void r(View view, int i6, int i10);

    public abstract void s(View view, float f3, float f10);

    public String toString() {
        switch (this.f622a) {
            case 10:
                String c10 = x.a(getClass()).c();
                kotlin.jvm.internal.k.b(c10);
                return c10;
            default:
                return super.toString();
        }
    }

    public abstract boolean u(View view, int i6);

    public void p(View view, int i6) {
    }
}

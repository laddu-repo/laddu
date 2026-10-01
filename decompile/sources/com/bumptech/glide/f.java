package com.bumptech.glide;

import ac.g0;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.google.android.gms.internal.measurement.mb;
import ef.f0;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import ke.p;
import pd.s;
import t0.l0;
import t0.m0;
import w1.t;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f2348a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f2349b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f2350c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Field f2351d;

    public static od.c B(ce.a aVar) {
        od.k kVar = od.k.f10125a;
        od.i iVar = new od.i();
        iVar.f10120v = aVar;
        iVar.f10121w = kVar;
        return iVar;
    }

    public static final boolean H(String str) {
        de.i.e(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e2, code lost:
    
        r0 = qf.g.d(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e6, code lost:
    
        b8.h.h(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static t4.h I(v4.a r31, java.lang.String r32) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.f.I(v4.a, java.lang.String):t4.h");
    }

    public static long J(t tVar, int i, int i10) {
        tVar.J(i);
        if (tVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iJ = tVar.j();
        if ((8388608 & iJ) != 0 || ((2096896 & iJ) >> 8) != i10 || (iJ & 32) == 0 || tVar.x() < 7 || tVar.a() < 7 || (tVar.x() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        tVar.h(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }

    public static z3.g K(z3.g gVar, String[] strArr, Map map) {
        int i = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (z3.g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                z3.g gVar2 = new z3.g();
                int length = strArr.length;
                while (i < length) {
                    gVar2.a((z3.g) map.get(strArr[i]));
                    i++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                gVar.a((z3.g) map.get(strArr[0]));
                return gVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    gVar.a((z3.g) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return gVar;
    }

    public static long L(long j8, long j9) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j9) + Long.numberOfLeadingZeros(j9) + Long.numberOfLeadingZeros(~j8) + Long.numberOfLeadingZeros(j8);
        if (iNumberOfLeadingZeros > 65) {
            return j8 * j9;
        }
        long j10 = ((j8 ^ j9) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j9 == Long.MIN_VALUE) & (j8 < 0)))) {
            long j11 = j8 * j9;
            if (j8 == 0 || j11 / j8 == j9) {
                return j11;
            }
        }
        return j10;
    }

    public static final void M(int i, int i10, String str) {
        de.i.e(str, "fileTempDir");
        try {
            String strV = v(i, str);
            long j8 = i10;
            de.i.e(strV, "filePath");
            File fileT = z7.b.t(strV);
            if (fileT.exists()) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(fileT, "rw");
                try {
                    randomAccessFile.seek(0L);
                    randomAccessFile.setLength(0L);
                    randomAccessFile.writeLong(j8);
                } catch (Exception unused) {
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
                randomAccessFile.close();
            }
        } catch (Exception unused3) {
        }
    }

    public static final long S(int i, le.c cVar) {
        de.i.e(cVar, "unit");
        return cVar.compareTo(le.c.SECONDS) <= 0 ? o(fa.b.g(i, cVar, le.c.NANOSECONDS)) : T(i, cVar);
    }

    public static final long T(long j8, le.c cVar) {
        de.i.e(cVar, "unit");
        le.c cVar2 = le.c.NANOSECONDS;
        long jG = fa.b.g(4611686018426999999L, cVar2, cVar);
        if ((-jG) <= j8 && j8 <= jG) {
            return o(fa.b.g(j8, cVar, cVar2));
        }
        le.c cVar3 = le.c.MILLISECONDS;
        de.i.e(cVar3, "targetUnit");
        return n(android.support.v4.media.session.b.f(cVar3.f8345v.convert(j8, cVar.f8345v)));
    }

    public static String U(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c10 = charArray[i];
                    if (c10 >= 'A' && c10 <= 'Z') {
                        charArray[i] = (char) (c10 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String V(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c10 = charArray[i];
                    if (c10 >= 'a' && c10 <= 'z') {
                        charArray[i] = (char) (c10 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i10) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i10, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i10 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i10, 33);
    }

    public static long d(long j8, long j9) {
        long j10 = j8 + j9;
        if (((j9 ^ j8) < 0) || ((j8 ^ j10) >= 0)) {
            return j10;
        }
        throw new ArithmeticException();
    }

    public static final void g(int i, int i10) {
        if (i <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i10 + ").");
    }

    public static final void i(int i, String str) {
        File[] fileArrListFiles;
        de.i.e(str, "fileTempDir");
        try {
            File file = new File(str);
            if (!file.exists() || (fileArrListFiles = file.listFiles()) == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (File file2 : fileArrListFiles) {
                de.i.b(file2);
                if (p.B(zd.a.v(file2), i + ".", false)) {
                    arrayList.add(file2);
                }
            }
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                File file3 = (File) obj;
                if (file3.exists()) {
                    file3.delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    public static boolean j(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = m0.f11853a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = l0.f11847d;
        l0 l0Var = (l0) view.getTag(g0.c.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (l0Var == null) {
            l0Var = new l0();
            l0Var.f11848a = null;
            l0Var.f11849b = null;
            l0Var.f11850c = null;
            view.setTag(g0.c.tag_unhandled_key_event_manager, l0Var);
        }
        WeakReference weakReference2 = l0Var.f11850c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        l0Var.f11850c = new WeakReference(keyEvent);
        if (l0Var.f11849b == null) {
            l0Var.f11849b = new SparseArray();
        }
        SparseArray sparseArray = l0Var.f11849b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(g0.c.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        throw d0.d.f(size, arrayList);
    }

    public static boolean k(t0.j jVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (jVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return jVar.b(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f2348a) {
                            try {
                                f2349b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f2348a = true;
                        }
                        Method method = f2349b;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (m0.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f2350c) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f2351d = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f2350c = true;
                }
                Field field = f2351d;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (m0.c(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && m0.c(view, keyEvent)) || jVar.b(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long m(long j8, long j9, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j10 = j8 / j9;
        long j11 = j8 - (j9 * j10);
        if (j11 == 0) {
            return j10;
        }
        int i = ((int) ((j8 ^ j9) >> 63)) | 1;
        switch (ba.e.f1599a[roundingMode.ordinal()]) {
            case 1:
                fa.b.f(j11 == 0);
                return j10;
            case 2:
                return j10;
            case 3:
                if (i >= 0) {
                    return j10;
                }
                return j10 + ((long) i);
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                return j10 + ((long) i);
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                if (i <= 0) {
                    return j10;
                }
                return j10 + ((long) i);
            case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                long jAbs = Math.abs(j11);
                long jAbs2 = jAbs - (Math.abs(j9) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j10) == 0)) {
                        return j10;
                    }
                } else if (jAbs2 <= 0) {
                    return j10;
                }
                return j10 + ((long) i);
            default:
                throw new AssertionError();
        }
    }

    public static final long n(long j8) {
        long j9 = (j8 << 1) + 1;
        int i = le.a.f8338y;
        int i10 = le.b.f8340a;
        return j9;
    }

    public static final long o(long j8) {
        long j9 = j8 << 1;
        int i = le.a.f8338y;
        int i10 = le.b.f8340a;
        return j9;
    }

    public static boolean q(String str, String str2) {
        char c10;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == str2.charAt(i) || ((c10 = (char) ((r3 | ' ') - 97)) < 26 && c10 == ((char) ((r4 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static long r(long j8, long j9) {
        fa.b.e("a", j8);
        fa.b.e("b", j9);
        if (j8 == 0) {
            return j9;
        }
        if (j9 == 0) {
            return j8;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j8);
        long jNumberOfTrailingZeros = j8 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j9);
        long j10 = j9 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j10) {
            long j11 = jNumberOfTrailingZeros - j10;
            long j12 = (j11 >> 63) & j11;
            long j13 = (j11 - j12) - j12;
            j10 += j12;
            jNumberOfTrailingZeros = j13 >> Long.numberOfTrailingZeros(j13);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static ef.o s(SSLSession sSLSession) throws IOException {
        Object objJ;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        ef.h hVarB = ef.h.f4976b.b(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        f0.f4970w.getClass();
        f0 f0VarC = ef.b.c(protocol);
        try {
            objJ = ff.f.j(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            objJ = pd.p.f10551v;
        }
        return new ef.o(f0VarC, hVarB, ff.f.j(sSLSession.getLocalCertificates()), new g0(7, objJ));
    }

    public static final String u(int i, int i10, String str) {
        de.i.e(str, "fileTempDir");
        return str + "/" + i + "." + i10 + ".data";
    }

    public static final String v(int i, String str) {
        de.i.e(str, "fileTempDir");
        return str + "/" + i + ".meta.data";
    }

    public static final ad.c w(ad.e eVar, String str) {
        de.i.e(eVar, "download");
        return y(eVar, -1L, -1L, str, 0, 16);
    }

    public static ad.c y(ad.e eVar, long j8, long j9, String str, int i, int i10) {
        if ((i10 & 8) != 0) {
            str = "GET";
        }
        String str2 = str;
        de.i.e(eVar, "download");
        if (j8 == -1) {
            j8 = 0;
        }
        String strValueOf = j9 == -1 ? "" : String.valueOf(j9);
        LinkedHashMap linkedHashMapU = s.U(eVar.B);
        linkedHashMapU.put("Range", "bytes=" + j8 + "-" + strValueOf);
        String str3 = eVar.f485x;
        String str4 = eVar.f486y;
        return new ad.c(str3, linkedHashMapU, str4, z7.b.u(str4), str2, eVar.M);
    }

    public boolean A() {
        return false;
    }

    public abstract void C();

    public abstract boolean E(int i, KeyEvent keyEvent);

    public boolean F(KeyEvent keyEvent) {
        return false;
    }

    public boolean G() {
        return false;
    }

    public abstract void N(boolean z2);

    public abstract void O(boolean z2);

    public abstract void P(boolean z2);

    public abstract void Q(CharSequence charSequence);

    public m.a R(sc.b bVar) {
        return null;
    }

    public r7.c b(Context context, Looper looper, mb mbVar, Object obj, r7.g gVar, r7.h hVar) {
        return c(context, looper, mbVar, obj, (s7.j) gVar, (s7.j) hVar);
    }

    public r7.c c(Context context, Looper looper, mb mbVar, Object obj, s7.j jVar, s7.j jVar2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public boolean e() {
        return false;
    }

    public abstract boolean f();

    public abstract String h(byte[] bArr, int i, int i10);

    public abstract void l(boolean z2);

    public abstract int p(String str, byte[] bArr, int i, int i10);

    public abstract int t();

    public abstract Context z();

    public void D() {
    }
}

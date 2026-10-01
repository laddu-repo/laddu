package a8;

import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.c5;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.x;
import t2.s;
import wf.y0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class f implements vf.b, vf.a {

    /* renamed from: a, reason: collision with root package name */
    public static long f623a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f624b;

    public static List D(int... iArr) {
        if (iArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        return new gb.b(0, iArr.length, iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.jvm.internal.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object E(androidx.lifecycle.y r5, ne.c r6) {
        /*
            boolean r0 = r6 instanceof a7.b
            if (r0 == 0) goto L13
            r0 = r6
            a7.b r0 = (a7.b) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            a7.b r0 = new a7.b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f590z
            int r1 = r0.A
            he.y r2 = he.y.f6101a
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2d
            kotlin.jvm.internal.w r5 = r0.f589y
            androidx.lifecycle.y r0 = r0.f588x
            he.a.f(r6)     // Catch: java.lang.Throwable -> L2b
            goto L72
        L2b:
            r6 = move-exception
            goto L81
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            he.a.f(r6)
            androidx.lifecycle.x r6 = r5.b()
            androidx.lifecycle.x r1 = androidx.lifecycle.x.A
            int r6 = r6.compareTo(r1)
            if (r6 < 0) goto L45
            return r2
        L45:
            kotlin.jvm.internal.w r6 = new kotlin.jvm.internal.w
            r6.<init>()
            r0.f588x = r5     // Catch: java.lang.Throwable -> L7c
            r0.f589y = r6     // Catch: java.lang.Throwable -> L7c
            r0.A = r3     // Catch: java.lang.Throwable -> L7c
            gf.k r1 = new gf.k     // Catch: java.lang.Throwable -> L7c
            le.c r0 = a8.c.i(r0)     // Catch: java.lang.Throwable -> L7c
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L7c
            r1.s()     // Catch: java.lang.Throwable -> L7c
            a7.c r0 = new a7.c     // Catch: java.lang.Throwable -> L7c
            r3 = 0
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> L7c
            r6.f8055x = r0     // Catch: java.lang.Throwable -> L7c
            r5.a(r0)     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r0 = r1.r()     // Catch: java.lang.Throwable -> L7c
            me.a r1 = me.a.f8833x
            if (r0 != r1) goto L70
            return r1
        L70:
            r0 = r5
            r5 = r6
        L72:
            java.lang.Object r5 = r5.f8055x
            androidx.lifecycle.e0 r5 = (androidx.lifecycle.e0) r5
            if (r5 == 0) goto L7b
            r0.c(r5)
        L7b:
            return r2
        L7c:
            r0 = move-exception
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L81:
            java.lang.Object r5 = r5.f8055x
            androidx.lifecycle.e0 r5 = (androidx.lifecycle.e0) r5
            if (r5 == 0) goto L8a
            r0.c(r5)
        L8a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.f.E(androidx.lifecycle.y, ne.c):java.lang.Object");
    }

    public static void F(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static int G(long j) {
        boolean z10;
        int i6 = (int) j;
        if (i6 == j) {
            z10 = true;
        } else {
            z10 = false;
        }
        jb.b.c(j, "Out of range: %s", z10);
        return i6;
    }

    public static final void H(int i6, int i10) {
        if (i6 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i6 + ") is greater than size (" + i10 + ").");
    }

    public static u2.h I(s sVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = sVar.length();
        int i6 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (sVar.a(i10, elapsedRealtime)) {
                i6++;
            }
        }
        return new u2.h(1, 0, length, i6);
    }

    public static final long J() {
        return Thread.currentThread().getId();
    }

    public static void K(String str, String str2, Object obj) {
        String Q = Q(str);
        if (Log.isLoggable(Q, 3)) {
            Log.d(Q, String.format(str2, obj));
        }
    }

    public static void M(String str, String str2, Exception exc) {
        String Q = Q(str);
        if (Log.isLoggable(Q, 6)) {
            Log.e(Q, str2, exc);
        }
    }

    public static View N(View view, int i6) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View findViewById = viewGroup.getChildAt(i10).findViewById(i6);
                if (findViewById != null) {
                    return findViewById;
                }
            }
            return null;
        }
        return null;
    }

    public static int O(byte b10, byte b11, byte b12, byte b13) {
        return (b10 << 24) | ((b11 & 255) << 16) | ((b12 & 255) << 8) | (b13 & 255);
    }

    public static Set P() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static String Q(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            String concat = "TRuntime.".concat(str);
            if (concat.length() > 23) {
                return concat.substring(0, 23);
            }
            return concat;
        }
        return "TRuntime.".concat(str);
    }

    public static int R(int[] iArr, int i6, int i10, int i11) {
        while (i10 < i11) {
            if (iArr[i10] == i6) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static boolean S() {
        if (Build.VERSION.SDK_INT >= 29) {
            return n5.a.a();
        }
        try {
            if (f624b == null) {
                f623a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f624b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f624b.invoke(null, Long.valueOf(f623a))).booleanValue();
        } catch (Exception e10) {
            if (e10 instanceof InvocationTargetException) {
                Throwable cause = e10.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e10);
            return false;
        }
    }

    public static int T(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int[] U(Collection collection) {
        if (collection instanceof gb.b) {
            gb.b bVar = (gb.b) collection;
            return Arrays.copyOfRange(bVar.f5601x, bVar.f5602y, bVar.f5603z);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            Object obj = array[i6];
            obj.getClass();
            iArr[i6] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Integer V(String str) {
        byte b10;
        Integer num;
        Long l10;
        byte b11;
        str.getClass();
        if (!str.isEmpty()) {
            int i6 = 0;
            if (str.charAt(0) == '-') {
                i6 = 1;
            }
            if (i6 != str.length()) {
                int i10 = i6 + 1;
                char charAt = str.charAt(i6);
                if (charAt < 128) {
                    b10 = gb.c.f5604a[charAt];
                } else {
                    byte[] bArr = gb.c.f5604a;
                    b10 = -1;
                }
                if (b10 >= 0 && b10 < 10) {
                    long j = -b10;
                    long j10 = 10;
                    long j11 = Long.MIN_VALUE / j10;
                    while (true) {
                        if (i10 < str.length()) {
                            int i11 = i10 + 1;
                            char charAt2 = str.charAt(i10);
                            if (charAt2 < 128) {
                                b11 = gb.c.f5604a[charAt2];
                            } else {
                                byte[] bArr2 = gb.c.f5604a;
                                b11 = -1;
                            }
                            if (b11 < 0 || b11 >= 10 || j < j11) {
                                break;
                            }
                            long j12 = j * j10;
                            num = null;
                            long j13 = b11;
                            if (j12 < j13 - Long.MIN_VALUE) {
                                break;
                            }
                            j = j12 - j13;
                            i10 = i11;
                        } else {
                            num = null;
                            if (i6 != 0) {
                                l10 = Long.valueOf(j);
                            } else if (j != Long.MIN_VALUE) {
                                l10 = Long.valueOf(-j);
                            }
                        }
                    }
                }
                num = null;
                l10 = num;
                if (l10 == 0 && l10.longValue() == l10.intValue()) {
                    return Integer.valueOf(l10.intValue());
                }
                return num;
            }
        }
        l10 = 0;
        num = null;
        if (l10 == 0) {
        }
        return num;
    }

    public static String W(c5 c5Var) {
        StringBuilder sb2 = new StringBuilder(c5Var.c());
        for (int i6 = 0; i6 < c5Var.c(); i6++) {
            byte a10 = c5Var.a(i6);
            if (a10 != 34) {
                if (a10 != 39) {
                    if (a10 != 92) {
                        switch (a10) {
                            case 7:
                                sb2.append("\\a");
                                break;
                            case 8:
                                sb2.append("\\b");
                                break;
                            case 9:
                                sb2.append("\\t");
                                break;
                            case 10:
                                sb2.append("\\n");
                                break;
                            case 11:
                                sb2.append("\\v");
                                break;
                            case 12:
                                sb2.append("\\f");
                                break;
                            case 13:
                                sb2.append("\\r");
                                break;
                            default:
                                if (a10 >= 32 && a10 <= 126) {
                                    sb2.append((char) a10);
                                    break;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((a10 >>> 6) & 3) + 48));
                                    sb2.append((char) (((a10 >>> 3) & 7) + 48));
                                    sb2.append((char) ((a10 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }

    @Override // vf.b
    public abstract short A();

    @Override // vf.b
    public float B() {
        L();
        throw null;
    }

    @Override // vf.b
    public double C() {
        L();
        throw null;
    }

    public void L() {
        throw new IllegalArgumentException(x.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // vf.a
    public Object a(uf.g descriptor, int i6, sf.a deserializer, Object obj) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        kotlin.jvm.internal.k.e(deserializer, "deserializer");
        if (!deserializer.d().c() && !v()) {
            return null;
        }
        return c(deserializer);
    }

    @Override // vf.b
    public Object c(sf.a deserializer) {
        kotlin.jvm.internal.k.e(deserializer, "deserializer");
        return deserializer.a(this);
    }

    @Override // vf.b
    public boolean d() {
        L();
        throw null;
    }

    @Override // vf.b
    public vf.b e(uf.g descriptor) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        return this;
    }

    @Override // vf.a
    public Object f(uf.g descriptor, int i6, sf.a deserializer, Object obj) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        kotlin.jvm.internal.k.e(deserializer, "deserializer");
        return c(deserializer);
    }

    @Override // vf.b
    public char g() {
        L();
        throw null;
    }

    @Override // vf.b
    public vf.a h(uf.g descriptor) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        return this;
    }

    @Override // vf.a
    public double i(y0 descriptor, int i6) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        return C();
    }

    @Override // vf.a
    public void j(uf.g descriptor) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
    }

    @Override // vf.b
    public int k(uf.g enumDescriptor) {
        kotlin.jvm.internal.k.e(enumDescriptor, "enumDescriptor");
        L();
        throw null;
    }

    @Override // vf.b
    public abstract int l();

    @Override // vf.a
    public byte m(y0 descriptor, int i6) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        return z();
    }

    @Override // vf.a
    public boolean n(uf.g descriptor, int i6) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        return d();
    }

    @Override // vf.a
    public String p(uf.g descriptor, int i6) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        return q();
    }

    @Override // vf.b
    public String q() {
        L();
        throw null;
    }

    @Override // vf.a
    public vf.b r(y0 descriptor, int i6) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        return e(descriptor.h(i6));
    }

    @Override // vf.a
    public float s(y0 descriptor, int i6) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        return B();
    }

    @Override // vf.a
    public int t(uf.g descriptor, int i6) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        return l();
    }

    @Override // vf.b
    public abstract long u();

    @Override // vf.b
    public boolean v() {
        return true;
    }

    @Override // vf.a
    public char w(y0 descriptor, int i6) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        return g();
    }

    @Override // vf.a
    public short x(y0 descriptor, int i6) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        return A();
    }

    @Override // vf.a
    public long y(uf.g descriptor, int i6) {
        kotlin.jvm.internal.k.e(descriptor, "descriptor");
        return u();
    }

    @Override // vf.b
    public abstract byte z();
}

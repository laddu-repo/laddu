package a8;

import android.content.Context;
import android.util.TypedValue;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.Request;
import u5.m;
import u5.u;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class g {
    public static float a(float f3) {
        if (f3 <= 0.04045f) {
            return f3 / 12.92f;
        }
        return (float) Math.pow((f3 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float b(float f3) {
        if (f3 <= 0.0031308f) {
            return f3 * 12.92f;
        }
        return (float) ((Math.pow(f3, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static je.c c(je.c cVar) {
        cVar.f();
        cVar.f7424z = true;
        if (cVar.f7423y > 0) {
            return cVar;
        }
        return je.c.A;
    }

    public static int d(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static long[] e(long[]... jArr) {
        boolean z10;
        long j = 0;
        for (long[] jArr2 : jArr) {
            j += jArr2.length;
        }
        int i6 = (int) j;
        if (j == i6) {
            z10 = true;
        } else {
            z10 = false;
        }
        jb.b.c(j, "the total number of elements (%s) in the arrays must fit in an int", z10);
        long[] jArr3 = new long[i6];
        int i10 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, i10, jArr4.length);
            i10 += jArr4.length;
        }
        return jArr3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (a8.a.f(r9, r1, r3, r2, r8) == 1.0d) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap f(android.graphics.drawable.Drawable r5, android.graphics.Bitmap.Config r6, w6.h r7, w6.g r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.g.f(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, w6.h, w6.g, boolean):android.graphics.Bitmap");
    }

    public static final t7.b g(Request request) {
        kotlin.jvm.internal.k.e(request, "<this>");
        t7.b bVar = (t7.b) request.tag(t7.b.class);
        if (bVar == null) {
            Context context = p7.a.f10615a;
            return p7.a.f10622h;
        }
        return bVar;
    }

    public static je.c h() {
        return new je.c(10);
    }

    public static int i(float f3, int i6, int i10) {
        if (i6 == i10 || f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return i6;
        }
        if (f3 >= 1.0f) {
            return i10;
        }
        float f10 = ((i6 >> 24) & 255) / 255.0f;
        float f11 = ((i10 >> 24) & 255) / 255.0f;
        float a10 = a(((i6 >> 16) & 255) / 255.0f);
        float a11 = a(((i6 >> 8) & 255) / 255.0f);
        float a12 = a((i6 & 255) / 255.0f);
        float a13 = a(((i10 >> 16) & 255) / 255.0f);
        float a14 = a(((i10 >> 8) & 255) / 255.0f);
        float a15 = a((i10 & 255) / 255.0f);
        float f12 = h8.c.f(f11, f10, f3, f10);
        float f13 = h8.c.f(a13, a10, f3, a10);
        float f14 = h8.c.f(a14, a11, f3, a11);
        float f15 = h8.c.f(a15, a12, f3, a12);
        float b10 = b(f13) * 255.0f;
        float b11 = b(f14) * 255.0f;
        return Math.round(b(f15) * 255.0f) | (Math.round(b10) << 16) | (Math.round(f12 * 255.0f) << 24) | (Math.round(b11) << 8);
    }

    public static final String j() {
        ff.b bVar;
        byte[] bArr = new byte[16];
        ff.a.f5269a.nextBytes(bArr);
        byte b10 = (byte) (bArr[6] & 15);
        bArr[6] = b10;
        bArr[6] = (byte) (b10 | 64);
        byte b11 = (byte) (bArr[8] & 63);
        bArr[8] = b11;
        bArr[8] = (byte) (b11 | 128);
        long j = a.j(0, bArr);
        long j10 = a.j(8, bArr);
        if (j == 0 && j10 == 0) {
            bVar = ff.b.f5270z;
        } else {
            bVar = new ff.b(j, j10);
        }
        return bVar.toString();
    }

    public static int k(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static boolean l(String str) {
        u5.b bVar = u.f12920a;
        Set<m> unmodifiableSet = Collections.unmodifiableSet(u5.c.f12906c);
        HashSet hashSet = new HashSet();
        for (m mVar : unmodifiableSet) {
            if (((u5.c) mVar).f12907a.equals(str)) {
                hashSet.add(mVar);
            }
        }
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                u5.c cVar = (u5.c) ((m) it.next());
                if (cVar.a() || cVar.b()) {
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException("Unknown feature ".concat(str));
    }

    public static List m(Object obj) {
        List singletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.k.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [f1.b, f1.c] */
    public static f1.b n(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i6 = duplicate.getShort() & 65535;
        if (i6 <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i10 = 0;
            while (true) {
                if (i10 < i6) {
                    int i11 = duplicate.getInt();
                    duplicate.position(duplicate.position() + 4);
                    j = duplicate.getInt() & 4294967295L;
                    duplicate.position(duplicate.position() + 4);
                    if (1835365473 == i11) {
                        break;
                    }
                    i10++;
                } else {
                    j = -1;
                    break;
                }
            }
            if (j != -1) {
                duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
                duplicate.position(duplicate.position() + 12);
                long j10 = duplicate.getInt() & 4294967295L;
                for (int i12 = 0; i12 < j10; i12++) {
                    int i13 = duplicate.getInt();
                    long j11 = duplicate.getInt() & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i13 || 1701669481 == i13) {
                        duplicate.position((int) (j11 + j));
                        ?? cVar = new f1.c();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        cVar.A = duplicate;
                        cVar.f4630x = position;
                        int i14 = position - duplicate.getInt(position);
                        cVar.f4631y = i14;
                        cVar.f4632z = ((ByteBuffer) cVar.A).getShort(i14);
                        return cVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static TypedValue o(Context context, int i6) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i6, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean p(Context context, int i6, boolean z10) {
        TypedValue o10 = o(context, i6);
        if (o10 != null && o10.type == 18) {
            if (o10.data != 0) {
                return true;
            }
            return false;
        }
        return z10;
    }

    public static TypedValue q(int i6, Context context, String str) {
        TypedValue o10 = o(context, i6);
        if (o10 != null) {
            return o10;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i6)));
    }

    public static boolean r(byte b10) {
        if (b10 > -65) {
            return true;
        }
        return false;
    }
}

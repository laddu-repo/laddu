package e9;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import cf.l;
import cf.p;
import cf.t;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import l4.x;
import p.n3;
import p.p3;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static ClassLoader f4492a;

    /* renamed from: b, reason: collision with root package name */
    public static Thread f4493b;

    /* renamed from: c, reason: collision with root package name */
    public static Field f4494c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f4495d;

    /* renamed from: e, reason: collision with root package name */
    public static Class f4496e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f4497f;

    /* renamed from: g, reason: collision with root package name */
    public static Field f4498g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f4499h;

    /* renamed from: i, reason: collision with root package name */
    public static Field f4500i;
    public static boolean j;

    public static Parcelable a(Parcelable parcelable, Parcelable.Creator creator) {
        if (parcelable == null) {
            return null;
        }
        Parcelable parcelable2 = (Parcelable) g(parcelable);
        Parcel obtain = Parcel.obtain();
        try {
            parcelable2.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            return (Parcelable) g((Parcelable) creator.createFromParcel(obtain));
        } finally {
            obtain.recycle();
        }
    }

    public static final long b(InputStream inputStream, OutputStream outputStream, int i6) {
        byte[] bArr = new byte[i6];
        int read = inputStream.read(bArr);
        long j10 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j10 += read;
            read = inputStream.read(bArr);
        }
        return j10;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final x d(View view) {
        Object next;
        kotlin.jvm.internal.k.e(view, "view");
        cf.f fVar = new cf.f(new cf.g(new t(l.M(new p(20), view), new p(21), 1), false, new p(0)));
        if (!fVar.hasNext()) {
            next = null;
        } else {
            next = fVar.next();
        }
        x xVar = (x) next;
        if (xVar != null) {
            return xVar;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    public static void e(Object obj) {
        LongSparseArray longSparseArray;
        if (!f4497f) {
            try {
                f4496e = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f4497f = true;
        }
        Class cls = f4496e;
        if (cls != null) {
            if (!f4499h) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f4498g = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e11) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
                }
                f4499h = true;
            }
            Field field = f4498g;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e12) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }

    public static final int f(g5.a connection) {
        kotlin.jvm.internal.k.e(connection, "connection");
        g5.c d02 = connection.d0("SELECT changes()");
        try {
            d02.X();
            int i6 = (int) d02.getLong(0);
            c9.a.c(d02, null);
            return i6;
        } finally {
        }
    }

    public static Object g(Parcelable parcelable) {
        if (Build.VERSION.SDK_INT < 23) {
            if (parcelable instanceof MediaBrowserCompat$MediaItem) {
                MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) parcelable;
                MediaDescriptionCompat mediaDescriptionCompat = mediaBrowserCompat$MediaItem.f718y;
                return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(mediaDescriptionCompat.f719x, mediaDescriptionCompat.f720y, mediaDescriptionCompat.f721z, mediaDescriptionCompat.A, mediaDescriptionCompat.B, mediaDescriptionCompat.C, mediaDescriptionCompat.D, mediaDescriptionCompat.E), mediaBrowserCompat$MediaItem.f717x);
            }
            if (parcelable instanceof MediaDescriptionCompat) {
                MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat) parcelable;
                return new MediaDescriptionCompat(mediaDescriptionCompat2.f719x, mediaDescriptionCompat2.f720y, mediaDescriptionCompat2.f721z, mediaDescriptionCompat2.A, mediaDescriptionCompat2.B, mediaDescriptionCompat2.C, mediaDescriptionCompat2.D, mediaDescriptionCompat2.E);
            }
        }
        return parcelable;
    }

    public static long h(u1.t tVar, int i6, int i10) {
        tVar.K(i6);
        if (tVar.a() < 5) {
            return -9223372036854775807L;
        }
        int k8 = tVar.k();
        if ((8388608 & k8) != 0 || ((2096896 & k8) >> 8) != i10 || (k8 & 32) == 0 || tVar.y() < 7 || tVar.a() < 7 || (tVar.y() & 16) != 16) {
            return -9223372036854775807L;
        }
        tVar.i(new byte[6], 0, 6);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((255 & r0[4]) >> 7);
    }

    public static void i(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            n3.a(view, charSequence);
            return;
        }
        p3 p3Var = p3.H;
        if (p3Var != null && p3Var.f10353x == view) {
            p3.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            p3 p3Var2 = p3.I;
            if (p3Var2 != null && p3Var2.f10353x == view) {
                p3Var2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new p3(view, charSequence);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a4, code lost:
    
        if (r1 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized java.lang.ClassLoader j() {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.f.j():java.lang.ClassLoader");
    }
}

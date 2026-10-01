package com.google.android.gms.internal.measurement;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a4 {

    /* renamed from: a, reason: collision with root package name */
    public static p.q3 f2139a = null;

    /* renamed from: b, reason: collision with root package name */
    public static volatile k7.d f2140b = null;

    /* renamed from: c, reason: collision with root package name */
    public static volatile k7.c f2141c = null;

    /* renamed from: d, reason: collision with root package name */
    public static int f2142d = 2;

    public static final wf.h0 a(sf.a keySerializer, sf.a valueSerializer) {
        kotlin.jvm.internal.k.e(keySerializer, "keySerializer");
        kotlin.jvm.internal.k.e(valueSerializer, "valueSerializer");
        return new wf.h0(keySerializer, valueSerializer);
    }

    public static final Object b(s9.n nVar, ne.j jVar) {
        if (nVar.g()) {
            Exception e10 = nVar.e();
            if (e10 == null) {
                if (!nVar.f12278d) {
                    return nVar.f();
                }
                throw new CancellationException("Task " + nVar + " was cancelled normally.");
            }
            throw e10;
        }
        gf.k kVar = new gf.k(1, a8.c.i(jVar));
        kVar.s();
        nVar.i(rf.a.f11952x, new k7.d(kVar, 24));
        return kVar.r();
    }

    public static w1.l c(e2.m mVar, String str, e2.j jVar, int i6) {
        Map map = Collections.EMPTY_MAP;
        Uri o10 = u1.a.o(str, jVar.f4255c);
        long j = jVar.f4253a;
        long j10 = jVar.f4254b;
        String a10 = mVar.a();
        if (a10 == null) {
            a10 = u1.a.o(((e2.b) mVar.f4258y.get(0)).f4210a, jVar.f4255c).toString();
        }
        String str2 = a10;
        u1.c.i(o10, "The uri must be set.");
        return new w1.l(o10, 1, null, db.h1.D, j, j10, str2, i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r2 == null) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static v5.e d(byte[] r7) {
        /*
            v5.e r0 = new v5.e
            r0.<init>()
            if (r7 != 0) goto L8
            goto L55
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            int r7 = r2.readInt()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
        L17:
            if (r7 <= 0) goto L36
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            v5.d r5 = new v5.d     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r5.<init>(r4, r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.util.HashSet r3 = r0.f13316a     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r3.add(r5)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            int r7 = r7 + (-1)
            goto L17
        L32:
            r7 = move-exception
            goto L56
        L34:
            r7 = move-exception
            goto L4f
        L36:
            r2.close()     // Catch: java.io.IOException -> L3a
            goto L3e
        L3a:
            r7 = move-exception
            r7.printStackTrace()
        L3e:
            r1.close()     // Catch: java.io.IOException -> L42
            goto L55
        L42:
            r7 = move-exception
            r7.printStackTrace()
            goto L55
        L47:
            r0 = move-exception
            r2 = r7
            r7 = r0
            goto L56
        L4b:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L4f:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L3e
            goto L36
        L55:
            return r0
        L56:
            if (r2 == 0) goto L60
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L60
        L5c:
            r0 = move-exception
            r0.printStackTrace()
        L60:
            r1.close()     // Catch: java.io.IOException -> L64
            goto L68
        L64:
            r0 = move-exception
            r0.printStackTrace()
        L68:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.a4.d(byte[]):v5.e");
    }

    public static Drawable e(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        boolean z10;
        if (Build.VERSION.SDK_INT < 23) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            Drawable mutate = s1.c.A(drawable).mutate();
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        if (z10) {
            drawable.mutate();
        }
        return drawable;
    }

    public static Bitmap f(byte[] bArr, int i6, int i10) {
        BitmapFactory.Options options;
        int i11 = 0;
        int i12 = 1;
        if (i10 != -1) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i6, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int max = Math.max(options.outWidth, options.outHeight); max > i10; max /= 2) {
                options.inSampleSize *= 2;
            }
        } else {
            options = null;
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i6, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (decodeByteArray != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                h1.g gVar = new h1.g(byteArrayInputStream);
                byteArrayInputStream.close();
                h1.c c10 = gVar.c("Orientation");
                if (c10 != null) {
                    try {
                        i12 = c10.e(gVar.f5851f);
                    } catch (NumberFormatException unused) {
                    }
                }
                switch (i12) {
                    case 3:
                    case 4:
                        i11 = 180;
                        break;
                    case 5:
                    case 8:
                        i11 = 270;
                        break;
                    case 6:
                    case 7:
                        i11 = 90;
                        break;
                }
                if (i11 != 0) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i11);
                    return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
                }
                return decodeByteArray;
            } finally {
            }
        } else {
            throw r1.l0.a(new IllegalStateException(), "Could not decode image data");
        }
    }

    public static ColorStateList g(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT >= 29 && androidx.lifecycle.x0.u(drawable)) {
            colorStateList = androidx.lifecycle.x0.b(drawable).getColorStateList();
            return colorStateList;
        }
        return null;
    }

    public static l4.m h(androidx.lifecycle.p1 p1Var) {
        o1.d factory = l4.n.f8162a;
        o1.a extras = o1.a.f9847b;
        kotlin.jvm.internal.k.e(factory, "factory");
        kotlin.jvm.internal.k.e(extras, "extras");
        ic.s sVar = new ic.s(p1Var, factory, extras);
        kotlin.jvm.internal.e a10 = kotlin.jvm.internal.x.a(l4.m.class);
        String b10 = a10.b();
        if (b10 != null) {
            return (l4.m) sVar.p("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b10), a10);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public static final sf.a i(sf.a aVar) {
        kotlin.jvm.internal.k.e(aVar, "<this>");
        if (aVar.d().c()) {
            return aVar;
        }
        return new wf.s0(aVar);
    }

    public static int j(int i6) {
        if (i6 == 0) {
            return 1;
        }
        if (i6 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(h8.c.j(i6, "Could not convert ", " to BackoffPolicy"));
    }

    public static int k(int i6) {
        if (i6 == 0) {
            return 1;
        }
        if (i6 == 1) {
            return 2;
        }
        if (i6 == 2) {
            return 3;
        }
        if (i6 == 3) {
            return 4;
        }
        if (i6 == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT >= 30 && i6 == 5) {
            return 6;
        }
        throw new IllegalArgumentException(h8.c.j(i6, "Could not convert ", " to NetworkType"));
    }

    public static int l(int i6) {
        if (i6 == 0) {
            return 1;
        }
        if (i6 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(h8.c.j(i6, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static int m(int i6) {
        if (i6 == 0) {
            return 1;
        }
        if (i6 == 1) {
            return 2;
        }
        if (i6 == 2) {
            return 3;
        }
        if (i6 == 3) {
            return 4;
        }
        if (i6 == 4) {
            return 5;
        }
        if (i6 == 5) {
            return 6;
        }
        throw new IllegalArgumentException(h8.c.j(i6, "Could not convert ", " to State"));
    }

    public static k7.c n(Context context) {
        k7.c cVar;
        Context applicationContext = context.getApplicationContext();
        k7.c cVar2 = f2141c;
        if (cVar2 == null) {
            synchronized (k7.c.class) {
                try {
                    cVar = f2141c;
                    if (cVar == null) {
                        cVar = new k7.c(new a2.e0(applicationContext, 11), 0);
                        f2141c = cVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return cVar;
        }
        return cVar2;
    }

    public static void o(Outline outline, Path path) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            ha.b.a(outline, path);
            return;
        }
        if (i6 >= 29) {
            try {
                ha.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            ha.a.a(outline, path);
        }
    }

    public static void p(Drawable drawable, int i6) {
        boolean z10;
        if (i6 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (Build.VERSION.SDK_INT == 21) {
            if (z10) {
                drawable.setColorFilter(i6, PorterDuff.Mode.SRC_IN);
                return;
            } else {
                drawable.setColorFilter(null);
                return;
            }
        }
        if (z10) {
            drawable.setTint(i6);
        } else {
            drawable.setTintList(null);
        }
    }

    public static int q(int i6) {
        int c10 = y.e.c(i6);
        if (c10 != 0) {
            int i10 = 1;
            if (c10 != 1) {
                i10 = 2;
                if (c10 != 2) {
                    i10 = 3;
                    if (c10 != 3) {
                        i10 = 4;
                        if (c10 != 4) {
                            if (c10 == 5) {
                                return 5;
                            }
                            throw new IllegalArgumentException("Could not convert " + h8.c.t(i6) + " to int");
                        }
                    }
                }
            }
            return i10;
        }
        return 0;
    }

    public static int r(Context context, int i6) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i6});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static synchronized void s(p.q3 q3Var) {
        synchronized (a4.class) {
            if (f2139a == null) {
                f2139a = q3Var;
            } else {
                throw new IllegalStateException("init() already called");
            }
        }
    }
}

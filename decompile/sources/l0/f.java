package l0;

import a2.c0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import hb.s;
import j1.f0;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import u5.r;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final android.support.v4.media.session.b f8069a;

    /* renamed from: b, reason: collision with root package name */
    public static final v.k f8070b;

    /* renamed from: c, reason: collision with root package name */
    public static Paint f8071c;

    static {
        a8.f.F("TypefaceCompat static init");
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 31) {
            f8069a = new android.support.v4.media.session.b();
        } else if (i6 >= 29) {
            f8069a = new android.support.v4.media.session.b();
        } else if (i6 >= 28) {
            f8069a = new i();
        } else if (i6 >= 26) {
            f8069a = new i();
        } else {
            if (i6 >= 24) {
                Method method = h.f8079c;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    f8069a = new android.support.v4.media.session.b();
                }
            }
            f8069a = new android.support.v4.media.session.b();
        }
        f8070b = new v.k(16);
        f8071c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, k0.d dVar, Resources resources, int i6, String str, int i10, int i11, k0.b bVar, boolean z10) {
        Typeface f3;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        boolean z11;
        int i12;
        Handler handler;
        int i13 = 27;
        int i14 = -3;
        if (dVar instanceof k0.g) {
            k0.g gVar = (k0.g) dVar;
            String str2 = gVar.f7562d;
            f3 = null;
            int i15 = 1;
            boolean z12 = false;
            byte b10 = 0;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = gVar.f7559a;
                if (arrayList.size() == 1) {
                    build = c(((q0.d) arrayList.get(0)).f10801e);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i16 = 0;
                        while (true) {
                            if (i16 < arrayList.size()) {
                                if (c(((q0.d) arrayList.get(i16)).f10801e) == null) {
                                    break;
                                }
                                i16++;
                            } else {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= arrayList.size()) {
                                        break;
                                    }
                                    q0.d dVar2 = (q0.d) arrayList.get(i17);
                                    if (i17 == arrayList.size() - 1 && TextUtils.isEmpty(dVar2.f10802f)) {
                                        customFallbackBuilder.setSystemFallback(dVar2.f10801e);
                                        break;
                                    }
                                    String str3 = dVar2.f10801e;
                                    String str4 = dVar2.f10802f;
                                    Font d10 = d(c(str3));
                                    if (d10 == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + dVar2.f10801e + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (!TextUtils.isEmpty(str4)) {
                                        build3 = k4.e.h(d10).build();
                                    } else {
                                        try {
                                            k4.e.k();
                                            k4.e.A();
                                            fontVariationSettings = c2.a.i(d10).setFontVariationSettings(str4);
                                            build2 = fontVariationSettings.build();
                                            build3 = k4.e.h(build2).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    }
                                    if (customFallbackBuilder != null) {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    } else {
                                        customFallbackBuilder = k4.e.d(build3);
                                    }
                                    i17++;
                                }
                                build = customFallbackBuilder.build();
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new c0(i13, bVar, build));
                }
                f8070b.l(b(resources, i6, str, i10, i11), build);
                return build;
            }
            if (!z10 ? bVar == null : gVar.f7561c == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                i12 = gVar.f7560b;
            } else {
                i12 = -1;
            }
            Handler handler2 = new Handler(Looper.getMainLooper());
            r rVar = new r(14, z12);
            rVar.f12916y = bVar;
            ArrayList arrayList2 = gVar.f7559a;
            q0.l lVar = new q0.l(handler2);
            f0 f0Var = new f0(i13, rVar, lVar);
            int i18 = 28;
            if (z11) {
                if (arrayList2.size() <= 1) {
                    q0.d dVar3 = (q0.d) arrayList2.get(0);
                    v.k kVar = q0.h.f10813a;
                    ArrayList arrayList3 = new ArrayList(1);
                    Object obj = new Object[]{dVar3}[0];
                    Objects.requireNonNull(obj);
                    arrayList3.add(obj);
                    String a10 = q0.h.a(i11, Collections.unmodifiableList(arrayList3));
                    Typeface typeface = (Typeface) q0.h.f10813a.h(a10);
                    if (typeface != null) {
                        lVar.execute(new s(i18, rVar, typeface));
                        f3 = typeface;
                    } else if (i12 == -1) {
                        Object[] objArr = {dVar3};
                        ArrayList arrayList4 = new ArrayList(1);
                        Object obj2 = objArr[0];
                        Objects.requireNonNull(obj2);
                        arrayList4.add(obj2);
                        q0.g b11 = q0.h.b(a10, context, Collections.unmodifiableList(arrayList4), i11);
                        f0Var.Y(b11);
                        f3 = b11.f10811a;
                    } else {
                        try {
                            try {
                                try {
                                    q0.g gVar2 = (q0.g) q0.h.f10814b.submit(new q0.e(a10, context, dVar3, i11, 0)).get(i12, TimeUnit.MILLISECONDS);
                                    f0Var.Y(gVar2);
                                    f3 = gVar2.f10811a;
                                } catch (ExecutionException e10) {
                                    throw new RuntimeException(e10);
                                } catch (TimeoutException unused2) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (InterruptedException e11) {
                                throw e11;
                            }
                        } catch (InterruptedException unused3) {
                            ((q0.l) f0Var.f6908z).execute(new com.google.android.material.datepicker.g(i14, 3, (r) f0Var.f6907y));
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
            } else {
                String a11 = q0.h.a(i11, arrayList2);
                Typeface typeface2 = (Typeface) q0.h.f10813a.h(a11);
                if (typeface2 != null) {
                    lVar.execute(new s(i18, rVar, typeface2));
                    f3 = typeface2;
                } else {
                    q0.f fVar = new q0.f(f0Var, b10 == true ? 1 : 0);
                    synchronized (q0.h.f10815c) {
                        try {
                            v.l lVar2 = q0.h.f10816d;
                            ArrayList arrayList5 = (ArrayList) lVar2.get(a11);
                            if (arrayList5 != null) {
                                arrayList5.add(fVar);
                            } else {
                                ArrayList arrayList6 = new ArrayList();
                                arrayList6.add(fVar);
                                lVar2.put(a11, arrayList6);
                                q0.e eVar = new q0.e(a11, context, arrayList2, i11, 1);
                                ThreadPoolExecutor threadPoolExecutor = q0.h.f10814b;
                                q0.f fVar2 = new q0.f(a11, i15);
                                if (Looper.myLooper() == null) {
                                    handler = new Handler(Looper.getMainLooper());
                                } else {
                                    handler = new Handler();
                                }
                                d6.b bVar2 = new d6.b(11);
                                bVar2.f3823z = eVar;
                                bVar2.f3822y = fVar2;
                                bVar2.A = handler;
                                threadPoolExecutor.execute(bVar2);
                            }
                        } finally {
                        }
                    }
                }
            }
        } else {
            f3 = f8069a.f(context, (k0.e) dVar, resources, i11);
            if (bVar != null) {
                if (f3 != null) {
                    new Handler(Looper.getMainLooper()).post(new c0(i13, bVar, f3));
                } else {
                    bVar.a(-3);
                }
            }
        }
        if (f3 != null) {
            f8070b.l(b(resources, i6, str, i10, i11), f3);
        }
        return f3;
    }

    public static String b(Resources resources, int i6, String str, int i10, int i11) {
        return resources.getResourcePackageName(i6) + '-' + str + '-' + i10 + '-' + i6 + '-' + i11;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        if (f8071c == null) {
            f8071c = new Paint();
        }
        f8071c.setTextSize(10.0f);
        f8071c.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, f8071c);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount != 0) {
            font = shapeTextRun.getFont(0);
            return font;
        }
        return null;
    }
}

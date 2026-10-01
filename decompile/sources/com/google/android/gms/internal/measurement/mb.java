package com.google.android.gms.internal.measurement;

import android.R;
import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class mb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2891e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f2892g;

    public /* synthetic */ mb(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f2887a = i;
        this.f2888b = obj;
        this.f2889c = obj2;
        this.f2890d = obj3;
        this.f2891e = obj4;
        this.f = obj5;
        this.f2892g = obj6;
    }

    public static va.p0 a(va.p0 p0Var, ua.e eVar, ya.c cVar, Map map) {
        Map mapUnmodifiableMap;
        va.o0 o0VarA = p0Var.a();
        String strG = ((ua.c) eVar.f12910w).g();
        if (strG != null) {
            o0VarA.f13469e = new va.c1(strG);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        c2.b bVar = (c2.b) cVar.f14651y;
        if (map.isEmpty()) {
            mapUnmodifiableMap = ((ua.d) ((AtomicMarkableReference) bVar.f1686w).getReference()).a();
        } else {
            HashMap map2 = new HashMap(((ua.d) ((AtomicMarkableReference) bVar.f1686w).getReference()).a());
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strB = ua.d.b(1024, (String) entry.getKey());
                if (map2.size() < 64 || map2.containsKey(strB)) {
                    map2.put(strB, ua.d.b(1024, (String) entry.getValue()));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            mapUnmodifiableMap = Collections.unmodifiableMap(map2);
        }
        List listL = l(mapUnmodifiableMap);
        List listL2 = l(((ua.d) ((AtomicMarkableReference) ((c2.b) cVar.f14652z).f1686w).getReference()).a());
        if (!listL.isEmpty() || !listL2.isEmpty()) {
            va.q0 q0Var = (va.q0) p0Var.f13477c;
            o0VarA.f13467c = new va.q0(q0Var.f13485a, listL, listL2, q0Var.f13488d, q0Var.f13489e, q0Var.f, q0Var.f13490g);
        }
        return o0VarA.a();
    }

    public static va.j2 b(va.p0 p0Var, ya.c cVar) {
        List listA = ((jf.u) cVar.A).a();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listA.size(); i++) {
            ua.m mVar = (ua.m) listA.get(i);
            mVar.getClass();
            va.d1 d1Var = new va.d1();
            ua.b bVar = (ua.b) mVar;
            String str = bVar.f12904e;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = bVar.f12901b;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            d1Var.f13319a = new va.f1(str2, str);
            String str3 = bVar.f12902c;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            d1Var.f13320b = str3;
            String str4 = bVar.f12903d;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            d1Var.f13321c = str4;
            d1Var.f13322d = bVar.f;
            d1Var.f13323e = (byte) (d1Var.f13323e | 1);
            arrayList.add(d1Var.a());
        }
        if (arrayList.isEmpty()) {
            return p0Var;
        }
        va.o0 o0VarA = p0Var.a();
        o0VarA.f = new va.g1(arrayList);
        return o0VarA.a();
    }

    public static boolean d(int[] iArr, int i) {
        for (int i10 : iArr) {
            if (i10 == i) {
                return true;
            }
        }
        return false;
    }

    public static mb e(View view) {
        View viewK;
        int i = fc.l.bottom_nav_container;
        if (((LinearLayout) a.a.k(view, i)) != null) {
            i = fc.l.iv_cats;
            if (((ImageView) a.a.k(view, i)) != null) {
                i = fc.l.iv_events;
                if (((ImageView) a.a.k(view, i)) != null) {
                    i = fc.l.iv_highlights;
                    if (((ImageView) a.a.k(view, i)) != null) {
                        i = fc.l.iv_settings;
                        if (((ImageView) a.a.k(view, i)) != null) {
                            i = fc.l.iv_sports;
                            if (((ImageView) a.a.k(view, i)) != null) {
                                i = fc.l.nav_cats;
                                LinearLayout linearLayout = (LinearLayout) a.a.k(view, i);
                                if (linearLayout != null) {
                                    i = fc.l.nav_events;
                                    LinearLayout linearLayout2 = (LinearLayout) a.a.k(view, i);
                                    if (linearLayout2 != null) {
                                        i = fc.l.nav_highlights;
                                        LinearLayout linearLayout3 = (LinearLayout) a.a.k(view, i);
                                        if (linearLayout3 != null && (viewK = a.a.k(view, (i = fc.l.navIndicator))) != null) {
                                            i = fc.l.nav_settings;
                                            LinearLayout linearLayout4 = (LinearLayout) a.a.k(view, i);
                                            if (linearLayout4 != null) {
                                                i = fc.l.nav_sports;
                                                LinearLayout linearLayout5 = (LinearLayout) a.a.k(view, i);
                                                if (linearLayout5 != null) {
                                                    i = fc.l.tv_cats;
                                                    if (((TextView) a.a.k(view, i)) != null) {
                                                        i = fc.l.tv_events;
                                                        if (((TextView) a.a.k(view, i)) != null) {
                                                            i = fc.l.tv_highlights;
                                                            if (((TextView) a.a.k(view, i)) != null) {
                                                                i = fc.l.tv_settings;
                                                                if (((TextView) a.a.k(view, i)) != null) {
                                                                    i = fc.l.tv_sports;
                                                                    if (((TextView) a.a.k(view, i)) != null) {
                                                                        return new mb(linearLayout, linearLayout2, linearLayout3, viewK, linearLayout4, linearLayout5, 5);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static String f(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i = bufferedInputStream.read(bArr);
                if (i == -1) {
                    String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                    byteArrayOutputStream.close();
                    bufferedInputStream.close();
                    return string;
                }
                byteArrayOutputStream.write(bArr, 0, i);
                bufferedInputStream.close();
                throw th;
            }
        } finally {
        }
    }

    public static mb g(Context context, sa.v vVar, ya.c cVar, ed.g gVar, ua.e eVar, ya.c cVar2, k8.k2 k2Var, ab.f fVar, ob.d dVar, sa.i iVar, ta.c cVar3) {
        sa.r rVar = new sa.r(context, vVar, gVar, k2Var, fVar);
        ya.a aVar = new ya.a(cVar, fVar, iVar);
        wa.c cVar4 = za.a.f14840b;
        a7.v.b(context);
        return new mb(rVar, aVar, new za.a(new za.b(a7.v.a().c(new y6.a(za.a.f14841c, za.a.f14842d)).a("FIREBASE_CRASHLYTICS_REPORT", new x6.c("json"), za.a.f14843e), fVar.d(), dVar)), eVar, cVar2, vVar, cVar3);
    }

    public static ColorStateList h(Context context, int i) {
        int iC = o.a3.c(context, g.a.colorControlHighlight);
        return new ColorStateList(new int[][]{o.a3.f9117b, o.a3.f9119d, o.a3.f9118c, o.a3.f}, new int[]{o.a3.b(context, g.a.colorButtonNormal), l0.b.b(iC, i), l0.b.b(iC, i), i});
    }

    public static o2.d0 j(t1.n0 n0Var, y9.f0 f0Var, o2.d0 d0Var, t1.q0 q0Var) {
        int iB;
        c2.j0 j0Var = (c2.j0) n0Var;
        t1.s0 s0VarN = j0Var.N();
        j0Var.q0();
        if (j0Var.E0.f1840a.p()) {
            iB = 0;
        } else {
            c2.l1 l1Var = j0Var.E0;
            iB = l1Var.f1840a.b(l1Var.f1841b.f9404a);
        }
        Object objL = s0VarN.p() ? null : s0VarN.l(iB);
        int iB2 = (j0Var.V() || s0VarN.p()) ? -1 : s0VarN.f(iB, q0Var, false).b(w1.b0.M(j0Var.L()) - q0Var.f12090e);
        for (int i = 0; i < f0Var.size(); i++) {
            o2.d0 d0Var2 = (o2.d0) f0Var.get(i);
            if (n(d0Var2, objL, j0Var.V(), j0Var.I(), j0Var.J(), iB2)) {
                return d0Var2;
            }
        }
        if (f0Var.isEmpty() && d0Var != null && n(d0Var, objL, j0Var.V(), j0Var.I(), j0Var.J(), iB2)) {
            return d0Var;
        }
        return null;
    }

    public static LayerDrawable k(o.k2 k2Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableF = k2Var.f(context, g.e.abc_star_black_48dp);
        Drawable drawableF2 = k2Var.f(context, g.e.abc_star_half_black_48dp);
        if ((drawableF instanceof BitmapDrawable) && drawableF.getIntrinsicWidth() == dimensionPixelSize && drawableF.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableF;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableF.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableF2 instanceof BitmapDrawable) && drawableF2.getIntrinsicWidth() == dimensionPixelSize && drawableF2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableF2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableF2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableF2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    public static List l(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new va.f0(str, str2));
        }
        Collections.sort(arrayList, new c4.d(19));
        return Collections.unmodifiableList(arrayList);
    }

    public static boolean n(o2.d0 d0Var, Object obj, boolean z2, int i, int i10, int i11) {
        Object obj2 = d0Var.f9404a;
        int i12 = d0Var.f9405b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z2 && i12 == i && d0Var.f9406c == i10) {
            return true;
        }
        return !z2 && i12 == -1 && d0Var.f9408e == i11;
    }

    public static void t(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = o.s.f9291b;
        }
        drawableMutate.setColorFilter(o.s.c(i, mode));
    }

    public da.k A(int i) {
        da.f0 f0Var;
        AtomicLong atomicLong = (AtomicLong) this.f2889c;
        if (((int) (atomicLong.get() >>> 32)) > i) {
            da.p0 p0Var = da.p0.C;
            return p0Var != null ? p0Var : new da.p0();
        }
        cg cgVar = new cg(i);
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.f2890d;
            cg cgVar2 = (cg) atomicReference.get();
            if (cgVar2 != null && cgVar2.C > i) {
                da.p0 p0Var2 = da.p0.C;
                return p0Var2 != null ? p0Var2 : new da.p0();
            }
            while (!atomicReference.compareAndSet(cgVar2, cgVar)) {
                if (atomicReference.get() != cgVar2) {
                    break;
                }
            }
            if (((int) (atomicLong.get() >>> 32)) > i) {
                cgVar.cancel(true);
                while (!atomicReference.compareAndSet(cgVar, null) && atomicReference.get() == cgVar) {
                }
                return cgVar;
            }
            vd vdVar = (vd) this.f2888b;
            da.a0 a0Var = (da.a0) vdVar.f3164w;
            if (a0Var == null || (f0Var = (da.f0) vdVar.f3165x) == null) {
                cgVar.o((da.b1) this.f2892g);
                return cgVar;
            }
            f6 f6VarA = zg.a(a0Var);
            da.d1 d1Var = new da.d1();
            d1Var.D = new da.c1(d1Var, f6VarA);
            f0Var.execute(d1Var);
            cgVar.o(d1Var);
            return cgVar;
        }
    }

    public void c(b3.a aVar, o2.d0 d0Var, t1.s0 s0Var) {
        if (d0Var == null) {
            return;
        }
        if (s0Var.b(d0Var.f9404a) != -1) {
            aVar.r(d0Var, s0Var);
            return;
        }
        t1.s0 s0Var2 = (t1.s0) ((y9.e1) this.f2890d).get(d0Var);
        if (s0Var2 != null) {
            aVar.r(d0Var, s0Var2);
        }
    }

    public o8.o i(o8.o oVar) {
        return oVar.e(new l4.d(0), new ma.p(16, this));
    }

    public ColorStateList m(Context context, int i) {
        if (i == g.e.abc_edit_text_material) {
            return i0.d.c(context, g.c.abc_tint_edittext);
        }
        if (i == g.e.abc_switch_track_mtrl_alpha) {
            return i0.d.c(context, g.c.abc_tint_switch_track);
        }
        if (i != g.e.abc_switch_thumb_material) {
            if (i == g.e.abc_btn_default_mtrl_shape) {
                return h(context, o.a3.c(context, g.a.colorButtonNormal));
            }
            if (i == g.e.abc_btn_borderless_material) {
                return h(context, 0);
            }
            if (i == g.e.abc_btn_colored_material) {
                return h(context, o.a3.c(context, g.a.colorAccent));
            }
            if (i == g.e.abc_spinner_mtrl_am_alpha || i == g.e.abc_spinner_textfield_background_material) {
                return i0.d.c(context, g.c.abc_tint_spinner);
            }
            if (d((int[]) this.f2889c, i)) {
                return o.a3.d(context, g.a.colorControlNormal);
            }
            if (d((int[]) this.f, i)) {
                return i0.d.c(context, g.c.abc_tint_default);
            }
            if (d((int[]) this.f2892g, i)) {
                return i0.d.c(context, g.c.abc_tint_btn_checkable);
            }
            if (i == g.e.abc_seekbar_thumb_material) {
                return i0.d.c(context, g.c.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = o.a3.d(context, g.a.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = o.a3.f9117b;
            iArr2[0] = o.a3.b(context, g.a.colorSwitchThumbNormal);
            iArr[1] = o.a3.f9120e;
            iArr2[1] = o.a3.c(context, g.a.colorControlActivated);
            iArr[2] = o.a3.f;
            iArr2[2] = o.a3.c(context, g.a.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = o.a3.f9117b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = o.a3.f9120e;
            iArr2[1] = o.a3.c(context, g.a.colorControlActivated);
            iArr[2] = o.a3.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public vf.j o() throws IOException {
        pf.e eVar = pf.e.f10613a;
        Object obj = pf.e.f10613a;
        pf.d dVar = obj != null ? (pf.d) obj : null;
        Context contextB = dVar != null ? dVar.b() : null;
        AssetManager assets = contextB != null ? contextB.getAssets() : null;
        if (assets == null) {
            if (Build.FINGERPRINT == null) {
                throw new IOException("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            }
            throw new IOException("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        }
        InputStream inputStreamOpen = assets.open((String) this.f2892g);
        de.i.d(inputStreamOpen, "open(...)");
        return z7.b.M(inputStreamOpen);
    }

    public ad.c p() {
        ad.c cVar = new ad.c(false);
        cVar.f479w = (ef.s) this.f2888b;
        cVar.f480x = (String) this.f2889c;
        cVar.f482z = (ef.z) this.f2891e;
        cVar.A = (ff.a) this.f;
        cVar.f481y = ((ef.q) this.f2890d).c();
        return cVar;
    }

    public void q() {
        try {
            vf.n nVarH = z7.b.h(o());
            try {
                vf.f fVarQ = nVarH.q(nVarH.readInt());
                vf.f fVarQ2 = nVarH.q(nVarH.readInt());
                nVarH.close();
                synchronized (this) {
                    de.i.b(fVarQ);
                    this.f2890d = fVarQ;
                    de.i.b(fVarQ2);
                    this.f2891e = fVarQ2;
                }
            } finally {
            }
        } finally {
            ((CountDownLatch) this.f2889c).countDown();
        }
    }

    public o8.o r(String str, Executor executor) {
        sa.a aVar;
        o8.h hVar;
        ArrayList arrayListB = ((ya.a) this.f2889c).b();
        ArrayList arrayList = new ArrayList();
        int size = arrayListB.size();
        int i = 0;
        while (i < size) {
            int i10 = i + 1;
            File file = (File) arrayListB.get(i);
            try {
                wa.c cVar = ya.a.f14641g;
                String strE = ya.a.e(file);
                cVar.getClass();
                arrayList.add(new sa.a(wa.c.i(strE), file.getName(), file));
            } catch (IOException e7) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e7);
                file.delete();
            }
            i = i10;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj = arrayList.get(i11);
            i11++;
            sa.a aVar2 = (sa.a) obj;
            if (str == null || str.equals(aVar2.f11597b)) {
                za.a aVar3 = (za.a) this.f2890d;
                va.b0 b0Var = aVar2.f11596a;
                if (b0Var.f == null || b0Var.f13278g == null) {
                    sa.u uVarB = ((sa.v) this.f2892g).b(true);
                    va.b0 b0Var2 = aVar2.f11596a;
                    String str2 = uVarB.f11681a;
                    va.a0 a0VarA = b0Var2.a();
                    a0VarA.f13253e = str2;
                    va.b0 b0VarA = a0VarA.a();
                    String str3 = uVarB.f11682b;
                    va.a0 a0VarA2 = b0VarA.a();
                    a0VarA2.f = str3;
                    aVar = new sa.a(a0VarA2.a(), aVar2.f11597b, aVar2.f11598c);
                } else {
                    aVar = aVar2;
                }
                boolean z2 = str != null;
                za.b bVar = aVar3.f14844a;
                synchronized (bVar.f) {
                    try {
                        o8.h hVar2 = new o8.h();
                        if (z2) {
                            ((AtomicInteger) bVar.i.f10105w).getAndIncrement();
                            if (bVar.f.size() < bVar.f14849e) {
                                pa.d dVar = pa.d.f10448a;
                                dVar.b("Enqueueing report: " + aVar.f11597b);
                                dVar.b("Queue size: " + bVar.f.size());
                                hVar = hVar2;
                                bVar.f14850g.execute(new ag(bVar, aVar, hVar2, 15, false));
                                dVar.b("Closing task for report: " + aVar.f11597b);
                                hVar.c(aVar);
                            } else {
                                hVar = hVar2;
                                bVar.a();
                                String str4 = "Dropping report due to queue being full: " + aVar.f11597b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str4, null);
                                }
                                ((AtomicInteger) bVar.i.f10106x).getAndIncrement();
                                hVar.c(aVar);
                            }
                        } else {
                            hVar = hVar2;
                            bVar.b(aVar, hVar);
                        }
                    } finally {
                    }
                }
                arrayList2.add(hVar.f9963a.e(executor, new ma.p(11, this)));
            }
        }
        return b8.h.O(arrayList2);
    }

    public void s(String str, String str2, Bundle bundle) {
        int i;
        String strEncodeToString;
        int iA;
        PackageInfo packageInfoF;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        fa.g gVar = (fa.g) this.f2888b;
        gVar.a();
        bundle.putString("gmp_app_id", gVar.f5338c.f5350b);
        t0.d dVar = (t0.d) this.f2889c;
        synchronized (dVar) {
            try {
                if (dVar.f11813x == 0 && (packageInfoF = dVar.f("com.google.android.gms")) != null) {
                    dVar.f11813x = packageInfoF.versionCode;
                }
                i = dVar.f11813x;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((t0.d) this.f2889c).a());
        bundle.putString("app_ver_name", ((t0.d) this.f2889c).b());
        fa.g gVar2 = (fa.g) this.f2888b;
        gVar2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar2.f5337b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str3 = ((nb.a) b8.h.b(((nb.c) ((nb.d) this.f2892g)).e())).f9069a;
            if (TextUtils.isEmpty(str3)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str3);
            }
        } catch (InterruptedException e7) {
            e = e7;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e10) {
            e = e10;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) b8.h.b(((nb.c) ((nb.d) this.f2892g)).d()));
        bundle.putString("cliv", "fcm-25.0.2");
        kb.g gVar3 = (kb.g) ((mb.b) this.f).get();
        ub.b bVar = (ub.b) ((mb.b) this.f2891e).get();
        if (gVar3 == null || bVar == null || (iA = ((kb.d) gVar3).a()) == 1) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(y.e.c(iA)));
        bundle.putString("Firebase-Client", bVar.a());
    }

    public String toString() {
        switch (this.f2887a) {
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                ff.a aVar = (ff.a) this.f;
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Request{method=");
                sb2.append((String) this.f2889c);
                sb2.append(", url=");
                sb2.append((ef.s) this.f2888b);
                ef.q qVar = (ef.q) this.f2890d;
                if (qVar.size() != 0) {
                    sb2.append(", headers=[");
                    Iterator it = qVar.iterator();
                    int i = 0;
                    while (true) {
                        de.b bVar = (de.b) it;
                        if (bVar.hasNext()) {
                            Object next = bVar.next();
                            int i10 = i + 1;
                            if (i < 0) {
                                pd.k.B();
                                throw null;
                            }
                            od.f fVar = (od.f) next;
                            String str = (String) fVar.f10116v;
                            String str2 = (String) fVar.f10117w;
                            if (i > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(str);
                            sb2.append(':');
                            if (ff.d.j(str)) {
                                str2 = "██";
                            }
                            sb2.append(str2);
                            i = i10;
                        } else {
                            sb2.append(']');
                        }
                    }
                }
                if (!de.i.a(aVar, ff.a.f5393a)) {
                    sb2.append(", tags=");
                    sb2.append(aVar);
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public o8.o u(String str, String str2, Bundle bundle) {
        int i;
        try {
            s(str, str2, bundle);
            p7.b bVar = (p7.b) this.f2890d;
            p7.h hVar = p7.h.f10413x;
            d0.h hVar2 = bVar.f10401c;
            if (hVar2.g() < 12000000) {
                return hVar2.h() != 0 ? bVar.a(bundle).f(hVar, new p2.c(2, bVar, bundle)) : b8.h.n(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            p7.m mVarD = p7.m.d(bVar.f10400b);
            synchronized (mVarD) {
                i = mVarD.f10429v;
                mVarD.f10429v = i + 1;
            }
            return mVarD.e(new p7.l(i, 1, bundle, 1)).e(hVar, p7.d.f10406w);
        } catch (InterruptedException | ExecutionException e7) {
            return b8.h.n(e7);
        }
    }

    public void v(t1.s0 s0Var) {
        b3.a aVarA = y9.e1.a();
        if (((y9.f0) this.f2889c).isEmpty()) {
            c(aVarA, (o2.d0) this.f, s0Var);
            if (!Objects.equals((o2.d0) this.f2892g, (o2.d0) this.f)) {
                c(aVarA, (o2.d0) this.f2892g, s0Var);
            }
            if (!Objects.equals((o2.d0) this.f2891e, (o2.d0) this.f) && !Objects.equals((o2.d0) this.f2891e, (o2.d0) this.f2892g)) {
                c(aVarA, (o2.d0) this.f2891e, s0Var);
            }
        } else {
            for (int i = 0; i < ((y9.f0) this.f2889c).size(); i++) {
                c(aVarA, (o2.d0) ((y9.f0) this.f2889c).get(i), s0Var);
            }
            if (!((y9.f0) this.f2889c).contains((o2.d0) this.f2891e)) {
                c(aVarA, (o2.d0) this.f2891e, s0Var);
            }
        }
        this.f2890d = aVarA.b(true);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public da.k w() {
        AtomicLong atomicLong;
        long j8;
        final int i;
        ListenableFuture listenableFutureA;
        da.f0 f0Var = da.f0.f4407v;
        da.b1 b1Var = (da.b1) this.f2892g;
        if (b1Var.isDone()) {
            return b1Var;
        }
        do {
            atomicLong = (AtomicLong) this.f2889c;
            j8 = atomicLong.get();
            i = (int) (j8 >>> 32);
        } while (!atomicLong.compareAndSet(j8, (((long) (((int) j8) + 1)) & 4294967295L) | (((long) i) << 32)));
        AtomicReference atomicReference = (AtomicReference) this.f2891e;
        da.b1 b1Var2 = new da.b1();
        ListenableFuture listenableFuture = (ListenableFuture) atomicReference.getAndSet(b1Var2);
        if (listenableFuture == null) {
            f6 f6VarA = zg.a(new c6.i(i, 2, this));
            da.d1 d1Var = new da.d1();
            d1Var.D = new da.c1(d1Var, f6VarA);
            f0Var.execute(d1Var);
            listenableFutureA = d1Var;
        } else {
            listenableFutureA = da.o0.a(listenableFuture, Throwable.class, zg.b(new da.b0() { // from class: com.google.android.gms.internal.measurement.zf
                @Override // da.b0
                public final /* synthetic */ ListenableFuture apply(Object obj) {
                    return this.f3289a.A(i);
                }
            }), (da.a1) this.f);
        }
        b1Var2.o(listenableFutureA);
        bg bgVar = new bg(this, i);
        b1Var2.f(new ag(this, b1Var2, bgVar, 0), f0Var);
        return bgVar;
    }

    public void x(String str) {
        h.c(cf.f2544a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        h.c(!cf.f2546c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.f2890d = str;
    }

    public void y(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = cf.f2544a;
        this.f = str;
    }

    public Uri z() {
        String strN;
        String str = (String) this.f2889c;
        String str2 = (String) this.f2890d;
        Account account = ze.f3288a;
        Account account2 = (Account) this.f2891e;
        h.c(account2.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        h.c(account2.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        h.c(account2.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (ze.f3288a.equals(account2)) {
            strN = "shared";
        } else {
            String str3 = account2.type;
            String str4 = account2.name;
            strN = d0.d.n(new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length()), str3, ":", str4);
        }
        String str5 = (String) this.f;
        StringBuilder sb2 = new StringBuilder(strN.length() + str2.length() + str.length() + 2 + 1 + 1 + String.valueOf(str5).length());
        j4.a.s(sb2, "/", str, "/", str2);
        sb2.append("/");
        sb2.append(strN);
        sb2.append("/");
        sb2.append(str5);
        String string = sb2.toString();
        y9.z0 z0VarG = ((y9.b0) this.f2892g).g();
        Pattern pattern = lf.f2867a;
        return new Uri.Builder().scheme("android").authority((String) this.f2888b).path(string).encodedFragment(z0VarG.isEmpty() ? null : "transform=".concat(String.valueOf(new re.t("+").b(z0VarG)))).build();
    }

    public /* synthetic */ mb(Context context) {
        this.f2887a = 1;
        this.f2889c = "files";
        this.f2890d = "common";
        this.f2891e = cf.f2545b;
        this.f = "";
        this.f2892g = y9.f0.j();
        h.c(context != null, "Context cannot be null", new Object[0]);
        this.f2888b = context.getPackageName();
    }

    public mb(da.a0 a0Var) {
        this.f2887a = 2;
        long j8 = Integer.MIN_VALUE;
        this.f2889c = new AtomicLong((j8 & 4294967295L) | (j8 << 32));
        this.f2890d = new AtomicReference(null);
        this.f2891e = new AtomicReference(null);
        da.f0 f0Var = da.f0.f4407v;
        this.f = new da.a1(f0Var);
        da.b1 b1Var = new da.b1();
        this.f2892g = b1Var;
        vd vdVar = new vd();
        vdVar.f3164w = a0Var;
        vdVar.f3165x = f0Var;
        this.f2888b = vdVar;
        b1Var.f(vdVar, f0Var);
    }

    public mb(Set set, String str, String str2) {
        this.f2887a = 12;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f2888b = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f2890d = str;
        this.f2891e = str2;
        this.f = l8.a.f8312b;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f2889c = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw d0.d.g(it);
    }

    public mb(int i) {
        this.f2887a = i;
        switch (i) {
            case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                this.f2888b = new int[]{g.e.abc_textfield_search_default_mtrl_alpha, g.e.abc_textfield_default_mtrl_alpha, g.e.abc_ab_share_pack_mtrl_alpha};
                this.f2889c = new int[]{g.e.abc_ic_commit_search_api_mtrl_alpha, g.e.abc_seekbar_tick_mark_material, g.e.abc_ic_menu_share_mtrl_alpha, g.e.abc_ic_menu_copy_mtrl_am_alpha, g.e.abc_ic_menu_cut_mtrl_alpha, g.e.abc_ic_menu_selectall_mtrl_alpha, g.e.abc_ic_menu_paste_mtrl_am_alpha};
                this.f2890d = new int[]{g.e.abc_textfield_activated_mtrl_alpha, g.e.abc_textfield_search_activated_mtrl_alpha, g.e.abc_cab_background_top_mtrl_alpha, g.e.abc_text_cursor_material, g.e.abc_text_select_handle_left_mtrl, g.e.abc_text_select_handle_middle_mtrl, g.e.abc_text_select_handle_right_mtrl};
                this.f2891e = new int[]{g.e.abc_popup_background_mtrl_mult, g.e.abc_cab_background_internal_bg, g.e.abc_menu_hardkey_panel_mtrl_mult};
                this.f = new int[]{g.e.abc_tab_indicator_material, g.e.abc_textfield_search_material};
                this.f2892g = new int[]{g.e.abc_btn_check_material, g.e.abc_btn_radio_material, g.e.abc_btn_check_material_anim, g.e.abc_btn_radio_material_anim};
                break;
            case 11:
                this.f2887a = 11;
                this.f2888b = new AtomicBoolean(false);
                this.f2889c = new CountDownLatch(1);
                this.f2892g = "PublicSuffixDatabase.list";
                break;
        }
    }

    public mb(ad.c cVar) {
        this.f2887a = 4;
        ef.s sVar = (ef.s) cVar.f479w;
        if (sVar != null) {
            this.f2888b = sVar;
            this.f2889c = (String) cVar.f480x;
            this.f2890d = ((ef.p) cVar.f481y).b();
            this.f2891e = (ef.z) cVar.f482z;
            this.f = (ff.a) cVar.A;
            return;
        }
        throw new IllegalStateException("url == null");
    }

    public mb(sa.r rVar, ya.a aVar, za.a aVar2, ua.e eVar, ya.c cVar, sa.v vVar, ta.c cVar2) {
        this.f2887a = 9;
        this.f2888b = rVar;
        this.f2889c = aVar;
        this.f2890d = aVar2;
        this.f2891e = eVar;
        this.f = cVar;
        this.f2892g = vVar;
    }

    public mb(fa.g gVar, t0.d dVar, mb.b bVar, mb.b bVar2, nb.d dVar2) {
        this.f2887a = 10;
        gVar.a();
        p7.b bVar3 = new p7.b(gVar.f5336a);
        this.f2888b = gVar;
        this.f2889c = dVar;
        this.f2890d = bVar3;
        this.f2891e = bVar;
        this.f = bVar2;
        this.f2892g = dVar2;
    }

    public mb(t1.q0 q0Var) {
        this.f2887a = 3;
        this.f2888b = q0Var;
        y9.c0 c0Var = y9.f0.f14553w;
        this.f2889c = y9.z0.f14637z;
        this.f2890d = y9.e1.B;
    }
}

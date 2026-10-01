package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import b7.a;
import b7.b0;
import b7.c;
import b7.c0;
import b7.d;
import b7.d0;
import b7.e;
import b7.f0;
import b7.g;
import b7.g0;
import b7.h;
import b7.h0;
import b7.i;
import b7.i0;
import b7.j;
import b7.j0;
import b7.k;
import b7.k0;
import b7.l;
import b7.o;
import b7.s;
import b7.x;
import b7.z;
import com.airbnb.lottie.LottieAnimationView;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import i0.f;
import j7.b;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import p.y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class LottieAnimationView extends y {
    public static final e N = new Object();
    public final i A;
    public final i B;
    public b0 C;
    public int D;
    public final b7.y E;
    public String F;
    public int G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final HashSet K;
    public final HashSet L;
    public f0 M;

    /* JADX WARN: Type inference failed for: r2v8, types: [b7.j0, android.graphics.PorterDuffColorFilter] */
    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String string;
        boolean remove;
        this.A = new i(this, 1);
        this.B = new i(this, 0);
        this.D = 0;
        b7.y yVar = new b7.y();
        this.E = yVar;
        this.H = false;
        this.I = false;
        this.J = true;
        HashSet hashSet = new HashSet();
        this.K = hashSet;
        this.L = new HashSet();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h0.f1536a, R.attr.lottieAnimationViewStyle, 0);
        this.J = obtainStyledAttributes.getBoolean(4, true);
        boolean hasValue = obtainStyledAttributes.hasValue(16);
        boolean hasValue2 = obtainStyledAttributes.hasValue(11);
        boolean hasValue3 = obtainStyledAttributes.hasValue(21);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(16, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(11);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(21)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(10, 0));
        if (obtainStyledAttributes.getBoolean(3, false)) {
            this.I = true;
        }
        if (obtainStyledAttributes.getBoolean(14, false)) {
            yVar.f1614y.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(19)) {
            setRepeatMode(obtainStyledAttributes.getInt(19, 1));
        }
        if (obtainStyledAttributes.hasValue(18)) {
            setRepeatCount(obtainStyledAttributes.getInt(18, -1));
        }
        if (obtainStyledAttributes.hasValue(20)) {
            setSpeed(obtainStyledAttributes.getFloat(20, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(6)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(6, true));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setClipTextToBoundingBox(obtainStyledAttributes.getBoolean(5, false));
        }
        if (obtainStyledAttributes.hasValue(8)) {
            setDefaultFontFileExtension(obtainStyledAttributes.getString(8));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(13));
        boolean hasValue4 = obtainStyledAttributes.hasValue(15);
        float f3 = obtainStyledAttributes.getFloat(15, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (hasValue4) {
            hashSet.add(h.f1534y);
        }
        yVar.u(f3);
        boolean z10 = obtainStyledAttributes.getBoolean(9, false);
        HashSet hashSet2 = (HashSet) yVar.I.f162y;
        z zVar = z.f1616x;
        if (z10) {
            remove = hashSet2.add(zVar);
        } else {
            remove = hashSet2.remove(zVar);
        }
        if (yVar.f1613x != null && remove) {
            yVar.c();
        }
        setApplyingOpacityToLayersEnabled(obtainStyledAttributes.getBoolean(0, false));
        setApplyingShadowToLayersEnabled(obtainStyledAttributes.getBoolean(1, true));
        if (obtainStyledAttributes.hasValue(7)) {
            yVar.a(new g7.e("**"), c0.I, new j1.f0((j0) new PorterDuffColorFilter(f.d(getContext(), obtainStyledAttributes.getResourceId(7, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (obtainStyledAttributes.hasValue(17)) {
            int i6 = obtainStyledAttributes.getInt(17, 0);
            setRenderMode(i0.values()[i6 >= i0.values().length ? 0 : i6]);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int i10 = obtainStyledAttributes.getInt(2, 0);
            setAsyncUpdates(a.values()[i10 >= i0.values().length ? 0 : i10]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(12, false));
        if (obtainStyledAttributes.hasValue(22)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(22, false));
        }
        obtainStyledAttributes.recycle();
    }

    private void setCompositionTask(f0 f0Var) {
        d0 d0Var = f0Var.f1526d;
        b7.y yVar = this.E;
        if (d0Var != null && yVar == getDrawable() && yVar.f1613x == d0Var.f1517a) {
            return;
        }
        this.K.add(h.f1533x);
        this.E.d();
        a();
        f0Var.b(this.A);
        f0Var.a(this.B);
        this.M = f0Var;
    }

    public final void a() {
        f0 f0Var = this.M;
        if (f0Var != null) {
            i iVar = this.A;
            synchronized (f0Var) {
                f0Var.f1523a.remove(iVar);
            }
            this.M.e(this.B);
        }
    }

    public a getAsyncUpdates() {
        a aVar = this.E.f1607i0;
        if (aVar != null) {
            return aVar;
        }
        return a.f1481x;
    }

    public boolean getAsyncUpdatesEnabled() {
        a aVar = this.E.f1607i0;
        if (aVar == null) {
            aVar = a.f1481x;
        }
        if (aVar == a.f1482y) {
            return true;
        }
        return false;
    }

    public boolean getClipTextToBoundingBox() {
        return this.E.R;
    }

    public boolean getClipToCompositionBounds() {
        return this.E.K;
    }

    public j getComposition() {
        Drawable drawable = getDrawable();
        b7.y yVar = this.E;
        if (drawable == yVar) {
            return yVar.f1613x;
        }
        return null;
    }

    public long getDuration() {
        if (getComposition() != null) {
            return r0.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.E.f1614y.E;
    }

    public String getImageAssetsFolder() {
        return this.E.E;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.E.J;
    }

    public float getMaxFrame() {
        return this.E.f1614y.b();
    }

    public float getMinFrame() {
        return this.E.f1614y.c();
    }

    public g0 getPerformanceTracker() {
        j jVar = this.E.f1613x;
        if (jVar != null) {
            return jVar.f1542a;
        }
        return null;
    }

    public float getProgress() {
        return this.E.f1614y.a();
    }

    public i0 getRenderMode() {
        if (this.E.T) {
            return i0.f1541z;
        }
        return i0.f1540y;
    }

    public int getRepeatCount() {
        return this.E.f1614y.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.E.f1614y.getRepeatMode();
    }

    public float getSpeed() {
        return this.E.f1614y.A;
    }

    @Override // android.view.View
    public final void invalidate() {
        i0 i0Var;
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof b7.y) {
            boolean z10 = ((b7.y) drawable).T;
            i0 i0Var2 = i0.f1541z;
            if (z10) {
                i0Var = i0Var2;
            } else {
                i0Var = i0.f1540y;
            }
            if (i0Var == i0Var2) {
                this.E.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        b7.y yVar = this.E;
        if (drawable2 == yVar) {
            super.invalidateDrawable(yVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.I) {
            this.E.l();
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i6;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        this.F = gVar.f1527x;
        HashSet hashSet = this.K;
        h hVar = h.f1533x;
        if (!hashSet.contains(hVar) && !TextUtils.isEmpty(this.F)) {
            setAnimation(this.F);
        }
        this.G = gVar.f1528y;
        if (!hashSet.contains(hVar) && (i6 = this.G) != 0) {
            setAnimation(i6);
        }
        boolean contains = hashSet.contains(h.f1534y);
        b7.y yVar = this.E;
        if (!contains) {
            yVar.u(gVar.f1529z);
        }
        h hVar2 = h.C;
        if (!hashSet.contains(hVar2) && gVar.A) {
            hashSet.add(hVar2);
            yVar.l();
        }
        if (!hashSet.contains(h.B)) {
            setImageAssetsFolder(gVar.B);
        }
        if (!hashSet.contains(h.f1535z)) {
            setRepeatMode(gVar.C);
        }
        if (!hashSet.contains(h.A)) {
            setRepeatCount(gVar.D);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, b7.g, android.os.Parcelable] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f1527x = this.F;
        baseSavedState.f1528y = this.G;
        b7.y yVar = this.E;
        n7.e eVar = yVar.f1614y;
        n7.e eVar2 = yVar.f1614y;
        baseSavedState.f1529z = eVar.a();
        if (yVar.isVisible()) {
            z10 = eVar2.J;
        } else {
            int i6 = yVar.o0;
            if (i6 != 2 && i6 != 3) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        baseSavedState.A = z10;
        baseSavedState.B = yVar.E;
        baseSavedState.C = eVar2.getRepeatMode();
        baseSavedState.D = eVar2.getRepeatCount();
        return baseSavedState;
    }

    public void setAnimation(final int i6) {
        f0 a10;
        this.G = i6;
        final String str = null;
        this.F = null;
        if (isInEditMode()) {
            a10 = new f0(new Callable() { // from class: b7.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                    boolean z10 = lottieAnimationView.J;
                    int i10 = i6;
                    if (z10) {
                        Context context = lottieAnimationView.getContext();
                        return o.f(i10, context, o.k(context, i10));
                    }
                    return o.f(i10, lottieAnimationView.getContext(), null);
                }
            }, true);
        } else if (this.J) {
            Context context = getContext();
            final String k8 = o.k(context, i6);
            final WeakReference weakReference = new WeakReference(context);
            final Context applicationContext = context.getApplicationContext();
            a10 = o.a(k8, new Callable() { // from class: b7.n
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context2 = (Context) weakReference.get();
                    if (context2 == null) {
                        context2 = applicationContext;
                    }
                    return o.f(i6, context2, k8);
                }
            }, null);
        } else {
            Context context2 = getContext();
            HashMap hashMap = o.f1570a;
            final WeakReference weakReference2 = new WeakReference(context2);
            final Context applicationContext2 = context2.getApplicationContext();
            a10 = o.a(null, new Callable() { // from class: b7.n
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context22 = (Context) weakReference2.get();
                    if (context22 == null) {
                        context22 = applicationContext2;
                    }
                    return o.f(i6, context22, str);
                }
            }, null);
        }
        setCompositionTask(a10);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        setCompositionTask(o.a(null, new l(byteArrayInputStream, 0), new a2.a(byteArrayInputStream, 7)));
    }

    public void setAnimationFromUrl(String str) {
        f0 a10;
        int i6 = 0;
        Object obj = null;
        if (this.J) {
            Context context = getContext();
            HashMap hashMap = o.f1570a;
            String k8 = r4.a.k("url_", str);
            a10 = o.a(k8, new k(context, str, k8, i6), null);
        } else {
            a10 = o.a(null, new k(getContext(), str, obj, i6), null);
        }
        setCompositionTask(a10);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.E.P = z10;
    }

    public void setApplyingShadowToLayersEnabled(boolean z10) {
        this.E.Q = z10;
    }

    public void setAsyncUpdates(a aVar) {
        this.E.f1607i0 = aVar;
    }

    public void setCacheComposition(boolean z10) {
        this.J = z10;
    }

    public void setClipTextToBoundingBox(boolean z10) {
        b7.y yVar = this.E;
        if (z10 != yVar.R) {
            yVar.R = z10;
            yVar.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z10) {
        b7.y yVar = this.E;
        if (z10 != yVar.K) {
            yVar.K = z10;
            b bVar = yVar.L;
            if (bVar != null) {
                bVar.L = z10;
            }
            yVar.invalidateSelf();
        }
    }

    public void setComposition(j jVar) {
        boolean z10;
        b7.y yVar = this.E;
        yVar.setCallback(this);
        boolean z11 = true;
        this.H = true;
        ArrayList arrayList = yVar.C;
        n7.e eVar = yVar.f1614y;
        boolean z12 = false;
        if (yVar.f1613x == jVar) {
            z11 = false;
        } else {
            yVar.f1606h0 = true;
            yVar.d();
            yVar.f1613x = jVar;
            yVar.c();
            if (eVar.I == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            eVar.I = jVar;
            if (z10) {
                eVar.i(Math.max(eVar.G, jVar.f1552l), Math.min(eVar.H, jVar.f1553m));
            } else {
                eVar.i((int) jVar.f1552l, (int) jVar.f1553m);
            }
            float f3 = eVar.E;
            eVar.E = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            eVar.D = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            eVar.h((int) f3);
            eVar.f();
            yVar.u(eVar.getAnimatedFraction());
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                x xVar = (x) it.next();
                if (xVar != null) {
                    xVar.run();
                }
                it.remove();
            }
            arrayList.clear();
            jVar.f1542a.f1530a = yVar.N;
            yVar.e();
            Drawable.Callback callback = yVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(yVar);
            }
        }
        if (this.I) {
            yVar.l();
        }
        this.H = false;
        if (getDrawable() != yVar || z11) {
            if (!z11) {
                if (eVar != null) {
                    z12 = eVar.J;
                }
                setImageDrawable(null);
                setImageDrawable(yVar);
                if (z12) {
                    yVar.n();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it2 = this.L.iterator();
            if (!it2.hasNext()) {
            } else {
                throw r4.a.i(it2);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        b7.y yVar = this.E;
        yVar.H = str;
        b4.h i6 = yVar.i();
        if (i6 != null) {
            i6.B = str;
        }
    }

    public void setFailureListener(b0 b0Var) {
        this.C = b0Var;
    }

    public void setFallbackResource(int i6) {
        this.D = i6;
    }

    public void setFontAssetDelegate(b7.b bVar) {
        b4.h hVar = this.E.F;
    }

    public void setFontMap(Map<String, Typeface> map) {
        b7.y yVar = this.E;
        if (map == yVar.G) {
            return;
        }
        yVar.G = map;
        yVar.invalidateSelf();
    }

    public void setFrame(int i6) {
        this.E.o(i6);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.E.A = z10;
    }

    public void setImageAssetDelegate(c cVar) {
        f7.a aVar = this.E.D;
    }

    public void setImageAssetsFolder(String str) {
        this.E.E = str;
    }

    @Override // p.y, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.G = 0;
        this.F = null;
        a();
        super.setImageBitmap(bitmap);
    }

    @Override // p.y, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.G = 0;
        this.F = null;
        a();
        super.setImageDrawable(drawable);
    }

    @Override // p.y, android.widget.ImageView
    public void setImageResource(int i6) {
        this.G = 0;
        this.F = null;
        a();
        super.setImageResource(i6);
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.E.J = z10;
    }

    public void setMaxFrame(int i6) {
        this.E.p(i6);
    }

    public void setMaxProgress(float f3) {
        b7.y yVar = this.E;
        j jVar = yVar.f1613x;
        if (jVar == null) {
            yVar.C.add(new s(yVar, f3, 0));
            return;
        }
        n7.e eVar = yVar.f1614y;
        eVar.i(eVar.G, n7.g.f(jVar.f1552l, jVar.f1553m, f3));
    }

    public void setMinAndMaxFrame(String str) {
        this.E.r(str);
    }

    public void setMinFrame(int i6) {
        this.E.s(i6);
    }

    public void setMinProgress(float f3) {
        b7.y yVar = this.E;
        j jVar = yVar.f1613x;
        if (jVar == null) {
            yVar.C.add(new s(yVar, f3, 1));
        } else {
            yVar.s((int) n7.g.f(jVar.f1552l, jVar.f1553m, f3));
        }
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        b7.y yVar = this.E;
        if (yVar.O != z10) {
            yVar.O = z10;
            b bVar = yVar.L;
            if (bVar != null) {
                bVar.q(z10);
            }
        }
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        b7.y yVar = this.E;
        yVar.N = z10;
        j jVar = yVar.f1613x;
        if (jVar != null) {
            jVar.f1542a.f1530a = z10;
        }
    }

    public void setProgress(float f3) {
        this.K.add(h.f1534y);
        this.E.u(f3);
    }

    public void setRenderMode(i0 i0Var) {
        b7.y yVar = this.E;
        yVar.S = i0Var;
        yVar.e();
    }

    public void setRepeatCount(int i6) {
        this.K.add(h.A);
        this.E.f1614y.setRepeatCount(i6);
    }

    public void setRepeatMode(int i6) {
        this.K.add(h.f1535z);
        this.E.f1614y.setRepeatMode(i6);
    }

    public void setSafeMode(boolean z10) {
        this.E.B = z10;
    }

    public void setSpeed(float f3) {
        this.E.f1614y.A = f3;
    }

    public void setTextDelegate(k0 k0Var) {
        this.E.getClass();
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.E.f1614y.K = z10;
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        b7.y yVar;
        boolean z10;
        boolean z11 = this.H;
        boolean z12 = false;
        if (!z11 && drawable == (yVar = this.E)) {
            n7.e eVar = yVar.f1614y;
            if (eVar == null) {
                z10 = false;
            } else {
                z10 = eVar.J;
            }
            if (z10) {
                this.I = false;
                yVar.k();
                super.unscheduleDrawable(drawable);
            }
        }
        if (!z11 && (drawable instanceof b7.y)) {
            b7.y yVar2 = (b7.y) drawable;
            n7.e eVar2 = yVar2.f1614y;
            if (eVar2 != null) {
                z12 = eVar2.J;
            }
            if (z12) {
                yVar2.k();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.E.q(str);
    }

    public void setMinFrame(String str) {
        this.E.t(str);
    }

    public void setAnimation(String str) {
        f0 a10;
        this.F = str;
        int i6 = 0;
        this.G = 0;
        int i10 = 1;
        if (isInEditMode()) {
            a10 = new f0(new d(i6, this, str), true);
        } else {
            Object obj = null;
            if (this.J) {
                Context context = getContext();
                HashMap hashMap = o.f1570a;
                String k8 = r4.a.k("asset_", str);
                a10 = o.a(k8, new k(context.getApplicationContext(), str, k8, i10), null);
            } else {
                Context context2 = getContext();
                HashMap hashMap2 = o.f1570a;
                a10 = o.a(null, new k(context2.getApplicationContext(), str, obj, i10), null);
            }
        }
        setCompositionTask(a10);
    }
}

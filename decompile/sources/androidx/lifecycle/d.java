package androidx.lifecycle;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import com.playfy.tv.R;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import okhttp3.HttpUrl;
import p.b3;
import p.n2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public Object f896a;

    /* renamed from: b, reason: collision with root package name */
    public Object f897b;

    /* renamed from: c, reason: collision with root package name */
    public Object f898c;

    /* renamed from: d, reason: collision with root package name */
    public Object f899d;

    /* renamed from: e, reason: collision with root package name */
    public Object f900e;

    /* renamed from: f, reason: collision with root package name */
    public Object f901f;

    public d(j2.q qVar, MediaFormat mediaFormat, r1.q qVar2, Surface surface, MediaCrypto mediaCrypto, j1 j1Var) {
        this.f896a = qVar;
        this.f897b = mediaFormat;
        this.f898c = qVar2;
        this.f899d = surface;
        this.f900e = mediaCrypto;
        this.f901f = j1Var;
    }

    public static boolean c(int[] iArr, int i6) {
        for (int i10 : iArr) {
            if (i10 == i6) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList e(Context context, int i6) {
        int c10 = b3.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{b3.f10216b, b3.f10218d, b3.f10217c, b3.f10220f}, new int[]{b3.b(context, R.attr.colorButtonNormal), l0.b.b(c10, i6), l0.b.b(c10, i6), i6});
    }

    public static q2.c0 g(r1.u0 u0Var, db.k0 k0Var, q2.c0 c0Var, r1.a1 a1Var) {
        Object l10;
        int i6;
        r1.d1 y02 = u0Var.y0();
        int w10 = u0Var.w();
        if (y02.p()) {
            l10 = null;
        } else {
            l10 = y02.l(w10);
        }
        if (!u0Var.h() && !y02.p()) {
            i6 = y02.f(w10, a1Var, false).b(u1.a0.Q(u0Var.getCurrentPosition()) - a1Var.f11299e);
        } else {
            i6 = -1;
        }
        for (int i10 = 0; i10 < k0Var.size(); i10++) {
            q2.c0 c0Var2 = (q2.c0) k0Var.get(i10);
            if (j(c0Var2, l10, u0Var.h(), u0Var.k0(), u0Var.I(), i6)) {
                return c0Var2;
            }
        }
        if (!k0Var.isEmpty() || c0Var == null || !j(c0Var, l10, u0Var.h(), u0Var.k0(), u0Var.I(), i6)) {
            return null;
        }
        return c0Var;
    }

    public static LayerDrawable h(n2 n2Var, Context context, int i6) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i6);
        Drawable f3 = n2Var.f(context, R.drawable.abc_star_black_48dp);
        Drawable f10 = n2Var.f(context, R.drawable.abc_star_half_black_48dp);
        if ((f3 instanceof BitmapDrawable) && f3.getIntrinsicWidth() == dimensionPixelSize && f3.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) f3;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            f3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f3.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((f10 instanceof BitmapDrawable) && f10.getIntrinsicWidth() == dimensionPixelSize && f10.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) f10;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            f10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f10.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static boolean j(q2.c0 c0Var, Object obj, boolean z10, int i6, int i10, int i11) {
        Object obj2 = c0Var.f10834a;
        int i12 = c0Var.f10835b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (!z10 || i12 != i6 || c0Var.f10836c != i10) {
            if (z10 || i12 != -1 || c0Var.f10838e != i11) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void l(Drawable drawable, int i6, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = p.t.f10384b;
        }
        mutate.setColorFilter(p.t.c(i6, mode));
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.f901f;
        if (hashMap != null) {
            hashMap.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public void b(b2.k kVar, q2.c0 c0Var, r1.d1 d1Var) {
        if (c0Var != null) {
            if (d1Var.b(c0Var.f10834a) != -1) {
                kVar.u(c0Var, d1Var);
                return;
            }
            r1.d1 d1Var2 = (r1.d1) ((db.n0) this.f898c).get(c0Var);
            if (d1Var2 != null) {
                kVar.u(c0Var, d1Var2);
            }
        }
    }

    public g8.h d() {
        String str;
        if (((String) this.f896a) == null) {
            str = " transportName";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (((g8.m) this.f898c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f899d) == null) {
            str = w8.k.c(str, " eventMillis");
        }
        if (((Long) this.f900e) == null) {
            str = w8.k.c(str, " uptimeMillis");
        }
        if (((HashMap) this.f901f) == null) {
            str = w8.k.c(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new g8.h((String) this.f896a, (Integer) this.f897b, (g8.m) this.f898c, ((Long) this.f899d).longValue(), ((Long) this.f900e).longValue(), (HashMap) this.f901f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public s9.n f(s9.n nVar) {
        return nVar.j(new q.a(1), new i4.u0(this, 14));
    }

    public ColorStateList i(Context context, int i6) {
        if (i6 == R.drawable.abc_edit_text_material) {
            return i0.f.d(context, R.color.abc_tint_edittext);
        }
        if (i6 == R.drawable.abc_switch_track_mtrl_alpha) {
            return i0.f.d(context, R.color.abc_tint_switch_track);
        }
        if (i6 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList d10 = b3.d(context, R.attr.colorSwitchThumbNormal);
            if (d10 != null && d10.isStateful()) {
                int[] iArr3 = b3.f10216b;
                iArr[0] = iArr3;
                iArr2[0] = d10.getColorForState(iArr3, 0);
                iArr[1] = b3.f10219e;
                iArr2[1] = b3.c(context, R.attr.colorControlActivated);
                iArr[2] = b3.f10220f;
                iArr2[2] = d10.getDefaultColor();
            } else {
                iArr[0] = b3.f10216b;
                iArr2[0] = b3.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = b3.f10219e;
                iArr2[1] = b3.c(context, R.attr.colorControlActivated);
                iArr[2] = b3.f10220f;
                iArr2[2] = b3.c(context, R.attr.colorSwitchThumbNormal);
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i6 == R.drawable.abc_btn_default_mtrl_shape) {
            return e(context, b3.c(context, R.attr.colorButtonNormal));
        }
        if (i6 == R.drawable.abc_btn_borderless_material) {
            return e(context, 0);
        }
        if (i6 == R.drawable.abc_btn_colored_material) {
            return e(context, b3.c(context, R.attr.colorAccent));
        }
        if (i6 != R.drawable.abc_spinner_mtrl_am_alpha && i6 != R.drawable.abc_spinner_textfield_background_material) {
            if (c((int[]) this.f897b, i6)) {
                return b3.d(context, R.attr.colorControlNormal);
            }
            if (c((int[]) this.f900e, i6)) {
                return i0.f.d(context, R.color.abc_tint_default);
            }
            if (c((int[]) this.f901f, i6)) {
                return i0.f.d(context, R.color.abc_tint_btn_checkable);
            }
            if (i6 == R.drawable.abc_seekbar_thumb_material) {
                return i0.f.d(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        return i0.f.d(context, R.color.abc_tint_spinner);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.d.k(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public s9.n m(String str, String str2, Bundle bundle) {
        int i6;
        try {
            k(str, str2, bundle);
            s8.b bVar = (s8.b) this.f898c;
            s8.h hVar = s8.h.f12241z;
            d0.g gVar = bVar.f12229c;
            if (gVar.e() < 12000000) {
                if (gVar.f() != 0) {
                    return bVar.a(bundle).d(hVar, new s8.l(1, bVar, bundle));
                }
                return dg.b.i(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            s8.n j = s8.n.j(bVar.f12228b);
            synchronized (j) {
                i6 = j.f12259a;
                j.f12259a = i6 + 1;
            }
            return j.k(new s8.m(i6, 1, bundle, 1)).j(hVar, s8.d.f12235y);
        } catch (InterruptedException | ExecutionException e10) {
            return dg.b.i(e10);
        }
    }

    public void n(r1.d1 d1Var) {
        b2.k kVar = new b2.k(4);
        if (((db.k0) this.f897b).isEmpty()) {
            b(kVar, (q2.c0) this.f900e, d1Var);
            if (!Objects.equals((q2.c0) this.f901f, (q2.c0) this.f900e)) {
                b(kVar, (q2.c0) this.f901f, d1Var);
            }
            if (!Objects.equals((q2.c0) this.f899d, (q2.c0) this.f900e) && !Objects.equals((q2.c0) this.f899d, (q2.c0) this.f901f)) {
                b(kVar, (q2.c0) this.f899d, d1Var);
            }
        } else {
            for (int i6 = 0; i6 < ((db.k0) this.f897b).size(); i6++) {
                b(kVar, (q2.c0) ((db.k0) this.f897b).get(i6), d1Var);
            }
            if (!((db.k0) this.f897b).contains((q2.c0) this.f899d)) {
                b(kVar, (q2.c0) this.f899d, d1Var);
            }
        }
        this.f898c = kVar.c();
    }
}

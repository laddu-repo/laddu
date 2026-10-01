package w9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import ma.k;
import ma.l;
import ma.n;
import okhttp3.HttpUrl;
import ra.d;
import ua.i;
import ua.m;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends Drawable implements k {
    public final Rect A;
    public final c B;
    public float C;
    public float D;
    public final int E;
    public float F;
    public float G;
    public float H;
    public WeakReference I;
    public WeakReference J;

    /* renamed from: x, reason: collision with root package name */
    public final WeakReference f14236x;

    /* renamed from: y, reason: collision with root package name */
    public final i f14237y;

    /* renamed from: z, reason: collision with root package name */
    public final l f14238z;

    public a(Context context) {
        int intValue;
        int intValue2;
        FrameLayout frameLayout;
        d dVar;
        WeakReference weakReference = new WeakReference(context);
        this.f14236x = weakReference;
        n.c(context, n.f8793b, "Theme.MaterialComponents");
        this.A = new Rect();
        l lVar = new l(this);
        this.f14238z = lVar;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = lVar.f8785a;
        textPaint.setTextAlign(align);
        c cVar = new c(context);
        this.B = cVar;
        boolean f3 = f();
        b bVar = cVar.f14245b;
        if (f3) {
            intValue = bVar.D.intValue();
        } else {
            intValue = bVar.B.intValue();
        }
        if (f()) {
            intValue2 = bVar.E.intValue();
        } else {
            intValue2 = bVar.C.intValue();
        }
        i iVar = new i(m.a(context, intValue, intValue2).a());
        this.f14237y = iVar;
        h();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && lVar.f8791g != (dVar = new d(context2, bVar.A.intValue()))) {
            lVar.b(dVar, context2);
            textPaint.setColor(bVar.f14243z.intValue());
            invalidateSelf();
            j();
            invalidateSelf();
        }
        int i6 = bVar.I;
        if (i6 != -2) {
            this.E = ((int) Math.pow(10.0d, i6 - 1.0d)) - 1;
        } else {
            this.E = bVar.J;
        }
        lVar.f8789e = true;
        j();
        invalidateSelf();
        lVar.f8789e = true;
        h();
        j();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(bVar.f14242y.intValue());
        if (iVar.f13000y.f12981d != valueOf) {
            iVar.q(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(bVar.f14243z.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.I;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.I.get();
            WeakReference weakReference3 = this.J;
            if (weakReference3 != null) {
                frameLayout = (FrameLayout) weakReference3.get();
            } else {
                frameLayout = null;
            }
            i(view, frameLayout);
        }
        j();
        setVisible(bVar.Q.booleanValue(), false);
    }

    @Override // ma.k
    public final void a() {
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.ViewParent] */
    public final void b(View view, View view2) {
        float f3;
        float f10;
        View view3;
        boolean z10;
        FrameLayout d10 = d();
        if (d10 == null) {
            float y9 = view.getY();
            f10 = view.getX();
            view3 = view.getParent();
            f3 = y9;
        } else {
            f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            view3 = d10;
        }
        while (true) {
            z10 = view3 instanceof View;
            if (!z10 || view3 == view2) {
                break;
            }
            ViewParent parent = view3.getParent();
            if (!(parent instanceof ViewGroup) || ((ViewGroup) parent).getClipChildren()) {
                break;
            }
            View view4 = view3;
            f3 += view4.getY();
            f10 += view4.getX();
            view3 = view3.getParent();
        }
        if (z10) {
            float f11 = (this.D - this.H) + f3;
            float f12 = (this.C - this.G) + f10;
            View view5 = view3;
            float height = ((this.D + this.H) - view5.getHeight()) + f3;
            float width = ((this.C + this.G) - view5.getWidth()) + f10;
            if (f11 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.D = Math.abs(f11) + this.D;
            }
            if (f12 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.C = Math.abs(f12) + this.C;
            }
            if (height > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.D -= Math.abs(height);
            }
            if (width > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.C -= Math.abs(width);
            }
        }
    }

    public final String c() {
        c cVar = this.B;
        b bVar = cVar.f14245b;
        b bVar2 = cVar.f14245b;
        String str = bVar.G;
        WeakReference weakReference = this.f14236x;
        if (str != null) {
            int i6 = bVar.I;
            if (i6 != -2 && str != null && str.length() > i6) {
                Context context = (Context) weakReference.get();
                if (context != null) {
                    return String.format(context.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i6 - 1), "…");
                }
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            return str;
        }
        if (g()) {
            int i10 = this.E;
            if (i10 != -2 && e() > i10) {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                return String.format(bVar2.K, context2.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(i10), "+");
            }
            return NumberFormat.getInstance(bVar2.K).format(e());
        }
        return null;
    }

    public final FrameLayout d() {
        WeakReference weakReference = this.J;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String c10;
        int round;
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f14237y.draw(canvas);
            if (f() && (c10 = c()) != null) {
                Rect rect = new Rect();
                l lVar = this.f14238z;
                lVar.f8785a.getTextBounds(c10, 0, c10.length(), rect);
                float exactCenterY = this.D - rect.exactCenterY();
                float f3 = this.C;
                if (rect.bottom <= 0) {
                    round = (int) exactCenterY;
                } else {
                    round = Math.round(exactCenterY);
                }
                canvas.drawText(c10, f3, round, lVar.f8785a);
            }
        }
    }

    public final int e() {
        int i6 = this.B.f14245b.H;
        if (i6 != -1) {
            return i6;
        }
        return 0;
    }

    public final boolean f() {
        if (this.B.f14245b.G != null || g()) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        b bVar = this.B.f14245b;
        if (bVar.G == null && bVar.H != -1) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.B.f14245b.F;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        int intValue;
        int intValue2;
        Context context = (Context) this.f14236x.get();
        if (context == null) {
            return;
        }
        boolean f3 = f();
        c cVar = this.B;
        if (f3) {
            intValue = cVar.f14245b.D.intValue();
        } else {
            intValue = cVar.f14245b.B.intValue();
        }
        if (f()) {
            intValue2 = cVar.f14245b.E.intValue();
        } else {
            intValue2 = cVar.f14245b.C.intValue();
        }
        this.f14237y.setShapeAppearanceModel(m.a(context, intValue, intValue2).a());
        invalidateSelf();
    }

    public final void i(View view, FrameLayout frameLayout) {
        this.I = new WeakReference(view);
        this.J = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.a.j():void");
    }

    @Override // android.graphics.drawable.Drawable, ma.k
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        c cVar = this.B;
        cVar.f14244a.F = i6;
        cVar.f14245b.F = i6;
        this.f14238z.f8785a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

package aa;

import a2.e0;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;
import com.playfy.tv.R;
import ua.i;
import ua.m;
import ua.v;
import ua.y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f651a;

    /* renamed from: b, reason: collision with root package name */
    public m f652b;

    /* renamed from: c, reason: collision with root package name */
    public y f653c;

    /* renamed from: d, reason: collision with root package name */
    public d1.f f654d;

    /* renamed from: e, reason: collision with root package name */
    public e0 f655e;

    /* renamed from: f, reason: collision with root package name */
    public int f656f;

    /* renamed from: g, reason: collision with root package name */
    public int f657g;

    /* renamed from: h, reason: collision with root package name */
    public int f658h;

    /* renamed from: i, reason: collision with root package name */
    public int f659i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f660k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f661l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f662m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f663n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f664o;

    /* renamed from: p, reason: collision with root package name */
    public i f665p;

    /* renamed from: t, reason: collision with root package name */
    public boolean f668t;

    /* renamed from: v, reason: collision with root package name */
    public RippleDrawable f670v;

    /* renamed from: w, reason: collision with root package name */
    public int f671w;

    /* renamed from: q, reason: collision with root package name */
    public boolean f666q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f667r = false;
    public boolean s = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f669u = true;

    public g(MaterialButton materialButton, m mVar) {
        this.f651a = materialButton;
        this.f652b = mVar;
    }

    public final i a(boolean z10) {
        RippleDrawable rippleDrawable = this.f670v;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 0) {
            return (i) ((LayerDrawable) ((InsetDrawable) this.f670v.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
        }
        return null;
    }

    public final void b(int i6, int i10) {
        MaterialButton materialButton = this.f651a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i11 = this.f658h;
        int i12 = this.f659i;
        this.f659i = i10;
        this.f658h = i6;
        if (!this.f667r) {
            c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i6) - i11, paddingEnd, (paddingBottom + i10) - i12);
    }

    public final void c() {
        int i6;
        i iVar = new i(this.f652b);
        y yVar = this.f653c;
        if (yVar != null) {
            iVar.t(yVar);
        }
        d1.f fVar = this.f654d;
        if (fVar != null) {
            iVar.o(fVar);
        }
        e0 e0Var = this.f655e;
        if (e0Var != null) {
            iVar.f12998b0 = e0Var;
        }
        MaterialButton materialButton = this.f651a;
        iVar.m(materialButton.getContext());
        iVar.setTintList(this.f662m);
        PorterDuff.Mode mode = this.f661l;
        if (mode != null) {
            iVar.setTintMode(mode);
        }
        float f3 = this.f660k;
        ColorStateList colorStateList = this.f663n;
        iVar.f13000y.f12987k = f3;
        iVar.invalidateSelf();
        ua.g gVar = iVar.f13000y;
        if (gVar.f12982e != colorStateList) {
            gVar.f12982e = colorStateList;
            iVar.onStateChange(iVar.getState());
        }
        i iVar2 = new i(this.f652b);
        y yVar2 = this.f653c;
        if (yVar2 != null) {
            iVar2.t(yVar2);
        }
        d1.f fVar2 = this.f654d;
        if (fVar2 != null) {
            iVar2.o(fVar2);
        }
        iVar2.setTint(0);
        float f10 = this.f660k;
        if (this.f666q) {
            i6 = jb.b.o(materialButton, R.attr.colorSurface);
        } else {
            i6 = 0;
        }
        iVar2.f13000y.f12987k = f10;
        iVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i6);
        ua.g gVar2 = iVar2.f13000y;
        if (gVar2.f12982e != valueOf) {
            gVar2.f12982e = valueOf;
            iVar2.onStateChange(iVar2.getState());
        }
        i iVar3 = new i(this.f652b);
        this.f665p = iVar3;
        y yVar3 = this.f653c;
        if (yVar3 != null) {
            iVar3.t(yVar3);
        }
        d1.f fVar3 = this.f654d;
        if (fVar3 != null) {
            this.f665p.o(fVar3);
        }
        this.f665p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(sa.b.b(this.f664o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{iVar2, iVar}), this.f656f, this.f658h, this.f657g, this.f659i), this.f665p);
        this.f670v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        i a10 = a(false);
        if (a10 != null) {
            a10.p(this.f671w);
            a10.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        v vVar;
        if (Build.VERSION.SDK_INT < 23 && !this.f667r) {
            MaterialButton materialButton = this.f651a;
            int paddingStart = materialButton.getPaddingStart();
            int paddingTop = materialButton.getPaddingTop();
            int paddingEnd = materialButton.getPaddingEnd();
            int paddingBottom = materialButton.getPaddingBottom();
            c();
            materialButton.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
            return;
        }
        i a10 = a(false);
        if (a10 != null) {
            y yVar = this.f653c;
            if (yVar != null) {
                a10.t(yVar);
            } else {
                a10.setShapeAppearanceModel(this.f652b);
            }
            d1.f fVar = this.f654d;
            if (fVar != null) {
                a10.o(fVar);
            }
        }
        i a11 = a(true);
        if (a11 != null) {
            y yVar2 = this.f653c;
            if (yVar2 != null) {
                a11.t(yVar2);
            } else {
                a11.setShapeAppearanceModel(this.f652b);
            }
            d1.f fVar2 = this.f654d;
            if (fVar2 != null) {
                a11.o(fVar2);
            }
        }
        RippleDrawable rippleDrawable = this.f670v;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 1) {
            if (this.f670v.getNumberOfLayers() > 2) {
                vVar = (v) this.f670v.getDrawable(2);
            } else {
                vVar = (v) this.f670v.getDrawable(1);
            }
        } else {
            vVar = null;
        }
        if (vVar != null) {
            vVar.setShapeAppearanceModel(this.f652b);
            if (vVar instanceof i) {
                i iVar = (i) vVar;
                y yVar3 = this.f653c;
                if (yVar3 != null) {
                    iVar.t(yVar3);
                }
                d1.f fVar3 = this.f654d;
                if (fVar3 != null) {
                    iVar.o(fVar3);
                }
            }
        }
    }

    public final void e() {
        int i6 = 0;
        i a10 = a(false);
        i a11 = a(true);
        if (a10 != null) {
            float f3 = this.f660k;
            ColorStateList colorStateList = this.f663n;
            a10.f13000y.f12987k = f3;
            a10.invalidateSelf();
            ua.g gVar = a10.f13000y;
            if (gVar.f12982e != colorStateList) {
                gVar.f12982e = colorStateList;
                a10.onStateChange(a10.getState());
            }
            if (a11 != null) {
                float f10 = this.f660k;
                if (this.f666q) {
                    i6 = jb.b.o(this.f651a, R.attr.colorSurface);
                }
                a11.f13000y.f12987k = f10;
                a11.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i6);
                ua.g gVar2 = a11.f13000y;
                if (gVar2.f12982e != valueOf) {
                    gVar2.f12982e = valueOf;
                    a11.onStateChange(a11.getState());
                }
            }
        }
    }
}

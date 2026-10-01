package k;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.StateSet;
import v.i;
import v.j;
import v.m;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends Drawable.ConstantState {
    public boolean A;
    public ColorFilter B;
    public boolean C;
    public ColorStateList D;
    public PorterDuff.Mode E;
    public boolean F;
    public boolean G;
    public int[][] H;
    public i I;
    public m J;

    /* renamed from: a, reason: collision with root package name */
    public final g f7493a;

    /* renamed from: b, reason: collision with root package name */
    public Resources f7494b;

    /* renamed from: c, reason: collision with root package name */
    public int f7495c;

    /* renamed from: d, reason: collision with root package name */
    public int f7496d;

    /* renamed from: e, reason: collision with root package name */
    public int f7497e;

    /* renamed from: f, reason: collision with root package name */
    public SparseArray f7498f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable[] f7499g;

    /* renamed from: h, reason: collision with root package name */
    public int f7500h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7501i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f7502k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7503l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7504m;

    /* renamed from: n, reason: collision with root package name */
    public int f7505n;

    /* renamed from: o, reason: collision with root package name */
    public int f7506o;

    /* renamed from: p, reason: collision with root package name */
    public int f7507p;

    /* renamed from: q, reason: collision with root package name */
    public int f7508q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7509r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7510t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7511u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7512v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7513w;

    /* renamed from: x, reason: collision with root package name */
    public int f7514x;

    /* renamed from: y, reason: collision with root package name */
    public int f7515y;

    /* renamed from: z, reason: collision with root package name */
    public int f7516z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i6;
        this.f7501i = false;
        this.f7503l = false;
        this.f7513w = true;
        this.f7515y = 0;
        this.f7516z = 0;
        this.f7493a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f7494b;
        } else {
            resources2 = null;
        }
        this.f7494b = resources2;
        if (bVar != null) {
            i6 = bVar.f7495c;
        } else {
            i6 = 0;
        }
        int i10 = g.J;
        i6 = resources != null ? resources.getDisplayMetrics().densityDpi : i6;
        i6 = i6 == 0 ? 160 : i6;
        this.f7495c = i6;
        if (bVar != null) {
            this.f7496d = bVar.f7496d;
            this.f7497e = bVar.f7497e;
            this.f7511u = true;
            this.f7512v = true;
            this.f7501i = bVar.f7501i;
            this.f7503l = bVar.f7503l;
            this.f7513w = bVar.f7513w;
            this.f7514x = bVar.f7514x;
            this.f7515y = bVar.f7515y;
            this.f7516z = bVar.f7516z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f7495c == i6) {
                if (bVar.j) {
                    this.f7502k = bVar.f7502k != null ? new Rect(bVar.f7502k) : null;
                    this.j = true;
                }
                if (bVar.f7504m) {
                    this.f7505n = bVar.f7505n;
                    this.f7506o = bVar.f7506o;
                    this.f7507p = bVar.f7507p;
                    this.f7508q = bVar.f7508q;
                    this.f7504m = true;
                }
            }
            if (bVar.f7509r) {
                this.s = bVar.s;
                this.f7509r = true;
            }
            if (bVar.f7510t) {
                this.f7510t = true;
            }
            Drawable[] drawableArr = bVar.f7499g;
            this.f7499g = new Drawable[drawableArr.length];
            this.f7500h = bVar.f7500h;
            SparseArray sparseArray = bVar.f7498f;
            if (sparseArray != null) {
                this.f7498f = sparseArray.clone();
            } else {
                this.f7498f = new SparseArray(this.f7500h);
            }
            int i11 = this.f7500h;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f7498f.put(i12, constantState);
                    } else {
                        this.f7499g[i12] = drawableArr[i12];
                    }
                }
            }
        } else {
            this.f7499g = new Drawable[10];
            this.f7500h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f7499g.length];
        }
        if (bVar != null) {
            this.I = bVar.I;
            this.J = bVar.J;
        } else {
            this.I = new i();
            this.J = new m(0);
        }
    }

    public final int a(Drawable drawable) {
        int i6 = this.f7500h;
        if (i6 >= this.f7499g.length) {
            int i10 = i6 + 10;
            Drawable[] drawableArr = new Drawable[i10];
            Drawable[] drawableArr2 = this.f7499g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i6);
            }
            this.f7499g = drawableArr;
            int[][] iArr = new int[i10];
            System.arraycopy(this.H, 0, iArr, 0, i6);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f7493a);
        this.f7499g[i6] = drawable;
        this.f7500h++;
        this.f7497e = drawable.getChangingConfigurations() | this.f7497e;
        this.f7509r = false;
        this.f7510t = false;
        this.f7502k = null;
        this.j = false;
        this.f7504m = false;
        this.f7511u = false;
        return i6;
    }

    public final void b() {
        this.f7504m = true;
        c();
        int i6 = this.f7500h;
        Drawable[] drawableArr = this.f7499g;
        this.f7506o = -1;
        this.f7505n = -1;
        this.f7508q = 0;
        this.f7507p = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            Drawable drawable = drawableArr[i10];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f7505n) {
                this.f7505n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f7506o) {
                this.f7506o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f7507p) {
                this.f7507p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f7508q) {
                this.f7508q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f7498f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i6 = 0; i6 < size; i6++) {
                int keyAt = this.f7498f.keyAt(i6);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f7498f.valueAt(i6);
                Drawable[] drawableArr = this.f7499g;
                Drawable newDrawable = constantState.newDrawable(this.f7494b);
                if (Build.VERSION.SDK_INT >= 23) {
                    s1.c.w(newDrawable, this.f7514x);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f7493a);
                drawableArr[keyAt] = mutate;
            }
            this.f7498f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i6 = this.f7500h;
        Drawable[] drawableArr = this.f7499g;
        for (int i10 = 0; i10 < i6; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f7498f.get(i10);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i6) {
        int indexOfKey;
        Drawable drawable = this.f7499g[i6];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f7498f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i6)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f7498f.valueAt(indexOfKey)).newDrawable(this.f7494b);
        if (Build.VERSION.SDK_INT >= 23) {
            s1.c.w(newDrawable, this.f7514x);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f7493a);
        this.f7499g[i6] = mutate;
        this.f7498f.removeAt(indexOfKey);
        if (this.f7498f.size() == 0) {
            this.f7498f = null;
        }
        return mutate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public final int e(int i6) {
        ?? r52;
        if (i6 < 0) {
            return 0;
        }
        m mVar = this.J;
        int i10 = 0;
        int a10 = w.a.a(mVar.A, i6, mVar.f13176y);
        if (a10 >= 0 && (r52 = mVar.f13177z[a10]) != j.f13164b) {
            i10 = r52;
        }
        return i10.intValue();
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.H;
        int i6 = this.f7500h;
        for (int i10 = 0; i10 < i6; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f7496d | this.f7497e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}

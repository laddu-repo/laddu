package j;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;
import v.g;
import v.h;
import v.j;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Drawable.ConstantState {
    public boolean A;
    public ColorFilter B;
    public boolean C;
    public ColorStateList D;
    public PorterDuff.Mode E;
    public boolean F;
    public boolean G;
    public int[][] H;
    public g I;
    public j J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f6612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources f6613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6616e;
    public SparseArray f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable[] f6617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6618h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6619j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f6620k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6621l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6622m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6623n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6624o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6625p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6626q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f6627r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6628s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6629t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6630u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6631v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f6632w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6633x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6634y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f6635z;

    public b(b bVar, e eVar, Resources resources) {
        this.i = false;
        this.f6621l = false;
        this.f6632w = true;
        this.f6634y = 0;
        this.f6635z = 0;
        this.f6612a = eVar;
        this.f6613b = resources != null ? resources : bVar != null ? bVar.f6613b : null;
        int i = bVar != null ? bVar.f6614c : 0;
        int i10 = e.O;
        i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
        i = i == 0 ? 160 : i;
        this.f6614c = i;
        if (bVar != null) {
            this.f6615d = bVar.f6615d;
            this.f6616e = bVar.f6616e;
            this.f6630u = true;
            this.f6631v = true;
            this.i = bVar.i;
            this.f6621l = bVar.f6621l;
            this.f6632w = bVar.f6632w;
            this.f6633x = bVar.f6633x;
            this.f6634y = bVar.f6634y;
            this.f6635z = bVar.f6635z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f6614c == i) {
                if (bVar.f6619j) {
                    this.f6620k = bVar.f6620k != null ? new Rect(bVar.f6620k) : null;
                    this.f6619j = true;
                }
                if (bVar.f6622m) {
                    this.f6623n = bVar.f6623n;
                    this.f6624o = bVar.f6624o;
                    this.f6625p = bVar.f6625p;
                    this.f6626q = bVar.f6626q;
                    this.f6622m = true;
                }
            }
            if (bVar.f6627r) {
                this.f6628s = bVar.f6628s;
                this.f6627r = true;
            }
            if (bVar.f6629t) {
                this.f6629t = true;
            }
            Drawable[] drawableArr = bVar.f6617g;
            this.f6617g = new Drawable[drawableArr.length];
            this.f6618h = bVar.f6618h;
            SparseArray sparseArray = bVar.f;
            if (sparseArray != null) {
                this.f = sparseArray.clone();
            } else {
                this.f = new SparseArray(this.f6618h);
            }
            int i11 = this.f6618h;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f.put(i12, constantState);
                    } else {
                        this.f6617g[i12] = drawableArr[i12];
                    }
                }
            }
        } else {
            this.f6617g = new Drawable[10];
            this.f6618h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f6617g.length][];
        }
        if (bVar != null) {
            this.I = bVar.I;
            this.J = bVar.J;
        } else {
            this.I = new g();
            this.J = new j();
        }
    }

    public final int a(Drawable drawable) {
        int i = this.f6618h;
        if (i >= this.f6617g.length) {
            int i10 = i + 10;
            Drawable[] drawableArr = new Drawable[i10];
            Drawable[] drawableArr2 = this.f6617g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.f6617g = drawableArr;
            int[][] iArr = new int[i10][];
            System.arraycopy(this.H, 0, iArr, 0, i);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f6612a);
        this.f6617g[i] = drawable;
        this.f6618h++;
        this.f6616e = drawable.getChangingConfigurations() | this.f6616e;
        this.f6627r = false;
        this.f6629t = false;
        this.f6620k = null;
        this.f6619j = false;
        this.f6622m = false;
        this.f6630u = false;
        return i;
    }

    public final void b() {
        this.f6622m = true;
        c();
        int i = this.f6618h;
        Drawable[] drawableArr = this.f6617g;
        this.f6624o = -1;
        this.f6623n = -1;
        this.f6626q = 0;
        this.f6625p = 0;
        for (int i10 = 0; i10 < i; i10++) {
            Drawable drawable = drawableArr[i10];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f6623n) {
                this.f6623n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f6624o) {
                this.f6624o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f6625p) {
                this.f6625p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f6626q) {
                this.f6626q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = this.f.keyAt(i);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.valueAt(i);
                Drawable[] drawableArr = this.f6617g;
                Drawable drawableNewDrawable = constantState.newDrawable(this.f6613b);
                drawableNewDrawable.setLayoutDirection(this.f6633x);
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.f6612a);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i = this.f6618h;
        Drawable[] drawableArr = this.f6617g;
        for (int i10 = 0; i10 < i; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.get(i10);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int i) {
        int iIndexOfKey;
        Drawable drawable = this.f6617g[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f.valueAt(iIndexOfKey)).newDrawable(this.f6613b);
        drawableNewDrawable.setLayoutDirection(this.f6633x);
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.f6612a);
        this.f6617g[i] = drawableMutate;
        this.f.removeAt(iIndexOfKey);
        if (this.f.size() == 0) {
            this.f = null;
        }
        return drawableMutate;
    }

    public final int e(int i) {
        Object obj;
        if (i < 0) {
            return 0;
        }
        j jVar = this.J;
        Object obj2 = 0;
        int iA = w.a.a(jVar.f13024x, i, jVar.f13022v);
        if (iA >= 0 && (obj = jVar.f13023w[iA]) != h.f13018b) {
            obj2 = obj;
        }
        return ((Integer) obj2).intValue();
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.H;
        int i = this.f6618h;
        for (int i10 = 0; i10 < i; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f6615d | this.f6616e;
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

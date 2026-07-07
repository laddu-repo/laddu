package pa;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.playfy.tv.R;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public int f10633a;

    /* renamed from: b, reason: collision with root package name */
    public int f10634b;

    /* renamed from: c, reason: collision with root package name */
    public float f10635c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10636d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f10637e;

    /* renamed from: f, reason: collision with root package name */
    public int f10638f;

    /* renamed from: g, reason: collision with root package name */
    public int f10639g;

    /* renamed from: h, reason: collision with root package name */
    public int f10640h;

    /* renamed from: i, reason: collision with root package name */
    public int f10641i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f10642k;

    /* renamed from: l, reason: collision with root package name */
    public int f10643l;

    /* renamed from: m, reason: collision with root package name */
    public int f10644m;

    /* renamed from: n, reason: collision with root package name */
    public float f10645n;

    public e(Context context, AttributeSet attributeSet, int i6, int i10) {
        this.f10637e = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        ma.n.a(context, attributeSet, i6, i10);
        int[] iArr = t9.a.f12676d;
        ma.n.b(context, attributeSet, iArr, i6, i10, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i6, i10);
        this.f10633a = a8.i.k(context, obtainStyledAttributes, 10, dimensionPixelSize);
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null) {
            int i11 = peekValue.type;
            if (i11 == 5) {
                this.f10634b = Math.min(TypedValue.complexToDimensionPixelSize(peekValue.data, obtainStyledAttributes.getResources().getDisplayMetrics()), this.f10633a / 2);
                this.f10636d = false;
            } else if (i11 == 6) {
                this.f10635c = Math.min(peekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.f10636d = true;
            }
        }
        this.f10639g = obtainStyledAttributes.getInt(6, 0);
        this.f10640h = obtainStyledAttributes.getInt(1, 0);
        this.f10641i = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        int abs = Math.abs(obtainStyledAttributes.getDimensionPixelSize(13, 0));
        this.j = Math.abs(obtainStyledAttributes.getDimensionPixelSize(14, abs));
        this.f10642k = Math.abs(obtainStyledAttributes.getDimensionPixelSize(15, abs));
        this.f10643l = Math.abs(obtainStyledAttributes.getDimensionPixelSize(11, 0));
        this.f10644m = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        this.f10645n = obtainStyledAttributes.getFloat(2, 1.0f);
        if (!obtainStyledAttributes.hasValue(3)) {
            this.f10637e = new int[]{jb.b.n(context, R.attr.colorPrimary, -1)};
        } else if (obtainStyledAttributes.peekValue(3).type != 1) {
            this.f10637e = new int[]{obtainStyledAttributes.getColor(3, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(obtainStyledAttributes.getResourceId(3, -1));
            this.f10637e = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (obtainStyledAttributes.hasValue(8)) {
            this.f10638f = obtainStyledAttributes.getColor(8, -1);
        } else {
            this.f10638f = this.f10637e[0];
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f3 = obtainStyledAttributes2.getFloat(0, 0.2f);
            obtainStyledAttributes2.recycle();
            this.f10638f = jb.b.m(this.f10638f, (int) (f3 * 255.0f));
        }
        obtainStyledAttributes.recycle();
    }

    public final int a() {
        if (this.f10636d) {
            return (int) (this.f10633a * this.f10635c);
        }
        return this.f10634b;
    }

    public final boolean b(boolean z10) {
        if (this.f10643l > 0) {
            if (z10 || this.f10642k <= 0) {
                if (z10 && this.j > 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean c() {
        if (this.f10636d && this.f10635c == 0.5f) {
            return true;
        }
        return false;
    }

    public void d() {
        if (this.f10641i >= 0) {
        } else {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}

package d0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f3624n;

    /* renamed from: a, reason: collision with root package name */
    public float f3625a;

    /* renamed from: b, reason: collision with root package name */
    public float f3626b;

    /* renamed from: c, reason: collision with root package name */
    public float f3627c;

    /* renamed from: d, reason: collision with root package name */
    public float f3628d;

    /* renamed from: e, reason: collision with root package name */
    public float f3629e;

    /* renamed from: f, reason: collision with root package name */
    public float f3630f;

    /* renamed from: g, reason: collision with root package name */
    public float f3631g;

    /* renamed from: h, reason: collision with root package name */
    public int f3632h;

    /* renamed from: i, reason: collision with root package name */
    public float f3633i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f3634k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3635l;

    /* renamed from: m, reason: collision with root package name */
    public float f3636m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3624n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f3652i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = obtainStyledAttributes.getIndex(i6);
            switch (f3624n.get(index)) {
                case 1:
                    this.f3625a = obtainStyledAttributes.getFloat(index, this.f3625a);
                    break;
                case 2:
                    this.f3626b = obtainStyledAttributes.getFloat(index, this.f3626b);
                    break;
                case 3:
                    this.f3627c = obtainStyledAttributes.getFloat(index, this.f3627c);
                    break;
                case 4:
                    this.f3628d = obtainStyledAttributes.getFloat(index, this.f3628d);
                    break;
                case 5:
                    this.f3629e = obtainStyledAttributes.getFloat(index, this.f3629e);
                    break;
                case 6:
                    this.f3630f = obtainStyledAttributes.getDimension(index, this.f3630f);
                    break;
                case 7:
                    this.f3631g = obtainStyledAttributes.getDimension(index, this.f3631g);
                    break;
                case 8:
                    this.f3633i = obtainStyledAttributes.getDimension(index, this.f3633i);
                    break;
                case 9:
                    this.j = obtainStyledAttributes.getDimension(index, this.j);
                    break;
                case 10:
                    this.f3634k = obtainStyledAttributes.getDimension(index, this.f3634k);
                    break;
                case 11:
                    this.f3635l = true;
                    this.f3636m = obtainStyledAttributes.getDimension(index, this.f3636m);
                    break;
                case 12:
                    this.f3632h = o.g(obtainStyledAttributes, index, this.f3632h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}

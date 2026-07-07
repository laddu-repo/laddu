package d0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l {
    public static final SparseIntArray j;

    /* renamed from: a, reason: collision with root package name */
    public int f3611a;

    /* renamed from: b, reason: collision with root package name */
    public int f3612b;

    /* renamed from: c, reason: collision with root package name */
    public int f3613c;

    /* renamed from: d, reason: collision with root package name */
    public float f3614d;

    /* renamed from: e, reason: collision with root package name */
    public float f3615e;

    /* renamed from: f, reason: collision with root package name */
    public float f3616f;

    /* renamed from: g, reason: collision with root package name */
    public int f3617g;

    /* renamed from: h, reason: collision with root package name */
    public String f3618h;

    /* renamed from: i, reason: collision with root package name */
    public int f3619i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f3649f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = obtainStyledAttributes.getIndex(i6);
            switch (j.get(index)) {
                case 1:
                    this.f3615e = obtainStyledAttributes.getFloat(index, this.f3615e);
                    break;
                case 2:
                    this.f3613c = obtainStyledAttributes.getInt(index, this.f3613c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = z.a.f15111a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f3611a = o.g(obtainStyledAttributes, index, this.f3611a);
                    break;
                case 6:
                    this.f3612b = obtainStyledAttributes.getInteger(index, this.f3612b);
                    break;
                case 7:
                    this.f3614d = obtainStyledAttributes.getFloat(index, this.f3614d);
                    break;
                case 8:
                    this.f3617g = obtainStyledAttributes.getInteger(index, this.f3617g);
                    break;
                case 9:
                    this.f3616f = obtainStyledAttributes.getFloat(index, this.f3616f);
                    break;
                case 10:
                    int i10 = obtainStyledAttributes.peekValue(index).type;
                    if (i10 == 1) {
                        this.f3619i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i10 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f3618h = string;
                        if (string.indexOf("/") > 0) {
                            this.f3619i = obtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        obtainStyledAttributes.getInteger(index, this.f3619i);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}

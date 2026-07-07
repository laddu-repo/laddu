package d0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public int f3620a;

    /* renamed from: b, reason: collision with root package name */
    public int f3621b;

    /* renamed from: c, reason: collision with root package name */
    public float f3622c;

    /* renamed from: d, reason: collision with root package name */
    public float f3623d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f3650g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = obtainStyledAttributes.getIndex(i6);
            if (index == 1) {
                this.f3622c = obtainStyledAttributes.getFloat(index, this.f3622c);
            } else if (index == 0) {
                int i10 = obtainStyledAttributes.getInt(index, this.f3620a);
                this.f3620a = i10;
                this.f3620a = o.f3637d[i10];
            } else if (index == 4) {
                this.f3621b = obtainStyledAttributes.getInt(index, this.f3621b);
            } else if (index == 3) {
                this.f3623d = obtainStyledAttributes.getFloat(index, this.f3623d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}

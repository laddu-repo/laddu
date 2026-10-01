package d0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final float f3550a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3551b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3552c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3553d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3554e;

    public h(Context context, XmlResourceParser xmlResourceParser) {
        this.f3550a = Float.NaN;
        this.f3551b = Float.NaN;
        this.f3552c = Float.NaN;
        this.f3553d = Float.NaN;
        this.f3554e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = obtainStyledAttributes.getIndex(i6);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f3554e);
                this.f3554e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new o().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f3553d = obtainStyledAttributes.getDimension(index, this.f3553d);
            } else if (index == 2) {
                this.f3551b = obtainStyledAttributes.getDimension(index, this.f3551b);
            } else if (index == 3) {
                this.f3552c = obtainStyledAttributes.getDimension(index, this.f3552c);
            } else if (index == 4) {
                this.f3550a = obtainStyledAttributes.getDimension(index, this.f3550a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}

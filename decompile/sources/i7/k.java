package i7;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6675a;

    /* renamed from: b, reason: collision with root package name */
    public PointF f6676b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6677c;

    public k(PointF pointF, boolean z10, List list) {
        this.f6676b = pointF;
        this.f6677c = z10;
        this.f6675a = new ArrayList(list);
    }

    public final void a(float f3, float f10) {
        if (this.f6676b == null) {
            this.f6676b = new PointF();
        }
        this.f6676b.set(f3, f10);
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.f6675a.size() + "closed=" + this.f6677c + '}';
    }

    public k() {
        this.f6675a = new ArrayList();
    }
}

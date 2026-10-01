package q5;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PointF f10854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10855c;

    public k(PointF pointF, boolean z2, List list) {
        this.f10854b = pointF;
        this.f10855c = z2;
        this.f10853a = new ArrayList(list);
    }

    public final void a(float f, float f4) {
        if (this.f10854b == null) {
            this.f10854b = new PointF();
        }
        this.f10854b.set(f, f4);
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.f10853a.size() + "closed=" + this.f10855c + '}';
    }

    public k() {
        this.f10853a = new ArrayList();
    }
}

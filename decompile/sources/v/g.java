package v;

import android.view.View;
import t0.q0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f13152a;

    /* renamed from: b, reason: collision with root package name */
    public int f13153b;

    /* renamed from: c, reason: collision with root package name */
    public int f13154c;

    /* renamed from: d, reason: collision with root package name */
    public Object f13155d;

    public void a(z4.g gVar) {
        Object[] objArr = (Object[]) this.f13155d;
        int i6 = this.f13153b;
        objArr[i6] = gVar;
        int i10 = this.f13154c & (i6 + 1);
        this.f13153b = i10;
        int i11 = this.f13152a;
        if (i10 == i11) {
            int length = objArr.length;
            int i12 = length - i11;
            int i13 = length << 1;
            if (i13 >= 0) {
                Object[] objArr2 = new Object[i13];
                ie.i.d0(0, i11, length, objArr, objArr2);
                ie.i.d0(i12, 0, this.f13152a, (Object[]) this.f13155d, objArr2);
                this.f13155d = objArr2;
                this.f13152a = 0;
                this.f13153b = length;
                this.f13154c = i13 - 1;
                return;
            }
            throw new RuntimeException("Max array capacity exceeded");
        }
    }

    public void b() {
        View view = (View) this.f13155d;
        q0.l(view, this.f13154c - (view.getTop() - this.f13152a));
        q0.k(view, 0 - (view.getLeft() - this.f13153b));
    }
}

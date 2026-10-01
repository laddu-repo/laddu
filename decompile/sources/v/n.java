package v;

import ie.v;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n extends v {

    /* renamed from: x, reason: collision with root package name */
    public int f13178x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m f13179y;

    public n(m mVar) {
        this.f13179y = mVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f13178x < this.f13179y.f()) {
            return true;
        }
        return false;
    }

    @Override // ie.v
    public final int nextInt() {
        int i6 = this.f13178x;
        this.f13178x = i6 + 1;
        return this.f13179y.d(i6);
    }
}

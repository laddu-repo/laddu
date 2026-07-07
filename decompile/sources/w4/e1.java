package w4;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public int f13857a;

    /* renamed from: b, reason: collision with root package name */
    public int f13858b;

    /* renamed from: c, reason: collision with root package name */
    public int f13859c;

    /* renamed from: d, reason: collision with root package name */
    public int f13860d;

    /* renamed from: e, reason: collision with root package name */
    public int f13861e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13862f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13863g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13864h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13865i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13866k;

    /* renamed from: l, reason: collision with root package name */
    public int f13867l;

    /* renamed from: m, reason: collision with root package name */
    public long f13868m;

    /* renamed from: n, reason: collision with root package name */
    public int f13869n;

    public final void a(int i6) {
        if ((this.f13860d & i6) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i6) + " but it is " + Integer.toBinaryString(this.f13860d));
    }

    public final int b() {
        if (this.f13863g) {
            return this.f13858b - this.f13859c;
        }
        return this.f13861e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f13857a + ", mData=null, mItemCount=" + this.f13861e + ", mIsMeasuring=" + this.f13865i + ", mPreviousLayoutItemCount=" + this.f13858b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f13859c + ", mStructureChanged=" + this.f13862f + ", mInPreLayout=" + this.f13863g + ", mRunSimpleAnimations=" + this.j + ", mRunPredictiveAnimations=" + this.f13866k + '}';
    }
}

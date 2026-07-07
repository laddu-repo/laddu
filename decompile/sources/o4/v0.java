package o4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9888e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9890h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9891j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9892k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9893l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f9894m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9895n;

    public final void a(int i) {
        if ((this.f9887d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f9887d));
    }

    public final int b() {
        return this.f9889g ? this.f9885b - this.f9886c : this.f9888e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f9884a + ", mData=null, mItemCount=" + this.f9888e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f9885b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f9886c + ", mStructureChanged=" + this.f + ", mInPreLayout=" + this.f9889g + ", mRunSimpleAnimations=" + this.f9891j + ", mRunPredictiveAnimations=" + this.f9892k + '}';
    }
}

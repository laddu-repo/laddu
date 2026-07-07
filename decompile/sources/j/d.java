package j;

import android.animation.TimeInterpolator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d implements TimeInterpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f6638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6640c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i = (int) ((f * this.f6640c) + 0.5f);
        int i10 = this.f6639b;
        int[] iArr = this.f6638a;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = iArr[i11];
            if (i < i12) {
                break;
            }
            i -= i12;
            i11++;
        }
        return (i11 / i10) + (i11 < i10 ? i / this.f6640c : 0.0f);
    }
}

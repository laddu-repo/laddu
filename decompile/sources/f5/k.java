package f5;

import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b3.a f5241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f5242e;
    public b3.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f5243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f5244h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f5245j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f5246k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint.Cap f5247l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Paint.Join f5248m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f5249n;

    @Override // f5.m
    public final boolean a() {
        return this.f.i() || this.f5241d.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // f5.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int[] r7) {
        /*
            r6 = this;
            b3.a r0 = r6.f
            boolean r1 = r0.i()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f1530y
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f1528w
            if (r1 == r4) goto L1e
            r0.f1528w = r1
            r0 = r2
            goto L1f
        L1e:
            r0 = r3
        L1f:
            b3.a r1 = r6.f5241d
            boolean r4 = r1.i()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.f1530y
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f1528w
            if (r7 == r4) goto L3a
            r1.f1528w = r7
            goto L3b
        L3a:
            r2 = r3
        L3b:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.k.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f5244h;
    }

    public int getFillColor() {
        return this.f.f1528w;
    }

    public float getStrokeAlpha() {
        return this.f5243g;
    }

    public int getStrokeColor() {
        return this.f5241d.f1528w;
    }

    public float getStrokeWidth() {
        return this.f5242e;
    }

    public float getTrimPathEnd() {
        return this.f5245j;
    }

    public float getTrimPathOffset() {
        return this.f5246k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f) {
        this.f5244h = f;
    }

    public void setFillColor(int i) {
        this.f.f1528w = i;
    }

    public void setStrokeAlpha(float f) {
        this.f5243g = f;
    }

    public void setStrokeColor(int i) {
        this.f5241d.f1528w = i;
    }

    public void setStrokeWidth(float f) {
        this.f5242e = f;
    }

    public void setTrimPathEnd(float f) {
        this.f5245j = f;
    }

    public void setTrimPathOffset(float f) {
        this.f5246k = f;
    }

    public void setTrimPathStart(float f) {
        this.i = f;
    }
}

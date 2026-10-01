package p5;

import android.graphics.Paint;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i extends l {

    /* renamed from: d, reason: collision with root package name */
    public b2.k f10533d;

    /* renamed from: e, reason: collision with root package name */
    public float f10534e;

    /* renamed from: f, reason: collision with root package name */
    public b2.k f10535f;

    /* renamed from: g, reason: collision with root package name */
    public float f10536g;

    /* renamed from: h, reason: collision with root package name */
    public float f10537h;

    /* renamed from: i, reason: collision with root package name */
    public float f10538i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f10539k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f10540l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f10541m;

    /* renamed from: n, reason: collision with root package name */
    public float f10542n;

    @Override // p5.k
    public final boolean a() {
        if (!this.f10535f.m() && !this.f10533d.m()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // p5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int[] r7) {
        /*
            r6 = this;
            b2.k r0 = r6.f10535f
            boolean r1 = r0.m()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.A
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f1383y
            if (r1 == r4) goto L1e
            r0.f1383y = r1
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            b2.k r1 = r6.f10533d
            boolean r4 = r1.m()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.A
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f1383y
            if (r7 == r4) goto L3a
            r1.f1383y = r7
            goto L3b
        L3a:
            r2 = 0
        L3b:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.i.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f10537h;
    }

    public int getFillColor() {
        return this.f10535f.f1383y;
    }

    public float getStrokeAlpha() {
        return this.f10536g;
    }

    public int getStrokeColor() {
        return this.f10533d.f1383y;
    }

    public float getStrokeWidth() {
        return this.f10534e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.f10539k;
    }

    public float getTrimPathStart() {
        return this.f10538i;
    }

    public void setFillAlpha(float f3) {
        this.f10537h = f3;
    }

    public void setFillColor(int i6) {
        this.f10535f.f1383y = i6;
    }

    public void setStrokeAlpha(float f3) {
        this.f10536g = f3;
    }

    public void setStrokeColor(int i6) {
        this.f10533d.f1383y = i6;
    }

    public void setStrokeWidth(float f3) {
        this.f10534e = f3;
    }

    public void setTrimPathEnd(float f3) {
        this.j = f3;
    }

    public void setTrimPathOffset(float f3) {
        this.f10539k = f3;
    }

    public void setTrimPathStart(float f3) {
        this.f10538i = f3;
    }
}

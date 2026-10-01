package p5;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public l0.e[] f10553a;

    /* renamed from: b, reason: collision with root package name */
    public String f10554b;

    /* renamed from: c, reason: collision with root package name */
    public int f10555c;

    public l() {
        this.f10553a = null;
        this.f10555c = 0;
    }

    public l0.e[] getPathData() {
        return this.f10553a;
    }

    public String getPathName() {
        return this.f10554b;
    }

    public void setPathData(l0.e[] eVarArr) {
        if (!a8.i.a(this.f10553a, eVarArr)) {
            this.f10553a = a8.i.g(eVarArr);
            return;
        }
        l0.e[] eVarArr2 = this.f10553a;
        for (int i6 = 0; i6 < eVarArr.length; i6++) {
            eVarArr2[i6].f8067a = eVarArr[i6].f8067a;
            int i10 = 0;
            while (true) {
                float[] fArr = eVarArr[i6].f8068b;
                if (i10 < fArr.length) {
                    eVarArr2[i6].f8068b[i10] = fArr[i10];
                    i10++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f10553a = null;
        this.f10555c = 0;
        this.f10554b = lVar.f10554b;
        this.f10553a = a8.i.g(lVar.f10553a);
    }
}

package f5;

import p4.v;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l0.e[] f5259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5261c;

    public n() {
        this.f5259a = null;
        this.f5261c = 0;
    }

    public l0.e[] getPathData() {
        return this.f5259a;
    }

    public String getPathName() {
        return this.f5260b;
    }

    public void setPathData(l0.e[] eVarArr) {
        if (!v.g(this.f5259a, eVarArr)) {
            this.f5259a = v.w(eVarArr);
            return;
        }
        l0.e[] eVarArr2 = this.f5259a;
        for (int i = 0; i < eVarArr.length; i++) {
            eVarArr2[i].f8000a = eVarArr[i].f8000a;
            int i10 = 0;
            while (true) {
                float[] fArr = eVarArr[i].f8001b;
                if (i10 < fArr.length) {
                    eVarArr2[i].f8001b[i10] = fArr[i10];
                    i10++;
                }
            }
        }
    }

    public n(n nVar) {
        this.f5259a = null;
        this.f5261c = 0;
        this.f5260b = nVar.f5260b;
        this.f5259a = v.w(nVar.f5259a);
    }
}

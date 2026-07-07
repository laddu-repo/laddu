package o9;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f10062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f10063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f10064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f10065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f10066e;
    public Object f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f10067g = new ArrayList();

    public v() {
        d(0.0f, 270.0f, 0.0f);
    }

    public void a(float f) {
        float f4 = this.f10065d;
        if (f4 == f) {
            return;
        }
        float f10 = ((f - f4) + 360.0f) % 360.0f;
        if (f10 > 180.0f) {
            return;
        }
        float f11 = this.f10063b;
        float f12 = this.f10064c;
        r rVar = new r(f11, f12, f11, f12);
        rVar.f = this.f10065d;
        rVar.f10056g = f10;
        ((ArrayList) this.f10067g).add(new p(rVar));
        this.f10065d = f;
    }

    public void b(Matrix matrix, Path path) {
        ArrayList arrayList = (ArrayList) this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((t) arrayList.get(i)).a(matrix, path);
        }
    }

    public void c(float f, float f4) {
        s sVar = new s();
        sVar.f10057b = f;
        sVar.f10058c = f4;
        ((ArrayList) this.f).add(sVar);
        q qVar = new q(sVar, this.f10063b, this.f10064c);
        float fB = qVar.b() + 270.0f;
        float fB2 = qVar.b() + 270.0f;
        a(fB);
        ((ArrayList) this.f10067g).add(qVar);
        this.f10065d = fB2;
        this.f10063b = f;
        this.f10064c = f4;
    }

    public void d(float f, float f4, float f10) {
        this.f10062a = f;
        this.f10063b = 0.0f;
        this.f10064c = f;
        this.f10065d = f4;
        this.f10066e = (f4 + f10) % 360.0f;
        ((ArrayList) this.f).clear();
        ((ArrayList) this.f10067g).clear();
    }
}

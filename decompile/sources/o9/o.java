package o9;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f10045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f10046d;

    public o(ArrayList arrayList, Matrix matrix) {
        this.f10045c = arrayList;
        this.f10046d = matrix;
    }

    @Override // o9.u
    public final void a(Matrix matrix, n9.a aVar, int i, Canvas canvas) {
        ArrayList arrayList = this.f10045c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((u) obj).a(this.f10046d, aVar, i, canvas);
        }
    }
}

package ua;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o extends u {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f13027c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f13028d;

    public o(ArrayList arrayList, Matrix matrix) {
        this.f13027c = arrayList;
        this.f13028d = matrix;
    }

    @Override // ua.u
    public final void a(Matrix matrix, ta.a aVar, int i6, Canvas canvas) {
        ArrayList arrayList = this.f13027c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((u) obj).a(this.f13028d, aVar, i6, canvas);
        }
    }
}

package o4;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.ke;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f9908a;

    public /* synthetic */ z(RecyclerView recyclerView) {
        this.f9908a = recyclerView;
    }

    public void a(a aVar) {
        int i = aVar.f9670a;
        RecyclerView recyclerView = this.f9908a;
        if (i == 1) {
            recyclerView.I.Z(aVar.f9671b, aVar.f9673d);
            return;
        }
        if (i == 2) {
            recyclerView.I.c0(aVar.f9671b, aVar.f9673d);
        } else if (i == 4) {
            recyclerView.I.d0(aVar.f9671b, aVar.f9673d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.I.b0(aVar.f9671b, aVar.f9673d);
        }
    }

    public z0 b(int i) {
        RecyclerView recyclerView = this.f9908a;
        int iY = recyclerView.A.y();
        int i10 = 0;
        z0 z0Var = null;
        while (true) {
            if (i10 >= iY) {
                break;
            }
            z0 z0VarM = RecyclerView.M(recyclerView.A.x(i10));
            if (z0VarM != null && !z0VarM.h() && z0VarM.f9912c == i) {
                if (!((ArrayList) recyclerView.A.f2331z).contains(z0VarM.f9910a)) {
                    z0Var = z0VarM;
                    break;
                }
                z0Var = z0VarM;
            }
            i10++;
        }
        if (z0Var != null) {
            if (!((ArrayList) recyclerView.A.f2331z).contains(z0Var.f9910a)) {
                return z0Var;
            }
            if (RecyclerView.X0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    public void c(int i, int i10, Object obj) {
        int i11;
        int i12;
        RecyclerView recyclerView = this.f9908a;
        int iY = recyclerView.A.y();
        int i13 = i10 + i;
        for (int i14 = 0; i14 < iY; i14++) {
            View viewX = recyclerView.A.x(i14);
            z0 z0VarM = RecyclerView.M(viewX);
            if (z0VarM != null && !z0VarM.o() && (i12 = z0VarM.f9912c) >= i && i12 < i13) {
                z0VarM.a(2);
                if (obj == null) {
                    z0VarM.a(1024);
                } else if ((1024 & z0VarM.f9917j) == 0) {
                    if (z0VarM.f9918k == null) {
                        ArrayList arrayList = new ArrayList();
                        z0VarM.f9918k = arrayList;
                        z0VarM.f9919l = Collections.unmodifiableList(arrayList);
                    }
                    z0VarM.f9918k.add(obj);
                }
                ((k0) viewX.getLayoutParams()).f9802c = true;
            }
        }
        p0 p0Var = recyclerView.f1396x;
        ArrayList arrayList2 = p0Var.f9832c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            z0 z0Var = (z0) arrayList2.get(size);
            if (z0Var != null && (i11 = z0Var.f9912c) >= i && i11 < i13) {
                z0Var.a(2);
                p0Var.h(size);
            }
        }
        recyclerView.F0 = true;
    }

    public void d(int i, int i10) {
        RecyclerView recyclerView = this.f9908a;
        int iY = recyclerView.A.y();
        for (int i11 = 0; i11 < iY; i11++) {
            z0 z0VarM = RecyclerView.M(recyclerView.A.x(i11));
            if (z0VarM != null && !z0VarM.o() && z0VarM.f9912c >= i) {
                if (RecyclerView.X0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i11 + " holder " + z0VarM + " now at position " + (z0VarM.f9912c + i10));
                }
                z0VarM.l(i10, false);
                recyclerView.B0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.f1396x.f9832c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            z0 z0Var = (z0) arrayList.get(i12);
            if (z0Var != null && z0Var.f9912c >= i) {
                if (RecyclerView.X0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i12 + " holder " + z0Var + " now at position " + (z0Var.f9912c + i10));
                }
                z0Var.l(i10, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.E0 = true;
    }

    public void e(int i, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = this.f9908a;
        int iY = recyclerView.A.y();
        if (i < i10) {
            i12 = i;
            i11 = i10;
            i13 = -1;
        } else {
            i11 = i;
            i12 = i10;
            i13 = 1;
        }
        boolean z2 = false;
        for (int i19 = 0; i19 < iY; i19++) {
            z0 z0VarM = RecyclerView.M(recyclerView.A.x(i19));
            if (z0VarM != null && (i18 = z0VarM.f9912c) >= i12 && i18 <= i11) {
                if (RecyclerView.X0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i19 + " holder " + z0VarM);
                }
                if (z0VarM.f9912c == i) {
                    z0VarM.l(i10 - i, false);
                } else {
                    z0VarM.l(i13, false);
                }
                recyclerView.B0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.f1396x.f9832c;
        if (i < i10) {
            i15 = i;
            i14 = i10;
            i16 = -1;
        } else {
            i14 = i;
            i15 = i10;
            i16 = 1;
        }
        int size = arrayList.size();
        int i20 = 0;
        while (i20 < size) {
            z0 z0Var = (z0) arrayList.get(i20);
            if (z0Var != null && (i17 = z0Var.f9912c) >= i15 && i17 <= i14) {
                if (i17 == i) {
                    z0Var.l(i10 - i, z2);
                } else {
                    z0Var.l(i16, z2);
                }
                if (RecyclerView.X0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i20 + " holder " + z0Var);
                }
            }
            i20++;
            z2 = false;
        }
        recyclerView.requestLayout();
        recyclerView.E0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(o4.z0 r9, com.google.android.gms.internal.measurement.ke r10, com.google.android.gms.internal.measurement.ke r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.f9908a
            r0.getClass()
            r1 = 0
            r9.n(r1)
            o4.g0 r1 = r0.f1381j0
            r2 = r1
            o4.h r2 = (o4.h) r2
            if (r10 == 0) goto L20
            r2.getClass()
            int r4 = r10.f2830a
            int r6 = r11.f2830a
            if (r4 != r6) goto L22
            int r1 = r10.f2831b
            int r3 = r11.f2831b
            if (r1 == r3) goto L20
            goto L22
        L20:
            r3 = r9
            goto L2c
        L22:
            int r5 = r10.f2831b
            int r7 = r11.f2831b
            r3 = r9
            boolean r9 = r2.g(r3, r4, r5, r6, r7)
            goto L3b
        L2c:
            r2.l(r3)
            android.view.View r9 = r3.f9910a
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r2.i
            r9.add(r3)
            r9 = 1
        L3b:
            if (r9 == 0) goto L40
            r0.W()
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.z.f(o4.z0, com.google.android.gms.internal.measurement.ke, com.google.android.gms.internal.measurement.ke):void");
    }

    public void g(z0 z0Var, ke keVar, ke keVar2) {
        boolean zG;
        RecyclerView recyclerView = this.f9908a;
        recyclerView.f1396x.m(z0Var);
        recyclerView.h(z0Var);
        z0Var.n(false);
        h hVar = (h) recyclerView.f1381j0;
        hVar.getClass();
        int i = keVar.f2830a;
        int i10 = keVar.f2831b;
        View view = z0Var.f9910a;
        int left = keVar2 == null ? view.getLeft() : keVar2.f2830a;
        int top = keVar2 == null ? view.getTop() : keVar2.f2831b;
        if (z0Var.h() || (i == left && i10 == top)) {
            hVar.l(z0Var);
            hVar.f9735h.add(z0Var);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = hVar.g(z0Var, i, i10, left, top);
        }
        if (zG) {
            recyclerView.W();
        }
    }
}

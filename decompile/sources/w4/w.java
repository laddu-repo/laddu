package w4;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w implements Runnable {
    public static final ThreadLocal B = new ThreadLocal();
    public static final cg.h C = new cg.h(10);
    public ArrayList A;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f14053x;

    /* renamed from: y, reason: collision with root package name */
    public long f14054y;

    /* renamed from: z, reason: collision with root package name */
    public long f14055z;

    public static i1 c(RecyclerView recyclerView, int i6, long j) {
        int A = recyclerView.C.A();
        for (int i10 = 0; i10 < A; i10++) {
            i1 J = RecyclerView.J(recyclerView.C.z(i10));
            if (J.f13899c == i6 && !J.g()) {
                return null;
            }
        }
        y0 y0Var = recyclerView.f1148z;
        try {
            recyclerView.Q();
            i1 l10 = y0Var.l(i6, j);
            if (l10 != null) {
                if (l10.f() && !l10.g()) {
                    y0Var.i(l10.f13897a);
                } else {
                    y0Var.a(l10, false);
                }
            }
            recyclerView.R(false);
            return l10;
        } catch (Throwable th) {
            recyclerView.R(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i6, int i10) {
        if (recyclerView.P && this.f14054y == 0) {
            this.f14054y = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        v.h hVar = recyclerView.C0;
        hVar.f13156a = i6;
        hVar.f13157b = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(long j) {
        v vVar;
        RecyclerView recyclerView;
        long j10;
        RecyclerView recyclerView2;
        v vVar2;
        boolean z10;
        ArrayList arrayList = this.A;
        ArrayList arrayList2 = this.f14053x;
        int size = arrayList2.size();
        int i6 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i10);
            int windowVisibility = recyclerView3.getWindowVisibility();
            v.h hVar = recyclerView3.C0;
            if (windowVisibility == 0) {
                hVar.c(recyclerView3, false);
                i6 += hVar.f13159d;
            }
        }
        arrayList.ensureCapacity(i6);
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i12);
            if (recyclerView4.getWindowVisibility() == 0) {
                v.h hVar2 = recyclerView4.C0;
                int abs = Math.abs(hVar2.f13157b) + Math.abs(hVar2.f13156a);
                for (int i13 = 0; i13 < hVar2.f13159d * 2; i13 += 2) {
                    if (i11 >= arrayList.size()) {
                        Object obj = new Object();
                        arrayList.add(obj);
                        vVar2 = obj;
                    } else {
                        vVar2 = (v) arrayList.get(i11);
                    }
                    int[] iArr = hVar2.f13158c;
                    int i14 = iArr[i13 + 1];
                    if (i14 <= abs) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    vVar2.f14048a = z10;
                    vVar2.f14049b = abs;
                    vVar2.f14050c = i14;
                    vVar2.f14051d = recyclerView4;
                    vVar2.f14052e = iArr[i13];
                    i11++;
                }
            }
        }
        Collections.sort(arrayList, C);
        for (int i15 = 0; i15 < arrayList.size() && (recyclerView = (vVar = (v) arrayList.get(i15)).f14051d) != null; i15++) {
            if (vVar.f14048a) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = j;
            }
            i1 c10 = c(recyclerView, vVar.f14052e, j10);
            if (c10 != null && c10.f13898b != null && c10.f() && !c10.g() && (recyclerView2 = (RecyclerView) c10.f13898b.get()) != null) {
                if (recyclerView2.f1124c0 && recyclerView2.C.A() != 0) {
                    y0 y0Var = recyclerView2.f1148z;
                    o0 o0Var = recyclerView2.f1133l0;
                    if (o0Var != null) {
                        o0Var.e();
                    }
                    s0 s0Var = recyclerView2.K;
                    if (s0Var != null) {
                        s0Var.i0(y0Var);
                        recyclerView2.K.j0(y0Var);
                    }
                    y0Var.f14074a.clear();
                    y0Var.g();
                }
                v.h hVar3 = recyclerView2.C0;
                hVar3.c(recyclerView2, true);
                if (hVar3.f13159d != 0) {
                    try {
                        int i16 = p0.i.f10450a;
                        Trace.beginSection("RV Nested Prefetch");
                        e1 e1Var = recyclerView2.D0;
                        k0 k0Var = recyclerView2.J;
                        e1Var.f13860d = 1;
                        e1Var.f13861e = k0Var.a();
                        e1Var.f13863g = false;
                        e1Var.f13864h = false;
                        e1Var.f13865i = false;
                        for (int i17 = 0; i17 < hVar3.f13159d * 2; i17 += 2) {
                            c(recyclerView2, hVar3.f13158c[i17], j);
                        }
                        Trace.endSection();
                        vVar.f14048a = false;
                        vVar.f14049b = 0;
                        vVar.f14050c = 0;
                        vVar.f14051d = null;
                        vVar.f14052e = 0;
                    } catch (Throwable th) {
                        int i18 = p0.i.f10450a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            vVar.f14048a = false;
            vVar.f14049b = 0;
            vVar.f14050c = 0;
            vVar.f14051d = null;
            vVar.f14052e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f14053x;
        try {
            int i6 = p0.i.f10450a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j) + this.f14055z);
                }
            }
            this.f14054y = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.f14054y = 0L;
            int i11 = p0.i.f10450a;
            Trace.endSection();
            throw th;
        }
    }
}

package w4;

import android.view.View;
import android.view.ViewGroup;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q0 implements q1, w8.b {

    /* renamed from: x, reason: collision with root package name */
    public final Object f13989x;

    public /* synthetic */ q0(Object obj) {
        this.f13989x = obj;
    }

    @Override // w4.q1
    public int C(View view) {
        return view.getBottom() + ((t0) view.getLayoutParams()).f14021b.bottom + ((ViewGroup.MarginLayoutParams) ((t0) view.getLayoutParams())).bottomMargin;
    }

    public void a(y2.k kVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f13989x;
        long[] jArr = kVar.f14921e;
        if (jArr.length > 0 && !linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            linkedHashMap.put(Long.valueOf(kVar.f14921e[0]), kVar);
        }
    }

    @Override // w4.q1
    public int b(View view) {
        return (view.getTop() - ((t0) view.getLayoutParams()).f14021b.top) - ((ViewGroup.MarginLayoutParams) ((t0) view.getLayoutParams())).topMargin;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(lf.j r5, ne.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof x4.m
            if (r0 == 0) goto L13
            r0 = r6
            x4.m r0 = (x4.m) r0
            int r1 = r0.f14605z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14605z = r1
            goto L18
        L13:
            x4.m r0 = new x4.m
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f14603x
            int r1 = r0.f14605z
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L29:
            he.a.f(r6)
            a2.x0 r5 = new a2.x0
            r5.<init>()
            throw r5
        L32:
            he.a.f(r6)
            java.lang.Object r6 = r4.f13989x
            kf.f1 r6 = (kf.f1) r6
            r0.f14605z = r2
            r6.collect(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.q0.c(lf.j, ne.c):void");
    }

    @Override // w8.b
    public void d(int i6) {
        ((u8.c) this.f13989x).d(i6);
    }

    public void e(Set tableIds) {
        Object value;
        int[] iArr;
        int i6;
        kotlin.jvm.internal.k.e(tableIds, "tableIds");
        if (!tableIds.isEmpty()) {
            kf.f1 f1Var = (kf.f1) this.f13989x;
            do {
                value = f1Var.getValue();
                int[] iArr2 = (int[]) value;
                int length = iArr2.length;
                iArr = new int[length];
                for (int i10 = 0; i10 < length; i10++) {
                    if (tableIds.contains(Integer.valueOf(i10))) {
                        i6 = iArr2[i10] + 1;
                    } else {
                        i6 = iArr2[i10];
                    }
                    iArr[i10] = i6;
                }
            } while (!f1Var.f(value, iArr));
        }
    }

    public void f() {
        yf.h hVar = (yf.h) this.f13989x;
        hVar.getClass();
        yf.c cVar = yf.c.f15061c;
        byte[] array = hVar.f15070c.array();
        kotlin.jvm.internal.k.d(array, "array(...)");
        cVar.getClass();
        synchronized (cVar) {
            int i6 = cVar.f15063b;
            if (array.length + i6 < yf.b.f15060a) {
                cVar.f15063b = i6 + (array.length / 2);
                cVar.f15062a.addLast(array);
            }
        }
    }

    @Override // w4.q1
    public int h() {
        return ((s0) this.f13989x).G();
    }

    @Override // w4.q1
    public int n() {
        s0 s0Var = (s0) this.f13989x;
        return s0Var.f14017o - s0Var.D();
    }

    @Override // w8.b
    public void onConnected() {
        ((u8.c) this.f13989x).onConnected();
    }

    @Override // w4.q1
    public View s(int i6) {
        return ((s0) this.f13989x).u(i6);
    }

    public q0() {
        this.f13989x = new LinkedHashMap();
    }

    public q0(InputStream stream) {
        kotlin.jvm.internal.k.e(stream, "stream");
        this.f13989x = new yf.h(stream, df.a.f4115a);
    }

    public q0(int i6) {
        this.f13989x = kf.y0.c(new int[i6]);
    }
}

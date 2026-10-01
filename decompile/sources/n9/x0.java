package n9;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x0 implements Runnable {
    public final String A;
    public final Map B;
    public final Object C;
    public final /* synthetic */ e3.e D;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9523x = 1;

    /* renamed from: y, reason: collision with root package name */
    public final URL f9524y;

    /* renamed from: z, reason: collision with root package name */
    public final byte[] f9525z;

    public x0(y0 y0Var, String str, URL url, byte[] bArr, Map map, w0 w0Var) {
        Objects.requireNonNull(y0Var);
        this.D = y0Var;
        w8.x.d(str);
        w8.x.g(url);
        this.f9524y = url;
        this.f9525z = bArr;
        this.C = w0Var;
        this.A = str;
        this.B = map;
    }

    public void a(int i6, IOException iOException, byte[] bArr, Map map) {
        l1 l1Var = ((n1) ((q2) this.D).f4301y).D;
        n1.g(l1Var);
        l1Var.m1(new p2(this, i6, iOException, bArr, map));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0285: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:646), block:B:178:0x0283 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0288: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:649), block:B:175:0x0287 */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v23, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v32, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.x0.run():void");
    }

    public x0(q2 q2Var, String str, URL url, byte[] bArr, HashMap hashMap, o2 o2Var) {
        Objects.requireNonNull(q2Var);
        this.D = q2Var;
        w8.x.d(str);
        this.f9524y = url;
        this.f9525z = bArr;
        this.C = o2Var;
        this.A = str;
        this.B = hashMap;
    }
}

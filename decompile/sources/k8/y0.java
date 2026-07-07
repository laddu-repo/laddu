package k8;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements Runnable {
    public final Object A;
    public final /* synthetic */ c3.e B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7846v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final URL f7847w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final byte[] f7848x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f7849y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Map f7850z;

    public y0(z0 z0Var, String str, URL url, byte[] bArr, Map map, x0 x0Var) {
        Objects.requireNonNull(z0Var);
        this.B = z0Var;
        t7.y.d(str);
        t7.y.g(url);
        this.f7847w = url;
        this.f7848x = bArr;
        this.A = x0Var;
        this.f7849y = str;
        this.f7850z = map;
    }

    public void a(int i, IOException iOException, byte[] bArr, Map map) {
        n1 n1Var = ((p1) ((y2) this.B).f2053w).B;
        p1.l(n1Var);
        n1Var.M(new x2(this, i, iOException, bArr, map));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0285: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:646), block:B:141:0x0283 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0288: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:649), block:B:142:0x0287 */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0176  */
    /* JADX WARN: Type inference failed for: r14v0, types: [k8.y0] */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.y0.run():void");
    }

    public y0(y2 y2Var, String str, URL url, byte[] bArr, HashMap map, w2 w2Var) {
        Objects.requireNonNull(y2Var);
        this.B = y2Var;
        t7.y.d(str);
        this.f7847w = url;
        this.f7848x = bArr;
        this.A = w2Var;
        this.f7849y = str;
        this.f7850z = map;
    }
}

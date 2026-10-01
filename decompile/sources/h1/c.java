package h1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f5822a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5823b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5824c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f5825d;

    public c(byte[] bArr, int i6, int i10) {
        this(-1L, bArr, i6, i10);
    }

    public static c a(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.E[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new c(wrap.array(), 4, 1);
    }

    public static c b(e eVar, ByteOrder byteOrder) {
        e[] eVarArr = {eVar};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.E[5]]);
        wrap.order(byteOrder);
        e eVar2 = eVarArr[0];
        wrap.putInt((int) eVar2.f5830a);
        wrap.putInt((int) eVar2.f5831b);
        return new c(wrap.array(), 5, 1);
    }

    public static c c(int i6, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.E[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i6}[0]);
        return new c(wrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) {
        Object g10 = g(byteOrder);
        if (g10 != null) {
            if (g10 instanceof String) {
                return Double.parseDouble((String) g10);
            }
            if (g10 instanceof long[]) {
                if (((long[]) g10).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (g10 instanceof int[]) {
                if (((int[]) g10).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (g10 instanceof double[]) {
                double[] dArr = (double[]) g10;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (g10 instanceof e[]) {
                e[] eVarArr = (e[]) g10;
                if (eVarArr.length == 1) {
                    e eVar = eVarArr[0];
                    return eVar.f5830a / eVar.f5831b;
                }
                throw new NumberFormatException("There are more than one component");
            }
            throw new NumberFormatException("Couldn't find a double value");
        }
        throw new NumberFormatException("NULL can't be converted to a double value");
    }

    public final int e(ByteOrder byteOrder) {
        Object g10 = g(byteOrder);
        if (g10 != null) {
            if (g10 instanceof String) {
                return Integer.parseInt((String) g10);
            }
            if (g10 instanceof long[]) {
                long[] jArr = (long[]) g10;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (g10 instanceof int[]) {
                int[] iArr = (int[]) g10;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            throw new NumberFormatException("Couldn't find a integer value");
        }
        throw new NumberFormatException("NULL can't be converted to a integer value");
    }

    public final String f(ByteOrder byteOrder) {
        Object g10 = g(byteOrder);
        if (g10 != null) {
            if (g10 instanceof String) {
                return (String) g10;
            }
            StringBuilder sb2 = new StringBuilder();
            int i6 = 0;
            if (g10 instanceof long[]) {
                long[] jArr = (long[]) g10;
                while (i6 < jArr.length) {
                    sb2.append(jArr[i6]);
                    i6++;
                    if (i6 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (g10 instanceof int[]) {
                int[] iArr = (int[]) g10;
                while (i6 < iArr.length) {
                    sb2.append(iArr[i6]);
                    i6++;
                    if (i6 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (g10 instanceof double[]) {
                double[] dArr = (double[]) g10;
                while (i6 < dArr.length) {
                    sb2.append(dArr[i6]);
                    i6++;
                    if (i6 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (g10 instanceof e[]) {
                e[] eVarArr = (e[]) g10;
                while (i6 < eVarArr.length) {
                    sb2.append(eVarArr[i6].f5830a);
                    sb2.append('/');
                    sb2.append(eVarArr[i6].f5831b);
                    i6++;
                    if (i6 != eVarArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:100:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v23, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v24, types: [long[]] */
    /* JADX WARN: Type inference failed for: r14v25, types: [h1.e[]] */
    /* JADX WARN: Type inference failed for: r14v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v27, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v28, types: [h1.e[]] */
    /* JADX WARN: Type inference failed for: r14v29, types: [double[]] */
    /* JADX WARN: Type inference failed for: r14v30, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v31, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable g(java.nio.ByteOrder r14) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.c.g(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(g.D[this.f5822a]);
        sb2.append(", data length:");
        return r4.a.l(sb2, this.f5825d.length, ")");
    }

    public c(long j, byte[] bArr, int i6, int i10) {
        this.f5822a = i6;
        this.f5823b = i10;
        this.f5824c = j;
        this.f5825d = bArr;
    }
}

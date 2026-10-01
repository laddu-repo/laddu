package m7;

import j1.f0;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a implements Closeable {
    public static final String[] B = new String[128];
    public int[] A;

    /* renamed from: x, reason: collision with root package name */
    public int f8700x;

    /* renamed from: y, reason: collision with root package name */
    public int[] f8701y;

    /* renamed from: z, reason: collision with root package name */
    public String[] f8702z;

    static {
        for (int i6 = 0; i6 <= 31; i6++) {
            B[i6] = String.format("\\u%04x", Integer.valueOf(i6));
        }
        String[] strArr = B;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract boolean K();

    public abstract boolean Q();

    public abstract double S();

    public abstract int a0();

    public abstract String b0();

    public abstract void d();

    public abstract void f();

    public abstract int f0();

    public final void g0(int i6) {
        int i10 = this.f8700x;
        int[] iArr = this.f8701y;
        if (i10 == iArr.length) {
            if (i10 != 256) {
                this.f8701y = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f8702z;
                this.f8702z = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.A;
                this.A = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new RuntimeException("Nesting too deep at " + y());
            }
        }
        int[] iArr3 = this.f8701y;
        int i11 = this.f8700x;
        this.f8700x = i11 + 1;
        iArr3[i11] = i6;
    }

    public abstract int h0(f0 f0Var);

    public abstract void i0();

    public abstract void j0();

    public final void k0(String str) {
        throw new IOException(str + " at path " + y());
    }

    public abstract void l();

    public abstract void m();

    public final String y() {
        int i6 = this.f8700x;
        int[] iArr = this.f8701y;
        String[] strArr = this.f8702z;
        int[] iArr2 = this.A;
        StringBuilder sb2 = new StringBuilder("$");
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = iArr[i10];
            if (i11 != 1 && i11 != 2) {
                if (i11 == 3 || i11 == 4 || i11 == 5) {
                    sb2.append('.');
                    String str = strArr[i10];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            } else {
                sb2.append('[');
                sb2.append(iArr2[i10]);
                sb2.append(']');
            }
        }
        return sb2.toString();
    }
}

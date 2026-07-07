package a5;

import android.database.Cursor;
import java.util.Arrays;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends h {
    public int[] A;
    public long[] B;
    public double[] C;
    public String[] D;
    public byte[][] E;
    public Cursor F;

    public static void m(Cursor cursor, int i6) {
        if (i6 >= 0 && i6 < cursor.getColumnCount()) {
            return;
        }
        a8.d.m(25, "column index out of range");
        throw null;
    }

    @Override // g5.c
    public final String M(int i6) {
        d();
        Cursor cursor = this.F;
        if (cursor != null) {
            m(cursor, i6);
            String string = cursor.getString(i6);
            k.d(string, "getString(...)");
            return string;
        }
        a8.d.m(21, "no row");
        throw null;
    }

    @Override // g5.c
    public final boolean X() {
        d();
        l();
        Cursor cursor = this.F;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // g5.c
    public final void b(int i6, long j) {
        d();
        f(1, i6);
        this.A[i6] = 1;
        this.B[i6] = j;
    }

    @Override // g5.c
    public final void c(int i6) {
        d();
        f(5, i6);
        this.A[i6] = 5;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f578z) {
            d();
            this.A = new int[0];
            this.B = new long[0];
            this.C = new double[0];
            this.D = new String[0];
            this.E = new byte[0];
            reset();
        }
        this.f578z = true;
    }

    public final void f(int i6, int i10) {
        int i11 = i10 + 1;
        int[] iArr = this.A;
        if (iArr.length < i11) {
            int[] copyOf = Arrays.copyOf(iArr, i11);
            k.d(copyOf, "copyOf(...)");
            this.A = copyOf;
        }
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 == 4) {
                        byte[][] bArr = this.E;
                        if (bArr.length < i11) {
                            Object[] copyOf2 = Arrays.copyOf(bArr, i11);
                            k.d(copyOf2, "copyOf(...)");
                            this.E = (byte[][]) copyOf2;
                            return;
                        }
                        return;
                    }
                    return;
                }
                String[] strArr = this.D;
                if (strArr.length < i11) {
                    Object[] copyOf3 = Arrays.copyOf(strArr, i11);
                    k.d(copyOf3, "copyOf(...)");
                    this.D = (String[]) copyOf3;
                    return;
                }
                return;
            }
            double[] dArr = this.C;
            if (dArr.length < i11) {
                double[] copyOf4 = Arrays.copyOf(dArr, i11);
                k.d(copyOf4, "copyOf(...)");
                this.C = copyOf4;
                return;
            }
            return;
        }
        long[] jArr = this.B;
        if (jArr.length < i11) {
            long[] copyOf5 = Arrays.copyOf(jArr, i11);
            k.d(copyOf5, "copyOf(...)");
            this.B = copyOf5;
        }
    }

    @Override // g5.c
    public final int getColumnCount() {
        d();
        l();
        Cursor cursor = this.F;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // g5.c
    public final String getColumnName(int i6) {
        d();
        l();
        Cursor cursor = this.F;
        if (cursor != null) {
            m(cursor, i6);
            String columnName = cursor.getColumnName(i6);
            k.d(columnName, "getColumnName(...)");
            return columnName;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // g5.c
    public final long getLong(int i6) {
        d();
        Cursor cursor = this.F;
        if (cursor != null) {
            m(cursor, i6);
            return cursor.getLong(i6);
        }
        a8.d.m(21, "no row");
        throw null;
    }

    @Override // g5.c
    public final boolean isNull(int i6) {
        d();
        Cursor cursor = this.F;
        if (cursor != null) {
            m(cursor, i6);
            return cursor.isNull(i6);
        }
        a8.d.m(21, "no row");
        throw null;
    }

    public final void l() {
        if (this.F == null) {
            this.F = this.f576x.E(new k7.d(this, 1));
        }
    }

    @Override // g5.c
    public final void reset() {
        d();
        Cursor cursor = this.F;
        if (cursor != null) {
            cursor.close();
        }
        this.F = null;
    }

    @Override // g5.c
    public final void v(int i6, String value) {
        k.e(value, "value");
        d();
        f(3, i6);
        this.A[i6] = 3;
        this.D[i6] = value;
    }
}

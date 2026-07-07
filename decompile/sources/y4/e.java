package y4;

import android.database.Cursor;
import de.i;
import java.util.Arrays;
import k8.g2;
import p4.v;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e extends f {
    public double[] A;
    public String[] B;
    public byte[][] C;
    public Cursor D;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int[] f14454y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long[] f14455z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(w4.a aVar, String str) {
        super(aVar, str);
        i.e(aVar, "db");
        i.e(str, "sql");
        this.f14454y = new int[0];
        this.f14455z = new long[0];
        this.A = new double[0];
        this.B = new String[0];
        this.C = new byte[0][];
    }

    public static void m(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            v.P(25, "column index out of range");
            throw null;
        }
    }

    @Override // v4.c
    public final void K(int i, String str) {
        i.e(str, "value");
        a();
        i(3, i);
        this.f14454y[i] = 3;
        this.B[i] = str;
    }

    @Override // v4.c
    public final boolean Z() {
        a();
        l();
        Cursor cursor = this.D;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f14458x) {
            h();
            reset();
        }
        this.f14458x = true;
    }

    @Override // v4.c
    public final void e(int i) {
        a();
        i(5, i);
        this.f14454y[i] = 5;
    }

    @Override // v4.c
    public final int getColumnCount() {
        a();
        l();
        Cursor cursor = this.D;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // v4.c
    public final String getColumnName(int i) {
        a();
        l();
        Cursor cursor = this.D;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        m(cursor, i);
        String columnName = cursor.getColumnName(i);
        i.d(columnName, "getColumnName(...)");
        return columnName;
    }

    @Override // v4.c
    public final long getLong(int i) {
        a();
        Cursor cursor = this.D;
        if (cursor != null) {
            m(cursor, i);
            return cursor.getLong(i);
        }
        v.P(21, "no row");
        throw null;
    }

    @Override // y4.f, v4.c
    public final void h() {
        a();
        this.f14454y = new int[0];
        this.f14455z = new long[0];
        this.A = new double[0];
        this.B = new String[0];
        this.C = new byte[0][];
    }

    public final void i(int i, int i10) {
        int i11 = i10 + 1;
        int[] iArr = this.f14454y;
        if (iArr.length < i11) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i11);
            i.d(iArrCopyOf, "copyOf(...)");
            this.f14454y = iArrCopyOf;
        }
        if (i == 1) {
            long[] jArr = this.f14455z;
            if (jArr.length < i11) {
                long[] jArrCopyOf = Arrays.copyOf(jArr, i11);
                i.d(jArrCopyOf, "copyOf(...)");
                this.f14455z = jArrCopyOf;
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.A;
            if (dArr.length < i11) {
                double[] dArrCopyOf = Arrays.copyOf(dArr, i11);
                i.d(dArrCopyOf, "copyOf(...)");
                this.A = dArrCopyOf;
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.B;
            if (strArr.length < i11) {
                Object[] objArrCopyOf = Arrays.copyOf(strArr, i11);
                i.d(objArrCopyOf, "copyOf(...)");
                this.B = (String[]) objArrCopyOf;
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.C;
        if (bArr.length < i11) {
            Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i11);
            i.d(objArrCopyOf2, "copyOf(...)");
            this.C = (byte[][]) objArrCopyOf2;
        }
    }

    @Override // v4.c
    public final boolean isNull(int i) {
        a();
        Cursor cursor = this.D;
        if (cursor != null) {
            m(cursor, i);
            return cursor.isNull(i);
        }
        v.P(21, "no row");
        throw null;
    }

    public final void l() {
        if (this.D == null) {
            this.D = this.f14456v.l0(new g2(29, this));
        }
    }

    @Override // v4.c
    public final String n(int i) {
        a();
        Cursor cursor = this.D;
        if (cursor == null) {
            v.P(21, "no row");
            throw null;
        }
        m(cursor, i);
        String string = cursor.getString(i);
        i.d(string, "getString(...)");
        return string;
    }

    @Override // v4.c
    public final void o(long j8) {
        a();
        i(1, 1);
        this.f14454y[1] = 1;
        this.f14455z[1] = j8;
    }

    @Override // y4.f, v4.c
    public final void reset() {
        a();
        Cursor cursor = this.D;
        if (cursor != null) {
            cursor.close();
        }
        this.D = null;
    }
}

package androidx.datastore.preferences.protobuf;

import androidx.media3.decoder.DecoderInputBuffer;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class g implements Iterable, Serializable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final g f765x = new g(x.f871b);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final e f766y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f767v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final byte[] f768w;

    static {
        f766y = c.a() ? new e(1) : new e(0);
    }

    public g(byte[] bArr) {
        bArr.getClass();
        this.f768w = bArr;
    }

    public static int b(int i, int i10, int i11) {
        int i12 = i10 - i;
        if ((i | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(d0.d.i(i, "Beginning index: ", " < 0"));
        }
        if (i10 < i) {
            throw new IndexOutOfBoundsException(j4.a.k(i, i10, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(j4.a.k(i10, i11, "End index: ", " >= "));
    }

    public static g c(byte[] bArr, int i, int i10) {
        byte[] bArrCopyOfRange;
        b(i, i + i10, bArr.length);
        switch (f766y.f757a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i10 + i);
                break;
            default:
                bArrCopyOfRange = new byte[i10];
                System.arraycopy(bArr, i, bArrCopyOfRange, 0, i10);
                break;
        }
        return new g(bArrCopyOfRange);
    }

    public byte a(int i) {
        return this.f768w[i];
    }

    public void d(int i, byte[] bArr) {
        System.arraycopy(this.f768w, 0, bArr, 0, i);
    }

    public int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g) || size() != ((g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof g)) {
            return obj.equals(this);
        }
        g gVar = (g) obj;
        int i = this.f767v;
        int i10 = gVar.f767v;
        if (i != 0 && i10 != 0 && i != i10) {
            return false;
        }
        int size = size();
        if (size > gVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > gVar.size()) {
            StringBuilder sbO = d0.d.o(size, "Ran off end of other: 0, ", ", ");
            sbO.append(gVar.size());
            throw new IllegalArgumentException(sbO.toString());
        }
        byte[] bArr = gVar.f768w;
        int iE = e() + size;
        int iE2 = e();
        int iE3 = gVar.e();
        while (iE2 < iE) {
            if (this.f768w[iE2] != bArr[iE3]) {
                return false;
            }
            iE2++;
            iE3++;
        }
        return true;
    }

    public byte f(int i) {
        return this.f768w[i];
    }

    public final int hashCode() {
        int i = this.f767v;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iE = e();
        int i10 = size;
        for (int i11 = iE; i11 < iE + size; i11++) {
            i10 = (i10 * 31) + this.f768w[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.f767v = i10;
        return i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d(this);
    }

    public int size() {
        return this.f768w.length;
    }

    public final String toString() {
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = com.bumptech.glide.d.j(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int iB = b(0, 47, size());
            sb2.append(com.bumptech.glide.d.j(iB == 0 ? f765x : new f(this.f768w, e(), iB)));
            sb2.append("...");
            string = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return j4.a.n(sb3, string, "\">");
    }
}

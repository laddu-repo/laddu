package df;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g implements Iterator, we.a {
    public int A;
    public int B;

    /* renamed from: x, reason: collision with root package name */
    public final CharSequence f4131x;

    /* renamed from: y, reason: collision with root package name */
    public int f4132y;

    /* renamed from: z, reason: collision with root package name */
    public int f4133z;

    public g(CharSequence string) {
        kotlin.jvm.internal.k.e(string, "string");
        this.f4131x = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i6;
        int i10 = this.f4132y;
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            return true;
        }
        int i11 = 2;
        if (this.B < 0) {
            this.f4132y = 2;
            return false;
        }
        CharSequence charSequence = this.f4131x;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i12 = this.f4133z; i12 < length2; i12++) {
            char charAt = charSequence.charAt(i12);
            if (charAt == '\n' || charAt == '\r') {
                if (charAt != '\r' || (i6 = i12 + 1) >= charSequence.length() || charSequence.charAt(i6) != '\n') {
                    i11 = 1;
                }
                length = i12;
                this.f4132y = 1;
                this.B = i11;
                this.A = length;
                return true;
            }
        }
        i11 = -1;
        this.f4132y = 1;
        this.B = i11;
        this.A = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f4132y = 0;
            int i6 = this.A;
            int i10 = this.f4133z;
            this.f4133z = this.B + i6;
            return this.f4131x.subSequence(i10, i6).toString();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

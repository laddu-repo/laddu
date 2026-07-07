package cb;

import a2.a2;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k implements Iterator {
    public final b A;
    public int C;
    public final /* synthetic */ a2 D;

    /* renamed from: y, reason: collision with root package name */
    public String f2010y;

    /* renamed from: z, reason: collision with root package name */
    public final CharSequence f2011z;

    /* renamed from: x, reason: collision with root package name */
    public int f2009x = 2;
    public int B = 0;

    public k(a2 a2Var, b2.k kVar, CharSequence charSequence) {
        this.D = a2Var;
        this.A = (b) kVar.f1384z;
        this.C = kVar.f1383y;
        this.f2011z = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        b bVar;
        int i6 = this.f2009x;
        if (i6 != 4) {
            int c10 = y.e.c(i6);
            if (c10 == 0) {
                return true;
            }
            if (c10 != 2) {
                this.f2009x = 4;
                int i10 = this.B;
                while (true) {
                    int i11 = this.B;
                    if (i11 != -1) {
                        c cVar = (c) this.D.f162y;
                        CharSequence charSequence = this.f2011z;
                        int length = charSequence.length();
                        jb.b.g(i11, length);
                        while (true) {
                            if (i11 < length) {
                                if (cVar.a(charSequence.charAt(i11))) {
                                    break;
                                }
                                i11++;
                            } else {
                                i11 = -1;
                                break;
                            }
                        }
                        if (i11 == -1) {
                            i11 = charSequence.length();
                            this.B = -1;
                        } else {
                            this.B = i11 + 1;
                        }
                        int i12 = this.B;
                        if (i12 == i10) {
                            int i13 = i12 + 1;
                            this.B = i13;
                            if (i13 > charSequence.length()) {
                                this.B = -1;
                            }
                        } else {
                            while (true) {
                                bVar = this.A;
                                if (i10 >= i11 || !bVar.a(charSequence.charAt(i10))) {
                                    break;
                                }
                                i10++;
                            }
                            while (i11 > i10 && bVar.a(charSequence.charAt(i11 - 1))) {
                                i11--;
                            }
                            int i14 = this.C;
                            if (i14 == 1) {
                                i11 = charSequence.length();
                                this.B = -1;
                                while (i11 > i10 && bVar.a(charSequence.charAt(i11 - 1))) {
                                    i11--;
                                }
                            } else {
                                this.C = i14 - 1;
                            }
                            str = charSequence.subSequence(i10, i11).toString();
                        }
                    } else {
                        this.f2009x = 3;
                        str = null;
                        break;
                    }
                }
                this.f2010y = str;
                if (this.f2009x != 3) {
                    this.f2009x = 1;
                    return true;
                }
                return false;
            }
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f2009x = 2;
            String str = this.f2010y;
            this.f2010y = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

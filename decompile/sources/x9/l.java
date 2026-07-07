package x9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p4.v;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Iterator {
    public int B;
    public final /* synthetic */ c C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f14295w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CharSequence f14296x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b f14297y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f14298z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14294v = 2;
    public int A = 0;

    public l(p9.d dVar, CharSequence charSequence, c cVar) {
        this.C = cVar;
        this.f14297y = (b) dVar.f10440d;
        this.f14298z = dVar.f10439c;
        this.B = dVar.f10438b;
        this.f14296x = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int length;
        String string;
        CharSequence charSequence;
        b bVar;
        v.r(this.f14294v != 4);
        int iC = y.e.c(this.f14294v);
        if (iC == 0) {
            return true;
        }
        if (iC != 2) {
            this.f14294v = 4;
            int i = this.A;
            while (true) {
                length = this.A;
                if (length == -1) {
                    this.f14294v = 3;
                    string = null;
                    break;
                }
                CharSequence charSequence2 = this.f14296x;
                int length2 = charSequence2.length();
                v.o(length, length2);
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (this.C.a(charSequence2.charAt(length))) {
                        break;
                    }
                    length++;
                }
                charSequence = this.f14296x;
                if (length == -1) {
                    length = charSequence.length();
                    this.A = -1;
                } else {
                    this.A = length + 1;
                }
                int i10 = this.A;
                if (i10 == i) {
                    int i11 = i10 + 1;
                    this.A = i11;
                    if (i11 > charSequence.length()) {
                        this.A = -1;
                    }
                } else {
                    while (true) {
                        bVar = this.f14297y;
                        if (i >= length || !bVar.a(charSequence.charAt(i))) {
                            break;
                        }
                        i++;
                    }
                    while (length > i && bVar.a(charSequence.charAt(length - 1))) {
                        length--;
                    }
                    if (!this.f14298z || i != length) {
                        break;
                    }
                    i = this.A;
                }
            }
            int i12 = this.B;
            if (i12 == 1) {
                length = charSequence.length();
                this.A = -1;
                while (length > i && bVar.a(charSequence.charAt(length - 1))) {
                    length--;
                }
            } else {
                this.B = i12 - 1;
            }
            string = charSequence.subSequence(i, length).toString();
            this.f14295w = string;
            if (this.f14294v != 3) {
                this.f14294v = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f14294v = 2;
        String str = this.f14295w;
        this.f14295w = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

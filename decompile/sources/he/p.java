package he;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class p implements Iterator, we.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6090x;

    /* renamed from: y, reason: collision with root package name */
    public int f6091y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f6092z;

    public /* synthetic */ p(Object obj, int i6) {
        this.f6090x = i6;
        this.f6092z = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f6090x) {
            case 0:
                if (this.f6091y < ((byte[]) this.f6092z).length) {
                    return true;
                }
                return false;
            case 1:
                if (this.f6091y < ((int[]) this.f6092z).length) {
                    return true;
                }
                return false;
            case 2:
                if (this.f6091y < ((long[]) this.f6092z).length) {
                    return true;
                }
                return false;
            case 3:
                if (this.f6091y < ((short[]) this.f6092z).length) {
                    return true;
                }
                return false;
            case 4:
                if (this.f6091y < ((ie.d) this.f6092z).a()) {
                    return true;
                }
                return false;
            case 5:
                if (this.f6091y < ((Object[]) this.f6092z).length) {
                    return true;
                }
                return false;
            case 6:
                if (this.f6091y < ((ViewGroup) this.f6092z).getChildCount()) {
                    return true;
                }
                return false;
            case 7:
                if (this.f6091y > 0) {
                    return true;
                }
                return false;
            case 8:
                if (this.f6091y > 0) {
                    return true;
                }
                return false;
            default:
                if (this.f6091y < ((v.m) this.f6092z).f()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f6090x) {
            case 0:
                int i6 = this.f6091y;
                byte[] bArr = (byte[]) this.f6092z;
                if (i6 < bArr.length) {
                    this.f6091y = i6 + 1;
                    return new o(bArr[i6]);
                }
                throw new NoSuchElementException(String.valueOf(this.f6091y));
            case 1:
                int i10 = this.f6091y;
                int[] iArr = (int[]) this.f6092z;
                if (i10 < iArr.length) {
                    this.f6091y = i10 + 1;
                    return new r(iArr[i10]);
                }
                throw new NoSuchElementException(String.valueOf(this.f6091y));
            case 2:
                int i11 = this.f6091y;
                long[] jArr = (long[]) this.f6092z;
                if (i11 < jArr.length) {
                    this.f6091y = i11 + 1;
                    return new t(jArr[i11]);
                }
                throw new NoSuchElementException(String.valueOf(this.f6091y));
            case 3:
                int i12 = this.f6091y;
                short[] sArr = (short[]) this.f6092z;
                if (i12 < sArr.length) {
                    this.f6091y = i12 + 1;
                    return new w(sArr[i12]);
                }
                throw new NoSuchElementException(String.valueOf(this.f6091y));
            case 4:
                if (hasNext()) {
                    ie.d dVar = (ie.d) this.f6092z;
                    int i13 = this.f6091y;
                    this.f6091y = i13 + 1;
                    return dVar.get(i13);
                }
                throw new NoSuchElementException();
            case 5:
                try {
                    Object[] objArr = (Object[]) this.f6092z;
                    int i14 = this.f6091y;
                    this.f6091y = i14 + 1;
                    return objArr[i14];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f6091y--;
                    throw new NoSuchElementException(e10.getMessage());
                }
            case 6:
                ViewGroup viewGroup = (ViewGroup) this.f6092z;
                int i15 = this.f6091y;
                this.f6091y = i15 + 1;
                View childAt = viewGroup.getChildAt(i15);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 7:
                uf.g gVar = (uf.g) this.f6092z;
                int e11 = gVar.e();
                int i16 = this.f6091y;
                this.f6091y = i16 - 1;
                return gVar.h(e11 - i16);
            case 8:
                wf.u uVar = (wf.u) this.f6092z;
                int i17 = uVar.f14413c;
                int i18 = this.f6091y;
                this.f6091y = i18 - 1;
                return uVar.f14415e[i17 - i18];
            default:
                v.m mVar = (v.m) this.f6092z;
                int i19 = this.f6091y;
                this.f6091y = i19 + 1;
                return mVar.g(i19);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6090x) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                ViewGroup viewGroup = (ViewGroup) this.f6092z;
                int i6 = this.f6091y - 1;
                this.f6091y = i6;
                viewGroup.removeViewAt(i6);
                return;
            case 7:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 8:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public p(Object[] array) {
        this.f6090x = 5;
        kotlin.jvm.internal.k.e(array, "array");
        this.f6092z = array;
    }

    public p(uf.g gVar) {
        this.f6090x = 7;
        this.f6092z = gVar;
        this.f6091y = gVar.e();
    }

    public p(wf.u uVar) {
        this.f6090x = 8;
        this.f6092z = uVar;
        this.f6091y = uVar.f14413c;
    }
}

package a2;

import android.view.View;
import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f413a = 2;

    /* renamed from: b, reason: collision with root package name */
    public int f414b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f415c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f416d;

    /* renamed from: e, reason: collision with root package name */
    public int f417e;

    /* renamed from: f, reason: collision with root package name */
    public Object f418f;

    public t0(int i6) {
        this.f414b = i6;
        byte[] bArr = new byte[131];
        this.f418f = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i6, int i10) {
        if (!this.f415c) {
            return;
        }
        int i11 = i10 - i6;
        byte[] bArr2 = (byte[]) this.f418f;
        int length = bArr2.length;
        int i12 = this.f417e;
        if (length < i12 + i11) {
            this.f418f = Arrays.copyOf(bArr2, (i12 + i11) * 2);
        }
        System.arraycopy(bArr, i6, (byte[]) this.f418f, this.f417e, i11);
        this.f417e += i11;
    }

    public void b() {
        int m9;
        if (this.f415c) {
            m9 = ((e1.g) this.f418f).i();
        } else {
            m9 = ((e1.g) this.f418f).m();
        }
        this.f417e = m9;
    }

    public void c(View view, int i6) {
        int n10;
        if (this.f415c) {
            int d10 = ((e1.g) this.f418f).d(view);
            e1.g gVar = (e1.g) this.f418f;
            if (Integer.MIN_VALUE == gVar.f4157a) {
                n10 = 0;
            } else {
                n10 = gVar.n() - gVar.f4157a;
            }
            this.f417e = n10 + d10;
        } else {
            this.f417e = ((e1.g) this.f418f).g(view);
        }
        this.f414b = i6;
    }

    public void d(View view, int i6) {
        int n10;
        e1.g gVar = (e1.g) this.f418f;
        if (Integer.MIN_VALUE == gVar.f4157a) {
            n10 = 0;
        } else {
            n10 = gVar.n() - gVar.f4157a;
        }
        if (n10 >= 0) {
            c(view, i6);
            return;
        }
        this.f414b = i6;
        if (this.f415c) {
            int i10 = (((e1.g) this.f418f).i() - n10) - ((e1.g) this.f418f).d(view);
            this.f417e = ((e1.g) this.f418f).i() - i10;
            if (i10 > 0) {
                int e10 = this.f417e - ((e1.g) this.f418f).e(view);
                int m9 = ((e1.g) this.f418f).m();
                int min = e10 - (Math.min(((e1.g) this.f418f).g(view) - m9, 0) + m9);
                if (min < 0) {
                    this.f417e = Math.min(i10, -min) + this.f417e;
                    return;
                }
                return;
            }
            return;
        }
        int g10 = ((e1.g) this.f418f).g(view);
        int m10 = g10 - ((e1.g) this.f418f).m();
        this.f417e = g10;
        if (m10 > 0) {
            int i11 = (((e1.g) this.f418f).i() - Math.min(0, (((e1.g) this.f418f).i() - n10) - ((e1.g) this.f418f).d(view))) - (((e1.g) this.f418f).e(view) + g10);
            if (i11 < 0) {
                this.f417e -= Math.min(m10, -i11);
            }
        }
    }

    public boolean e(int i6) {
        if (!this.f415c) {
            return false;
        }
        this.f417e -= i6;
        this.f415c = false;
        this.f416d = true;
        return true;
    }

    public void f(int i6) {
        boolean z10;
        boolean z11 = this.f415c;
        if (i6 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f415c = z11 | z10;
        this.f414b += i6;
    }

    public void g() {
        switch (this.f413a) {
            case 1:
                this.f415c = false;
                this.f416d = false;
                return;
            default:
                this.f414b = -1;
                this.f417e = Integer.MIN_VALUE;
                this.f415c = false;
                this.f416d = false;
                return;
        }
    }

    public void h(int i6) {
        boolean z10 = true;
        u1.c.g(!this.f415c);
        if (i6 != this.f414b) {
            z10 = false;
        }
        this.f415c = z10;
        if (z10) {
            this.f417e = 3;
            this.f416d = false;
        }
    }

    public String toString() {
        switch (this.f413a) {
            case 2:
                return "AnchorInfo{mPosition=" + this.f414b + ", mCoordinate=" + this.f417e + ", mLayoutFromEnd=" + this.f415c + ", mValid=" + this.f416d + '}';
            default:
                return super.toString();
        }
    }

    public t0(s1 s1Var) {
        this.f418f = s1Var;
    }

    public t0() {
        g();
    }
}

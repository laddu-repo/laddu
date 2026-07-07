package t0;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d0 extends f1.c {
    public final /* synthetic */ int B;

    public d0(int i6, Class cls, int i10, int i11, int i12) {
        this.B = i12;
        this.f4630x = i6;
        this.A = cls;
        this.f4632z = i10;
        this.f4631y = i11;
    }

    @Override // f1.c
    public final Object c(View view) {
        switch (this.B) {
            case 0:
                return Boolean.valueOf(l0.c(view));
            case 1:
                return l0.a(view);
            case 2:
                return n0.b(view);
            default:
                return Boolean.valueOf(l0.b(view));
        }
    }

    @Override // f1.c
    public final void d(View view, Object obj) {
        switch (this.B) {
            case 0:
                l0.f(view, ((Boolean) obj).booleanValue());
                return;
            case 1:
                l0.e(view, (CharSequence) obj);
                return;
            case 2:
                n0.c(view, (CharSequence) obj);
                return;
            default:
                l0.d(view, ((Boolean) obj).booleanValue());
                return;
        }
    }

    @Override // f1.c
    public final boolean g(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        boolean equals;
        boolean z12;
        boolean z13;
        switch (this.B) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                boolean z14 = false;
                if (bool != null && bool.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (bool2 != null && bool2.booleanValue()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    z14 = true;
                }
                return !z14;
            case 1:
                equals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 2:
                equals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                boolean z15 = false;
                if (bool3 != null && bool3.booleanValue()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (bool4 != null && bool4.booleanValue()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12 == z13) {
                    z15 = true;
                }
                return !z15;
        }
        return !equals;
    }
}

package e1;

import android.text.TextUtils;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p implements o {

    /* renamed from: x, reason: collision with root package name */
    public final String f4173x;

    public p(String str, int i6) {
        switch (i6) {
            case 1:
                this.f4173x = r4.a.k("UnityScar", str);
                return;
            default:
                this.f4173x = str;
                return;
        }
    }

    @Override // e1.o
    public boolean c(CharSequence charSequence, int i6, int i10, w wVar) {
        if (TextUtils.equals(charSequence.subSequence(i6, i10), this.f4173x)) {
            wVar.f4198c = (wVar.f4198c & 3) | 4;
            return false;
        }
        return true;
    }

    @Override // e1.o
    public Object getResult() {
        return this;
    }
}

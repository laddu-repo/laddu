package za;

import android.text.Editable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends ma.m {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f15263x;

    public j(l lVar) {
        this.f15263x = lVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f15263x.b().a();
    }

    @Override // ma.m, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        this.f15263x.b().b();
    }
}

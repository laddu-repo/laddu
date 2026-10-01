package t9;

import android.text.Editable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l extends i9.l {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n f12458v;

    public l(n nVar) {
        this.f12458v = nVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f12458v.b().a();
    }

    @Override // i9.l, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        this.f12458v.b().b();
    }
}

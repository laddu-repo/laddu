package androidx.emoji2.text;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class t implements s {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f929v;

    @Override // androidx.emoji2.text.s
    public boolean i(CharSequence charSequence, int i, int i10, b0 b0Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i10), this.f929v)) {
            return true;
        }
        b0Var.f891c = (b0Var.f891c & 3) | 4;
        return false;
    }

    @Override // androidx.emoji2.text.s
    public Object g() {
        return this;
    }
}

package m;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import n.a0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f8375b;

    public e(Context context, a aVar) {
        this.f8374a = context;
        this.f8375b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f8375b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f8375b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new a0(this.f8374a, this.f8375b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f8375b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f8375b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f8375b.f8364v;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f8375b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f8375b.f8365w;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f8375b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f8375b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f8375b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f8375b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f8375b.f8364v = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f8375b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f8375b.n(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f8375b.j(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f8375b.l(i);
    }
}

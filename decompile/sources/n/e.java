package n;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import o.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8899a;

    /* renamed from: b, reason: collision with root package name */
    public final a f8900b;

    public e(Context context, a aVar) {
        this.f8899a = context;
        this.f8900b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f8900b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f8900b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new a0(this.f8899a, this.f8900b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f8900b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f8900b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f8900b.f8890x;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f8900b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f8900b.f8891y;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f8900b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f8900b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f8900b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f8900b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f8900b.f8890x = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f8900b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z10) {
        this.f8900b.o(z10);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i6) {
        this.f8900b.j(i6);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i6) {
        this.f8900b.l(i6);
    }
}

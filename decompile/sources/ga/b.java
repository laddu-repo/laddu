package ga;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.Window;
import i.g;
import i.h;
import ua.i;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: c, reason: collision with root package name */
    public final i f5568c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f5569d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(android.content.Context r13, int r14) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.b.<init>(android.content.Context, int):void");
    }

    public final void a(int i6, DialogInterface.OnClickListener onClickListener) {
    }

    public final void b(int i6, DialogInterface.OnClickListener onClickListener) {
    }

    public final void c(String str) {
    }

    @Override // i.g
    public final h create() {
        h create = super.create();
        Window window = create.getWindow();
        View decorView = window.getDecorView();
        i iVar = this.f5568c;
        if (iVar != null) {
            iVar.p(decorView.getElevation());
        }
        Rect rect = this.f5569d;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) iVar, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new a(create, rect));
        return create;
    }

    @Override // i.g
    public final g setNegativeButton(int i6, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setNegativeButton(i6, onClickListener);
    }

    @Override // i.g
    public final g setPositiveButton(int i6, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setPositiveButton(i6, onClickListener);
    }

    @Override // i.g
    public final g setTitle(CharSequence charSequence) {
        return (b) super.setTitle(charSequence);
    }

    @Override // i.g
    public final g setView(View view) {
        return (b) super.setView(view);
    }
}

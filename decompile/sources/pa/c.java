package pa;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public p5.b f10627a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10628b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f10629c;

    public /* synthetic */ c(View view, int i6) {
        this.f10628b = i6;
        this.f10629c = view;
    }

    public final void a(Drawable drawable) {
        switch (this.f10628b) {
            case 0:
                d dVar = (d) this.f10629c;
                dVar.setIndeterminate(false);
                dVar.c(dVar.f10631y);
                return;
            case 1:
                d dVar2 = (d) this.f10629c;
                if (!dVar2.C) {
                    dVar2.setVisibility(dVar2.D);
                    return;
                }
                return;
            default:
                ColorStateList colorStateList = ((da.b) this.f10629c).L;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                    return;
                }
                return;
        }
    }

    public void b(Drawable drawable) {
        switch (this.f10628b) {
            case 2:
                da.b bVar = (da.b) this.f10629c;
                ColorStateList colorStateList = bVar.L;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(bVar.P, colorStateList.getDefaultColor()));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void c(Drawable drawable) {
    }
}

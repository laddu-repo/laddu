package ka;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7748a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7749b;

    public a(b bVar) {
        this.f7749b = bVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f7748a) {
            case 1:
                return ((Drawable.ConstantState) this.f7749b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f7748a) {
            case 0:
                return 0;
            default:
                return ((Drawable.ConstantState) this.f7749b).getChangingConfigurations();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f7748a) {
            case 0:
                return (b) this.f7749b;
            default:
                p5.e eVar = new p5.e(null, 0);
                Drawable newDrawable = ((Drawable.ConstantState) this.f7749b).newDrawable();
                eVar.f10532x = newDrawable;
                newDrawable.setCallback(eVar.C);
                return eVar;
        }
    }

    public a(Drawable.ConstantState constantState) {
        this.f7749b = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.f7748a) {
            case 1:
                p5.e eVar = new p5.e(null, 0);
                Drawable newDrawable = ((Drawable.ConstantState) this.f7749b).newDrawable(resources);
                eVar.f10532x = newDrawable;
                newDrawable.setCallback(eVar.C);
                return eVar;
            default:
                return super.newDrawable(resources);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f7748a) {
            case 1:
                p5.e eVar = new p5.e(null, 0);
                Drawable newDrawable = ((Drawable.ConstantState) this.f7749b).newDrawable(resources, theme);
                eVar.f10532x = newDrawable;
                newDrawable.setCallback(eVar.C);
                return eVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}

package f5;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class e extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5232b;

    public /* synthetic */ e(int i, Object obj) {
        this.f5231a = i;
        this.f5232b = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f5231a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return ((Drawable.ConstantState) this.f5232b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f5231a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return ((Drawable.ConstantState) this.f5232b).getChangingConfigurations();
            case 1:
                return 0;
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f5231a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                f fVar = new f(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f5232b).newDrawable();
                fVar.f5240v = drawableNewDrawable;
                drawableNewDrawable.setCallback(fVar.A);
                return fVar;
            case 1:
                return (g9.a) this.f5232b;
            default:
                return new n6.b(this);
        }
    }

    public e(g9.a aVar) {
        this.f5231a = 1;
        this.f5232b = aVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.f5231a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                f fVar = new f(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f5232b).newDrawable(resources);
                fVar.f5240v = drawableNewDrawable;
                drawableNewDrawable.setCallback(fVar.A);
                return fVar;
            case 1:
            default:
                return super.newDrawable(resources);
            case 2:
                return new n6.b(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f5231a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                f fVar = new f(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f5232b).newDrawable(resources, theme);
                fVar.f5240v = drawableNewDrawable;
                drawableNewDrawable.setCallback(fVar.A);
                return fVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}

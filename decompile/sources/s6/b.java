package s6;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.media3.decoder.DecoderInputBuffer;
import com.bumptech.glide.i;
import java.util.ArrayList;
import r6.h;
import v6.f;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f11494z = i.glide_custom_view_target_tag;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f11495v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f11496w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Animatable f11497x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f11498y;

    public b(ImageView imageView, int i) {
        this.f11498y = i;
        f.c(imageView, "Argument must not be null");
        this.f11495v = imageView;
        this.f11496w = new e(imageView);
    }

    @Override // s6.d
    public final void a(Object obj) {
        f(obj);
        if (!(obj instanceof Animatable)) {
            this.f11497x = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f11497x = animatable;
        animatable.start();
    }

    @Override // s6.d
    public final void b(Drawable drawable) {
        f(null);
        this.f11497x = null;
        this.f11495v.setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.manager.h
    public final void c() {
        Animatable animatable = this.f11497x;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // s6.d
    public final void d(r6.c cVar) {
        this.f11495v.setTag(f11494z, cVar);
    }

    @Override // s6.d
    public final void e(Drawable drawable) {
        f(null);
        this.f11497x = null;
        this.f11495v.setImageDrawable(drawable);
    }

    public final void f(Object obj) {
        switch (this.f11498y) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                this.f11495v.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.f11495v.setImageDrawable((Drawable) obj);
                break;
        }
    }

    @Override // s6.d
    public final r6.c g() {
        Object tag = this.f11495v.getTag(f11494z);
        if (tag == null) {
            return null;
        }
        if (tag instanceof r6.c) {
            return (r6.c) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // s6.d
    public final void h(Drawable drawable) {
        e eVar = this.f11496w;
        ViewTreeObserver viewTreeObserver = eVar.f11500a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(eVar.f11502c);
        }
        eVar.f11502c = null;
        eVar.f11501b.clear();
        Animatable animatable = this.f11497x;
        if (animatable != null) {
            animatable.stop();
        }
        f(null);
        this.f11497x = null;
        this.f11495v.setImageDrawable(drawable);
    }

    @Override // s6.d
    public final void j(h hVar) {
        this.f11496w.f11501b.remove(hVar);
    }

    @Override // com.bumptech.glide.manager.h
    public final void k() {
        Animatable animatable = this.f11497x;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // s6.d
    public final void m(h hVar) throws Throwable {
        e eVar = this.f11496w;
        ArrayList arrayList = eVar.f11501b;
        View view = eVar.f11500a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = eVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iA2 = eVar.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            hVar.m(iA, iA2);
            return;
        }
        if (!arrayList.contains(hVar)) {
            arrayList.add(hVar);
        }
        if (eVar.f11502c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            f0.f fVar = new f0.f(eVar);
            eVar.f11502c = fVar;
            viewTreeObserver.addOnPreDrawListener(fVar);
        }
    }

    public final String toString() {
        return "Target for: " + this.f11495v;
    }
}

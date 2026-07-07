package p;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import com.google.android.gms.internal.measurement.j5;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class b0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f10206d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10207a = 2;

    /* renamed from: b, reason: collision with root package name */
    public View f10208b;

    /* renamed from: c, reason: collision with root package name */
    public Object f10209c;

    public /* synthetic */ b0() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((j4.b0) ((a2.a2) this.f10209c).f162y).getClass();
            if (keyListener instanceof g1.e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new g1.e(keyListener);
        }
        return keyListener;
    }

    public void b(AttributeSet attributeSet, int i6) {
        switch (this.f10207a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f10208b;
                n9.j E = n9.j.E(absSeekBar.getContext(), attributeSet, f10206d, i6);
                Drawable w10 = E.w(0);
                if (w10 != null) {
                    if (w10 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) w10;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i10 = 0; i10 < numberOfFrames; i10++) {
                            Drawable e10 = e(animationDrawable.getFrame(i10), true);
                            e10.setLevel(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
                            animationDrawable2.addFrame(e10, animationDrawable.getDuration(i10));
                        }
                        animationDrawable2.setLevel(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
                        w10 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(w10);
                }
                Drawable w11 = E.w(1);
                if (w11 != null) {
                    absSeekBar.setProgressDrawable(e(w11, false));
                }
                E.G();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f10208b).getContext().obtainStyledAttributes(attributeSet, h.a.f5740i, i6, 0);
                try {
                    boolean z10 = true;
                    if (obtainStyledAttributes.hasValue(14)) {
                        z10 = obtainStyledAttributes.getBoolean(14, true);
                    }
                    obtainStyledAttributes.recycle();
                    d(z10);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public g1.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        a2.a2 a2Var = (a2.a2) this.f10209c;
        if (inputConnection == null) {
            a2Var.getClass();
            inputConnection = null;
        } else {
            j4.b0 b0Var = (j4.b0) a2Var.f162y;
            b0Var.getClass();
            if (!(inputConnection instanceof g1.b)) {
                inputConnection = new g1.b((EditText) b0Var.f7158x, inputConnection, editorInfo);
            }
        }
        return (g1.b) inputConnection;
    }

    public void d(boolean z10) {
        g1.i iVar = (g1.i) ((j4.b0) ((a2.a2) this.f10209c).f162y).f7159y;
        if (iVar.f5299z != z10) {
            if (iVar.f5298y != null) {
                e1.k a10 = e1.k.a();
                g1.h hVar = iVar.f5298y;
                a10.getClass();
                j5.e(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a10.f4161a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a10.f4162b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f5299z = z10;
            if (z10) {
                g1.i.a(iVar.f5297x, e1.k.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z10) {
        boolean z11;
        if (drawable instanceof m0.c) {
            m0.d dVar = (m0.d) ((m0.c) drawable);
            Drawable drawable2 = dVar.C;
            if (drawable2 != null) {
                dVar.h(e(drawable2, z10));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i6 = 0; i6 < numberOfLayers; i6++) {
                    int id2 = layerDrawable.getId(i6);
                    Drawable drawable3 = layerDrawable.getDrawable(i6);
                    if (id2 != 16908301 && id2 != 16908303) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    drawableArr[i6] = e(drawable3, z11);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    layerDrawable2.setId(i10, layerDrawable.getId(i10));
                    if (Build.VERSION.SDK_INT >= 23) {
                        j4.n.q(layerDrawable, layerDrawable2, i10);
                    }
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f10209c) == null) {
                    this.f10209c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                if (z10) {
                    return new ClipDrawable(shapeDrawable, 3, 1);
                }
                return shapeDrawable;
            }
        }
        return drawable;
    }

    public b0(AbsSeekBar absSeekBar) {
        this.f10208b = absSeekBar;
    }

    public b0(EditText editText) {
        this.f10208b = editText;
        this.f10209c = new a2.a2(editText);
    }
}

package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9185a;

    public /* synthetic */ j2(int i) {
        this.f9185a = i;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f9185a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute != null) {
                    try {
                        Drawable drawable = (Drawable) j2.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                        k.a.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    } catch (Exception e7) {
                        Log.e("DrawableDelegate", "Exception while inflating <drawable>", e7);
                        return null;
                    }
                }
                break;
            case 1:
                try {
                } catch (Exception e10) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                    return null;
                }
                break;
            case 2:
                try {
                    Resources resources = context.getResources();
                    f5.f fVar = new f5.f(context, 0);
                    fVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                } catch (Exception e11) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e11);
                    return null;
                }
                break;
            default:
                try {
                    Resources resources2 = context.getResources();
                    f5.r rVar = new f5.r();
                    rVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                } catch (Exception e12) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e12);
                    return null;
                }
                break;
        }
        return null;
    }
}

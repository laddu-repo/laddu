package androidx.emoji2.text;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.text.PrecomputedText;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ ImageDecoder.Source g(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    public static /* bridge */ /* synthetic */ AnimatedImageDrawable j(Drawable drawable) {
        return (AnimatedImageDrawable) drawable;
    }

    public static /* synthetic */ PrecomputedText.Params.Builder m(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ void u(Object obj) {
    }

    public static /* bridge */ /* synthetic */ boolean w(Drawable drawable) {
        return drawable instanceof AnimatedImageDrawable;
    }

    public static /* bridge */ /* synthetic */ boolean x(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}

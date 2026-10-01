package i9;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f6575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f6576d;
    public final WeakReference f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l9.d f6578g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f6573a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a9.b f6574b = new a9.b(1, this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6577e = true;

    public k(j jVar) {
        this.f = new WeakReference(null);
        this.f = new WeakReference(jVar);
    }

    public final void a(String str) {
        TextPaint textPaint = this.f6573a;
        this.f6575c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.f6576d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.f6577e = false;
    }

    public final void b(l9.d dVar, Context context) {
        if (this.f6578g != dVar) {
            this.f6578g = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f6573a;
                a9.b bVar = this.f6574b;
                dVar.e(context, textPaint, bVar);
                j jVar = (j) this.f.get();
                if (jVar != null) {
                    textPaint.drawableState = jVar.getState();
                }
                dVar.d(context, textPaint, bVar);
                this.f6577e = true;
            }
            j jVar2 = (j) this.f.get();
            if (jVar2 != null) {
                jVar2.a();
                jVar2.onStateChange(jVar2.getState());
            }
        }
    }
}

package i9;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f6562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f6563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6565d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6570k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public pa.a f6572m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Layout.Alignment f6566e = Layout.Alignment.ALIGN_NORMAL;
    public int f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f6567g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f6568h = 1.0f;
    public int i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6569j = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f6571l = null;

    public i(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f6562a = charSequence;
        this.f6563b = textPaint;
        this.f6564c = i;
        this.f6565d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f6562a == null) {
            this.f6562a = "";
        }
        int iMax = Math.max(0, this.f6564c);
        CharSequence charSequenceEllipsize = this.f6562a;
        int i = this.f;
        TextPaint textPaint = this.f6563b;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f6571l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f6565d);
        this.f6565d = iMin;
        if (this.f6570k && this.f == 1) {
            this.f6566e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f6566e);
        builderObtain.setIncludePad(this.f6569j);
        builderObtain.setTextDirection(this.f6570k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f6571l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f);
        float f = this.f6567g;
        if (f != 0.0f || this.f6568h != 1.0f) {
            builderObtain.setLineSpacing(f, this.f6568h);
        }
        if (this.f > 1) {
            builderObtain.setHyphenationFrequency(this.i);
        }
        pa.a aVar = this.f6572m;
        if (aVar != null) {
            builderObtain.setBreakStrategy(((TextInputLayout) aVar.f10443w).P.getBreakStrategy());
        }
        return builderObtain.build();
    }
}

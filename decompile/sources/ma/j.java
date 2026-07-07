package ma;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;
import com.unity3d.services.UnityAdsConstants;
import j2.u;
import java.lang.reflect.Constructor;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: n, reason: collision with root package name */
    public static final int f8769n;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f8770o;

    /* renamed from: p, reason: collision with root package name */
    public static Constructor f8771p;

    /* renamed from: q, reason: collision with root package name */
    public static TextDirectionHeuristic f8772q;

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f8773a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f8774b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8775c;

    /* renamed from: d, reason: collision with root package name */
    public int f8776d;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8782k;

    /* renamed from: m, reason: collision with root package name */
    public u f8784m;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f8777e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f8778f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f8779g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* renamed from: h, reason: collision with root package name */
    public float f8780h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f8781i = f8769n;
    public boolean j = true;

    /* renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f8783l = null;

    static {
        int i6;
        if (Build.VERSION.SDK_INT >= 23) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        f8769n = i6;
    }

    public j(CharSequence charSequence, TextPaint textPaint, int i6) {
        this.f8773a = charSequence;
        this.f8774b = textPaint;
        this.f8775c = i6;
        this.f8776d = charSequence.length();
    }

    public final StaticLayout a() {
        boolean z10;
        TextDirectionHeuristic textDirectionHeuristic;
        StaticLayout.Builder obtain;
        TextDirectionHeuristic textDirectionHeuristic2;
        StaticLayout build;
        int breakStrategy;
        if (this.f8773a == null) {
            this.f8773a = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int max = Math.max(0, this.f8775c);
        CharSequence charSequence = this.f8773a;
        int i6 = this.f8778f;
        TextPaint textPaint = this.f8774b;
        if (i6 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f8783l);
        }
        int min = Math.min(charSequence.length(), this.f8776d);
        this.f8776d = min;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            if (this.f8782k && this.f8778f == 1) {
                this.f8777e = Layout.Alignment.ALIGN_OPPOSITE;
            }
            obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
            obtain.setAlignment(this.f8777e);
            obtain.setIncludePad(this.j);
            if (this.f8782k) {
                textDirectionHeuristic2 = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic2 = TextDirectionHeuristics.LTR;
            }
            obtain.setTextDirection(textDirectionHeuristic2);
            TextUtils.TruncateAt truncateAt = this.f8783l;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f8778f);
            float f3 = this.f8779g;
            if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.f8780h != 1.0f) {
                obtain.setLineSpacing(f3, this.f8780h);
            }
            if (this.f8778f > 1) {
                obtain.setHyphenationFrequency(this.f8781i);
            }
            u uVar = this.f8784m;
            if (uVar != null) {
                TextInputLayout textInputLayout = (TextInputLayout) uVar.f7139y;
                if (i10 >= 23) {
                    breakStrategy = textInputLayout.R.getBreakStrategy();
                    obtain.setBreakStrategy(breakStrategy);
                } else {
                    int[][] iArr = TextInputLayout.f2769a1;
                }
            }
            build = obtain.build();
            return build;
        }
        if (!f8770o) {
            try {
                if (this.f8782k && i10 >= 23) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                } else {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                }
                f8772q = textDirectionHeuristic;
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Constructor declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                f8771p = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f8770o = true;
            } catch (Exception e10) {
                throw new i(e10);
            }
        }
        try {
            Constructor constructor = f8771p;
            constructor.getClass();
            Integer valueOf = Integer.valueOf(this.f8776d);
            Integer valueOf2 = Integer.valueOf(max);
            Layout.Alignment alignment = this.f8777e;
            TextDirectionHeuristic textDirectionHeuristic3 = f8772q;
            textDirectionHeuristic3.getClass();
            return (StaticLayout) constructor.newInstance(charSequence, 0, valueOf, textPaint, valueOf2, alignment, textDirectionHeuristic3, Float.valueOf(1.0f), Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), Boolean.valueOf(this.j), null, Integer.valueOf(max), Integer.valueOf(this.f8778f));
        } catch (Exception e11) {
            throw new i(e11);
        }
    }
}

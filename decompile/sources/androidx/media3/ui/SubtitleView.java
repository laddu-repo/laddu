package androidx.media3.ui;

import a8.e;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k4.c;
import k4.d;
import k4.f0;
import k4.l0;
import t1.a;
import t1.b;
import t1.f;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {
    public float A;
    public boolean B;
    public boolean C;
    public int D;
    public f0 E;
    public View F;

    /* renamed from: x, reason: collision with root package name */
    public List f1102x;

    /* renamed from: y, reason: collision with root package name */
    public d f1103y;

    /* renamed from: z, reason: collision with root package name */
    public float f1104z;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1102x = Collections.EMPTY_LIST;
        this.f1103y = d.f7611g;
        this.f1104z = 0.0533f;
        this.A = 0.08f;
        this.B = true;
        this.C = true;
        c cVar = new c(context, 0);
        this.E = cVar;
        this.F = cVar;
        addView(cVar);
        this.D = 1;
    }

    private List<b> getCuesWithStylingPreferencesApplied() {
        if (this.B && this.C) {
            return this.f1102x;
        }
        ArrayList arrayList = new ArrayList(this.f1102x.size());
        for (int i6 = 0; i6 < this.f1102x.size(); i6++) {
            a a10 = ((b) this.f1102x.get(i6)).a();
            if (!this.B) {
                a10.f12446n = false;
                CharSequence charSequence = a10.f12434a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        a10.f12434a = SpannableString.valueOf(charSequence);
                        a10.f12435b = null;
                    }
                    CharSequence charSequence2 = a10.f12434a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof f)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                e.z(a10);
            } else if (!this.C) {
                e.z(a10);
            }
            arrayList.add(a10.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private d getUserCaptionStyle() {
        int i6;
        int i10;
        int i11;
        boolean isInEditMode = isInEditMode();
        d dVar = d.f7611g;
        if (isInEditMode) {
            return dVar;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager != null && captioningManager.isEnabled()) {
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            int i12 = -1;
            if (userStyle.hasForegroundColor()) {
                i6 = userStyle.foregroundColor;
            } else {
                i6 = -1;
            }
            if (userStyle.hasBackgroundColor()) {
                i10 = userStyle.backgroundColor;
            } else {
                i10 = -16777216;
            }
            int i13 = 0;
            if (userStyle.hasWindowColor()) {
                i11 = userStyle.windowColor;
            } else {
                i11 = 0;
            }
            if (userStyle.hasEdgeType()) {
                i13 = userStyle.edgeType;
            }
            if (userStyle.hasEdgeColor()) {
                i12 = userStyle.edgeColor;
            }
            int i14 = i13;
            int i15 = i12;
            dVar = new d(i6, i10, i11, i14, i15, userStyle.getTypeface());
        }
        return dVar;
    }

    private <T extends View & f0> void setView(T t10) {
        removeView(this.F);
        View view = this.F;
        if (view instanceof l0) {
            ((l0) view).f7652y.destroy();
        }
        this.F = t10;
        this.E = t10;
        addView(t10);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.E.a(getCuesWithStylingPreferencesApplied(), this.f1103y, this.f1104z, this.A);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.C = z10;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.B = z10;
        c();
    }

    public void setBottomPaddingFraction(float f3) {
        this.A = f3;
        c();
    }

    public void setCues(List<b> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f1102x = list;
        c();
    }

    public void setFractionalTextSize(float f3) {
        this.f1104z = f3;
        c();
    }

    public void setStyle(d dVar) {
        this.f1103y = dVar;
        c();
    }

    public void setViewType(int i6) {
        if (this.D == i6) {
            return;
        }
        if (i6 != 1) {
            if (i6 == 2) {
                setView(new l0(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            setView(new c(getContext(), 0));
        }
        this.D = i6;
    }
}

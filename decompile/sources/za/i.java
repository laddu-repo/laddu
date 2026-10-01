package za;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i extends m {

    /* renamed from: e, reason: collision with root package name */
    public final int f15250e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15251f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f15252g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f15253h;

    /* renamed from: i, reason: collision with root package name */
    public final com.google.android.material.datepicker.n f15254i;
    public final gd.a j;

    /* renamed from: k, reason: collision with root package name */
    public final h f15255k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f15256l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f15257m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f15258n;

    /* renamed from: o, reason: collision with root package name */
    public long f15259o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f15260p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f15261q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f15262r;

    /* JADX WARN: Type inference failed for: r0v2, types: [za.h] */
    public i(l lVar) {
        super(lVar);
        this.f15254i = new com.google.android.material.datepicker.n(this, 12);
        this.j = new gd.a(this, 6);
        this.f15255k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: za.h
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                int i6;
                i iVar = i.this;
                AutoCompleteTextView autoCompleteTextView = iVar.f15253h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                CheckableImageButton checkableImageButton = iVar.f15271d;
                if (z10) {
                    i6 = 2;
                } else {
                    i6 = 1;
                }
                checkableImageButton.setImportantForAccessibility(i6);
            }
        };
        this.f15259o = Long.MAX_VALUE;
        this.f15251f = j5.t(lVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f15250e = j5.t(lVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f15252g = j5.u(lVar.getContext(), R.attr.motionEasingLinearInterpolator, u9.a.f12953a);
    }

    @Override // za.m
    public final void a() {
        if (this.f15260p.isTouchExplorationEnabled() && this.f15253h.getInputType() != 0 && !this.f15271d.hasFocus()) {
            this.f15253h.dismissDropDown();
        }
        this.f15253h.post(new j2.h(this, 19));
    }

    @Override // za.m
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // za.m
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // za.m
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // za.m
    public final View.OnClickListener f() {
        return this.f15254i;
    }

    @Override // za.m
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.f15255k;
    }

    @Override // za.m
    public final boolean i(int i6) {
        if (i6 != 0) {
            return true;
        }
        return false;
    }

    @Override // za.m
    public final boolean k() {
        return this.f15258n;
    }

    @Override // za.m
    public final void l(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.f15253h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new com.unity3d.ads.adplayer.a(this, 3));
            this.f15253h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: za.g
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    i iVar = i.this;
                    iVar.f15257m = true;
                    iVar.f15259o = SystemClock.uptimeMillis();
                    iVar.s(false);
                }
            });
            this.f15253h.setThreshold(0);
            TextInputLayout textInputLayout = this.f15268a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (editText.getInputType() == 0 && this.f15260p.isTouchExplorationEnabled()) {
                this.f15271d.setImportantForAccessibility(2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // za.m
    public final void m(u0.c cVar) {
        boolean e10;
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f12745a;
        if (this.f15253h.getInputType() == 0) {
            cVar.i(Spinner.class.getName());
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26) {
            e10 = accessibilityNodeInfo.isShowingHintText();
        } else {
            e10 = cVar.e(4);
        }
        if (e10) {
            if (i6 >= 26) {
                accessibilityNodeInfo.setHintText(null);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", null);
            }
        }
    }

    @Override // za.m
    public final void n(AccessibilityEvent accessibilityEvent) {
        boolean z10;
        if (!this.f15260p.isEnabled() || this.f15253h.getInputType() != 0) {
            return;
        }
        if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f15258n && !this.f15253h.isPopupShowing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (accessibilityEvent.getEventType() == 1 || z10) {
            t();
            this.f15257m = true;
            this.f15259o = SystemClock.uptimeMillis();
        }
    }

    @Override // za.m
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        TimeInterpolator timeInterpolator = this.f15252g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f15251f);
        int i6 = 6;
        ofFloat.addUpdateListener(new b7.w(this, i6));
        this.f15262r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f15250e);
        ofFloat2.addUpdateListener(new b7.w(this, i6));
        this.f15261q = ofFloat2;
        ofFloat2.addListener(new bb.b(this, 9));
        this.f15260p = (AccessibilityManager) this.f15270c.getSystemService("accessibility");
    }

    @Override // za.m
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.f15253h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f15253h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z10) {
        if (this.f15258n != z10) {
            this.f15258n = z10;
            this.f15262r.cancel();
            this.f15261q.start();
        }
    }

    public final void t() {
        if (this.f15253h == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.f15259o;
        if (uptimeMillis < 0 || uptimeMillis > 300) {
            this.f15257m = false;
        }
        if (!this.f15257m) {
            s(!this.f15258n);
            if (this.f15258n) {
                this.f15253h.requestFocus();
                this.f15253h.showDropDown();
                return;
            } else {
                this.f15253h.dismissDropDown();
                return;
            }
        }
        this.f15257m = false;
    }
}

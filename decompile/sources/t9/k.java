package t9;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12446e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f12447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f12448h;
    public final com.google.android.material.datepicker.n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f12449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j f12450k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f12451l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f12452m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12453n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f12454o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AccessibilityManager f12455p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueAnimator f12456q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f12457r;

    /* JADX WARN: Type inference failed for: r0v2, types: [t9.j] */
    public k(n nVar) {
        super(nVar);
        this.i = new com.google.android.material.datepicker.n(15, this);
        this.f12449j = new a(this, 1);
        this.f12450k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: t9.j
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z2) {
                k kVar = this.f12445a;
                AutoCompleteTextView autoCompleteTextView = kVar.f12448h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                kVar.f12468d.setImportantForAccessibility(z2 ? 2 : 1);
            }
        };
        this.f12454o = Long.MAX_VALUE;
        this.f = u1.c.D(nVar.getContext(), p8.b.motionDurationShort3, 67);
        this.f12446e = u1.c.D(nVar.getContext(), p8.b.motionDurationShort3, 50);
        this.f12447g = u1.c.E(nVar.getContext(), p8.b.motionEasingLinearInterpolator, q8.a.f10944a);
    }

    @Override // t9.o
    public final void a() {
        if (this.f12455p.isTouchExplorationEnabled() && this.f12448h.getInputType() != 0 && !this.f12468d.hasFocus()) {
            this.f12448h.dismissDropDown();
        }
        this.f12448h.post(new jd.j(7, this));
    }

    @Override // t9.o
    public final int c() {
        return p8.j.exposed_dropdown_menu_content_description;
    }

    @Override // t9.o
    public final int d() {
        return p8.e.mtrl_dropdown_arrow;
    }

    @Override // t9.o
    public final View.OnFocusChangeListener e() {
        return this.f12449j;
    }

    @Override // t9.o
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // t9.o
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.f12450k;
    }

    @Override // t9.o
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // t9.o
    public final boolean k() {
        return this.f12453n;
    }

    @Override // t9.o
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f12448h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: t9.h
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    k kVar = this.f12443v;
                    long j8 = jUptimeMillis - kVar.f12454o;
                    if (j8 < 0 || j8 > 300) {
                        kVar.f12452m = false;
                    }
                    kVar.t();
                    kVar.f12452m = true;
                    kVar.f12454o = SystemClock.uptimeMillis();
                }
                return false;
            }
        });
        this.f12448h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: t9.i
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                k kVar = this.f12444a;
                kVar.f12452m = true;
                kVar.f12454o = SystemClock.uptimeMillis();
                kVar.s(false);
            }
        });
        this.f12448h.setThreshold(0);
        TextInputLayout textInputLayout = this.f12465a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f12455p.isTouchExplorationEnabled()) {
            this.f12468d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // t9.o
    public final void m(u0.c cVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f12609a;
        if (this.f12448h.getInputType() == 0) {
            cVar.i(Spinner.class.getName());
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 ? accessibilityNodeInfo.isShowingHintText() : cVar.e(4)) {
            if (i >= 26) {
                accessibilityNodeInfo.setHintText(null);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", null);
            }
        }
    }

    @Override // t9.o
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (this.f12455p.isEnabled() && this.f12448h.getInputType() == 0) {
            boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f12453n && !this.f12448h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z2) {
                t();
                this.f12452m = true;
                this.f12454o = SystemClock.uptimeMillis();
            }
        }
    }

    @Override // t9.o
    public final void q() {
        int i = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f12447g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f);
        valueAnimatorOfFloat.addUpdateListener(new g4.d(i, this));
        this.f12457r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f12446e);
        valueAnimatorOfFloat2.addUpdateListener(new g4.d(i, this));
        this.f12456q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new e5.l(6, this));
        this.f12455p = (AccessibilityManager) this.f12467c.getSystemService("accessibility");
    }

    @Override // t9.o
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.f12448h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f12448h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z2) {
        if (this.f12453n != z2) {
            this.f12453n = z2;
            this.f12457r.cancel();
            this.f12456q.start();
        }
    }

    public final void t() {
        if (this.f12448h == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f12454o;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.f12452m = false;
        }
        if (this.f12452m) {
            this.f12452m = false;
            return;
        }
        s(!this.f12453n);
        if (!this.f12453n) {
            this.f12448h.dismissDropDown();
        } else {
            this.f12448h.requestFocus();
            this.f12448h.showDropDown();
        }
    }
}

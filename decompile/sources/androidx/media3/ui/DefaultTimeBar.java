package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import b7.w;
import j2.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import k4.g;
import k4.g0;
import k4.q;
import r1.u0;
import u1.a;
import u1.a0;
import u1.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class DefaultTimeBar extends View implements g0 {

    /* renamed from: p0, reason: collision with root package name */
    public static final /* synthetic */ int f1073p0 = 0;
    public final Rect A;
    public final Paint B;
    public final Paint C;
    public final Paint D;
    public final Paint E;
    public final Paint F;
    public final Paint G;
    public final Drawable H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final StringBuilder R;
    public final Formatter S;
    public final h T;
    public final CopyOnWriteArraySet U;
    public final Point V;
    public final float W;

    /* renamed from: a0, reason: collision with root package name */
    public int f1074a0;

    /* renamed from: b0, reason: collision with root package name */
    public long f1075b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f1076c0;

    /* renamed from: d0, reason: collision with root package name */
    public Rect f1077d0;

    /* renamed from: e0, reason: collision with root package name */
    public final ValueAnimator f1078e0;

    /* renamed from: f0, reason: collision with root package name */
    public float f1079f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f1080g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f1081h0;

    /* renamed from: i0, reason: collision with root package name */
    public long f1082i0;

    /* renamed from: j0, reason: collision with root package name */
    public long f1083j0;

    /* renamed from: k0, reason: collision with root package name */
    public long f1084k0;

    /* renamed from: l0, reason: collision with root package name */
    public long f1085l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f1086m0;

    /* renamed from: n0, reason: collision with root package name */
    public long[] f1087n0;
    public boolean[] o0;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f1088x;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f1089y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f1090z;

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, attributeSet, 0);
    }

    public static int a(int i6, float f3) {
        return (int) ((i6 * f3) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.f1075b0;
        if (j == -9223372036854775807L) {
            long j10 = this.f1083j0;
            if (j10 == -9223372036854775807L) {
                return 0L;
            }
            return j10 / this.f1074a0;
        }
        return j;
    }

    private String getProgressText() {
        return a0.E(this.R, this.S, this.f1084k0);
    }

    private long getScrubberPosition() {
        if (this.f1089y.width() > 0 && this.f1083j0 != -9223372036854775807L) {
            return (this.A.width() * this.f1083j0) / r0.width();
        }
        return 0L;
    }

    public final boolean b(long j) {
        long j10;
        long j11 = this.f1083j0;
        if (j11 > 0) {
            if (this.f1081h0) {
                j10 = this.f1082i0;
            } else {
                j10 = this.f1084k0;
            }
            long j12 = j10;
            long j13 = a0.j(j12 + j, 0L, j11);
            if (j13 == j12) {
                return false;
            }
            if (!this.f1081h0) {
                c(j13);
            } else {
                f(j13);
            }
            e();
            return true;
        }
        return false;
    }

    public final void c(long j) {
        this.f1082i0 = j;
        this.f1081h0 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.U.iterator();
        while (it.hasNext()) {
            q qVar = ((g) it.next()).f7643x;
            qVar.S0 = true;
            TextView textView = qVar.f7674j0;
            if (textView != null) {
                textView.setText(a0.E(qVar.f7676l0, qVar.f7677m0, j));
            }
            qVar.f7687x.f();
            u0 u0Var = qVar.M0;
            if (u0Var != null && qVar.U0) {
                if (qVar.i(u0Var)) {
                    try {
                        Method method = qVar.B;
                        method.getClass();
                        method.invoke(qVar.M0, Boolean.TRUE);
                    } catch (IllegalAccessException | InvocationTargetException e10) {
                        throw new RuntimeException(e10);
                    }
                } else if (qVar.h(qVar.M0)) {
                    try {
                        Method method2 = qVar.E;
                        method2.getClass();
                        method2.invoke(qVar.M0, Boolean.TRUE);
                    } catch (IllegalAccessException | InvocationTargetException e11) {
                        throw new RuntimeException(e11);
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Time bar scrubbing is enabled, but player is not an ExoPlayer or CompositionPlayer instance, so ignoring (because we can't enable scrubbing mode). player.class=");
                    u0 u0Var2 = qVar.M0;
                    u0Var2.getClass();
                    sb2.append(u0Var2.getClass());
                    a.p("PlayerControlView", sb2.toString());
                }
            }
        }
    }

    public final void d(boolean z10) {
        removeCallbacks(this.T);
        this.f1081h0 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.U.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            long j = this.f1082i0;
            q qVar = gVar.f7643x;
            qVar.S0 = false;
            u0 u0Var = qVar.M0;
            if (u0Var != null) {
                if (!z10) {
                    q.a(qVar, u0Var, j);
                }
                if (qVar.i(qVar.M0)) {
                    try {
                        Method method = qVar.B;
                        method.getClass();
                        method.invoke(qVar.M0, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e10) {
                        throw new RuntimeException(e10);
                    }
                } else if (qVar.h(qVar.M0)) {
                    try {
                        Method method2 = qVar.E;
                        method2.getClass();
                        method2.invoke(qVar.M0, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e11) {
                        throw new RuntimeException(e11);
                    }
                } else {
                    continue;
                }
            }
            qVar.f7687x.g();
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.H;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e() {
        long j;
        Rect rect = this.f1090z;
        Rect rect2 = this.f1089y;
        rect.set(rect2);
        Rect rect3 = this.A;
        rect3.set(rect2);
        if (this.f1081h0) {
            j = this.f1082i0;
        } else {
            j = this.f1084k0;
        }
        if (this.f1083j0 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.f1085l0) / this.f1083j0)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j) / this.f1083j0)), rect2.right);
        } else {
            int i6 = rect2.left;
            rect.right = i6;
            rect3.right = i6;
        }
        invalidate(this.f1088x);
    }

    public final void f(long j) {
        if (this.f1082i0 != j) {
            this.f1082i0 = j;
            Iterator it = this.U.iterator();
            while (it.hasNext()) {
                q qVar = ((g) it.next()).f7643x;
                TextView textView = qVar.f7674j0;
                if (textView != null) {
                    textView.setText(a0.E(qVar.f7676l0, qVar.f7677m0, j));
                }
                if (qVar.k(qVar.M0)) {
                    q.a(qVar, qVar.M0, j);
                }
            }
        }
    }

    @Override // k4.g0
    public long getPreferredUpdateDelay() {
        int width = (int) (this.f1089y.width() / this.W);
        if (width != 0) {
            long j = this.f1083j0;
            if (j != 0 && j != -9223372036854775807L) {
                return j / width;
            }
            return Long.MAX_VALUE;
        }
        return Long.MAX_VALUE;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.H;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2;
        int i6;
        canvas.save();
        Rect rect = this.f1089y;
        int height = rect.height();
        int centerY = rect.centerY() - (height / 2);
        int i10 = centerY + height;
        long j = this.f1083j0;
        Paint paint2 = this.D;
        Rect rect2 = this.A;
        if (j <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, centerY, rect.right, i10, paint2);
        } else {
            Rect rect3 = this.f1090z;
            int i11 = rect3.left;
            int i12 = rect3.right;
            int max = Math.max(Math.max(rect.left, i12), rect2.right);
            int i13 = rect.right;
            if (max < i13) {
                canvas.drawRect(max, centerY, i13, i10, paint2);
            }
            int max2 = Math.max(i11, rect2.right);
            if (i12 > max2) {
                canvas.drawRect(max2, centerY, i12, i10, this.C);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, centerY, rect2.right, i10, this.B);
            }
            if (this.f1086m0 != 0) {
                long[] jArr = this.f1087n0;
                jArr.getClass();
                boolean[] zArr = this.o0;
                zArr.getClass();
                int i14 = this.L;
                int i15 = i14 / 2;
                int i16 = 0;
                int i17 = 0;
                while (i17 < this.f1086m0) {
                    int min = Math.min(rect.width() - i14, Math.max(i16, ((int) ((rect.width() * a0.j(jArr[i17], 0L, this.f1083j0)) / this.f1083j0)) - i15)) + rect.left;
                    if (zArr[i17]) {
                        paint = this.F;
                    } else {
                        paint = this.E;
                    }
                    Paint paint3 = paint;
                    int i18 = i17;
                    canvas.drawRect(min, centerY, min + i14, i10, paint3);
                    i17 = i18 + 1;
                    i16 = 0;
                }
            }
            canvas2 = canvas;
        }
        if (this.f1083j0 > 0) {
            int i19 = a0.i(rect2.right, rect2.left, rect.right);
            int centerY2 = rect2.centerY();
            Drawable drawable = this.H;
            if (drawable == null) {
                if (!this.f1081h0 && !isFocused()) {
                    if (isEnabled()) {
                        i6 = this.M;
                    } else {
                        i6 = this.N;
                    }
                } else {
                    i6 = this.O;
                }
                canvas2.drawCircle(i19, centerY2, (int) ((i6 * this.f1079f0) / 2.0f), this.G);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f1079f0)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f1079f0)) / 2;
                drawable.setBounds(i19 - intrinsicWidth, centerY2 - intrinsicHeight, i19 + intrinsicWidth, centerY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i6, Rect rect) {
        super.onFocusChanged(z10, i6, rect);
        if (this.f1081h0 && !z10) {
            d(false);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f1083j0 <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L2e
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L25
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L25;
                default: goto L12;
            }
        L12:
            goto L2e
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.b(r0)
            if (r0 == 0) goto L2e
            j2.h r5 = r4.T
            r4.removeCallbacks(r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L25:
            boolean r0 = r4.f1081h0
            if (r0 == 0) goto L2e
            r5 = 0
            r4.d(r5)
            return r3
        L2e:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        Rect rect;
        int i16 = i11 - i6;
        int i17 = i12 - i10;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i16 - getPaddingRight();
        if (this.f1080g0) {
            i13 = 0;
        } else {
            i13 = this.P;
        }
        int i18 = this.K;
        int i19 = this.I;
        int i20 = this.J;
        if (i18 == 1) {
            i14 = (i17 - getPaddingBottom()) - i20;
            i15 = ((i17 - getPaddingBottom()) - i19) - Math.max(i13 - (i19 / 2), 0);
        } else {
            i14 = (i17 - i20) / 2;
            i15 = (i17 - i19) / 2;
        }
        Rect rect2 = this.f1088x;
        rect2.set(paddingLeft, i14, paddingRight, i20 + i14);
        this.f1089y.set(rect2.left + i13, i15, rect2.right - i13, i19 + i15);
        if (Build.VERSION.SDK_INT >= 29 && ((rect = this.f1077d0) == null || rect.width() != i16 || this.f1077d0.height() != i17)) {
            Rect rect3 = new Rect(0, 0, i16, i17);
            this.f1077d0 = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        e();
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int i11 = this.J;
        if (mode == 0) {
            size = i11;
        } else if (mode != 1073741824) {
            size = Math.min(i11, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i6), size);
        Drawable drawable = this.H;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i6) {
        boolean layoutDirection;
        Drawable drawable = this.H;
        if (drawable != null && Build.VERSION.SDK_INT >= 23) {
            layoutDirection = drawable.setLayoutDirection(i6);
            if (layoutDirection) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r3 != 3) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.isEnabled()
            r1 = 0
            if (r0 == 0) goto La1
            long r2 = r9.f1083j0
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto La1
        L11:
            float r0 = r10.getX()
            int r0 = (int) r0
            float r2 = r10.getY()
            int r2 = (int) r2
            android.graphics.Point r3 = r9.V
            r3.set(r0, r2)
            int r0 = r3.x
            int r2 = r3.y
            int r3 = r10.getAction()
            android.graphics.Rect r4 = r9.f1089y
            android.graphics.Rect r5 = r9.A
            r6 = 1
            if (r3 == 0) goto L7d
            r7 = 3
            if (r3 == r6) goto L6e
            r8 = 2
            if (r3 == r8) goto L38
            if (r3 == r7) goto L6e
            goto La1
        L38:
            boolean r10 = r9.f1081h0
            if (r10 == 0) goto La1
            int r10 = r9.Q
            if (r2 >= r10) goto L52
            int r10 = r9.f1076c0
            int r0 = r0 - r10
            int r0 = r0 / r7
            int r0 = r0 + r10
            float r10 = (float) r0
            int r10 = (int) r10
            int r0 = r4.left
            int r1 = r4.right
            int r10 = u1.a0.i(r10, r0, r1)
            r5.right = r10
            goto L60
        L52:
            r9.f1076c0 = r0
            float r10 = (float) r0
            int r10 = (int) r10
            int r0 = r4.left
            int r1 = r4.right
            int r10 = u1.a0.i(r10, r0, r1)
            r5.right = r10
        L60:
            long r0 = r9.getScrubberPosition()
            r9.f(r0)
            r9.e()
            r9.invalidate()
            return r6
        L6e:
            boolean r0 = r9.f1081h0
            if (r0 == 0) goto La1
            int r10 = r10.getAction()
            if (r10 != r7) goto L79
            r1 = 1
        L79:
            r9.d(r1)
            return r6
        L7d:
            float r10 = (float) r0
            float r0 = (float) r2
            int r10 = (int) r10
            int r0 = (int) r0
            android.graphics.Rect r2 = r9.f1088x
            boolean r0 = r2.contains(r10, r0)
            if (r0 == 0) goto La1
            int r0 = r4.left
            int r1 = r4.right
            int r10 = u1.a0.i(r10, r0, r1)
            r5.right = r10
            long r0 = r9.getScrubberPosition()
            r9.c(r0)
            r9.e()
            r9.invalidate()
            return r6
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i6, Bundle bundle) {
        if (super.performAccessibilityAction(i6, bundle)) {
            return true;
        }
        if (this.f1083j0 <= 0) {
            return false;
        }
        if (i6 == 8192) {
            if (b(-getPositionIncrement())) {
                d(false);
            }
        } else {
            if (i6 != 4096) {
                return false;
            }
            if (b(getPositionIncrement())) {
                d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i6) {
        this.E.setColor(i6);
        invalidate(this.f1088x);
    }

    public void setBufferedColor(int i6) {
        this.C.setColor(i6);
        invalidate(this.f1088x);
    }

    @Override // k4.g0
    public void setBufferedPosition(long j) {
        if (this.f1085l0 == j) {
            return;
        }
        this.f1085l0 = j;
        e();
    }

    @Override // k4.g0
    public void setDuration(long j) {
        if (this.f1083j0 == j) {
            return;
        }
        this.f1083j0 = j;
        if (this.f1081h0 && j == -9223372036854775807L) {
            d(true);
        }
        e();
    }

    @Override // android.view.View, k4.g0
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (this.f1081h0 && !z10) {
            d(true);
        }
    }

    public void setKeyCountIncrement(int i6) {
        boolean z10;
        if (i6 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        c.b(z10);
        this.f1074a0 = i6;
        this.f1075b0 = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        boolean z10;
        if (j > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        c.b(z10);
        this.f1074a0 = -1;
        this.f1075b0 = j;
    }

    public void setPlayedAdMarkerColor(int i6) {
        this.F.setColor(i6);
        invalidate(this.f1088x);
    }

    public void setPlayedColor(int i6) {
        this.B.setColor(i6);
        invalidate(this.f1088x);
    }

    @Override // k4.g0
    public void setPosition(long j) {
        if (this.f1084k0 == j) {
            return;
        }
        this.f1084k0 = j;
        setContentDescription(getProgressText());
        e();
    }

    public void setScrubberColor(int i6) {
        this.G.setColor(i6);
        invalidate(this.f1088x);
    }

    public void setUnplayedColor(int i6) {
        this.D.setColor(i6);
        invalidate(this.f1088x);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, AttributeSet attributeSet2, int i6) {
        super(context, attributeSet, 0);
        boolean layoutDirection;
        this.f1088x = new Rect();
        this.f1089y = new Rect();
        this.f1090z = new Rect();
        this.A = new Rect();
        Paint paint = new Paint();
        this.B = paint;
        Paint paint2 = new Paint();
        this.C = paint2;
        Paint paint3 = new Paint();
        this.D = paint3;
        Paint paint4 = new Paint();
        this.E = paint4;
        Paint paint5 = new Paint();
        this.F = paint5;
        Paint paint6 = new Paint();
        this.G = paint6;
        paint6.setAntiAlias(true);
        this.U = new CopyOnWriteArraySet();
        this.V = new Point();
        float f3 = context.getResources().getDisplayMetrics().density;
        this.W = f3;
        this.Q = a(-50, f3);
        int a10 = a(4, f3);
        int a11 = a(26, f3);
        int a12 = a(4, f3);
        int a13 = a(12, f3);
        int a14 = a(0, f3);
        int a15 = a(16, f3);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, k4.a0.f7594b, 0, i6);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(10);
                this.H = drawable;
                if (drawable != null) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 23) {
                        int layoutDirection2 = getLayoutDirection();
                        if (i10 >= 23) {
                            layoutDirection = drawable.setLayoutDirection(layoutDirection2);
                            if (layoutDirection) {
                            }
                        }
                    }
                    a11 = Math.max(drawable.getMinimumHeight(), a11);
                }
                this.I = obtainStyledAttributes.getDimensionPixelSize(3, a10);
                this.J = obtainStyledAttributes.getDimensionPixelSize(12, a11);
                this.K = obtainStyledAttributes.getInt(2, 0);
                this.L = obtainStyledAttributes.getDimensionPixelSize(1, a12);
                this.M = obtainStyledAttributes.getDimensionPixelSize(11, a13);
                this.N = obtainStyledAttributes.getDimensionPixelSize(8, a14);
                this.O = obtainStyledAttributes.getDimensionPixelSize(9, a15);
                int i11 = obtainStyledAttributes.getInt(6, -1);
                int i12 = obtainStyledAttributes.getInt(7, -1);
                int i13 = obtainStyledAttributes.getInt(4, -855638017);
                int i14 = obtainStyledAttributes.getInt(13, 872415231);
                int i15 = obtainStyledAttributes.getInt(0, -1291845888);
                int i16 = obtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i11);
                paint6.setColor(i12);
                paint2.setColor(i13);
                paint3.setColor(i14);
                paint4.setColor(i15);
                paint5.setColor(i16);
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.I = a10;
            this.J = a11;
            this.K = 0;
            this.L = a12;
            this.M = a13;
            this.N = a14;
            this.O = a15;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.H = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.R = sb2;
        this.S = new Formatter(sb2, Locale.getDefault());
        this.T = new h(this, 2);
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            this.P = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.P = (Math.max(this.N, Math.max(this.M, this.O)) + 1) / 2;
        }
        this.f1079f0 = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f1078e0 = valueAnimator;
        valueAnimator.addUpdateListener(new w(this, 3));
        this.f1083j0 = -9223372036854775807L;
        this.f1075b0 = -9223372036854775807L;
        this.f1074a0 = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}

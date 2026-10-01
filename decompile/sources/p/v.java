package p;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class v extends EditText implements t0.t, w0.k {
    public final w0.i A;
    public final b0 B;
    public u C;

    /* renamed from: x, reason: collision with root package name */
    public final o4.j f10395x;

    /* renamed from: y, reason: collision with root package name */
    public final x0 f10396y;

    /* renamed from: z, reason: collision with root package name */
    public final b0 f10397z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v5, types: [w0.i, java.lang.Object] */
    public v(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        c3.a(context);
        b3.a(this, getContext());
        o4.j jVar = new o4.j(this);
        this.f10395x = jVar;
        jVar.m(attributeSet, i6);
        x0 x0Var = new x0(this);
        this.f10396y = x0Var;
        x0Var.f(attributeSet, i6);
        x0Var.b();
        b0 b0Var = new b0();
        b0Var.f10208b = this;
        this.f10397z = b0Var;
        this.A = new Object();
        b0 b0Var2 = new b0(this);
        this.B = b0Var2;
        b0Var2.b(attributeSet, i6);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a10 = b0Var2.a(keyListener);
            if (a10 != keyListener) {
                super.setKeyListener(a10);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    private u getSuperCaller() {
        if (this.C == null) {
            this.C = new u(this);
        }
        return this.C;
    }

    @Override // t0.t
    public final t0.g a(t0.g gVar) {
        this.A.getClass();
        return w0.i.a(this, gVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o4.j jVar = this.f10395x;
        if (jVar != null) {
            jVar.b();
        }
        x0 x0Var = this.f10396y;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return c9.a.v(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        o4.j jVar = this.f10395x;
        if (jVar != null) {
            return jVar.j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o4.j jVar = this.f10395x;
        if (jVar != null) {
            return jVar.k();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f10396y.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f10396y.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        b0 b0Var;
        if (Build.VERSION.SDK_INT < 28 && (b0Var = this.f10397z) != null) {
            TextClassifier textClassifier = (TextClassifier) b0Var.f10209c;
            if (textClassifier == null) {
                return r0.a((TextView) b0Var.f10208b);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r1 != null) goto L23;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            p.x0 r1 = r7.f10396y
            r1.getClass()
            p.x0.h(r8, r0, r7)
            dg.b.l(r8, r0, r7)
            if (r0 == 0) goto L78
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L78
            java.lang.String[] r2 = t0.q0.h(r7)
            if (r2 == 0) goto L78
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L29
            v0.a.a(r8, r2)
            goto L3e
        L29:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L34
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L34:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L3e:
            j2.u r2 = new j2.u
            r6 = 13
            r2.<init>(r7, r6)
            if (r1 < r5) goto L4e
            v0.d r1 = new v0.d
            r1.<init>(r0, r2)
        L4c:
            r0 = r1
            goto L78
        L4e:
            java.lang.String[] r6 = v0.c.f13180a
            if (r1 < r5) goto L5a
            java.lang.String[] r1 = v0.a.b(r8)
            if (r1 == 0) goto L6e
        L58:
            r6 = r1
            goto L6e
        L5a:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L5f
            goto L6e
        L5f:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L6b
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L6b:
            if (r1 == 0) goto L6e
            goto L58
        L6e:
            int r1 = r6.length
            if (r1 != 0) goto L72
            goto L78
        L72:
            v0.e r1 = new v0.e
            r1.<init>(r0, r2)
            goto L4c
        L78:
            p.b0 r1 = r7.B
            g1.b r8 = r1.c(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.v.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30 && i6 < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i6 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i6 < 31 && i6 >= 24 && dragEvent.getLocalState() == null && t0.q0.h(this) != null) {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z10 = e0.a(dragEvent, this, activity);
            }
        }
        if (z10) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i6) {
        ClipData primaryClip;
        t0.c cVar;
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 && t0.q0.h(this) != null && (i6 == 16908322 || i6 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i11 >= 31) {
                    cVar = new k7.c(primaryClip, 1);
                } else {
                    t0.d dVar = new t0.d();
                    dVar.f12336y = primaryClip;
                    dVar.f12337z = 1;
                    cVar = dVar;
                }
                if (i6 == 16908322) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                cVar.j(i10);
                t0.q0.n(this, cVar.build());
            }
            return true;
        }
        return super.onTextContextMenuItem(i6);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o4.j jVar = this.f10395x;
        if (jVar != null) {
            jVar.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        o4.j jVar = this.f10395x;
        if (jVar != null) {
            jVar.p(i6);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f10396y;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f10396y;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c9.a.w(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.B.d(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.B.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o4.j jVar = this.f10395x;
        if (jVar != null) {
            jVar.w(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o4.j jVar = this.f10395x;
        if (jVar != null) {
            jVar.x(mode);
        }
    }

    @Override // w0.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f10396y;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override // w0.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f10396y;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        x0 x0Var = this.f10396y;
        if (x0Var != null) {
            x0Var.g(context, i6);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        b0 b0Var;
        if (Build.VERSION.SDK_INT < 28 && (b0Var = this.f10397z) != null) {
            b0Var.f10209c = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}

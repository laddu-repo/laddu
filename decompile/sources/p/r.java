package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r extends CheckedTextView implements w0.k {
    public w A;

    /* renamed from: x, reason: collision with root package name */
    public final s f10365x;

    /* renamed from: y, reason: collision with root package name */
    public final o4.j f10366y;

    /* renamed from: z, reason: collision with root package name */
    public final x0 f10367z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0085 A[Catch: all -> 0x0064, TryCatch #1 {all -> 0x0064, blocks: (B:3:0x004b, B:5:0x0052, B:8:0x0058, B:9:0x007e, B:11:0x0085, B:12:0x008c, B:14:0x0093, B:21:0x0067, B:23:0x006d, B:25:0x0073), top: B:2:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0093 A[Catch: all -> 0x0064, TRY_LEAVE, TryCatch #1 {all -> 0x0064, blocks: (B:3:0x004b, B:5:0x0052, B:8:0x0058, B:9:0x007e, B:11:0x0085, B:12:0x008c, B:14:0x0093, B:21:0x0067, B:23:0x006d, B:25:0x0073), top: B:2:0x004b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            p.c3.a(r8)
            r6 = 2130968783(0x7f0400cf, float:1.754623E38)
            r7.<init>(r8, r9, r6)
            android.content.Context r8 = r7.getContext()
            p.b3.a(r7, r8)
            p.x0 r8 = new p.x0
            r8.<init>(r7)
            r7.f10367z = r8
            r8.f(r9, r6)
            r8.b()
            o4.j r8 = new o4.j
            r8.<init>(r7)
            r7.f10366y = r8
            r8.m(r9, r6)
            p.s r8 = new p.s
            r8.<init>(r7)
            r7.f10365x = r8
            android.content.Context r8 = r7.getContext()
            int[] r3 = h.a.f5742l
            n9.j r8 = n9.j.E(r8, r9, r3, r6)
            java.lang.Object r0 = r8.f9356z
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            android.content.Context r2 = r7.getContext()
            java.lang.Object r1 = r8.f9356z
            r5 = r1
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r1 = r7
            r4 = r9
            t0.q0.q(r1, r2, r3, r4, r5, r6)
            r9 = 1
            boolean r2 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L64
            r3 = 0
            if (r2 == 0) goto L67
            int r9 = r0.getResourceId(r9, r3)     // Catch: java.lang.Throwable -> L64
            if (r9 == 0) goto L67
            android.content.Context r2 = r7.getContext()     // Catch: java.lang.Throwable -> L64 android.content.res.Resources.NotFoundException -> L67
            android.graphics.drawable.Drawable r9 = c9.a.f(r2, r9)     // Catch: java.lang.Throwable -> L64 android.content.res.Resources.NotFoundException -> L67
            r7.setCheckMarkDrawable(r9)     // Catch: java.lang.Throwable -> L64 android.content.res.Resources.NotFoundException -> L67
            goto L7e
        L64:
            r0 = move-exception
            r9 = r0
            goto Lab
        L67:
            boolean r9 = r0.hasValue(r3)     // Catch: java.lang.Throwable -> L64
            if (r9 == 0) goto L7e
            int r9 = r0.getResourceId(r3, r3)     // Catch: java.lang.Throwable -> L64
            if (r9 == 0) goto L7e
            android.content.Context r2 = r7.getContext()     // Catch: java.lang.Throwable -> L64
            android.graphics.drawable.Drawable r9 = c9.a.f(r2, r9)     // Catch: java.lang.Throwable -> L64
            r7.setCheckMarkDrawable(r9)     // Catch: java.lang.Throwable -> L64
        L7e:
            r9 = 2
            boolean r2 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L8c
            android.content.res.ColorStateList r9 = r8.t(r9)     // Catch: java.lang.Throwable -> L64
            r7.setCheckMarkTintList(r9)     // Catch: java.lang.Throwable -> L64
        L8c:
            r9 = 3
            boolean r2 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto La0
            r2 = -1
            int r9 = r0.getInt(r9, r2)     // Catch: java.lang.Throwable -> L64
            r0 = 0
            android.graphics.PorterDuff$Mode r9 = p.n1.c(r9, r0)     // Catch: java.lang.Throwable -> L64
            r7.setCheckMarkTintMode(r9)     // Catch: java.lang.Throwable -> L64
        La0:
            r8.G()
            p.w r8 = r7.getEmojiTextViewHelper()
            r8.b(r4, r6)
            return
        Lab:
            r8.G()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.r.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private w getEmojiTextViewHelper() {
        if (this.A == null) {
            this.A = new w(this);
        }
        return this.A;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        x0 x0Var = this.f10367z;
        if (x0Var != null) {
            x0Var.b();
        }
        o4.j jVar = this.f10366y;
        if (jVar != null) {
            jVar.b();
        }
        s sVar = this.f10365x;
        if (sVar != null) {
            sVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return c9.a.v(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        o4.j jVar = this.f10366y;
        if (jVar != null) {
            return jVar.j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o4.j jVar = this.f10366y;
        if (jVar != null) {
            return jVar.k();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        s sVar = this.f10365x;
        if (sVar != null) {
            return sVar.f10373a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        s sVar = this.f10365x;
        if (sVar != null) {
            return sVar.f10374b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f10367z.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f10367z.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        dg.b.l(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o4.j jVar = this.f10366y;
        if (jVar != null) {
            jVar.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        o4.j jVar = this.f10366y;
        if (jVar != null) {
            jVar.p(i6);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        s sVar = this.f10365x;
        if (sVar != null) {
            if (sVar.f10377e) {
                sVar.f10377e = false;
            } else {
                sVar.f10377e = true;
                sVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f10367z;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f10367z;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c9.a.w(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o4.j jVar = this.f10366y;
        if (jVar != null) {
            jVar.w(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o4.j jVar = this.f10366y;
        if (jVar != null) {
            jVar.x(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        s sVar = this.f10365x;
        if (sVar != null) {
            sVar.f10373a = colorStateList;
            sVar.f10375c = true;
            sVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        s sVar = this.f10365x;
        if (sVar != null) {
            sVar.f10374b = mode;
            sVar.f10376d = true;
            sVar.b();
        }
    }

    @Override // w0.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f10367z;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override // w0.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f10367z;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        x0 x0Var = this.f10367z;
        if (x0Var != null) {
            x0Var.g(context, i6);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i6) {
        setCheckMarkDrawable(c9.a.f(getContext(), i6));
    }
}

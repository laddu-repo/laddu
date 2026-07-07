package za;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import okhttp3.HttpUrl;
import p.b1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v extends t0.b {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f15314d;

    public v(TextInputLayout textInputLayout) {
        this.f15314d = textInputLayout;
    }

    @Override // t0.b
    public final void d(View view, u0.c cVar) {
        CharSequence charSequence;
        boolean z10;
        String str;
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f12745a;
        this.f12323a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f15314d;
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            charSequence = editText.getText();
        } else {
            charSequence = null;
        }
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z11 = textInputLayout.S0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        if (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!isEmpty2) {
            str = hint.toString();
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        t tVar = textInputLayout.f2794y;
        b1 b1Var = tVar.f15309y;
        if (b1Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(b1Var);
            if (Build.VERSION.SDK_INT >= 22) {
                accessibilityNodeInfo.setTraversalAfter(b1Var);
            }
        } else {
            CheckableImageButton checkableImageButton = tVar.A;
            if (Build.VERSION.SDK_INT >= 22) {
                accessibilityNodeInfo.setTraversalAfter(checkableImageButton);
            }
        }
        if (!isEmpty) {
            cVar.l(charSequence);
        } else if (!TextUtils.isEmpty(str)) {
            cVar.l(str);
            if (!z11 && placeholderText != null) {
                cVar.l(str + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            cVar.l(placeholderText);
        }
        if (!TextUtils.isEmpty(str)) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 26) {
                if (i6 >= 26) {
                    accessibilityNodeInfo.setHintText(str);
                } else {
                    accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
                }
            } else {
                if (!isEmpty) {
                    str = ((Object) charSequence) + ", " + str;
                }
                cVar.l(str);
            }
            if (i6 >= 26) {
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            } else {
                cVar.h(4, isEmpty);
            }
        }
        if (charSequence == null || charSequence.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z10) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        b1 b1Var2 = textInputLayout.H.f15300y;
        if (b1Var2 != null) {
            accessibilityNodeInfo.setLabelFor(b1Var2);
        }
        textInputLayout.f2796z.b().m(cVar);
    }

    @Override // t0.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f15314d.f2796z.b().n(accessibilityEvent);
    }
}

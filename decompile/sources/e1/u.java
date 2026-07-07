package e1;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u implements TextWatcher, SpanWatcher {

    /* renamed from: x, reason: collision with root package name */
    public final Object f4191x;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicInteger f4192y = new AtomicInteger(0);

    public u(Object obj) {
        this.f4191x = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f4191x).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        ((TextWatcher) this.f4191x).beforeTextChanged(charSequence, i6, i10, i11);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i6, int i10) {
        if (this.f4192y.get() > 0 && (obj instanceof x)) {
            return;
        }
        ((SpanWatcher) this.f4191x).onSpanAdded(spannable, obj, i6, i10);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i6, int i10, int i11, int i12) {
        int i13;
        int i14;
        if (this.f4192y.get() > 0 && (obj instanceof x)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            if (i6 > i10) {
                i6 = 0;
            }
            if (i11 > i12) {
                i13 = i6;
                i14 = 0;
                ((SpanWatcher) this.f4191x).onSpanChanged(spannable, obj, i13, i10, i14, i12);
            }
        }
        i13 = i6;
        i14 = i11;
        ((SpanWatcher) this.f4191x).onSpanChanged(spannable, obj, i13, i10, i14, i12);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i6, int i10) {
        if (this.f4192y.get() > 0 && (obj instanceof x)) {
            return;
        }
        ((SpanWatcher) this.f4191x).onSpanRemoved(spannable, obj, i6, i10);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        ((TextWatcher) this.f4191x).onTextChanged(charSequence, i6, i10, i11);
    }
}

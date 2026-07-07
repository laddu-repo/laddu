package e1;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import com.google.android.gms.internal.measurement.j5;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v extends SpannableStringBuilder {

    /* renamed from: x, reason: collision with root package name */
    public final Class f4193x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f4194y;

    public v(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f4194y = new ArrayList();
        j5.e(cls, "watcherClass cannot be null");
        this.f4193x = cls;
    }

    public final void a() {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f4194y;
            if (i6 < arrayList.size()) {
                ((u) arrayList.get(i6)).f4192y.incrementAndGet();
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f4194y;
            if (i6 < arrayList.size()) {
                ((u) arrayList.get(i6)).onTextChanged(this, 0, length(), length());
                i6++;
            } else {
                return;
            }
        }
    }

    public final u c(Object obj) {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f4194y;
            if (i6 < arrayList.size()) {
                u uVar = (u) arrayList.get(i6);
                if (uVar.f4191x == obj) {
                    return uVar;
                }
                i6++;
            } else {
                return null;
            }
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            if (this.f4193x == obj.getClass()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i6, int i10) {
        super.delete(i6, i10);
        return this;
    }

    public final void e() {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f4194y;
            if (i6 < arrayList.size()) {
                ((u) arrayList.get(i6)).f4192y.decrementAndGet();
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        u c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        u c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        u c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i6, int i10, Class cls) {
        if (this.f4193x == cls) {
            u[] uVarArr = (u[]) super.getSpans(i6, i10, u.class);
            Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, uVarArr.length);
            for (int i11 = 0; i11 < uVarArr.length; i11++) {
                objArr[i11] = uVarArr[i11].f4191x;
            }
            return objArr;
        }
        return super.getSpans(i6, i10, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i6, CharSequence charSequence) {
        super.insert(i6, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i6, int i10, Class cls) {
        if (cls == null || this.f4193x == cls) {
            cls = u.class;
        }
        return super.nextSpanTransition(i6, i10, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        u uVar;
        if (d(obj)) {
            uVar = c(obj);
            if (uVar != null) {
                obj = uVar;
            }
        } else {
            uVar = null;
        }
        super.removeSpan(obj);
        if (uVar != null) {
            this.f4194y.remove(uVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i6, int i10, CharSequence charSequence) {
        replace(i6, i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i6, int i10, int i11) {
        if (d(obj)) {
            u uVar = new u(obj);
            this.f4194y.add(uVar);
            obj = uVar;
        }
        super.setSpan(obj, i6, i10, i11);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i6, int i10) {
        return new v(this.f4193x, this, i6, i10);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i6, int i10) {
        super.delete(i6, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i6, CharSequence charSequence) {
        super.insert(i6, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i6, int i10, CharSequence charSequence, int i11, int i12) {
        replace(i6, i10, charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i6, CharSequence charSequence, int i10, int i11) {
        super.insert(i6, charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i6, int i10, CharSequence charSequence) {
        a();
        super.replace(i6, i10, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i6, CharSequence charSequence, int i10, int i11) {
        super.insert(i6, charSequence, i10, i11);
        return this;
    }

    public v(Class cls, v vVar, int i6, int i10) {
        super(vVar, i6, i10);
        this.f4194y = new ArrayList();
        j5.e(cls, "watcherClass cannot be null");
        this.f4193x = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i6, int i10, CharSequence charSequence, int i11, int i12) {
        a();
        super.replace(i6, i10, charSequence, i11, i12);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i6, int i10) {
        super.append(charSequence, i6, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i6, int i10) {
        super.append(charSequence, i6, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i6, int i10) {
        super.append(charSequence, i6, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i6) {
        super.append(charSequence, obj, i6);
        return this;
    }
}

package n4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.jvm.internal.k;
import l4.u;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends u {
    public String D;

    @Override // l4.u
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof g) && super.equals(obj) && k.a(this.D, ((g) obj).D)) {
            return true;
        }
        return false;
    }

    @Override // l4.u
    public final void f(Context context, AttributeSet attributeSet) {
        super.f(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, j.f9060b);
        k.d(obtainAttributes, "obtainAttributes(...)");
        String string = obtainAttributes.getString(0);
        if (string != null) {
            this.D = string;
        }
        obtainAttributes.recycle();
    }

    @Override // l4.u
    public final int hashCode() {
        int i6;
        int hashCode = super.hashCode() * 31;
        String str = this.D;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        return hashCode + i6;
    }

    @Override // l4.u
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" class=");
        String str = this.D;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        String sb3 = sb2.toString();
        k.d(sb3, "toString(...)");
        return sb3;
    }
}

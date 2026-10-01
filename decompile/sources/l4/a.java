package l4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends u {
    public Intent D;
    public String E;

    public static String g(Context context, String str) {
        if (str != null) {
            String packageName = context.getPackageName();
            kotlin.jvm.internal.k.d(packageName, "getPackageName(...)");
            return df.u.F(str, "${applicationId}", packageName);
        }
        return null;
    }

    @Override // l4.u
    public final boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a) && super.equals(obj)) {
            Intent intent = this.D;
            if (intent != null) {
                z10 = intent.filterEquals(((a) obj).D);
            } else if (((a) obj).D == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && kotlin.jvm.internal.k.a(this.E, ((a) obj).E)) {
                return true;
            }
        }
        return false;
    }

    @Override // l4.u
    public final void f(Context context, AttributeSet attributeSet) {
        super.f(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, l0.f8158a);
        kotlin.jvm.internal.k.d(obtainAttributes, "obtainAttributes(...)");
        String g10 = g(context, obtainAttributes.getString(4));
        if (this.D == null) {
            this.D = new Intent();
        }
        Intent intent = this.D;
        kotlin.jvm.internal.k.b(intent);
        intent.setPackage(g10);
        String string = obtainAttributes.getString(0);
        if (string != null) {
            if (string.charAt(0) == '.') {
                string = context.getPackageName() + string;
            }
            ComponentName componentName = new ComponentName(context, string);
            if (this.D == null) {
                this.D = new Intent();
            }
            Intent intent2 = this.D;
            kotlin.jvm.internal.k.b(intent2);
            intent2.setComponent(componentName);
        }
        String string2 = obtainAttributes.getString(1);
        if (this.D == null) {
            this.D = new Intent();
        }
        Intent intent3 = this.D;
        kotlin.jvm.internal.k.b(intent3);
        intent3.setAction(string2);
        String g11 = g(context, obtainAttributes.getString(2));
        if (g11 != null) {
            Uri parse = Uri.parse(g11);
            if (this.D == null) {
                this.D = new Intent();
            }
            Intent intent4 = this.D;
            kotlin.jvm.internal.k.b(intent4);
            intent4.setData(parse);
        }
        this.E = g(context, obtainAttributes.getString(3));
        obtainAttributes.recycle();
    }

    @Override // l4.u
    public final int hashCode() {
        int i6;
        int hashCode = super.hashCode() * 31;
        Intent intent = this.D;
        int i10 = 0;
        if (intent != null) {
            i6 = intent.filterHashCode();
        } else {
            i6 = 0;
        }
        int i11 = (hashCode + i6) * 31;
        String str = this.E;
        if (str != null) {
            i10 = str.hashCode();
        }
        return i11 + i10;
    }

    @Override // l4.u
    public final String toString() {
        ComponentName componentName;
        Intent intent = this.D;
        String str = null;
        if (intent != null) {
            componentName = intent.getComponent();
        } else {
            componentName = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (componentName != null) {
            sb2.append(" class=");
            sb2.append(componentName.getClassName());
        } else {
            Intent intent2 = this.D;
            if (intent2 != null) {
                str = intent2.getAction();
            }
            if (str != null) {
                sb2.append(" action=");
                sb2.append(str);
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.k.d(sb3, "toString(...)");
        return sb3;
    }
}

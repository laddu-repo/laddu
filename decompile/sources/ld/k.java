package ld;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f8333a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f8334b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f8335c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f8336d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f8337e;

    public k(int i6, Set set, LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.f8333a = i6;
        this.f8334b = set;
        this.f8335c = linearLayout;
        this.f8336d = imageView;
        this.f8337e = textView;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k) {
                k kVar = (k) obj;
                if (this.f8333a != kVar.f8333a || !this.f8334b.equals(kVar.f8334b) || !this.f8335c.equals(kVar.f8335c) || !this.f8336d.equals(kVar.f8336d) || !this.f8337e.equals(kVar.f8337e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f8337e.hashCode() + ((this.f8336d.hashCode() + ((this.f8335c.hashCode() + ((this.f8334b.hashCode() + (this.f8333a * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TabDefinition(destinationId=" + this.f8333a + ", relatedDestinationIds=" + this.f8334b + ", container=" + this.f8335c + ", icon=" + this.f8336d + ", label=" + this.f8337e + ")";
    }
}

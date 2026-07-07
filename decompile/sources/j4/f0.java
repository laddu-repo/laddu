package j4;

import android.text.TextUtils;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7165a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7166b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7167c;

    public f0(String str, int i6, int i10) {
        this.f7165a = str;
        this.f7166b = i6;
        this.f7167c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        int i6 = f0Var.f7167c;
        String str = f0Var.f7165a;
        int i10 = f0Var.f7166b;
        int i11 = this.f7167c;
        String str2 = this.f7165a;
        int i12 = this.f7166b;
        if (i12 >= 0 && i10 >= 0) {
            if (TextUtils.equals(str2, str) && i12 == i10 && i11 == i6) {
                return true;
            }
            return false;
        }
        if (TextUtils.equals(str2, str) && i11 == i6) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f7165a, Integer.valueOf(this.f7167c));
    }
}

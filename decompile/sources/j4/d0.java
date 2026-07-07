package j4;

import android.os.Build;
import android.text.TextUtils;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public f0 f7163a;

    public d0(String str, int i6, int i10) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.f7163a = new f0(str, i6, i10);
                    return;
                } else {
                    this.f7163a = new f0(str, i6, i10);
                    return;
                }
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        return this.f7163a.equals(((d0) obj).f7163a);
    }

    public final int hashCode() {
        return this.f7163a.hashCode();
    }
}

package ua;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f13002a;

    public j(float f3) {
        this.f13002a = f3;
    }

    @Override // ua.d
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f13002a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j) && this.f13002a == ((j) obj).f13002a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f13002a)});
    }

    public final String toString() {
        return r4.a.l(new StringBuilder(), (int) (this.f13002a * 100.0f), "%");
    }
}

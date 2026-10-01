package ua;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f12967a;

    public a(float f3) {
        this.f12967a = f3;
    }

    @Override // ua.d
    public final float a(RectF rectF) {
        return this.f12967a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f12967a == ((a) obj).f12967a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f12967a)});
    }

    public final String toString() {
        return this.f12967a + "px";
    }
}

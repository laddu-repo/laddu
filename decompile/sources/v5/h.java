package v5;

import android.app.Notification;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f13322a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13323b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f13324c;

    public h(int i6, Notification notification, int i10) {
        this.f13322a = i6;
        this.f13324c = notification;
        this.f13323b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f13322a != hVar.f13322a || this.f13323b != hVar.f13323b) {
            return false;
        }
        return this.f13324c.equals(hVar.f13324c);
    }

    public final int hashCode() {
        return this.f13324c.hashCode() + (((this.f13322a * 31) + this.f13323b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f13322a + ", mForegroundServiceType=" + this.f13323b + ", mNotification=" + this.f13324c + '}';
    }
}

package q0;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f10792a;

    /* renamed from: b, reason: collision with root package name */
    public String f10793b;

    /* renamed from: c, reason: collision with root package name */
    public List f10794c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f10792a, bVar.f10792a) && Objects.equals(this.f10793b, bVar.f10793b) && Objects.equals(this.f10794c, bVar.f10794c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10792a, this.f10793b, this.f10794c);
    }
}

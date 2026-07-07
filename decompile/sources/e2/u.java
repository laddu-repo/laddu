package e2;

import android.graphics.Rect;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u implements ef.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4280a;

    /* renamed from: b, reason: collision with root package name */
    public String f4281b;

    /* renamed from: c, reason: collision with root package name */
    public String f4282c;

    public /* synthetic */ u() {
        this.f4280a = 2;
    }

    public boolean equals(Object obj) {
        switch (this.f4280a) {
            case 2:
                if (!(obj instanceof s0.b)) {
                    return false;
                }
                s0.b bVar = (s0.b) obj;
                Rect rect = bVar.f11959a;
                String str = this.f4281b;
                if (rect != str && !rect.equals(str)) {
                    return false;
                }
                Rect rect2 = bVar.f11960b;
                String str2 = this.f4282c;
                if (rect2 != str2 && !rect2.equals(str2)) {
                    return false;
                }
                return true;
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        int hashCode;
        switch (this.f4280a) {
            case 2:
                String str = this.f4281b;
                int i6 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                String str2 = this.f4282c;
                if (str2 != null) {
                    i6 = str2.hashCode();
                }
                return hashCode ^ i6;
            default:
                return super.hashCode();
        }
    }

    @Override // ef.h
    public ef.d toInstant() {
        throw new ef.e(this.f4281b + " when parsing an Instant from \"" + ef.f.q(64, this.f4282c) + '\"');
    }

    public String toString() {
        switch (this.f4280a) {
            case 0:
                return this.f4281b + ", " + this.f4282c;
            case 1:
            default:
                return super.toString();
            case 2:
                return "Pair{" + ((Object) this.f4281b) + " " + ((Object) this.f4282c) + "}";
        }
    }

    public /* synthetic */ u(int i6, String str, String str2) {
        this.f4280a = i6;
        this.f4281b = str;
        this.f4282c = str2;
    }

    public u(String error, String str) {
        this.f4280a = 1;
        kotlin.jvm.internal.k.e(error, "error");
        this.f4281b = error;
        this.f4282c = str;
    }
}

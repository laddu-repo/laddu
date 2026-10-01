package h8;

import android.content.Context;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5997a;

    /* renamed from: b, reason: collision with root package name */
    public final p8.a f5998b;

    /* renamed from: c, reason: collision with root package name */
    public final p8.a f5999c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6000d;

    public b(Context context, p8.a aVar, p8.a aVar2, String str) {
        if (context != null) {
            this.f5997a = context;
            if (aVar != null) {
                this.f5998b = aVar;
                if (aVar2 != null) {
                    this.f5999c = aVar2;
                    if (str != null) {
                        this.f6000d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            b bVar = (b) ((d) obj);
            if (this.f5997a.equals(bVar.f5997a) && this.f5998b.equals(bVar.f5998b) && this.f5999c.equals(bVar.f5999c) && this.f6000d.equals(bVar.f6000d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f5997a.hashCode() ^ 1000003) * 1000003) ^ this.f5998b.hashCode()) * 1000003) ^ this.f5999c.hashCode()) * 1000003) ^ this.f6000d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f5997a);
        sb2.append(", wallClock=");
        sb2.append(this.f5998b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f5999c);
        sb2.append(", backendName=");
        return r4.a.o(sb2, this.f6000d, "}");
    }
}

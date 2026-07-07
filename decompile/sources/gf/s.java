package gf;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5699a;

    /* renamed from: b, reason: collision with root package name */
    public final i f5700b;

    /* renamed from: c, reason: collision with root package name */
    public final ve.l f5701c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5702d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f5703e;

    public s(Object obj, i iVar, ve.l lVar, Object obj2, Throwable th) {
        this.f5699a = obj;
        this.f5700b = iVar;
        this.f5701c = lVar;
        this.f5702d = obj2;
        this.f5703e = th;
    }

    public static s a(s sVar, i iVar, Throwable th, int i6) {
        Object obj = sVar.f5699a;
        if ((i6 & 2) != 0) {
            iVar = sVar.f5700b;
        }
        i iVar2 = iVar;
        ve.l lVar = sVar.f5701c;
        Object obj2 = sVar.f5702d;
        if ((i6 & 16) != 0) {
            th = sVar.f5703e;
        }
        return new s(obj, iVar2, lVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (kotlin.jvm.internal.k.a(this.f5699a, sVar.f5699a) && kotlin.jvm.internal.k.a(this.f5700b, sVar.f5700b) && kotlin.jvm.internal.k.a(this.f5701c, sVar.f5701c) && kotlin.jvm.internal.k.a(this.f5702d, sVar.f5702d) && kotlin.jvm.internal.k.a(this.f5703e, sVar.f5703e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i6 = 0;
        Object obj = this.f5699a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = hashCode * 31;
        i iVar = this.f5700b;
        if (iVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = iVar.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        ve.l lVar = this.f5701c;
        if (lVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = lVar.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Object obj2 = this.f5702d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Throwable th = this.f5703e;
        if (th != null) {
            i6 = th.hashCode();
        }
        return i13 + i6;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f5699a + ", cancelHandler=" + this.f5700b + ", onCancellation=" + this.f5701c + ", idempotentResume=" + this.f5702d + ", cancelCause=" + this.f5703e + ')';
    }

    public /* synthetic */ s(Object obj, i iVar, ve.l lVar, Throwable th, int i6) {
        this(obj, (i6 & 2) != 0 ? null : iVar, (i6 & 4) != 0 ? null : lVar, (Object) null, (i6 & 16) != 0 ? null : th);
    }
}

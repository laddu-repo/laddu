package kotlin.jvm.internal;

import java.io.Serializable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a implements h, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel = false;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public a(int i6, Object obj, Class cls, String str, String str2, int i10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.arity = i6;
        this.flags = i10 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.isTopLevel == aVar.isTopLevel && this.arity == aVar.arity && this.flags == aVar.flags && k.a(this.receiver, aVar.receiver) && k.a(this.owner, aVar.owner) && this.name.equals(aVar.name) && this.signature.equals(aVar.signature)) {
            return true;
        }
        return false;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    public bf.e getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            x.f8056a.getClass();
            return new o(cls);
        }
        return x.a(cls);
    }

    public int hashCode() {
        int i6;
        int i10;
        Object obj = this.receiver;
        int i11 = 0;
        if (obj != null) {
            i6 = obj.hashCode();
        } else {
            i6 = 0;
        }
        int i12 = i6 * 31;
        Class cls = this.owner;
        if (cls != null) {
            i11 = cls.hashCode();
        }
        int g10 = h8.c.g(this.signature, h8.c.g(this.name, (i12 + i11) * 31, 31), 31);
        if (this.isTopLevel) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((g10 + i10) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        x.f8056a.getClass();
        return y.a(this);
    }
}

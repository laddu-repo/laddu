package oe;

import h8.c;
import ie.d;
import ie.i;
import java.io.Serializable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends d implements a, Serializable {

    /* renamed from: x, reason: collision with root package name */
    public final Enum[] f10164x;

    public b(Enum[] enumArr) {
        this.f10164x = enumArr;
    }

    @Override // ie.a
    public final int a() {
        return this.f10164x.length;
    }

    @Override // ie.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r42 = (Enum) obj;
        if (((Enum) i.m0(r42.ordinal(), this.f10164x)) != r42) {
            return false;
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        Enum[] enumArr = this.f10164x;
        int length = enumArr.length;
        if (i6 >= 0 && i6 < length) {
            return enumArr[i6];
        }
        throw new IndexOutOfBoundsException(c.l("index: ", ", size: ", i6, length));
    }

    @Override // ie.d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        int ordinal = r42.ordinal();
        if (((Enum) i.m0(ordinal, this.f10164x)) != r42) {
            return -1;
        }
        return ordinal;
    }

    @Override // ie.d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        int ordinal = r42.ordinal();
        if (((Enum) i.m0(ordinal, this.f10164x)) != r42) {
            return -1;
        }
        return ordinal;
    }
}

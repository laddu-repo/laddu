package com.google.protobuf;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n3 implements Iterator {

    /* renamed from: x, reason: collision with root package name */
    public final ArrayDeque f2996x;

    /* renamed from: y, reason: collision with root package name */
    public s f2997y;

    public n3(ByteString byteString) {
        if (byteString instanceof p3) {
            p3 p3Var = (p3) byteString;
            ArrayDeque arrayDeque = new ArrayDeque(p3Var.B);
            this.f2996x = arrayDeque;
            arrayDeque.push(p3Var);
            ByteString byteString2 = p3Var.f3017y;
            while (byteString2 instanceof p3) {
                p3 p3Var2 = (p3) byteString2;
                this.f2996x.push(p3Var2);
                byteString2 = p3Var2.f3017y;
            }
            this.f2997y = (s) byteString2;
            return;
        }
        this.f2996x = null;
        this.f2997y = (s) byteString;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final s next() {
        s sVar;
        s sVar2 = this.f2997y;
        if (sVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f2996x;
            if (arrayDeque != null && !arrayDeque.isEmpty()) {
                ByteString byteString = ((p3) arrayDeque.pop()).f3018z;
                while (byteString instanceof p3) {
                    p3 p3Var = (p3) byteString;
                    arrayDeque.push(p3Var);
                    byteString = p3Var.f3017y;
                }
                sVar = (s) byteString;
            } else {
                sVar = null;
                break;
            }
        } while (sVar.isEmpty());
        this.f2997y = sVar;
        return sVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2997y != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

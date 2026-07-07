package db;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q0 extends q1 {
    public final Iterator A;
    public final /* synthetic */ Object B;

    /* renamed from: x, reason: collision with root package name */
    public int f4032x;

    /* renamed from: y, reason: collision with root package name */
    public Object f4033y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f4034z;

    public q0() {
        this.f4032x = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i6 = this.f4032x;
        if (i6 != 4) {
            int c10 = y.e.c(i6);
            if (c10 == 0) {
                return true;
            }
            if (c10 != 2) {
                this.f4032x = 4;
                switch (this.f4034z) {
                    case 0:
                        do {
                            Iterator it = this.A;
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                this.f4032x = 3;
                                next = null;
                                break;
                            }
                        } while (!((cb.h) this.B).apply(next));
                    default:
                        do {
                            Iterator it2 = this.A;
                            if (it2.hasNext()) {
                                next = it2.next();
                            } else {
                                this.f4032x = 3;
                                next = null;
                                break;
                            }
                        } while (!((k1) this.B).f4010y.contains(next));
                }
                this.f4033y = next;
                if (this.f4032x != 3) {
                    this.f4032x = 1;
                    return true;
                }
                return false;
            }
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f4032x = 2;
            Object obj = this.f4033y;
            this.f4033y = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q0(Iterator it, cb.h hVar) {
        this();
        this.f4034z = 0;
        this.A = it;
        this.B = hVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q0(k1 k1Var) {
        this();
        this.f4034z = 1;
        this.B = k1Var;
        this.A = k1Var.f4009x.iterator();
    }
}

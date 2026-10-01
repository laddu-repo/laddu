package f1;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import t0.q0;
import ua.f;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c {
    public Object A;

    /* renamed from: x, reason: collision with root package name */
    public int f4630x;

    /* renamed from: y, reason: collision with root package name */
    public int f4631y;

    /* renamed from: z, reason: collision with root package name */
    public int f4632z;

    public c() {
        if (f.f12975y == null) {
            f.f12975y = new f(11);
        }
    }

    public int a(int i6) {
        if (i6 < this.f4632z) {
            return ((ByteBuffer) this.A).getShort(this.f4631y + i6);
        }
        return 0;
    }

    public void b() {
        if (((je.f) this.A).E == this.f4632z) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i6 = this.f4630x;
            je.f fVar = (je.f) this.A;
            if (i6 < fVar.C && fVar.f7430z[i6] < 0) {
                this.f4630x = i6 + 1;
            } else {
                return;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        t0.b bVar;
        if (Build.VERSION.SDK_INT >= this.f4631y) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f4631y) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f4630x);
            if (!((Class) this.A).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate d10 = q0.d(view);
            if (d10 == null) {
                bVar = null;
            } else if (d10 instanceof t0.a) {
                bVar = ((t0.a) d10).f12313a;
            } else {
                bVar = new t0.b(d10);
            }
            if (bVar == null) {
                bVar = new t0.b();
            }
            q0.r(view, bVar);
            view.setTag(this.f4630x, obj);
            q0.j(view, this.f4632z);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        if (this.f4630x < ((je.f) this.A).C) {
            return true;
        }
        return false;
    }

    public void remove() {
        je.f fVar = (je.f) this.A;
        b();
        if (this.f4631y != -1) {
            fVar.c();
            fVar.l(this.f4631y);
            this.f4631y = -1;
            this.f4632z = fVar.E;
            return;
        }
        throw new IllegalStateException("Call next() before removing element from the iterator.");
    }
}

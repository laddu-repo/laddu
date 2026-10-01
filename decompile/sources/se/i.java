package se;

import cf.o;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i implements Iterator, we.a {

    /* renamed from: x, reason: collision with root package name */
    public String f12306x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f12307y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ o f12308z;

    public i(o oVar) {
        this.f12308z = oVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f12306x == null && !this.f12307y) {
            String readLine = ((BufferedReader) this.f12308z.f2073b).readLine();
            this.f12306x = readLine;
            if (readLine == null) {
                this.f12307y = true;
            }
        }
        if (this.f12306x != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            String str = this.f12306x;
            this.f12306x = null;
            k.b(str);
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

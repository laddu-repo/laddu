package cf;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f implements Iterator, we.a {
    public Object A;
    public final /* synthetic */ j B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2055x;

    /* renamed from: y, reason: collision with root package name */
    public Object f2056y;

    /* renamed from: z, reason: collision with root package name */
    public int f2057z;

    public f(i iVar) {
        this.f2055x = 2;
        this.B = iVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.A = arrayDeque;
        File rootFile = (File) iVar.f2065b;
        if (rootFile.isDirectory()) {
            arrayDeque.push(c(rootFile));
        } else if (rootFile.isFile()) {
            kotlin.jvm.internal.k.e(rootFile, "rootFile");
            arrayDeque.push(new se.f(rootFile));
        } else {
            this.f2057z = 2;
        }
    }

    public void a() {
        g gVar = (g) this.B;
        Iterator it = (Iterator) this.f2056y;
        while (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) gVar.f2060c.invoke(next)).booleanValue() == gVar.f2059b) {
                this.A = next;
                this.f2057z = 1;
                return;
            }
        }
        this.f2057z = 0;
    }

    public void b() {
        Iterator it = (Iterator) this.f2056y;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((t) this.B).f2084c.invoke(next)).booleanValue()) {
                this.f2057z = 1;
                this.A = next;
                return;
            }
        }
        this.f2057z = 0;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [se.b, se.f] */
    /* JADX WARN: Type inference failed for: r0v6, types: [se.b, se.f] */
    public se.b c(File rootDir) {
        int ordinal = ((se.g) ((i) this.B).f2066c).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                kotlin.jvm.internal.k.e(rootDir, "rootDir");
                return new se.f(rootDir);
            }
            throw new RuntimeException();
        }
        kotlin.jvm.internal.k.e(rootDir, "rootDir");
        return new se.f(rootDir);
    }

    public boolean d() {
        File file;
        File a10;
        this.f2057z = 3;
        ArrayDeque arrayDeque = (ArrayDeque) this.A;
        while (true) {
            se.f fVar = (se.f) arrayDeque.peek();
            if (fVar == null) {
                file = null;
                break;
            }
            a10 = fVar.a();
            if (a10 == null) {
                arrayDeque.pop();
            } else {
                if (a10.equals(fVar.f12303a) || !a10.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                    break;
                }
                arrayDeque.push(c(a10));
            }
        }
        file = a10;
        if (file != null) {
            this.f2056y = file;
            this.f2057z = 1;
        } else {
            this.f2057z = 2;
        }
        if (this.f2057z == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2055x) {
            case 0:
                if (this.f2057z == -1) {
                    a();
                }
                if (this.f2057z == 1) {
                    return true;
                }
                return false;
            case 1:
                if (this.f2057z == -1) {
                    b();
                }
                if (this.f2057z == 1) {
                    return true;
                }
                return false;
            default:
                int i6 = this.f2057z;
                if (i6 != 0) {
                    if (i6 == 1) {
                        return true;
                    }
                    if (i6 == 2) {
                        return false;
                    }
                    throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
                }
                return d();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2055x) {
            case 0:
                if (this.f2057z == -1) {
                    a();
                }
                if (this.f2057z != 0) {
                    Object obj = this.A;
                    this.A = null;
                    this.f2057z = -1;
                    return obj;
                }
                throw new NoSuchElementException();
            case 1:
                if (this.f2057z == -1) {
                    b();
                }
                if (this.f2057z != 0) {
                    Object obj2 = this.A;
                    this.A = null;
                    this.f2057z = -1;
                    return obj2;
                }
                throw new NoSuchElementException();
            default:
                int i6 = this.f2057z;
                if (i6 == 1) {
                    this.f2057z = 0;
                    return (File) this.f2056y;
                }
                if (i6 != 2 && d()) {
                    this.f2057z = 0;
                    return (File) this.f2056y;
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2055x) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(g gVar) {
        this.f2055x = 0;
        this.B = gVar;
        this.f2056y = gVar.f2058a.iterator();
        this.f2057z = -1;
    }

    public f(t tVar) {
        this.f2055x = 1;
        this.B = tVar;
        this.f2056y = tVar.f2083b.iterator();
        this.f2057z = -1;
    }
}

package df;

import ie.x;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i extends ie.d {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f4136x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final Object f4137y;

    public i(c6.h hVar) {
        this.f4137y = hVar;
    }

    @Override // ie.a
    public final int a() {
        switch (this.f4136x) {
            case 0:
                return ((Matcher) ((c6.h) this.f4137y).f1981x).groupCount() + 1;
            default:
                return ((List) this.f4137y).size();
        }
    }

    @Override // ie.a, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f4136x) {
            case 0:
                if (!(obj instanceof String)) {
                    return false;
                }
                return super.contains((String) obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i6) {
        switch (this.f4136x) {
            case 0:
                String group = ((Matcher) ((c6.h) this.f4137y).f1981x).group(i6);
                if (group == null) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                return group;
            default:
                List list = (List) this.f4137y;
                if (i6 >= 0 && i6 <= ie.k.s(this)) {
                    return list.get(ie.k.s(this) - i6);
                }
                StringBuilder n10 = h8.c.n(i6, "Element index ", " must be in range [");
                n10.append(new af.a(0, ie.k.s(this), 1));
                n10.append("].");
                throw new IndexOutOfBoundsException(n10.toString());
        }
    }

    @Override // ie.d, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f4136x) {
            case 0:
                if (!(obj instanceof String)) {
                    return -1;
                }
                return super.indexOf((String) obj);
            default:
                return super.indexOf(obj);
        }
    }

    @Override // ie.d, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f4136x) {
            case 1:
                return new x(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // ie.d, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f4136x) {
            case 0:
                if (!(obj instanceof String)) {
                    return -1;
                }
                return super.lastIndexOf((String) obj);
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // ie.d, java.util.List
    public ListIterator listIterator() {
        switch (this.f4136x) {
            case 1:
                return new x(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // ie.d, java.util.List
    public ListIterator listIterator(int i6) {
        switch (this.f4136x) {
            case 1:
                return new x(this, i6);
            default:
                return super.listIterator(i6);
        }
    }

    public i(List delegate) {
        kotlin.jvm.internal.k.e(delegate, "delegate");
        this.f4137y = delegate;
    }
}

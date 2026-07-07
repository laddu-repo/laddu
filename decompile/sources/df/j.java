package df;

import java.util.Iterator;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j extends ie.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c6.h f4138x;

    public j(c6.h hVar) {
        this.f4138x = hVar;
    }

    @Override // ie.a
    public final int a() {
        return ((Matcher) this.f4138x.f1981x).groupCount() + 1;
    }

    public final h b(int i6) {
        Matcher matcher = (Matcher) this.f4138x.f1981x;
        af.c w10 = android.support.v4.media.session.b.w(matcher.start(i6), matcher.end(i6));
        if (w10.f709x >= 0) {
            String group = matcher.group(i6);
            kotlin.jvm.internal.k.d(group, "group(...)");
            return new h(group, w10);
        }
        return null;
    }

    @Override // ie.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof h;
        }
        if (!z10) {
            return false;
        }
        return super.contains((h) obj);
    }

    @Override // ie.a, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new cf.u(new cf.t(ie.j.C(new af.a(0, a() - 1, 1)), new cf.n(this, 1), 1));
    }
}

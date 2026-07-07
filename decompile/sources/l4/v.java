package l4;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.lifecycle.j1;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v extends u implements Iterable, we.a {
    public static final /* synthetic */ int E = 0;
    public final s8.n D;

    public v(w wVar) {
        super(wVar);
        this.D = new s8.n(this);
    }

    @Override // l4.u
    public final t e(j1 j1Var) {
        t e10 = super.e(j1Var);
        s8.n nVar = this.D;
        nVar.getClass();
        return nVar.f(e10, j1Var, false, (v) nVar.f12260b);
    }

    @Override // l4.u
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof v) && super.equals(obj)) {
                s8.n nVar = this.D;
                int f3 = ((v.m) nVar.f12261c).f();
                s8.n nVar2 = ((v) obj).D;
                if (f3 == ((v.m) nVar2.f12261c).f() && nVar.f12259a == nVar2.f12259a) {
                    v.m mVar = (v.m) nVar.f12261c;
                    kotlin.jvm.internal.k.e(mVar, "<this>");
                    Iterator it = ((cf.a) cf.l.K(new he.p(mVar, 9))).iterator();
                    while (it.hasNext()) {
                        u uVar = (u) it.next();
                        if (!uVar.equals(((v.m) nVar2.f12261c).c(uVar.f8195y.f9924a))) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // l4.u
    public final void f(Context context, AttributeSet attributeSet) {
        String valueOf;
        super.f(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, m4.a.f8602d);
        kotlin.jvm.internal.k.d(obtainAttributes, "obtainAttributes(...)");
        int resourceId = obtainAttributes.getResourceId(0, 0);
        s8.n nVar = this.D;
        v vVar = (v) nVar.f12260b;
        if (resourceId != vVar.f8195y.f9924a) {
            nVar.f12259a = resourceId;
            nVar.f12262d = null;
            if (resourceId <= 16777215) {
                valueOf = String.valueOf(resourceId);
            } else {
                try {
                    valueOf = context.getResources().getResourceName(resourceId);
                    kotlin.jvm.internal.k.b(valueOf);
                } catch (Resources.NotFoundException unused) {
                    valueOf = String.valueOf(resourceId);
                }
            }
            nVar.f12262d = valueOf;
            obtainAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + vVar).toString());
    }

    public final void g(u node) {
        kotlin.jvm.internal.k.e(node, "node");
        s8.n nVar = this.D;
        v.m mVar = (v.m) nVar.f12261c;
        v vVar = (v) nVar.f12260b;
        o4.j jVar = node.f8195y;
        int i6 = jVar.f9924a;
        String str = (String) jVar.f9927d;
        if (i6 == 0 && str == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        String str2 = (String) vVar.f8195y.f9927d;
        if (str2 != null && kotlin.jvm.internal.k.a(str, str2)) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + vVar).toString());
        }
        if (i6 != vVar.f8195y.f9924a) {
            u uVar = (u) mVar.c(i6);
            if (uVar == node) {
                return;
            }
            if (node.f8196z == null) {
                if (uVar != null) {
                    uVar.f8196z = null;
                }
                node.f8196z = vVar;
                mVar.e(jVar.f9924a, node);
                return;
            }
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + vVar).toString());
    }

    public final u h(int i6) {
        s8.n nVar = this.D;
        return nVar.b(i6, (v) nVar.f12260b, null, false);
    }

    @Override // l4.u
    public final int hashCode() {
        s8.n nVar = this.D;
        int i6 = nVar.f12259a;
        v.m mVar = (v.m) nVar.f12261c;
        int f3 = mVar.f();
        for (int i10 = 0; i10 < f3; i10++) {
            i6 = (((i6 * 31) + mVar.d(i10)) * 31) + ((u) mVar.g(i10)).hashCode();
        }
        return i6;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        s8.n nVar = this.D;
        nVar.getClass();
        return new o4.k(nVar);
    }

    public final t j(j1 j1Var, u uVar) {
        return this.D.f(super.e(j1Var), j1Var, true, uVar);
    }

    @Override // l4.u
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        s8.n nVar = this.D;
        nVar.getClass();
        nVar.getClass();
        u h4 = h(nVar.f12259a);
        sb2.append(" startDestination=");
        if (h4 == null) {
            String str = (String) nVar.f12262d;
            if (str != null) {
                sb2.append(str);
            } else {
                sb2.append("0x" + Integer.toHexString(nVar.f12259a));
            }
        } else {
            sb2.append("{");
            sb2.append(h4.toString());
            sb2.append("}");
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.k.d(sb3, "toString(...)");
        return sb3;
    }
}

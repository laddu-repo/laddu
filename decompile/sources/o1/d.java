package o1;

import androidx.lifecycle.k1;
import androidx.lifecycle.n1;
import java.util.Arrays;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final f[] f9849a;

    public d(f... initializers) {
        k.e(initializers, "initializers");
        this.f9849a = initializers;
    }

    @Override // androidx.lifecycle.n1
    public final k1 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @Override // androidx.lifecycle.n1
    public final /* synthetic */ k1 b(kotlin.jvm.internal.e eVar, e eVar2) {
        return r4.a.a(this, eVar, eVar2);
    }

    @Override // androidx.lifecycle.n1
    public final k1 c(Class cls, e eVar) {
        k1 k1Var;
        f fVar;
        kotlin.jvm.internal.e a10 = x.a(cls);
        f[] fVarArr = this.f9849a;
        f[] initializers = (f[]) Arrays.copyOf(fVarArr, fVarArr.length);
        k.e(initializers, "initializers");
        int length = initializers.length;
        int i6 = 0;
        while (true) {
            k1Var = null;
            if (i6 < length) {
                fVar = initializers[i6];
                if (fVar.f9850a.equals(a10)) {
                    break;
                }
                i6++;
            } else {
                fVar = null;
                break;
            }
        }
        if (fVar != null) {
            k1Var = (k1) fVar.f9851b.invoke(eVar);
        }
        if (k1Var != null) {
            return k1Var;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + a10.b()).toString());
    }
}

package n4;

import androidx.lifecycle.r0;
import cf.n;
import nd.b0;
import ve.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements r0, kotlin.jvm.internal.g {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9057x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l f9058y;

    public /* synthetic */ i(l lVar, int i6) {
        this.f9057x = i6;
        this.f9058y = lVar;
    }

    @Override // androidx.lifecycle.r0
    public final /* synthetic */ void a(Object obj) {
        switch (this.f9057x) {
            case 0:
                ((fd.f) this.f9058y).invoke(obj);
                return;
            case 1:
                ((n) this.f9058y).invoke(obj);
                return;
            case 2:
                ((n) this.f9058y).invoke(obj);
                return;
            default:
                ((b0) this.f9058y).invoke(obj);
                return;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f9057x) {
            case 0:
                if ((obj instanceof r0) && (obj instanceof kotlin.jvm.internal.g)) {
                    return ((fd.f) this.f9058y).equals(((kotlin.jvm.internal.g) obj).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj instanceof r0) && (obj instanceof kotlin.jvm.internal.g)) {
                    return ((n) this.f9058y).equals(((kotlin.jvm.internal.g) obj).getFunctionDelegate());
                }
                return false;
            case 2:
                if ((obj instanceof r0) && (obj instanceof kotlin.jvm.internal.g)) {
                    return ((n) this.f9058y).equals(((kotlin.jvm.internal.g) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof r0) && (obj instanceof kotlin.jvm.internal.g)) {
                    return ((b0) this.f9058y).equals(((kotlin.jvm.internal.g) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    @Override // kotlin.jvm.internal.g
    public final he.c getFunctionDelegate() {
        switch (this.f9057x) {
            case 0:
                return (fd.f) this.f9058y;
            case 1:
                return (n) this.f9058y;
            case 2:
                return (n) this.f9058y;
            default:
                return (b0) this.f9058y;
        }
    }

    public final int hashCode() {
        switch (this.f9057x) {
            case 0:
                return ((fd.f) this.f9058y).hashCode();
            case 1:
                return ((n) this.f9058y).hashCode();
            case 2:
                return ((n) this.f9058y).hashCode();
            default:
                return ((b0) this.f9058y).hashCode();
        }
    }
}

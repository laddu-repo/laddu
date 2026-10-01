package fd;

import androidx.lifecycle.r0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements r0, kotlin.jvm.internal.g {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5217x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ve.l f5218y;

    public /* synthetic */ w(ve.l lVar, int i6) {
        this.f5217x = i6;
        this.f5218y = lVar;
    }

    @Override // androidx.lifecycle.r0
    public final /* synthetic */ void a(Object obj) {
        switch (this.f5217x) {
            case 0:
                this.f5218y.invoke(obj);
                return;
            case 1:
                this.f5218y.invoke(obj);
                return;
            case 2:
                this.f5218y.invoke(obj);
                return;
            default:
                this.f5218y.invoke(obj);
                return;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f5217x) {
            case 0:
                if ((obj instanceof r0) && (obj instanceof kotlin.jvm.internal.g)) {
                    return this.f5218y.equals(((kotlin.jvm.internal.g) obj).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj instanceof r0) && (obj instanceof kotlin.jvm.internal.g)) {
                    return this.f5218y.equals(((kotlin.jvm.internal.g) obj).getFunctionDelegate());
                }
                return false;
            case 2:
                if ((obj instanceof r0) && (obj instanceof kotlin.jvm.internal.g)) {
                    return this.f5218y.equals(((kotlin.jvm.internal.g) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof r0) && (obj instanceof kotlin.jvm.internal.g)) {
                    return this.f5218y.equals(((kotlin.jvm.internal.g) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    @Override // kotlin.jvm.internal.g
    public final he.c getFunctionDelegate() {
        switch (this.f5217x) {
            case 0:
                return this.f5218y;
            case 1:
                return this.f5218y;
            case 2:
                return this.f5218y;
            default:
                return this.f5218y;
        }
    }

    public final int hashCode() {
        switch (this.f5217x) {
            case 0:
                return this.f5218y.hashCode();
            case 1:
                return this.f5218y.hashCode();
            case 2:
                return this.f5218y.hashCode();
            default:
                return this.f5218y.hashCode();
        }
    }
}

package gf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5659b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final i0[] f5660a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public e(i0[] i0VarArr) {
        this.f5660a = i0VarArr;
        this.notCompletedCount$volatile = i0VarArr.length;
    }
}

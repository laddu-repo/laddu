package com.unity3d.services.ads.operation.load;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f3406x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ LoadOperationState f3407y;

    public /* synthetic */ a(LoadOperationState loadOperationState, int i6) {
        this.f3406x = i6;
        this.f3407y = loadOperationState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3406x) {
            case 0:
                LoadModuleDecoratorTimeout.a(this.f3407y);
                return;
            default:
                LoadOperationState.a(this.f3407y);
                return;
        }
    }
}

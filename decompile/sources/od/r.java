package od;

import okhttp3.CacheControl;
import okhttp3.Request;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements ve.l {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f10141x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r7.a f10142y;

    public /* synthetic */ r(r7.a aVar, int i6) {
        this.f10141x = i6;
        this.f10142y = aVar;
    }

    @Override // ve.l
    public final Object invoke(Object obj) {
        y7.c Get = (y7.c) obj;
        switch (this.f10141x) {
            case 0:
                kotlin.jvm.internal.k.e(Get, "$this$Get");
                Request.Builder builder = Get.f15009d;
                r7.a aVar = this.f10142y;
                builder.tag(r7.a.class, aVar);
                if (aVar == r7.a.f11841y) {
                    CacheControl cacheControl = CacheControl.FORCE_NETWORK;
                    kotlin.jvm.internal.k.e(cacheControl, "cacheControl");
                    builder.cacheControl(cacheControl);
                }
                return he.y.f6101a;
            default:
                kotlin.jvm.internal.k.e(Get, "$this$Get");
                Request.Builder builder2 = Get.f15009d;
                r7.a aVar2 = this.f10142y;
                builder2.tag(r7.a.class, aVar2);
                if (aVar2 == r7.a.f11841y) {
                    CacheControl cacheControl2 = CacheControl.FORCE_NETWORK;
                    kotlin.jvm.internal.k.e(cacheControl2, "cacheControl");
                    builder2.cacheControl(cacheControl2);
                }
                return he.y.f6101a;
        }
    }
}

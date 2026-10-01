package x4;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f14593a;

    public k(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f14593a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object cookie) {
        e callback = (e) iInterface;
        kotlin.jvm.internal.k.e(callback, "callback");
        kotlin.jvm.internal.k.e(cookie, "cookie");
        this.f14593a.f1161y.remove((Integer) cookie);
    }
}

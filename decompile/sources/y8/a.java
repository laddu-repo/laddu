package y8;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements IInterface {

    /* renamed from: e, reason: collision with root package name */
    public final IBinder f15011e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15012f;

    public a(IBinder iBinder, String str) {
        this.f15011e = iBinder;
        this.f15012f = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15011e;
    }
}

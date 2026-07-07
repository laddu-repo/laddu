package s8;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements s9.a, s9.g {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f12237x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ d f12235y = new d(0);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ d f12236z = new d(1);
    public static final /* synthetic */ d A = new d(2);

    public /* synthetic */ d(int i6) {
        this.f12237x = i6;
    }

    @Override // s9.g
    public s9.n b(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i6 = b.f12225h;
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return dg.b.j(null);
        }
        return dg.b.j(bundle);
    }

    @Override // s9.a
    public Object e(Task task) {
        switch (this.f12237x) {
            case 0:
                if (task.h()) {
                    return (Bundle) task.f();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.e())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.e());
            default:
                Intent intent = (Intent) ((Bundle) task.f()).getParcelable("notification_data");
                if (intent != null) {
                    return new a(intent);
                }
                return null;
        }
    }
}

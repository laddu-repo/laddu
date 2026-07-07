package i4;

import android.os.Bundle;
import com.playfy.tv.activities.PlayerActivity;
import java.util.HashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class u {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f6564b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f6565c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final b0 f6566a;

    public u(PlayerActivity playerActivity, String str, fd.a0 a0Var, db.k0 k0Var, db.k0 k0Var2, db.k0 k0Var3, zb.d dVar, Bundle bundle, Bundle bundle2, j4.b0 b0Var) {
        synchronized (f6564b) {
            HashMap hashMap = f6565c;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, this);
            } else {
                throw new IllegalStateException("Session ID must be unique. ID=".concat(str));
            }
        }
        this.f6566a = new b0(this, playerActivity, str, a0Var, k0Var, k0Var2, k0Var3, dVar, bundle, bundle2, b0Var);
    }

    public final void a() {
        try {
            synchronized (f6564b) {
                f6565c.remove(this.f6566a.f6309i);
            }
            this.f6566a.r();
        } catch (Exception unused) {
        }
    }
}

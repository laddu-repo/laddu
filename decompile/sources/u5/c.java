package u5;

import android.os.Build;
import java.util.HashSet;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c implements m {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f12906c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f12907a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12908b;

    public c(String str, String str2) {
        this.f12907a = str;
        this.f12908b = str2;
        f12906c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f12904a;
        String str = this.f12908b;
        if (!hashSet.contains(str)) {
            String str2 = Build.TYPE;
            if ((!"eng".equals(str2) && !"userdebug".equals(str2)) || !hashSet.contains(str.concat(":dev"))) {
                return false;
            }
            return true;
        }
        return true;
    }
}

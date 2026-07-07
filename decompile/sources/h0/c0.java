package h0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c0 implements Iterable {

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f5763x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public final Context f5764y;

    public c0(Context context) {
        this.f5764y = context;
    }

    public final void a(ComponentName componentName) {
        Context context = this.f5764y;
        ArrayList arrayList = this.f5763x;
        int size = arrayList.size();
        try {
            for (Intent a10 = f.a(context, componentName); a10 != null; a10 = f.a(context, a10.getComponent())) {
                arrayList.add(size, a10);
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public final void b() {
        ArrayList arrayList = this.f5763x;
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            this.f5764y.startActivities(intentArr, null);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f5763x.iterator();
    }
}

package ga;

import android.os.Bundle;
import java.util.ArrayList;
import k8.e2;
import t7.y;
import y9.i0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mb.b f5795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f5796b = null;

    public c(mb.b bVar) {
        this.f5795a = bVar;
    }

    public static boolean a(ArrayList arrayList, b bVar) {
        String str = bVar.f5790a;
        String str2 = bVar.f5791b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            b bVar2 = (b) obj;
            if (bVar2.f5790a.equals(str) && bVar2.f5791b.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList b() {
        ja.c cVar = (ja.c) ((ja.b) this.f5795a.get());
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : cVar.f7002a.f3300a.f("frc", "")) {
            i0 i0Var = ka.a.f7864a;
            y.g(bundle);
            ja.a aVar = new ja.a();
            String str = (String) e2.e(bundle, "origin", String.class, null);
            y.g(str);
            aVar.f6988a = str;
            String str2 = (String) e2.e(bundle, "name", String.class, null);
            y.g(str2);
            aVar.f6989b = str2;
            aVar.f6990c = e2.e(bundle, "value", Object.class, null);
            aVar.f6991d = (String) e2.e(bundle, "trigger_event_name", String.class, null);
            aVar.f6992e = ((Long) e2.e(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            aVar.f = (String) e2.e(bundle, "timed_out_event_name", String.class, null);
            aVar.f6993g = (Bundle) e2.e(bundle, "timed_out_event_params", Bundle.class, null);
            aVar.f6994h = (String) e2.e(bundle, "triggered_event_name", String.class, null);
            aVar.i = (Bundle) e2.e(bundle, "triggered_event_params", Bundle.class, null);
            aVar.f6995j = ((Long) e2.e(bundle, "time_to_live", Long.class, 0L)).longValue();
            aVar.f6996k = (String) e2.e(bundle, "expired_event_name", String.class, null);
            aVar.f6997l = (Bundle) e2.e(bundle, "expired_event_params", Bundle.class, null);
            aVar.f6999n = ((Boolean) e2.e(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            aVar.f6998m = ((Long) e2.e(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            aVar.f7000o = ((Long) e2.e(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:93:0x027d  */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r22v0, types: [android.os.Bundle, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.util.ArrayList r24) throws ga.a {
        /*
            Method dump skipped, instruction units count: 874
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.c.c(java.util.ArrayList):void");
    }
}

package ef;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5025a;

    public p(int i) {
        switch (i) {
            case 1:
                this.f5025a = new ArrayList();
                break;
            default:
                this.f5025a = new ArrayList(20);
                break;
        }
    }

    public void a(String str, String str2) {
        de.i.e(str, "name");
        de.i.e(str2, "value");
        b8.h.x(str);
        b8.h.y(str2, str);
        b8.h.i(this, str, str2);
    }

    public q b() {
        return new q((String[]) this.f5025a.toArray(new String[0]));
    }

    public void c(String str) {
        de.i.e(str, "name");
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5025a;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }
}

package g6;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f5684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Map f5685c;

    public m(Map map) {
        this.f5684b = Collections.unmodifiableMap(map);
    }

    @Override // g6.j
    public final Map a() {
        if (this.f5685c == null) {
            synchronized (this) {
                try {
                    if (this.f5685c == null) {
                        this.f5685c = Collections.unmodifiableMap(b());
                    }
                } finally {
                }
            }
        }
        return this.f5685c;
    }

    public final HashMap b() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f5684b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((l) list.get(i)).f5683a;
                if (!TextUtils.isEmpty(str)) {
                    sb2.append(str);
                    if (i != list.size() - 1) {
                        sb2.append(',');
                    }
                }
            }
            String string = sb2.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put((String) entry.getKey(), string);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f5684b.equals(((m) obj).f5684b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5684b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f5684b + '}';
    }
}

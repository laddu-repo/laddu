package e5;

import android.os.Bundle;
import androidx.lifecycle.t;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final f5.b f4354a;

    /* renamed from: b, reason: collision with root package name */
    public a f4355b;

    public e(f5.b bVar) {
        this.f4354a = bVar;
    }

    public final Bundle a(String str) {
        Bundle bundle;
        f5.b bVar = this.f4354a;
        if (bVar.f5019b) {
            Bundle bundle2 = (Bundle) bVar.f5025h;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2.containsKey(str)) {
                bundle = bundle2.getBundle(str);
                if (bundle == null) {
                    android.support.v4.media.session.b.m(str);
                    throw null;
                }
            } else {
                bundle = null;
            }
            bundle2.remove(str);
            if (bundle2.isEmpty()) {
                bVar.f5025h = null;
            }
            return bundle;
        }
        throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
    }

    public final d b() {
        d dVar;
        f5.b bVar = this.f4354a;
        synchronized (((ua.f) bVar.f5023f)) {
            Iterator it = ((LinkedHashMap) bVar.f5024g).entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                d dVar2 = (d) entry.getValue();
                if (k.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    dVar = dVar2;
                }
            } while (dVar == null);
        }
        return dVar;
    }

    public final void c(String str, d provider) {
        k.e(provider, "provider");
        f5.b bVar = this.f4354a;
        synchronized (((ua.f) bVar.f5023f)) {
            if (!((LinkedHashMap) bVar.f5024g).containsKey(str)) {
                ((LinkedHashMap) bVar.f5024g).put(str, provider);
            } else {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
        }
    }

    public final void d() {
        if (this.f4354a.f5020c) {
            a aVar = this.f4355b;
            if (aVar == null) {
                aVar = new a(this);
            }
            this.f4355b = aVar;
            try {
                t.class.getDeclaredConstructor(null);
                a aVar2 = this.f4355b;
                if (aVar2 != null) {
                    ((LinkedHashSet) aVar2.f4351b).add(t.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e10) {
                throw new IllegalArgumentException("Class " + t.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
}

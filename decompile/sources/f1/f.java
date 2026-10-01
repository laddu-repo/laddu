package f1;

import android.content.SharedPreferences;
import de.i;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f5134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f5135b;

    public f(SharedPreferences sharedPreferences, Set set) {
        i.e(sharedPreferences, "prefs");
        this.f5134a = sharedPreferences;
        this.f5135b = set;
    }
}

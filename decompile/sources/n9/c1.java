package n9;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c1 extends u1 {
    public static final Pair X = new Pair(HttpUrl.FRAGMENT_ENCODE_SET, 0L);
    public SharedPreferences A;
    public SharedPreferences B;
    public i4.m0 C;
    public final a2.d2 D;
    public final a2.c E;
    public String F;
    public boolean G;
    public long H;
    public final a2.d2 I;
    public final b1 J;
    public final a2.c K;
    public final c6.h L;
    public final b1 M;
    public final a2.d2 N;
    public final a2.d2 O;
    public boolean P;
    public final b1 Q;
    public final b1 R;
    public final a2.d2 S;
    public final a2.c T;
    public final a2.c U;
    public final a2.d2 V;
    public final c6.h W;

    public c1(n1 n1Var) {
        super(n1Var);
        this.I = new a2.d2(this, "session_timeout", 1800000L);
        this.J = new b1(this, "start_new_session", true);
        this.N = new a2.d2(this, "last_pause_time", 0L);
        this.O = new a2.d2(this, "session_id", 0L);
        this.K = new a2.c(this, "non_personalized_ads");
        this.L = new c6.h(this, "last_received_uri_timestamps_by_source");
        this.M = new b1(this, "allow_remote_dynamite", false);
        this.D = new a2.d2(this, "first_open_time", 0L);
        w8.x.d("app_install_time");
        this.E = new a2.c(this, "app_instance_id");
        this.Q = new b1(this, "app_backgrounded", false);
        this.R = new b1(this, "deep_link_retrieval_complete", false);
        this.S = new a2.d2(this, "deep_link_retrieval_attempts", 0L);
        this.T = new a2.c(this, "firebase_feature_rollouts");
        this.U = new a2.c(this, "deferred_attribution_cache");
        this.V = new a2.d2(this, "deferred_attribution_cache_timestamp", 0L);
        this.W = new c6.h(this, "default_event_parameters");
    }

    @Override // n9.u1
    public final boolean e1() {
        return true;
    }

    public final SharedPreferences h1() {
        d1();
        f1();
        w8.x.g(this.A);
        return this.A;
    }

    public final SharedPreferences i1() {
        d1();
        f1();
        if (this.B == null) {
            n1 n1Var = (n1) this.f4301y;
            String valueOf = String.valueOf(n1Var.f9413x.getPackageName());
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            s0 s0Var = u0Var.L;
            String concat = valueOf.concat("_preferences");
            s0Var.b(concat, "Default prefs file");
            this.B = n1Var.f9413x.getSharedPreferences(concat, 0);
        }
        return this.B;
    }

    public final SparseArray j1() {
        Bundle C = this.L.C();
        int[] intArray = C.getIntArray("uriSources");
        long[] longArray = C.getLongArray("uriTimestamps");
        if (intArray != null && longArray != null) {
            if (intArray.length != longArray.length) {
                u0 u0Var = ((n1) this.f4301y).C;
                n1.g(u0Var);
                u0Var.D.a("Trigger URI source and timestamp array lengths do not match");
                return new SparseArray();
            }
            SparseArray sparseArray = new SparseArray();
            for (int i6 = 0; i6 < intArray.length; i6++) {
                sparseArray.put(intArray[i6], Long.valueOf(longArray[i6]));
            }
            return sparseArray;
        }
        return new SparseArray();
    }

    public final z1 k1() {
        d1();
        return z1.c(h1().getInt("consent_source", 100), h1().getString("consent_settings", "G1"));
    }

    public final boolean l1(q3 q3Var) {
        d1();
        String string = h1().getString("stored_tcf_param", HttpUrl.FRAGMENT_ENCODE_SET);
        String a10 = q3Var.a();
        if (!a10.equals(string)) {
            SharedPreferences.Editor edit = h1().edit();
            edit.putString("stored_tcf_param", a10);
            edit.apply();
            return true;
        }
        return false;
    }

    public final void m1(boolean z10) {
        d1();
        u0 u0Var = ((n1) this.f4301y).C;
        n1.g(u0Var);
        u0Var.L.b(Boolean.valueOf(z10), "App measurement setting deferred collection");
        SharedPreferences.Editor edit = h1().edit();
        edit.putBoolean("deferred_analytics_collection", z10);
        edit.apply();
    }

    public final boolean n1(long j) {
        if (j - this.I.c() > this.N.c()) {
            return true;
        }
        return false;
    }
}

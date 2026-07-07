package k8;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends y1 {
    public static final Pair V = new Pair("", 0L);
    public e6.c A;
    public final c2.v1 B;
    public final c2.b C;
    public String D;
    public boolean E;
    public long F;
    public final c2.v1 G;
    public final c1 H;
    public final c2.b I;
    public final sb.p J;
    public final c1 K;
    public final c2.v1 L;
    public final c2.v1 M;
    public boolean N;
    public final c1 O;
    public final c1 P;
    public final c2.v1 Q;
    public final c2.b R;
    public final c2.b S;
    public final c2.v1 T;
    public final sb.p U;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public SharedPreferences f7437y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public SharedPreferences f7438z;

    public d1(p1 p1Var) {
        super(p1Var);
        this.G = new c2.v1(this, "session_timeout", 1800000L);
        this.H = new c1(this, "start_new_session", true);
        this.L = new c2.v1(this, "last_pause_time", 0L);
        this.M = new c2.v1(this, "session_id", 0L);
        this.I = new c2.b(this, "non_personalized_ads");
        this.J = new sb.p(this, "last_received_uri_timestamps_by_source");
        this.K = new c1(this, "allow_remote_dynamite", false);
        this.B = new c2.v1(this, "first_open_time", 0L);
        t7.y.d("app_install_time");
        this.C = new c2.b(this, "app_instance_id");
        this.O = new c1(this, "app_backgrounded", false);
        this.P = new c1(this, "deep_link_retrieval_complete", false);
        this.Q = new c2.v1(this, "deep_link_retrieval_attempts", 0L);
        this.R = new c2.b(this, "firebase_feature_rollouts");
        this.S = new c2.b(this, "deferred_attribution_cache");
        this.T = new c2.v1(this, "deferred_attribution_cache_timestamp", 0L);
        this.U = new sb.p(this, "default_event_parameters");
    }

    @Override // k8.y1
    public final boolean E() {
        return true;
    }

    public final SharedPreferences H() {
        D();
        F();
        t7.y.g(this.f7437y);
        return this.f7437y;
    }

    public final SharedPreferences I() {
        D();
        F();
        if (this.f7438z == null) {
            p1 p1Var = (p1) this.f2053w;
            String strValueOf = String.valueOf(p1Var.f7692v.getPackageName());
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            t0 t0Var = v0Var.J;
            String strConcat = strValueOf.concat("_preferences");
            t0Var.b(strConcat, "Default prefs file");
            this.f7438z = p1Var.f7692v.getSharedPreferences(strConcat, 0);
        }
        return this.f7438z;
    }

    public final SparseArray J() {
        Bundle bundleI = this.J.I();
        int[] intArray = bundleI.getIntArray("uriSources");
        long[] longArray = bundleI.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            v0 v0Var = ((p1) this.f2053w).A;
            p1.l(v0Var);
            v0Var.B.a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    public final d2 K() {
        D();
        return d2.c(H().getInt("consent_source", 100), H().getString("consent_settings", "G1"));
    }

    public final void L(boolean z2) {
        D();
        v0 v0Var = ((p1) this.f2053w).A;
        p1.l(v0Var);
        v0Var.J.b(Boolean.valueOf(z2), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = H().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z2);
        editorEdit.apply();
    }

    public final boolean M(long j8) {
        return j8 - this.G.g() > this.L.g();
    }
}

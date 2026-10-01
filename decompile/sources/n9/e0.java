package n9;

import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class e0 {
    public static final d0 A;
    public static final d0 A0;
    public static final d0 B;
    public static final d0 B0;
    public static final d0 C;
    public static final d0 C0;
    public static final d0 D;
    public static final d0 D0;
    public static final d0 E;
    public static final d0 E0;
    public static final d0 F;
    public static final d0 F0;
    public static final d0 G;
    public static final d0 G0;
    public static final d0 H;
    public static final d0 H0;
    public static final d0 I;
    public static final d0 I0;
    public static final d0 J;
    public static final d0 J0;
    public static final d0 K;
    public static final d0 K0;
    public static final d0 L;
    public static final d0 L0;
    public static final d0 M;
    public static final d0 M0;
    public static final d0 N;
    public static final d0 N0;
    public static final d0 O;
    public static final d0 O0;
    public static final d0 P;
    public static final d0 P0;
    public static final d0 Q;
    public static final d0 Q0;
    public static final d0 R;
    public static final d0 R0;
    public static final d0 S;
    public static final d0 S0;
    public static final d0 T;
    public static final d0 T0;
    public static final d0 U;
    public static final d0 U0;
    public static final d0 V;
    public static final d0 V0;
    public static final d0 W;
    public static final d0 W0;
    public static final d0 X;
    public static final d0 X0;
    public static final d0 Y;
    public static final d0 Y0;
    public static final d0 Z;
    public static final d0 Z0;

    /* renamed from: a, reason: collision with root package name */
    public static final List f9226a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0, reason: collision with root package name */
    public static final d0 f9227a0;

    /* renamed from: a1, reason: collision with root package name */
    public static final d0 f9228a1;

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f9229b;

    /* renamed from: b0, reason: collision with root package name */
    public static final d0 f9230b0;

    /* renamed from: b1, reason: collision with root package name */
    public static final d0 f9231b1;

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f9232c;

    /* renamed from: c0, reason: collision with root package name */
    public static final d0 f9233c0;
    public static final d0 c1;

    /* renamed from: d, reason: collision with root package name */
    public static final d0 f9234d;

    /* renamed from: d0, reason: collision with root package name */
    public static final d0 f9235d0;

    /* renamed from: d1, reason: collision with root package name */
    public static final d0 f9236d1;

    /* renamed from: e, reason: collision with root package name */
    public static final d0 f9237e;

    /* renamed from: e0, reason: collision with root package name */
    public static final d0 f9238e0;

    /* renamed from: e1, reason: collision with root package name */
    public static final d0 f9239e1;

    /* renamed from: f, reason: collision with root package name */
    public static final d0 f9240f;

    /* renamed from: f0, reason: collision with root package name */
    public static final d0 f9241f0;

    /* renamed from: f1, reason: collision with root package name */
    public static final d0 f9242f1;

    /* renamed from: g, reason: collision with root package name */
    public static final d0 f9243g;

    /* renamed from: g0, reason: collision with root package name */
    public static final d0 f9244g0;

    /* renamed from: g1, reason: collision with root package name */
    public static final d0 f9245g1;

    /* renamed from: h, reason: collision with root package name */
    public static final d0 f9246h;

    /* renamed from: h0, reason: collision with root package name */
    public static final d0 f9247h0;

    /* renamed from: h1, reason: collision with root package name */
    public static final d0 f9248h1;

    /* renamed from: i, reason: collision with root package name */
    public static final d0 f9249i;

    /* renamed from: i0, reason: collision with root package name */
    public static final d0 f9250i0;

    /* renamed from: i1, reason: collision with root package name */
    public static final d0 f9251i1;
    public static final d0 j;

    /* renamed from: j0, reason: collision with root package name */
    public static final d0 f9252j0;

    /* renamed from: j1, reason: collision with root package name */
    public static final d0 f9253j1;

    /* renamed from: k, reason: collision with root package name */
    public static final d0 f9254k;

    /* renamed from: k0, reason: collision with root package name */
    public static final d0 f9255k0;

    /* renamed from: k1, reason: collision with root package name */
    public static final d0 f9256k1;

    /* renamed from: l, reason: collision with root package name */
    public static final d0 f9257l;

    /* renamed from: l0, reason: collision with root package name */
    public static final d0 f9258l0;

    /* renamed from: m, reason: collision with root package name */
    public static final d0 f9259m;

    /* renamed from: m0, reason: collision with root package name */
    public static final d0 f9260m0;

    /* renamed from: n, reason: collision with root package name */
    public static final d0 f9261n;

    /* renamed from: n0, reason: collision with root package name */
    public static final d0 f9262n0;

    /* renamed from: o, reason: collision with root package name */
    public static final d0 f9263o;
    public static final d0 o0;

    /* renamed from: p, reason: collision with root package name */
    public static final d0 f9264p;

    /* renamed from: p0, reason: collision with root package name */
    public static final d0 f9265p0;

    /* renamed from: q, reason: collision with root package name */
    public static final d0 f9266q;

    /* renamed from: q0, reason: collision with root package name */
    public static final d0 f9267q0;

    /* renamed from: r, reason: collision with root package name */
    public static final d0 f9268r;

    /* renamed from: r0, reason: collision with root package name */
    public static final d0 f9269r0;
    public static final d0 s;

    /* renamed from: s0, reason: collision with root package name */
    public static final d0 f9270s0;

    /* renamed from: t, reason: collision with root package name */
    public static final d0 f9271t;

    /* renamed from: t0, reason: collision with root package name */
    public static final d0 f9272t0;

    /* renamed from: u, reason: collision with root package name */
    public static final d0 f9273u;

    /* renamed from: u0, reason: collision with root package name */
    public static final d0 f9274u0;

    /* renamed from: v, reason: collision with root package name */
    public static final d0 f9275v;

    /* renamed from: v0, reason: collision with root package name */
    public static final d0 f9276v0;

    /* renamed from: w, reason: collision with root package name */
    public static final d0 f9277w;

    /* renamed from: w0, reason: collision with root package name */
    public static final d0 f9278w0;

    /* renamed from: x, reason: collision with root package name */
    public static final d0 f9279x;

    /* renamed from: x0, reason: collision with root package name */
    public static final d0 f9280x0;

    /* renamed from: y, reason: collision with root package name */
    public static final d0 f9281y;

    /* renamed from: y0, reason: collision with root package name */
    public static final d0 f9282y0;

    /* renamed from: z, reason: collision with root package name */
    public static final d0 f9283z;

    /* renamed from: z0, reason: collision with root package name */
    public static final d0 f9284z0;

    static {
        Collections.synchronizedSet(new HashSet());
        f9229b = a("measurement.ad_id_cache_time", 10000L, y.Z, false);
        f9232c = a("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, zb.d.A, false);
        f9234d = a("measurement.monitoring.sample_period_millis", 86400000L, w8.l.H, false);
        f9237e = a("measurement.config.cache_time", 86400000L, y.f9532z, false);
        f9240f = a("measurement.config.url_scheme", HttpRequest.DEFAULT_SCHEME, a0.C, false);
        f9243g = a("measurement.config.url_authority", "app-measurement.com", z.G, false);
        f9246h = a("measurement.upload.max_bundles", 100, y.K, false);
        f9249i = a("measurement.upload.max_batch_size", 65536, a0.N, false);
        j = a("measurement.upload.max_bundle_size", 65536, z.R, false);
        Integer valueOf = Integer.valueOf(UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT);
        f9254k = a("measurement.upload.max_events_per_bundle", valueOf, y.V, false);
        f9257l = a("measurement.upload.max_events_per_day", 100000, a0.Y, false);
        f9259m = a("measurement.upload.max_error_events_per_day", valueOf, ua.f.D, false);
        f9261n = a("measurement.upload.max_public_events_per_day", 50000, w8.l.E, false);
        f9263o = a("measurement.upload.max_conversions_per_day", Integer.valueOf(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS), zb.d.D, false);
        f9264p = a("measurement.upload.max_realtime_events_per_day", 10, ua.f.E, false);
        f9266q = a("measurement.store.max_stored_events_per_app", 100000, w8.l.F, false);
        f9268r = a("measurement.upload.url", "https://app-measurement.com/a", zb.d.E, false);
        s = a("measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d", ua.f.F, false);
        f9271t = a("measurement.sgtm.service_upload_apps_list", HttpUrl.FRAGMENT_ENCODE_SET, w8.l.G, false);
        f9273u = a("measurement.sgtm.upload.backoff_http_codes", "404,429,503,504", zb.d.F, false);
        f9275v = a("measurement.sgtm.upload.retry_interval", 600000L, ua.f.G, false);
        f9277w = a("measurement.sgtm.upload.retry_max_wait", 21600000L, zb.d.G, false);
        f9279x = a("measurement.sgtm.batch.retry_interval", 1800000L, ua.f.H, false);
        f9281y = a("measurement.sgtm.batch.retry_max_wait", 21600000L, w8.l.I, false);
        f9283z = a("measurement.sgtm.batch.retry_max_count", 10, zb.d.H, false);
        A = a("measurement.sgtm.upload.max_queued_batches", Integer.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_DURATION), ua.f.I, false);
        B = a("measurement.sgtm.upload.batches_retrieval_limit", 5, w8.l.J, false);
        Long valueOf2 = Long.valueOf(ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);
        C = a("measurement.sgtm.upload.min_delay_after_startup", valueOf2, zb.d.I, false);
        D = a("measurement.sgtm.upload.min_delay_after_broadcast", 1000L, y.f9531y, false);
        E = a("measurement.sgtm.upload.min_delay_after_background", 600000L, z.f9542y, false);
        F = a("measurement.sgtm.batch.long_queuing_threshold", 14400000L, a0.f9151y, false);
        G = a("measurement.upload.backoff_period", 43200000L, z.f9543z, false);
        H = a("measurement.upload.window_interval", 3600000L, a0.f9152z, false);
        I = a("measurement.upload.interval", 3600000L, y.A, false);
        J = a("measurement.upload.realtime_upload_interval", 10000L, z.A, false);
        K = a("measurement.upload.debug_upload_interval", 1000L, a0.A, false);
        L = a("measurement.upload.minimum_delay", 500L, y.B, false);
        M = a("measurement.alarm_manager.minimum_interval", 60000L, z.B, false);
        N = a("measurement.upload.stale_data_deletion_interval", 86400000L, a0.B, false);
        O = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, y.C, false);
        P = a("measurement.upload.initial_upload_delay_time", 15000L, z.C, false);
        Q = a("measurement.upload.retry_time", 1800000L, y.D, false);
        R = a("measurement.upload.retry_count", 6, z.D, false);
        S = a("measurement.upload.max_queue_time", 518400000L, a0.D, false);
        T = a("measurement.upload.google_signal_max_queue_time", 300000L, y.E, false);
        U = a("measurement.lifetimevalue.max_currency_tracked", 4, z.E, false);
        V = a("measurement.audience.filter_result_max_count", 200, a0.E, false);
        W = a("measurement.upload.max_public_user_properties", 100, null, false);
        X = a("measurement.upload.max_event_name_cardinality", 2000, null, false);
        Y = a("measurement.upload.max_public_event_params", 100, null, false);
        Z = a("measurement.service_client.idle_disconnect_millis", valueOf2, y.F, false);
        f9227a0 = a("measurement.service_client.reconnect_millis", 1000L, z.F, false);
        Boolean bool = Boolean.FALSE;
        f9230b0 = a("measurement.test.boolean_flag", bool, a0.F, false);
        f9233c0 = a("measurement.test.string_flag", "---", y.G, false);
        f9235d0 = a("measurement.test.long_flag", -1L, a0.G, false);
        a("measurement.test.cached_long_flag", -1L, y.H, true);
        f9238e0 = a("measurement.test.int_flag", -2, z.H, false);
        f9241f0 = a("measurement.test.double_flag", Double.valueOf(-3.0d), a0.H, false);
        f9244g0 = a("measurement.experiment.max_ids", 50, y.I, false);
        f9247h0 = a("measurement.upload.max_item_scoped_custom_parameters", 27, z.I, false);
        f9250i0 = a("measurement.upload.max_event_parameter_value_length", Integer.valueOf(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE), a0.I, true);
        f9252j0 = a("measurement.max_bundles_per_iteration", 100, y.J, false);
        f9255k0 = a("measurement.sdk.attribution.cache.ttl", 604800000L, z.J, false);
        f9258l0 = a("measurement.redaction.app_instance_id.ttl", 7200000L, a0.J, false);
        f9260m0 = a("measurement.rb.attribution.client.min_ad_services_version", 7, z.K, false);
        f9262n0 = a("measurement.dma_consent.max_daily_dcu_realtime_events", 1, a0.K, false);
        o0 = a("measurement.rb.attribution.uri_scheme", HttpRequest.DEFAULT_SCHEME, y.L, false);
        f9265p0 = a("measurement.rb.attribution.uri_authority", "google-analytics.com", z.L, false);
        f9267q0 = a("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", a0.L, false);
        f9269r0 = a("measurement.session.engagement_interval", 3600000L, y.M, false);
        f9270s0 = a("measurement.rb.attribution.app_allowlist", "com.labpixies.flood", z.M, false);
        f9272t0 = a("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot", a0.M, false);
        f9274u0 = a("measurement.rb.attribution.event_params", "value|currency", y.N, false);
        f9276v0 = a("measurement.rb.attribution.query_parameters_to_remove", HttpUrl.FRAGMENT_ENCODE_SET, z.N, false);
        f9278w0 = a("measurement.rb.attribution.max_queue_time", 864000000L, y.O, false);
        f9280x0 = a("measurement.rb.attribution.max_retry_delay_seconds", 16, z.O, false);
        f9282y0 = a("measurement.rb.attribution.client.min_time_after_boot_seconds", 90, a0.O, false);
        a("measurement.rb.attribution.max_trigger_uris_queried_at_once", 0, y.P, false);
        f9284z0 = a("measurement.rb.max_trigger_registrations_per_day", valueOf, z.P, false);
        Boolean bool2 = Boolean.TRUE;
        A0 = a("measurement.config.bundle_for_all_apps_on_backgrounded", bool2, a0.P, false);
        B0 = a("measurement.config.notify_trigger_uris_on_backgrounded", bool2, y.Q, false);
        C0 = a("measurement.rb.attribution.notify_app_delay_millis", 3000, z.Q, false);
        D0 = a("measurement.quality.checksum", bool, null, false);
        E0 = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, a0.Q, false);
        F0 = a("measurement.audience.refresh_event_count_filters_timestamp", bool, y.R, false);
        G0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, a0.R, true);
        H0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, y.S, false);
        I0 = a("measurement.integration.disable_firebase_instance_id", bool, z.S, false);
        J0 = a("measurement.collection.service.update_with_analytics_fix", bool, a0.S, false);
        K0 = a("measurement.service.storage_consent_support_version", 203600, y.T, false);
        L0 = a("measurement.service.store_null_safelist", bool2, z.T, false);
        M0 = a("measurement.service.store_safelist", bool2, a0.T, false);
        N0 = a("measurement.session_stitching_token_enabled", bool, y.U, false);
        O0 = a("measurement.sgtm.client.upload_on_backgrounded.dev", bool, z.U, true);
        P0 = a("measurement.gmscore_client_telemetry", bool, a0.Z, false);
        Q0 = a("measurement.rb.attribution.service", bool2, a0.U, true);
        R0 = a("measurement.rb.attribution.client2", bool2, z.V, true);
        S0 = a("measurement.rb.attribution.uuid_generation", bool2, a0.V, false);
        T0 = a("measurement.rb.attribution.enable_trigger_redaction", bool2, y.W, false);
        a("measurement.rb.attribution.followup1.service", bool, z.W, false);
        U0 = a("measurement.rb.attribution.retry_disposition", bool, a0.W, false);
        V0 = a("measurement.client.sessions.enable_fix_background_engagement", bool, y.f9530a0, false);
        W0 = a("measurement.set_default_event_parameters_propagate_clear.service.dev", bool2, y.X, false);
        X0 = a("measurement.set_default_event_parameters_propagate_clear.client.dev", bool2, z.X, false);
        Y0 = a("measurement.service.ad_impression.convert_value_to_double", bool2, a0.X, false);
        a("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", bool2, y.Y, false);
        a("measurement.remove_conflicting_first_party_apis.dev", bool, z.Y, false);
        Z0 = a("measurement.rb.attribution.service.trigger_uris_high_priority", bool2, ua.f.B, false);
        f9228a1 = a("measurement.tcf.consent_fix", bool, w8.l.C, false);
        f9231b1 = a("measurement.tcf.empty_pref_fix", bool2, zb.d.B, false);
        c1 = a("measurement.experiment.enable_phenotype_experiment_reporting", bool2, ua.f.C, false);
        f9236d1 = a("measurement.set_default_event_parameters.fix_service_request_ordering", bool, w8.l.A, false);
        f9239e1 = a("measurement.set_default_event_parameters.fix_app_update_logging", bool2, ua.f.f12976z, false);
        f9242f1 = a("measurement.service.fix_stop_bundling_bug", bool2, w8.l.B, false);
        f9245g1 = a("measurement.fix_params_logcat_spam", bool2, ua.f.A, false);
        f9248h1 = a("measurement.gbraid_campaign.stop_lgclid", bool, z.Z, false);
        f9251i1 = a("measurement.gbraid_compaign.compaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid", w8.l.D, false);
        f9253j1 = a("measurement.edpb.service", bool, zb.d.f15326z, false);
        f9256k1 = a("measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp", zb.d.C, false);
    }

    public static d0 a(String str, Object obj, w wVar, boolean z10) {
        d0 d0Var = new d0(str, obj, wVar);
        if (z10) {
            f9226a.add(d0Var);
        }
        return d0Var;
    }
}

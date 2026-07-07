package com.google.android.gms.internal.measurement;

import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.network.model.HttpRequest;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i7 implements h7 {
    public static final o4 A;
    public static final o4 B;
    public static final o4 C;
    public static final o4 D;
    public static final o4 E;
    public static final o4 F;
    public static final o4 G;
    public static final o4 H;
    public static final o4 I;
    public static final o4 J;
    public static final o4 K;
    public static final o4 L;
    public static final o4 M;
    public static final o4 N;
    public static final o4 O;
    public static final o4 P;
    public static final o4 Q;
    public static final o4 R;
    public static final o4 S;
    public static final o4 T;
    public static final o4 U;
    public static final o4 V;
    public static final o4 W;
    public static final o4 X;
    public static final o4 Y;
    public static final o4 Z;

    /* renamed from: a, reason: collision with root package name */
    public static final o4 f2261a;

    /* renamed from: a0, reason: collision with root package name */
    public static final o4 f2262a0;

    /* renamed from: b, reason: collision with root package name */
    public static final o4 f2263b;

    /* renamed from: b0, reason: collision with root package name */
    public static final o4 f2264b0;

    /* renamed from: c, reason: collision with root package name */
    public static final o4 f2265c;

    /* renamed from: c0, reason: collision with root package name */
    public static final o4 f2266c0;

    /* renamed from: d, reason: collision with root package name */
    public static final o4 f2267d;

    /* renamed from: d0, reason: collision with root package name */
    public static final o4 f2268d0;

    /* renamed from: e, reason: collision with root package name */
    public static final o4 f2269e;

    /* renamed from: e0, reason: collision with root package name */
    public static final o4 f2270e0;

    /* renamed from: f, reason: collision with root package name */
    public static final o4 f2271f;

    /* renamed from: f0, reason: collision with root package name */
    public static final o4 f2272f0;

    /* renamed from: g, reason: collision with root package name */
    public static final o4 f2273g;

    /* renamed from: g0, reason: collision with root package name */
    public static final o4 f2274g0;

    /* renamed from: h, reason: collision with root package name */
    public static final o4 f2275h;

    /* renamed from: h0, reason: collision with root package name */
    public static final o4 f2276h0;

    /* renamed from: i, reason: collision with root package name */
    public static final o4 f2277i;

    /* renamed from: i0, reason: collision with root package name */
    public static final o4 f2278i0;
    public static final o4 j;

    /* renamed from: j0, reason: collision with root package name */
    public static final o4 f2279j0;

    /* renamed from: k, reason: collision with root package name */
    public static final o4 f2280k;

    /* renamed from: k0, reason: collision with root package name */
    public static final o4 f2281k0;

    /* renamed from: l, reason: collision with root package name */
    public static final o4 f2282l;

    /* renamed from: l0, reason: collision with root package name */
    public static final o4 f2283l0;

    /* renamed from: m, reason: collision with root package name */
    public static final o4 f2284m;

    /* renamed from: m0, reason: collision with root package name */
    public static final o4 f2285m0;

    /* renamed from: n, reason: collision with root package name */
    public static final o4 f2286n;

    /* renamed from: n0, reason: collision with root package name */
    public static final o4 f2287n0;

    /* renamed from: o, reason: collision with root package name */
    public static final o4 f2288o;
    public static final o4 o0;

    /* renamed from: p, reason: collision with root package name */
    public static final o4 f2289p;

    /* renamed from: p0, reason: collision with root package name */
    public static final o4 f2290p0;

    /* renamed from: q, reason: collision with root package name */
    public static final o4 f2291q;

    /* renamed from: q0, reason: collision with root package name */
    public static final o4 f2292q0;

    /* renamed from: r, reason: collision with root package name */
    public static final o4 f2293r;

    /* renamed from: r0, reason: collision with root package name */
    public static final o4 f2294r0;
    public static final o4 s;

    /* renamed from: s0, reason: collision with root package name */
    public static final o4 f2295s0;

    /* renamed from: t, reason: collision with root package name */
    public static final o4 f2296t;

    /* renamed from: t0, reason: collision with root package name */
    public static final o4 f2297t0;

    /* renamed from: u, reason: collision with root package name */
    public static final o4 f2298u;

    /* renamed from: u0, reason: collision with root package name */
    public static final o4 f2299u0;

    /* renamed from: v, reason: collision with root package name */
    public static final o4 f2300v;

    /* renamed from: v0, reason: collision with root package name */
    public static final o4 f2301v0;

    /* renamed from: w, reason: collision with root package name */
    public static final o4 f2302w;

    /* renamed from: w0, reason: collision with root package name */
    public static final o4 f2303w0;

    /* renamed from: x, reason: collision with root package name */
    public static final o4 f2304x;

    /* renamed from: y, reason: collision with root package name */
    public static final o4 f2305y;

    /* renamed from: z, reason: collision with root package name */
    public static final o4 f2306z;

    static {
        p4 p4Var = new p4(n4.a(), true, true);
        f2261a = p4Var.p("measurement.ad_id_cache_time", 10000L);
        f2263b = p4Var.p("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L);
        f2265c = p4Var.q("measurement.config.bundle_for_all_apps_on_backgrounded", true);
        f2267d = p4Var.p("measurement.max_bundles_per_iteration", 100L);
        f2269e = p4Var.r("measurement.gbraid_campaign.campaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid");
        f2271f = p4Var.p("measurement.config.cache_time", 86400000L);
        p4Var.r("measurement.log_tag", "FA");
        f2273g = p4Var.r("measurement.config.url_authority", "app-measurement.com");
        f2275h = p4Var.r("measurement.config.url_scheme", HttpRequest.DEFAULT_SCHEME);
        f2277i = p4Var.p("measurement.upload.debug_upload_interval", 1000L);
        p4Var.q("measurement.config.default_flag_values", true);
        j = p4Var.p("measurement.session.engagement_interval", 3600000L);
        f2280k = p4Var.r("measurement.rb.attribution.event_params", "value|currency");
        f2282l = p4Var.r("measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp");
        f2284m = p4Var.p("measurement.upload.google_signal_max_queue_time", 605000L);
        f2286n = p4Var.r("measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d");
        f2288o = p4Var.p("measurement.lifetimevalue.max_currency_tracked", 4L);
        f2289p = p4Var.p("measurement.dma_consent.max_daily_dcu_realtime_events", 1L);
        f2291q = p4Var.p("measurement.upload.max_event_parameter_value_length", 500L);
        f2293r = p4Var.p("measurement.store.max_stored_events_per_app", 100000L);
        s = p4Var.p("measurement.experiment.max_ids", 50L);
        f2296t = p4Var.p("measurement.audience.filter_result_max_count", 200L);
        f2298u = p4Var.p("measurement.upload.max_item_scoped_custom_parameters", 27L);
        f2300v = p4Var.p("measurement.rb.max_trigger_registrations_per_day", 1000L);
        f2302w = p4Var.p("measurement.rb.attribution.max_trigger_uris_queried_at_once", 0L);
        f2304x = p4Var.p("measurement.rb.attribution.client.min_ad_services_version", 7L);
        f2305y = p4Var.p("measurement.alarm_manager.minimum_interval", 60000L);
        f2306z = p4Var.p("measurement.upload.minimum_delay", 500L);
        A = p4Var.p("measurement.monitoring.sample_period_millis", 86400000L);
        B = p4Var.p("measurement.rb.attribution.notify_app_delay_millis", 3000L);
        C = p4Var.q("measurement.config.notify_trigger_uris_on_backgrounded", true);
        p4Var.p("measurement.id.rb.attribution.app_allowlist", 0L);
        D = p4Var.r("measurement.rb.attribution.app_allowlist", "com.labpixies.flood");
        E = p4Var.p("measurement.upload.realtime_upload_interval", 10000L);
        F = p4Var.p("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        p4Var.p("measurement.config.cache_time.service", 3600000L);
        G = p4Var.p("measurement.service_client.idle_disconnect_millis", ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);
        p4Var.r("measurement.log_tag.service", "FA-SVC");
        H = p4Var.p("measurement.service_client.reconnect_millis", 1000L);
        p4Var.r("measurement.sgtm.app_allowlist", "*");
        I = p4Var.p("measurement.sgtm.batch.long_queuing_threshold", 240000L);
        J = p4Var.p("measurement.sgtm.batch.retry_interval", 1800000L);
        K = p4Var.p("measurement.sgtm.batch.retry_max_count", 10L);
        L = p4Var.p("measurement.sgtm.batch.retry_max_wait", 21600000L);
        M = p4Var.r("measurement.sgtm.service_upload_apps_list", HttpUrl.FRAGMENT_ENCODE_SET);
        N = p4Var.r("measurement.sgtm.upload.backoff_http_codes", "404,429,503,504");
        O = p4Var.p("measurement.sgtm.upload.batches_retrieval_limit", 5L);
        P = p4Var.p("measurement.sgtm.upload.max_queued_batches", ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);
        Q = p4Var.p("measurement.sgtm.upload.min_delay_after_background", 600000L);
        R = p4Var.p("measurement.sgtm.upload.min_delay_after_broadcast", 1000L);
        S = p4Var.p("measurement.sgtm.upload.min_delay_after_startup", ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);
        T = p4Var.p("measurement.sgtm.upload.retry_interval", 600000L);
        U = p4Var.p("measurement.sgtm.upload.retry_max_wait", 21600000L);
        V = p4Var.p("measurement.upload.stale_data_deletion_interval", 86400000L);
        W = p4Var.p("measurement.rb.attribution.max_retry_delay_seconds", 16L);
        X = p4Var.p("measurement.rb.attribution.client.min_time_after_boot_seconds", 90L);
        Y = p4Var.r("measurement.rb.attribution.uri_authority", "google-analytics.com");
        Z = p4Var.p("measurement.rb.attribution.max_queue_time", 864000000L);
        f2262a0 = p4Var.r("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
        f2264b0 = p4Var.r("measurement.rb.attribution.query_parameters_to_remove", HttpUrl.FRAGMENT_ENCODE_SET);
        f2266c0 = p4Var.r("measurement.rb.attribution.uri_scheme", HttpRequest.DEFAULT_SCHEME);
        f2268d0 = p4Var.p("measurement.sdk.attribution.cache.ttl", 604800000L);
        f2270e0 = p4Var.p("measurement.redaction.app_instance_id.ttl", 7200000L);
        f2272f0 = p4Var.p("measurement.upload.backoff_period", 43200000L);
        f2274g0 = p4Var.p("measurement.upload.initial_upload_delay_time", 15000L);
        f2276h0 = p4Var.p("measurement.upload.interval", 3600000L);
        f2278i0 = p4Var.p("measurement.upload.max_bundle_size", 65536L);
        f2279j0 = p4Var.p("measurement.upload.max_bundles", 100L);
        f2281k0 = p4Var.p("measurement.upload.max_conversions_per_day", 500L);
        f2283l0 = p4Var.p("measurement.upload.max_error_events_per_day", 1000L);
        f2285m0 = p4Var.p("measurement.upload.max_events_per_bundle", 1000L);
        f2287n0 = p4Var.p("measurement.upload.max_events_per_day", 100000L);
        o0 = p4Var.p("measurement.upload.max_public_events_per_day", ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        f2290p0 = p4Var.p("measurement.upload.max_queue_time", 518400000L);
        f2292q0 = p4Var.p("measurement.upload.max_realtime_events_per_day", 10L);
        f2294r0 = p4Var.p("measurement.upload.max_batch_size", 65536L);
        f2295s0 = p4Var.p("measurement.upload.retry_count", 6L);
        f2297t0 = p4Var.p("measurement.upload.retry_time", 1800000L);
        f2299u0 = p4Var.r("measurement.upload.url", "https://app-measurement.com/a");
        f2301v0 = p4Var.p("measurement.upload.window_interval", 3600000L);
        f2303w0 = p4Var.r("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot");
    }
}

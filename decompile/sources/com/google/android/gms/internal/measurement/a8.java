package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a8 implements z7 {

    /* renamed from: a, reason: collision with root package name */
    public static final o4 f2147a;

    /* renamed from: b, reason: collision with root package name */
    public static final o4 f2148b;

    /* renamed from: c, reason: collision with root package name */
    public static final o4 f2149c;

    static {
        p4 p4Var = new p4(n4.a(), true, true);
        p4Var.q("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f2147a = p4Var.q("measurement.audience.refresh_event_count_filters_timestamp", false);
        f2148b = p4Var.q("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f2149c = p4Var.q("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}

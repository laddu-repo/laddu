package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o7 implements n7 {

    /* renamed from: a, reason: collision with root package name */
    public static final o4 f2381a;

    /* renamed from: b, reason: collision with root package name */
    public static final o4 f2382b;

    static {
        p4 p4Var = new p4(n4.a(), true, true);
        p4Var.q("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        p4Var.q("measurement.set_default_event_parameters_with_backfill.service", true);
        p4Var.p("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0L);
        f2381a = p4Var.q("measurement.set_default_event_parameters.fix_app_update_logging", true);
        f2382b = p4Var.q("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        p4Var.q("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }
}

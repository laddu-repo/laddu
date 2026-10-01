package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class z3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f2543a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f2544b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f2545c;

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        f2544b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        f2545c = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }
}

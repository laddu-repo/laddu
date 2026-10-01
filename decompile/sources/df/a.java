package df;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f4115a;

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f4116b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Charset f4117c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile Charset f4118d;

    static {
        Charset forName = Charset.forName("UTF-8");
        kotlin.jvm.internal.k.d(forName, "forName(...)");
        f4115a = forName;
        kotlin.jvm.internal.k.d(Charset.forName("UTF-16"), "forName(...)");
        kotlin.jvm.internal.k.d(Charset.forName("UTF-16BE"), "forName(...)");
        kotlin.jvm.internal.k.d(Charset.forName("UTF-16LE"), "forName(...)");
        kotlin.jvm.internal.k.d(Charset.forName("US-ASCII"), "forName(...)");
        Charset forName2 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.k.d(forName2, "forName(...)");
        f4116b = forName2;
    }
}

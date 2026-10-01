package df;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    public final Pattern f4139x;

    public k(String pattern) {
        kotlin.jvm.internal.k.e(pattern, "pattern");
        Pattern compile = Pattern.compile(pattern);
        kotlin.jvm.internal.k.d(compile, "compile(...)");
        this.f4139x = compile;
    }

    public static c6.h a(k kVar, String input) {
        kVar.getClass();
        kotlin.jvm.internal.k.e(input, "input");
        Matcher matcher = kVar.f4139x.matcher(input);
        kotlin.jvm.internal.k.d(matcher, "matcher(...)");
        if (!matcher.find(0)) {
            return null;
        }
        return new c6.h(matcher, input);
    }

    public final c6.h b(String input) {
        kotlin.jvm.internal.k.e(input, "input");
        Matcher matcher = this.f4139x.matcher(input);
        kotlin.jvm.internal.k.d(matcher, "matcher(...)");
        if (!matcher.matches()) {
            return null;
        }
        return new c6.h(matcher, input);
    }

    public final boolean c(CharSequence input) {
        kotlin.jvm.internal.k.e(input, "input");
        return this.f4139x.matcher(input).matches();
    }

    public final String toString() {
        String pattern = this.f4139x.toString();
        kotlin.jvm.internal.k.d(pattern, "toString(...)");
        return pattern;
    }

    public k(String pattern, int i6) {
        kotlin.jvm.internal.k.e(pattern, "pattern");
        Pattern compile = Pattern.compile(pattern, 66);
        kotlin.jvm.internal.k.d(compile, "compile(...)");
        this.f4139x = compile;
    }
}

package k4;

import android.text.Html;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f7618a = Pattern.compile("(&#13;)?&#10;");

    public static String a(CharSequence charSequence) {
        return f7618a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}

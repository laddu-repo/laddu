package g4;

import android.text.Html;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f5536a = Pattern.compile("(&#13;)?&#10;");

    public static String a(CharSequence charSequence) {
        return f5536a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}

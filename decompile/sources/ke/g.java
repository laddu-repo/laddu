package ke;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Pattern f7973v;

    public g(String str) {
        Pattern patternCompile = Pattern.compile(str);
        de.i.d(patternCompile, "compile(...)");
        this.f7973v = patternCompile;
    }

    public final hd.a a(int i, String str) {
        de.i.e(str, "input");
        Matcher matcherRegion = this.f7973v.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (matcherRegion.lookingAt()) {
            return new hd.a(matcherRegion, str);
        }
        return null;
    }

    public final String b(String str) {
        de.i.e(str, "input");
        String strReplaceAll = this.f7973v.matcher(str).replaceAll("");
        de.i.d(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String toString() {
        String string = this.f7973v.toString();
        de.i.d(string, "toString(...)");
        return string;
    }
}

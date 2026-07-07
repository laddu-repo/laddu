package md;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f8636d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f8637e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8640c;

    public a(String str) {
        this.f8638a = str;
        if (str != null) {
            Matcher matcher = f8636d.matcher(str);
            this.f8639b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f8637e.matcher(str);
            this.f8640c = matcher2.find() ? matcher2.group(2) : null;
        } else {
            this.f8639b = "";
            this.f8640c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f8639b)) {
            Matcher matcher3 = f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}

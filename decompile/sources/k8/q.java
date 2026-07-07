package k8;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q extends y1 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f7703y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f7704z;

    @Override // k8.y1
    public final boolean E() {
        Calendar calendar = Calendar.getInstance();
        this.f7703y = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f7704z = d0.d.n(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long H() {
        F();
        return this.f7703y;
    }

    public final String I() {
        F();
        return this.f7704z;
    }
}

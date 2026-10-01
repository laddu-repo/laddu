package za;

import wa.c;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f14840b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f14841c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f14842d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wa.a f14843e = new wa.a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f14844a;

    public a(b bVar) {
        this.f14844a = bVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb2.append(str.charAt(i));
            if (str2.length() > i) {
                sb2.append(str2.charAt(i));
            }
        }
        return sb2.toString();
    }
}

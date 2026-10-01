package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class fc extends RuntimeException {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f2641v;

    public fc(int i, String str, r7.d dVar) {
        String strValueOf;
        if (str != null) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 2 + str.length());
            sb2.append(i);
            sb2.append(": ");
            sb2.append(str);
            strValueOf = sb2.toString();
        } else {
            strValueOf = String.valueOf(i);
        }
        super(strValueOf, dVar);
        this.f2641v = i;
    }
}

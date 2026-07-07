package q3;

import w2.f0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f10778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f10780e;

    public r(boolean z2, String str, int i, byte[] bArr, int i10, int i11, byte[] bArr2) {
        int i12 = 1;
        w1.a.d((i == 0) ^ (bArr2 == null));
        this.f10776a = z2;
        this.f10777b = str;
        this.f10779d = i;
        this.f10780e = bArr2;
        if (str != null) {
            switch (str) {
                case "cbc1":
                case "cbcs":
                    i12 = 2;
                    break;
                case "cenc":
                case "cens":
                    break;
                default:
                    w1.a.C("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.f10778c = new f0(i12, i10, i11, bArr);
    }
}

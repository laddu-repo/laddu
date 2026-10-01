package j3;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import t1.b0;
import t1.d0;
import t1.o;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6781e;
    public final int f;

    public b(int i, int i10, String str, String str2, String str3, boolean z2) {
        w1.a.d(i10 == -1 || i10 > 0);
        this.f6777a = i;
        this.f6778b = str;
        this.f6779c = str2;
        this.f6780d = str3;
        this.f6781e = z2;
        this.f = i10;
    }

    public static b d(Map map) {
        boolean z2;
        int i;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i10;
        List list = (List) map.get("icy-br");
        boolean z10 = true;
        int i11 = -1;
        if (list != null) {
            String str4 = (String) list.get(0);
            try {
                i10 = Integer.parseInt(str4) * 1000;
                if (i10 > 0) {
                    z2 = true;
                } else {
                    try {
                        w1.a.C("IcyHeaders", "Invalid bitrate: " + str4);
                        z2 = false;
                        i10 = -1;
                    } catch (NumberFormatException unused) {
                        u5.a.f("Invalid bitrate header: ", str4, "IcyHeaders");
                        z2 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i10 = -1;
            }
            i = i10;
        } else {
            z2 = false;
            i = -1;
        }
        List list2 = (List) map.get("icy-genre");
        if (list2 != null) {
            str = (String) list2.get(0);
            z2 = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z2 = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z2 = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z2 = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                int i12 = Integer.parseInt(str5);
                if (i12 > 0) {
                    i11 = i12;
                } else {
                    try {
                        w1.a.C("IcyHeaders", "Invalid metadata interval: " + str5);
                        z10 = z2;
                    } catch (NumberFormatException unused3) {
                        i11 = i12;
                        u5.a.f("Invalid metadata interval: ", str5, "IcyHeaders");
                    }
                }
                z2 = z10;
            } catch (NumberFormatException unused4) {
            }
        }
        int i13 = i11;
        if (z2) {
            return new b(i, i13, str, str2, str3, zEquals);
        }
        return null;
    }

    @Override // t1.d0
    public final /* synthetic */ o a() {
        return null;
    }

    @Override // t1.d0
    public final void b(b0 b0Var) {
        String str = this.f6779c;
        if (str != null) {
            b0Var.f11945x = str;
        }
        String str2 = this.f6778b;
        if (str2 != null) {
            b0Var.f11944w = str2;
        }
    }

    @Override // t1.d0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f6777a == bVar.f6777a && Objects.equals(this.f6778b, bVar.f6778b) && Objects.equals(this.f6779c, bVar.f6779c) && Objects.equals(this.f6780d, bVar.f6780d) && this.f6781e == bVar.f6781e && this.f == bVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (527 + this.f6777a) * 31;
        String str = this.f6778b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6779c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6780d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f6781e ? 1 : 0)) * 31) + this.f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f6779c + "\", genre=\"" + this.f6778b + "\", bitrate=" + this.f6777a + ", metadataInterval=" + this.f;
    }
}

package vf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import va.t1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class f implements Serializable, Comparable {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final f f13604y = new f(new byte[0]);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final byte[] f13605v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public transient int f13606w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public transient String f13607x;

    public f(byte[] bArr) {
        de.i.e(bArr, "data");
        this.f13605v = bArr;
    }

    public int a() {
        return this.f13605v.length;
    }

    public String b() {
        byte[] bArr = this.f13605v;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b9 : bArr) {
            int i10 = i + 1;
            char[] cArr2 = wf.b.f14030a;
            cArr[i] = cArr2[(b9 >> 4) & 15];
            i += 2;
            cArr[i10] = cArr2[b9 & 15];
        }
        return new String(cArr);
    }

    public byte[] c() {
        return this.f13605v;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        de.i.e(fVar, "other");
        int iA = a();
        int iA2 = fVar.a();
        int iMin = Math.min(iA, iA2);
        for (int i = 0; i < iMin; i++) {
            int iD = d(i) & 255;
            int iD2 = fVar.d(i) & 255;
            if (iD != iD2) {
                return iD < iD2 ? -1 : 1;
            }
        }
        if (iA == iA2) {
            return 0;
        }
        return iA < iA2 ? -1 : 1;
    }

    public byte d(int i) {
        return this.f13605v[i];
    }

    public boolean e(int i, int i10, int i11, byte[] bArr) {
        de.i.e(bArr, "other");
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f13605v;
        return i <= bArr2.length - i11 && i10 >= 0 && i10 <= bArr.length - i11 && t1.a(i, i10, i11, bArr2, bArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            int iA = fVar.a();
            byte[] bArr = this.f13605v;
            if (iA == bArr.length && fVar.e(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(f fVar, int i) {
        de.i.e(fVar, "other");
        return fVar.e(0, 0, i, this.f13605v);
    }

    public String g(Charset charset) {
        de.i.e(charset, "charset");
        return new String(this.f13605v, charset);
    }

    public f h(int i, int i10) {
        if (i10 == -1234567890) {
            i10 = a();
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f13605v;
        if (i10 <= bArr.length) {
            if (i10 - i >= 0) {
                return (i == 0 && i10 == bArr.length) ? this : new f(pd.i.b0(bArr, i, i10));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
    }

    public int hashCode() {
        int i = this.f13606w;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f13605v);
        this.f13606w = iHashCode;
        return iHashCode;
    }

    public f i() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f13605v;
            if (i >= bArr.length) {
                return this;
            }
            byte b9 = bArr[i];
            if (b9 >= 65 && b9 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                de.i.d(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i] = (byte) (b9 + 32);
                for (int i10 = i + 1; i10 < bArrCopyOf.length; i10++) {
                    byte b10 = bArrCopyOf[i10];
                    if (b10 >= 65 && b10 <= 90) {
                        bArrCopyOf[i10] = (byte) (b10 + 32);
                    }
                }
                return new f(bArrCopyOf);
            }
            i++;
        }
    }

    public final String j() {
        String str = this.f13607x;
        if (str != null) {
            return str;
        }
        byte[] bArrC = c();
        de.i.e(bArrC, "<this>");
        String str2 = new String(bArrC, ke.a.f7954a);
        this.f13607x = str2;
        return str2;
    }

    public void k(c cVar, int i) {
        cVar.m0(i, this.f13605v);
    }

    public String toString() {
        byte b9;
        int i;
        byte[] bArr = this.f13605v;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            if (i10 >= length) {
                break;
            }
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                int i13 = i12 + 1;
                if (i12 == 64) {
                    break;
                }
                if ((b10 != 10 && b10 != 13 && ((b10 >= 0 && b10 < 32) || (127 <= b10 && b10 < 160))) || b10 == 65533) {
                    break;
                }
                i11 += b10 < 65536 ? 1 : 2;
                i10++;
                while (true) {
                    i12 = i13;
                    if (i10 < length && (b9 = bArr[i10]) >= 0) {
                        i10++;
                        i13 = i12 + 1;
                        if (i12 == 64) {
                            break loop0;
                        }
                        if ((b9 != 10 && b9 != 13 && ((b9 >= 0 && b9 < 32) || (127 <= b9 && b9 < 160))) || b9 == 65533) {
                            break loop0;
                        }
                        i11 += b9 < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b10 >> 5) == -2) {
                int i14 = i10 + 1;
                if (length > i14) {
                    byte b11 = bArr[i14];
                    if ((b11 & 192) == 128) {
                        int i15 = (b11 ^ 3968) ^ (b10 << 6);
                        if (i15 >= 128) {
                            i = i12 + 1;
                            if (i12 == 64) {
                                break;
                            }
                            if ((i15 != 10 && i15 != 13 && ((i15 >= 0 && i15 < 32) || (127 <= i15 && i15 < 160))) || i15 == 65533) {
                                break;
                            }
                            i11 += i15 < 65536 ? 1 : 2;
                            i10 += 2;
                            i12 = i;
                        } else if (i12 != 64) {
                            break;
                        }
                    } else if (i12 != 64) {
                        break;
                    }
                } else if (i12 != 64) {
                    break;
                }
            } else if ((b10 >> 4) == -2) {
                int i16 = i10 + 2;
                if (length > i16) {
                    byte b12 = bArr[i10 + 1];
                    if ((b12 & 192) == 128) {
                        byte b13 = bArr[i16];
                        if ((b13 & 192) == 128) {
                            int i17 = ((b13 ^ (-123008)) ^ (b12 << 6)) ^ (b10 << 12);
                            if (i17 < 2048) {
                                if (i12 != 64) {
                                    break;
                                }
                            } else if (55296 > i17 || i17 >= 57344) {
                                i = i12 + 1;
                                if (i12 == 64) {
                                    break;
                                }
                                if ((i17 != 10 && i17 != 13 && ((i17 >= 0 && i17 < 32) || (127 <= i17 && i17 < 160))) || i17 == 65533) {
                                    break;
                                }
                                i11 += i17 < 65536 ? 1 : 2;
                                i10 += 3;
                                i12 = i;
                            } else if (i12 != 64) {
                                break;
                            }
                        } else if (i12 != 64) {
                            break;
                        }
                    } else if (i12 != 64) {
                        break;
                    }
                } else if (i12 != 64) {
                    break;
                }
            } else if ((b10 >> 3) == -2) {
                int i18 = i10 + 3;
                if (length > i18) {
                    byte b14 = bArr[i10 + 1];
                    if ((b14 & 192) == 128) {
                        byte b15 = bArr[i10 + 2];
                        if ((b15 & 192) == 128) {
                            byte b16 = bArr[i18];
                            if ((b16 & 192) == 128) {
                                int i19 = (((b16 ^ 3678080) ^ (b15 << 6)) ^ (b14 << 12)) ^ (b10 << 18);
                                if (i19 > 1114111) {
                                    if (i12 != 64) {
                                        break;
                                    }
                                } else if (55296 > i19 || i19 >= 57344) {
                                    if (i19 >= 65536) {
                                        i = i12 + 1;
                                        if (i12 == 64) {
                                            break;
                                        }
                                        if ((i19 != 10 && i19 != 13 && ((i19 >= 0 && i19 < 32) || (127 <= i19 && i19 < 160))) || i19 == 65533) {
                                            break;
                                        }
                                        i11 += i19 < 65536 ? 1 : 2;
                                        i10 += 4;
                                        i12 = i;
                                    } else if (i12 != 64) {
                                        break;
                                    }
                                } else if (i12 != 64) {
                                    break;
                                }
                            } else if (i12 != 64) {
                                break;
                            }
                        } else if (i12 != 64) {
                            break;
                        }
                    } else if (i12 != 64) {
                        break;
                    }
                } else if (i12 != 64) {
                    break;
                }
            } else if (i12 != 64) {
                break;
            }
        }
        i11 = -1;
        if (i11 != -1) {
            String strJ = j();
            String strSubstring = strJ.substring(0, i11);
            de.i.d(strSubstring, "substring(...)");
            String strZ = ke.p.z(ke.p.z(ke.p.z(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i11 >= strJ.length()) {
                return "[text=" + strZ + ']';
            }
            return "[size=" + bArr.length + " text=" + strZ + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + b() + ']';
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(bArr.length);
        sb2.append(" hex=");
        if (64 <= bArr.length) {
            sb2.append((64 == bArr.length ? this : new f(pd.i.b0(bArr, 0, 64))).b());
            sb2.append("…]");
            return sb2.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
    }
}

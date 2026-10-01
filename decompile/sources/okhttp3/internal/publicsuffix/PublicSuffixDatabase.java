package okhttp3.internal.publicsuffix;

import a8.g;
import bg.b;
import bg.f0;
import bg.u;
import cf.c;
import cf.d;
import cf.l;
import df.m;
import ie.j;
import ie.r;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    public static final Companion Companion = new Companion(null);
    private static final byte[] WILDCARD_LABEL = {42};
    private static final List<String> PREVAILING_RULE = g.m("*");
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i6) {
            int i10;
            int and;
            boolean z10;
            int and2;
            int length = bArr.length;
            int i11 = 0;
            while (i11 < length) {
                int i12 = (i11 + length) / 2;
                while (i12 > -1 && bArr[i12] != 10) {
                    i12--;
                }
                int i13 = i12 + 1;
                int i14 = 1;
                while (true) {
                    i10 = i13 + i14;
                    if (bArr[i10] == 10) {
                        break;
                    }
                    i14++;
                }
                int i15 = i10 - i13;
                int i16 = i6;
                boolean z11 = false;
                int i17 = 0;
                int i18 = 0;
                while (true) {
                    if (z11) {
                        and = 46;
                        z10 = false;
                    } else {
                        boolean z12 = z11;
                        and = Util.and(bArr2[i16][i17], 255);
                        z10 = z12;
                    }
                    and2 = and - Util.and(bArr[i13 + i18], 255);
                    if (and2 != 0) {
                        break;
                    }
                    i18++;
                    i17++;
                    if (i18 == i15) {
                        break;
                    }
                    if (bArr2[i16].length == i17) {
                        if (i16 == bArr2.length - 1) {
                            break;
                        }
                        i16++;
                        z11 = true;
                        i17 = -1;
                    } else {
                        z11 = z10;
                    }
                }
                if (and2 >= 0) {
                    if (and2 <= 0) {
                        int i19 = i15 - i18;
                        int length2 = bArr2[i16].length - i17;
                        int length3 = bArr2.length;
                        for (int i20 = i16 + 1; i20 < length3; i20++) {
                            length2 += bArr2[i20].length;
                        }
                        if (length2 >= i19) {
                            if (length2 <= i19) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                k.d(UTF_8, "UTF_8");
                                return new String(bArr, i13, i15, UTF_8);
                            }
                        }
                    }
                    i11 = i10 + 1;
                }
                length = i12;
            }
            return null;
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }

        private Companion() {
        }
    }

    private final List<String> findMatchingRule(List<String> list) {
        String str;
        String str2;
        String str3;
        List<String> list2;
        if (!this.listRead.get() && this.listRead.compareAndSet(false, true)) {
            readTheListUninterruptibly();
        } else {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.publicSuffixListBytes != null) {
            int size = list.size();
            byte[][] bArr = new byte[size];
            for (int i6 = 0; i6 < size; i6++) {
                String str4 = list.get(i6);
                Charset UTF_8 = StandardCharsets.UTF_8;
                k.d(UTF_8, "UTF_8");
                byte[] bytes = str4.getBytes(UTF_8);
                k.d(bytes, "this as java.lang.String).getBytes(charset)");
                bArr[i6] = bytes;
            }
            int i10 = 0;
            while (true) {
                str = null;
                if (i10 < size) {
                    Companion companion = Companion;
                    byte[] bArr2 = this.publicSuffixListBytes;
                    if (bArr2 != null) {
                        str2 = companion.binarySearch(bArr2, bArr, i10);
                        if (str2 != null) {
                            break;
                        }
                        i10++;
                    } else {
                        k.k("publicSuffixListBytes");
                        throw null;
                    }
                } else {
                    str2 = null;
                    break;
                }
            }
            if (size > 1) {
                byte[][] bArr3 = (byte[][]) bArr.clone();
                int length = bArr3.length - 1;
                for (int i11 = 0; i11 < length; i11++) {
                    bArr3[i11] = WILDCARD_LABEL;
                    Companion companion2 = Companion;
                    byte[] bArr4 = this.publicSuffixListBytes;
                    if (bArr4 != null) {
                        str3 = companion2.binarySearch(bArr4, bArr3, i11);
                        if (str3 != null) {
                            break;
                        }
                    } else {
                        k.k("publicSuffixListBytes");
                        throw null;
                    }
                }
            }
            str3 = null;
            if (str3 != null) {
                int i12 = size - 1;
                int i13 = 0;
                while (true) {
                    if (i13 >= i12) {
                        break;
                    }
                    Companion companion3 = Companion;
                    byte[] bArr5 = this.publicSuffixExceptionListBytes;
                    if (bArr5 != null) {
                        String binarySearch = companion3.binarySearch(bArr5, bArr, i13);
                        if (binarySearch != null) {
                            str = binarySearch;
                            break;
                        }
                        i13++;
                    } else {
                        k.k("publicSuffixExceptionListBytes");
                        throw null;
                    }
                }
            }
            if (str != null) {
                return m.a0("!".concat(str), new char[]{'.'});
            }
            if (str2 == null && str3 == null) {
                return PREVAILING_RULE;
            }
            List<String> list3 = r.f6846x;
            if (str2 != null) {
                list2 = m.a0(str2, new char[]{'.'});
            } else {
                list2 = list3;
            }
            if (str3 != null) {
                list3 = m.a0(str3, new char[]{'.'});
            }
            if (list2.size() <= list3.size()) {
                return list3;
            }
            return list2;
        }
        throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
    }

    private final void readTheList() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
            if (resourceAsStream != null) {
                f0 d10 = b.d(new u(b.l(resourceAsStream)));
                try {
                    long readInt = d10.readInt();
                    d10.Y(readInt);
                    byte[] b02 = d10.f1708y.b0(readInt);
                    long readInt2 = d10.readInt();
                    d10.Y(readInt2);
                    byte[] b03 = d10.f1708y.b0(readInt2);
                    d10.close();
                    synchronized (this) {
                        this.publicSuffixListBytes = b02;
                        this.publicSuffixExceptionListBytes = b03;
                    }
                } finally {
                }
            }
        } finally {
            this.readCompleteLatch.countDown();
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e10) {
                    Platform.Companion.get().log("Failed to read public suffix list", 5, e10);
                    if (!z10) {
                        return;
                    }
                }
            } finally {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    private final List<String> splitDomain(String str) {
        int i6 = 0;
        List<String> a02 = m.a0(str, new char[]{'.'});
        if (k.a(j.M(a02), HttpUrl.FRAGMENT_ENCODE_SET)) {
            int size = a02.size() - 1;
            if (size >= 0) {
                i6 = size;
            }
            return j.U(i6, a02);
        }
        return a02;
    }

    public final String getEffectiveTldPlusOne(String domain) {
        int size;
        int size2;
        k.e(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        k.d(unicodeDomain, "unicodeDomain");
        List<String> splitDomain = splitDomain(unicodeDomain);
        List<String> findMatchingRule = findMatchingRule(splitDomain);
        if (splitDomain.size() == findMatchingRule.size() && findMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (findMatchingRule.get(0).charAt(0) == '!') {
            size = splitDomain.size();
            size2 = findMatchingRule.size();
        } else {
            size = splitDomain.size();
            size2 = findMatchingRule.size() + 1;
        }
        int i6 = size - size2;
        cf.j C = j.C(splitDomain(domain));
        if (i6 >= 0) {
            if (i6 != 0) {
                if (C instanceof d) {
                    C = ((d) C).b(i6);
                } else {
                    C = new c(C, i6, 0);
                }
            }
            return l.N(C, ".");
        }
        throw new IllegalArgumentException(h8.c.j(i6, "Requested element count ", " is less than zero.").toString());
    }

    public final void setListBytes(byte[] publicSuffixListBytes, byte[] publicSuffixExceptionListBytes) {
        k.e(publicSuffixListBytes, "publicSuffixListBytes");
        k.e(publicSuffixExceptionListBytes, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = publicSuffixListBytes;
        this.publicSuffixExceptionListBytes = publicSuffixExceptionListBytes;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}

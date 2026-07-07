package jd;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class u {
    public static Icon a(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static float b(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float c(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static boolean d(String str) {
        char lowerCase;
        char lowerCase2;
        if (str.length() >= 71) {
            int i6 = 0;
            while (true) {
                if (i6 < str.length()) {
                    if (a.a.n(str.charAt(i6))) {
                        break;
                    }
                    i6++;
                } else {
                    String l02 = df.m.l0(3, str);
                    int i10 = 0;
                    while (true) {
                        if (i10 < l02.length()) {
                            if (!Character.isLetter(l02.charAt(i10))) {
                                break;
                            }
                            i10++;
                        } else {
                            char charAt = str.charAt(3);
                            if (!Character.isDigit(charAt) && ('a' > (lowerCase2 = Character.toLowerCase(charAt)) || lowerCase2 >= 'g')) {
                                return false;
                            }
                            String m02 = df.m.m0(str);
                            int i11 = 0;
                            while (true) {
                                if (i11 < m02.length()) {
                                    if (!Character.isLetter(m02.charAt(i11))) {
                                        break;
                                    }
                                    i11++;
                                } else if (df.m.m0(str).equals(new StringBuilder((CharSequence) df.m.l0(3, str)).reverse().toString())) {
                                    String substring = str.substring(4, str.length() - 3);
                                    kotlin.jvm.internal.k.d(substring, "substring(...)");
                                    if (substring.length() >= 64 && substring.length() % 2 == 0) {
                                        for (int i12 = 0; i12 < substring.length(); i12++) {
                                            char charAt2 = substring.charAt(i12);
                                            if (!Character.isDigit(charAt2) && ('a' > (lowerCase = Character.toLowerCase(charAt2)) || lowerCase >= 'g')) {
                                                return false;
                                            }
                                        }
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static p e(InputStream input) {
        boolean z10;
        Object obj;
        String str;
        Object obj2;
        String str2;
        int i6;
        int i10;
        String str3;
        int i11;
        int read;
        kotlin.jvm.internal.k.e(input, "input");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(input, Http2.INITIAL_MAX_FRAME_SIZE);
        ArrayList arrayList = new ArrayList(32768);
        Character ch = null;
        while (arrayList.size() < 32768 && (read = bufferedInputStream.read()) != -1) {
            arrayList.add(Byte.valueOf((byte) read));
            char c10 = (char) read;
            if (ch == null && !a.a.n(c10)) {
                ch = Character.valueOf(c10);
            }
            if (ch != null && (c10 == '\n' || c10 == '\r')) {
                z10 = true;
                break;
            }
        }
        z10 = false;
        byte[] W = ie.j.W(arrayList);
        df.g gVar = new df.g(new String(W, df.a.f4115a));
        while (true) {
            if (gVar.hasNext()) {
                obj = gVar.next();
                if (!df.m.S((String) obj)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        String str4 = (String) obj;
        if (str4 != null) {
            str = df.m.n0(str4).toString();
        } else {
            str = null;
        }
        String str5 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        q qVar = q.f7399x;
        if (ch != null && ch.charValue() == '[') {
            return new p(qVar, new SequenceInputStream(new ByteArrayInputStream(W), bufferedInputStream), null);
        }
        q qVar2 = q.f7400y;
        if (z10 && !d(str)) {
            return new p(qVar2, new SequenceInputStream(new ByteArrayInputStream(W), bufferedInputStream), null);
        }
        Path createTempFile = Files.createTempFile("playlist_stream_", ".tmp", (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0));
        kotlin.jvm.internal.k.d(createTempFile, "createTempFile(...)");
        File file = createTempFile.toFile();
        kotlin.jvm.internal.k.b(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(W);
            e9.f.b(bufferedInputStream, fileOutputStream, Http2.INITIAL_MAX_FRAME_SIZE);
            fileOutputStream.close();
            bufferedInputStream.close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), df.a.f4115a), 8192);
            try {
                Iterator it = new cf.a(new cf.o(bufferedReader, 3)).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (!df.m.S((String) obj2)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                String str6 = (String) obj2;
                if (str6 != null) {
                    str2 = df.m.n0(str6).toString();
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    str5 = str2;
                }
                bufferedReader.close();
                if (d(str5)) {
                    s sVar = new s(str5);
                    Cipher cipher = Cipher.getInstance(new String("AES/CBC/PKCS5Padding".getBytes(), df.a.f4115a));
                    byte[] bArr = new byte[16];
                    int i12 = 0;
                    while (true) {
                        i6 = sVar.f7405a;
                        i10 = sVar.f7406b;
                        str3 = sVar.f7407c;
                        if (i12 >= 16) {
                            break;
                        }
                        int i13 = i12 * 2;
                        if (i6 == 0) {
                            i11 = i13;
                        } else {
                            i11 = (i13 + i6) % i10;
                        }
                        int h4 = a.a.h(str3.charAt(i11 + 4));
                        int i14 = i13 + 1;
                        if (i6 != 0) {
                            i14 = (i14 + i6) % i10;
                        }
                        bArr[i12] = (byte) ((h4 << 4) | a.a.h(str3.charAt(i14 + 4)));
                        i12++;
                    }
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, new String("AES".getBytes(), df.a.f4115a));
                    byte[] bArr2 = new byte[16];
                    for (int i15 = 0; i15 < 16; i15++) {
                        int i16 = i15 * 2;
                        int i17 = i16 + 32;
                        if (i6 != 0) {
                            i17 = (i17 + i6) % i10;
                        }
                        int h10 = a.a.h(str3.charAt(i17 + 4));
                        int i18 = i16 + 33;
                        if (i6 != 0) {
                            i18 = (i18 + i6) % i10;
                        }
                        bArr2[i15] = (byte) (a.a.h(str3.charAt(i18 + 4)) | (h10 << 4));
                    }
                    cipher.init(2, secretKeySpec, new IvParameterSpec(bArr2));
                    return new p(qVar2, new t(sVar, cipher, file), null);
                }
                if (ch == null || ch.charValue() != '[') {
                    qVar = qVar2;
                }
                return new p(qVar, new BufferedInputStream(new FileInputStream(file), Http2.INITIAL_MAX_FRAME_SIZE), new androidx.lifecycle.i(file, 8));
            } finally {
            }
        } finally {
        }
    }

    public static void f(MenuItem menuItem, char c10, int i6) {
        menuItem.setAlphabeticShortcut(c10, i6);
    }

    public static void g(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void h(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void i(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void j(MenuItem menuItem, char c10, int i6) {
        menuItem.setNumericShortcut(c10, i6);
    }

    public static void k(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }
}
